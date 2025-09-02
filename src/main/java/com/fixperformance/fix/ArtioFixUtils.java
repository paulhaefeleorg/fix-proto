package com.fixperformance.fix;

import org.agrona.DirectBuffer;

public final class ArtioFixUtils {
    private ArtioFixUtils() {}

    public static String extractMsgType(final DirectBuffer buffer, final int offset, final int length) {
        final int end = offset + length;
        int i = offset;
        while (i < end) {
            if (i + 2 < end && buffer.getByte(i) == '3' && buffer.getByte(i + 1) == '5' && buffer.getByte(i + 2) == '=') {
                int j = i + 3;
                final StringBuilder sb = new StringBuilder(4);
                while (j < end) {
                    final byte b = buffer.getByte(j);
                    if (b == 1) break; // SOH
                    sb.append((char) b);
                    j++;
                }
                return sb.toString();
            }
            while (i < end && buffer.getByte(i) != 1) i++;
            i++;
        }
        return "?";
    }

    public static String prettyPrintFix(final DirectBuffer buffer, final int offset, final int length, final int maxChars) {
        final int end = offset + length;
        final StringBuilder sb = new StringBuilder(Math.min(length, maxChars));
        int i = offset;
        while (i < end && sb.length() < maxChars) {
            final byte b = buffer.getByte(i++);
            if (b == 1) {
                sb.append('|');
            } else if (b == '"') {
                sb.append('\\').append('"');
            } else if (b == '\\') {
                sb.append('\\').append('\\');
            } else if (b >= 32 && b < 127) {
                sb.append((char)b);
            } else {
                final String hex = Integer.toHexString(b & 0xFF);
                sb.append("\\x").append(hex.length() == 1 ? "0" : "").append(hex);
            }
        }
        return sb.toString();
    }
}


