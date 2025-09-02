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
public class FinancingDetailsEncoder
{
    private static final int agreementDescHeaderLength = 4;
    private static final byte[] agreementDescHeader = new byte[] {57, 49, 51, (byte) '='};

    private static final int agreementIDHeaderLength = 4;
    private static final byte[] agreementIDHeader = new byte[] {57, 49, 52, (byte) '='};

    private static final int agreementDateHeaderLength = 4;
    private static final byte[] agreementDateHeader = new byte[] {57, 49, 53, (byte) '='};

    private static final int agreementCurrencyHeaderLength = 4;
    private static final byte[] agreementCurrencyHeader = new byte[] {57, 49, 56, (byte) '='};

    private static final int terminationTypeHeaderLength = 4;
    private static final byte[] terminationTypeHeader = new byte[] {55, 56, 56, (byte) '='};

    private static final int startDateHeaderLength = 4;
    private static final byte[] startDateHeader = new byte[] {57, 49, 54, (byte) '='};

    private static final int endDateHeaderLength = 4;
    private static final byte[] endDateHeader = new byte[] {57, 49, 55, (byte) '='};

    private static final int deliveryTypeHeaderLength = 4;
    private static final byte[] deliveryTypeHeader = new byte[] {57, 49, 57, (byte) '='};

    private static final int marginRatioHeaderLength = 4;
    private static final byte[] marginRatioHeader = new byte[] {56, 57, 56, (byte) '='};

