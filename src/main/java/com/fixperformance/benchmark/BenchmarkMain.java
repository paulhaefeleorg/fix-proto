package com.fixperformance.benchmark;

import org.agrona.DirectBuffer;
import uk.co.real_logic.artio.engine.EngineConfiguration;
import uk.co.real_logic.artio.engine.FixEngine;
import uk.co.real_logic.artio.library.FixLibrary;
import uk.co.real_logic.artio.library.LibraryConfiguration;
import uk.co.real_logic.artio.session.Session;
import uk.co.real_logic.artio.library.SessionAcquireHandler;
import uk.co.real_logic.artio.library.SessionAcquiredInfo;
import uk.co.real_logic.artio.library.SessionConfiguration;
import uk.co.real_logic.artio.library.SessionHandler;
import uk.co.real_logic.artio.library.OnMessageInfo;
import uk.co.real_logic.artio.messages.DisconnectReason;
import io.aeron.logbuffer.ControlledFragmentHandler.Action;

import uk.co.real_logic.artio.builder.NewOrderSingleEncoder;
import uk.co.real_logic.artio.Side;
import uk.co.real_logic.artio.OrdType;
import uk.co.real_logic.artio.Reply;
import uk.co.real_logic.artio.fields.UtcTimestampEncoder;

import io.aeron.driver.MediaDriver;
import io.aeron.archive.client.AeronArchive;
import io.aeron.archive.Archive;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.util.Collections.singletonList;

public final class BenchmarkMain {
    static {
        System.setProperty("app.name", "initiator");
        System.setProperty("log.dir", System.getProperty("log.dir", "logs"));
    }

    private static final Logger LOGGER = LogManager.getLogger(BenchmarkMain.class);
    public static void main(String[] args) throws Exception {
        LOGGER.info("{\"event\":\"startup\",\"service\":\"initiator\"}");

        Properties props = new Properties();
        Path configPath = Path.of(System.getProperty("benchmark.config", "config/benchmark-initiator.properties"));
        if (Files.exists(configPath)) {
            try (FileInputStream fis = new FileInputStream(configPath.toFile())) {
                props.load(fis);
            }
        }

        String engineDir = props.getProperty("engine.log.dir", "artio-logs/benchmark");
        String aeronChannel = props.getProperty("engine.aeron.channel", "aeron:ipc");

        String host = props.getProperty("initiator.connect.host", "127.0.0.1");
        int port = Integer.parseInt(props.getProperty("initiator.connect.port", "9898"));
        String senderCompId = props.getProperty("initiator.senderCompID", "BENCH");
        String targetCompId = props.getProperty("initiator.targetCompID", "OFFHEAP");

        // Aeron filesystem directory (avoid /dev/shm issues)
        final String aeronDir = props.getProperty("aeron.dir", "build/aeron-benchmark");
        Files.createDirectories(Path.of(aeronDir));

        final MediaDriver driver = MediaDriver.launchEmbedded(new MediaDriver.Context()
            .aeronDirectoryName(aeronDir)
            .dirDeleteOnStart(true)
            .warnIfDirectoryExists(false)
            .termBufferSparseFile(true));
        System.setProperty("aeron.dir", aeronDir);

        // Ensure engine dir exists and configure monitoring to /tmp
        Files.createDirectories(Path.of(engineDir));
        final String engineMonitoring = "/tmp/artio-monitoring-initiator-engine.dat";
        final String libraryMonitoring = "/tmp/artio-monitoring-initiator-lib.dat";
        final int monitoringSize = 1_048_576; // 1 MiB

        // Start embedded Aeron Archive (use different ports from acceptor to avoid conflicts)
        final String archiveControl = props.getProperty("archive.control", "aeron:udp?endpoint=127.0.0.1:8110");
        final String archiveLocalControl = props.getProperty("archive.localControl", "aeron:ipc");
        final String archiveEvents = props.getProperty("archive.events", "aeron:udp?endpoint=127.0.0.1:8111");
        final String archiveReplication = props.getProperty("archive.replication", "aeron:udp?endpoint=127.0.0.1:8112");
        final Archive archive = Archive.launch(new Archive.Context()
            .aeronDirectoryName(aeronDir)
            .deleteArchiveOnStart(true)
            .controlChannel(archiveControl)
            .localControlChannel(archiveLocalControl)
            .recordingEventsChannel(archiveEvents)
            .replicationChannel(archiveReplication));

        EngineConfiguration engineConfig = new EngineConfiguration()
            .libraryAeronChannel(aeronChannel)
            .monitoringFile(engineMonitoring)
            .monitoringBuffersLength(monitoringSize)
            .logFileDir(engineDir)
            .bindAtStartup(false);

        // Configure AeronArchive client for engine
        AeronArchive.Context archiveCtx = engineConfig.aeronArchiveContext();
        archiveCtx
            .aeronDirectoryName(aeronDir)
            .controlRequestChannel(archiveControl)
            .controlResponseChannel("aeron:udp?endpoint=127.0.0.1:0")
            .recordingEventsChannel(archiveEvents);

        FixEngine engine = FixEngine.launch(engineConfig);

        InitiatorHandler handler = new InitiatorHandler();

        LibraryConfiguration libraryConfig = new LibraryConfiguration()
            .libraryAeronChannels(singletonList(aeronChannel))
            .monitoringFile(libraryMonitoring)
            .monitoringBuffersLength(monitoringSize)
            .sessionAcquireHandler(handler);

        LOGGER.info("{\"event\":\"config\",\"service\":\"initiator\",\"connect\":\"" + host + ":" + port + "\",\"aeronChannel\":\"" + aeronChannel + "\",\"aeronDir\":\"" + aeronDir + "\",\"engineMonitoring\":\"" + engineMonitoring + "\",\"libraryMonitoring\":\"" + libraryMonitoring + "\",\"archiveControl\":\"" + archiveControl + "\"}");

        try (FixLibrary library = FixLibrary.connect(libraryConfig)) {
            // Ensure the library is connected to the embedded engine before initiating
            long connectWaitStart = System.currentTimeMillis();
            while (!library.isConnected() && System.currentTimeMillis() - connectWaitStart < 5000) {
                library.poll(10);
            }
            if (!library.isConnected()) {
                LOGGER.warn("{\"event\":\"library_connect_timeout\",\"service\":\"initiator\"}");
            } else {
                LOGGER.info("{\"event\":\"library_connected\",\"service\":\"initiator\"}");
            }
            SessionConfiguration sessionConfiguration = SessionConfiguration.builder()
                .address(host, port)
                .senderCompId(senderCompId)
                .targetCompId(targetCompId)
                .resetSeqNum(true)
                .build();

            final Reply<Session> initiateReply = library.initiate(sessionConfiguration);
            LOGGER.info("{\"event\":\"initiate\",\"service\":\"initiator\",\"host\":\"" + host + "\",\"port\":" + port + ",\"senderCompID\":\"" + senderCompId + "\",\"targetCompID\":\"" + targetCompId + "\"}");

            // Wait briefly for initiation to complete and log outcome
            long initWaitStart = System.currentTimeMillis();
            while (!initiateReply.hasCompleted() && !initiateReply.hasErrored() && System.currentTimeMillis() - initWaitStart < 5000) {
                library.poll(10);
            }
            if (initiateReply.hasErrored()) {
                LOGGER.warn("{\"event\":\"initiate_error\",\"service\":\"initiator\",\"error\":\"" + String.valueOf(initiateReply.error()) + "\"}");
            } else if (initiateReply.hasCompleted()) {
                Session initiatedSession = null;
                try { initiatedSession = initiateReply.resultIfPresent(); } catch (Throwable t) {
                    LOGGER.warn("{\"event\":\"initiate_result_access_error\",\"error\":\"" + t + "\"}");
                }
                final long initiatedId = initiatedSession != null ? initiatedSession.id() : -1L;
                LOGGER.info("{\"event\":\"initiated\",\"service\":\"initiator\",\"sessionId\":" + initiatedId + "}");
            }

            final long heartbeatIntervalMs = 30_000L;
            long lastPollAt = 0L;
            for (;;) {
                library.poll(10);
                long now = System.currentTimeMillis();
                if (now - lastPollAt >= heartbeatIntervalMs) {
                    LOGGER.info("{\"event\":\"poll\",\"service\":\"initiator\",\"ts\":\"" + Instant.now() + "\"}");
                    lastPollAt = now;
                }
            }
        } finally {
            engine.close();
            archive.close();
            driver.close();
        }
    }

