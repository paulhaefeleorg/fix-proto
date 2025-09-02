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

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

import static java.util.Collections.singletonList;

public final class BenchmarkMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Benchmark FIX Initiator starting...");

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

        EngineConfiguration engineConfig = new EngineConfiguration()
            .libraryAeronChannel(aeronChannel)
            .monitoringFile(engineDir + "/monitoring")
            .logFileDir(engineDir)
            .bindAtStartup(false);

        FixEngine engine = FixEngine.launch(engineConfig);

        InitiatorHandler handler = new InitiatorHandler();

        LibraryConfiguration libraryConfig = new LibraryConfiguration()
            .libraryAeronChannels(singletonList(aeronChannel))
            .sessionAcquireHandler(handler);

        try (FixLibrary library = FixLibrary.connect(libraryConfig)) {
            SessionConfiguration sessionConfiguration = SessionConfiguration.builder()
                .address(host, port)
                .senderCompId(senderCompId)
                .targetCompId(targetCompId)
                .build();

            library.initiate(sessionConfiguration);
            System.out.println("Initiating connection to " + host + ":" + port);

            while (!handler.ready) {
                library.poll(10);
            }
            System.out.println("Initiator completed. Exiting.");
        } finally {
            engine.close();
        }
    }

    private static final class InitiatorHandler implements SessionAcquireHandler, SessionHandler {
        volatile boolean ready = true; // ready immediately until codecs wired

        @Override
        public SessionHandler onSessionAcquired(Session session, SessionAcquiredInfo info) {
            System.out.println("Session acquired (initiator): " + session);
            return this;
        }

        @Override
        public void onSessionStart(Session session) {
            System.out.println("Session started (initiator): " + session);
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
            final OnMessageInfo messageInfo) { return Action.CONTINUE; }

        @Override
        public Action onDisconnect(final int libraryId, final Session session, final DisconnectReason reason) {
            System.out.println("Session disconnected: " + reason);
            return Action.CONTINUE;
        }

        @Override
        public void onSlowStatus(final int libraryId, final Session session, final boolean hasBecomeSlow) { }

        @Override
        public void onTimeout(final int libraryId, final Session session) { }
    }
}


