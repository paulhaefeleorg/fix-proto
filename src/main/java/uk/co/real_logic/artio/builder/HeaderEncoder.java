/* Generated Fix Gateway message codec */
package uk.co.real_logic.artio.builder;

import uk.co.real_logic.artio.dictionary.Generated;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.fields.ReadOnlyDecimalFloat;
import uk.co.real_logic.artio.fields.DecimalFloat;
import uk.co.real_logic.artio.util.MutableAsciiBuffer;
import uk.co.real_logic.artio.util.AsciiBuffer;
import uk.co.real_logic.artio.fields.LocalMktDateEncoder;
import uk.co.real_logic.artio.fields.UtcTimestampEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import uk.co.real_logic.artio.dictionary.CharArraySet;
import org.agrona.collections.IntHashSet;
import org.agrona.collections.IntHashSet.IntIterator;
import uk.co.real_logic.artio.EncodingException;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.agrona.AsciiSequenceView;
import uk.co.real_logic.artio.builder.FieldBagEncoder;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import uk.co.real_logic.artio.*;

@Generated("uk.co.real_logic.artio")
public class HeaderEncoder implements uk.co.real_logic.artio.builder.SessionHeaderEncoder
{
    public HeaderEncoder()
    {
        beginStringAsCopy(DEFAULT_BEGIN_STRING, 0, DEFAULT_BEGIN_STRING.length);
    }


    private static final byte[] DEFAULT_BEGIN_STRING="FIX.4.4".getBytes(StandardCharsets.US_ASCII);

    private static final int beginStringHeaderLength = 2;
    private static final byte[] beginStringHeader = new byte[] {56, (byte) '='};

    private static final int bodyLengthHeaderLength = 2;
    private static final byte[] bodyLengthHeader = new byte[] {57, (byte) '='};

    private static final int msgTypeHeaderLength = 3;
    private static final byte[] msgTypeHeader = new byte[] {51, 53, (byte) '='};

    private static final int senderCompIDHeaderLength = 3;
    private static final byte[] senderCompIDHeader = new byte[] {52, 57, (byte) '='};

    private static final int targetCompIDHeaderLength = 3;
    private static final byte[] targetCompIDHeader = new byte[] {53, 54, (byte) '='};

    private static final int onBehalfOfCompIDHeaderLength = 4;
    private static final byte[] onBehalfOfCompIDHeader = new byte[] {49, 49, 53, (byte) '='};

    private static final int deliverToCompIDHeaderLength = 4;
    private static final byte[] deliverToCompIDHeader = new byte[] {49, 50, 56, (byte) '='};

    private static final int secureDataLenHeaderLength = 3;
    private static final byte[] secureDataLenHeader = new byte[] {57, 48, (byte) '='};

    private static final int secureDataHeaderLength = 3;
    private static final byte[] secureDataHeader = new byte[] {57, 49, (byte) '='};

    private static final int msgSeqNumHeaderLength = 3;
    private static final byte[] msgSeqNumHeader = new byte[] {51, 52, (byte) '='};

    private static final int senderSubIDHeaderLength = 3;
    private static final byte[] senderSubIDHeader = new byte[] {53, 48, (byte) '='};

    private static final int senderLocationIDHeaderLength = 4;
    private static final byte[] senderLocationIDHeader = new byte[] {49, 52, 50, (byte) '='};

    private static final int targetSubIDHeaderLength = 3;
    private static final byte[] targetSubIDHeader = new byte[] {53, 55, (byte) '='};

    private static final int targetLocationIDHeaderLength = 4;
    private static final byte[] targetLocationIDHeader = new byte[] {49, 52, 51, (byte) '='};

    private static final int onBehalfOfSubIDHeaderLength = 4;
    private static final byte[] onBehalfOfSubIDHeader = new byte[] {49, 49, 54, (byte) '='};

    private static final int onBehalfOfLocationIDHeaderLength = 4;
    private static final byte[] onBehalfOfLocationIDHeader = new byte[] {49, 52, 52, (byte) '='};

    private static final int deliverToSubIDHeaderLength = 4;
    private static final byte[] deliverToSubIDHeader = new byte[] {49, 50, 57, (byte) '='};

    private static final int deliverToLocationIDHeaderLength = 4;
    private static final byte[] deliverToLocationIDHeader = new byte[] {49, 52, 53, (byte) '='};

    private static final int possDupFlagHeaderLength = 3;
    private static final byte[] possDupFlagHeader = new byte[] {52, 51, (byte) '='};

    private static final int possResendHeaderLength = 3;
    private static final byte[] possResendHeader = new byte[] {57, 55, (byte) '='};

    private static final int sendingTimeHeaderLength = 3;
    private static final byte[] sendingTimeHeader = new byte[] {53, 50, (byte) '='};

    private static final int origSendingTimeHeaderLength = 4;
    private static final byte[] origSendingTimeHeader = new byte[] {49, 50, 50, (byte) '='};

    private static final int xmlDataLenHeaderLength = 4;
    private static final byte[] xmlDataLenHeader = new byte[] {50, 49, 50, (byte) '='};

    private static final int xmlDataHeaderLength = 4;
    private static final byte[] xmlDataHeader = new byte[] {50, 49, 51, (byte) '='};

    private static final int messageEncodingHeaderLength = 4;
    private static final byte[] messageEncodingHeader = new byte[] {51, 52, 55, (byte) '='};

    private static final int lastMsgSeqNumProcessedHeaderLength = 4;
    private static final byte[] lastMsgSeqNumProcessedHeader = new byte[] {51, 54, 57, (byte) '='};

    private final MutableDirectBuffer beginString = new UnsafeBuffer();
    private byte[] beginStringInternalBuffer = beginString.byteArray();
    private int beginStringOffset = 0;
    private int beginStringLength = 0;

    /* BeginString = 8 */
    public HeaderEncoder beginString(final DirectBuffer value, final int offset, final int length)
    {
        beginString.wrap(value);
        beginStringOffset = offset;
        beginStringLength = length;
        return this;
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final DirectBuffer value, final int length)
    {
        return beginString(value, 0, length);
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final DirectBuffer value)
    {
        return beginString(value, 0, value.capacity());
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final byte[] value, final int offset, final int length)
    {
        beginString.wrap(value);
        beginStringOffset = offset;
        beginStringLength = length;
        return this;
    }

