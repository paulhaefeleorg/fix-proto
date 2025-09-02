package com.fixperformance.offheap;

import uk.co.real_logic.artio.engine.EngineConfiguration;
import uk.co.real_logic.artio.engine.FixEngine;
import uk.co.real_logic.artio.library.FixLibrary;
import uk.co.real_logic.artio.library.LibraryConfiguration;
import uk.co.real_logic.artio.library.SessionAcquireHandler;
import uk.co.real_logic.artio.library.SessionAcquiredInfo;
import uk.co.real_logic.artio.library.SessionHandler;
import uk.co.real_logic.artio.library.OnMessageInfo;
import uk.co.real_logic.artio.messages.DisconnectReason;
import uk.co.real_logic.artio.session.Session;
import io.aeron.logbuffer.ControlledFragmentHandler.Action;
import org.agrona.DirectBuffer;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

import static java.util.Collections.singletonList;

public final class OffHeapMain {
    public static void main(String[] args) throws Exception {
        System.out.println("OffHeap FIX Acceptor starting...");

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

        EngineConfiguration engineConfig = new EngineConfiguration()
            .libraryAeronChannel(aeronChannel)
            .monitoringFile(engineDir + "/monitoring")
            .logFileDir(engineDir)
            .bindAtStartup(true)
            .bindTo(bindHost, bindPort);

        FixEngine engine = FixEngine.launch(engineConfig);

        LibraryConfiguration libraryConfig = new LibraryConfiguration()
            .libraryAeronChannels(singletonList(aeronChannel))
            .sessionAcquireHandler(new AcceptorSessionAcquireHandler());

        try (FixLibrary library = FixLibrary.connect(libraryConfig)) {
            System.out.println("OffHeap FIX Acceptor ready on " + bindHost + ":" + bindPort);
            while (true) {
                library.poll(10);
            }
        } finally {
            engine.close();
        }
    }

    private static final class AcceptorSessionAcquireHandler implements SessionAcquireHandler {
        @Override
        public SessionHandler onSessionAcquired(Session session, SessionAcquiredInfo info) {
            System.out.println("Session acquired (acceptor): " + session);
            return new LoggingSessionHandler();
        }
    }

    private static final class LoggingSessionHandler implements SessionHandler {
        @Override
        public void onSessionStart(Session session) {
            System.out.println("Session started: " + session);
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
            System.out.println("Received message type=" + messageType + ", length=" + length);
            return Action.CONTINUE;
        }

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


