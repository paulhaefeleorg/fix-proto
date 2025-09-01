package com.fixperformance.benchmark;

import java.util.Locale;
import com.fixperformance.offheap.OffHeapMain;
import com.fixperformance.threadpool.ThreadPoolMain;

public final class BenchmarkMain {
    public static void main(String[] args) {
        String mode = parseMode(args);
        switch (mode) {
            case "offheap":
                benchmarkOffHeap();
                break;
            case "threadpool":
                benchmarkThreadPool();
                break;
            case "both":
                benchmarkOffHeap();
                benchmarkThreadPool();
                break;
            default:
                printUsage();
        }
    }

    private static String parseMode(String[] args) {
        if (args == null || args.length == 0) {
            return "both";
        }
        for (String arg : args) {
            if (arg == null) continue;
            String normalized = arg.toLowerCase(Locale.ROOT).trim();
            if (normalized.startsWith("--mode=")) {
                String value = normalized.substring("--mode=".length());
                if (value.equals("offheap") || value.equals("threadpool") || value.equals("both")) {
                    return value;
                }
            }
        }
        return "both";
    }

    private static void benchmarkOffHeap() {
        System.out.println("Benchmark: OffHeap path");
        OffHeapMain.main(new String[0]);
    }

    private static void benchmarkThreadPool() {
        System.out.println("Benchmark: ThreadPool path");
        ThreadPoolMain.main(new String[0]);
    }

    private static void printUsage() {
        System.out.println("Usage: java com.fixperformance.benchmark.BenchmarkMain --mode=<offheap|threadpool|both>");
    }
}


