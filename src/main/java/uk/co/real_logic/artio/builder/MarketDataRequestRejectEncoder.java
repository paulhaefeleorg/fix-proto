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
public class MarketDataRequestRejectEncoder implements Encoder
{
    public long messageType()
    {
        return 89L;
    }

    public MarketDataRequestRejectEncoder()
    {
        header.msgType("Y");
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

    private static final int mDReqIDHeaderLength = 4;
    private static final byte[] mDReqIDHeader = new byte[] {50, 54, 50, (byte) '='};

    private static final int mDReqRejReasonHeaderLength = 4;
    private static final byte[] mDReqRejReasonHeader = new byte[] {50, 56, 49, (byte) '='};

    private static final int noAltMDSourceGroupCounterHeaderLength = 4;
    private static final byte[] noAltMDSourceGroupCounterHeader = new byte[] {56, 49, 54, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer mDReqID = new UnsafeBuffer();
    private byte[] mDReqIDInternalBuffer = mDReqID.byteArray();
    private int mDReqIDOffset = 0;
    private int mDReqIDLength = 0;

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final DirectBuffer value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final DirectBuffer value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final DirectBuffer value)
    {
        return mDReqID(value, 0, value.capacity());
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final byte[] value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDReqID, value, offset, length))
        {
            mDReqIDInternalBuffer = mDReqID.byteArray();
        }
        mDReqIDOffset = 0;
        mDReqIDLength = length;
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final byte[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final byte[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    /* MDReqID = 262 */
    public boolean hasMDReqID()
    {
        return mDReqIDLength > 0;
    }

    /* MDReqID = 262 */
    public MutableDirectBuffer mDReqID()
    {
        return mDReqID;
    }

    /* MDReqID = 262 */
    public String mDReqIDAsString()
    {
        return mDReqID.getStringWithoutLengthAscii(mDReqIDOffset, mDReqIDLength);
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final CharSequence value)
    {
        if (toBytes(value, mDReqID))
        {
            mDReqIDInternalBuffer = mDReqID.byteArray();
        }
        mDReqIDOffset = 0;
        mDReqIDLength = value.length();
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDReqID.wrap(buffer);
            mDReqIDOffset = value.offset();
            mDReqIDLength = value.length();
        }
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final char[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final char[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    /* MDReqID = 262 */
    public MarketDataRequestRejectEncoder mDReqID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, mDReqID, offset, length))
        {
            mDReqIDInternalBuffer = mDReqID.byteArray();
        }
        mDReqIDOffset = 0;
        mDReqIDLength = length;
        return this;
    }

    private char mDReqRejReason;

    private boolean hasMDReqRejReason;

    public boolean hasMDReqRejReason()
    {
        return hasMDReqRejReason;
    }

    /* MDReqRejReason = 281 */
    public MarketDataRequestRejectEncoder mDReqRejReason(char value)
    {
        mDReqRejReason = value;
        hasMDReqRejReason = true;
        return this;
    }

    /* MDReqRejReason = 281 */
    public char mDReqRejReason()
    {
        return mDReqRejReason;
    }

    public MarketDataRequestRejectEncoder mDReqRejReason(MDReqRejReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDReqRejReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDReqRejReason Value: " + value );
            }
            if (value == MDReqRejReason.NULL_VAL)
            {
                return this;
            }
        }
        return mDReqRejReason(value.representation());
    }


@Generated("uk.co.real_logic.artio")
public static class AltMDSourceGroupEncoder
{
    private AltMDSourceGroupEncoder next = null;

    public AltMDSourceGroupEncoder next()
    {
        if (next == null)
        {
            next = new AltMDSourceGroupEncoder();
        }
        return next;
    }

    private static final int altMDSourceIDHeaderLength = 4;
    private static final byte[] altMDSourceIDHeader = new byte[] {56, 49, 55, (byte) '='};

