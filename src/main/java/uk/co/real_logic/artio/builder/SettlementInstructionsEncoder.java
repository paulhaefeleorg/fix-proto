/* Generated Fix Gateway message codec */
package uk.co.real_logic.artio.builder;

import uk.co.real_logic.artio.dictionary.Generated;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.HeaderEncoder;
import uk.co.real_logic.artio.builder.TrailerEncoder;
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
public class SettlementInstructionsEncoder implements Encoder
{
    public long messageType()
    {
        return 84L;
    }

    public SettlementInstructionsEncoder()
    {
        header.msgType("T");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int settlInstMsgIDHeaderLength = 4;
    private static final byte[] settlInstMsgIDHeader = new byte[] {55, 55, 55, (byte) '='};

    private static final int settlInstReqIDHeaderLength = 4;
    private static final byte[] settlInstReqIDHeader = new byte[] {55, 57, 49, (byte) '='};

    private static final int settlInstModeHeaderLength = 4;
    private static final byte[] settlInstModeHeader = new byte[] {49, 54, 48, (byte) '='};

    private static final int settlInstReqRejCodeHeaderLength = 4;
    private static final byte[] settlInstReqRejCodeHeader = new byte[] {55, 57, 50, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int noSettlInstGroupCounterHeaderLength = 4;
    private static final byte[] noSettlInstGroupCounterHeader = new byte[] {55, 55, 56, (byte) '='};

    private final MutableDirectBuffer settlInstMsgID = new UnsafeBuffer();
    private byte[] settlInstMsgIDInternalBuffer = settlInstMsgID.byteArray();
    private int settlInstMsgIDOffset = 0;
    private int settlInstMsgIDLength = 0;

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstMsgID.wrap(value);
        settlInstMsgIDOffset = offset;
        settlInstMsgIDLength = length;
        return this;
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final DirectBuffer value, final int length)
    {
        return settlInstMsgID(value, 0, length);
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final DirectBuffer value)
    {
        return settlInstMsgID(value, 0, value.capacity());
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final byte[] value, final int offset, final int length)
    {
        settlInstMsgID.wrap(value);
        settlInstMsgIDOffset = offset;
        settlInstMsgIDLength = length;
        return this;
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlInstMsgID, value, offset, length))
        {
            settlInstMsgIDInternalBuffer = settlInstMsgID.byteArray();
        }
        settlInstMsgIDOffset = 0;
        settlInstMsgIDLength = length;
        return this;
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final byte[] value, final int length)
    {
        return settlInstMsgID(value, 0, length);
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final byte[] value)
    {
        return settlInstMsgID(value, 0, value.length);
    }

    /* SettlInstMsgID = 777 */
    public boolean hasSettlInstMsgID()
    {
        return settlInstMsgIDLength > 0;
    }

    /* SettlInstMsgID = 777 */
    public MutableDirectBuffer settlInstMsgID()
    {
        return settlInstMsgID;
    }

    /* SettlInstMsgID = 777 */
    public String settlInstMsgIDAsString()
    {
        return settlInstMsgID.getStringWithoutLengthAscii(settlInstMsgIDOffset, settlInstMsgIDLength);
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final CharSequence value)
    {
        if (toBytes(value, settlInstMsgID))
        {
            settlInstMsgIDInternalBuffer = settlInstMsgID.byteArray();
        }
        settlInstMsgIDOffset = 0;
        settlInstMsgIDLength = value.length();
        return this;
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstMsgID.wrap(buffer);
            settlInstMsgIDOffset = value.offset();
            settlInstMsgIDLength = value.length();
        }
        return this;
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final char[] value)
    {
        return settlInstMsgID(value, 0, value.length);
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final char[] value, final int length)
    {
        return settlInstMsgID(value, 0, length);
    }

    /* SettlInstMsgID = 777 */
    public SettlementInstructionsEncoder settlInstMsgID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlInstMsgID, offset, length))
        {
            settlInstMsgIDInternalBuffer = settlInstMsgID.byteArray();
        }
        settlInstMsgIDOffset = 0;
        settlInstMsgIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlInstReqID = new UnsafeBuffer();
    private byte[] settlInstReqIDInternalBuffer = settlInstReqID.byteArray();
    private int settlInstReqIDOffset = 0;
    private int settlInstReqIDLength = 0;

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstReqID.wrap(value);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final DirectBuffer value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final DirectBuffer value)
    {
        return settlInstReqID(value, 0, value.capacity());
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final byte[] value, final int offset, final int length)
    {
        settlInstReqID.wrap(value);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlInstReqID, value, offset, length))
        {
            settlInstReqIDInternalBuffer = settlInstReqID.byteArray();
        }
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = length;
        return this;
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final byte[] value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final byte[] value)
    {
        return settlInstReqID(value, 0, value.length);
    }

    /* SettlInstReqID = 791 */
    public boolean hasSettlInstReqID()
    {
        return settlInstReqIDLength > 0;
    }

    /* SettlInstReqID = 791 */
    public MutableDirectBuffer settlInstReqID()
    {
        return settlInstReqID;
    }

    /* SettlInstReqID = 791 */
    public String settlInstReqIDAsString()
    {
        return settlInstReqID.getStringWithoutLengthAscii(settlInstReqIDOffset, settlInstReqIDLength);
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final CharSequence value)
    {
        if (toBytes(value, settlInstReqID))
        {
            settlInstReqIDInternalBuffer = settlInstReqID.byteArray();
        }
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = value.length();
        return this;
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstReqID.wrap(buffer);
            settlInstReqIDOffset = value.offset();
            settlInstReqIDLength = value.length();
        }
        return this;
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final char[] value)
    {
        return settlInstReqID(value, 0, value.length);
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final char[] value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    /* SettlInstReqID = 791 */
    public SettlementInstructionsEncoder settlInstReqID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlInstReqID, offset, length))
        {
            settlInstReqIDInternalBuffer = settlInstReqID.byteArray();
        }
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = length;
        return this;
    }

    private char settlInstMode;

    private boolean hasSettlInstMode;

    public boolean hasSettlInstMode()
    {
        return hasSettlInstMode;
    }

    /* SettlInstMode = 160 */
    public SettlementInstructionsEncoder settlInstMode(char value)
    {
        settlInstMode = value;
        hasSettlInstMode = true;
        return this;
    }

    /* SettlInstMode = 160 */
    public char settlInstMode()
    {
        return settlInstMode;
    }

    public SettlementInstructionsEncoder settlInstMode(SettlInstMode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstMode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstMode Value: " + value );
            }
            if (value == SettlInstMode.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstMode(value.representation());
    }

    private int settlInstReqRejCode;

    private boolean hasSettlInstReqRejCode;

    public boolean hasSettlInstReqRejCode()
    {
        return hasSettlInstReqRejCode;
    }

    /* SettlInstReqRejCode = 792 */
    public SettlementInstructionsEncoder settlInstReqRejCode(int value)
    {
        settlInstReqRejCode = value;
        hasSettlInstReqRejCode = true;
        return this;
    }

    /* SettlInstReqRejCode = 792 */
    public int settlInstReqRejCode()
    {
        return settlInstReqRejCode;
    }

    public SettlementInstructionsEncoder settlInstReqRejCode(SettlInstReqRejCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstReqRejCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstReqRejCode Value: " + value );
            }
            if (value == SettlInstReqRejCode.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstReqRejCode(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(text, value, offset, length))
        {
            textInternalBuffer = text.byteArray();
        }
        textOffset = 0;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public boolean hasText()
    {
        return textLength > 0;
    }

    /* Text = 58 */
    public MutableDirectBuffer text()
    {
        return text;
    }

    /* Text = 58 */
    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final CharSequence value)
    {
        if (toBytes(value, text))
        {
            textInternalBuffer = text.byteArray();
        }
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SettlementInstructionsEncoder text(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, text, offset, length))
        {
            textInternalBuffer = text.byteArray();
        }
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    /* EncodedTextLen = 354 */
    public SettlementInstructionsEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    /* EncodedTextLen = 354 */
    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    /* EncodedText = 355 */
    public SettlementInstructionsEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    /* EncodedText = 355 */
    public byte[] encodedText()
    {
        return encodedText;
    }

    /* EncodedText = 355 */
    public SettlementInstructionsEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();
    private byte[] clOrdIDInternalBuffer = clOrdID.byteArray();
    private int clOrdIDOffset = 0;
    private int clOrdIDLength = 0;

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(clOrdID, value, offset, length))
        {
            clOrdIDInternalBuffer = clOrdID.byteArray();
        }
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final byte[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    /* ClOrdID = 11 */
    public boolean hasClOrdID()
    {
        return clOrdIDLength > 0;
    }

    /* ClOrdID = 11 */
    public MutableDirectBuffer clOrdID()
    {
        return clOrdID;
    }

    /* ClOrdID = 11 */
    public String clOrdIDAsString()
    {
        return clOrdID.getStringWithoutLengthAscii(clOrdIDOffset, clOrdIDLength);
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final CharSequence value)
    {
        if (toBytes(value, clOrdID))
        {
            clOrdIDInternalBuffer = clOrdID.byteArray();
        }
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdID.wrap(buffer);
            clOrdIDOffset = value.offset();
            clOrdIDLength = value.length();
        }
        return this;
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public SettlementInstructionsEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, clOrdID, offset, length))
        {
            clOrdIDInternalBuffer = clOrdID.byteArray();
        }
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();
    private byte[] transactTimeInternalBuffer = transactTime.byteArray();
    private int transactTimeOffset = 0;
    private int transactTimeLength = 0;

    /* TransactTime = 60 */
    public SettlementInstructionsEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public SettlementInstructionsEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public SettlementInstructionsEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public SettlementInstructionsEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public SettlementInstructionsEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(transactTime, value, offset, length))
        {
            transactTimeInternalBuffer = transactTime.byteArray();
        }
        transactTimeOffset = 0;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public SettlementInstructionsEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public SettlementInstructionsEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    /* TransactTime = 60 */
    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    /* TransactTime = 60 */
    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    /* TransactTime = 60 */
    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }


@Generated("uk.co.real_logic.artio")
public static class SettlInstGroupEncoder
{
    private SettlInstGroupEncoder next = null;

    public SettlInstGroupEncoder next()
    {
        if (next == null)
        {
            next = new SettlInstGroupEncoder();
        }
        return next;
    }

    private static final int settlInstIDHeaderLength = 4;
    private static final byte[] settlInstIDHeader = new byte[] {49, 54, 50, (byte) '='};

    private static final int settlInstTransTypeHeaderLength = 4;
    private static final byte[] settlInstTransTypeHeader = new byte[] {49, 54, 51, (byte) '='};

    private static final int settlInstRefIDHeaderLength = 4;
    private static final byte[] settlInstRefIDHeader = new byte[] {50, 49, 52, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

    private static final int securityTypeHeaderLength = 4;
    private static final byte[] securityTypeHeader = new byte[] {49, 54, 55, (byte) '='};

    private static final int cFICodeHeaderLength = 4;
    private static final byte[] cFICodeHeader = new byte[] {52, 54, 49, (byte) '='};

    private static final int effectiveTimeHeaderLength = 4;
    private static final byte[] effectiveTimeHeader = new byte[] {49, 54, 56, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int lastUpdateTimeHeaderLength = 4;
    private static final byte[] lastUpdateTimeHeader = new byte[] {55, 55, 57, (byte) '='};

    private static final int paymentMethodHeaderLength = 4;
    private static final byte[] paymentMethodHeader = new byte[] {52, 57, 50, (byte) '='};

    private static final int paymentRefHeaderLength = 4;
    private static final byte[] paymentRefHeader = new byte[] {52, 55, 54, (byte) '='};

    private static final int cardHolderNameHeaderLength = 4;
    private static final byte[] cardHolderNameHeader = new byte[] {52, 56, 56, (byte) '='};

    private static final int cardNumberHeaderLength = 4;
    private static final byte[] cardNumberHeader = new byte[] {52, 56, 57, (byte) '='};

    private static final int cardStartDateHeaderLength = 4;
    private static final byte[] cardStartDateHeader = new byte[] {53, 48, 51, (byte) '='};

    private static final int cardExpDateHeaderLength = 4;
    private static final byte[] cardExpDateHeader = new byte[] {52, 57, 48, (byte) '='};

    private static final int cardIssNumHeaderLength = 4;
    private static final byte[] cardIssNumHeader = new byte[] {52, 57, 49, (byte) '='};

    private static final int paymentDateHeaderLength = 4;
    private static final byte[] paymentDateHeader = new byte[] {53, 48, 52, (byte) '='};

    private static final int paymentRemitterIDHeaderLength = 4;
    private static final byte[] paymentRemitterIDHeader = new byte[] {53, 48, 53, (byte) '='};

    private final MutableDirectBuffer settlInstID = new UnsafeBuffer();
    private byte[] settlInstIDInternalBuffer = settlInstID.byteArray();
    private int settlInstIDOffset = 0;
    private int settlInstIDLength = 0;

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstID.wrap(value);
        settlInstIDOffset = offset;
        settlInstIDLength = length;
        return this;
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final DirectBuffer value, final int length)
    {
        return settlInstID(value, 0, length);
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final DirectBuffer value)
    {
        return settlInstID(value, 0, value.capacity());
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final byte[] value, final int offset, final int length)
    {
        settlInstID.wrap(value);
        settlInstIDOffset = offset;
        settlInstIDLength = length;
        return this;
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlInstID, value, offset, length))
        {
            settlInstIDInternalBuffer = settlInstID.byteArray();
        }
        settlInstIDOffset = 0;
        settlInstIDLength = length;
        return this;
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final byte[] value, final int length)
    {
        return settlInstID(value, 0, length);
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final byte[] value)
    {
        return settlInstID(value, 0, value.length);
    }

    /* SettlInstID = 162 */
    public boolean hasSettlInstID()
    {
        return settlInstIDLength > 0;
    }

    /* SettlInstID = 162 */
    public MutableDirectBuffer settlInstID()
    {
        return settlInstID;
    }

    /* SettlInstID = 162 */
    public String settlInstIDAsString()
    {
        return settlInstID.getStringWithoutLengthAscii(settlInstIDOffset, settlInstIDLength);
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final CharSequence value)
    {
        if (toBytes(value, settlInstID))
        {
            settlInstIDInternalBuffer = settlInstID.byteArray();
        }
        settlInstIDOffset = 0;
        settlInstIDLength = value.length();
        return this;
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstID.wrap(buffer);
            settlInstIDOffset = value.offset();
            settlInstIDLength = value.length();
        }
        return this;
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final char[] value)
    {
        return settlInstID(value, 0, value.length);
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final char[] value, final int length)
    {
        return settlInstID(value, 0, length);
    }

    /* SettlInstID = 162 */
    public SettlInstGroupEncoder settlInstID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlInstID, offset, length))
        {
            settlInstIDInternalBuffer = settlInstID.byteArray();
        }
        settlInstIDOffset = 0;
        settlInstIDLength = length;
        return this;
    }

    private char settlInstTransType;

    private boolean hasSettlInstTransType;

    public boolean hasSettlInstTransType()
    {
        return hasSettlInstTransType;
    }

    /* SettlInstTransType = 163 */
    public SettlInstGroupEncoder settlInstTransType(char value)
    {
        settlInstTransType = value;
        hasSettlInstTransType = true;
        return this;
    }

    /* SettlInstTransType = 163 */
    public char settlInstTransType()
    {
        return settlInstTransType;
    }

    public SettlInstGroupEncoder settlInstTransType(SettlInstTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstTransType Value: " + value );
            }
            if (value == SettlInstTransType.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstTransType(value.representation());
    }

    private final MutableDirectBuffer settlInstRefID = new UnsafeBuffer();
    private byte[] settlInstRefIDInternalBuffer = settlInstRefID.byteArray();
    private int settlInstRefIDOffset = 0;
    private int settlInstRefIDLength = 0;

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstRefID.wrap(value);
        settlInstRefIDOffset = offset;
        settlInstRefIDLength = length;
        return this;
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final DirectBuffer value, final int length)
    {
        return settlInstRefID(value, 0, length);
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final DirectBuffer value)
    {
        return settlInstRefID(value, 0, value.capacity());
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final byte[] value, final int offset, final int length)
    {
        settlInstRefID.wrap(value);
        settlInstRefIDOffset = offset;
        settlInstRefIDLength = length;
        return this;
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlInstRefID, value, offset, length))
        {
            settlInstRefIDInternalBuffer = settlInstRefID.byteArray();
        }
        settlInstRefIDOffset = 0;
        settlInstRefIDLength = length;
        return this;
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final byte[] value, final int length)
    {
        return settlInstRefID(value, 0, length);
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final byte[] value)
    {
        return settlInstRefID(value, 0, value.length);
    }

    /* SettlInstRefID = 214 */
    public boolean hasSettlInstRefID()
    {
        return settlInstRefIDLength > 0;
    }

    /* SettlInstRefID = 214 */
    public MutableDirectBuffer settlInstRefID()
    {
        return settlInstRefID;
    }

    /* SettlInstRefID = 214 */
    public String settlInstRefIDAsString()
    {
        return settlInstRefID.getStringWithoutLengthAscii(settlInstRefIDOffset, settlInstRefIDLength);
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final CharSequence value)
    {
        if (toBytes(value, settlInstRefID))
        {
            settlInstRefIDInternalBuffer = settlInstRefID.byteArray();
        }
        settlInstRefIDOffset = 0;
        settlInstRefIDLength = value.length();
        return this;
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstRefID.wrap(buffer);
            settlInstRefIDOffset = value.offset();
            settlInstRefIDLength = value.length();
        }
        return this;
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final char[] value)
    {
        return settlInstRefID(value, 0, value.length);
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final char[] value, final int length)
    {
        return settlInstRefID(value, 0, length);
    }

    /* SettlInstRefID = 214 */
    public SettlInstGroupEncoder settlInstRefID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlInstRefID, offset, length))
        {
            settlInstRefIDInternalBuffer = settlInstRefID.byteArray();
        }
        settlInstRefIDOffset = 0;
        settlInstRefIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    /* Side = 54 */
    public SettlInstGroupEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    /* Side = 54 */
    public char side()
    {
        return side;
    }

    public SettlInstGroupEncoder side(Side value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Side.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: side Value: " + value );
            }
            if (value == Side.NULL_VAL)
            {
                return this;
            }
        }
        return side(value.representation());
    }

    private int product;

    private boolean hasProduct;

    public boolean hasProduct()
    {
        return hasProduct;
    }

    /* Product = 460 */
    public SettlInstGroupEncoder product(int value)
    {
        product = value;
        hasProduct = true;
        return this;
    }

    /* Product = 460 */
    public int product()
    {
        return product;
    }

    public SettlInstGroupEncoder product(Product value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Product.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: product Value: " + value );
            }
            if (value == Product.NULL_VAL)
            {
                return this;
            }
        }
        return product(value.representation());
    }

    private final MutableDirectBuffer securityType = new UnsafeBuffer();
    private byte[] securityTypeInternalBuffer = securityType.byteArray();
    private int securityTypeOffset = 0;
    private int securityTypeLength = 0;

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(securityType, value, offset, length))
        {
            securityTypeInternalBuffer = securityType.byteArray();
        }
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final byte[] value)
    {
        return securityType(value, 0, value.length);
    }

    /* SecurityType = 167 */
    public boolean hasSecurityType()
    {
        return securityTypeLength > 0;
    }

    /* SecurityType = 167 */
    public MutableDirectBuffer securityType()
    {
        return securityType;
    }

    /* SecurityType = 167 */
    public String securityTypeAsString()
    {
        return securityType.getStringWithoutLengthAscii(securityTypeOffset, securityTypeLength);
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final CharSequence value)
    {
        if (toBytes(value, securityType))
        {
            securityTypeInternalBuffer = securityType.byteArray();
        }
        securityTypeOffset = 0;
        securityTypeLength = value.length();
        return this;
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityType.wrap(buffer);
            securityTypeOffset = value.offset();
            securityTypeLength = value.length();
        }
        return this;
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public SettlInstGroupEncoder securityType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, securityType, offset, length))
        {
            securityTypeInternalBuffer = securityType.byteArray();
        }
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public SettlInstGroupEncoder securityType(SecurityType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityType Value: " + value );
            }
            if (value == SecurityType.NULL_VAL)
            {
                return this;
            }
        }
        return securityType(value.representation());
    }

    private final MutableDirectBuffer cFICode = new UnsafeBuffer();
    private byte[] cFICodeInternalBuffer = cFICode.byteArray();
    private int cFICodeOffset = 0;
    private int cFICodeLength = 0;

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final DirectBuffer value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final DirectBuffer value, final int length)
    {
        return cFICode(value, 0, length);
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final DirectBuffer value)
    {
        return cFICode(value, 0, value.capacity());
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final byte[] value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(cFICode, value, offset, length))
        {
            cFICodeInternalBuffer = cFICode.byteArray();
        }
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final byte[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final byte[] value)
    {
        return cFICode(value, 0, value.length);
    }

    /* CFICode = 461 */
    public boolean hasCFICode()
    {
        return cFICodeLength > 0;
    }

    /* CFICode = 461 */
    public MutableDirectBuffer cFICode()
    {
        return cFICode;
    }

    /* CFICode = 461 */
    public String cFICodeAsString()
    {
        return cFICode.getStringWithoutLengthAscii(cFICodeOffset, cFICodeLength);
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final CharSequence value)
    {
        if (toBytes(value, cFICode))
        {
            cFICodeInternalBuffer = cFICode.byteArray();
        }
        cFICodeOffset = 0;
        cFICodeLength = value.length();
        return this;
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cFICode.wrap(buffer);
            cFICodeOffset = value.offset();
            cFICodeLength = value.length();
        }
        return this;
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final char[] value)
    {
        return cFICode(value, 0, value.length);
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final char[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    /* CFICode = 461 */
    public SettlInstGroupEncoder cFICode(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, cFICode, offset, length))
        {
            cFICodeInternalBuffer = cFICode.byteArray();
        }
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer effectiveTime = new UnsafeBuffer();
    private byte[] effectiveTimeInternalBuffer = effectiveTime.byteArray();
    private int effectiveTimeOffset = 0;
    private int effectiveTimeLength = 0;

    /* EffectiveTime = 168 */
    public SettlInstGroupEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    /* EffectiveTime = 168 */
    public SettlInstGroupEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    /* EffectiveTime = 168 */
    public SettlInstGroupEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    /* EffectiveTime = 168 */
    public SettlInstGroupEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    /* EffectiveTime = 168 */
    public SettlInstGroupEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(effectiveTime, value, offset, length))
        {
            effectiveTimeInternalBuffer = effectiveTime.byteArray();
        }
        effectiveTimeOffset = 0;
        effectiveTimeLength = length;
        return this;
    }

    /* EffectiveTime = 168 */
    public SettlInstGroupEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    /* EffectiveTime = 168 */
    public SettlInstGroupEncoder effectiveTime(final byte[] value)
    {
        return effectiveTime(value, 0, value.length);
    }

    /* EffectiveTime = 168 */
    public boolean hasEffectiveTime()
    {
        return effectiveTimeLength > 0;
    }

    /* EffectiveTime = 168 */
    public MutableDirectBuffer effectiveTime()
    {
        return effectiveTime;
    }

    /* EffectiveTime = 168 */
    public String effectiveTimeAsString()
    {
        return effectiveTime.getStringWithoutLengthAscii(effectiveTimeOffset, effectiveTimeLength);
    }

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();
    private byte[] expireTimeInternalBuffer = expireTime.byteArray();
    private int expireTimeOffset = 0;
    private int expireTimeLength = 0;

    /* ExpireTime = 126 */
    public SettlInstGroupEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    /* ExpireTime = 126 */
    public SettlInstGroupEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    /* ExpireTime = 126 */
    public SettlInstGroupEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    /* ExpireTime = 126 */
    public SettlInstGroupEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    /* ExpireTime = 126 */
    public SettlInstGroupEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(expireTime, value, offset, length))
        {
            expireTimeInternalBuffer = expireTime.byteArray();
        }
        expireTimeOffset = 0;
        expireTimeLength = length;
        return this;
    }

    /* ExpireTime = 126 */
    public SettlInstGroupEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    /* ExpireTime = 126 */
    public SettlInstGroupEncoder expireTime(final byte[] value)
    {
        return expireTime(value, 0, value.length);
    }

    /* ExpireTime = 126 */
    public boolean hasExpireTime()
    {
        return expireTimeLength > 0;
    }

    /* ExpireTime = 126 */
    public MutableDirectBuffer expireTime()
    {
        return expireTime;
    }

    /* ExpireTime = 126 */
    public String expireTimeAsString()
    {
        return expireTime.getStringWithoutLengthAscii(expireTimeOffset, expireTimeLength);
    }

    private final MutableDirectBuffer lastUpdateTime = new UnsafeBuffer();
    private byte[] lastUpdateTimeInternalBuffer = lastUpdateTime.byteArray();
    private int lastUpdateTimeOffset = 0;
    private int lastUpdateTimeLength = 0;

    /* LastUpdateTime = 779 */
    public SettlInstGroupEncoder lastUpdateTime(final DirectBuffer value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    /* LastUpdateTime = 779 */
    public SettlInstGroupEncoder lastUpdateTime(final DirectBuffer value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    /* LastUpdateTime = 779 */
    public SettlInstGroupEncoder lastUpdateTime(final DirectBuffer value)
    {
        return lastUpdateTime(value, 0, value.capacity());
    }

    /* LastUpdateTime = 779 */
    public SettlInstGroupEncoder lastUpdateTime(final byte[] value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    /* LastUpdateTime = 779 */
    public SettlInstGroupEncoder lastUpdateTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(lastUpdateTime, value, offset, length))
        {
            lastUpdateTimeInternalBuffer = lastUpdateTime.byteArray();
        }
        lastUpdateTimeOffset = 0;
        lastUpdateTimeLength = length;
        return this;
    }

    /* LastUpdateTime = 779 */
    public SettlInstGroupEncoder lastUpdateTime(final byte[] value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    /* LastUpdateTime = 779 */
    public SettlInstGroupEncoder lastUpdateTime(final byte[] value)
    {
        return lastUpdateTime(value, 0, value.length);
    }

    /* LastUpdateTime = 779 */
    public boolean hasLastUpdateTime()
    {
        return lastUpdateTimeLength > 0;
    }

    /* LastUpdateTime = 779 */
    public MutableDirectBuffer lastUpdateTime()
    {
        return lastUpdateTime;
    }

    /* LastUpdateTime = 779 */
    public String lastUpdateTimeAsString()
    {
        return lastUpdateTime.getStringWithoutLengthAscii(lastUpdateTimeOffset, lastUpdateTimeLength);
    }

    private final SettlInstructionsDataEncoder settlInstructionsData = new SettlInstructionsDataEncoder();
    public SettlInstructionsDataEncoder settlInstructionsData()
    {
        return settlInstructionsData;
    }

    private int paymentMethod;

    private boolean hasPaymentMethod;

    public boolean hasPaymentMethod()
    {
        return hasPaymentMethod;
    }

    /* PaymentMethod = 492 */
    public SettlInstGroupEncoder paymentMethod(int value)
    {
        paymentMethod = value;
        hasPaymentMethod = true;
        return this;
    }

    /* PaymentMethod = 492 */
    public int paymentMethod()
    {
        return paymentMethod;
    }

    public SettlInstGroupEncoder paymentMethod(PaymentMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PaymentMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: paymentMethod Value: " + value );
            }
            if (value == PaymentMethod.NULL_VAL)
            {
                return this;
            }
        }
        return paymentMethod(value.representation());
    }

    private final MutableDirectBuffer paymentRef = new UnsafeBuffer();
    private byte[] paymentRefInternalBuffer = paymentRef.byteArray();
    private int paymentRefOffset = 0;
    private int paymentRefLength = 0;

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final DirectBuffer value, final int offset, final int length)
    {
        paymentRef.wrap(value);
        paymentRefOffset = offset;
        paymentRefLength = length;
        return this;
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final DirectBuffer value, final int length)
    {
        return paymentRef(value, 0, length);
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final DirectBuffer value)
    {
        return paymentRef(value, 0, value.capacity());
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final byte[] value, final int offset, final int length)
    {
        paymentRef.wrap(value);
        paymentRefOffset = offset;
        paymentRefLength = length;
        return this;
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRefAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(paymentRef, value, offset, length))
        {
            paymentRefInternalBuffer = paymentRef.byteArray();
        }
        paymentRefOffset = 0;
        paymentRefLength = length;
        return this;
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final byte[] value, final int length)
    {
        return paymentRef(value, 0, length);
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final byte[] value)
    {
        return paymentRef(value, 0, value.length);
    }

    /* PaymentRef = 476 */
    public boolean hasPaymentRef()
    {
        return paymentRefLength > 0;
    }

    /* PaymentRef = 476 */
    public MutableDirectBuffer paymentRef()
    {
        return paymentRef;
    }

    /* PaymentRef = 476 */
    public String paymentRefAsString()
    {
        return paymentRef.getStringWithoutLengthAscii(paymentRefOffset, paymentRefLength);
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final CharSequence value)
    {
        if (toBytes(value, paymentRef))
        {
            paymentRefInternalBuffer = paymentRef.byteArray();
        }
        paymentRefOffset = 0;
        paymentRefLength = value.length();
        return this;
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            paymentRef.wrap(buffer);
            paymentRefOffset = value.offset();
            paymentRefLength = value.length();
        }
        return this;
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final char[] value)
    {
        return paymentRef(value, 0, value.length);
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final char[] value, final int length)
    {
        return paymentRef(value, 0, length);
    }

    /* PaymentRef = 476 */
    public SettlInstGroupEncoder paymentRef(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, paymentRef, offset, length))
        {
            paymentRefInternalBuffer = paymentRef.byteArray();
        }
        paymentRefOffset = 0;
        paymentRefLength = length;
        return this;
    }

    private final MutableDirectBuffer cardHolderName = new UnsafeBuffer();
    private byte[] cardHolderNameInternalBuffer = cardHolderName.byteArray();
    private int cardHolderNameOffset = 0;
    private int cardHolderNameLength = 0;

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final DirectBuffer value, final int offset, final int length)
    {
        cardHolderName.wrap(value);
        cardHolderNameOffset = offset;
        cardHolderNameLength = length;
        return this;
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final DirectBuffer value, final int length)
    {
        return cardHolderName(value, 0, length);
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final DirectBuffer value)
    {
        return cardHolderName(value, 0, value.capacity());
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final byte[] value, final int offset, final int length)
    {
        cardHolderName.wrap(value);
        cardHolderNameOffset = offset;
        cardHolderNameLength = length;
        return this;
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderNameAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(cardHolderName, value, offset, length))
        {
            cardHolderNameInternalBuffer = cardHolderName.byteArray();
        }
        cardHolderNameOffset = 0;
        cardHolderNameLength = length;
        return this;
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final byte[] value, final int length)
    {
        return cardHolderName(value, 0, length);
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final byte[] value)
    {
        return cardHolderName(value, 0, value.length);
    }

    /* CardHolderName = 488 */
    public boolean hasCardHolderName()
    {
        return cardHolderNameLength > 0;
    }

    /* CardHolderName = 488 */
    public MutableDirectBuffer cardHolderName()
    {
        return cardHolderName;
    }

    /* CardHolderName = 488 */
    public String cardHolderNameAsString()
    {
        return cardHolderName.getStringWithoutLengthAscii(cardHolderNameOffset, cardHolderNameLength);
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final CharSequence value)
    {
        if (toBytes(value, cardHolderName))
        {
            cardHolderNameInternalBuffer = cardHolderName.byteArray();
        }
        cardHolderNameOffset = 0;
        cardHolderNameLength = value.length();
        return this;
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cardHolderName.wrap(buffer);
            cardHolderNameOffset = value.offset();
            cardHolderNameLength = value.length();
        }
        return this;
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final char[] value)
    {
        return cardHolderName(value, 0, value.length);
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final char[] value, final int length)
    {
        return cardHolderName(value, 0, length);
    }

    /* CardHolderName = 488 */
    public SettlInstGroupEncoder cardHolderName(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, cardHolderName, offset, length))
        {
            cardHolderNameInternalBuffer = cardHolderName.byteArray();
        }
        cardHolderNameOffset = 0;
        cardHolderNameLength = length;
        return this;
    }

    private final MutableDirectBuffer cardNumber = new UnsafeBuffer();
    private byte[] cardNumberInternalBuffer = cardNumber.byteArray();
    private int cardNumberOffset = 0;
    private int cardNumberLength = 0;

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final DirectBuffer value, final int offset, final int length)
    {
        cardNumber.wrap(value);
        cardNumberOffset = offset;
        cardNumberLength = length;
        return this;
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final DirectBuffer value, final int length)
    {
        return cardNumber(value, 0, length);
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final DirectBuffer value)
    {
        return cardNumber(value, 0, value.capacity());
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final byte[] value, final int offset, final int length)
    {
        cardNumber.wrap(value);
        cardNumberOffset = offset;
        cardNumberLength = length;
        return this;
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumberAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(cardNumber, value, offset, length))
        {
            cardNumberInternalBuffer = cardNumber.byteArray();
        }
        cardNumberOffset = 0;
        cardNumberLength = length;
        return this;
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final byte[] value, final int length)
    {
        return cardNumber(value, 0, length);
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final byte[] value)
    {
        return cardNumber(value, 0, value.length);
    }

    /* CardNumber = 489 */
    public boolean hasCardNumber()
    {
        return cardNumberLength > 0;
    }

    /* CardNumber = 489 */
    public MutableDirectBuffer cardNumber()
    {
        return cardNumber;
    }

    /* CardNumber = 489 */
    public String cardNumberAsString()
    {
        return cardNumber.getStringWithoutLengthAscii(cardNumberOffset, cardNumberLength);
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final CharSequence value)
    {
        if (toBytes(value, cardNumber))
        {
            cardNumberInternalBuffer = cardNumber.byteArray();
        }
        cardNumberOffset = 0;
        cardNumberLength = value.length();
        return this;
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cardNumber.wrap(buffer);
            cardNumberOffset = value.offset();
            cardNumberLength = value.length();
        }
        return this;
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final char[] value)
    {
        return cardNumber(value, 0, value.length);
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final char[] value, final int length)
    {
        return cardNumber(value, 0, length);
    }

    /* CardNumber = 489 */
    public SettlInstGroupEncoder cardNumber(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, cardNumber, offset, length))
        {
            cardNumberInternalBuffer = cardNumber.byteArray();
        }
        cardNumberOffset = 0;
        cardNumberLength = length;
        return this;
    }

    private final MutableDirectBuffer cardStartDate = new UnsafeBuffer();
    private byte[] cardStartDateInternalBuffer = cardStartDate.byteArray();
    private int cardStartDateOffset = 0;
    private int cardStartDateLength = 0;

    /* CardStartDate = 503 */
    public SettlInstGroupEncoder cardStartDate(final DirectBuffer value, final int offset, final int length)
    {
        cardStartDate.wrap(value);
        cardStartDateOffset = offset;
        cardStartDateLength = length;
        return this;
    }

    /* CardStartDate = 503 */
    public SettlInstGroupEncoder cardStartDate(final DirectBuffer value, final int length)
    {
        return cardStartDate(value, 0, length);
    }

    /* CardStartDate = 503 */
    public SettlInstGroupEncoder cardStartDate(final DirectBuffer value)
    {
        return cardStartDate(value, 0, value.capacity());
    }

    /* CardStartDate = 503 */
    public SettlInstGroupEncoder cardStartDate(final byte[] value, final int offset, final int length)
    {
        cardStartDate.wrap(value);
        cardStartDateOffset = offset;
        cardStartDateLength = length;
        return this;
    }

    /* CardStartDate = 503 */
    public SettlInstGroupEncoder cardStartDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(cardStartDate, value, offset, length))
        {
            cardStartDateInternalBuffer = cardStartDate.byteArray();
        }
        cardStartDateOffset = 0;
        cardStartDateLength = length;
        return this;
    }

    /* CardStartDate = 503 */
    public SettlInstGroupEncoder cardStartDate(final byte[] value, final int length)
    {
        return cardStartDate(value, 0, length);
    }

    /* CardStartDate = 503 */
    public SettlInstGroupEncoder cardStartDate(final byte[] value)
    {
        return cardStartDate(value, 0, value.length);
    }

    /* CardStartDate = 503 */
    public boolean hasCardStartDate()
    {
        return cardStartDateLength > 0;
    }

    /* CardStartDate = 503 */
    public MutableDirectBuffer cardStartDate()
    {
        return cardStartDate;
    }

    /* CardStartDate = 503 */
    public String cardStartDateAsString()
    {
        return cardStartDate.getStringWithoutLengthAscii(cardStartDateOffset, cardStartDateLength);
    }

    private final MutableDirectBuffer cardExpDate = new UnsafeBuffer();
    private byte[] cardExpDateInternalBuffer = cardExpDate.byteArray();
    private int cardExpDateOffset = 0;
    private int cardExpDateLength = 0;

    /* CardExpDate = 490 */
    public SettlInstGroupEncoder cardExpDate(final DirectBuffer value, final int offset, final int length)
    {
        cardExpDate.wrap(value);
        cardExpDateOffset = offset;
        cardExpDateLength = length;
        return this;
    }

    /* CardExpDate = 490 */
    public SettlInstGroupEncoder cardExpDate(final DirectBuffer value, final int length)
    {
        return cardExpDate(value, 0, length);
    }

    /* CardExpDate = 490 */
    public SettlInstGroupEncoder cardExpDate(final DirectBuffer value)
    {
        return cardExpDate(value, 0, value.capacity());
    }

    /* CardExpDate = 490 */
    public SettlInstGroupEncoder cardExpDate(final byte[] value, final int offset, final int length)
    {
        cardExpDate.wrap(value);
        cardExpDateOffset = offset;
        cardExpDateLength = length;
        return this;
    }

    /* CardExpDate = 490 */
    public SettlInstGroupEncoder cardExpDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(cardExpDate, value, offset, length))
        {
            cardExpDateInternalBuffer = cardExpDate.byteArray();
        }
        cardExpDateOffset = 0;
        cardExpDateLength = length;
        return this;
    }

    /* CardExpDate = 490 */
    public SettlInstGroupEncoder cardExpDate(final byte[] value, final int length)
    {
        return cardExpDate(value, 0, length);
    }

    /* CardExpDate = 490 */
    public SettlInstGroupEncoder cardExpDate(final byte[] value)
    {
        return cardExpDate(value, 0, value.length);
    }

    /* CardExpDate = 490 */
    public boolean hasCardExpDate()
    {
        return cardExpDateLength > 0;
    }

    /* CardExpDate = 490 */
    public MutableDirectBuffer cardExpDate()
    {
        return cardExpDate;
    }

    /* CardExpDate = 490 */
    public String cardExpDateAsString()
    {
        return cardExpDate.getStringWithoutLengthAscii(cardExpDateOffset, cardExpDateLength);
    }

    private final MutableDirectBuffer cardIssNum = new UnsafeBuffer();
    private byte[] cardIssNumInternalBuffer = cardIssNum.byteArray();
    private int cardIssNumOffset = 0;
    private int cardIssNumLength = 0;

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final DirectBuffer value, final int offset, final int length)
    {
        cardIssNum.wrap(value);
        cardIssNumOffset = offset;
        cardIssNumLength = length;
        return this;
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final DirectBuffer value, final int length)
    {
        return cardIssNum(value, 0, length);
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final DirectBuffer value)
    {
        return cardIssNum(value, 0, value.capacity());
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final byte[] value, final int offset, final int length)
    {
        cardIssNum.wrap(value);
        cardIssNumOffset = offset;
        cardIssNumLength = length;
        return this;
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNumAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(cardIssNum, value, offset, length))
        {
            cardIssNumInternalBuffer = cardIssNum.byteArray();
        }
        cardIssNumOffset = 0;
        cardIssNumLength = length;
        return this;
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final byte[] value, final int length)
    {
        return cardIssNum(value, 0, length);
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final byte[] value)
    {
        return cardIssNum(value, 0, value.length);
    }

    /* CardIssNum = 491 */
    public boolean hasCardIssNum()
    {
        return cardIssNumLength > 0;
    }

    /* CardIssNum = 491 */
    public MutableDirectBuffer cardIssNum()
    {
        return cardIssNum;
    }

    /* CardIssNum = 491 */
    public String cardIssNumAsString()
    {
        return cardIssNum.getStringWithoutLengthAscii(cardIssNumOffset, cardIssNumLength);
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final CharSequence value)
    {
        if (toBytes(value, cardIssNum))
        {
            cardIssNumInternalBuffer = cardIssNum.byteArray();
        }
        cardIssNumOffset = 0;
        cardIssNumLength = value.length();
        return this;
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cardIssNum.wrap(buffer);
            cardIssNumOffset = value.offset();
            cardIssNumLength = value.length();
        }
        return this;
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final char[] value)
    {
        return cardIssNum(value, 0, value.length);
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final char[] value, final int length)
    {
        return cardIssNum(value, 0, length);
    }

    /* CardIssNum = 491 */
    public SettlInstGroupEncoder cardIssNum(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, cardIssNum, offset, length))
        {
            cardIssNumInternalBuffer = cardIssNum.byteArray();
        }
        cardIssNumOffset = 0;
        cardIssNumLength = length;
        return this;
    }

    private final MutableDirectBuffer paymentDate = new UnsafeBuffer();
    private byte[] paymentDateInternalBuffer = paymentDate.byteArray();
    private int paymentDateOffset = 0;
    private int paymentDateLength = 0;

    /* PaymentDate = 504 */
    public SettlInstGroupEncoder paymentDate(final DirectBuffer value, final int offset, final int length)
    {
        paymentDate.wrap(value);
        paymentDateOffset = offset;
        paymentDateLength = length;
        return this;
    }

    /* PaymentDate = 504 */
    public SettlInstGroupEncoder paymentDate(final DirectBuffer value, final int length)
    {
        return paymentDate(value, 0, length);
    }

    /* PaymentDate = 504 */
    public SettlInstGroupEncoder paymentDate(final DirectBuffer value)
    {
        return paymentDate(value, 0, value.capacity());
    }

    /* PaymentDate = 504 */
    public SettlInstGroupEncoder paymentDate(final byte[] value, final int offset, final int length)
    {
        paymentDate.wrap(value);
        paymentDateOffset = offset;
        paymentDateLength = length;
        return this;
    }

    /* PaymentDate = 504 */
    public SettlInstGroupEncoder paymentDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(paymentDate, value, offset, length))
        {
            paymentDateInternalBuffer = paymentDate.byteArray();
        }
        paymentDateOffset = 0;
        paymentDateLength = length;
        return this;
    }

    /* PaymentDate = 504 */
    public SettlInstGroupEncoder paymentDate(final byte[] value, final int length)
    {
        return paymentDate(value, 0, length);
    }

    /* PaymentDate = 504 */
    public SettlInstGroupEncoder paymentDate(final byte[] value)
    {
        return paymentDate(value, 0, value.length);
    }

    /* PaymentDate = 504 */
    public boolean hasPaymentDate()
    {
        return paymentDateLength > 0;
    }

    /* PaymentDate = 504 */
    public MutableDirectBuffer paymentDate()
    {
        return paymentDate;
    }

    /* PaymentDate = 504 */
    public String paymentDateAsString()
    {
        return paymentDate.getStringWithoutLengthAscii(paymentDateOffset, paymentDateLength);
    }

    private final MutableDirectBuffer paymentRemitterID = new UnsafeBuffer();
    private byte[] paymentRemitterIDInternalBuffer = paymentRemitterID.byteArray();
    private int paymentRemitterIDOffset = 0;
    private int paymentRemitterIDLength = 0;

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final DirectBuffer value, final int offset, final int length)
    {
        paymentRemitterID.wrap(value);
        paymentRemitterIDOffset = offset;
        paymentRemitterIDLength = length;
        return this;
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final DirectBuffer value, final int length)
    {
        return paymentRemitterID(value, 0, length);
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final DirectBuffer value)
    {
        return paymentRemitterID(value, 0, value.capacity());
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final byte[] value, final int offset, final int length)
    {
        paymentRemitterID.wrap(value);
        paymentRemitterIDOffset = offset;
        paymentRemitterIDLength = length;
        return this;
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(paymentRemitterID, value, offset, length))
        {
            paymentRemitterIDInternalBuffer = paymentRemitterID.byteArray();
        }
        paymentRemitterIDOffset = 0;
        paymentRemitterIDLength = length;
        return this;
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final byte[] value, final int length)
    {
        return paymentRemitterID(value, 0, length);
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final byte[] value)
    {
        return paymentRemitterID(value, 0, value.length);
    }

    /* PaymentRemitterID = 505 */
    public boolean hasPaymentRemitterID()
    {
        return paymentRemitterIDLength > 0;
    }

    /* PaymentRemitterID = 505 */
    public MutableDirectBuffer paymentRemitterID()
    {
        return paymentRemitterID;
    }

    /* PaymentRemitterID = 505 */
    public String paymentRemitterIDAsString()
    {
        return paymentRemitterID.getStringWithoutLengthAscii(paymentRemitterIDOffset, paymentRemitterIDLength);
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final CharSequence value)
    {
        if (toBytes(value, paymentRemitterID))
        {
            paymentRemitterIDInternalBuffer = paymentRemitterID.byteArray();
        }
        paymentRemitterIDOffset = 0;
        paymentRemitterIDLength = value.length();
        return this;
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            paymentRemitterID.wrap(buffer);
            paymentRemitterIDOffset = value.offset();
            paymentRemitterIDLength = value.length();
        }
        return this;
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final char[] value)
    {
        return paymentRemitterID(value, 0, value.length);
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final char[] value, final int length)
    {
        return paymentRemitterID(value, 0, length);
    }

    /* PaymentRemitterID = 505 */
    public SettlInstGroupEncoder paymentRemitterID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, paymentRemitterID, offset, length))
        {
            paymentRemitterIDInternalBuffer = paymentRemitterID.byteArray();
        }
        paymentRemitterIDOffset = 0;
        paymentRemitterIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (settlInstIDLength > 0)
        {
            buffer.putBytes(position, settlInstIDHeader, 0, settlInstIDHeaderLength);
            position += settlInstIDHeaderLength;
            buffer.putBytes(position, settlInstID, settlInstIDOffset, settlInstIDLength);
            position += settlInstIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlInstTransType)
        {
            buffer.putBytes(position, settlInstTransTypeHeader, 0, settlInstTransTypeHeaderLength);
            position += settlInstTransTypeHeaderLength;
            position += buffer.putCharAscii(position, settlInstTransType);
            buffer.putSeparator(position);
            position++;
        }

        if (settlInstRefIDLength > 0)
        {
            buffer.putBytes(position, settlInstRefIDHeader, 0, settlInstRefIDHeaderLength);
            position += settlInstRefIDHeaderLength;
            buffer.putBytes(position, settlInstRefID, settlInstRefIDOffset, settlInstRefIDLength);
            position += settlInstRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }

        if (hasProduct)
        {
            buffer.putBytes(position, productHeader, 0, productHeaderLength);
            position += productHeaderLength;
            position += buffer.putIntAscii(position, product);
            buffer.putSeparator(position);
            position++;
        }

        if (securityTypeLength > 0)
        {
            buffer.putBytes(position, securityTypeHeader, 0, securityTypeHeaderLength);
            position += securityTypeHeaderLength;
            buffer.putBytes(position, securityType, securityTypeOffset, securityTypeLength);
            position += securityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cFICodeLength > 0)
        {
            buffer.putBytes(position, cFICodeHeader, 0, cFICodeHeaderLength);
            position += cFICodeHeaderLength;
            buffer.putBytes(position, cFICode, cFICodeOffset, cFICodeLength);
            position += cFICodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (effectiveTimeLength > 0)
        {
            buffer.putBytes(position, effectiveTimeHeader, 0, effectiveTimeHeaderLength);
            position += effectiveTimeHeaderLength;
            buffer.putBytes(position, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            position += effectiveTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (expireTimeLength > 0)
        {
            buffer.putBytes(position, expireTimeHeader, 0, expireTimeHeaderLength);
            position += expireTimeHeaderLength;
            buffer.putBytes(position, expireTime, expireTimeOffset, expireTimeLength);
            position += expireTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (lastUpdateTimeLength > 0)
        {
            buffer.putBytes(position, lastUpdateTimeHeader, 0, lastUpdateTimeHeaderLength);
            position += lastUpdateTimeHeaderLength;
            buffer.putBytes(position, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            position += lastUpdateTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += settlInstructionsData.encode(buffer, position);

        if (hasPaymentMethod)
        {
            buffer.putBytes(position, paymentMethodHeader, 0, paymentMethodHeaderLength);
            position += paymentMethodHeaderLength;
            position += buffer.putIntAscii(position, paymentMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (paymentRefLength > 0)
        {
            buffer.putBytes(position, paymentRefHeader, 0, paymentRefHeaderLength);
            position += paymentRefHeaderLength;
            buffer.putBytes(position, paymentRef, paymentRefOffset, paymentRefLength);
            position += paymentRefLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardHolderNameLength > 0)
        {
            buffer.putBytes(position, cardHolderNameHeader, 0, cardHolderNameHeaderLength);
            position += cardHolderNameHeaderLength;
            buffer.putBytes(position, cardHolderName, cardHolderNameOffset, cardHolderNameLength);
            position += cardHolderNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardNumberLength > 0)
        {
            buffer.putBytes(position, cardNumberHeader, 0, cardNumberHeaderLength);
            position += cardNumberHeaderLength;
            buffer.putBytes(position, cardNumber, cardNumberOffset, cardNumberLength);
            position += cardNumberLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardStartDateLength > 0)
        {
            buffer.putBytes(position, cardStartDateHeader, 0, cardStartDateHeaderLength);
            position += cardStartDateHeaderLength;
            buffer.putBytes(position, cardStartDate, cardStartDateOffset, cardStartDateLength);
            position += cardStartDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardExpDateLength > 0)
        {
            buffer.putBytes(position, cardExpDateHeader, 0, cardExpDateHeaderLength);
            position += cardExpDateHeaderLength;
            buffer.putBytes(position, cardExpDate, cardExpDateOffset, cardExpDateLength);
            position += cardExpDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardIssNumLength > 0)
        {
            buffer.putBytes(position, cardIssNumHeader, 0, cardIssNumHeaderLength);
            position += cardIssNumHeaderLength;
            buffer.putBytes(position, cardIssNum, cardIssNumOffset, cardIssNumLength);
            position += cardIssNumLength;
            buffer.putSeparator(position);
            position++;
        }

        if (paymentDateLength > 0)
        {
            buffer.putBytes(position, paymentDateHeader, 0, paymentDateHeaderLength);
            position += paymentDateHeaderLength;
            buffer.putBytes(position, paymentDate, paymentDateOffset, paymentDateLength);
            position += paymentDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (paymentRemitterIDLength > 0)
        {
            buffer.putBytes(position, paymentRemitterIDHeader, 0, paymentRemitterIDHeaderLength);
            position += paymentRemitterIDHeaderLength;
            buffer.putBytes(position, paymentRemitterID, paymentRemitterIDOffset, paymentRemitterIDLength);
            position += paymentRemitterIDLength;
            buffer.putSeparator(position);
            position++;
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSettlInstID();
        this.resetSettlInstTransType();
        this.resetSettlInstRefID();
        this.resetSide();
        this.resetProduct();
        this.resetSecurityType();
        this.resetCFICode();
        this.resetEffectiveTime();
        this.resetExpireTime();
        this.resetLastUpdateTime();
        this.resetPaymentMethod();
        this.resetPaymentRef();
        this.resetCardHolderName();
        this.resetCardNumber();
        this.resetCardStartDate();
        this.resetCardExpDate();
        this.resetCardIssNum();
        this.resetPaymentDate();
        this.resetPaymentRemitterID();
        parties.reset();
        settlInstructionsData.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSettlInstID()
    {
        settlInstIDLength = 0;
        settlInstID.wrap(settlInstIDInternalBuffer);
    }

    public void resetSettlInstTransType()
    {
        hasSettlInstTransType = false;
    }

    public void resetSettlInstRefID()
    {
        settlInstRefIDLength = 0;
        settlInstRefID.wrap(settlInstRefIDInternalBuffer);
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetSecurityType()
    {
        securityTypeLength = 0;
        securityType.wrap(securityTypeInternalBuffer);
    }

    public void resetCFICode()
    {
        cFICodeLength = 0;
        cFICode.wrap(cFICodeInternalBuffer);
    }

    public void resetEffectiveTime()
    {
        effectiveTimeLength = 0;
        effectiveTime.wrap(effectiveTimeInternalBuffer);
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
        expireTime.wrap(expireTimeInternalBuffer);
    }

    public void resetLastUpdateTime()
    {
        lastUpdateTimeLength = 0;
        lastUpdateTime.wrap(lastUpdateTimeInternalBuffer);
    }

    public void resetPaymentMethod()
    {
        hasPaymentMethod = false;
    }

    public void resetPaymentRef()
    {
        paymentRefLength = 0;
        paymentRef.wrap(paymentRefInternalBuffer);
    }

    public void resetCardHolderName()
    {
        cardHolderNameLength = 0;
        cardHolderName.wrap(cardHolderNameInternalBuffer);
    }

    public void resetCardNumber()
    {
        cardNumberLength = 0;
        cardNumber.wrap(cardNumberInternalBuffer);
    }

    public void resetCardStartDate()
    {
        cardStartDateLength = 0;
        cardStartDate.wrap(cardStartDateInternalBuffer);
    }

    public void resetCardExpDate()
    {
        cardExpDateLength = 0;
        cardExpDate.wrap(cardExpDateInternalBuffer);
    }

    public void resetCardIssNum()
    {
        cardIssNumLength = 0;
        cardIssNum.wrap(cardIssNumInternalBuffer);
    }

    public void resetPaymentDate()
    {
        paymentDateLength = 0;
        paymentDate.wrap(paymentDateInternalBuffer);
    }

    public void resetPaymentRemitterID()
    {
        paymentRemitterIDLength = 0;
        paymentRemitterID.wrap(paymentRemitterIDInternalBuffer);
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
        builder.append("\"MessageName\": \"SettlInstGroup\",\n");
        if (hasSettlInstID())
        {
            indent(builder, level);
            builder.append("\"SettlInstID\": \"");
            appendBuffer(builder, settlInstID, settlInstIDOffset, settlInstIDLength);
            builder.append("\",\n");
        }

        if (hasSettlInstTransType())
        {
            indent(builder, level);
            builder.append("\"SettlInstTransType\": \"");
            builder.append(settlInstTransType);
            builder.append("\",\n");
        }

        if (hasSettlInstRefID())
        {
            indent(builder, level);
            builder.append("\"SettlInstRefID\": \"");
            appendBuffer(builder, settlInstRefID, settlInstRefIDOffset, settlInstRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            appendBuffer(builder, securityType, securityTypeOffset, securityTypeLength);
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            appendBuffer(builder, cFICode, cFICodeOffset, cFICodeLength);
            builder.append("\",\n");
        }

        if (hasEffectiveTime())
        {
            indent(builder, level);
            builder.append("\"EffectiveTime\": \"");
            appendBuffer(builder, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendBuffer(builder, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SettlInstructionsData\": ");
    settlInstructionsData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasPaymentMethod())
        {
            indent(builder, level);
            builder.append("\"PaymentMethod\": \"");
            builder.append(paymentMethod);
            builder.append("\",\n");
        }

        if (hasPaymentRef())
        {
            indent(builder, level);
            builder.append("\"PaymentRef\": \"");
            appendBuffer(builder, paymentRef, paymentRefOffset, paymentRefLength);
            builder.append("\",\n");
        }

        if (hasCardHolderName())
        {
            indent(builder, level);
            builder.append("\"CardHolderName\": \"");
            appendBuffer(builder, cardHolderName, cardHolderNameOffset, cardHolderNameLength);
            builder.append("\",\n");
        }

        if (hasCardNumber())
        {
            indent(builder, level);
            builder.append("\"CardNumber\": \"");
            appendBuffer(builder, cardNumber, cardNumberOffset, cardNumberLength);
            builder.append("\",\n");
        }

        if (hasCardStartDate())
        {
            indent(builder, level);
            builder.append("\"CardStartDate\": \"");
            appendBuffer(builder, cardStartDate, cardStartDateOffset, cardStartDateLength);
            builder.append("\",\n");
        }

        if (hasCardExpDate())
        {
            indent(builder, level);
            builder.append("\"CardExpDate\": \"");
            appendBuffer(builder, cardExpDate, cardExpDateOffset, cardExpDateLength);
            builder.append("\",\n");
        }

        if (hasCardIssNum())
        {
            indent(builder, level);
            builder.append("\"CardIssNum\": \"");
            appendBuffer(builder, cardIssNum, cardIssNumOffset, cardIssNumLength);
            builder.append("\",\n");
        }

        if (hasPaymentDate())
        {
            indent(builder, level);
            builder.append("\"PaymentDate\": \"");
            appendBuffer(builder, paymentDate, paymentDateOffset, paymentDateLength);
            builder.append("\",\n");
        }

        if (hasPaymentRemitterID())
        {
            indent(builder, level);
            builder.append("\"PaymentRemitterID\": \"");
            appendBuffer(builder, paymentRemitterID, paymentRemitterIDOffset, paymentRemitterIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public SettlInstGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlInstGroupEncoder)encoder);
    }

    public SettlInstGroupEncoder copyTo(final SettlInstGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstID())
        {
            encoder.settlInstIDAsCopy(settlInstID.byteArray(), 0, settlInstIDLength);
        }

        if (hasSettlInstTransType())
        {
            encoder.settlInstTransType(this.settlInstTransType());
        }

        if (hasSettlInstRefID())
        {
            encoder.settlInstRefIDAsCopy(settlInstRefID.byteArray(), 0, settlInstRefIDLength);
        }


        parties.copyTo(encoder.parties());
        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasSecurityType())
        {
            encoder.securityTypeAsCopy(securityType.byteArray(), 0, securityTypeLength);
        }

        if (hasCFICode())
        {
            encoder.cFICodeAsCopy(cFICode.byteArray(), 0, cFICodeLength);
        }

        if (hasEffectiveTime())
        {
            encoder.effectiveTimeAsCopy(effectiveTime.byteArray(), 0, effectiveTimeLength);
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(lastUpdateTime.byteArray(), 0, lastUpdateTimeLength);
        }


        settlInstructionsData.copyTo(encoder.settlInstructionsData());
        if (hasPaymentMethod())
        {
            encoder.paymentMethod(this.paymentMethod());
        }

        if (hasPaymentRef())
        {
            encoder.paymentRefAsCopy(paymentRef.byteArray(), 0, paymentRefLength);
        }

        if (hasCardHolderName())
        {
            encoder.cardHolderNameAsCopy(cardHolderName.byteArray(), 0, cardHolderNameLength);
        }

        if (hasCardNumber())
        {
            encoder.cardNumberAsCopy(cardNumber.byteArray(), 0, cardNumberLength);
        }

        if (hasCardStartDate())
        {
            encoder.cardStartDateAsCopy(cardStartDate.byteArray(), 0, cardStartDateLength);
        }

        if (hasCardExpDate())
        {
            encoder.cardExpDateAsCopy(cardExpDate.byteArray(), 0, cardExpDateLength);
        }

        if (hasCardIssNum())
        {
            encoder.cardIssNumAsCopy(cardIssNum.byteArray(), 0, cardIssNumLength);
        }

        if (hasPaymentDate())
        {
            encoder.paymentDateAsCopy(paymentDate.byteArray(), 0, paymentDateLength);
        }

        if (hasPaymentRemitterID())
        {
            encoder.paymentRemitterIDAsCopy(paymentRemitterID.byteArray(), 0, paymentRemitterIDLength);
        }
        return encoder;
    }

}
    private int noSettlInstGroupCounter;

    private boolean hasNoSettlInstGroupCounter;

    public boolean hasNoSettlInstGroupCounter()
    {
        return hasNoSettlInstGroupCounter;
    }

    /* NoSettlInstGroupCounter = 778 */
    public SettlementInstructionsEncoder noSettlInstGroupCounter(int value)
    {
        noSettlInstGroupCounter = value;
        hasNoSettlInstGroupCounter = true;
        return this;
    }

    /* NoSettlInstGroupCounter = 778 */
    public int noSettlInstGroupCounter()
    {
        return noSettlInstGroupCounter;
    }


    private SettlInstGroupEncoder settlInstGroup = null;

    public SettlInstGroupEncoder settlInstGroup(final int numberOfElements)
    {
        hasNoSettlInstGroupCounter = true;
        noSettlInstGroupCounter = numberOfElements;
        if (settlInstGroup == null)
        {
            settlInstGroup = new SettlInstGroupEncoder();
        }
        return settlInstGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (settlInstMsgIDLength > 0)
        {
            buffer.putBytes(position, settlInstMsgIDHeader, 0, settlInstMsgIDHeaderLength);
            position += settlInstMsgIDHeaderLength;
            buffer.putBytes(position, settlInstMsgID, settlInstMsgIDOffset, settlInstMsgIDLength);
            position += settlInstMsgIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlInstMsgID");
        }

        if (settlInstReqIDLength > 0)
        {
            buffer.putBytes(position, settlInstReqIDHeader, 0, settlInstReqIDHeaderLength);
            position += settlInstReqIDHeaderLength;
            buffer.putBytes(position, settlInstReqID, settlInstReqIDOffset, settlInstReqIDLength);
            position += settlInstReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlInstMode)
        {
            buffer.putBytes(position, settlInstModeHeader, 0, settlInstModeHeaderLength);
            position += settlInstModeHeaderLength;
            position += buffer.putCharAscii(position, settlInstMode);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlInstMode");
        }

        if (hasSettlInstReqRejCode)
        {
            buffer.putBytes(position, settlInstReqRejCodeHeader, 0, settlInstReqRejCodeHeaderLength);
            position += settlInstReqRejCodeHeaderLength;
            position += buffer.putIntAscii(position, settlInstReqRejCode);
            buffer.putSeparator(position);
            position++;
        }

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
            buffer.putSeparator(position);
            position++;
        }

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TransactTime");
        }

        if (hasNoSettlInstGroupCounter)
        {
            buffer.putBytes(position, noSettlInstGroupCounterHeader, 0, noSettlInstGroupCounterHeaderLength);
            position += noSettlInstGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSettlInstGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (settlInstGroup != null)
        {
            position += settlInstGroup.encode(buffer, position, noSettlInstGroupCounter);
        }

        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetSettlInstMsgID();
        this.resetSettlInstReqID();
        this.resetSettlInstMode();
        this.resetSettlInstReqRejCode();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetClOrdID();
        this.resetTransactTime();
        this.resetSettlInstGroup();
    }

    public void resetSettlInstMsgID()
    {
        settlInstMsgIDLength = 0;
        settlInstMsgID.wrap(settlInstMsgIDInternalBuffer);
    }

    public void resetSettlInstReqID()
    {
        settlInstReqIDLength = 0;
        settlInstReqID.wrap(settlInstReqIDInternalBuffer);
    }

    public void resetSettlInstMode()
    {
        settlInstMode = MISSING_CHAR;
    }

    public void resetSettlInstReqRejCode()
    {
        hasSettlInstReqRejCode = false;
    }

    public void resetText()
    {
        textLength = 0;
        text.wrap(textInternalBuffer);
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
        clOrdID.wrap(clOrdIDInternalBuffer);
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
        transactTime.wrap(transactTimeInternalBuffer);
    }

    public void resetSettlInstGroup()
    {
        if (settlInstGroup != null)
        {
            settlInstGroup.reset();
        }
        noSettlInstGroupCounter = 0;
        hasNoSettlInstGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlementInstructions\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasSettlInstMsgID())
        {
            indent(builder, level);
            builder.append("\"SettlInstMsgID\": \"");
            appendBuffer(builder, settlInstMsgID, settlInstMsgIDOffset, settlInstMsgIDLength);
            builder.append("\",\n");
        }

        if (hasSettlInstReqID())
        {
            indent(builder, level);
            builder.append("\"SettlInstReqID\": \"");
            appendBuffer(builder, settlInstReqID, settlInstReqIDOffset, settlInstReqIDLength);
            builder.append("\",\n");
        }

        if (hasSettlInstMode())
        {
            indent(builder, level);
            builder.append("\"SettlInstMode\": \"");
            builder.append(settlInstMode);
            builder.append("\",\n");
        }

        if (hasSettlInstReqRejCode())
        {
            indent(builder, level);
            builder.append("\"SettlInstReqRejCode\": \"");
            builder.append(settlInstReqRejCode);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasNoSettlInstGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlInstGroup\": [\n");
            final int noSettlInstGroupCounter = this.noSettlInstGroupCounter;
            SettlInstGroupEncoder settlInstGroup = this.settlInstGroup;
            for (int i = 0; i < noSettlInstGroupCounter; i++)
            {
                indent(builder, level);
                settlInstGroup.appendTo(builder, level + 1);
                if (i < (noSettlInstGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlInstGroup = settlInstGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public SettlementInstructionsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlementInstructionsEncoder)encoder);
    }

    public SettlementInstructionsEncoder copyTo(final SettlementInstructionsEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstMsgID())
        {
            encoder.settlInstMsgIDAsCopy(settlInstMsgID.byteArray(), 0, settlInstMsgIDLength);
        }

        if (hasSettlInstReqID())
        {
            encoder.settlInstReqIDAsCopy(settlInstReqID.byteArray(), 0, settlInstReqIDLength);
        }

        if (hasSettlInstMode())
        {
            encoder.settlInstMode(this.settlInstMode());
        }

        if (hasSettlInstReqRejCode())
        {
            encoder.settlInstReqRejCode(this.settlInstReqRejCode());
        }

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasNoSettlInstGroupCounter)
        {
            final int size = this.noSettlInstGroupCounter;
            SettlInstGroupEncoder settlInstGroup = this.settlInstGroup;
            SettlInstGroupEncoder settlInstGroupEncoder = encoder.settlInstGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlInstGroup != null)
                {
                    settlInstGroup.copyTo(settlInstGroupEncoder);
                    settlInstGroup = settlInstGroup.next();
                    settlInstGroupEncoder = settlInstGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