    private static final class InitiatorHandler implements SessionAcquireHandler, SessionHandler {
        volatile boolean sent = false;

        @Override
        public SessionHandler onSessionAcquired(Session session, SessionAcquiredInfo info) {
            LOGGER.info("{\"event\":\"session_acquired\",\"service\":\"initiator\",\"sessionId\":" + session.id() + "}");
            return this;
        }

        @Override
        public void onSessionStart(Session session) {
            LOGGER.info("{\"event\":\"session_start\",\"service\":\"initiator\",\"sessionId\":" + session.id() + "}");

            NewOrderSingleEncoder nos = new NewOrderSingleEncoder();
            nos.clOrdID("BENCH-1");
            nos.side(Side.BUY);
            nos.ordType(OrdType.MARKET);
            final UtcTimestampEncoder tsEncoder = new UtcTimestampEncoder();
            final int tsLength = tsEncoder.encode(System.currentTimeMillis());
            nos.transactTime(tsEncoder.buffer(), 0, tsLength);
            nos.instrument().symbol("TEST");
            nos.orderQtyData().orderQty(1, 0);

            long position = session.trySend(nos);
            LOGGER.info("{\"event\":\"sendNewOrderSingle\",\"service\":\"initiator\",\"position\":" + position + "}");
            sent = position >= 0;
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
            final String msgTypeStr = com.fixperformance.fix.ArtioFixUtils.extractMsgType(buffer, offset, length);
            final String pretty = com.fixperformance.fix.ArtioFixUtils.prettyPrintFix(buffer, offset, length, 1024);
            LOGGER.info("{\"event\":\"message\",\"service\":\"initiator\",\"msgType\":\"" + msgTypeStr + "\",\"len\":" + length + ",\"fix\":\"" + pretty + "\"}");
            return Action.CONTINUE;
        }

        @Override
        public Action onDisconnect(final int libraryId, final Session session, final DisconnectReason reason) {
            LOGGER.warn("{\"event\":\"disconnect\",\"service\":\"initiator\",\"sessionId\":" + session.id() + ",\"reason\":\"" + reason + "\"}");
            return Action.CONTINUE;
        }

        @Override
        public void onSlowStatus(final int libraryId, final Session session, final boolean hasBecomeSlow) {
            LOGGER.warn("{\"event\":\"slow\",\"service\":\"initiator\",\"sessionId\":" + session.id() + ",\"slow\":" + hasBecomeSlow + "}");
        }

        @Override
        public void onTimeout(final int libraryId, final Session session) {
            LOGGER.warn("{\"event\":\"timeout\",\"service\":\"initiator\",\"sessionId\":" + session.id() + "}");
        }

        // moved to ArtioFixUtils
    }
}