    private final MutableDirectBuffer agreementDesc = new UnsafeBuffer();
    private byte[] agreementDescInternalBuffer = agreementDesc.byteArray();
    private int agreementDescOffset = 0;
    private int agreementDescLength = 0;

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final DirectBuffer value, final int offset, final int length)
    {
        agreementDesc.wrap(value);
        agreementDescOffset = offset;
        agreementDescLength = length;
        return this;
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final DirectBuffer value, final int length)
    {
        return agreementDesc(value, 0, length);
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final DirectBuffer value)
    {
        return agreementDesc(value, 0, value.capacity());
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final byte[] value, final int offset, final int length)
    {
        agreementDesc.wrap(value);
        agreementDescOffset = offset;
        agreementDescLength = length;
        return this;
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDescAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(agreementDesc, value, offset, length))
        {
            agreementDescInternalBuffer = agreementDesc.byteArray();
        }
        agreementDescOffset = 0;
        agreementDescLength = length;
        return this;
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final byte[] value, final int length)
    {
        return agreementDesc(value, 0, length);
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final byte[] value)
    {
        return agreementDesc(value, 0, value.length);
    }

    /* AgreementDesc = 913 */
    public boolean hasAgreementDesc()
    {
        return agreementDescLength > 0;
    }

    /* AgreementDesc = 913 */
    public MutableDirectBuffer agreementDesc()
    {
        return agreementDesc;
    }

    /* AgreementDesc = 913 */
    public String agreementDescAsString()
    {
        return agreementDesc.getStringWithoutLengthAscii(agreementDescOffset, agreementDescLength);
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final CharSequence value)
    {
        if (toBytes(value, agreementDesc))
        {
            agreementDescInternalBuffer = agreementDesc.byteArray();
        }
        agreementDescOffset = 0;
        agreementDescLength = value.length();
        return this;
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            agreementDesc.wrap(buffer);
            agreementDescOffset = value.offset();
            agreementDescLength = value.length();
        }
        return this;
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final char[] value)
    {
        return agreementDesc(value, 0, value.length);
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final char[] value, final int length)
    {
        return agreementDesc(value, 0, length);
    }

    /* AgreementDesc = 913 */
    public FinancingDetailsEncoder agreementDesc(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, agreementDesc, offset, length))
        {
            agreementDescInternalBuffer = agreementDesc.byteArray();
        }
        agreementDescOffset = 0;
        agreementDescLength = length;
        return this;
    }

    private final MutableDirectBuffer agreementID = new UnsafeBuffer();
    private byte[] agreementIDInternalBuffer = agreementID.byteArray();
    private int agreementIDOffset = 0;
    private int agreementIDLength = 0;

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final DirectBuffer value, final int offset, final int length)
    {
        agreementID.wrap(value);
        agreementIDOffset = offset;
        agreementIDLength = length;
        return this;
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final DirectBuffer value, final int length)
    {
        return agreementID(value, 0, length);
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final DirectBuffer value)
    {
        return agreementID(value, 0, value.capacity());
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final byte[] value, final int offset, final int length)
    {
        agreementID.wrap(value);
        agreementIDOffset = offset;
        agreementIDLength = length;
        return this;
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(agreementID, value, offset, length))
        {
            agreementIDInternalBuffer = agreementID.byteArray();
        }
        agreementIDOffset = 0;
        agreementIDLength = length;
        return this;
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final byte[] value, final int length)
    {
        return agreementID(value, 0, length);
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final byte[] value)
    {
        return agreementID(value, 0, value.length);
    }

    /* AgreementID = 914 */
    public boolean hasAgreementID()
    {
        return agreementIDLength > 0;
    }

    /* AgreementID = 914 */
    public MutableDirectBuffer agreementID()
    {
        return agreementID;
    }

    /* AgreementID = 914 */
    public String agreementIDAsString()
    {
        return agreementID.getStringWithoutLengthAscii(agreementIDOffset, agreementIDLength);
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final CharSequence value)
    {
        if (toBytes(value, agreementID))
        {
            agreementIDInternalBuffer = agreementID.byteArray();
        }
        agreementIDOffset = 0;
        agreementIDLength = value.length();
        return this;
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            agreementID.wrap(buffer);
            agreementIDOffset = value.offset();
            agreementIDLength = value.length();
        }
        return this;
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final char[] value)
    {
        return agreementID(value, 0, value.length);
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final char[] value, final int length)
    {
        return agreementID(value, 0, length);
    }

    /* AgreementID = 914 */
    public FinancingDetailsEncoder agreementID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, agreementID, offset, length))
        {
            agreementIDInternalBuffer = agreementID.byteArray();
        }
        agreementIDOffset = 0;
        agreementIDLength = length;
        return this;
    }

    private final MutableDirectBuffer agreementDate = new UnsafeBuffer();
    private byte[] agreementDateInternalBuffer = agreementDate.byteArray();
    private int agreementDateOffset = 0;
    private int agreementDateLength = 0;

    /* AgreementDate = 915 */
    public FinancingDetailsEncoder agreementDate(final DirectBuffer value, final int offset, final int length)
    {
        agreementDate.wrap(value);
        agreementDateOffset = offset;
        agreementDateLength = length;
        return this;
    }

    /* AgreementDate = 915 */
    public FinancingDetailsEncoder agreementDate(final DirectBuffer value, final int length)
    {
        return agreementDate(value, 0, length);
    }

    /* AgreementDate = 915 */
    public FinancingDetailsEncoder agreementDate(final DirectBuffer value)
    {
        return agreementDate(value, 0, value.capacity());
    }

    /* AgreementDate = 915 */
    public FinancingDetailsEncoder agreementDate(final byte[] value, final int offset, final int length)
    {
        agreementDate.wrap(value);
        agreementDateOffset = offset;
        agreementDateLength = length;
        return this;
    }

    /* AgreementDate = 915 */
    public FinancingDetailsEncoder agreementDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(agreementDate, value, offset, length))
        {
            agreementDateInternalBuffer = agreementDate.byteArray();
        }
        agreementDateOffset = 0;
        agreementDateLength = length;
        return this;
    }

    /* AgreementDate = 915 */
    public FinancingDetailsEncoder agreementDate(final byte[] value, final int length)
    {
        return agreementDate(value, 0, length);
    }

    /* AgreementDate = 915 */
    public FinancingDetailsEncoder agreementDate(final byte[] value)
    {
        return agreementDate(value, 0, value.length);
    }

    /* AgreementDate = 915 */
    public boolean hasAgreementDate()
    {
        return agreementDateLength > 0;
    }

    /* AgreementDate = 915 */
    public MutableDirectBuffer agreementDate()
    {
        return agreementDate;
    }

    /* AgreementDate = 915 */
    public String agreementDateAsString()
    {
        return agreementDate.getStringWithoutLengthAscii(agreementDateOffset, agreementDateLength);
    }

    private final MutableDirectBuffer agreementCurrency = new UnsafeBuffer();
    private byte[] agreementCurrencyInternalBuffer = agreementCurrency.byteArray();
    private int agreementCurrencyOffset = 0;
    private int agreementCurrencyLength = 0;

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final DirectBuffer value, final int offset, final int length)
    {
        agreementCurrency.wrap(value);
        agreementCurrencyOffset = offset;
        agreementCurrencyLength = length;
        return this;
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final DirectBuffer value, final int length)
    {
        return agreementCurrency(value, 0, length);
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final DirectBuffer value)
    {
        return agreementCurrency(value, 0, value.capacity());
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final byte[] value, final int offset, final int length)
    {
        agreementCurrency.wrap(value);
        agreementCurrencyOffset = offset;
        agreementCurrencyLength = length;
        return this;
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(agreementCurrency, value, offset, length))
        {
            agreementCurrencyInternalBuffer = agreementCurrency.byteArray();
        }
        agreementCurrencyOffset = 0;
        agreementCurrencyLength = length;
        return this;
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final byte[] value, final int length)
    {
        return agreementCurrency(value, 0, length);
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final byte[] value)
    {
        return agreementCurrency(value, 0, value.length);
    }

    /* AgreementCurrency = 918 */
    public boolean hasAgreementCurrency()
    {
        return agreementCurrencyLength > 0;
    }

    /* AgreementCurrency = 918 */
    public MutableDirectBuffer agreementCurrency()
    {
        return agreementCurrency;
    }

    /* AgreementCurrency = 918 */
    public String agreementCurrencyAsString()
    {
        return agreementCurrency.getStringWithoutLengthAscii(agreementCurrencyOffset, agreementCurrencyLength);
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final CharSequence value)
    {
        if (toBytes(value, agreementCurrency))
        {
            agreementCurrencyInternalBuffer = agreementCurrency.byteArray();
        }
        agreementCurrencyOffset = 0;
        agreementCurrencyLength = value.length();
        return this;
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            agreementCurrency.wrap(buffer);
            agreementCurrencyOffset = value.offset();
            agreementCurrencyLength = value.length();
        }
        return this;
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final char[] value)
    {
        return agreementCurrency(value, 0, value.length);
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final char[] value, final int length)
    {
        return agreementCurrency(value, 0, length);
    }

    /* AgreementCurrency = 918 */
    public FinancingDetailsEncoder agreementCurrency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, agreementCurrency, offset, length))
        {
            agreementCurrencyInternalBuffer = agreementCurrency.byteArray();
        }
        agreementCurrencyOffset = 0;
        agreementCurrencyLength = length;
        return this;
    }

    private int terminationType;

    private boolean hasTerminationType;

    public boolean hasTerminationType()
    {
        return hasTerminationType;
    }

    /* TerminationType = 788 */
    public FinancingDetailsEncoder terminationType(int value)
    {
        terminationType = value;
        hasTerminationType = true;
        return this;
    }

    /* TerminationType = 788 */
    public int terminationType()
    {
        return terminationType;
    }

    public FinancingDetailsEncoder terminationType(TerminationType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TerminationType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: terminationType Value: " + value );
            }
            if (value == TerminationType.NULL_VAL)
            {
                return this;
            }
        }
        return terminationType(value.representation());
    }

    private final MutableDirectBuffer startDate = new UnsafeBuffer();
    private byte[] startDateInternalBuffer = startDate.byteArray();
    private int startDateOffset = 0;
    private int startDateLength = 0;

    /* StartDate = 916 */
    public FinancingDetailsEncoder startDate(final DirectBuffer value, final int offset, final int length)
    {
        startDate.wrap(value);
        startDateOffset = offset;
        startDateLength = length;
        return this;
    }

    /* StartDate = 916 */
    public FinancingDetailsEncoder startDate(final DirectBuffer value, final int length)
    {
        return startDate(value, 0, length);
    }

    /* StartDate = 916 */
    public FinancingDetailsEncoder startDate(final DirectBuffer value)
    {
        return startDate(value, 0, value.capacity());
    }

    /* StartDate = 916 */
    public FinancingDetailsEncoder startDate(final byte[] value, final int offset, final int length)
    {
        startDate.wrap(value);
        startDateOffset = offset;
        startDateLength = length;
        return this;
    }

    /* StartDate = 916 */
    public FinancingDetailsEncoder startDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(startDate, value, offset, length))
        {
            startDateInternalBuffer = startDate.byteArray();
        }
        startDateOffset = 0;
        startDateLength = length;
        return this;
    }

    /* StartDate = 916 */
    public FinancingDetailsEncoder startDate(final byte[] value, final int length)
    {
        return startDate(value, 0, length);
    }

    /* StartDate = 916 */
    public FinancingDetailsEncoder startDate(final byte[] value)
    {
        return startDate(value, 0, value.length);
    }

    /* StartDate = 916 */
    public boolean hasStartDate()
    {
        return startDateLength > 0;
    }

    /* StartDate = 916 */
    public MutableDirectBuffer startDate()
    {
        return startDate;
    }

    /* StartDate = 916 */
    public String startDateAsString()
    {
        return startDate.getStringWithoutLengthAscii(startDateOffset, startDateLength);
    }

    private final MutableDirectBuffer endDate = new UnsafeBuffer();
    private byte[] endDateInternalBuffer = endDate.byteArray();
    private int endDateOffset = 0;
    private int endDateLength = 0;

    /* EndDate = 917 */
    public FinancingDetailsEncoder endDate(final DirectBuffer value, final int offset, final int length)
    {
        endDate.wrap(value);
        endDateOffset = offset;
        endDateLength = length;
        return this;
    }

    /* EndDate = 917 */
    public FinancingDetailsEncoder endDate(final DirectBuffer value, final int length)
    {
        return endDate(value, 0, length);
    }

    /* EndDate = 917 */
    public FinancingDetailsEncoder endDate(final DirectBuffer value)
    {
        return endDate(value, 0, value.capacity());
    }

    /* EndDate = 917 */
    public FinancingDetailsEncoder endDate(final byte[] value, final int offset, final int length)
    {
        endDate.wrap(value);
        endDateOffset = offset;
        endDateLength = length;
        return this;
    }

    /* EndDate = 917 */
    public FinancingDetailsEncoder endDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(endDate, value, offset, length))
        {
            endDateInternalBuffer = endDate.byteArray();
        }
        endDateOffset = 0;
        endDateLength = length;
        return this;
    }

    /* EndDate = 917 */
    public FinancingDetailsEncoder endDate(final byte[] value, final int length)
    {
        return endDate(value, 0, length);
    }

    /* EndDate = 917 */
    public FinancingDetailsEncoder endDate(final byte[] value)
    {
        return endDate(value, 0, value.length);
    }

    /* EndDate = 917 */
    public boolean hasEndDate()
    {
        return endDateLength > 0;
    }

    /* EndDate = 917 */
    public MutableDirectBuffer endDate()
    {
        return endDate;
    }

    /* EndDate = 917 */
    public String endDateAsString()
    {
        return endDate.getStringWithoutLengthAscii(endDateOffset, endDateLength);
    }

    private int deliveryType;

    private boolean hasDeliveryType;

    public boolean hasDeliveryType()
    {
        return hasDeliveryType;
    }

    /* DeliveryType = 919 */
    public FinancingDetailsEncoder deliveryType(int value)
    {
        deliveryType = value;
        hasDeliveryType = true;
        return this;
    }

    /* DeliveryType = 919 */
    public int deliveryType()
    {
        return deliveryType;
    }

    public FinancingDetailsEncoder deliveryType(DeliveryType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DeliveryType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: deliveryType Value: " + value );
            }
            if (value == DeliveryType.NULL_VAL)
            {
                return this;
            }
        }
        return deliveryType(value.representation());
    }

    private final DecimalFloat marginRatio = new DecimalFloat();

    private boolean hasMarginRatio;

    public boolean hasMarginRatio()
    {
        return hasMarginRatio;
    }

    /* MarginRatio = 898 */
    public FinancingDetailsEncoder marginRatio(ReadOnlyDecimalFloat value)
    {
        marginRatio.set(value);
        hasMarginRatio = true;
        return this;
    }

    /* MarginRatio = 898 */
    public FinancingDetailsEncoder marginRatio(long value, int scale)
    {
        marginRatio.set(value, scale);
        hasMarginRatio = true;
        return this;
    }

    /* MarginRatio = 898 */
    public DecimalFloat marginRatio()
    {
        return marginRatio;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (agreementDescLength > 0)
        {
            buffer.putBytes(position, agreementDescHeader, 0, agreementDescHeaderLength);
            position += agreementDescHeaderLength;
            buffer.putBytes(position, agreementDesc, agreementDescOffset, agreementDescLength);
            position += agreementDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (agreementIDLength > 0)
        {
            buffer.putBytes(position, agreementIDHeader, 0, agreementIDHeaderLength);
            position += agreementIDHeaderLength;
            buffer.putBytes(position, agreementID, agreementIDOffset, agreementIDLength);
            position += agreementIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (agreementDateLength > 0)
        {
            buffer.putBytes(position, agreementDateHeader, 0, agreementDateHeaderLength);
            position += agreementDateHeaderLength;
            buffer.putBytes(position, agreementDate, agreementDateOffset, agreementDateLength);
            position += agreementDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (agreementCurrencyLength > 0)
        {
            buffer.putBytes(position, agreementCurrencyHeader, 0, agreementCurrencyHeaderLength);
            position += agreementCurrencyHeaderLength;
            buffer.putBytes(position, agreementCurrency, agreementCurrencyOffset, agreementCurrencyLength);
            position += agreementCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTerminationType)
        {
            buffer.putBytes(position, terminationTypeHeader, 0, terminationTypeHeaderLength);
            position += terminationTypeHeaderLength;
            position += buffer.putIntAscii(position, terminationType);
            buffer.putSeparator(position);
            position++;
        }

        if (startDateLength > 0)
        {
            buffer.putBytes(position, startDateHeader, 0, startDateHeaderLength);
            position += startDateHeaderLength;
            buffer.putBytes(position, startDate, startDateOffset, startDateLength);
            position += startDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (endDateLength > 0)
        {
            buffer.putBytes(position, endDateHeader, 0, endDateHeaderLength);
            position += endDateHeaderLength;
            buffer.putBytes(position, endDate, endDateOffset, endDateLength);
            position += endDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDeliveryType)
        {
            buffer.putBytes(position, deliveryTypeHeader, 0, deliveryTypeHeaderLength);
            position += deliveryTypeHeaderLength;
            position += buffer.putIntAscii(position, deliveryType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMarginRatio)
        {
            buffer.putBytes(position, marginRatioHeader, 0, marginRatioHeaderLength);
            position += marginRatioHeaderLength;
            position += buffer.putFloatAscii(position, marginRatio);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetAgreementDesc();
        this.resetAgreementID();
        this.resetAgreementDate();
        this.resetAgreementCurrency();
        this.resetTerminationType();
        this.resetStartDate();
        this.resetEndDate();
        this.resetDeliveryType();
        this.resetMarginRatio();
    }

    public void resetAgreementDesc()
    {
        agreementDescLength = 0;
        agreementDesc.wrap(agreementDescInternalBuffer);
    }

    public void resetAgreementID()
    {
        agreementIDLength = 0;
        agreementID.wrap(agreementIDInternalBuffer);
    }

    public void resetAgreementDate()
    {
        agreementDateLength = 0;
        agreementDate.wrap(agreementDateInternalBuffer);
    }

    public void resetAgreementCurrency()
    {
        agreementCurrencyLength = 0;
        agreementCurrency.wrap(agreementCurrencyInternalBuffer);
    }

    public void resetTerminationType()
    {
        hasTerminationType = false;
    }

    public void resetStartDate()
    {
        startDateLength = 0;
        startDate.wrap(startDateInternalBuffer);
    }

    public void resetEndDate()
    {
        endDateLength = 0;
        endDate.wrap(endDateInternalBuffer);
    }

    public void resetDeliveryType()
    {
        hasDeliveryType = false;
    }

    public void resetMarginRatio()
    {
        hasMarginRatio = false;
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
        builder.append("\"MessageName\": \"FinancingDetails\",\n");
        if (hasAgreementDesc())
        {
            indent(builder, level);
            builder.append("\"AgreementDesc\": \"");
            appendBuffer(builder, agreementDesc, agreementDescOffset, agreementDescLength);
            builder.append("\",\n");
        }

        if (hasAgreementID())
        {
            indent(builder, level);
            builder.append("\"AgreementID\": \"");
            appendBuffer(builder, agreementID, agreementIDOffset, agreementIDLength);
            builder.append("\",\n");
        }

        if (hasAgreementDate())
        {
            indent(builder, level);
            builder.append("\"AgreementDate\": \"");
            appendBuffer(builder, agreementDate, agreementDateOffset, agreementDateLength);
            builder.append("\",\n");
        }

        if (hasAgreementCurrency())
        {
            indent(builder, level);
            builder.append("\"AgreementCurrency\": \"");
            appendBuffer(builder, agreementCurrency, agreementCurrencyOffset, agreementCurrencyLength);
            builder.append("\",\n");
        }

        if (hasTerminationType())
        {
            indent(builder, level);
            builder.append("\"TerminationType\": \"");
            builder.append(terminationType);
            builder.append("\",\n");
        }

        if (hasStartDate())
        {
            indent(builder, level);
            builder.append("\"StartDate\": \"");
            appendBuffer(builder, startDate, startDateOffset, startDateLength);
            builder.append("\",\n");
        }

        if (hasEndDate())
        {
            indent(builder, level);
            builder.append("\"EndDate\": \"");
            appendBuffer(builder, endDate, endDateOffset, endDateLength);
            builder.append("\",\n");
        }

        if (hasDeliveryType())
        {
            indent(builder, level);
            builder.append("\"DeliveryType\": \"");
            builder.append(deliveryType);
            builder.append("\",\n");
        }

        if (hasMarginRatio())
        {
            indent(builder, level);
            builder.append("\"MarginRatio\": \"");
            marginRatio.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public FinancingDetailsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((FinancingDetailsEncoder)encoder);
    }

    public FinancingDetailsEncoder copyTo(final FinancingDetailsEncoder encoder)
    {
        encoder.reset();
        if (hasAgreementDesc())
        {
            encoder.agreementDescAsCopy(agreementDesc.byteArray(), 0, agreementDescLength);
        }

        if (hasAgreementID())
        {
            encoder.agreementIDAsCopy(agreementID.byteArray(), 0, agreementIDLength);
        }

        if (hasAgreementDate())
        {
            encoder.agreementDateAsCopy(agreementDate.byteArray(), 0, agreementDateLength);
        }

        if (hasAgreementCurrency())
        {
            encoder.agreementCurrencyAsCopy(agreementCurrency.byteArray(), 0, agreementCurrencyLength);
        }

        if (hasTerminationType())
        {
            encoder.terminationType(this.terminationType());
        }

        if (hasStartDate())
        {
            encoder.startDateAsCopy(startDate.byteArray(), 0, startDateLength);
        }

        if (hasEndDate())
        {
            encoder.endDateAsCopy(endDate.byteArray(), 0, endDateLength);
        }

        if (hasDeliveryType())
        {
            encoder.deliveryType(this.deliveryType());
        }

        if (hasMarginRatio())
        {
            encoder.marginRatio(this.marginRatio());
        }
        return encoder;
    }

}
