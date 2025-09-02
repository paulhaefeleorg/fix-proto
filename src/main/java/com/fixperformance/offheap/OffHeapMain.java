package com.fixperformance.offheap;

import uk.co.real_logic.artio.engine.EngineConfiguration;
import uk.co.real_logic.artio.engine.FixEngine;
import uk.co.real_logic.artio.library.FixLibrary;
import uk.co.real_logic.artio.library.LibraryConfiguration;
import uk.co.real_logic.artio.library.SessionAcquireHandler;
import uk.co.real_logic.artio.library.SessionAcquiredInfo;
import uk.co.real_logic.artio.library.SessionHandler;
import uk.co.real_logic.artio.library.OnMessageInfo;
import uk.co.real_logic.artio.library.AcquiringSessionExistsHandler;
import com.fixperformance.fix.ArtioFixUtils;
import uk.co.real_logic.artio.messages.DisconnectReason;
import uk.co.real_logic.artio.session.Session;
import io.aeron.logbuffer.ControlledFragmentHandler.Action;
import org.agrona.DirectBuffer;
import io.aeron.driver.MediaDriver;
import io.aeron.archive.client.AeronArchive;
import io.aeron.archive.Archive;
import uk.co.real_logic.artio.FixDictionaryImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Properties;

import static java.util.Collections.singletonList;

public final class OffHeapMain {
    static {
        System.setProperty("app.name", "acceptor");
        System.setProperty("log.dir", System.getProperty("log.dir", "logs"));
    }

    private static final Logger LOGGER = LogManager.getLogger(OffHeapMain.class);
    public static void main(String[] args) throws Exception {
        LOGGER.info("{\"event\":\"startup\",\"service\":\"acceptor\"}");

        Properties props = new Properties();
        Path configPath = Path.of(System.getProperty("offheap.config", "config/offheap-acceptor.properties"));
        if (Files.exists(configPath)) {
            try (FileInputStream fis = new FileInputStream(configPath.toFile())) {
                props.load(fis);
            }
        }

        String engineDir = props.getProperty("engine.log.dir", "artio-logs/offheap");
        String aeronChannel = props.getProperty("engine.aeron.channel", "aeron:ipc");
        String bindHost = props.getProperty("acceptor.host", "0.0.0.0");
        int bindPort = Integer.parseInt(props.getProperty("acceptor.port", "9898"));
        // Optional expected COMPIDs for visibility/validation-only logging
        String expectedSenderCompId = props.getProperty("acceptor.expected.senderCompID");
        String expectedTargetCompId = props.getProperty("acceptor.expected.targetCompID");

        // Ensure engine dir exists
        Files.createDirectories(Path.of(engineDir));

        // Use workspace-local Aeron directory to avoid /dev/shm issues in containers
        final String aeronDir = props.getProperty("aeron.dir", "build/aeron-offheap");
        Files.createDirectories(Path.of(aeronDir));

        final MediaDriver driver = MediaDriver.launchEmbedded(new MediaDriver.Context()
            .aeronDirectoryName(aeronDir)
            .dirDeleteOnStart(true)
            .warnIfDirectoryExists(false)
            .termBufferSparseFile(true));
        System.setProperty("aeron.dir", aeronDir);

        // Explicit UDP ports for Archive channels
        final String archiveControl = props.getProperty("archive.control", "aeron:udp?endpoint=127.0.0.1:8010");
        final String archiveLocalControl = props.getProperty("archive.localControl", "aeron:ipc");
        final String archiveEvents = props.getProperty("archive.events", "aeron:udp?endpoint=127.0.0.1:8011");
        final String archiveReplication = props.getProperty("archive.replication", "aeron:udp?endpoint=127.0.0.1:8012");
        final Archive archive = Archive.launch(new Archive.Context()
            .aeronDirectoryName(aeronDir)
            .deleteArchiveOnStart(true)
            .controlChannel(archiveControl)
            .localControlChannel(archiveLocalControl)
            .recordingEventsChannel(archiveEvents)
            .replicationChannel(archiveReplication));

        EngineConfiguration engineConfig = new EngineConfiguration()
            .libraryAeronChannel(aeronChannel)
            .deleteLogFileDirOnStart(true)
            .logFileDir(engineDir)
            .bindAtStartup(true)
            .bindTo(bindHost, bindPort)
            .overrideAcceptorFixDictionary(FixDictionaryImpl.class);

        // Point engine's AeronArchive client to the embedded archive
        AeronArchive.Context archiveCtx = engineConfig.aeronArchiveContext();
        archiveCtx
            .aeronDirectoryName(aeronDir)
            .controlRequestChannel(archiveControl)
            .controlResponseChannel("aeron:udp?endpoint=127.0.0.1:0")
            .recordingEventsChannel(archiveEvents);

        LOGGER.info("{\"event\":\"config\",\"service\":\"acceptor\",\"bind\":\"" + bindHost + ":" + bindPort + "\",\"aeronChannel\":\"" + aeronChannel + "\",\"aeronDir\":\"" + aeronDir + "\",\"archiveControl\":\"" + archiveControl + "\",\"expectedSenderCompID\":\"" + (expectedSenderCompId == null ? "*" : expectedSenderCompId) + "\",\"expectedTargetCompID\":\"" + (expectedTargetCompId == null ? "*" : expectedTargetCompId) + "\"}");

        FixEngine engine = FixEngine.launch(engineConfig);

        LibraryConfiguration libraryConfig = new LibraryConfiguration()
            .libraryAeronChannels(singletonList(aeronChannel))
            .sessionExistsHandler(new AcquiringSessionExistsHandler())
            .sessionAcquireHandler(new AcceptorSessionAcquireHandler(expectedSenderCompId, expectedTargetCompId));

        try (FixLibrary library = FixLibrary.connect(libraryConfig)) {
            LOGGER.info("{\"event\":\"ready\",\"service\":\"acceptor\",\"bind\":\"" + bindHost + ":" + bindPort + "\"}");
            long last = System.currentTimeMillis();
            while (true) {
                library.poll(10);
                long now = System.currentTimeMillis();
                if (now - last >= 30000) {
                    // Build a JSON array of current sessions' COMPIDs
                    StringBuilder comps = new StringBuilder("[");
                    for (int i = 0; i < library.sessions().size(); i++) {
                        Session s = library.sessions().get(i);
                        comps.append('\"').append(String.valueOf(s.compositeKey())).append('\"');
                        if (i < library.sessions().size() - 1) comps.append(',');
                    }
                    comps.append(']');
                    LOGGER.info("{\"event\":\"poll\",\"service\":\"acceptor\",\"ts\":\"" + Instant.now() + "\",\"sessions\":" + library.sessions().size() + ",\"compIds\":" + comps + "}");
                    last = now;
                }
            }
        } finally {
            engine.close();
            archive.close();
            driver.close();
        }
    }