    /* BeginString = 8 */
    public HeaderEncoder beginStringAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(beginString, value, offset, length))
        {
            beginStringInternalBuffer = beginString.byteArray();
        }
        beginStringOffset = 0;
        beginStringLength = length;
        return this;
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final byte[] value, final int length)
    {
        return beginString(value, 0, length);
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final byte[] value)
    {
        return beginString(value, 0, value.length);
    }

    /* BeginString = 8 */
    public boolean hasBeginString()
    {
        return beginStringLength > 0;
    }

    /* BeginString = 8 */
    public MutableDirectBuffer beginString()
    {
        return beginString;
    }

    /* BeginString = 8 */
    public String beginStringAsString()
    {
        return beginString.getStringWithoutLengthAscii(beginStringOffset, beginStringLength);
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final CharSequence value)
    {
        if (toBytes(value, beginString))
        {
            beginStringInternalBuffer = beginString.byteArray();
        }
        beginStringOffset = 0;
        beginStringLength = value.length();
        return this;
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            beginString.wrap(buffer);
            beginStringOffset = value.offset();
            beginStringLength = value.length();
        }
        return this;
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final char[] value)
    {
        return beginString(value, 0, value.length);
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final char[] value, final int length)
    {
        return beginString(value, 0, length);
    }

    /* BeginString = 8 */
    public HeaderEncoder beginString(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, beginString, offset, length))
        {
            beginStringInternalBuffer = beginString.byteArray();
        }
        beginStringOffset = 0;
        beginStringLength = length;
        return this;
    }

    private final MutableDirectBuffer msgType = new UnsafeBuffer();
    private byte[] msgTypeInternalBuffer = msgType.byteArray();
    private int msgTypeOffset = 0;
    private int msgTypeLength = 0;

    /* MsgType = 35 */
    public HeaderEncoder msgType(final DirectBuffer value, final int offset, final int length)
    {
        msgType.wrap(value);
        msgTypeOffset = offset;
        msgTypeLength = length;
        return this;
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final DirectBuffer value, final int length)
    {
        return msgType(value, 0, length);
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final DirectBuffer value)
    {
        return msgType(value, 0, value.capacity());
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final byte[] value, final int offset, final int length)
    {
        msgType.wrap(value);
        msgTypeOffset = offset;
        msgTypeLength = length;
        return this;
    }

    /* MsgType = 35 */
    public HeaderEncoder msgTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(msgType, value, offset, length))
        {
            msgTypeInternalBuffer = msgType.byteArray();
        }
        msgTypeOffset = 0;
        msgTypeLength = length;
        return this;
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final byte[] value, final int length)
    {
        return msgType(value, 0, length);
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final byte[] value)
    {
        return msgType(value, 0, value.length);
    }

    /* MsgType = 35 */
    public boolean hasMsgType()
    {
        return msgTypeLength > 0;
    }

    /* MsgType = 35 */
    public MutableDirectBuffer msgType()
    {
        return msgType;
    }

    /* MsgType = 35 */
    public String msgTypeAsString()
    {
        return msgType.getStringWithoutLengthAscii(msgTypeOffset, msgTypeLength);
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final CharSequence value)
    {
        if (toBytes(value, msgType))
        {
            msgTypeInternalBuffer = msgType.byteArray();
        }
        msgTypeOffset = 0;
        msgTypeLength = value.length();
        return this;
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            msgType.wrap(buffer);
            msgTypeOffset = value.offset();
            msgTypeLength = value.length();
        }
        return this;
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final char[] value)
    {
        return msgType(value, 0, value.length);
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final char[] value, final int length)
    {
        return msgType(value, 0, length);
    }

    /* MsgType = 35 */
    public HeaderEncoder msgType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, msgType, offset, length))
        {
            msgTypeInternalBuffer = msgType.byteArray();
        }
        msgTypeOffset = 0;
        msgTypeLength = length;
        return this;
    }

    public HeaderEncoder msgType(MsgType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MsgType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: msgType Value: " + value );
            }
            if (value == MsgType.NULL_VAL)
            {
                return this;
            }
        }
        return msgType(value.representation());
    }

    private final MutableDirectBuffer senderCompID = new UnsafeBuffer();
    private byte[] senderCompIDInternalBuffer = senderCompID.byteArray();
    private int senderCompIDOffset = 0;
    private int senderCompIDLength = 0;

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final DirectBuffer value, final int offset, final int length)
    {
        senderCompID.wrap(value);
        senderCompIDOffset = offset;
        senderCompIDLength = length;
        return this;
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final DirectBuffer value, final int length)
    {
        return senderCompID(value, 0, length);
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final DirectBuffer value)
    {
        return senderCompID(value, 0, value.capacity());
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final byte[] value, final int offset, final int length)
    {
        senderCompID.wrap(value);
        senderCompIDOffset = offset;
        senderCompIDLength = length;
        return this;
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(senderCompID, value, offset, length))
        {
            senderCompIDInternalBuffer = senderCompID.byteArray();
        }
        senderCompIDOffset = 0;
        senderCompIDLength = length;
        return this;
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final byte[] value, final int length)
    {
        return senderCompID(value, 0, length);
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final byte[] value)
    {
        return senderCompID(value, 0, value.length);
    }

    /* SenderCompID = 49 */
    public boolean hasSenderCompID()
    {
        return senderCompIDLength > 0;
    }

    /* SenderCompID = 49 */
    public MutableDirectBuffer senderCompID()
    {
        return senderCompID;
    }

    /* SenderCompID = 49 */
    public String senderCompIDAsString()
    {
        return senderCompID.getStringWithoutLengthAscii(senderCompIDOffset, senderCompIDLength);
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final CharSequence value)
    {
        if (toBytes(value, senderCompID))
        {
            senderCompIDInternalBuffer = senderCompID.byteArray();
        }
        senderCompIDOffset = 0;
        senderCompIDLength = value.length();
        return this;
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            senderCompID.wrap(buffer);
            senderCompIDOffset = value.offset();
            senderCompIDLength = value.length();
        }
        return this;
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final char[] value)
    {
        return senderCompID(value, 0, value.length);
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final char[] value, final int length)
    {
        return senderCompID(value, 0, length);
    }

    /* SenderCompID = 49 */
    public HeaderEncoder senderCompID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, senderCompID, offset, length))
        {
            senderCompIDInternalBuffer = senderCompID.byteArray();
        }
        senderCompIDOffset = 0;
        senderCompIDLength = length;
        return this;
    }

    private final MutableDirectBuffer targetCompID = new UnsafeBuffer();
    private byte[] targetCompIDInternalBuffer = targetCompID.byteArray();
    private int targetCompIDOffset = 0;
    private int targetCompIDLength = 0;

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final DirectBuffer value, final int offset, final int length)
    {
        targetCompID.wrap(value);
        targetCompIDOffset = offset;
        targetCompIDLength = length;
        return this;
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final DirectBuffer value, final int length)
    {
        return targetCompID(value, 0, length);
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final DirectBuffer value)
    {
        return targetCompID(value, 0, value.capacity());
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final byte[] value, final int offset, final int length)
    {
        targetCompID.wrap(value);
        targetCompIDOffset = offset;
        targetCompIDLength = length;
        return this;
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(targetCompID, value, offset, length))
        {
            targetCompIDInternalBuffer = targetCompID.byteArray();
        }
        targetCompIDOffset = 0;
        targetCompIDLength = length;
        return this;
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final byte[] value, final int length)
    {
        return targetCompID(value, 0, length);
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final byte[] value)
    {
        return targetCompID(value, 0, value.length);
    }

    /* TargetCompID = 56 */
    public boolean hasTargetCompID()
    {
        return targetCompIDLength > 0;
    }

    /* TargetCompID = 56 */
    public MutableDirectBuffer targetCompID()
    {
        return targetCompID;
    }

    /* TargetCompID = 56 */
    public String targetCompIDAsString()
    {
        return targetCompID.getStringWithoutLengthAscii(targetCompIDOffset, targetCompIDLength);
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final CharSequence value)
    {
        if (toBytes(value, targetCompID))
        {
            targetCompIDInternalBuffer = targetCompID.byteArray();
        }
        targetCompIDOffset = 0;
        targetCompIDLength = value.length();
        return this;
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            targetCompID.wrap(buffer);
            targetCompIDOffset = value.offset();
            targetCompIDLength = value.length();
        }
        return this;
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final char[] value)
    {
        return targetCompID(value, 0, value.length);
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final char[] value, final int length)
    {
        return targetCompID(value, 0, length);
    }

    /* TargetCompID = 56 */
    public HeaderEncoder targetCompID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, targetCompID, offset, length))
        {
            targetCompIDInternalBuffer = targetCompID.byteArray();
        }
        targetCompIDOffset = 0;
        targetCompIDLength = length;
        return this;
    }

    private final MutableDirectBuffer onBehalfOfCompID = new UnsafeBuffer();
    private byte[] onBehalfOfCompIDInternalBuffer = onBehalfOfCompID.byteArray();
    private int onBehalfOfCompIDOffset = 0;
    private int onBehalfOfCompIDLength = 0;

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final DirectBuffer value, final int offset, final int length)
    {
        onBehalfOfCompID.wrap(value);
        onBehalfOfCompIDOffset = offset;
        onBehalfOfCompIDLength = length;
        return this;
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final DirectBuffer value, final int length)
    {
        return onBehalfOfCompID(value, 0, length);
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final DirectBuffer value)
    {
        return onBehalfOfCompID(value, 0, value.capacity());
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final byte[] value, final int offset, final int length)
    {
        onBehalfOfCompID.wrap(value);
        onBehalfOfCompIDOffset = offset;
        onBehalfOfCompIDLength = length;
        return this;
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(onBehalfOfCompID, value, offset, length))
        {
            onBehalfOfCompIDInternalBuffer = onBehalfOfCompID.byteArray();
        }
        onBehalfOfCompIDOffset = 0;
        onBehalfOfCompIDLength = length;
        return this;
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final byte[] value, final int length)
    {
        return onBehalfOfCompID(value, 0, length);
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final byte[] value)
    {
        return onBehalfOfCompID(value, 0, value.length);
    }

    /* OnBehalfOfCompID = 115 */
    public boolean hasOnBehalfOfCompID()
    {
        return onBehalfOfCompIDLength > 0;
    }

    /* OnBehalfOfCompID = 115 */
    public MutableDirectBuffer onBehalfOfCompID()
    {
        return onBehalfOfCompID;
    }

    /* OnBehalfOfCompID = 115 */
    public String onBehalfOfCompIDAsString()
    {
        return onBehalfOfCompID.getStringWithoutLengthAscii(onBehalfOfCompIDOffset, onBehalfOfCompIDLength);
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final CharSequence value)
    {
        if (toBytes(value, onBehalfOfCompID))
        {
            onBehalfOfCompIDInternalBuffer = onBehalfOfCompID.byteArray();
        }
        onBehalfOfCompIDOffset = 0;
        onBehalfOfCompIDLength = value.length();
        return this;
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            onBehalfOfCompID.wrap(buffer);
            onBehalfOfCompIDOffset = value.offset();
            onBehalfOfCompIDLength = value.length();
        }
        return this;
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final char[] value)
    {
        return onBehalfOfCompID(value, 0, value.length);
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final char[] value, final int length)
    {
        return onBehalfOfCompID(value, 0, length);
    }

    /* OnBehalfOfCompID = 115 */
    public HeaderEncoder onBehalfOfCompID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, onBehalfOfCompID, offset, length))
        {
            onBehalfOfCompIDInternalBuffer = onBehalfOfCompID.byteArray();
        }
        onBehalfOfCompIDOffset = 0;
        onBehalfOfCompIDLength = length;
        return this;
    }

    private final MutableDirectBuffer deliverToCompID = new UnsafeBuffer();
    private byte[] deliverToCompIDInternalBuffer = deliverToCompID.byteArray();
    private int deliverToCompIDOffset = 0;
    private int deliverToCompIDLength = 0;

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final DirectBuffer value, final int offset, final int length)
    {
        deliverToCompID.wrap(value);
        deliverToCompIDOffset = offset;
        deliverToCompIDLength = length;
        return this;
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final DirectBuffer value, final int length)
    {
        return deliverToCompID(value, 0, length);
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final DirectBuffer value)
    {
        return deliverToCompID(value, 0, value.capacity());
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final byte[] value, final int offset, final int length)
    {
        deliverToCompID.wrap(value);
        deliverToCompIDOffset = offset;
        deliverToCompIDLength = length;
        return this;
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(deliverToCompID, value, offset, length))
        {
            deliverToCompIDInternalBuffer = deliverToCompID.byteArray();
        }
        deliverToCompIDOffset = 0;
        deliverToCompIDLength = length;
        return this;
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final byte[] value, final int length)
    {
        return deliverToCompID(value, 0, length);
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final byte[] value)
    {
        return deliverToCompID(value, 0, value.length);
    }

    /* DeliverToCompID = 128 */
    public boolean hasDeliverToCompID()
    {
        return deliverToCompIDLength > 0;
    }

    /* DeliverToCompID = 128 */
    public MutableDirectBuffer deliverToCompID()
    {
        return deliverToCompID;
    }

    /* DeliverToCompID = 128 */
    public String deliverToCompIDAsString()
    {
        return deliverToCompID.getStringWithoutLengthAscii(deliverToCompIDOffset, deliverToCompIDLength);
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final CharSequence value)
    {
        if (toBytes(value, deliverToCompID))
        {
            deliverToCompIDInternalBuffer = deliverToCompID.byteArray();
        }
        deliverToCompIDOffset = 0;
        deliverToCompIDLength = value.length();
        return this;
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            deliverToCompID.wrap(buffer);
            deliverToCompIDOffset = value.offset();
            deliverToCompIDLength = value.length();
        }
        return this;
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final char[] value)
    {
        return deliverToCompID(value, 0, value.length);
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final char[] value, final int length)
    {
        return deliverToCompID(value, 0, length);
    }

    /* DeliverToCompID = 128 */
    public HeaderEncoder deliverToCompID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, deliverToCompID, offset, length))
        {
            deliverToCompIDInternalBuffer = deliverToCompID.byteArray();
        }
        deliverToCompIDOffset = 0;
        deliverToCompIDLength = length;
        return this;
    }

    private int secureDataLen;

    private boolean hasSecureDataLen;

    public boolean hasSecureDataLen()
    {
        return hasSecureDataLen;
    }

    /* SecureDataLen = 90 */
    public HeaderEncoder secureDataLen(int value)
    {
        secureDataLen = value;
        hasSecureDataLen = true;
        return this;
    }

    /* SecureDataLen = 90 */
    public int secureDataLen()
    {
        return secureDataLen;
    }

    private byte[] secureData;

    private boolean hasSecureData;

    public boolean hasSecureData()
    {
        return hasSecureData;
    }

    /* SecureData = 91 */
    public HeaderEncoder secureData(byte[] value)
    {
        secureData = value;
        hasSecureData = true;
        return this;
    }

    /* SecureData = 91 */
    public byte[] secureData()
    {
        return secureData;
    }

    /* SecureData = 91 */
    public HeaderEncoder secureDataAsCopy(final byte[] value, final int offset, final int length)
    {
        secureData = copyInto(secureData, value, offset, length);
        hasSecureData = true;
        return this;
    }

    private int msgSeqNum;

    private boolean hasMsgSeqNum;

    public boolean hasMsgSeqNum()
    {
        return hasMsgSeqNum;
    }

    /* MsgSeqNum = 34 */
    public HeaderEncoder msgSeqNum(int value)
    {
        msgSeqNum = value;
        hasMsgSeqNum = true;
        return this;
    }

    /* MsgSeqNum = 34 */
    public int msgSeqNum()
    {
        return msgSeqNum;
    }

    private final MutableDirectBuffer senderSubID = new UnsafeBuffer();
    private byte[] senderSubIDInternalBuffer = senderSubID.byteArray();
    private int senderSubIDOffset = 0;
    private int senderSubIDLength = 0;

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final DirectBuffer value, final int offset, final int length)
    {
        senderSubID.wrap(value);
        senderSubIDOffset = offset;
        senderSubIDLength = length;
        return this;
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final DirectBuffer value, final int length)
    {
        return senderSubID(value, 0, length);
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final DirectBuffer value)
    {
        return senderSubID(value, 0, value.capacity());
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final byte[] value, final int offset, final int length)
    {
        senderSubID.wrap(value);
        senderSubIDOffset = offset;
        senderSubIDLength = length;
        return this;
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(senderSubID, value, offset, length))
        {
            senderSubIDInternalBuffer = senderSubID.byteArray();
        }
        senderSubIDOffset = 0;
        senderSubIDLength = length;
        return this;
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final byte[] value, final int length)
    {
        return senderSubID(value, 0, length);
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final byte[] value)
    {
        return senderSubID(value, 0, value.length);
    }

    /* SenderSubID = 50 */
    public boolean hasSenderSubID()
    {
        return senderSubIDLength > 0;
    }

    /* SenderSubID = 50 */
    public MutableDirectBuffer senderSubID()
    {
        return senderSubID;
    }

    /* SenderSubID = 50 */
    public String senderSubIDAsString()
    {
        return senderSubID.getStringWithoutLengthAscii(senderSubIDOffset, senderSubIDLength);
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final CharSequence value)
    {
        if (toBytes(value, senderSubID))
        {
            senderSubIDInternalBuffer = senderSubID.byteArray();
        }
        senderSubIDOffset = 0;
        senderSubIDLength = value.length();
        return this;
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            senderSubID.wrap(buffer);
            senderSubIDOffset = value.offset();
            senderSubIDLength = value.length();
        }
        return this;
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final char[] value)
    {
        return senderSubID(value, 0, value.length);
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final char[] value, final int length)
    {
        return senderSubID(value, 0, length);
    }

    /* SenderSubID = 50 */
    public HeaderEncoder senderSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, senderSubID, offset, length))
        {
            senderSubIDInternalBuffer = senderSubID.byteArray();
        }
        senderSubIDOffset = 0;
        senderSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer senderLocationID = new UnsafeBuffer();
    private byte[] senderLocationIDInternalBuffer = senderLocationID.byteArray();
    private int senderLocationIDOffset = 0;
    private int senderLocationIDLength = 0;

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final DirectBuffer value, final int offset, final int length)
    {
        senderLocationID.wrap(value);
        senderLocationIDOffset = offset;
        senderLocationIDLength = length;
        return this;
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final DirectBuffer value, final int length)
    {
        return senderLocationID(value, 0, length);
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final DirectBuffer value)
    {
        return senderLocationID(value, 0, value.capacity());
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final byte[] value, final int offset, final int length)
    {
        senderLocationID.wrap(value);
        senderLocationIDOffset = offset;
        senderLocationIDLength = length;
        return this;
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(senderLocationID, value, offset, length))
        {
            senderLocationIDInternalBuffer = senderLocationID.byteArray();
        }
        senderLocationIDOffset = 0;
        senderLocationIDLength = length;
        return this;
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final byte[] value, final int length)
    {
        return senderLocationID(value, 0, length);
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final byte[] value)
    {
        return senderLocationID(value, 0, value.length);
    }

    /* SenderLocationID = 142 */
    public boolean hasSenderLocationID()
    {
        return senderLocationIDLength > 0;
    }

    /* SenderLocationID = 142 */
    public MutableDirectBuffer senderLocationID()
    {
        return senderLocationID;
    }

    /* SenderLocationID = 142 */
    public String senderLocationIDAsString()
    {
        return senderLocationID.getStringWithoutLengthAscii(senderLocationIDOffset, senderLocationIDLength);
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final CharSequence value)
    {
        if (toBytes(value, senderLocationID))
        {
            senderLocationIDInternalBuffer = senderLocationID.byteArray();
        }
        senderLocationIDOffset = 0;
        senderLocationIDLength = value.length();
        return this;
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            senderLocationID.wrap(buffer);
            senderLocationIDOffset = value.offset();
            senderLocationIDLength = value.length();
        }
        return this;
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final char[] value)
    {
        return senderLocationID(value, 0, value.length);
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final char[] value, final int length)
    {
        return senderLocationID(value, 0, length);
    }

    /* SenderLocationID = 142 */
    public HeaderEncoder senderLocationID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, senderLocationID, offset, length))
        {
            senderLocationIDInternalBuffer = senderLocationID.byteArray();
        }
        senderLocationIDOffset = 0;
        senderLocationIDLength = length;
        return this;
    }

    private final MutableDirectBuffer targetSubID = new UnsafeBuffer();
    private byte[] targetSubIDInternalBuffer = targetSubID.byteArray();
    private int targetSubIDOffset = 0;
    private int targetSubIDLength = 0;

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final DirectBuffer value, final int offset, final int length)
    {
        targetSubID.wrap(value);
        targetSubIDOffset = offset;
        targetSubIDLength = length;
        return this;
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final DirectBuffer value, final int length)
    {
        return targetSubID(value, 0, length);
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final DirectBuffer value)
    {
        return targetSubID(value, 0, value.capacity());
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final byte[] value, final int offset, final int length)
    {
        targetSubID.wrap(value);
        targetSubIDOffset = offset;
        targetSubIDLength = length;
        return this;
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(targetSubID, value, offset, length))
        {
            targetSubIDInternalBuffer = targetSubID.byteArray();
        }
        targetSubIDOffset = 0;
        targetSubIDLength = length;
        return this;
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final byte[] value, final int length)
    {
        return targetSubID(value, 0, length);
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final byte[] value)
    {
        return targetSubID(value, 0, value.length);
    }

    /* TargetSubID = 57 */
    public boolean hasTargetSubID()
    {
        return targetSubIDLength > 0;
    }

    /* TargetSubID = 57 */
    public MutableDirectBuffer targetSubID()
    {
        return targetSubID;
    }

    /* TargetSubID = 57 */
    public String targetSubIDAsString()
    {
        return targetSubID.getStringWithoutLengthAscii(targetSubIDOffset, targetSubIDLength);
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final CharSequence value)
    {
        if (toBytes(value, targetSubID))
        {
            targetSubIDInternalBuffer = targetSubID.byteArray();
        }
        targetSubIDOffset = 0;
        targetSubIDLength = value.length();
        return this;
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            targetSubID.wrap(buffer);
            targetSubIDOffset = value.offset();
            targetSubIDLength = value.length();
        }
        return this;
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final char[] value)
    {
        return targetSubID(value, 0, value.length);
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final char[] value, final int length)
    {
        return targetSubID(value, 0, length);
    }

    /* TargetSubID = 57 */
    public HeaderEncoder targetSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, targetSubID, offset, length))
        {
            targetSubIDInternalBuffer = targetSubID.byteArray();
        }
        targetSubIDOffset = 0;
        targetSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer targetLocationID = new UnsafeBuffer();
    private byte[] targetLocationIDInternalBuffer = targetLocationID.byteArray();
    private int targetLocationIDOffset = 0;
    private int targetLocationIDLength = 0;

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final DirectBuffer value, final int offset, final int length)
    {
        targetLocationID.wrap(value);
        targetLocationIDOffset = offset;
        targetLocationIDLength = length;
        return this;
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final DirectBuffer value, final int length)
    {
        return targetLocationID(value, 0, length);
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final DirectBuffer value)
    {
        return targetLocationID(value, 0, value.capacity());
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final byte[] value, final int offset, final int length)
    {
        targetLocationID.wrap(value);
        targetLocationIDOffset = offset;
        targetLocationIDLength = length;
        return this;
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(targetLocationID, value, offset, length))
        {
            targetLocationIDInternalBuffer = targetLocationID.byteArray();
        }
        targetLocationIDOffset = 0;
        targetLocationIDLength = length;
        return this;
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final byte[] value, final int length)
    {
        return targetLocationID(value, 0, length);
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final byte[] value)
    {
        return targetLocationID(value, 0, value.length);
    }

    /* TargetLocationID = 143 */
    public boolean hasTargetLocationID()
    {
        return targetLocationIDLength > 0;
    }

    /* TargetLocationID = 143 */
    public MutableDirectBuffer targetLocationID()
    {
        return targetLocationID;
    }

    /* TargetLocationID = 143 */
    public String targetLocationIDAsString()
    {
        return targetLocationID.getStringWithoutLengthAscii(targetLocationIDOffset, targetLocationIDLength);
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final CharSequence value)
    {
        if (toBytes(value, targetLocationID))
        {
            targetLocationIDInternalBuffer = targetLocationID.byteArray();
        }
        targetLocationIDOffset = 0;
        targetLocationIDLength = value.length();
        return this;
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            targetLocationID.wrap(buffer);
            targetLocationIDOffset = value.offset();
            targetLocationIDLength = value.length();
        }
        return this;
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final char[] value)
    {
        return targetLocationID(value, 0, value.length);
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final char[] value, final int length)
    {
        return targetLocationID(value, 0, length);
    }

    /* TargetLocationID = 143 */
    public HeaderEncoder targetLocationID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, targetLocationID, offset, length))
        {
            targetLocationIDInternalBuffer = targetLocationID.byteArray();
        }
        targetLocationIDOffset = 0;
        targetLocationIDLength = length;
        return this;
    }

    private final MutableDirectBuffer onBehalfOfSubID = new UnsafeBuffer();
    private byte[] onBehalfOfSubIDInternalBuffer = onBehalfOfSubID.byteArray();
    private int onBehalfOfSubIDOffset = 0;
    private int onBehalfOfSubIDLength = 0;

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final DirectBuffer value, final int offset, final int length)
    {
        onBehalfOfSubID.wrap(value);
        onBehalfOfSubIDOffset = offset;
        onBehalfOfSubIDLength = length;
        return this;
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final DirectBuffer value, final int length)
    {
        return onBehalfOfSubID(value, 0, length);
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final DirectBuffer value)
    {
        return onBehalfOfSubID(value, 0, value.capacity());
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final byte[] value, final int offset, final int length)
    {
        onBehalfOfSubID.wrap(value);
        onBehalfOfSubIDOffset = offset;
        onBehalfOfSubIDLength = length;
        return this;
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(onBehalfOfSubID, value, offset, length))
        {
            onBehalfOfSubIDInternalBuffer = onBehalfOfSubID.byteArray();
        }
        onBehalfOfSubIDOffset = 0;
        onBehalfOfSubIDLength = length;
        return this;
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final byte[] value, final int length)
    {
        return onBehalfOfSubID(value, 0, length);
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final byte[] value)
    {
        return onBehalfOfSubID(value, 0, value.length);
    }

    /* OnBehalfOfSubID = 116 */
    public boolean hasOnBehalfOfSubID()
    {
        return onBehalfOfSubIDLength > 0;
    }

    /* OnBehalfOfSubID = 116 */
    public MutableDirectBuffer onBehalfOfSubID()
    {
        return onBehalfOfSubID;
    }

    /* OnBehalfOfSubID = 116 */
    public String onBehalfOfSubIDAsString()
    {
        return onBehalfOfSubID.getStringWithoutLengthAscii(onBehalfOfSubIDOffset, onBehalfOfSubIDLength);
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final CharSequence value)
    {
        if (toBytes(value, onBehalfOfSubID))
        {
            onBehalfOfSubIDInternalBuffer = onBehalfOfSubID.byteArray();
        }
        onBehalfOfSubIDOffset = 0;
        onBehalfOfSubIDLength = value.length();
        return this;
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            onBehalfOfSubID.wrap(buffer);
            onBehalfOfSubIDOffset = value.offset();
            onBehalfOfSubIDLength = value.length();
        }
        return this;
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final char[] value)
    {
        return onBehalfOfSubID(value, 0, value.length);
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final char[] value, final int length)
    {
        return onBehalfOfSubID(value, 0, length);
    }

    /* OnBehalfOfSubID = 116 */
    public HeaderEncoder onBehalfOfSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, onBehalfOfSubID, offset, length))
        {
            onBehalfOfSubIDInternalBuffer = onBehalfOfSubID.byteArray();
        }
        onBehalfOfSubIDOffset = 0;
        onBehalfOfSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer onBehalfOfLocationID = new UnsafeBuffer();
    private byte[] onBehalfOfLocationIDInternalBuffer = onBehalfOfLocationID.byteArray();
    private int onBehalfOfLocationIDOffset = 0;
    private int onBehalfOfLocationIDLength = 0;

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final DirectBuffer value, final int offset, final int length)
    {
        onBehalfOfLocationID.wrap(value);
        onBehalfOfLocationIDOffset = offset;
        onBehalfOfLocationIDLength = length;
        return this;
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final DirectBuffer value, final int length)
    {
        return onBehalfOfLocationID(value, 0, length);
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final DirectBuffer value)
    {
        return onBehalfOfLocationID(value, 0, value.capacity());
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final byte[] value, final int offset, final int length)
    {
        onBehalfOfLocationID.wrap(value);
        onBehalfOfLocationIDOffset = offset;
        onBehalfOfLocationIDLength = length;
        return this;
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(onBehalfOfLocationID, value, offset, length))
        {
            onBehalfOfLocationIDInternalBuffer = onBehalfOfLocationID.byteArray();
        }
        onBehalfOfLocationIDOffset = 0;
        onBehalfOfLocationIDLength = length;
        return this;
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final byte[] value, final int length)
    {
        return onBehalfOfLocationID(value, 0, length);
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final byte[] value)
    {
        return onBehalfOfLocationID(value, 0, value.length);
    }

    /* OnBehalfOfLocationID = 144 */
    public boolean hasOnBehalfOfLocationID()
    {
        return onBehalfOfLocationIDLength > 0;
    }

    /* OnBehalfOfLocationID = 144 */
    public MutableDirectBuffer onBehalfOfLocationID()
    {
        return onBehalfOfLocationID;
    }

    /* OnBehalfOfLocationID = 144 */
    public String onBehalfOfLocationIDAsString()
    {
        return onBehalfOfLocationID.getStringWithoutLengthAscii(onBehalfOfLocationIDOffset, onBehalfOfLocationIDLength);
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final CharSequence value)
    {
        if (toBytes(value, onBehalfOfLocationID))
        {
            onBehalfOfLocationIDInternalBuffer = onBehalfOfLocationID.byteArray();
        }
        onBehalfOfLocationIDOffset = 0;
        onBehalfOfLocationIDLength = value.length();
        return this;
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            onBehalfOfLocationID.wrap(buffer);
            onBehalfOfLocationIDOffset = value.offset();
            onBehalfOfLocationIDLength = value.length();
        }
        return this;
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final char[] value)
    {
        return onBehalfOfLocationID(value, 0, value.length);
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final char[] value, final int length)
    {
        return onBehalfOfLocationID(value, 0, length);
    }

    /* OnBehalfOfLocationID = 144 */
    public HeaderEncoder onBehalfOfLocationID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, onBehalfOfLocationID, offset, length))
        {
            onBehalfOfLocationIDInternalBuffer = onBehalfOfLocationID.byteArray();
        }
        onBehalfOfLocationIDOffset = 0;
        onBehalfOfLocationIDLength = length;
        return this;
    }

    private final MutableDirectBuffer deliverToSubID = new UnsafeBuffer();
    private byte[] deliverToSubIDInternalBuffer = deliverToSubID.byteArray();
    private int deliverToSubIDOffset = 0;
    private int deliverToSubIDLength = 0;

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final DirectBuffer value, final int offset, final int length)
    {
        deliverToSubID.wrap(value);
        deliverToSubIDOffset = offset;
        deliverToSubIDLength = length;
        return this;
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final DirectBuffer value, final int length)
    {
        return deliverToSubID(value, 0, length);
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final DirectBuffer value)
    {
        return deliverToSubID(value, 0, value.capacity());
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final byte[] value, final int offset, final int length)
    {
        deliverToSubID.wrap(value);
        deliverToSubIDOffset = offset;
        deliverToSubIDLength = length;
        return this;
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(deliverToSubID, value, offset, length))
        {
            deliverToSubIDInternalBuffer = deliverToSubID.byteArray();
        }
        deliverToSubIDOffset = 0;
        deliverToSubIDLength = length;
        return this;
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final byte[] value, final int length)
    {
        return deliverToSubID(value, 0, length);
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final byte[] value)
    {
        return deliverToSubID(value, 0, value.length);
    }

    /* DeliverToSubID = 129 */
    public boolean hasDeliverToSubID()
    {
        return deliverToSubIDLength > 0;
    }

    /* DeliverToSubID = 129 */
    public MutableDirectBuffer deliverToSubID()
    {
        return deliverToSubID;
    }

    /* DeliverToSubID = 129 */
    public String deliverToSubIDAsString()
    {
        return deliverToSubID.getStringWithoutLengthAscii(deliverToSubIDOffset, deliverToSubIDLength);
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final CharSequence value)
    {
        if (toBytes(value, deliverToSubID))
        {
            deliverToSubIDInternalBuffer = deliverToSubID.byteArray();
        }
        deliverToSubIDOffset = 0;
        deliverToSubIDLength = value.length();
        return this;
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            deliverToSubID.wrap(buffer);
            deliverToSubIDOffset = value.offset();
            deliverToSubIDLength = value.length();
        }
        return this;
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final char[] value)
    {
        return deliverToSubID(value, 0, value.length);
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final char[] value, final int length)
    {
        return deliverToSubID(value, 0, length);
    }

    /* DeliverToSubID = 129 */
    public HeaderEncoder deliverToSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, deliverToSubID, offset, length))
        {
            deliverToSubIDInternalBuffer = deliverToSubID.byteArray();
        }
        deliverToSubIDOffset = 0;
        deliverToSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer deliverToLocationID = new UnsafeBuffer();
    private byte[] deliverToLocationIDInternalBuffer = deliverToLocationID.byteArray();
    private int deliverToLocationIDOffset = 0;
    private int deliverToLocationIDLength = 0;

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final DirectBuffer value, final int offset, final int length)
    {
        deliverToLocationID.wrap(value);
        deliverToLocationIDOffset = offset;
        deliverToLocationIDLength = length;
        return this;
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final DirectBuffer value, final int length)
    {
        return deliverToLocationID(value, 0, length);
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final DirectBuffer value)
    {
        return deliverToLocationID(value, 0, value.capacity());
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final byte[] value, final int offset, final int length)
    {
        deliverToLocationID.wrap(value);
        deliverToLocationIDOffset = offset;
        deliverToLocationIDLength = length;
        return this;
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(deliverToLocationID, value, offset, length))
        {
            deliverToLocationIDInternalBuffer = deliverToLocationID.byteArray();
        }
        deliverToLocationIDOffset = 0;
        deliverToLocationIDLength = length;
        return this;
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final byte[] value, final int length)
    {
        return deliverToLocationID(value, 0, length);
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final byte[] value)
    {
        return deliverToLocationID(value, 0, value.length);
    }

    /* DeliverToLocationID = 145 */
    public boolean hasDeliverToLocationID()
    {
        return deliverToLocationIDLength > 0;
    }

    /* DeliverToLocationID = 145 */
    public MutableDirectBuffer deliverToLocationID()
    {
        return deliverToLocationID;
    }

    /* DeliverToLocationID = 145 */
    public String deliverToLocationIDAsString()
    {
        return deliverToLocationID.getStringWithoutLengthAscii(deliverToLocationIDOffset, deliverToLocationIDLength);
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final CharSequence value)
    {
        if (toBytes(value, deliverToLocationID))
        {
            deliverToLocationIDInternalBuffer = deliverToLocationID.byteArray();
        }
        deliverToLocationIDOffset = 0;
        deliverToLocationIDLength = value.length();
        return this;
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            deliverToLocationID.wrap(buffer);
            deliverToLocationIDOffset = value.offset();
            deliverToLocationIDLength = value.length();
        }
        return this;
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final char[] value)
    {
        return deliverToLocationID(value, 0, value.length);
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final char[] value, final int length)
    {
        return deliverToLocationID(value, 0, length);
    }

    /* DeliverToLocationID = 145 */
    public HeaderEncoder deliverToLocationID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, deliverToLocationID, offset, length))
        {
            deliverToLocationIDInternalBuffer = deliverToLocationID.byteArray();
        }
        deliverToLocationIDOffset = 0;
        deliverToLocationIDLength = length;
        return this;
    }

    private boolean possDupFlag;

    private boolean hasPossDupFlag;

    public boolean hasPossDupFlag()
    {
        return hasPossDupFlag;
    }

    /* PossDupFlag = 43 */
    public HeaderEncoder possDupFlag(boolean value)
    {
        possDupFlag = value;
        hasPossDupFlag = true;
        return this;
    }

    /* PossDupFlag = 43 */
    public boolean possDupFlag()
    {
        return possDupFlag;
    }

    private boolean possResend;

    private boolean hasPossResend;

    public boolean hasPossResend()
    {
        return hasPossResend;
    }

    /* PossResend = 97 */
    public HeaderEncoder possResend(boolean value)
    {
        possResend = value;
        hasPossResend = true;
        return this;
    }

    /* PossResend = 97 */
    public boolean possResend()
    {
        return possResend;
    }

    private final MutableDirectBuffer sendingTime = new UnsafeBuffer();
    private byte[] sendingTimeInternalBuffer = sendingTime.byteArray();
    private int sendingTimeOffset = 0;
    private int sendingTimeLength = 0;

    /* SendingTime = 52 */
    public HeaderEncoder sendingTime(final DirectBuffer value, final int offset, final int length)
    {
        sendingTime.wrap(value);
        sendingTimeOffset = offset;
        sendingTimeLength = length;
        return this;
    }

    /* SendingTime = 52 */
    public HeaderEncoder sendingTime(final DirectBuffer value, final int length)
    {
        return sendingTime(value, 0, length);
    }

    /* SendingTime = 52 */
    public HeaderEncoder sendingTime(final DirectBuffer value)
    {
        return sendingTime(value, 0, value.capacity());
    }

    /* SendingTime = 52 */
    public HeaderEncoder sendingTime(final byte[] value, final int offset, final int length)
    {
        sendingTime.wrap(value);
        sendingTimeOffset = offset;
        sendingTimeLength = length;
        return this;
    }

    /* SendingTime = 52 */
    public HeaderEncoder sendingTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(sendingTime, value, offset, length))
        {
            sendingTimeInternalBuffer = sendingTime.byteArray();
        }
        sendingTimeOffset = 0;
        sendingTimeLength = length;
        return this;
    }

    /* SendingTime = 52 */
    public HeaderEncoder sendingTime(final byte[] value, final int length)
    {
        return sendingTime(value, 0, length);
    }

    /* SendingTime = 52 */
    public HeaderEncoder sendingTime(final byte[] value)
    {
        return sendingTime(value, 0, value.length);
    }

    /* SendingTime = 52 */
    public boolean hasSendingTime()
    {
        return sendingTimeLength > 0;
    }

    /* SendingTime = 52 */
    public MutableDirectBuffer sendingTime()
    {
        return sendingTime;
    }

    /* SendingTime = 52 */
    public String sendingTimeAsString()
    {
        return sendingTime.getStringWithoutLengthAscii(sendingTimeOffset, sendingTimeLength);
    }

    private final MutableDirectBuffer origSendingTime = new UnsafeBuffer();
    private byte[] origSendingTimeInternalBuffer = origSendingTime.byteArray();
    private int origSendingTimeOffset = 0;
    private int origSendingTimeLength = 0;

    /* OrigSendingTime = 122 */
    public HeaderEncoder origSendingTime(final DirectBuffer value, final int offset, final int length)
    {
        origSendingTime.wrap(value);
        origSendingTimeOffset = offset;
        origSendingTimeLength = length;
        return this;
    }

    /* OrigSendingTime = 122 */
    public HeaderEncoder origSendingTime(final DirectBuffer value, final int length)
    {
        return origSendingTime(value, 0, length);
    }

    /* OrigSendingTime = 122 */
    public HeaderEncoder origSendingTime(final DirectBuffer value)
    {
        return origSendingTime(value, 0, value.capacity());
    }

    /* OrigSendingTime = 122 */
    public HeaderEncoder origSendingTime(final byte[] value, final int offset, final int length)
    {
        origSendingTime.wrap(value);
        origSendingTimeOffset = offset;
        origSendingTimeLength = length;
        return this;
    }

    /* OrigSendingTime = 122 */
    public HeaderEncoder origSendingTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(origSendingTime, value, offset, length))
        {
            origSendingTimeInternalBuffer = origSendingTime.byteArray();
        }
        origSendingTimeOffset = 0;
        origSendingTimeLength = length;
        return this;
    }

    /* OrigSendingTime = 122 */
    public HeaderEncoder origSendingTime(final byte[] value, final int length)
    {
        return origSendingTime(value, 0, length);
    }

    /* OrigSendingTime = 122 */
    public HeaderEncoder origSendingTime(final byte[] value)
    {
        return origSendingTime(value, 0, value.length);
    }

    /* OrigSendingTime = 122 */
    public boolean hasOrigSendingTime()
    {
        return origSendingTimeLength > 0;
    }

    /* OrigSendingTime = 122 */
    public MutableDirectBuffer origSendingTime()
    {
        return origSendingTime;
    }

    /* OrigSendingTime = 122 */
    public String origSendingTimeAsString()
    {
        return origSendingTime.getStringWithoutLengthAscii(origSendingTimeOffset, origSendingTimeLength);
    }

    private int xmlDataLen;

    private boolean hasXmlDataLen;

    public boolean hasXmlDataLen()
    {
        return hasXmlDataLen;
    }

    /* XmlDataLen = 212 */
    public HeaderEncoder xmlDataLen(int value)
    {
        xmlDataLen = value;
        hasXmlDataLen = true;
        return this;
    }

    /* XmlDataLen = 212 */
    public int xmlDataLen()
    {
        return xmlDataLen;
    }

    private byte[] xmlData;

    private boolean hasXmlData;

    public boolean hasXmlData()
    {
        return hasXmlData;
    }

    /* XmlData = 213 */
    public HeaderEncoder xmlData(byte[] value)
    {
        xmlData = value;
        hasXmlData = true;
        return this;
    }

    /* XmlData = 213 */
    public byte[] xmlData()
    {
        return xmlData;
    }

    /* XmlData = 213 */
    public HeaderEncoder xmlDataAsCopy(final byte[] value, final int offset, final int length)
    {
        xmlData = copyInto(xmlData, value, offset, length);
        hasXmlData = true;
        return this;
    }

    private final MutableDirectBuffer messageEncoding = new UnsafeBuffer();
    private byte[] messageEncodingInternalBuffer = messageEncoding.byteArray();
    private int messageEncodingOffset = 0;
    private int messageEncodingLength = 0;

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final DirectBuffer value, final int offset, final int length)
    {
        messageEncoding.wrap(value);
        messageEncodingOffset = offset;
        messageEncodingLength = length;
        return this;
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final DirectBuffer value, final int length)
    {
        return messageEncoding(value, 0, length);
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final DirectBuffer value)
    {
        return messageEncoding(value, 0, value.capacity());
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final byte[] value, final int offset, final int length)
    {
        messageEncoding.wrap(value);
        messageEncodingOffset = offset;
        messageEncodingLength = length;
        return this;
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncodingAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(messageEncoding, value, offset, length))
        {
            messageEncodingInternalBuffer = messageEncoding.byteArray();
        }
        messageEncodingOffset = 0;
        messageEncodingLength = length;
        return this;
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final byte[] value, final int length)
    {
        return messageEncoding(value, 0, length);
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final byte[] value)
    {
        return messageEncoding(value, 0, value.length);
    }

    /* MessageEncoding = 347 */
    public boolean hasMessageEncoding()
    {
        return messageEncodingLength > 0;
    }

    /* MessageEncoding = 347 */
    public MutableDirectBuffer messageEncoding()
    {
        return messageEncoding;
    }

    /* MessageEncoding = 347 */
    public String messageEncodingAsString()
    {
        return messageEncoding.getStringWithoutLengthAscii(messageEncodingOffset, messageEncodingLength);
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final CharSequence value)
    {
        if (toBytes(value, messageEncoding))
        {
            messageEncodingInternalBuffer = messageEncoding.byteArray();
        }
        messageEncodingOffset = 0;
        messageEncodingLength = value.length();
        return this;
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            messageEncoding.wrap(buffer);
            messageEncodingOffset = value.offset();
            messageEncodingLength = value.length();
        }
        return this;
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final char[] value)
    {
        return messageEncoding(value, 0, value.length);
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final char[] value, final int length)
    {
        return messageEncoding(value, 0, length);
    }

    /* MessageEncoding = 347 */
    public HeaderEncoder messageEncoding(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, messageEncoding, offset, length))
        {
            messageEncodingInternalBuffer = messageEncoding.byteArray();
        }
        messageEncodingOffset = 0;
        messageEncodingLength = length;
        return this;
    }

    public HeaderEncoder messageEncoding(MessageEncoding value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MessageEncoding.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: messageEncoding Value: " + value );
            }
            if (value == MessageEncoding.NULL_VAL)
            {
                return this;
            }
        }
        return messageEncoding(value.representation());
    }

    private int lastMsgSeqNumProcessed;

    private boolean hasLastMsgSeqNumProcessed;

    public boolean hasLastMsgSeqNumProcessed()
    {
        return hasLastMsgSeqNumProcessed;
    }

    /* LastMsgSeqNumProcessed = 369 */
    public HeaderEncoder lastMsgSeqNumProcessed(int value)
    {
        lastMsgSeqNumProcessed = value;
        hasLastMsgSeqNumProcessed = true;
        return this;
    }

    /* LastMsgSeqNumProcessed = 369 */
    public int lastMsgSeqNumProcessed()
    {
        return lastMsgSeqNumProcessed;
    }

    int finishHeader(final MutableAsciiBuffer buffer, final int bodyStart, final int bodyLength)
    {
        int position = bodyStart - 1;

        buffer.putSeparator(position);
        position = buffer.putNaturalIntAsciiFromEnd(bodyLength, position);
        position -= bodyLengthHeaderLength;
        buffer.putBytes(position, bodyLengthHeader, 0, bodyLengthHeaderLength);

        if (beginStringLength > 0) {
        position--;
        buffer.putSeparator(position);
        position -= beginStringLength;
        buffer.putBytes(position, beginString, beginStringOffset, beginStringLength);
        position -= beginStringHeaderLength;
        buffer.putBytes(position, beginStringHeader, 0, beginStringHeaderLength);
        } else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BeginString");
        }

        return position;
    }

    // 35=...| + other header fields
    public long startMessage(final MutableAsciiBuffer buffer, final int offset)
    {
        final int start = offset + beginStringLength + 16;
        int position = start;

        if (msgTypeLength > 0)
        {
            buffer.putBytes(position, msgTypeHeader, 0, msgTypeHeaderLength);
            position += msgTypeHeaderLength;
            buffer.putBytes(position, msgType, msgTypeOffset, msgTypeLength);
            position += msgTypeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MsgType");
        }

        if (senderCompIDLength > 0)
        {
            buffer.putBytes(position, senderCompIDHeader, 0, senderCompIDHeaderLength);
            position += senderCompIDHeaderLength;
            buffer.putBytes(position, senderCompID, senderCompIDOffset, senderCompIDLength);
            position += senderCompIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SenderCompID");
        }

        if (targetCompIDLength > 0)
        {
            buffer.putBytes(position, targetCompIDHeader, 0, targetCompIDHeaderLength);
            position += targetCompIDHeaderLength;
            buffer.putBytes(position, targetCompID, targetCompIDOffset, targetCompIDLength);
            position += targetCompIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TargetCompID");
        }

        if (onBehalfOfCompIDLength > 0)
        {
            buffer.putBytes(position, onBehalfOfCompIDHeader, 0, onBehalfOfCompIDHeaderLength);
            position += onBehalfOfCompIDHeaderLength;
            buffer.putBytes(position, onBehalfOfCompID, onBehalfOfCompIDOffset, onBehalfOfCompIDLength);
            position += onBehalfOfCompIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (deliverToCompIDLength > 0)
        {
            buffer.putBytes(position, deliverToCompIDHeader, 0, deliverToCompIDHeaderLength);
            position += deliverToCompIDHeaderLength;
            buffer.putBytes(position, deliverToCompID, deliverToCompIDOffset, deliverToCompIDLength);
            position += deliverToCompIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecureDataLen)
        {
            buffer.putBytes(position, secureDataLenHeader, 0, secureDataLenHeaderLength);
            position += secureDataLenHeaderLength;
            position += buffer.putIntAscii(position, secureDataLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecureData)
        {
            buffer.putBytes(position, secureDataHeader, 0, secureDataHeaderLength);
            position += secureDataHeaderLength;
            buffer.putBytes(position, secureData);
            position += secureData.length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMsgSeqNum)
        {
            buffer.putBytes(position, msgSeqNumHeader, 0, msgSeqNumHeaderLength);
            position += msgSeqNumHeaderLength;
            position += buffer.putIntAscii(position, msgSeqNum);
            buffer.putSeparator(position);
            position++;
        }

        if (senderSubIDLength > 0)
        {
            buffer.putBytes(position, senderSubIDHeader, 0, senderSubIDHeaderLength);
            position += senderSubIDHeaderLength;
            buffer.putBytes(position, senderSubID, senderSubIDOffset, senderSubIDLength);
            position += senderSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (senderLocationIDLength > 0)
        {
            buffer.putBytes(position, senderLocationIDHeader, 0, senderLocationIDHeaderLength);
            position += senderLocationIDHeaderLength;
            buffer.putBytes(position, senderLocationID, senderLocationIDOffset, senderLocationIDLength);
            position += senderLocationIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (targetSubIDLength > 0)
        {
            buffer.putBytes(position, targetSubIDHeader, 0, targetSubIDHeaderLength);
            position += targetSubIDHeaderLength;
            buffer.putBytes(position, targetSubID, targetSubIDOffset, targetSubIDLength);
            position += targetSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (targetLocationIDLength > 0)
        {
            buffer.putBytes(position, targetLocationIDHeader, 0, targetLocationIDHeaderLength);
            position += targetLocationIDHeaderLength;
            buffer.putBytes(position, targetLocationID, targetLocationIDOffset, targetLocationIDLength);
            position += targetLocationIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (onBehalfOfSubIDLength > 0)
        {
            buffer.putBytes(position, onBehalfOfSubIDHeader, 0, onBehalfOfSubIDHeaderLength);
            position += onBehalfOfSubIDHeaderLength;
            buffer.putBytes(position, onBehalfOfSubID, onBehalfOfSubIDOffset, onBehalfOfSubIDLength);
            position += onBehalfOfSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (onBehalfOfLocationIDLength > 0)
        {
            buffer.putBytes(position, onBehalfOfLocationIDHeader, 0, onBehalfOfLocationIDHeaderLength);
            position += onBehalfOfLocationIDHeaderLength;
            buffer.putBytes(position, onBehalfOfLocationID, onBehalfOfLocationIDOffset, onBehalfOfLocationIDLength);
            position += onBehalfOfLocationIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (deliverToSubIDLength > 0)
        {
            buffer.putBytes(position, deliverToSubIDHeader, 0, deliverToSubIDHeaderLength);
            position += deliverToSubIDHeaderLength;
            buffer.putBytes(position, deliverToSubID, deliverToSubIDOffset, deliverToSubIDLength);
            position += deliverToSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (deliverToLocationIDLength > 0)
        {
            buffer.putBytes(position, deliverToLocationIDHeader, 0, deliverToLocationIDHeaderLength);
            position += deliverToLocationIDHeaderLength;
            buffer.putBytes(position, deliverToLocationID, deliverToLocationIDOffset, deliverToLocationIDLength);
            position += deliverToLocationIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPossDupFlag)
        {
            buffer.putBytes(position, possDupFlagHeader, 0, possDupFlagHeaderLength);
            position += possDupFlagHeaderLength;
            position += buffer.putBooleanAscii(position, possDupFlag);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPossResend)
        {
            buffer.putBytes(position, possResendHeader, 0, possResendHeaderLength);
            position += possResendHeaderLength;
            position += buffer.putBooleanAscii(position, possResend);
            buffer.putSeparator(position);
            position++;
        }

        if (sendingTimeLength > 0)
        {
            buffer.putBytes(position, sendingTimeHeader, 0, sendingTimeHeaderLength);
            position += sendingTimeHeaderLength;
            buffer.putBytes(position, sendingTime, sendingTimeOffset, sendingTimeLength);
            position += sendingTimeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SendingTime");
        }

        if (origSendingTimeLength > 0)
        {
            buffer.putBytes(position, origSendingTimeHeader, 0, origSendingTimeHeaderLength);
            position += origSendingTimeHeaderLength;
            buffer.putBytes(position, origSendingTime, origSendingTimeOffset, origSendingTimeLength);
            position += origSendingTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasXmlDataLen)
        {
            buffer.putBytes(position, xmlDataLenHeader, 0, xmlDataLenHeaderLength);
            position += xmlDataLenHeaderLength;
            position += buffer.putIntAscii(position, xmlDataLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasXmlData)
        {
            buffer.putBytes(position, xmlDataHeader, 0, xmlDataHeaderLength);
            position += xmlDataHeaderLength;
            buffer.putBytes(position, xmlData);
            position += xmlData.length;
            buffer.putSeparator(position);
            position++;
        }

        if (messageEncodingLength > 0)
        {
            buffer.putBytes(position, messageEncodingHeader, 0, messageEncodingHeaderLength);
            position += messageEncodingHeaderLength;
            buffer.putBytes(position, messageEncoding, messageEncodingOffset, messageEncodingLength);
            position += messageEncodingLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastMsgSeqNumProcessed)
        {
            buffer.putBytes(position, lastMsgSeqNumProcessedHeader, 0, lastMsgSeqNumProcessedHeaderLength);
            position += lastMsgSeqNumProcessedHeaderLength;
            position += buffer.putIntAscii(position, lastMsgSeqNumProcessed);
            buffer.putSeparator(position);
            position++;
        }

        return Encoder.result(position - start, start);
    }

    public void reset()
    {
        this.resetSenderCompID();
        this.resetTargetCompID();
        this.resetOnBehalfOfCompID();
        this.resetDeliverToCompID();
        this.resetSecureDataLen();
        this.resetSecureData();
        this.resetMsgSeqNum();
        this.resetSenderSubID();
        this.resetSenderLocationID();
        this.resetTargetSubID();
        this.resetTargetLocationID();
        this.resetOnBehalfOfSubID();
        this.resetOnBehalfOfLocationID();
        this.resetDeliverToSubID();
        this.resetDeliverToLocationID();
        this.resetPossDupFlag();
        this.resetPossResend();
        this.resetSendingTime();
        this.resetOrigSendingTime();
        this.resetXmlDataLen();
        this.resetXmlData();
        this.resetMessageEncoding();
        this.resetLastMsgSeqNumProcessed();
        beginStringAsCopy(DEFAULT_BEGIN_STRING, 0, DEFAULT_BEGIN_STRING.length);
    }

    public void resetSenderCompID()
    {
        senderCompIDLength = 0;
        senderCompID.wrap(senderCompIDInternalBuffer);
    }

    public void resetTargetCompID()
    {
        targetCompIDLength = 0;
        targetCompID.wrap(targetCompIDInternalBuffer);
    }

    public void resetOnBehalfOfCompID()
    {
        onBehalfOfCompIDLength = 0;
        onBehalfOfCompID.wrap(onBehalfOfCompIDInternalBuffer);
    }

    public void resetDeliverToCompID()
    {
        deliverToCompIDLength = 0;
        deliverToCompID.wrap(deliverToCompIDInternalBuffer);
    }

    public void resetSecureDataLen()
    {
        hasSecureDataLen = false;
    }

    public void resetSecureData()
    {
        hasSecureData = false;
    }

    public void resetMsgSeqNum()
    {
        hasMsgSeqNum = false;
    }

    public void resetSenderSubID()
    {
        senderSubIDLength = 0;
        senderSubID.wrap(senderSubIDInternalBuffer);
    }

    public void resetSenderLocationID()
    {
        senderLocationIDLength = 0;
        senderLocationID.wrap(senderLocationIDInternalBuffer);
    }

    public void resetTargetSubID()
    {
        targetSubIDLength = 0;
        targetSubID.wrap(targetSubIDInternalBuffer);
    }

    public void resetTargetLocationID()
    {
        targetLocationIDLength = 0;
        targetLocationID.wrap(targetLocationIDInternalBuffer);
    }

    public void resetOnBehalfOfSubID()
    {
        onBehalfOfSubIDLength = 0;
        onBehalfOfSubID.wrap(onBehalfOfSubIDInternalBuffer);
    }

    public void resetOnBehalfOfLocationID()
    {
        onBehalfOfLocationIDLength = 0;
        onBehalfOfLocationID.wrap(onBehalfOfLocationIDInternalBuffer);
    }

    public void resetDeliverToSubID()
    {
        deliverToSubIDLength = 0;
        deliverToSubID.wrap(deliverToSubIDInternalBuffer);
    }

    public void resetDeliverToLocationID()
    {
        deliverToLocationIDLength = 0;
        deliverToLocationID.wrap(deliverToLocationIDInternalBuffer);
    }

    public void resetPossDupFlag()
    {
        hasPossDupFlag = false;
    }

    public void resetPossResend()
    {
        hasPossResend = false;
    }

    public void resetSendingTime()
    {
        sendingTimeLength = 0;
        sendingTime.wrap(sendingTimeInternalBuffer);
    }

    public void resetOrigSendingTime()
    {
        origSendingTimeLength = 0;
        origSendingTime.wrap(origSendingTimeInternalBuffer);
    }

    public void resetXmlDataLen()
    {
        hasXmlDataLen = false;
    }

    public void resetXmlData()
    {
        hasXmlData = false;
    }

    public void resetMessageEncoding()
    {
        messageEncodingLength = 0;
        messageEncoding.wrap(messageEncodingInternalBuffer);
    }

    public void resetLastMsgSeqNumProcessed()
    {
        hasLastMsgSeqNumProcessed = false;
    }

    public String toString()
    {
        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        return appendTo(builder, 1);
    }

    public StringBuilder appendTo(final StringBuilder builder, final int level)
    {
        builder.append("{\n");        indent(builder, level);
        builder.append("\"MessageName\": \"Header\",\n");
        if (hasBeginString())
        {
            indent(builder, level);
            builder.append("\"BeginString\": \"");
            appendBuffer(builder, beginString, beginStringOffset, beginStringLength);
            builder.append("\",\n");
        }


        if (hasMsgType())
        {
            indent(builder, level);
            builder.append("\"MsgType\": \"");
            appendBuffer(builder, msgType, msgTypeOffset, msgTypeLength);
            builder.append("\",\n");
        }

        if (hasSenderCompID())
        {
            indent(builder, level);
            builder.append("\"SenderCompID\": \"");
            appendBuffer(builder, senderCompID, senderCompIDOffset, senderCompIDLength);
            builder.append("\",\n");
        }

        if (hasTargetCompID())
        {
            indent(builder, level);
            builder.append("\"TargetCompID\": \"");
            appendBuffer(builder, targetCompID, targetCompIDOffset, targetCompIDLength);
            builder.append("\",\n");
        }

        if (hasOnBehalfOfCompID())
        {
            indent(builder, level);
            builder.append("\"OnBehalfOfCompID\": \"");
            appendBuffer(builder, onBehalfOfCompID, onBehalfOfCompIDOffset, onBehalfOfCompIDLength);
            builder.append("\",\n");
        }

        if (hasDeliverToCompID())
        {
            indent(builder, level);
            builder.append("\"DeliverToCompID\": \"");
            appendBuffer(builder, deliverToCompID, deliverToCompIDOffset, deliverToCompIDLength);
            builder.append("\",\n");
        }

        if (hasSecureDataLen())
        {
            indent(builder, level);
            builder.append("\"SecureDataLen\": \"");
            builder.append(secureDataLen);
            builder.append("\",\n");
        }

        if (hasSecureData())
        {
            indent(builder, level);
            builder.append("\"SecureData\": \"");
            appendData(builder, secureData, secureDataLen);
            builder.append("\",\n");
        }

        if (hasMsgSeqNum())
        {
            indent(builder, level);
            builder.append("\"MsgSeqNum\": \"");
            builder.append(msgSeqNum);
            builder.append("\",\n");
        }

        if (hasSenderSubID())
        {
            indent(builder, level);
            builder.append("\"SenderSubID\": \"");
            appendBuffer(builder, senderSubID, senderSubIDOffset, senderSubIDLength);
            builder.append("\",\n");
        }

        if (hasSenderLocationID())
        {
            indent(builder, level);
            builder.append("\"SenderLocationID\": \"");
            appendBuffer(builder, senderLocationID, senderLocationIDOffset, senderLocationIDLength);
            builder.append("\",\n");
        }

        if (hasTargetSubID())
        {
            indent(builder, level);
            builder.append("\"TargetSubID\": \"");
            appendBuffer(builder, targetSubID, targetSubIDOffset, targetSubIDLength);
            builder.append("\",\n");
        }

        if (hasTargetLocationID())
        {
            indent(builder, level);
            builder.append("\"TargetLocationID\": \"");
            appendBuffer(builder, targetLocationID, targetLocationIDOffset, targetLocationIDLength);
            builder.append("\",\n");
        }

        if (hasOnBehalfOfSubID())
        {
            indent(builder, level);
            builder.append("\"OnBehalfOfSubID\": \"");
            appendBuffer(builder, onBehalfOfSubID, onBehalfOfSubIDOffset, onBehalfOfSubIDLength);
            builder.append("\",\n");
        }

        if (hasOnBehalfOfLocationID())
        {
            indent(builder, level);
            builder.append("\"OnBehalfOfLocationID\": \"");
            appendBuffer(builder, onBehalfOfLocationID, onBehalfOfLocationIDOffset, onBehalfOfLocationIDLength);
            builder.append("\",\n");
        }

        if (hasDeliverToSubID())
        {
            indent(builder, level);
            builder.append("\"DeliverToSubID\": \"");
            appendBuffer(builder, deliverToSubID, deliverToSubIDOffset, deliverToSubIDLength);
            builder.append("\",\n");
        }

        if (hasDeliverToLocationID())
        {
            indent(builder, level);
            builder.append("\"DeliverToLocationID\": \"");
            appendBuffer(builder, deliverToLocationID, deliverToLocationIDOffset, deliverToLocationIDLength);
            builder.append("\",\n");
        }

        if (hasPossDupFlag())
        {
            indent(builder, level);
            builder.append("\"PossDupFlag\": \"");
            builder.append(possDupFlag);
            builder.append("\",\n");
        }

        if (hasPossResend())
        {
            indent(builder, level);
            builder.append("\"PossResend\": \"");
            builder.append(possResend);
            builder.append("\",\n");
        }

        if (hasSendingTime())
        {
            indent(builder, level);
            builder.append("\"SendingTime\": \"");
            appendBuffer(builder, sendingTime, sendingTimeOffset, sendingTimeLength);
            builder.append("\",\n");
        }

        if (hasOrigSendingTime())
        {
            indent(builder, level);
            builder.append("\"OrigSendingTime\": \"");
            appendBuffer(builder, origSendingTime, origSendingTimeOffset, origSendingTimeLength);
            builder.append("\",\n");
        }

        if (hasXmlDataLen())
        {
            indent(builder, level);
            builder.append("\"XmlDataLen\": \"");
            builder.append(xmlDataLen);
            builder.append("\",\n");
        }

        if (hasXmlData())
        {
            indent(builder, level);
            builder.append("\"XmlData\": \"");
            appendData(builder, xmlData, xmlDataLen);
            builder.append("\",\n");
        }

        if (hasMessageEncoding())
        {
            indent(builder, level);
            builder.append("\"MessageEncoding\": \"");
            appendBuffer(builder, messageEncoding, messageEncodingOffset, messageEncodingLength);
            builder.append("\",\n");
        }

        if (hasLastMsgSeqNumProcessed())
        {
            indent(builder, level);
            builder.append("\"LastMsgSeqNumProcessed\": \"");
            builder.append(lastMsgSeqNumProcessed);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public HeaderEncoder copyTo(final Encoder encoder)
    {
        return copyTo((HeaderEncoder)encoder);
    }

    public HeaderEncoder copyTo(final HeaderEncoder encoder)
    {
        encoder.reset();
        if (hasBeginString())
        {
            encoder.beginStringAsCopy(beginString.byteArray(), 0, beginStringLength);
        }


        if (hasMsgType())
        {
            encoder.msgTypeAsCopy(msgType.byteArray(), 0, msgTypeLength);
        }

        if (hasSenderCompID())
        {
            encoder.senderCompIDAsCopy(senderCompID.byteArray(), 0, senderCompIDLength);
        }

        if (hasTargetCompID())
        {
            encoder.targetCompIDAsCopy(targetCompID.byteArray(), 0, targetCompIDLength);
        }

        if (hasOnBehalfOfCompID())
        {
            encoder.onBehalfOfCompIDAsCopy(onBehalfOfCompID.byteArray(), 0, onBehalfOfCompIDLength);
        }

        if (hasDeliverToCompID())
        {
            encoder.deliverToCompIDAsCopy(deliverToCompID.byteArray(), 0, deliverToCompIDLength);
        }

        if (hasSecureDataLen())
        {
            encoder.secureDataLen(this.secureDataLen());
        }

        if (hasSecureData())
        {
            encoder.secureDataAsCopy(this.secureData(), 0, secureDataLen());
            encoder.secureDataLen(secureDataLen());
        }

        if (hasMsgSeqNum())
        {
            encoder.msgSeqNum(this.msgSeqNum());
        }

        if (hasSenderSubID())
        {
            encoder.senderSubIDAsCopy(senderSubID.byteArray(), 0, senderSubIDLength);
        }

        if (hasSenderLocationID())
        {
            encoder.senderLocationIDAsCopy(senderLocationID.byteArray(), 0, senderLocationIDLength);
        }

        if (hasTargetSubID())
        {
            encoder.targetSubIDAsCopy(targetSubID.byteArray(), 0, targetSubIDLength);
        }

        if (hasTargetLocationID())
        {
            encoder.targetLocationIDAsCopy(targetLocationID.byteArray(), 0, targetLocationIDLength);
        }

        if (hasOnBehalfOfSubID())
        {
            encoder.onBehalfOfSubIDAsCopy(onBehalfOfSubID.byteArray(), 0, onBehalfOfSubIDLength);
        }

        if (hasOnBehalfOfLocationID())
        {
            encoder.onBehalfOfLocationIDAsCopy(onBehalfOfLocationID.byteArray(), 0, onBehalfOfLocationIDLength);
        }

        if (hasDeliverToSubID())
        {
            encoder.deliverToSubIDAsCopy(deliverToSubID.byteArray(), 0, deliverToSubIDLength);
        }

        if (hasDeliverToLocationID())
        {
            encoder.deliverToLocationIDAsCopy(deliverToLocationID.byteArray(), 0, deliverToLocationIDLength);
        }

        if (hasPossDupFlag())
        {
            encoder.possDupFlag(this.possDupFlag());
        }

        if (hasPossResend())
        {
            encoder.possResend(this.possResend());
        }

        if (hasSendingTime())
        {
            encoder.sendingTimeAsCopy(sendingTime.byteArray(), 0, sendingTimeLength);
        }

        if (hasOrigSendingTime())
        {
            encoder.origSendingTimeAsCopy(origSendingTime.byteArray(), 0, origSendingTimeLength);
        }

        if (hasXmlDataLen())
        {
            encoder.xmlDataLen(this.xmlDataLen());
        }

        if (hasXmlData())
        {
            encoder.xmlDataAsCopy(this.xmlData(), 0, xmlDataLen());
            encoder.xmlDataLen(xmlDataLen());
        }

        if (hasMessageEncoding())
        {
            encoder.messageEncodingAsCopy(messageEncoding.byteArray(), 0, messageEncodingLength);
        }

        if (hasLastMsgSeqNumProcessed())
        {
            encoder.lastMsgSeqNumProcessed(this.lastMsgSeqNumProcessed());
        }
        return encoder;
    }

}
