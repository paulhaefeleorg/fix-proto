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
public class StipulationsEncoder
{
    private static final int noStipulationsGroupCounterHeaderLength = 4;
    private static final byte[] noStipulationsGroupCounterHeader = new byte[] {50, 51, 50, (byte) '='};


@Generated("uk.co.real_logic.artio")
public static class StipulationsGroupEncoder
{
    private StipulationsGroupEncoder next = null;

    public StipulationsGroupEncoder next()
    {
        if (next == null)
        {
            next = new StipulationsGroupEncoder();
        }
        return next;
    }

    private static final int stipulationTypeHeaderLength = 4;
    private static final byte[] stipulationTypeHeader = new byte[] {50, 51, 51, (byte) '='};

    private static final int stipulationValueHeaderLength = 4;
    private static final byte[] stipulationValueHeader = new byte[] {50, 51, 52, (byte) '='};

    private final MutableDirectBuffer stipulationType = new UnsafeBuffer();
    private byte[] stipulationTypeInternalBuffer = stipulationType.byteArray();
    private int stipulationTypeOffset = 0;
    private int stipulationTypeLength = 0;

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final DirectBuffer value, final int offset, final int length)
    {
        stipulationType.wrap(value);
        stipulationTypeOffset = offset;
        stipulationTypeLength = length;
        return this;
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final DirectBuffer value, final int length)
    {
        return stipulationType(value, 0, length);
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final DirectBuffer value)
    {
        return stipulationType(value, 0, value.capacity());
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final byte[] value, final int offset, final int length)
    {
        stipulationType.wrap(value);
        stipulationTypeOffset = offset;
        stipulationTypeLength = length;
        return this;
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(stipulationType, value, offset, length))
        {
            stipulationTypeInternalBuffer = stipulationType.byteArray();
        }
        stipulationTypeOffset = 0;
        stipulationTypeLength = length;
        return this;
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final byte[] value, final int length)
    {
        return stipulationType(value, 0, length);
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final byte[] value)
    {
        return stipulationType(value, 0, value.length);
    }

    /* StipulationType = 233 */
    public boolean hasStipulationType()
    {
        return stipulationTypeLength > 0;
    }

    /* StipulationType = 233 */
    public MutableDirectBuffer stipulationType()
    {
        return stipulationType;
    }

    /* StipulationType = 233 */
    public String stipulationTypeAsString()
    {
        return stipulationType.getStringWithoutLengthAscii(stipulationTypeOffset, stipulationTypeLength);
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final CharSequence value)
    {
        if (toBytes(value, stipulationType))
        {
            stipulationTypeInternalBuffer = stipulationType.byteArray();
        }
        stipulationTypeOffset = 0;
        stipulationTypeLength = value.length();
        return this;
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            stipulationType.wrap(buffer);
            stipulationTypeOffset = value.offset();
            stipulationTypeLength = value.length();
        }
        return this;
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final char[] value)
    {
        return stipulationType(value, 0, value.length);
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final char[] value, final int length)
    {
        return stipulationType(value, 0, length);
    }

    /* StipulationType = 233 */
    public StipulationsGroupEncoder stipulationType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, stipulationType, offset, length))
        {
            stipulationTypeInternalBuffer = stipulationType.byteArray();
        }
        stipulationTypeOffset = 0;
        stipulationTypeLength = length;
        return this;
    }

    public StipulationsGroupEncoder stipulationType(StipulationType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StipulationType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: stipulationType Value: " + value );
            }
            if (value == StipulationType.NULL_VAL)
            {
                return this;
            }
        }
        return stipulationType(value.representation());
    }

    private final MutableDirectBuffer stipulationValue = new UnsafeBuffer();
    private byte[] stipulationValueInternalBuffer = stipulationValue.byteArray();
    private int stipulationValueOffset = 0;
    private int stipulationValueLength = 0;

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final DirectBuffer value, final int offset, final int length)
    {
        stipulationValue.wrap(value);
        stipulationValueOffset = offset;
        stipulationValueLength = length;
        return this;
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final DirectBuffer value, final int length)
    {
        return stipulationValue(value, 0, length);
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final DirectBuffer value)
    {
        return stipulationValue(value, 0, value.capacity());
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final byte[] value, final int offset, final int length)
    {
        stipulationValue.wrap(value);
        stipulationValueOffset = offset;
        stipulationValueLength = length;
        return this;
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValueAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(stipulationValue, value, offset, length))
        {
            stipulationValueInternalBuffer = stipulationValue.byteArray();
        }
        stipulationValueOffset = 0;
        stipulationValueLength = length;
        return this;
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final byte[] value, final int length)
    {
        return stipulationValue(value, 0, length);
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final byte[] value)
    {
        return stipulationValue(value, 0, value.length);
    }

    /* StipulationValue = 234 */
    public boolean hasStipulationValue()
    {
        return stipulationValueLength > 0;
    }

    /* StipulationValue = 234 */
    public MutableDirectBuffer stipulationValue()
    {
        return stipulationValue;
    }

    /* StipulationValue = 234 */
    public String stipulationValueAsString()
    {
        return stipulationValue.getStringWithoutLengthAscii(stipulationValueOffset, stipulationValueLength);
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final CharSequence value)
    {
        if (toBytes(value, stipulationValue))
        {
            stipulationValueInternalBuffer = stipulationValue.byteArray();
        }
        stipulationValueOffset = 0;
        stipulationValueLength = value.length();
        return this;
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            stipulationValue.wrap(buffer);
            stipulationValueOffset = value.offset();
            stipulationValueLength = value.length();
        }
        return this;
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final char[] value)
    {
        return stipulationValue(value, 0, value.length);
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final char[] value, final int length)
    {
        return stipulationValue(value, 0, length);
    }

    /* StipulationValue = 234 */
    public StipulationsGroupEncoder stipulationValue(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, stipulationValue, offset, length))
        {
            stipulationValueInternalBuffer = stipulationValue.byteArray();
        }
        stipulationValueOffset = 0;
        stipulationValueLength = length;
        return this;
    }

    public StipulationsGroupEncoder stipulationValue(StipulationValue value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StipulationValue.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: stipulationValue Value: " + value );
            }
            if (value == StipulationValue.NULL_VAL)
            {
                return this;
            }
        }
        return stipulationValue(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (stipulationTypeLength > 0)
        {
            buffer.putBytes(position, stipulationTypeHeader, 0, stipulationTypeHeaderLength);
            position += stipulationTypeHeaderLength;
            buffer.putBytes(position, stipulationType, stipulationTypeOffset, stipulationTypeLength);
            position += stipulationTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (stipulationValueLength > 0)
        {
            buffer.putBytes(position, stipulationValueHeader, 0, stipulationValueHeaderLength);
            position += stipulationValueHeaderLength;
            buffer.putBytes(position, stipulationValue, stipulationValueOffset, stipulationValueLength);
            position += stipulationValueLength;
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
        this.resetStipulationType();
        this.resetStipulationValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetStipulationType()
    {
        stipulationTypeLength = 0;
        stipulationType.wrap(stipulationTypeInternalBuffer);
    }

    public void resetStipulationValue()
    {
        stipulationValueLength = 0;
        stipulationValue.wrap(stipulationValueInternalBuffer);
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
        builder.append("\"MessageName\": \"StipulationsGroup\",\n");
        if (hasStipulationType())
        {
            indent(builder, level);
            builder.append("\"StipulationType\": \"");
            appendBuffer(builder, stipulationType, stipulationTypeOffset, stipulationTypeLength);
            builder.append("\",\n");
        }

        if (hasStipulationValue())
        {
            indent(builder, level);
            builder.append("\"StipulationValue\": \"");
            appendBuffer(builder, stipulationValue, stipulationValueOffset, stipulationValueLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public StipulationsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StipulationsGroupEncoder)encoder);
    }

    public StipulationsGroupEncoder copyTo(final StipulationsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStipulationType())
        {
            encoder.stipulationTypeAsCopy(stipulationType.byteArray(), 0, stipulationTypeLength);
        }

        if (hasStipulationValue())
        {
            encoder.stipulationValueAsCopy(stipulationValue.byteArray(), 0, stipulationValueLength);
        }
        return encoder;
    }

}
    private int noStipulationsGroupCounter;

    private boolean hasNoStipulationsGroupCounter;

    public boolean hasNoStipulationsGroupCounter()
    {
        return hasNoStipulationsGroupCounter;
    }

    /* NoStipulationsGroupCounter = 232 */
    public StipulationsEncoder noStipulationsGroupCounter(int value)
    {
        noStipulationsGroupCounter = value;
        hasNoStipulationsGroupCounter = true;
        return this;
    }

    /* NoStipulationsGroupCounter = 232 */
    public int noStipulationsGroupCounter()
    {
        return noStipulationsGroupCounter;
    }


    private StipulationsGroupEncoder stipulationsGroup = null;

    public StipulationsGroupEncoder stipulationsGroup(final int numberOfElements)
    {
        hasNoStipulationsGroupCounter = true;
        noStipulationsGroupCounter = numberOfElements;
        if (stipulationsGroup == null)
        {
            stipulationsGroup = new StipulationsGroupEncoder();
        }
        return stipulationsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoStipulationsGroupCounter)
        {
            buffer.putBytes(position, noStipulationsGroupCounterHeader, 0, noStipulationsGroupCounterHeaderLength);
            position += noStipulationsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noStipulationsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (stipulationsGroup != null)
        {
            position += stipulationsGroup.encode(buffer, position, noStipulationsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetStipulationsGroup();
    }

    public void resetStipulationsGroup()
    {
        if (stipulationsGroup != null)
        {
            stipulationsGroup.reset();
        }
        noStipulationsGroupCounter = 0;
        hasNoStipulationsGroupCounter = false;
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
        builder.append("\"MessageName\": \"Stipulations\",\n");
        if (hasNoStipulationsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StipulationsGroup\": [\n");
            final int noStipulationsGroupCounter = this.noStipulationsGroupCounter;
            StipulationsGroupEncoder stipulationsGroup = this.stipulationsGroup;
            for (int i = 0; i < noStipulationsGroupCounter; i++)
            {
                indent(builder, level);
                stipulationsGroup.appendTo(builder, level + 1);
                if (i < (noStipulationsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                stipulationsGroup = stipulationsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public StipulationsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StipulationsEncoder)encoder);
    }

    public StipulationsEncoder copyTo(final StipulationsEncoder encoder)
    {
        encoder.reset();
        if (hasNoStipulationsGroupCounter)
        {
            final int size = this.noStipulationsGroupCounter;
            StipulationsGroupEncoder stipulationsGroup = this.stipulationsGroup;
            StipulationsGroupEncoder stipulationsGroupEncoder = encoder.stipulationsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (stipulationsGroup != null)
                {
                    stipulationsGroup.copyTo(stipulationsGroupEncoder);
                    stipulationsGroup = stipulationsGroup.next();
                    stipulationsGroupEncoder = stipulationsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
