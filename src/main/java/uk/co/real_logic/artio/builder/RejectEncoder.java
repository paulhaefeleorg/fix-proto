/* Generated Fix Gateway message codec */
package uk.co.real_logic.artio.builder;

import uk.co.real_logic.artio.builder.AbstractRejectEncoder;
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
public class RejectEncoder implements AbstractRejectEncoder
{
    public long messageType()
    {
        return 51L;
    }

    public RejectEncoder()
    {
        header.msgType("3");
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

    private static final int refSeqNumHeaderLength = 3;
    private static final byte[] refSeqNumHeader = new byte[] {52, 53, (byte) '='};

    private static final int refTagIDHeaderLength = 4;
    private static final byte[] refTagIDHeader = new byte[] {51, 55, 49, (byte) '='};

    private static final int refMsgTypeHeaderLength = 4;
    private static final byte[] refMsgTypeHeader = new byte[] {51, 55, 50, (byte) '='};

    private static final int sessionRejectReasonHeaderLength = 4;
    private static final byte[] sessionRejectReasonHeader = new byte[] {51, 55, 51, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private int refSeqNum;

    private boolean hasRefSeqNum;

    public boolean hasRefSeqNum()
    {
        return hasRefSeqNum;
    }

    /* RefSeqNum = 45 */
    public RejectEncoder refSeqNum(int value)
    {
        refSeqNum = value;
        hasRefSeqNum = true;
        return this;
    }

    /* RefSeqNum = 45 */
    public int refSeqNum()
    {
        return refSeqNum;
    }

    private int refTagID;

    private boolean hasRefTagID;

    public boolean hasRefTagID()
    {
        return hasRefTagID;
    }

    /* RefTagID = 371 */
    public RejectEncoder refTagID(int value)
    {
        refTagID = value;
        hasRefTagID = true;
        return this;
    }

    /* RefTagID = 371 */
    public int refTagID()
    {
        return refTagID;
    }

    private final MutableDirectBuffer refMsgType = new UnsafeBuffer();
    private byte[] refMsgTypeInternalBuffer = refMsgType.byteArray();
    private int refMsgTypeOffset = 0;
    private int refMsgTypeLength = 0;

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final DirectBuffer value, final int offset, final int length)
    {
        refMsgType.wrap(value);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final DirectBuffer value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final DirectBuffer value)
    {
        return refMsgType(value, 0, value.capacity());
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final byte[] value, final int offset, final int length)
    {
        refMsgType.wrap(value);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(refMsgType, value, offset, length))
        {
            refMsgTypeInternalBuffer = refMsgType.byteArray();
        }
        refMsgTypeOffset = 0;
        refMsgTypeLength = length;
        return this;
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final byte[] value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final byte[] value)
    {
        return refMsgType(value, 0, value.length);
    }

    /* RefMsgType = 372 */
    public boolean hasRefMsgType()
    {
        return refMsgTypeLength > 0;
    }

    /* RefMsgType = 372 */
    public MutableDirectBuffer refMsgType()
    {
        return refMsgType;
    }

