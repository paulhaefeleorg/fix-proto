package com.fixperformance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import com.fixperformance.offheap.OffHeapMain;
import com.fixperformance.threadpool.ThreadPoolMain;

public class ProcessingMainTest {
    @Test
    void selectedModeMainRunsWithoutException() {
        String mode = System.getProperty("fix.mode", "both");
        switch (mode) {
            case "offheap":
                assertDoesNotThrow(() -> OffHeapMain.main(new String[0]));
                break;
            case "threadpool":
                assertDoesNotThrow(() -> ThreadPoolMain.main(new String[0]));
                break;
            case "both":
            default:
                assertDoesNotThrow(() -> OffHeapMain.main(new String[0]));
                assertDoesNotThrow(() -> ThreadPoolMain.main(new String[0]));
                break;
        }
    }
}