    private static final class AcceptorSessionAcquireHandler implements SessionAcquireHandler {
        private final String expectedSender;
        private final String expectedTarget;

        AcceptorSessionAcquireHandler(final String expectedSender, final String expectedTarget) {
            this.expectedSender = expectedSender;
            this.expectedTarget = expectedTarget;
        }

        @Override
        public SessionHandler onSessionAcquired(Session session, SessionAcquiredInfo info) {
            final String comp = String.valueOf(session.compositeKey());
            LOGGER.info("{\"event\":\"session_acquired\",\"service\":\"acceptor\",\"sessionId\":" + session.id() + ",\"compIds\":\"" + comp + "\"}");
            // Log a warning if expected COMPIDs are set and appear mismatched (string containment heuristic)
            if (expectedSender != null && !comp.contains(expectedSender)) {
                LOGGER.warn("{\"event\":\"compId_mismatch\",\"side\":\"sender\",\"expected\":\"" + expectedSender + "\",\"actual\":\"" + comp + "\"}");
            }
            if (expectedTarget != null && !comp.contains(expectedTarget)) {
                LOGGER.warn("{\"event\":\"compId_mismatch\",\"side\":\"target\",\"expected\":\"" + expectedTarget + "\",\"actual\":\"" + comp + "\"}");
            }
            return new LoggingSessionHandler();
        }
    }

    private static final class LoggingSessionHandler implements SessionHandler {
        @Override
        public void onSessionStart(Session session) {
            LOGGER.info("{\"event\":\"session_start\",\"service\":\"acceptor\",\"sessionId\":" + session.id() + ",\"compIds\":\"" + session.compositeKey() + "\"}");
        }

        @Override
        public Action onMessage(
            final DirectBuffer buffer,
            final int offset,
            final int length,
            final int messageType,
            final Session session,
            final int sequenceIndex,
            final long timestampInNs,
            final long position,
            final long sessionId,
            final OnMessageInfo messageInfo) {
            final String msgTypeStr = ArtioFixUtils.extractMsgType(buffer, offset, length);
            final String pretty = ArtioFixUtils.prettyPrintFix(buffer, offset, length, 1024);
            LOGGER.info("{\"event\":\"message\",\"service\":\"acceptor\",\"msgType\":\"" + msgTypeStr + "\",\"len\":" + length + ",\"sessionId\":" + session.id() + ",\"fix\":\"" + pretty + "\"}");
            return Action.CONTINUE;
        }

        @Override
        public Action onDisconnect(final int libraryId, final Session session, final DisconnectReason reason) {
            LOGGER.warn("{\"event\":\"disconnect\",\"service\":\"acceptor\",\"sessionId\":" + session.id() + ",\"reason\":\"" + reason + "\"}");
            return Action.CONTINUE;
        }

        @Override
        public void onSlowStatus(final int libraryId, final Session session, final boolean hasBecomeSlow) {
            LOGGER.warn("{\"event\":\"slow\",\"service\":\"acceptor\",\"sessionId\":" + session.id() + ",\"slow\":" + hasBecomeSlow + "}");
        }

        @Override
        public void onTimeout(final int libraryId, final Session session) {
            LOGGER.warn("{\"event\":\"timeout\",\"service\":\"acceptor\",\"sessionId\":" + session.id() + "}");
        }

        // moved to ArtioFixUtils
    }
}