    private final MutableDirectBuffer altMDSourceID = new UnsafeBuffer();
    private byte[] altMDSourceIDInternalBuffer = altMDSourceID.byteArray();
    private int altMDSourceIDOffset = 0;
    private int altMDSourceIDLength = 0;

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final DirectBuffer value, final int offset, final int length)
    {
        altMDSourceID.wrap(value);
        altMDSourceIDOffset = offset;
        altMDSourceIDLength = length;
        return this;
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final DirectBuffer value, final int length)
    {
        return altMDSourceID(value, 0, length);
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final DirectBuffer value)
    {
        return altMDSourceID(value, 0, value.capacity());
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final byte[] value, final int offset, final int length)
    {
        altMDSourceID.wrap(value);
        altMDSourceIDOffset = offset;
        altMDSourceIDLength = length;
        return this;
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(altMDSourceID, value, offset, length))
        {
            altMDSourceIDInternalBuffer = altMDSourceID.byteArray();
        }
        altMDSourceIDOffset = 0;
        altMDSourceIDLength = length;
        return this;
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final byte[] value, final int length)
    {
        return altMDSourceID(value, 0, length);
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final byte[] value)
    {
        return altMDSourceID(value, 0, value.length);
    }

    /* AltMDSourceID = 817 */
    public boolean hasAltMDSourceID()
    {
        return altMDSourceIDLength > 0;
    }

    /* AltMDSourceID = 817 */
    public MutableDirectBuffer altMDSourceID()
    {
        return altMDSourceID;
    }

    /* AltMDSourceID = 817 */
    public String altMDSourceIDAsString()
    {
        return altMDSourceID.getStringWithoutLengthAscii(altMDSourceIDOffset, altMDSourceIDLength);
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final CharSequence value)
    {
        if (toBytes(value, altMDSourceID))
        {
            altMDSourceIDInternalBuffer = altMDSourceID.byteArray();
        }
        altMDSourceIDOffset = 0;
        altMDSourceIDLength = value.length();
        return this;
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            altMDSourceID.wrap(buffer);
            altMDSourceIDOffset = value.offset();
            altMDSourceIDLength = value.length();
        }
        return this;
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final char[] value)
    {
        return altMDSourceID(value, 0, value.length);
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final char[] value, final int length)
    {
        return altMDSourceID(value, 0, length);
    }

    /* AltMDSourceID = 817 */
    public AltMDSourceGroupEncoder altMDSourceID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, altMDSourceID, offset, length))
        {
            altMDSourceIDInternalBuffer = altMDSourceID.byteArray();
        }
        altMDSourceIDOffset = 0;
        altMDSourceIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (altMDSourceIDLength > 0)
        {
            buffer.putBytes(position, altMDSourceIDHeader, 0, altMDSourceIDHeaderLength);
            position += altMDSourceIDHeaderLength;
            buffer.putBytes(position, altMDSourceID, altMDSourceIDOffset, altMDSourceIDLength);
            position += altMDSourceIDLength;
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
        this.resetAltMDSourceID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetAltMDSourceID()
    {
        altMDSourceIDLength = 0;
        altMDSourceID.wrap(altMDSourceIDInternalBuffer);
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
        builder.append("\"MessageName\": \"AltMDSourceGroup\",\n");
        if (hasAltMDSourceID())
        {
            indent(builder, level);
            builder.append("\"AltMDSourceID\": \"");
            appendBuffer(builder, altMDSourceID, altMDSourceIDOffset, altMDSourceIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public AltMDSourceGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AltMDSourceGroupEncoder)encoder);
    }

    public AltMDSourceGroupEncoder copyTo(final AltMDSourceGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAltMDSourceID())
        {
            encoder.altMDSourceIDAsCopy(altMDSourceID.byteArray(), 0, altMDSourceIDLength);
        }
        return encoder;
    }

}
    private int noAltMDSourceGroupCounter;

    private boolean hasNoAltMDSourceGroupCounter;

    public boolean hasNoAltMDSourceGroupCounter()
    {
        return hasNoAltMDSourceGroupCounter;
    }

    /* NoAltMDSourceGroupCounter = 816 */
    public MarketDataRequestRejectEncoder noAltMDSourceGroupCounter(int value)
    {
        noAltMDSourceGroupCounter = value;
        hasNoAltMDSourceGroupCounter = true;
        return this;
    }

    /* NoAltMDSourceGroupCounter = 816 */
    public int noAltMDSourceGroupCounter()
    {
        return noAltMDSourceGroupCounter;
    }


    private AltMDSourceGroupEncoder altMDSourceGroup = null;

    public AltMDSourceGroupEncoder altMDSourceGroup(final int numberOfElements)
    {
        hasNoAltMDSourceGroupCounter = true;
        noAltMDSourceGroupCounter = numberOfElements;
        if (altMDSourceGroup == null)
        {
            altMDSourceGroup = new AltMDSourceGroupEncoder();
        }
        return altMDSourceGroup;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public MarketDataRequestRejectEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public MarketDataRequestRejectEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MarketDataRequestRejectEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public MarketDataRequestRejectEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public MarketDataRequestRejectEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public MarketDataRequestRejectEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MarketDataRequestRejectEncoder text(final byte[] value)
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
    public MarketDataRequestRejectEncoder text(final CharSequence value)
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
    public MarketDataRequestRejectEncoder text(final AsciiSequenceView value)
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
    public MarketDataRequestRejectEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public MarketDataRequestRejectEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MarketDataRequestRejectEncoder text(final char[] value, final int offset, final int length)
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
    public MarketDataRequestRejectEncoder encodedTextLen(int value)
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
    public MarketDataRequestRejectEncoder encodedText(byte[] value)
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
    public MarketDataRequestRejectEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (mDReqIDLength > 0)
        {
            buffer.putBytes(position, mDReqIDHeader, 0, mDReqIDHeaderLength);
            position += mDReqIDHeaderLength;
            buffer.putBytes(position, mDReqID, mDReqIDOffset, mDReqIDLength);
            position += mDReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MDReqID");
        }

        if (hasMDReqRejReason)
        {
            buffer.putBytes(position, mDReqRejReasonHeader, 0, mDReqRejReasonHeaderLength);
            position += mDReqRejReasonHeaderLength;
            position += buffer.putCharAscii(position, mDReqRejReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoAltMDSourceGroupCounter)
        {
            buffer.putBytes(position, noAltMDSourceGroupCounterHeader, 0, noAltMDSourceGroupCounterHeaderLength);
            position += noAltMDSourceGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAltMDSourceGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (altMDSourceGroup != null)
        {
            position += altMDSourceGroup.encode(buffer, position, noAltMDSourceGroupCounter);
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
        this.resetMDReqID();
        this.resetMDReqRejReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetAltMDSourceGroup();
    }

    public void resetMDReqID()
    {
        mDReqIDLength = 0;
        mDReqID.wrap(mDReqIDInternalBuffer);
    }

    public void resetMDReqRejReason()
    {
        hasMDReqRejReason = false;
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

    public void resetAltMDSourceGroup()
    {
        if (altMDSourceGroup != null)
        {
            altMDSourceGroup.reset();
        }
        noAltMDSourceGroupCounter = 0;
        hasNoAltMDSourceGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataRequestReject\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasMDReqID())
        {
            indent(builder, level);
            builder.append("\"MDReqID\": \"");
            appendBuffer(builder, mDReqID, mDReqIDOffset, mDReqIDLength);
            builder.append("\",\n");
        }

        if (hasMDReqRejReason())
        {
            indent(builder, level);
            builder.append("\"MDReqRejReason\": \"");
            builder.append(mDReqRejReason);
            builder.append("\",\n");
        }

        if (hasNoAltMDSourceGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AltMDSourceGroup\": [\n");
            final int noAltMDSourceGroupCounter = this.noAltMDSourceGroupCounter;
            AltMDSourceGroupEncoder altMDSourceGroup = this.altMDSourceGroup;
            for (int i = 0; i < noAltMDSourceGroupCounter; i++)
            {
                indent(builder, level);
                altMDSourceGroup.appendTo(builder, level + 1);
                if (i < (noAltMDSourceGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                altMDSourceGroup = altMDSourceGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public MarketDataRequestRejectEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDataRequestRejectEncoder)encoder);
    }

    public MarketDataRequestRejectEncoder copyTo(final MarketDataRequestRejectEncoder encoder)
    {
        encoder.reset();
        if (hasMDReqID())
        {
            encoder.mDReqIDAsCopy(mDReqID.byteArray(), 0, mDReqIDLength);
        }

        if (hasMDReqRejReason())
        {
            encoder.mDReqRejReason(this.mDReqRejReason());
        }

        if (hasNoAltMDSourceGroupCounter)
        {
            final int size = this.noAltMDSourceGroupCounter;
            AltMDSourceGroupEncoder altMDSourceGroup = this.altMDSourceGroup;
            AltMDSourceGroupEncoder altMDSourceGroupEncoder = encoder.altMDSourceGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (altMDSourceGroup != null)
                {
                    altMDSourceGroup.copyTo(altMDSourceGroupEncoder);
                    altMDSourceGroup = altMDSourceGroup.next();
                    altMDSourceGroupEncoder = altMDSourceGroupEncoder.next();
                }
            }
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
        return encoder;
    }

}