    /* RefMsgType = 372 */
    public String refMsgTypeAsString()
    {
        return refMsgType.getStringWithoutLengthAscii(refMsgTypeOffset, refMsgTypeLength);
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final CharSequence value)
    {
        if (toBytes(value, refMsgType))
        {
            refMsgTypeInternalBuffer = refMsgType.byteArray();
        }
        refMsgTypeOffset = 0;
        refMsgTypeLength = value.length();
        return this;
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refMsgType.wrap(buffer);
            refMsgTypeOffset = value.offset();
            refMsgTypeLength = value.length();
        }
        return this;
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final char[] value)
    {
        return refMsgType(value, 0, value.length);
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final char[] value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    /* RefMsgType = 372 */
    public RejectEncoder refMsgType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, refMsgType, offset, length))
        {
            refMsgTypeInternalBuffer = refMsgType.byteArray();
        }
        refMsgTypeOffset = 0;
        refMsgTypeLength = length;
        return this;
    }

    private int sessionRejectReason;

    private boolean hasSessionRejectReason;

    public boolean hasSessionRejectReason()
    {
        return hasSessionRejectReason;
    }

    /* SessionRejectReason = 373 */
    public RejectEncoder sessionRejectReason(int value)
    {
        sessionRejectReason = value;
        hasSessionRejectReason = true;
        return this;
    }

    /* SessionRejectReason = 373 */
    public int sessionRejectReason()
    {
        return sessionRejectReason;
    }

    public RejectEncoder sessionRejectReason(SessionRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SessionRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: sessionRejectReason Value: " + value );
            }
            if (value == SessionRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return sessionRejectReason(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public RejectEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public RejectEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public RejectEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public RejectEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public RejectEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public RejectEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public RejectEncoder text(final byte[] value)
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
    public RejectEncoder text(final CharSequence value)
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
    public RejectEncoder text(final AsciiSequenceView value)
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
    public RejectEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public RejectEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public RejectEncoder text(final char[] value, final int offset, final int length)
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
    public RejectEncoder encodedTextLen(int value)
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
    public RejectEncoder encodedText(byte[] value)
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
    public RejectEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public boolean supportsRefMsgType()
    {
        return true;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasRefSeqNum)
        {
            buffer.putBytes(position, refSeqNumHeader, 0, refSeqNumHeaderLength);
            position += refSeqNumHeaderLength;
            position += buffer.putIntAscii(position, refSeqNum);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RefSeqNum");
        }

        if (hasRefTagID)
        {
            buffer.putBytes(position, refTagIDHeader, 0, refTagIDHeaderLength);
            position += refTagIDHeaderLength;
            position += buffer.putIntAscii(position, refTagID);
            buffer.putSeparator(position);
            position++;
        }

        if (refMsgTypeLength > 0)
        {
            buffer.putBytes(position, refMsgTypeHeader, 0, refMsgTypeHeaderLength);
            position += refMsgTypeHeaderLength;
            buffer.putBytes(position, refMsgType, refMsgTypeOffset, refMsgTypeLength);
            position += refMsgTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSessionRejectReason)
        {
            buffer.putBytes(position, sessionRejectReasonHeader, 0, sessionRejectReasonHeaderLength);
            position += sessionRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, sessionRejectReason);
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
        this.resetRefSeqNum();
        this.resetRefTagID();
        this.resetRefMsgType();
        this.resetSessionRejectReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
    }

    public void resetRefSeqNum()
    {
        hasRefSeqNum = false;
    }

    public void resetRefTagID()
    {
        hasRefTagID = false;
    }

    public void resetRefMsgType()
    {
        refMsgTypeLength = 0;
        refMsgType.wrap(refMsgTypeInternalBuffer);
    }

    public void resetSessionRejectReason()
    {
        hasSessionRejectReason = false;
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
        builder.append("\"MessageName\": \"Reject\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasRefSeqNum())
        {
            indent(builder, level);
            builder.append("\"RefSeqNum\": \"");
            builder.append(refSeqNum);
            builder.append("\",\n");
        }

        if (hasRefTagID())
        {
            indent(builder, level);
            builder.append("\"RefTagID\": \"");
            builder.append(refTagID);
            builder.append("\",\n");
        }

        if (hasRefMsgType())
        {
            indent(builder, level);
            builder.append("\"RefMsgType\": \"");
            appendBuffer(builder, refMsgType, refMsgTypeOffset, refMsgTypeLength);
            builder.append("\",\n");
        }

        if (hasSessionRejectReason())
        {
            indent(builder, level);
            builder.append("\"SessionRejectReason\": \"");
            builder.append(sessionRejectReason);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public RejectEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RejectEncoder)encoder);
    }

    public RejectEncoder copyTo(final RejectEncoder encoder)
    {
        encoder.reset();
        if (hasRefSeqNum())
        {
            encoder.refSeqNum(this.refSeqNum());
        }

        if (hasRefTagID())
        {
            encoder.refTagID(this.refTagID());
        }

        if (hasRefMsgType())
        {
            encoder.refMsgTypeAsCopy(refMsgType.byteArray(), 0, refMsgTypeLength);
        }

        if (hasSessionRejectReason())
        {
            encoder.sessionRejectReason(this.sessionRejectReason());
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
