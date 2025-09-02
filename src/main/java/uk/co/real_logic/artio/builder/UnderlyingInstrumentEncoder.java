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
public class UnderlyingInstrumentEncoder
{
    private static final int underlyingSymbolHeaderLength = 4;
    private static final byte[] underlyingSymbolHeader = new byte[] {51, 49, 49, (byte) '='};

    private static final int underlyingSymbolSfxHeaderLength = 4;
    private static final byte[] underlyingSymbolSfxHeader = new byte[] {51, 49, 50, (byte) '='};

    private static final int underlyingSecurityIDHeaderLength = 4;
    private static final byte[] underlyingSecurityIDHeader = new byte[] {51, 48, 57, (byte) '='};

    private static final int underlyingSecurityIDSourceHeaderLength = 4;
    private static final byte[] underlyingSecurityIDSourceHeader = new byte[] {51, 48, 53, (byte) '='};

    private static final int noUnderlyingSecurityAltIDGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingSecurityAltIDGroupCounterHeader = new byte[] {52, 53, 55, (byte) '='};

    private static final int underlyingProductHeaderLength = 4;
    private static final byte[] underlyingProductHeader = new byte[] {52, 54, 50, (byte) '='};

    private static final int underlyingCFICodeHeaderLength = 4;
    private static final byte[] underlyingCFICodeHeader = new byte[] {52, 54, 51, (byte) '='};

    private static final int underlyingSecurityTypeHeaderLength = 4;
    private static final byte[] underlyingSecurityTypeHeader = new byte[] {51, 49, 48, (byte) '='};

    private static final int underlyingSecuritySubTypeHeaderLength = 4;
    private static final byte[] underlyingSecuritySubTypeHeader = new byte[] {55, 54, 51, (byte) '='};

    private static final int underlyingMaturityMonthYearHeaderLength = 4;
    private static final byte[] underlyingMaturityMonthYearHeader = new byte[] {51, 49, 51, (byte) '='};

    private static final int underlyingMaturityDateHeaderLength = 4;
    private static final byte[] underlyingMaturityDateHeader = new byte[] {53, 52, 50, (byte) '='};

    private static final int underlyingPutOrCallHeaderLength = 4;
    private static final byte[] underlyingPutOrCallHeader = new byte[] {51, 49, 53, (byte) '='};

    private static final int underlyingCouponPaymentDateHeaderLength = 4;
    private static final byte[] underlyingCouponPaymentDateHeader = new byte[] {50, 52, 49, (byte) '='};

    private static final int underlyingIssueDateHeaderLength = 4;
    private static final byte[] underlyingIssueDateHeader = new byte[] {50, 52, 50, (byte) '='};

    private static final int underlyingRepoCollateralSecurityTypeHeaderLength = 4;
    private static final byte[] underlyingRepoCollateralSecurityTypeHeader = new byte[] {50, 52, 51, (byte) '='};

    private static final int underlyingRepurchaseTermHeaderLength = 4;
    private static final byte[] underlyingRepurchaseTermHeader = new byte[] {50, 52, 52, (byte) '='};

    private static final int underlyingRepurchaseRateHeaderLength = 4;
    private static final byte[] underlyingRepurchaseRateHeader = new byte[] {50, 52, 53, (byte) '='};

    private static final int underlyingFactorHeaderLength = 4;
    private static final byte[] underlyingFactorHeader = new byte[] {50, 52, 54, (byte) '='};

    private static final int underlyingCreditRatingHeaderLength = 4;
    private static final byte[] underlyingCreditRatingHeader = new byte[] {50, 53, 54, (byte) '='};

    private static final int underlyingInstrRegistryHeaderLength = 4;
    private static final byte[] underlyingInstrRegistryHeader = new byte[] {53, 57, 53, (byte) '='};

    private static final int underlyingCountryOfIssueHeaderLength = 4;
    private static final byte[] underlyingCountryOfIssueHeader = new byte[] {53, 57, 50, (byte) '='};

    private static final int underlyingStateOrProvinceOfIssueHeaderLength = 4;
    private static final byte[] underlyingStateOrProvinceOfIssueHeader = new byte[] {53, 57, 51, (byte) '='};

    private static final int underlyingLocaleOfIssueHeaderLength = 4;
    private static final byte[] underlyingLocaleOfIssueHeader = new byte[] {53, 57, 52, (byte) '='};

    private static final int underlyingRedemptionDateHeaderLength = 4;
    private static final byte[] underlyingRedemptionDateHeader = new byte[] {50, 52, 55, (byte) '='};

    private static final int underlyingStrikePriceHeaderLength = 4;
    private static final byte[] underlyingStrikePriceHeader = new byte[] {51, 49, 54, (byte) '='};

    private static final int underlyingStrikeCurrencyHeaderLength = 4;
    private static final byte[] underlyingStrikeCurrencyHeader = new byte[] {57, 52, 49, (byte) '='};

    private static final int underlyingOptAttributeHeaderLength = 4;
    private static final byte[] underlyingOptAttributeHeader = new byte[] {51, 49, 55, (byte) '='};

    private static final int underlyingContractMultiplierHeaderLength = 4;
    private static final byte[] underlyingContractMultiplierHeader = new byte[] {52, 51, 54, (byte) '='};

    private static final int underlyingCouponRateHeaderLength = 4;
    private static final byte[] underlyingCouponRateHeader = new byte[] {52, 51, 53, (byte) '='};

    private static final int underlyingSecurityExchangeHeaderLength = 4;
    private static final byte[] underlyingSecurityExchangeHeader = new byte[] {51, 48, 56, (byte) '='};

    private static final int underlyingIssuerHeaderLength = 4;
    private static final byte[] underlyingIssuerHeader = new byte[] {51, 48, 54, (byte) '='};

    private static final int encodedUnderlyingIssuerLenHeaderLength = 4;
    private static final byte[] encodedUnderlyingIssuerLenHeader = new byte[] {51, 54, 50, (byte) '='};

    private static final int encodedUnderlyingIssuerHeaderLength = 4;
    private static final byte[] encodedUnderlyingIssuerHeader = new byte[] {51, 54, 51, (byte) '='};

    private static final int underlyingSecurityDescHeaderLength = 4;
    private static final byte[] underlyingSecurityDescHeader = new byte[] {51, 48, 55, (byte) '='};

    private static final int encodedUnderlyingSecurityDescLenHeaderLength = 4;
    private static final byte[] encodedUnderlyingSecurityDescLenHeader = new byte[] {51, 54, 52, (byte) '='};

    private static final int encodedUnderlyingSecurityDescHeaderLength = 4;
    private static final byte[] encodedUnderlyingSecurityDescHeader = new byte[] {51, 54, 53, (byte) '='};

    private static final int underlyingCPProgramHeaderLength = 4;
    private static final byte[] underlyingCPProgramHeader = new byte[] {56, 55, 55, (byte) '='};

    private static final int underlyingCPRegTypeHeaderLength = 4;
    private static final byte[] underlyingCPRegTypeHeader = new byte[] {56, 55, 56, (byte) '='};

    private static final int underlyingCurrencyHeaderLength = 4;
    private static final byte[] underlyingCurrencyHeader = new byte[] {51, 49, 56, (byte) '='};

    private static final int underlyingQtyHeaderLength = 4;
    private static final byte[] underlyingQtyHeader = new byte[] {56, 55, 57, (byte) '='};

    private static final int underlyingPxHeaderLength = 4;
    private static final byte[] underlyingPxHeader = new byte[] {56, 49, 48, (byte) '='};

    private static final int underlyingDirtyPriceHeaderLength = 4;
    private static final byte[] underlyingDirtyPriceHeader = new byte[] {56, 56, 50, (byte) '='};

    private static final int underlyingEndPriceHeaderLength = 4;
    private static final byte[] underlyingEndPriceHeader = new byte[] {56, 56, 51, (byte) '='};

    private static final int underlyingStartValueHeaderLength = 4;
    private static final byte[] underlyingStartValueHeader = new byte[] {56, 56, 52, (byte) '='};

    private static final int underlyingCurrentValueHeaderLength = 4;
    private static final byte[] underlyingCurrentValueHeader = new byte[] {56, 56, 53, (byte) '='};

    private static final int underlyingEndValueHeaderLength = 4;
    private static final byte[] underlyingEndValueHeader = new byte[] {56, 56, 54, (byte) '='};

    private final MutableDirectBuffer underlyingSymbol = new UnsafeBuffer();
    private byte[] underlyingSymbolInternalBuffer = underlyingSymbol.byteArray();
    private int underlyingSymbolOffset = 0;
    private int underlyingSymbolLength = 0;

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSymbol.wrap(value);
        underlyingSymbolOffset = offset;
        underlyingSymbolLength = length;
        return this;
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final DirectBuffer value, final int length)
    {
        return underlyingSymbol(value, 0, length);
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final DirectBuffer value)
    {
        return underlyingSymbol(value, 0, value.capacity());
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final byte[] value, final int offset, final int length)
    {
        underlyingSymbol.wrap(value);
        underlyingSymbolOffset = offset;
        underlyingSymbolLength = length;
        return this;
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbolAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSymbol, value, offset, length))
        {
            underlyingSymbolInternalBuffer = underlyingSymbol.byteArray();
        }
        underlyingSymbolOffset = 0;
        underlyingSymbolLength = length;
        return this;
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final byte[] value, final int length)
    {
        return underlyingSymbol(value, 0, length);
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final byte[] value)
    {
        return underlyingSymbol(value, 0, value.length);
    }

    /* UnderlyingSymbol = 311 */
    public boolean hasUnderlyingSymbol()
    {
        return underlyingSymbolLength > 0;
    }

    /* UnderlyingSymbol = 311 */
    public MutableDirectBuffer underlyingSymbol()
    {
        return underlyingSymbol;
    }

    /* UnderlyingSymbol = 311 */
    public String underlyingSymbolAsString()
    {
        return underlyingSymbol.getStringWithoutLengthAscii(underlyingSymbolOffset, underlyingSymbolLength);
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final CharSequence value)
    {
        if (toBytes(value, underlyingSymbol))
        {
            underlyingSymbolInternalBuffer = underlyingSymbol.byteArray();
        }
        underlyingSymbolOffset = 0;
        underlyingSymbolLength = value.length();
        return this;
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSymbol.wrap(buffer);
            underlyingSymbolOffset = value.offset();
            underlyingSymbolLength = value.length();
        }
        return this;
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final char[] value)
    {
        return underlyingSymbol(value, 0, value.length);
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final char[] value, final int length)
    {
        return underlyingSymbol(value, 0, length);
    }

    /* UnderlyingSymbol = 311 */
    public UnderlyingInstrumentEncoder underlyingSymbol(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSymbol, offset, length))
        {
            underlyingSymbolInternalBuffer = underlyingSymbol.byteArray();
        }
        underlyingSymbolOffset = 0;
        underlyingSymbolLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingSymbolSfx = new UnsafeBuffer();
    private byte[] underlyingSymbolSfxInternalBuffer = underlyingSymbolSfx.byteArray();
    private int underlyingSymbolSfxOffset = 0;
    private int underlyingSymbolSfxLength = 0;

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSymbolSfx.wrap(value);
        underlyingSymbolSfxOffset = offset;
        underlyingSymbolSfxLength = length;
        return this;
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final DirectBuffer value, final int length)
    {
        return underlyingSymbolSfx(value, 0, length);
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final DirectBuffer value)
    {
        return underlyingSymbolSfx(value, 0, value.capacity());
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final byte[] value, final int offset, final int length)
    {
        underlyingSymbolSfx.wrap(value);
        underlyingSymbolSfxOffset = offset;
        underlyingSymbolSfxLength = length;
        return this;
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfxAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSymbolSfx, value, offset, length))
        {
            underlyingSymbolSfxInternalBuffer = underlyingSymbolSfx.byteArray();
        }
        underlyingSymbolSfxOffset = 0;
        underlyingSymbolSfxLength = length;
        return this;
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final byte[] value, final int length)
    {
        return underlyingSymbolSfx(value, 0, length);
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final byte[] value)
    {
        return underlyingSymbolSfx(value, 0, value.length);
    }

    /* UnderlyingSymbolSfx = 312 */
    public boolean hasUnderlyingSymbolSfx()
    {
        return underlyingSymbolSfxLength > 0;
    }

    /* UnderlyingSymbolSfx = 312 */
    public MutableDirectBuffer underlyingSymbolSfx()
    {
        return underlyingSymbolSfx;
    }

    /* UnderlyingSymbolSfx = 312 */
    public String underlyingSymbolSfxAsString()
    {
        return underlyingSymbolSfx.getStringWithoutLengthAscii(underlyingSymbolSfxOffset, underlyingSymbolSfxLength);
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final CharSequence value)
    {
        if (toBytes(value, underlyingSymbolSfx))
        {
            underlyingSymbolSfxInternalBuffer = underlyingSymbolSfx.byteArray();
        }
        underlyingSymbolSfxOffset = 0;
        underlyingSymbolSfxLength = value.length();
        return this;
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSymbolSfx.wrap(buffer);
            underlyingSymbolSfxOffset = value.offset();
            underlyingSymbolSfxLength = value.length();
        }
        return this;
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final char[] value)
    {
        return underlyingSymbolSfx(value, 0, value.length);
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final char[] value, final int length)
    {
        return underlyingSymbolSfx(value, 0, length);
    }

    /* UnderlyingSymbolSfx = 312 */
    public UnderlyingInstrumentEncoder underlyingSymbolSfx(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSymbolSfx, offset, length))
        {
            underlyingSymbolSfxInternalBuffer = underlyingSymbolSfx.byteArray();
        }
        underlyingSymbolSfxOffset = 0;
        underlyingSymbolSfxLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingSecurityID = new UnsafeBuffer();
    private byte[] underlyingSecurityIDInternalBuffer = underlyingSecurityID.byteArray();
    private int underlyingSecurityIDOffset = 0;
    private int underlyingSecurityIDLength = 0;

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityID.wrap(value);
        underlyingSecurityIDOffset = offset;
        underlyingSecurityIDLength = length;
        return this;
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final DirectBuffer value, final int length)
    {
        return underlyingSecurityID(value, 0, length);
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final DirectBuffer value)
    {
        return underlyingSecurityID(value, 0, value.capacity());
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityID.wrap(value);
        underlyingSecurityIDOffset = offset;
        underlyingSecurityIDLength = length;
        return this;
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecurityID, value, offset, length))
        {
            underlyingSecurityIDInternalBuffer = underlyingSecurityID.byteArray();
        }
        underlyingSecurityIDOffset = 0;
        underlyingSecurityIDLength = length;
        return this;
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final byte[] value, final int length)
    {
        return underlyingSecurityID(value, 0, length);
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final byte[] value)
    {
        return underlyingSecurityID(value, 0, value.length);
    }

    /* UnderlyingSecurityID = 309 */
    public boolean hasUnderlyingSecurityID()
    {
        return underlyingSecurityIDLength > 0;
    }

    /* UnderlyingSecurityID = 309 */
    public MutableDirectBuffer underlyingSecurityID()
    {
        return underlyingSecurityID;
    }

    /* UnderlyingSecurityID = 309 */
    public String underlyingSecurityIDAsString()
    {
        return underlyingSecurityID.getStringWithoutLengthAscii(underlyingSecurityIDOffset, underlyingSecurityIDLength);
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final CharSequence value)
    {
        if (toBytes(value, underlyingSecurityID))
        {
            underlyingSecurityIDInternalBuffer = underlyingSecurityID.byteArray();
        }
        underlyingSecurityIDOffset = 0;
        underlyingSecurityIDLength = value.length();
        return this;
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityID.wrap(buffer);
            underlyingSecurityIDOffset = value.offset();
            underlyingSecurityIDLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final char[] value)
    {
        return underlyingSecurityID(value, 0, value.length);
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final char[] value, final int length)
    {
        return underlyingSecurityID(value, 0, length);
    }

    /* UnderlyingSecurityID = 309 */
    public UnderlyingInstrumentEncoder underlyingSecurityID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecurityID, offset, length))
        {
            underlyingSecurityIDInternalBuffer = underlyingSecurityID.byteArray();
        }
        underlyingSecurityIDOffset = 0;
        underlyingSecurityIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingSecurityIDSource = new UnsafeBuffer();
    private byte[] underlyingSecurityIDSourceInternalBuffer = underlyingSecurityIDSource.byteArray();
    private int underlyingSecurityIDSourceOffset = 0;
    private int underlyingSecurityIDSourceLength = 0;

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityIDSource.wrap(value);
        underlyingSecurityIDSourceOffset = offset;
        underlyingSecurityIDSourceLength = length;
        return this;
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final DirectBuffer value, final int length)
    {
        return underlyingSecurityIDSource(value, 0, length);
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final DirectBuffer value)
    {
        return underlyingSecurityIDSource(value, 0, value.capacity());
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityIDSource.wrap(value);
        underlyingSecurityIDSourceOffset = offset;
        underlyingSecurityIDSourceLength = length;
        return this;
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecurityIDSource, value, offset, length))
        {
            underlyingSecurityIDSourceInternalBuffer = underlyingSecurityIDSource.byteArray();
        }
        underlyingSecurityIDSourceOffset = 0;
        underlyingSecurityIDSourceLength = length;
        return this;
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final byte[] value, final int length)
    {
        return underlyingSecurityIDSource(value, 0, length);
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final byte[] value)
    {
        return underlyingSecurityIDSource(value, 0, value.length);
    }

    /* UnderlyingSecurityIDSource = 305 */
    public boolean hasUnderlyingSecurityIDSource()
    {
        return underlyingSecurityIDSourceLength > 0;
    }

    /* UnderlyingSecurityIDSource = 305 */
    public MutableDirectBuffer underlyingSecurityIDSource()
    {
        return underlyingSecurityIDSource;
    }

    /* UnderlyingSecurityIDSource = 305 */
    public String underlyingSecurityIDSourceAsString()
    {
        return underlyingSecurityIDSource.getStringWithoutLengthAscii(underlyingSecurityIDSourceOffset, underlyingSecurityIDSourceLength);
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final CharSequence value)
    {
        if (toBytes(value, underlyingSecurityIDSource))
        {
            underlyingSecurityIDSourceInternalBuffer = underlyingSecurityIDSource.byteArray();
        }
        underlyingSecurityIDSourceOffset = 0;
        underlyingSecurityIDSourceLength = value.length();
        return this;
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityIDSource.wrap(buffer);
            underlyingSecurityIDSourceOffset = value.offset();
            underlyingSecurityIDSourceLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final char[] value)
    {
        return underlyingSecurityIDSource(value, 0, value.length);
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final char[] value, final int length)
    {
        return underlyingSecurityIDSource(value, 0, length);
    }

    /* UnderlyingSecurityIDSource = 305 */
    public UnderlyingInstrumentEncoder underlyingSecurityIDSource(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecurityIDSource, offset, length))
        {
            underlyingSecurityIDSourceInternalBuffer = underlyingSecurityIDSource.byteArray();
        }
        underlyingSecurityIDSourceOffset = 0;
        underlyingSecurityIDSourceLength = length;
        return this;
    }


@Generated("uk.co.real_logic.artio")
public static class UnderlyingSecurityAltIDGroupEncoder
{
    private UnderlyingSecurityAltIDGroupEncoder next = null;

    public UnderlyingSecurityAltIDGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingSecurityAltIDGroupEncoder();
        }
        return next;
    }

    private static final int underlyingSecurityAltIDHeaderLength = 4;
    private static final byte[] underlyingSecurityAltIDHeader = new byte[] {52, 53, 56, (byte) '='};

    private static final int underlyingSecurityAltIDSourceHeaderLength = 4;
    private static final byte[] underlyingSecurityAltIDSourceHeader = new byte[] {52, 53, 57, (byte) '='};

    private final MutableDirectBuffer underlyingSecurityAltID = new UnsafeBuffer();
    private byte[] underlyingSecurityAltIDInternalBuffer = underlyingSecurityAltID.byteArray();
    private int underlyingSecurityAltIDOffset = 0;
    private int underlyingSecurityAltIDLength = 0;

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityAltID.wrap(value);
        underlyingSecurityAltIDOffset = offset;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final DirectBuffer value, final int length)
    {
        return underlyingSecurityAltID(value, 0, length);
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final DirectBuffer value)
    {
        return underlyingSecurityAltID(value, 0, value.capacity());
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityAltID.wrap(value);
        underlyingSecurityAltIDOffset = offset;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecurityAltID, value, offset, length))
        {
            underlyingSecurityAltIDInternalBuffer = underlyingSecurityAltID.byteArray();
        }
        underlyingSecurityAltIDOffset = 0;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final byte[] value, final int length)
    {
        return underlyingSecurityAltID(value, 0, length);
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final byte[] value)
    {
        return underlyingSecurityAltID(value, 0, value.length);
    }

    /* UnderlyingSecurityAltID = 458 */
    public boolean hasUnderlyingSecurityAltID()
    {
        return underlyingSecurityAltIDLength > 0;
    }

    /* UnderlyingSecurityAltID = 458 */
    public MutableDirectBuffer underlyingSecurityAltID()
    {
        return underlyingSecurityAltID;
    }

    /* UnderlyingSecurityAltID = 458 */
    public String underlyingSecurityAltIDAsString()
    {
        return underlyingSecurityAltID.getStringWithoutLengthAscii(underlyingSecurityAltIDOffset, underlyingSecurityAltIDLength);
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final CharSequence value)
    {
        if (toBytes(value, underlyingSecurityAltID))
        {
            underlyingSecurityAltIDInternalBuffer = underlyingSecurityAltID.byteArray();
        }
        underlyingSecurityAltIDOffset = 0;
        underlyingSecurityAltIDLength = value.length();
        return this;
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityAltID.wrap(buffer);
            underlyingSecurityAltIDOffset = value.offset();
            underlyingSecurityAltIDLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final char[] value)
    {
        return underlyingSecurityAltID(value, 0, value.length);
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final char[] value, final int length)
    {
        return underlyingSecurityAltID(value, 0, length);
    }

    /* UnderlyingSecurityAltID = 458 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecurityAltID, offset, length))
        {
            underlyingSecurityAltIDInternalBuffer = underlyingSecurityAltID.byteArray();
        }
        underlyingSecurityAltIDOffset = 0;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingSecurityAltIDSource = new UnsafeBuffer();
    private byte[] underlyingSecurityAltIDSourceInternalBuffer = underlyingSecurityAltIDSource.byteArray();
    private int underlyingSecurityAltIDSourceOffset = 0;
    private int underlyingSecurityAltIDSourceLength = 0;

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityAltIDSource.wrap(value);
        underlyingSecurityAltIDSourceOffset = offset;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final DirectBuffer value, final int length)
    {
        return underlyingSecurityAltIDSource(value, 0, length);
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final DirectBuffer value)
    {
        return underlyingSecurityAltIDSource(value, 0, value.capacity());
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityAltIDSource.wrap(value);
        underlyingSecurityAltIDSourceOffset = offset;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecurityAltIDSource, value, offset, length))
        {
            underlyingSecurityAltIDSourceInternalBuffer = underlyingSecurityAltIDSource.byteArray();
        }
        underlyingSecurityAltIDSourceOffset = 0;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final byte[] value, final int length)
    {
        return underlyingSecurityAltIDSource(value, 0, length);
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final byte[] value)
    {
        return underlyingSecurityAltIDSource(value, 0, value.length);
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public boolean hasUnderlyingSecurityAltIDSource()
    {
        return underlyingSecurityAltIDSourceLength > 0;
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public MutableDirectBuffer underlyingSecurityAltIDSource()
    {
        return underlyingSecurityAltIDSource;
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public String underlyingSecurityAltIDSourceAsString()
    {
        return underlyingSecurityAltIDSource.getStringWithoutLengthAscii(underlyingSecurityAltIDSourceOffset, underlyingSecurityAltIDSourceLength);
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final CharSequence value)
    {
        if (toBytes(value, underlyingSecurityAltIDSource))
        {
            underlyingSecurityAltIDSourceInternalBuffer = underlyingSecurityAltIDSource.byteArray();
        }
        underlyingSecurityAltIDSourceOffset = 0;
        underlyingSecurityAltIDSourceLength = value.length();
        return this;
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityAltIDSource.wrap(buffer);
            underlyingSecurityAltIDSourceOffset = value.offset();
            underlyingSecurityAltIDSourceLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final char[] value)
    {
        return underlyingSecurityAltIDSource(value, 0, value.length);
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final char[] value, final int length)
    {
        return underlyingSecurityAltIDSource(value, 0, length);
    }

    /* UnderlyingSecurityAltIDSource = 459 */
    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecurityAltIDSource, offset, length))
        {
            underlyingSecurityAltIDSourceInternalBuffer = underlyingSecurityAltIDSource.byteArray();
        }
        underlyingSecurityAltIDSourceOffset = 0;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (underlyingSecurityAltIDLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityAltIDHeader, 0, underlyingSecurityAltIDHeaderLength);
            position += underlyingSecurityAltIDHeaderLength;
            buffer.putBytes(position, underlyingSecurityAltID, underlyingSecurityAltIDOffset, underlyingSecurityAltIDLength);
            position += underlyingSecurityAltIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityAltIDSourceLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityAltIDSourceHeader, 0, underlyingSecurityAltIDSourceHeaderLength);
            position += underlyingSecurityAltIDSourceHeaderLength;
            buffer.putBytes(position, underlyingSecurityAltIDSource, underlyingSecurityAltIDSourceOffset, underlyingSecurityAltIDSourceLength);
            position += underlyingSecurityAltIDSourceLength;
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
        this.resetUnderlyingSecurityAltID();
        this.resetUnderlyingSecurityAltIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingSecurityAltID()
    {
        underlyingSecurityAltIDLength = 0;
        underlyingSecurityAltID.wrap(underlyingSecurityAltIDInternalBuffer);
    }

    public void resetUnderlyingSecurityAltIDSource()
    {
        underlyingSecurityAltIDSourceLength = 0;
        underlyingSecurityAltIDSource.wrap(underlyingSecurityAltIDSourceInternalBuffer);
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
        builder.append("\"MessageName\": \"UnderlyingSecurityAltIDGroup\",\n");
        if (hasUnderlyingSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltID\": \"");
            appendBuffer(builder, underlyingSecurityAltID, underlyingSecurityAltIDOffset, underlyingSecurityAltIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltIDSource\": \"");
            appendBuffer(builder, underlyingSecurityAltIDSource, underlyingSecurityAltIDSourceOffset, underlyingSecurityAltIDSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public UnderlyingSecurityAltIDGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingSecurityAltIDGroupEncoder)encoder);
    }

    public UnderlyingSecurityAltIDGroupEncoder copyTo(final UnderlyingSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingSecurityAltID())
        {
            encoder.underlyingSecurityAltIDAsCopy(underlyingSecurityAltID.byteArray(), 0, underlyingSecurityAltIDLength);
        }

        if (hasUnderlyingSecurityAltIDSource())
        {
            encoder.underlyingSecurityAltIDSourceAsCopy(underlyingSecurityAltIDSource.byteArray(), 0, underlyingSecurityAltIDSourceLength);
        }
        return encoder;
    }

}
    private int noUnderlyingSecurityAltIDGroupCounter;

    private boolean hasNoUnderlyingSecurityAltIDGroupCounter;

    public boolean hasNoUnderlyingSecurityAltIDGroupCounter()
    {
        return hasNoUnderlyingSecurityAltIDGroupCounter;
    }

    /* NoUnderlyingSecurityAltIDGroupCounter = 457 */
    public UnderlyingInstrumentEncoder noUnderlyingSecurityAltIDGroupCounter(int value)
    {
        noUnderlyingSecurityAltIDGroupCounter = value;
        hasNoUnderlyingSecurityAltIDGroupCounter = true;
        return this;
    }

    /* NoUnderlyingSecurityAltIDGroupCounter = 457 */
    public int noUnderlyingSecurityAltIDGroupCounter()
    {
        return noUnderlyingSecurityAltIDGroupCounter;
    }


    private UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup = null;

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup(final int numberOfElements)
    {
        hasNoUnderlyingSecurityAltIDGroupCounter = true;
        noUnderlyingSecurityAltIDGroupCounter = numberOfElements;
        if (underlyingSecurityAltIDGroup == null)
        {
            underlyingSecurityAltIDGroup = new UnderlyingSecurityAltIDGroupEncoder();
        }
        return underlyingSecurityAltIDGroup;
    }

    private int underlyingProduct;

    private boolean hasUnderlyingProduct;

    public boolean hasUnderlyingProduct()
    {
        return hasUnderlyingProduct;
    }

    /* UnderlyingProduct = 462 */
    public UnderlyingInstrumentEncoder underlyingProduct(int value)
    {
        underlyingProduct = value;
        hasUnderlyingProduct = true;
        return this;
    }

    /* UnderlyingProduct = 462 */
    public int underlyingProduct()
    {
        return underlyingProduct;
    }

    private final MutableDirectBuffer underlyingCFICode = new UnsafeBuffer();
    private byte[] underlyingCFICodeInternalBuffer = underlyingCFICode.byteArray();
    private int underlyingCFICodeOffset = 0;
    private int underlyingCFICodeLength = 0;

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final DirectBuffer value, final int offset, final int length)
    {
        underlyingCFICode.wrap(value);
        underlyingCFICodeOffset = offset;
        underlyingCFICodeLength = length;
        return this;
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final DirectBuffer value, final int length)
    {
        return underlyingCFICode(value, 0, length);
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final DirectBuffer value)
    {
        return underlyingCFICode(value, 0, value.capacity());
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final byte[] value, final int offset, final int length)
    {
        underlyingCFICode.wrap(value);
        underlyingCFICodeOffset = offset;
        underlyingCFICodeLength = length;
        return this;
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingCFICode, value, offset, length))
        {
            underlyingCFICodeInternalBuffer = underlyingCFICode.byteArray();
        }
        underlyingCFICodeOffset = 0;
        underlyingCFICodeLength = length;
        return this;
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final byte[] value, final int length)
    {
        return underlyingCFICode(value, 0, length);
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final byte[] value)
    {
        return underlyingCFICode(value, 0, value.length);
    }

    /* UnderlyingCFICode = 463 */
    public boolean hasUnderlyingCFICode()
    {
        return underlyingCFICodeLength > 0;
    }

    /* UnderlyingCFICode = 463 */
    public MutableDirectBuffer underlyingCFICode()
    {
        return underlyingCFICode;
    }

    /* UnderlyingCFICode = 463 */
    public String underlyingCFICodeAsString()
    {
        return underlyingCFICode.getStringWithoutLengthAscii(underlyingCFICodeOffset, underlyingCFICodeLength);
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final CharSequence value)
    {
        if (toBytes(value, underlyingCFICode))
        {
            underlyingCFICodeInternalBuffer = underlyingCFICode.byteArray();
        }
        underlyingCFICodeOffset = 0;
        underlyingCFICodeLength = value.length();
        return this;
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingCFICode.wrap(buffer);
            underlyingCFICodeOffset = value.offset();
            underlyingCFICodeLength = value.length();
        }
        return this;
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final char[] value)
    {
        return underlyingCFICode(value, 0, value.length);
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final char[] value, final int length)
    {
        return underlyingCFICode(value, 0, length);
    }

    /* UnderlyingCFICode = 463 */
    public UnderlyingInstrumentEncoder underlyingCFICode(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingCFICode, offset, length))
        {
            underlyingCFICodeInternalBuffer = underlyingCFICode.byteArray();
        }
        underlyingCFICodeOffset = 0;
        underlyingCFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingSecurityType = new UnsafeBuffer();
    private byte[] underlyingSecurityTypeInternalBuffer = underlyingSecurityType.byteArray();
    private int underlyingSecurityTypeOffset = 0;
    private int underlyingSecurityTypeLength = 0;

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityType.wrap(value);
        underlyingSecurityTypeOffset = offset;
        underlyingSecurityTypeLength = length;
        return this;
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final DirectBuffer value, final int length)
    {
        return underlyingSecurityType(value, 0, length);
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final DirectBuffer value)
    {
        return underlyingSecurityType(value, 0, value.capacity());
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityType.wrap(value);
        underlyingSecurityTypeOffset = offset;
        underlyingSecurityTypeLength = length;
        return this;
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecurityType, value, offset, length))
        {
            underlyingSecurityTypeInternalBuffer = underlyingSecurityType.byteArray();
        }
        underlyingSecurityTypeOffset = 0;
        underlyingSecurityTypeLength = length;
        return this;
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final byte[] value, final int length)
    {
        return underlyingSecurityType(value, 0, length);
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final byte[] value)
    {
        return underlyingSecurityType(value, 0, value.length);
    }

    /* UnderlyingSecurityType = 310 */
    public boolean hasUnderlyingSecurityType()
    {
        return underlyingSecurityTypeLength > 0;
    }

    /* UnderlyingSecurityType = 310 */
    public MutableDirectBuffer underlyingSecurityType()
    {
        return underlyingSecurityType;
    }

    /* UnderlyingSecurityType = 310 */
    public String underlyingSecurityTypeAsString()
    {
        return underlyingSecurityType.getStringWithoutLengthAscii(underlyingSecurityTypeOffset, underlyingSecurityTypeLength);
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final CharSequence value)
    {
        if (toBytes(value, underlyingSecurityType))
        {
            underlyingSecurityTypeInternalBuffer = underlyingSecurityType.byteArray();
        }
        underlyingSecurityTypeOffset = 0;
        underlyingSecurityTypeLength = value.length();
        return this;
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityType.wrap(buffer);
            underlyingSecurityTypeOffset = value.offset();
            underlyingSecurityTypeLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final char[] value)
    {
        return underlyingSecurityType(value, 0, value.length);
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final char[] value, final int length)
    {
        return underlyingSecurityType(value, 0, length);
    }

    /* UnderlyingSecurityType = 310 */
    public UnderlyingInstrumentEncoder underlyingSecurityType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecurityType, offset, length))
        {
            underlyingSecurityTypeInternalBuffer = underlyingSecurityType.byteArray();
        }
        underlyingSecurityTypeOffset = 0;
        underlyingSecurityTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingSecuritySubType = new UnsafeBuffer();
    private byte[] underlyingSecuritySubTypeInternalBuffer = underlyingSecuritySubType.byteArray();
    private int underlyingSecuritySubTypeOffset = 0;
    private int underlyingSecuritySubTypeLength = 0;

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecuritySubType.wrap(value);
        underlyingSecuritySubTypeOffset = offset;
        underlyingSecuritySubTypeLength = length;
        return this;
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final DirectBuffer value, final int length)
    {
        return underlyingSecuritySubType(value, 0, length);
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final DirectBuffer value)
    {
        return underlyingSecuritySubType(value, 0, value.capacity());
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final byte[] value, final int offset, final int length)
    {
        underlyingSecuritySubType.wrap(value);
        underlyingSecuritySubTypeOffset = offset;
        underlyingSecuritySubTypeLength = length;
        return this;
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecuritySubType, value, offset, length))
        {
            underlyingSecuritySubTypeInternalBuffer = underlyingSecuritySubType.byteArray();
        }
        underlyingSecuritySubTypeOffset = 0;
        underlyingSecuritySubTypeLength = length;
        return this;
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final byte[] value, final int length)
    {
        return underlyingSecuritySubType(value, 0, length);
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final byte[] value)
    {
        return underlyingSecuritySubType(value, 0, value.length);
    }

    /* UnderlyingSecuritySubType = 763 */
    public boolean hasUnderlyingSecuritySubType()
    {
        return underlyingSecuritySubTypeLength > 0;
    }

    /* UnderlyingSecuritySubType = 763 */
    public MutableDirectBuffer underlyingSecuritySubType()
    {
        return underlyingSecuritySubType;
    }

    /* UnderlyingSecuritySubType = 763 */
    public String underlyingSecuritySubTypeAsString()
    {
        return underlyingSecuritySubType.getStringWithoutLengthAscii(underlyingSecuritySubTypeOffset, underlyingSecuritySubTypeLength);
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final CharSequence value)
    {
        if (toBytes(value, underlyingSecuritySubType))
        {
            underlyingSecuritySubTypeInternalBuffer = underlyingSecuritySubType.byteArray();
        }
        underlyingSecuritySubTypeOffset = 0;
        underlyingSecuritySubTypeLength = value.length();
        return this;
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecuritySubType.wrap(buffer);
            underlyingSecuritySubTypeOffset = value.offset();
            underlyingSecuritySubTypeLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final char[] value)
    {
        return underlyingSecuritySubType(value, 0, value.length);
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final char[] value, final int length)
    {
        return underlyingSecuritySubType(value, 0, length);
    }

    /* UnderlyingSecuritySubType = 763 */
    public UnderlyingInstrumentEncoder underlyingSecuritySubType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecuritySubType, offset, length))
        {
            underlyingSecuritySubTypeInternalBuffer = underlyingSecuritySubType.byteArray();
        }
        underlyingSecuritySubTypeOffset = 0;
        underlyingSecuritySubTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingMaturityMonthYear = new UnsafeBuffer();
    private byte[] underlyingMaturityMonthYearInternalBuffer = underlyingMaturityMonthYear.byteArray();
    private int underlyingMaturityMonthYearOffset = 0;
    private int underlyingMaturityMonthYearLength = 0;

    /* UnderlyingMaturityMonthYear = 313 */
    public UnderlyingInstrumentEncoder underlyingMaturityMonthYear(final DirectBuffer value, final int offset, final int length)
    {
        underlyingMaturityMonthYear.wrap(value);
        underlyingMaturityMonthYearOffset = offset;
        underlyingMaturityMonthYearLength = length;
        return this;
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public UnderlyingInstrumentEncoder underlyingMaturityMonthYear(final DirectBuffer value, final int length)
    {
        return underlyingMaturityMonthYear(value, 0, length);
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public UnderlyingInstrumentEncoder underlyingMaturityMonthYear(final DirectBuffer value)
    {
        return underlyingMaturityMonthYear(value, 0, value.capacity());
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public UnderlyingInstrumentEncoder underlyingMaturityMonthYear(final byte[] value, final int offset, final int length)
    {
        underlyingMaturityMonthYear.wrap(value);
        underlyingMaturityMonthYearOffset = offset;
        underlyingMaturityMonthYearLength = length;
        return this;
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public UnderlyingInstrumentEncoder underlyingMaturityMonthYearAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingMaturityMonthYear, value, offset, length))
        {
            underlyingMaturityMonthYearInternalBuffer = underlyingMaturityMonthYear.byteArray();
        }
        underlyingMaturityMonthYearOffset = 0;
        underlyingMaturityMonthYearLength = length;
        return this;
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public UnderlyingInstrumentEncoder underlyingMaturityMonthYear(final byte[] value, final int length)
    {
        return underlyingMaturityMonthYear(value, 0, length);
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public UnderlyingInstrumentEncoder underlyingMaturityMonthYear(final byte[] value)
    {
        return underlyingMaturityMonthYear(value, 0, value.length);
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public boolean hasUnderlyingMaturityMonthYear()
    {
        return underlyingMaturityMonthYearLength > 0;
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public MutableDirectBuffer underlyingMaturityMonthYear()
    {
        return underlyingMaturityMonthYear;
    }

    /* UnderlyingMaturityMonthYear = 313 */
    public String underlyingMaturityMonthYearAsString()
    {
        return underlyingMaturityMonthYear.getStringWithoutLengthAscii(underlyingMaturityMonthYearOffset, underlyingMaturityMonthYearLength);
    }

    private final MutableDirectBuffer underlyingMaturityDate = new UnsafeBuffer();
    private byte[] underlyingMaturityDateInternalBuffer = underlyingMaturityDate.byteArray();
    private int underlyingMaturityDateOffset = 0;
    private int underlyingMaturityDateLength = 0;

    /* UnderlyingMaturityDate = 542 */
    public UnderlyingInstrumentEncoder underlyingMaturityDate(final DirectBuffer value, final int offset, final int length)
    {
        underlyingMaturityDate.wrap(value);
        underlyingMaturityDateOffset = offset;
        underlyingMaturityDateLength = length;
        return this;
    }

    /* UnderlyingMaturityDate = 542 */
    public UnderlyingInstrumentEncoder underlyingMaturityDate(final DirectBuffer value, final int length)
    {
        return underlyingMaturityDate(value, 0, length);
    }

    /* UnderlyingMaturityDate = 542 */
    public UnderlyingInstrumentEncoder underlyingMaturityDate(final DirectBuffer value)
    {
        return underlyingMaturityDate(value, 0, value.capacity());
    }

    /* UnderlyingMaturityDate = 542 */
    public UnderlyingInstrumentEncoder underlyingMaturityDate(final byte[] value, final int offset, final int length)
    {
        underlyingMaturityDate.wrap(value);
        underlyingMaturityDateOffset = offset;
        underlyingMaturityDateLength = length;
        return this;
    }

    /* UnderlyingMaturityDate = 542 */
    public UnderlyingInstrumentEncoder underlyingMaturityDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingMaturityDate, value, offset, length))
        {
            underlyingMaturityDateInternalBuffer = underlyingMaturityDate.byteArray();
        }
        underlyingMaturityDateOffset = 0;
        underlyingMaturityDateLength = length;
        return this;
    }

    /* UnderlyingMaturityDate = 542 */
    public UnderlyingInstrumentEncoder underlyingMaturityDate(final byte[] value, final int length)
    {
        return underlyingMaturityDate(value, 0, length);
    }

    /* UnderlyingMaturityDate = 542 */
    public UnderlyingInstrumentEncoder underlyingMaturityDate(final byte[] value)
    {
        return underlyingMaturityDate(value, 0, value.length);
    }

    /* UnderlyingMaturityDate = 542 */
    public boolean hasUnderlyingMaturityDate()
    {
        return underlyingMaturityDateLength > 0;
    }

    /* UnderlyingMaturityDate = 542 */
    public MutableDirectBuffer underlyingMaturityDate()
    {
        return underlyingMaturityDate;
    }

    /* UnderlyingMaturityDate = 542 */
    public String underlyingMaturityDateAsString()
    {
        return underlyingMaturityDate.getStringWithoutLengthAscii(underlyingMaturityDateOffset, underlyingMaturityDateLength);
    }

    private int underlyingPutOrCall;

    private boolean hasUnderlyingPutOrCall;

    public boolean hasUnderlyingPutOrCall()
    {
        return hasUnderlyingPutOrCall;
    }

    /* UnderlyingPutOrCall = 315 */
    public UnderlyingInstrumentEncoder underlyingPutOrCall(int value)
    {
        underlyingPutOrCall = value;
        hasUnderlyingPutOrCall = true;
        return this;
    }

    /* UnderlyingPutOrCall = 315 */
    public int underlyingPutOrCall()
    {
        return underlyingPutOrCall;
    }

    public UnderlyingInstrumentEncoder underlyingPutOrCall(UnderlyingPutOrCall value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == UnderlyingPutOrCall.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: underlyingPutOrCall Value: " + value );
            }
            if (value == UnderlyingPutOrCall.NULL_VAL)
            {
                return this;
            }
        }
        return underlyingPutOrCall(value.representation());
    }

    private final MutableDirectBuffer underlyingCouponPaymentDate = new UnsafeBuffer();
    private byte[] underlyingCouponPaymentDateInternalBuffer = underlyingCouponPaymentDate.byteArray();
    private int underlyingCouponPaymentDateOffset = 0;
    private int underlyingCouponPaymentDateLength = 0;

    /* UnderlyingCouponPaymentDate = 241 */
    public UnderlyingInstrumentEncoder underlyingCouponPaymentDate(final DirectBuffer value, final int offset, final int length)
    {
        underlyingCouponPaymentDate.wrap(value);
        underlyingCouponPaymentDateOffset = offset;
        underlyingCouponPaymentDateLength = length;
        return this;
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public UnderlyingInstrumentEncoder underlyingCouponPaymentDate(final DirectBuffer value, final int length)
    {
        return underlyingCouponPaymentDate(value, 0, length);
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public UnderlyingInstrumentEncoder underlyingCouponPaymentDate(final DirectBuffer value)
    {
        return underlyingCouponPaymentDate(value, 0, value.capacity());
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public UnderlyingInstrumentEncoder underlyingCouponPaymentDate(final byte[] value, final int offset, final int length)
    {
        underlyingCouponPaymentDate.wrap(value);
        underlyingCouponPaymentDateOffset = offset;
        underlyingCouponPaymentDateLength = length;
        return this;
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public UnderlyingInstrumentEncoder underlyingCouponPaymentDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingCouponPaymentDate, value, offset, length))
        {
            underlyingCouponPaymentDateInternalBuffer = underlyingCouponPaymentDate.byteArray();
        }
        underlyingCouponPaymentDateOffset = 0;
        underlyingCouponPaymentDateLength = length;
        return this;
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public UnderlyingInstrumentEncoder underlyingCouponPaymentDate(final byte[] value, final int length)
    {
        return underlyingCouponPaymentDate(value, 0, length);
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public UnderlyingInstrumentEncoder underlyingCouponPaymentDate(final byte[] value)
    {
        return underlyingCouponPaymentDate(value, 0, value.length);
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public boolean hasUnderlyingCouponPaymentDate()
    {
        return underlyingCouponPaymentDateLength > 0;
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public MutableDirectBuffer underlyingCouponPaymentDate()
    {
        return underlyingCouponPaymentDate;
    }

    /* UnderlyingCouponPaymentDate = 241 */
    public String underlyingCouponPaymentDateAsString()
    {
        return underlyingCouponPaymentDate.getStringWithoutLengthAscii(underlyingCouponPaymentDateOffset, underlyingCouponPaymentDateLength);
    }

    private final MutableDirectBuffer underlyingIssueDate = new UnsafeBuffer();
    private byte[] underlyingIssueDateInternalBuffer = underlyingIssueDate.byteArray();
    private int underlyingIssueDateOffset = 0;
    private int underlyingIssueDateLength = 0;

    /* UnderlyingIssueDate = 242 */
    public UnderlyingInstrumentEncoder underlyingIssueDate(final DirectBuffer value, final int offset, final int length)
    {
        underlyingIssueDate.wrap(value);
        underlyingIssueDateOffset = offset;
        underlyingIssueDateLength = length;
        return this;
    }

    /* UnderlyingIssueDate = 242 */
    public UnderlyingInstrumentEncoder underlyingIssueDate(final DirectBuffer value, final int length)
    {
        return underlyingIssueDate(value, 0, length);
    }

    /* UnderlyingIssueDate = 242 */
    public UnderlyingInstrumentEncoder underlyingIssueDate(final DirectBuffer value)
    {
        return underlyingIssueDate(value, 0, value.capacity());
    }

    /* UnderlyingIssueDate = 242 */
    public UnderlyingInstrumentEncoder underlyingIssueDate(final byte[] value, final int offset, final int length)
    {
        underlyingIssueDate.wrap(value);
        underlyingIssueDateOffset = offset;
        underlyingIssueDateLength = length;
        return this;
    }

    /* UnderlyingIssueDate = 242 */
    public UnderlyingInstrumentEncoder underlyingIssueDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingIssueDate, value, offset, length))
        {
            underlyingIssueDateInternalBuffer = underlyingIssueDate.byteArray();
        }
        underlyingIssueDateOffset = 0;
        underlyingIssueDateLength = length;
        return this;
    }

    /* UnderlyingIssueDate = 242 */
    public UnderlyingInstrumentEncoder underlyingIssueDate(final byte[] value, final int length)
    {
        return underlyingIssueDate(value, 0, length);
    }

    /* UnderlyingIssueDate = 242 */
    public UnderlyingInstrumentEncoder underlyingIssueDate(final byte[] value)
    {
        return underlyingIssueDate(value, 0, value.length);
    }

    /* UnderlyingIssueDate = 242 */
    public boolean hasUnderlyingIssueDate()
    {
        return underlyingIssueDateLength > 0;
    }

    /* UnderlyingIssueDate = 242 */
    public MutableDirectBuffer underlyingIssueDate()
    {
        return underlyingIssueDate;
    }

    /* UnderlyingIssueDate = 242 */
    public String underlyingIssueDateAsString()
    {
        return underlyingIssueDate.getStringWithoutLengthAscii(underlyingIssueDateOffset, underlyingIssueDateLength);
    }

    private final MutableDirectBuffer underlyingRepoCollateralSecurityType = new UnsafeBuffer();
    private byte[] underlyingRepoCollateralSecurityTypeInternalBuffer = underlyingRepoCollateralSecurityType.byteArray();
    private int underlyingRepoCollateralSecurityTypeOffset = 0;
    private int underlyingRepoCollateralSecurityTypeLength = 0;

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final DirectBuffer value, final int offset, final int length)
    {
        underlyingRepoCollateralSecurityType.wrap(value);
        underlyingRepoCollateralSecurityTypeOffset = offset;
        underlyingRepoCollateralSecurityTypeLength = length;
        return this;
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final DirectBuffer value, final int length)
    {
        return underlyingRepoCollateralSecurityType(value, 0, length);
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final DirectBuffer value)
    {
        return underlyingRepoCollateralSecurityType(value, 0, value.capacity());
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final byte[] value, final int offset, final int length)
    {
        underlyingRepoCollateralSecurityType.wrap(value);
        underlyingRepoCollateralSecurityTypeOffset = offset;
        underlyingRepoCollateralSecurityTypeLength = length;
        return this;
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingRepoCollateralSecurityType, value, offset, length))
        {
            underlyingRepoCollateralSecurityTypeInternalBuffer = underlyingRepoCollateralSecurityType.byteArray();
        }
        underlyingRepoCollateralSecurityTypeOffset = 0;
        underlyingRepoCollateralSecurityTypeLength = length;
        return this;
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final byte[] value, final int length)
    {
        return underlyingRepoCollateralSecurityType(value, 0, length);
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final byte[] value)
    {
        return underlyingRepoCollateralSecurityType(value, 0, value.length);
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public boolean hasUnderlyingRepoCollateralSecurityType()
    {
        return underlyingRepoCollateralSecurityTypeLength > 0;
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public MutableDirectBuffer underlyingRepoCollateralSecurityType()
    {
        return underlyingRepoCollateralSecurityType;
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public String underlyingRepoCollateralSecurityTypeAsString()
    {
        return underlyingRepoCollateralSecurityType.getStringWithoutLengthAscii(underlyingRepoCollateralSecurityTypeOffset, underlyingRepoCollateralSecurityTypeLength);
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final CharSequence value)
    {
        if (toBytes(value, underlyingRepoCollateralSecurityType))
        {
            underlyingRepoCollateralSecurityTypeInternalBuffer = underlyingRepoCollateralSecurityType.byteArray();
        }
        underlyingRepoCollateralSecurityTypeOffset = 0;
        underlyingRepoCollateralSecurityTypeLength = value.length();
        return this;
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingRepoCollateralSecurityType.wrap(buffer);
            underlyingRepoCollateralSecurityTypeOffset = value.offset();
            underlyingRepoCollateralSecurityTypeLength = value.length();
        }
        return this;
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final char[] value)
    {
        return underlyingRepoCollateralSecurityType(value, 0, value.length);
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final char[] value, final int length)
    {
        return underlyingRepoCollateralSecurityType(value, 0, length);
    }

    /* UnderlyingRepoCollateralSecurityType = 243 */
    public UnderlyingInstrumentEncoder underlyingRepoCollateralSecurityType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingRepoCollateralSecurityType, offset, length))
        {
            underlyingRepoCollateralSecurityTypeInternalBuffer = underlyingRepoCollateralSecurityType.byteArray();
        }
        underlyingRepoCollateralSecurityTypeOffset = 0;
        underlyingRepoCollateralSecurityTypeLength = length;
        return this;
    }

    private int underlyingRepurchaseTerm;

    private boolean hasUnderlyingRepurchaseTerm;

    public boolean hasUnderlyingRepurchaseTerm()
    {
        return hasUnderlyingRepurchaseTerm;
    }

    /* UnderlyingRepurchaseTerm = 244 */
    public UnderlyingInstrumentEncoder underlyingRepurchaseTerm(int value)
    {
        underlyingRepurchaseTerm = value;
        hasUnderlyingRepurchaseTerm = true;
        return this;
    }

    /* UnderlyingRepurchaseTerm = 244 */
    public int underlyingRepurchaseTerm()
    {
        return underlyingRepurchaseTerm;
    }

    private final DecimalFloat underlyingRepurchaseRate = new DecimalFloat();

    private boolean hasUnderlyingRepurchaseRate;

    public boolean hasUnderlyingRepurchaseRate()
    {
        return hasUnderlyingRepurchaseRate;
    }

    /* UnderlyingRepurchaseRate = 245 */
    public UnderlyingInstrumentEncoder underlyingRepurchaseRate(ReadOnlyDecimalFloat value)
    {
        underlyingRepurchaseRate.set(value);
        hasUnderlyingRepurchaseRate = true;
        return this;
    }

    /* UnderlyingRepurchaseRate = 245 */
    public UnderlyingInstrumentEncoder underlyingRepurchaseRate(long value, int scale)
    {
        underlyingRepurchaseRate.set(value, scale);
        hasUnderlyingRepurchaseRate = true;
        return this;
    }

    /* UnderlyingRepurchaseRate = 245 */
    public DecimalFloat underlyingRepurchaseRate()
    {
        return underlyingRepurchaseRate;
    }

    private final DecimalFloat underlyingFactor = new DecimalFloat();

    private boolean hasUnderlyingFactor;

    public boolean hasUnderlyingFactor()
    {
        return hasUnderlyingFactor;
    }

    /* UnderlyingFactor = 246 */
    public UnderlyingInstrumentEncoder underlyingFactor(ReadOnlyDecimalFloat value)
    {
        underlyingFactor.set(value);
        hasUnderlyingFactor = true;
        return this;
    }

    /* UnderlyingFactor = 246 */
    public UnderlyingInstrumentEncoder underlyingFactor(long value, int scale)
    {
        underlyingFactor.set(value, scale);
        hasUnderlyingFactor = true;
        return this;
    }

    /* UnderlyingFactor = 246 */
    public DecimalFloat underlyingFactor()
    {
        return underlyingFactor;
    }

    private final MutableDirectBuffer underlyingCreditRating = new UnsafeBuffer();
    private byte[] underlyingCreditRatingInternalBuffer = underlyingCreditRating.byteArray();
    private int underlyingCreditRatingOffset = 0;
    private int underlyingCreditRatingLength = 0;

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final DirectBuffer value, final int offset, final int length)
    {
        underlyingCreditRating.wrap(value);
        underlyingCreditRatingOffset = offset;
        underlyingCreditRatingLength = length;
        return this;
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final DirectBuffer value, final int length)
    {
        return underlyingCreditRating(value, 0, length);
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final DirectBuffer value)
    {
        return underlyingCreditRating(value, 0, value.capacity());
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final byte[] value, final int offset, final int length)
    {
        underlyingCreditRating.wrap(value);
        underlyingCreditRatingOffset = offset;
        underlyingCreditRatingLength = length;
        return this;
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRatingAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingCreditRating, value, offset, length))
        {
            underlyingCreditRatingInternalBuffer = underlyingCreditRating.byteArray();
        }
        underlyingCreditRatingOffset = 0;
        underlyingCreditRatingLength = length;
        return this;
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final byte[] value, final int length)
    {
        return underlyingCreditRating(value, 0, length);
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final byte[] value)
    {
        return underlyingCreditRating(value, 0, value.length);
    }

    /* UnderlyingCreditRating = 256 */
    public boolean hasUnderlyingCreditRating()
    {
        return underlyingCreditRatingLength > 0;
    }

    /* UnderlyingCreditRating = 256 */
    public MutableDirectBuffer underlyingCreditRating()
    {
        return underlyingCreditRating;
    }

    /* UnderlyingCreditRating = 256 */
    public String underlyingCreditRatingAsString()
    {
        return underlyingCreditRating.getStringWithoutLengthAscii(underlyingCreditRatingOffset, underlyingCreditRatingLength);
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final CharSequence value)
    {
        if (toBytes(value, underlyingCreditRating))
        {
            underlyingCreditRatingInternalBuffer = underlyingCreditRating.byteArray();
        }
        underlyingCreditRatingOffset = 0;
        underlyingCreditRatingLength = value.length();
        return this;
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingCreditRating.wrap(buffer);
            underlyingCreditRatingOffset = value.offset();
            underlyingCreditRatingLength = value.length();
        }
        return this;
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final char[] value)
    {
        return underlyingCreditRating(value, 0, value.length);
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final char[] value, final int length)
    {
        return underlyingCreditRating(value, 0, length);
    }

    /* UnderlyingCreditRating = 256 */
    public UnderlyingInstrumentEncoder underlyingCreditRating(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingCreditRating, offset, length))
        {
            underlyingCreditRatingInternalBuffer = underlyingCreditRating.byteArray();
        }
        underlyingCreditRatingOffset = 0;
        underlyingCreditRatingLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingInstrRegistry = new UnsafeBuffer();
    private byte[] underlyingInstrRegistryInternalBuffer = underlyingInstrRegistry.byteArray();
    private int underlyingInstrRegistryOffset = 0;
    private int underlyingInstrRegistryLength = 0;

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final DirectBuffer value, final int offset, final int length)
    {
        underlyingInstrRegistry.wrap(value);
        underlyingInstrRegistryOffset = offset;
        underlyingInstrRegistryLength = length;
        return this;
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final DirectBuffer value, final int length)
    {
        return underlyingInstrRegistry(value, 0, length);
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final DirectBuffer value)
    {
        return underlyingInstrRegistry(value, 0, value.capacity());
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final byte[] value, final int offset, final int length)
    {
        underlyingInstrRegistry.wrap(value);
        underlyingInstrRegistryOffset = offset;
        underlyingInstrRegistryLength = length;
        return this;
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistryAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingInstrRegistry, value, offset, length))
        {
            underlyingInstrRegistryInternalBuffer = underlyingInstrRegistry.byteArray();
        }
        underlyingInstrRegistryOffset = 0;
        underlyingInstrRegistryLength = length;
        return this;
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final byte[] value, final int length)
    {
        return underlyingInstrRegistry(value, 0, length);
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final byte[] value)
    {
        return underlyingInstrRegistry(value, 0, value.length);
    }

    /* UnderlyingInstrRegistry = 595 */
    public boolean hasUnderlyingInstrRegistry()
    {
        return underlyingInstrRegistryLength > 0;
    }

    /* UnderlyingInstrRegistry = 595 */
    public MutableDirectBuffer underlyingInstrRegistry()
    {
        return underlyingInstrRegistry;
    }

    /* UnderlyingInstrRegistry = 595 */
    public String underlyingInstrRegistryAsString()
    {
        return underlyingInstrRegistry.getStringWithoutLengthAscii(underlyingInstrRegistryOffset, underlyingInstrRegistryLength);
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final CharSequence value)
    {
        if (toBytes(value, underlyingInstrRegistry))
        {
            underlyingInstrRegistryInternalBuffer = underlyingInstrRegistry.byteArray();
        }
        underlyingInstrRegistryOffset = 0;
        underlyingInstrRegistryLength = value.length();
        return this;
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingInstrRegistry.wrap(buffer);
            underlyingInstrRegistryOffset = value.offset();
            underlyingInstrRegistryLength = value.length();
        }
        return this;
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final char[] value)
    {
        return underlyingInstrRegistry(value, 0, value.length);
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final char[] value, final int length)
    {
        return underlyingInstrRegistry(value, 0, length);
    }

    /* UnderlyingInstrRegistry = 595 */
    public UnderlyingInstrumentEncoder underlyingInstrRegistry(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingInstrRegistry, offset, length))
        {
            underlyingInstrRegistryInternalBuffer = underlyingInstrRegistry.byteArray();
        }
        underlyingInstrRegistryOffset = 0;
        underlyingInstrRegistryLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingCountryOfIssue = new UnsafeBuffer();
    private byte[] underlyingCountryOfIssueInternalBuffer = underlyingCountryOfIssue.byteArray();
    private int underlyingCountryOfIssueOffset = 0;
    private int underlyingCountryOfIssueLength = 0;

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        underlyingCountryOfIssue.wrap(value);
        underlyingCountryOfIssueOffset = offset;
        underlyingCountryOfIssueLength = length;
        return this;
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final DirectBuffer value, final int length)
    {
        return underlyingCountryOfIssue(value, 0, length);
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final DirectBuffer value)
    {
        return underlyingCountryOfIssue(value, 0, value.capacity());
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final byte[] value, final int offset, final int length)
    {
        underlyingCountryOfIssue.wrap(value);
        underlyingCountryOfIssueOffset = offset;
        underlyingCountryOfIssueLength = length;
        return this;
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingCountryOfIssue, value, offset, length))
        {
            underlyingCountryOfIssueInternalBuffer = underlyingCountryOfIssue.byteArray();
        }
        underlyingCountryOfIssueOffset = 0;
        underlyingCountryOfIssueLength = length;
        return this;
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final byte[] value, final int length)
    {
        return underlyingCountryOfIssue(value, 0, length);
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final byte[] value)
    {
        return underlyingCountryOfIssue(value, 0, value.length);
    }

    /* UnderlyingCountryOfIssue = 592 */
    public boolean hasUnderlyingCountryOfIssue()
    {
        return underlyingCountryOfIssueLength > 0;
    }

    /* UnderlyingCountryOfIssue = 592 */
    public MutableDirectBuffer underlyingCountryOfIssue()
    {
        return underlyingCountryOfIssue;
    }

    /* UnderlyingCountryOfIssue = 592 */
    public String underlyingCountryOfIssueAsString()
    {
        return underlyingCountryOfIssue.getStringWithoutLengthAscii(underlyingCountryOfIssueOffset, underlyingCountryOfIssueLength);
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final CharSequence value)
    {
        if (toBytes(value, underlyingCountryOfIssue))
        {
            underlyingCountryOfIssueInternalBuffer = underlyingCountryOfIssue.byteArray();
        }
        underlyingCountryOfIssueOffset = 0;
        underlyingCountryOfIssueLength = value.length();
        return this;
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingCountryOfIssue.wrap(buffer);
            underlyingCountryOfIssueOffset = value.offset();
            underlyingCountryOfIssueLength = value.length();
        }
        return this;
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final char[] value)
    {
        return underlyingCountryOfIssue(value, 0, value.length);
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final char[] value, final int length)
    {
        return underlyingCountryOfIssue(value, 0, length);
    }

    /* UnderlyingCountryOfIssue = 592 */
    public UnderlyingInstrumentEncoder underlyingCountryOfIssue(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingCountryOfIssue, offset, length))
        {
            underlyingCountryOfIssueInternalBuffer = underlyingCountryOfIssue.byteArray();
        }
        underlyingCountryOfIssueOffset = 0;
        underlyingCountryOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingStateOrProvinceOfIssue = new UnsafeBuffer();
    private byte[] underlyingStateOrProvinceOfIssueInternalBuffer = underlyingStateOrProvinceOfIssue.byteArray();
    private int underlyingStateOrProvinceOfIssueOffset = 0;
    private int underlyingStateOrProvinceOfIssueLength = 0;

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        underlyingStateOrProvinceOfIssue.wrap(value);
        underlyingStateOrProvinceOfIssueOffset = offset;
        underlyingStateOrProvinceOfIssueLength = length;
        return this;
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final DirectBuffer value, final int length)
    {
        return underlyingStateOrProvinceOfIssue(value, 0, length);
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final DirectBuffer value)
    {
        return underlyingStateOrProvinceOfIssue(value, 0, value.capacity());
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final byte[] value, final int offset, final int length)
    {
        underlyingStateOrProvinceOfIssue.wrap(value);
        underlyingStateOrProvinceOfIssueOffset = offset;
        underlyingStateOrProvinceOfIssueLength = length;
        return this;
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingStateOrProvinceOfIssue, value, offset, length))
        {
            underlyingStateOrProvinceOfIssueInternalBuffer = underlyingStateOrProvinceOfIssue.byteArray();
        }
        underlyingStateOrProvinceOfIssueOffset = 0;
        underlyingStateOrProvinceOfIssueLength = length;
        return this;
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final byte[] value, final int length)
    {
        return underlyingStateOrProvinceOfIssue(value, 0, length);
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final byte[] value)
    {
        return underlyingStateOrProvinceOfIssue(value, 0, value.length);
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public boolean hasUnderlyingStateOrProvinceOfIssue()
    {
        return underlyingStateOrProvinceOfIssueLength > 0;
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public MutableDirectBuffer underlyingStateOrProvinceOfIssue()
    {
        return underlyingStateOrProvinceOfIssue;
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public String underlyingStateOrProvinceOfIssueAsString()
    {
        return underlyingStateOrProvinceOfIssue.getStringWithoutLengthAscii(underlyingStateOrProvinceOfIssueOffset, underlyingStateOrProvinceOfIssueLength);
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final CharSequence value)
    {
        if (toBytes(value, underlyingStateOrProvinceOfIssue))
        {
            underlyingStateOrProvinceOfIssueInternalBuffer = underlyingStateOrProvinceOfIssue.byteArray();
        }
        underlyingStateOrProvinceOfIssueOffset = 0;
        underlyingStateOrProvinceOfIssueLength = value.length();
        return this;
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingStateOrProvinceOfIssue.wrap(buffer);
            underlyingStateOrProvinceOfIssueOffset = value.offset();
            underlyingStateOrProvinceOfIssueLength = value.length();
        }
        return this;
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final char[] value)
    {
        return underlyingStateOrProvinceOfIssue(value, 0, value.length);
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final char[] value, final int length)
    {
        return underlyingStateOrProvinceOfIssue(value, 0, length);
    }

    /* UnderlyingStateOrProvinceOfIssue = 593 */
    public UnderlyingInstrumentEncoder underlyingStateOrProvinceOfIssue(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingStateOrProvinceOfIssue, offset, length))
        {
            underlyingStateOrProvinceOfIssueInternalBuffer = underlyingStateOrProvinceOfIssue.byteArray();
        }
        underlyingStateOrProvinceOfIssueOffset = 0;
        underlyingStateOrProvinceOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLocaleOfIssue = new UnsafeBuffer();
    private byte[] underlyingLocaleOfIssueInternalBuffer = underlyingLocaleOfIssue.byteArray();
    private int underlyingLocaleOfIssueOffset = 0;
    private int underlyingLocaleOfIssueLength = 0;

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLocaleOfIssue.wrap(value);
        underlyingLocaleOfIssueOffset = offset;
        underlyingLocaleOfIssueLength = length;
        return this;
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final DirectBuffer value, final int length)
    {
        return underlyingLocaleOfIssue(value, 0, length);
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final DirectBuffer value)
    {
        return underlyingLocaleOfIssue(value, 0, value.capacity());
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final byte[] value, final int offset, final int length)
    {
        underlyingLocaleOfIssue.wrap(value);
        underlyingLocaleOfIssueOffset = offset;
        underlyingLocaleOfIssueLength = length;
        return this;
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingLocaleOfIssue, value, offset, length))
        {
            underlyingLocaleOfIssueInternalBuffer = underlyingLocaleOfIssue.byteArray();
        }
        underlyingLocaleOfIssueOffset = 0;
        underlyingLocaleOfIssueLength = length;
        return this;
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final byte[] value, final int length)
    {
        return underlyingLocaleOfIssue(value, 0, length);
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final byte[] value)
    {
        return underlyingLocaleOfIssue(value, 0, value.length);
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public boolean hasUnderlyingLocaleOfIssue()
    {
        return underlyingLocaleOfIssueLength > 0;
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public MutableDirectBuffer underlyingLocaleOfIssue()
    {
        return underlyingLocaleOfIssue;
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public String underlyingLocaleOfIssueAsString()
    {
        return underlyingLocaleOfIssue.getStringWithoutLengthAscii(underlyingLocaleOfIssueOffset, underlyingLocaleOfIssueLength);
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final CharSequence value)
    {
        if (toBytes(value, underlyingLocaleOfIssue))
        {
            underlyingLocaleOfIssueInternalBuffer = underlyingLocaleOfIssue.byteArray();
        }
        underlyingLocaleOfIssueOffset = 0;
        underlyingLocaleOfIssueLength = value.length();
        return this;
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLocaleOfIssue.wrap(buffer);
            underlyingLocaleOfIssueOffset = value.offset();
            underlyingLocaleOfIssueLength = value.length();
        }
        return this;
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final char[] value)
    {
        return underlyingLocaleOfIssue(value, 0, value.length);
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final char[] value, final int length)
    {
        return underlyingLocaleOfIssue(value, 0, length);
    }

    /* UnderlyingLocaleOfIssue = 594 */
    public UnderlyingInstrumentEncoder underlyingLocaleOfIssue(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingLocaleOfIssue, offset, length))
        {
            underlyingLocaleOfIssueInternalBuffer = underlyingLocaleOfIssue.byteArray();
        }
        underlyingLocaleOfIssueOffset = 0;
        underlyingLocaleOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingRedemptionDate = new UnsafeBuffer();
    private byte[] underlyingRedemptionDateInternalBuffer = underlyingRedemptionDate.byteArray();
    private int underlyingRedemptionDateOffset = 0;
    private int underlyingRedemptionDateLength = 0;

    /* UnderlyingRedemptionDate = 247 */
    public UnderlyingInstrumentEncoder underlyingRedemptionDate(final DirectBuffer value, final int offset, final int length)
    {
        underlyingRedemptionDate.wrap(value);
        underlyingRedemptionDateOffset = offset;
        underlyingRedemptionDateLength = length;
        return this;
    }

    /* UnderlyingRedemptionDate = 247 */
    public UnderlyingInstrumentEncoder underlyingRedemptionDate(final DirectBuffer value, final int length)
    {
        return underlyingRedemptionDate(value, 0, length);
    }

    /* UnderlyingRedemptionDate = 247 */
    public UnderlyingInstrumentEncoder underlyingRedemptionDate(final DirectBuffer value)
    {
        return underlyingRedemptionDate(value, 0, value.capacity());
    }

    /* UnderlyingRedemptionDate = 247 */
    public UnderlyingInstrumentEncoder underlyingRedemptionDate(final byte[] value, final int offset, final int length)
    {
        underlyingRedemptionDate.wrap(value);
        underlyingRedemptionDateOffset = offset;
        underlyingRedemptionDateLength = length;
        return this;
    }

    /* UnderlyingRedemptionDate = 247 */
    public UnderlyingInstrumentEncoder underlyingRedemptionDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingRedemptionDate, value, offset, length))
        {
            underlyingRedemptionDateInternalBuffer = underlyingRedemptionDate.byteArray();
        }
        underlyingRedemptionDateOffset = 0;
        underlyingRedemptionDateLength = length;
        return this;
    }

    /* UnderlyingRedemptionDate = 247 */
    public UnderlyingInstrumentEncoder underlyingRedemptionDate(final byte[] value, final int length)
    {
        return underlyingRedemptionDate(value, 0, length);
    }

    /* UnderlyingRedemptionDate = 247 */
    public UnderlyingInstrumentEncoder underlyingRedemptionDate(final byte[] value)
    {
        return underlyingRedemptionDate(value, 0, value.length);
    }

    /* UnderlyingRedemptionDate = 247 */
    public boolean hasUnderlyingRedemptionDate()
    {
        return underlyingRedemptionDateLength > 0;
    }

    /* UnderlyingRedemptionDate = 247 */
    public MutableDirectBuffer underlyingRedemptionDate()
    {
        return underlyingRedemptionDate;
    }

    /* UnderlyingRedemptionDate = 247 */
    public String underlyingRedemptionDateAsString()
    {
        return underlyingRedemptionDate.getStringWithoutLengthAscii(underlyingRedemptionDateOffset, underlyingRedemptionDateLength);
    }

    private final DecimalFloat underlyingStrikePrice = new DecimalFloat();

    private boolean hasUnderlyingStrikePrice;

    public boolean hasUnderlyingStrikePrice()
    {
        return hasUnderlyingStrikePrice;
    }

    /* UnderlyingStrikePrice = 316 */
    public UnderlyingInstrumentEncoder underlyingStrikePrice(ReadOnlyDecimalFloat value)
    {
        underlyingStrikePrice.set(value);
        hasUnderlyingStrikePrice = true;
        return this;
    }

    /* UnderlyingStrikePrice = 316 */
    public UnderlyingInstrumentEncoder underlyingStrikePrice(long value, int scale)
    {
        underlyingStrikePrice.set(value, scale);
        hasUnderlyingStrikePrice = true;
        return this;
    }

    /* UnderlyingStrikePrice = 316 */
    public DecimalFloat underlyingStrikePrice()
    {
        return underlyingStrikePrice;
    }

    private final MutableDirectBuffer underlyingStrikeCurrency = new UnsafeBuffer();
    private byte[] underlyingStrikeCurrencyInternalBuffer = underlyingStrikeCurrency.byteArray();
    private int underlyingStrikeCurrencyOffset = 0;
    private int underlyingStrikeCurrencyLength = 0;

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final DirectBuffer value, final int offset, final int length)
    {
        underlyingStrikeCurrency.wrap(value);
        underlyingStrikeCurrencyOffset = offset;
        underlyingStrikeCurrencyLength = length;
        return this;
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final DirectBuffer value, final int length)
    {
        return underlyingStrikeCurrency(value, 0, length);
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final DirectBuffer value)
    {
        return underlyingStrikeCurrency(value, 0, value.capacity());
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final byte[] value, final int offset, final int length)
    {
        underlyingStrikeCurrency.wrap(value);
        underlyingStrikeCurrencyOffset = offset;
        underlyingStrikeCurrencyLength = length;
        return this;
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingStrikeCurrency, value, offset, length))
        {
            underlyingStrikeCurrencyInternalBuffer = underlyingStrikeCurrency.byteArray();
        }
        underlyingStrikeCurrencyOffset = 0;
        underlyingStrikeCurrencyLength = length;
        return this;
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final byte[] value, final int length)
    {
        return underlyingStrikeCurrency(value, 0, length);
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final byte[] value)
    {
        return underlyingStrikeCurrency(value, 0, value.length);
    }

    /* UnderlyingStrikeCurrency = 941 */
    public boolean hasUnderlyingStrikeCurrency()
    {
        return underlyingStrikeCurrencyLength > 0;
    }

    /* UnderlyingStrikeCurrency = 941 */
    public MutableDirectBuffer underlyingStrikeCurrency()
    {
        return underlyingStrikeCurrency;
    }

    /* UnderlyingStrikeCurrency = 941 */
    public String underlyingStrikeCurrencyAsString()
    {
        return underlyingStrikeCurrency.getStringWithoutLengthAscii(underlyingStrikeCurrencyOffset, underlyingStrikeCurrencyLength);
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final CharSequence value)
    {
        if (toBytes(value, underlyingStrikeCurrency))
        {
            underlyingStrikeCurrencyInternalBuffer = underlyingStrikeCurrency.byteArray();
        }
        underlyingStrikeCurrencyOffset = 0;
        underlyingStrikeCurrencyLength = value.length();
        return this;
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingStrikeCurrency.wrap(buffer);
            underlyingStrikeCurrencyOffset = value.offset();
            underlyingStrikeCurrencyLength = value.length();
        }
        return this;
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final char[] value)
    {
        return underlyingStrikeCurrency(value, 0, value.length);
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final char[] value, final int length)
    {
        return underlyingStrikeCurrency(value, 0, length);
    }

    /* UnderlyingStrikeCurrency = 941 */
    public UnderlyingInstrumentEncoder underlyingStrikeCurrency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingStrikeCurrency, offset, length))
        {
            underlyingStrikeCurrencyInternalBuffer = underlyingStrikeCurrency.byteArray();
        }
        underlyingStrikeCurrencyOffset = 0;
        underlyingStrikeCurrencyLength = length;
        return this;
    }

    private char underlyingOptAttribute;

    private boolean hasUnderlyingOptAttribute;

    public boolean hasUnderlyingOptAttribute()
    {
        return hasUnderlyingOptAttribute;
    }

    /* UnderlyingOptAttribute = 317 */
    public UnderlyingInstrumentEncoder underlyingOptAttribute(char value)
    {
        underlyingOptAttribute = value;
        hasUnderlyingOptAttribute = true;
        return this;
    }

    /* UnderlyingOptAttribute = 317 */
    public char underlyingOptAttribute()
    {
        return underlyingOptAttribute;
    }

    private final DecimalFloat underlyingContractMultiplier = new DecimalFloat();

    private boolean hasUnderlyingContractMultiplier;

    public boolean hasUnderlyingContractMultiplier()
    {
        return hasUnderlyingContractMultiplier;
    }

    /* UnderlyingContractMultiplier = 436 */
    public UnderlyingInstrumentEncoder underlyingContractMultiplier(ReadOnlyDecimalFloat value)
    {
        underlyingContractMultiplier.set(value);
        hasUnderlyingContractMultiplier = true;
        return this;
    }

    /* UnderlyingContractMultiplier = 436 */
    public UnderlyingInstrumentEncoder underlyingContractMultiplier(long value, int scale)
    {
        underlyingContractMultiplier.set(value, scale);
        hasUnderlyingContractMultiplier = true;
        return this;
    }

    /* UnderlyingContractMultiplier = 436 */
    public DecimalFloat underlyingContractMultiplier()
    {
        return underlyingContractMultiplier;
    }

    private final DecimalFloat underlyingCouponRate = new DecimalFloat();

    private boolean hasUnderlyingCouponRate;

    public boolean hasUnderlyingCouponRate()
    {
        return hasUnderlyingCouponRate;
    }

    /* UnderlyingCouponRate = 435 */
    public UnderlyingInstrumentEncoder underlyingCouponRate(ReadOnlyDecimalFloat value)
    {
        underlyingCouponRate.set(value);
        hasUnderlyingCouponRate = true;
        return this;
    }

    /* UnderlyingCouponRate = 435 */
    public UnderlyingInstrumentEncoder underlyingCouponRate(long value, int scale)
    {
        underlyingCouponRate.set(value, scale);
        hasUnderlyingCouponRate = true;
        return this;
    }

    /* UnderlyingCouponRate = 435 */
    public DecimalFloat underlyingCouponRate()
    {
        return underlyingCouponRate;
    }

    private final MutableDirectBuffer underlyingSecurityExchange = new UnsafeBuffer();
    private byte[] underlyingSecurityExchangeInternalBuffer = underlyingSecurityExchange.byteArray();
    private int underlyingSecurityExchangeOffset = 0;
    private int underlyingSecurityExchangeLength = 0;

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityExchange.wrap(value);
        underlyingSecurityExchangeOffset = offset;
        underlyingSecurityExchangeLength = length;
        return this;
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final DirectBuffer value, final int length)
    {
        return underlyingSecurityExchange(value, 0, length);
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final DirectBuffer value)
    {
        return underlyingSecurityExchange(value, 0, value.capacity());
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityExchange.wrap(value);
        underlyingSecurityExchangeOffset = offset;
        underlyingSecurityExchangeLength = length;
        return this;
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchangeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecurityExchange, value, offset, length))
        {
            underlyingSecurityExchangeInternalBuffer = underlyingSecurityExchange.byteArray();
        }
        underlyingSecurityExchangeOffset = 0;
        underlyingSecurityExchangeLength = length;
        return this;
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final byte[] value, final int length)
    {
        return underlyingSecurityExchange(value, 0, length);
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final byte[] value)
    {
        return underlyingSecurityExchange(value, 0, value.length);
    }

    /* UnderlyingSecurityExchange = 308 */
    public boolean hasUnderlyingSecurityExchange()
    {
        return underlyingSecurityExchangeLength > 0;
    }

    /* UnderlyingSecurityExchange = 308 */
    public MutableDirectBuffer underlyingSecurityExchange()
    {
        return underlyingSecurityExchange;
    }

    /* UnderlyingSecurityExchange = 308 */
    public String underlyingSecurityExchangeAsString()
    {
        return underlyingSecurityExchange.getStringWithoutLengthAscii(underlyingSecurityExchangeOffset, underlyingSecurityExchangeLength);
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final CharSequence value)
    {
        if (toBytes(value, underlyingSecurityExchange))
        {
            underlyingSecurityExchangeInternalBuffer = underlyingSecurityExchange.byteArray();
        }
        underlyingSecurityExchangeOffset = 0;
        underlyingSecurityExchangeLength = value.length();
        return this;
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityExchange.wrap(buffer);
            underlyingSecurityExchangeOffset = value.offset();
            underlyingSecurityExchangeLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final char[] value)
    {
        return underlyingSecurityExchange(value, 0, value.length);
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final char[] value, final int length)
    {
        return underlyingSecurityExchange(value, 0, length);
    }

    /* UnderlyingSecurityExchange = 308 */
    public UnderlyingInstrumentEncoder underlyingSecurityExchange(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecurityExchange, offset, length))
        {
            underlyingSecurityExchangeInternalBuffer = underlyingSecurityExchange.byteArray();
        }
        underlyingSecurityExchangeOffset = 0;
        underlyingSecurityExchangeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingIssuer = new UnsafeBuffer();
    private byte[] underlyingIssuerInternalBuffer = underlyingIssuer.byteArray();
    private int underlyingIssuerOffset = 0;
    private int underlyingIssuerLength = 0;

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final DirectBuffer value, final int offset, final int length)
    {
        underlyingIssuer.wrap(value);
        underlyingIssuerOffset = offset;
        underlyingIssuerLength = length;
        return this;
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final DirectBuffer value, final int length)
    {
        return underlyingIssuer(value, 0, length);
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final DirectBuffer value)
    {
        return underlyingIssuer(value, 0, value.capacity());
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final byte[] value, final int offset, final int length)
    {
        underlyingIssuer.wrap(value);
        underlyingIssuerOffset = offset;
        underlyingIssuerLength = length;
        return this;
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuerAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingIssuer, value, offset, length))
        {
            underlyingIssuerInternalBuffer = underlyingIssuer.byteArray();
        }
        underlyingIssuerOffset = 0;
        underlyingIssuerLength = length;
        return this;
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final byte[] value, final int length)
    {
        return underlyingIssuer(value, 0, length);
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final byte[] value)
    {
        return underlyingIssuer(value, 0, value.length);
    }

    /* UnderlyingIssuer = 306 */
    public boolean hasUnderlyingIssuer()
    {
        return underlyingIssuerLength > 0;
    }

    /* UnderlyingIssuer = 306 */
    public MutableDirectBuffer underlyingIssuer()
    {
        return underlyingIssuer;
    }

    /* UnderlyingIssuer = 306 */
    public String underlyingIssuerAsString()
    {
        return underlyingIssuer.getStringWithoutLengthAscii(underlyingIssuerOffset, underlyingIssuerLength);
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final CharSequence value)
    {
        if (toBytes(value, underlyingIssuer))
        {
            underlyingIssuerInternalBuffer = underlyingIssuer.byteArray();
        }
        underlyingIssuerOffset = 0;
        underlyingIssuerLength = value.length();
        return this;
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingIssuer.wrap(buffer);
            underlyingIssuerOffset = value.offset();
            underlyingIssuerLength = value.length();
        }
        return this;
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final char[] value)
    {
        return underlyingIssuer(value, 0, value.length);
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final char[] value, final int length)
    {
        return underlyingIssuer(value, 0, length);
    }

    /* UnderlyingIssuer = 306 */
    public UnderlyingInstrumentEncoder underlyingIssuer(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingIssuer, offset, length))
        {
            underlyingIssuerInternalBuffer = underlyingIssuer.byteArray();
        }
        underlyingIssuerOffset = 0;
        underlyingIssuerLength = length;
        return this;
    }

    private int encodedUnderlyingIssuerLen;

    private boolean hasEncodedUnderlyingIssuerLen;

    public boolean hasEncodedUnderlyingIssuerLen()
    {
        return hasEncodedUnderlyingIssuerLen;
    }

    /* EncodedUnderlyingIssuerLen = 362 */
    public UnderlyingInstrumentEncoder encodedUnderlyingIssuerLen(int value)
    {
        encodedUnderlyingIssuerLen = value;
        hasEncodedUnderlyingIssuerLen = true;
        return this;
    }

    /* EncodedUnderlyingIssuerLen = 362 */
    public int encodedUnderlyingIssuerLen()
    {
        return encodedUnderlyingIssuerLen;
    }

    private byte[] encodedUnderlyingIssuer;

    private boolean hasEncodedUnderlyingIssuer;

    public boolean hasEncodedUnderlyingIssuer()
    {
        return hasEncodedUnderlyingIssuer;
    }

    /* EncodedUnderlyingIssuer = 363 */
    public UnderlyingInstrumentEncoder encodedUnderlyingIssuer(byte[] value)
    {
        encodedUnderlyingIssuer = value;
        hasEncodedUnderlyingIssuer = true;
        return this;
    }

    /* EncodedUnderlyingIssuer = 363 */
    public byte[] encodedUnderlyingIssuer()
    {
        return encodedUnderlyingIssuer;
    }

    /* EncodedUnderlyingIssuer = 363 */
    public UnderlyingInstrumentEncoder encodedUnderlyingIssuerAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedUnderlyingIssuer = copyInto(encodedUnderlyingIssuer, value, offset, length);
        hasEncodedUnderlyingIssuer = true;
        return this;
    }

    private final MutableDirectBuffer underlyingSecurityDesc = new UnsafeBuffer();
    private byte[] underlyingSecurityDescInternalBuffer = underlyingSecurityDesc.byteArray();
    private int underlyingSecurityDescOffset = 0;
    private int underlyingSecurityDescLength = 0;

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityDesc.wrap(value);
        underlyingSecurityDescOffset = offset;
        underlyingSecurityDescLength = length;
        return this;
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final DirectBuffer value, final int length)
    {
        return underlyingSecurityDesc(value, 0, length);
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final DirectBuffer value)
    {
        return underlyingSecurityDesc(value, 0, value.capacity());
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityDesc.wrap(value);
        underlyingSecurityDescOffset = offset;
        underlyingSecurityDescLength = length;
        return this;
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingSecurityDesc, value, offset, length))
        {
            underlyingSecurityDescInternalBuffer = underlyingSecurityDesc.byteArray();
        }
        underlyingSecurityDescOffset = 0;
        underlyingSecurityDescLength = length;
        return this;
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final byte[] value, final int length)
    {
        return underlyingSecurityDesc(value, 0, length);
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final byte[] value)
    {
        return underlyingSecurityDesc(value, 0, value.length);
    }

    /* UnderlyingSecurityDesc = 307 */
    public boolean hasUnderlyingSecurityDesc()
    {
        return underlyingSecurityDescLength > 0;
    }

    /* UnderlyingSecurityDesc = 307 */
    public MutableDirectBuffer underlyingSecurityDesc()
    {
        return underlyingSecurityDesc;
    }

    /* UnderlyingSecurityDesc = 307 */
    public String underlyingSecurityDescAsString()
    {
        return underlyingSecurityDesc.getStringWithoutLengthAscii(underlyingSecurityDescOffset, underlyingSecurityDescLength);
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final CharSequence value)
    {
        if (toBytes(value, underlyingSecurityDesc))
        {
            underlyingSecurityDescInternalBuffer = underlyingSecurityDesc.byteArray();
        }
        underlyingSecurityDescOffset = 0;
        underlyingSecurityDescLength = value.length();
        return this;
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityDesc.wrap(buffer);
            underlyingSecurityDescOffset = value.offset();
            underlyingSecurityDescLength = value.length();
        }
        return this;
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final char[] value)
    {
        return underlyingSecurityDesc(value, 0, value.length);
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final char[] value, final int length)
    {
        return underlyingSecurityDesc(value, 0, length);
    }

    /* UnderlyingSecurityDesc = 307 */
    public UnderlyingInstrumentEncoder underlyingSecurityDesc(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingSecurityDesc, offset, length))
        {
            underlyingSecurityDescInternalBuffer = underlyingSecurityDesc.byteArray();
        }
        underlyingSecurityDescOffset = 0;
        underlyingSecurityDescLength = length;
        return this;
    }

    private int encodedUnderlyingSecurityDescLen;

    private boolean hasEncodedUnderlyingSecurityDescLen;

    public boolean hasEncodedUnderlyingSecurityDescLen()
    {
        return hasEncodedUnderlyingSecurityDescLen;
    }

    /* EncodedUnderlyingSecurityDescLen = 364 */
    public UnderlyingInstrumentEncoder encodedUnderlyingSecurityDescLen(int value)
    {
        encodedUnderlyingSecurityDescLen = value;
        hasEncodedUnderlyingSecurityDescLen = true;
        return this;
    }

    /* EncodedUnderlyingSecurityDescLen = 364 */
    public int encodedUnderlyingSecurityDescLen()
    {
        return encodedUnderlyingSecurityDescLen;
    }

    private byte[] encodedUnderlyingSecurityDesc;

    private boolean hasEncodedUnderlyingSecurityDesc;

    public boolean hasEncodedUnderlyingSecurityDesc()
    {
        return hasEncodedUnderlyingSecurityDesc;
    }

    /* EncodedUnderlyingSecurityDesc = 365 */
    public UnderlyingInstrumentEncoder encodedUnderlyingSecurityDesc(byte[] value)
    {
        encodedUnderlyingSecurityDesc = value;
        hasEncodedUnderlyingSecurityDesc = true;
        return this;
    }

    /* EncodedUnderlyingSecurityDesc = 365 */
    public byte[] encodedUnderlyingSecurityDesc()
    {
        return encodedUnderlyingSecurityDesc;
    }

    /* EncodedUnderlyingSecurityDesc = 365 */
    public UnderlyingInstrumentEncoder encodedUnderlyingSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedUnderlyingSecurityDesc = copyInto(encodedUnderlyingSecurityDesc, value, offset, length);
        hasEncodedUnderlyingSecurityDesc = true;
        return this;
    }

    private final MutableDirectBuffer underlyingCPProgram = new UnsafeBuffer();
    private byte[] underlyingCPProgramInternalBuffer = underlyingCPProgram.byteArray();
    private int underlyingCPProgramOffset = 0;
    private int underlyingCPProgramLength = 0;

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final DirectBuffer value, final int offset, final int length)
    {
        underlyingCPProgram.wrap(value);
        underlyingCPProgramOffset = offset;
        underlyingCPProgramLength = length;
        return this;
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final DirectBuffer value, final int length)
    {
        return underlyingCPProgram(value, 0, length);
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final DirectBuffer value)
    {
        return underlyingCPProgram(value, 0, value.capacity());
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final byte[] value, final int offset, final int length)
    {
        underlyingCPProgram.wrap(value);
        underlyingCPProgramOffset = offset;
        underlyingCPProgramLength = length;
        return this;
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgramAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingCPProgram, value, offset, length))
        {
            underlyingCPProgramInternalBuffer = underlyingCPProgram.byteArray();
        }
        underlyingCPProgramOffset = 0;
        underlyingCPProgramLength = length;
        return this;
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final byte[] value, final int length)
    {
        return underlyingCPProgram(value, 0, length);
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final byte[] value)
    {
        return underlyingCPProgram(value, 0, value.length);
    }

    /* UnderlyingCPProgram = 877 */
    public boolean hasUnderlyingCPProgram()
    {
        return underlyingCPProgramLength > 0;
    }

    /* UnderlyingCPProgram = 877 */
    public MutableDirectBuffer underlyingCPProgram()
    {
        return underlyingCPProgram;
    }

    /* UnderlyingCPProgram = 877 */
    public String underlyingCPProgramAsString()
    {
        return underlyingCPProgram.getStringWithoutLengthAscii(underlyingCPProgramOffset, underlyingCPProgramLength);
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final CharSequence value)
    {
        if (toBytes(value, underlyingCPProgram))
        {
            underlyingCPProgramInternalBuffer = underlyingCPProgram.byteArray();
        }
        underlyingCPProgramOffset = 0;
        underlyingCPProgramLength = value.length();
        return this;
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingCPProgram.wrap(buffer);
            underlyingCPProgramOffset = value.offset();
            underlyingCPProgramLength = value.length();
        }
        return this;
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final char[] value)
    {
        return underlyingCPProgram(value, 0, value.length);
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final char[] value, final int length)
    {
        return underlyingCPProgram(value, 0, length);
    }

    /* UnderlyingCPProgram = 877 */
    public UnderlyingInstrumentEncoder underlyingCPProgram(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingCPProgram, offset, length))
        {
            underlyingCPProgramInternalBuffer = underlyingCPProgram.byteArray();
        }
        underlyingCPProgramOffset = 0;
        underlyingCPProgramLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingCPRegType = new UnsafeBuffer();
    private byte[] underlyingCPRegTypeInternalBuffer = underlyingCPRegType.byteArray();
    private int underlyingCPRegTypeOffset = 0;
    private int underlyingCPRegTypeLength = 0;

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final DirectBuffer value, final int offset, final int length)
    {
        underlyingCPRegType.wrap(value);
        underlyingCPRegTypeOffset = offset;
        underlyingCPRegTypeLength = length;
        return this;
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final DirectBuffer value, final int length)
    {
        return underlyingCPRegType(value, 0, length);
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final DirectBuffer value)
    {
        return underlyingCPRegType(value, 0, value.capacity());
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final byte[] value, final int offset, final int length)
    {
        underlyingCPRegType.wrap(value);
        underlyingCPRegTypeOffset = offset;
        underlyingCPRegTypeLength = length;
        return this;
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingCPRegType, value, offset, length))
        {
            underlyingCPRegTypeInternalBuffer = underlyingCPRegType.byteArray();
        }
        underlyingCPRegTypeOffset = 0;
        underlyingCPRegTypeLength = length;
        return this;
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final byte[] value, final int length)
    {
        return underlyingCPRegType(value, 0, length);
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final byte[] value)
    {
        return underlyingCPRegType(value, 0, value.length);
    }

    /* UnderlyingCPRegType = 878 */
    public boolean hasUnderlyingCPRegType()
    {
        return underlyingCPRegTypeLength > 0;
    }

    /* UnderlyingCPRegType = 878 */
    public MutableDirectBuffer underlyingCPRegType()
    {
        return underlyingCPRegType;
    }

    /* UnderlyingCPRegType = 878 */
    public String underlyingCPRegTypeAsString()
    {
        return underlyingCPRegType.getStringWithoutLengthAscii(underlyingCPRegTypeOffset, underlyingCPRegTypeLength);
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final CharSequence value)
    {
        if (toBytes(value, underlyingCPRegType))
        {
            underlyingCPRegTypeInternalBuffer = underlyingCPRegType.byteArray();
        }
        underlyingCPRegTypeOffset = 0;
        underlyingCPRegTypeLength = value.length();
        return this;
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingCPRegType.wrap(buffer);
            underlyingCPRegTypeOffset = value.offset();
            underlyingCPRegTypeLength = value.length();
        }
        return this;
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final char[] value)
    {
        return underlyingCPRegType(value, 0, value.length);
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final char[] value, final int length)
    {
        return underlyingCPRegType(value, 0, length);
    }

    /* UnderlyingCPRegType = 878 */
    public UnderlyingInstrumentEncoder underlyingCPRegType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingCPRegType, offset, length))
        {
            underlyingCPRegTypeInternalBuffer = underlyingCPRegType.byteArray();
        }
        underlyingCPRegTypeOffset = 0;
        underlyingCPRegTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingCurrency = new UnsafeBuffer();
    private byte[] underlyingCurrencyInternalBuffer = underlyingCurrency.byteArray();
    private int underlyingCurrencyOffset = 0;
    private int underlyingCurrencyLength = 0;

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final DirectBuffer value, final int offset, final int length)
    {
        underlyingCurrency.wrap(value);
        underlyingCurrencyOffset = offset;
        underlyingCurrencyLength = length;
        return this;
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final DirectBuffer value, final int length)
    {
        return underlyingCurrency(value, 0, length);
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final DirectBuffer value)
    {
        return underlyingCurrency(value, 0, value.capacity());
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final byte[] value, final int offset, final int length)
    {
        underlyingCurrency.wrap(value);
        underlyingCurrencyOffset = offset;
        underlyingCurrencyLength = length;
        return this;
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingCurrency, value, offset, length))
        {
            underlyingCurrencyInternalBuffer = underlyingCurrency.byteArray();
        }
        underlyingCurrencyOffset = 0;
        underlyingCurrencyLength = length;
        return this;
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final byte[] value, final int length)
    {
        return underlyingCurrency(value, 0, length);
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final byte[] value)
    {
        return underlyingCurrency(value, 0, value.length);
    }

    /* UnderlyingCurrency = 318 */
    public boolean hasUnderlyingCurrency()
    {
        return underlyingCurrencyLength > 0;
    }

    /* UnderlyingCurrency = 318 */
    public MutableDirectBuffer underlyingCurrency()
    {
        return underlyingCurrency;
    }

    /* UnderlyingCurrency = 318 */
    public String underlyingCurrencyAsString()
    {
        return underlyingCurrency.getStringWithoutLengthAscii(underlyingCurrencyOffset, underlyingCurrencyLength);
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final CharSequence value)
    {
        if (toBytes(value, underlyingCurrency))
        {
            underlyingCurrencyInternalBuffer = underlyingCurrency.byteArray();
        }
        underlyingCurrencyOffset = 0;
        underlyingCurrencyLength = value.length();
        return this;
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingCurrency.wrap(buffer);
            underlyingCurrencyOffset = value.offset();
            underlyingCurrencyLength = value.length();
        }
        return this;
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final char[] value)
    {
        return underlyingCurrency(value, 0, value.length);
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final char[] value, final int length)
    {
        return underlyingCurrency(value, 0, length);
    }

    /* UnderlyingCurrency = 318 */
    public UnderlyingInstrumentEncoder underlyingCurrency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingCurrency, offset, length))
        {
            underlyingCurrencyInternalBuffer = underlyingCurrency.byteArray();
        }
        underlyingCurrencyOffset = 0;
        underlyingCurrencyLength = length;
        return this;
    }

    private final DecimalFloat underlyingQty = new DecimalFloat();

    private boolean hasUnderlyingQty;

    public boolean hasUnderlyingQty()
    {
        return hasUnderlyingQty;
    }

    /* UnderlyingQty = 879 */
    public UnderlyingInstrumentEncoder underlyingQty(ReadOnlyDecimalFloat value)
    {
        underlyingQty.set(value);
        hasUnderlyingQty = true;
        return this;
    }

    /* UnderlyingQty = 879 */
    public UnderlyingInstrumentEncoder underlyingQty(long value, int scale)
    {
        underlyingQty.set(value, scale);
        hasUnderlyingQty = true;
        return this;
    }

    /* UnderlyingQty = 879 */
    public DecimalFloat underlyingQty()
    {
        return underlyingQty;
    }

    private final DecimalFloat underlyingPx = new DecimalFloat();

    private boolean hasUnderlyingPx;

    public boolean hasUnderlyingPx()
    {
        return hasUnderlyingPx;
    }

    /* UnderlyingPx = 810 */
    public UnderlyingInstrumentEncoder underlyingPx(ReadOnlyDecimalFloat value)
    {
        underlyingPx.set(value);
        hasUnderlyingPx = true;
        return this;
    }

    /* UnderlyingPx = 810 */
    public UnderlyingInstrumentEncoder underlyingPx(long value, int scale)
    {
        underlyingPx.set(value, scale);
        hasUnderlyingPx = true;
        return this;
    }

    /* UnderlyingPx = 810 */
    public DecimalFloat underlyingPx()
    {
        return underlyingPx;
    }

    private final DecimalFloat underlyingDirtyPrice = new DecimalFloat();

    private boolean hasUnderlyingDirtyPrice;

    public boolean hasUnderlyingDirtyPrice()
    {
        return hasUnderlyingDirtyPrice;
    }

    /* UnderlyingDirtyPrice = 882 */
    public UnderlyingInstrumentEncoder underlyingDirtyPrice(ReadOnlyDecimalFloat value)
    {
        underlyingDirtyPrice.set(value);
        hasUnderlyingDirtyPrice = true;
        return this;
    }

    /* UnderlyingDirtyPrice = 882 */
    public UnderlyingInstrumentEncoder underlyingDirtyPrice(long value, int scale)
    {
        underlyingDirtyPrice.set(value, scale);
        hasUnderlyingDirtyPrice = true;
        return this;
    }

    /* UnderlyingDirtyPrice = 882 */
    public DecimalFloat underlyingDirtyPrice()
    {
        return underlyingDirtyPrice;
    }

    private final DecimalFloat underlyingEndPrice = new DecimalFloat();

    private boolean hasUnderlyingEndPrice;

    public boolean hasUnderlyingEndPrice()
    {
        return hasUnderlyingEndPrice;
    }

    /* UnderlyingEndPrice = 883 */
    public UnderlyingInstrumentEncoder underlyingEndPrice(ReadOnlyDecimalFloat value)
    {
        underlyingEndPrice.set(value);
        hasUnderlyingEndPrice = true;
        return this;
    }

    /* UnderlyingEndPrice = 883 */
    public UnderlyingInstrumentEncoder underlyingEndPrice(long value, int scale)
    {
        underlyingEndPrice.set(value, scale);
        hasUnderlyingEndPrice = true;
        return this;
    }

    /* UnderlyingEndPrice = 883 */
    public DecimalFloat underlyingEndPrice()
    {
        return underlyingEndPrice;
    }

    private final DecimalFloat underlyingStartValue = new DecimalFloat();

    private boolean hasUnderlyingStartValue;

    public boolean hasUnderlyingStartValue()
    {
        return hasUnderlyingStartValue;
    }

    /* UnderlyingStartValue = 884 */
    public UnderlyingInstrumentEncoder underlyingStartValue(ReadOnlyDecimalFloat value)
    {
        underlyingStartValue.set(value);
        hasUnderlyingStartValue = true;
        return this;
    }

    /* UnderlyingStartValue = 884 */
    public UnderlyingInstrumentEncoder underlyingStartValue(long value, int scale)
    {
        underlyingStartValue.set(value, scale);
        hasUnderlyingStartValue = true;
        return this;
    }

    /* UnderlyingStartValue = 884 */
    public DecimalFloat underlyingStartValue()
    {
        return underlyingStartValue;
    }

    private final DecimalFloat underlyingCurrentValue = new DecimalFloat();

    private boolean hasUnderlyingCurrentValue;

    public boolean hasUnderlyingCurrentValue()
    {
        return hasUnderlyingCurrentValue;
    }

    /* UnderlyingCurrentValue = 885 */
    public UnderlyingInstrumentEncoder underlyingCurrentValue(ReadOnlyDecimalFloat value)
    {
        underlyingCurrentValue.set(value);
        hasUnderlyingCurrentValue = true;
        return this;
    }

    /* UnderlyingCurrentValue = 885 */
    public UnderlyingInstrumentEncoder underlyingCurrentValue(long value, int scale)
    {
        underlyingCurrentValue.set(value, scale);
        hasUnderlyingCurrentValue = true;
        return this;
    }

    /* UnderlyingCurrentValue = 885 */
    public DecimalFloat underlyingCurrentValue()
    {
        return underlyingCurrentValue;
    }

    private final DecimalFloat underlyingEndValue = new DecimalFloat();

    private boolean hasUnderlyingEndValue;

    public boolean hasUnderlyingEndValue()
    {
        return hasUnderlyingEndValue;
    }

    /* UnderlyingEndValue = 886 */
    public UnderlyingInstrumentEncoder underlyingEndValue(ReadOnlyDecimalFloat value)
    {
        underlyingEndValue.set(value);
        hasUnderlyingEndValue = true;
        return this;
    }

    /* UnderlyingEndValue = 886 */
    public UnderlyingInstrumentEncoder underlyingEndValue(long value, int scale)
    {
        underlyingEndValue.set(value, scale);
        hasUnderlyingEndValue = true;
        return this;
    }

    /* UnderlyingEndValue = 886 */
    public DecimalFloat underlyingEndValue()
    {
        return underlyingEndValue;
    }

    private final UnderlyingStipulationsEncoder underlyingStipulations = new UnderlyingStipulationsEncoder();
    public UnderlyingStipulationsEncoder underlyingStipulations()
    {
        return underlyingStipulations;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (underlyingSymbolLength > 0)
        {
            buffer.putBytes(position, underlyingSymbolHeader, 0, underlyingSymbolHeaderLength);
            position += underlyingSymbolHeaderLength;
            buffer.putBytes(position, underlyingSymbol, underlyingSymbolOffset, underlyingSymbolLength);
            position += underlyingSymbolLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: UnderlyingSymbol");
        }

        if (underlyingSymbolSfxLength > 0)
        {
            buffer.putBytes(position, underlyingSymbolSfxHeader, 0, underlyingSymbolSfxHeaderLength);
            position += underlyingSymbolSfxHeaderLength;
            buffer.putBytes(position, underlyingSymbolSfx, underlyingSymbolSfxOffset, underlyingSymbolSfxLength);
            position += underlyingSymbolSfxLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityIDLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityIDHeader, 0, underlyingSecurityIDHeaderLength);
            position += underlyingSecurityIDHeaderLength;
            buffer.putBytes(position, underlyingSecurityID, underlyingSecurityIDOffset, underlyingSecurityIDLength);
            position += underlyingSecurityIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityIDSourceLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityIDSourceHeader, 0, underlyingSecurityIDSourceHeaderLength);
            position += underlyingSecurityIDSourceHeaderLength;
            buffer.putBytes(position, underlyingSecurityIDSource, underlyingSecurityIDSourceOffset, underlyingSecurityIDSourceLength);
            position += underlyingSecurityIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingSecurityAltIDGroupCounterHeader, 0, noUnderlyingSecurityAltIDGroupCounterHeaderLength);
            position += noUnderlyingSecurityAltIDGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingSecurityAltIDGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityAltIDGroup != null)
        {
            position += underlyingSecurityAltIDGroup.encode(buffer, position, noUnderlyingSecurityAltIDGroupCounter);
        }


        if (hasUnderlyingProduct)
        {
            buffer.putBytes(position, underlyingProductHeader, 0, underlyingProductHeaderLength);
            position += underlyingProductHeaderLength;
            position += buffer.putIntAscii(position, underlyingProduct);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingCFICodeLength > 0)
        {
            buffer.putBytes(position, underlyingCFICodeHeader, 0, underlyingCFICodeHeaderLength);
            position += underlyingCFICodeHeaderLength;
            buffer.putBytes(position, underlyingCFICode, underlyingCFICodeOffset, underlyingCFICodeLength);
            position += underlyingCFICodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityTypeLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityTypeHeader, 0, underlyingSecurityTypeHeaderLength);
            position += underlyingSecurityTypeHeaderLength;
            buffer.putBytes(position, underlyingSecurityType, underlyingSecurityTypeOffset, underlyingSecurityTypeLength);
            position += underlyingSecurityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecuritySubTypeLength > 0)
        {
            buffer.putBytes(position, underlyingSecuritySubTypeHeader, 0, underlyingSecuritySubTypeHeaderLength);
            position += underlyingSecuritySubTypeHeaderLength;
            buffer.putBytes(position, underlyingSecuritySubType, underlyingSecuritySubTypeOffset, underlyingSecuritySubTypeLength);
            position += underlyingSecuritySubTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingMaturityMonthYearLength > 0)
        {
            buffer.putBytes(position, underlyingMaturityMonthYearHeader, 0, underlyingMaturityMonthYearHeaderLength);
            position += underlyingMaturityMonthYearHeaderLength;
            buffer.putBytes(position, underlyingMaturityMonthYear, underlyingMaturityMonthYearOffset, underlyingMaturityMonthYearLength);
            position += underlyingMaturityMonthYearLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingMaturityDateLength > 0)
        {
            buffer.putBytes(position, underlyingMaturityDateHeader, 0, underlyingMaturityDateHeaderLength);
            position += underlyingMaturityDateHeaderLength;
            buffer.putBytes(position, underlyingMaturityDate, underlyingMaturityDateOffset, underlyingMaturityDateLength);
            position += underlyingMaturityDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingPutOrCall)
        {
            buffer.putBytes(position, underlyingPutOrCallHeader, 0, underlyingPutOrCallHeaderLength);
            position += underlyingPutOrCallHeaderLength;
            position += buffer.putIntAscii(position, underlyingPutOrCall);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingCouponPaymentDateLength > 0)
        {
            buffer.putBytes(position, underlyingCouponPaymentDateHeader, 0, underlyingCouponPaymentDateHeaderLength);
            position += underlyingCouponPaymentDateHeaderLength;
            buffer.putBytes(position, underlyingCouponPaymentDate, underlyingCouponPaymentDateOffset, underlyingCouponPaymentDateLength);
            position += underlyingCouponPaymentDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingIssueDateLength > 0)
        {
            buffer.putBytes(position, underlyingIssueDateHeader, 0, underlyingIssueDateHeaderLength);
            position += underlyingIssueDateHeaderLength;
            buffer.putBytes(position, underlyingIssueDate, underlyingIssueDateOffset, underlyingIssueDateLength);
            position += underlyingIssueDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingRepoCollateralSecurityTypeLength > 0)
        {
            buffer.putBytes(position, underlyingRepoCollateralSecurityTypeHeader, 0, underlyingRepoCollateralSecurityTypeHeaderLength);
            position += underlyingRepoCollateralSecurityTypeHeaderLength;
            buffer.putBytes(position, underlyingRepoCollateralSecurityType, underlyingRepoCollateralSecurityTypeOffset, underlyingRepoCollateralSecurityTypeLength);
            position += underlyingRepoCollateralSecurityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingRepurchaseTerm)
        {
            buffer.putBytes(position, underlyingRepurchaseTermHeader, 0, underlyingRepurchaseTermHeaderLength);
            position += underlyingRepurchaseTermHeaderLength;
            position += buffer.putIntAscii(position, underlyingRepurchaseTerm);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingRepurchaseRate)
        {
            buffer.putBytes(position, underlyingRepurchaseRateHeader, 0, underlyingRepurchaseRateHeaderLength);
            position += underlyingRepurchaseRateHeaderLength;
            position += buffer.putFloatAscii(position, underlyingRepurchaseRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingFactor)
        {
            buffer.putBytes(position, underlyingFactorHeader, 0, underlyingFactorHeaderLength);
            position += underlyingFactorHeaderLength;
            position += buffer.putFloatAscii(position, underlyingFactor);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingCreditRatingLength > 0)
        {
            buffer.putBytes(position, underlyingCreditRatingHeader, 0, underlyingCreditRatingHeaderLength);
            position += underlyingCreditRatingHeaderLength;
            buffer.putBytes(position, underlyingCreditRating, underlyingCreditRatingOffset, underlyingCreditRatingLength);
            position += underlyingCreditRatingLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingInstrRegistryLength > 0)
        {
            buffer.putBytes(position, underlyingInstrRegistryHeader, 0, underlyingInstrRegistryHeaderLength);
            position += underlyingInstrRegistryHeaderLength;
            buffer.putBytes(position, underlyingInstrRegistry, underlyingInstrRegistryOffset, underlyingInstrRegistryLength);
            position += underlyingInstrRegistryLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingCountryOfIssueLength > 0)
        {
            buffer.putBytes(position, underlyingCountryOfIssueHeader, 0, underlyingCountryOfIssueHeaderLength);
            position += underlyingCountryOfIssueHeaderLength;
            buffer.putBytes(position, underlyingCountryOfIssue, underlyingCountryOfIssueOffset, underlyingCountryOfIssueLength);
            position += underlyingCountryOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingStateOrProvinceOfIssueLength > 0)
        {
            buffer.putBytes(position, underlyingStateOrProvinceOfIssueHeader, 0, underlyingStateOrProvinceOfIssueHeaderLength);
            position += underlyingStateOrProvinceOfIssueHeaderLength;
            buffer.putBytes(position, underlyingStateOrProvinceOfIssue, underlyingStateOrProvinceOfIssueOffset, underlyingStateOrProvinceOfIssueLength);
            position += underlyingStateOrProvinceOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLocaleOfIssueLength > 0)
        {
            buffer.putBytes(position, underlyingLocaleOfIssueHeader, 0, underlyingLocaleOfIssueHeaderLength);
            position += underlyingLocaleOfIssueHeaderLength;
            buffer.putBytes(position, underlyingLocaleOfIssue, underlyingLocaleOfIssueOffset, underlyingLocaleOfIssueLength);
            position += underlyingLocaleOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingRedemptionDateLength > 0)
        {
            buffer.putBytes(position, underlyingRedemptionDateHeader, 0, underlyingRedemptionDateHeaderLength);
            position += underlyingRedemptionDateHeaderLength;
            buffer.putBytes(position, underlyingRedemptionDate, underlyingRedemptionDateOffset, underlyingRedemptionDateLength);
            position += underlyingRedemptionDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingStrikePrice)
        {
            buffer.putBytes(position, underlyingStrikePriceHeader, 0, underlyingStrikePriceHeaderLength);
            position += underlyingStrikePriceHeaderLength;
            position += buffer.putFloatAscii(position, underlyingStrikePrice);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingStrikeCurrencyLength > 0)
        {
            buffer.putBytes(position, underlyingStrikeCurrencyHeader, 0, underlyingStrikeCurrencyHeaderLength);
            position += underlyingStrikeCurrencyHeaderLength;
            buffer.putBytes(position, underlyingStrikeCurrency, underlyingStrikeCurrencyOffset, underlyingStrikeCurrencyLength);
            position += underlyingStrikeCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingOptAttribute)
        {
            buffer.putBytes(position, underlyingOptAttributeHeader, 0, underlyingOptAttributeHeaderLength);
            position += underlyingOptAttributeHeaderLength;
            position += buffer.putCharAscii(position, underlyingOptAttribute);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingContractMultiplier)
        {
            buffer.putBytes(position, underlyingContractMultiplierHeader, 0, underlyingContractMultiplierHeaderLength);
            position += underlyingContractMultiplierHeaderLength;
            position += buffer.putFloatAscii(position, underlyingContractMultiplier);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingCouponRate)
        {
            buffer.putBytes(position, underlyingCouponRateHeader, 0, underlyingCouponRateHeaderLength);
            position += underlyingCouponRateHeaderLength;
            position += buffer.putFloatAscii(position, underlyingCouponRate);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityExchangeLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityExchangeHeader, 0, underlyingSecurityExchangeHeaderLength);
            position += underlyingSecurityExchangeHeaderLength;
            buffer.putBytes(position, underlyingSecurityExchange, underlyingSecurityExchangeOffset, underlyingSecurityExchangeLength);
            position += underlyingSecurityExchangeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingIssuerLength > 0)
        {
            buffer.putBytes(position, underlyingIssuerHeader, 0, underlyingIssuerHeaderLength);
            position += underlyingIssuerHeaderLength;
            buffer.putBytes(position, underlyingIssuer, underlyingIssuerOffset, underlyingIssuerLength);
            position += underlyingIssuerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedUnderlyingIssuerLen)
        {
            buffer.putBytes(position, encodedUnderlyingIssuerLenHeader, 0, encodedUnderlyingIssuerLenHeaderLength);
            position += encodedUnderlyingIssuerLenHeaderLength;
            position += buffer.putIntAscii(position, encodedUnderlyingIssuerLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedUnderlyingIssuer)
        {
            buffer.putBytes(position, encodedUnderlyingIssuerHeader, 0, encodedUnderlyingIssuerHeaderLength);
            position += encodedUnderlyingIssuerHeaderLength;
            buffer.putBytes(position, encodedUnderlyingIssuer);
            position += encodedUnderlyingIssuer.length;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityDescLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityDescHeader, 0, underlyingSecurityDescHeaderLength);
            position += underlyingSecurityDescHeaderLength;
            buffer.putBytes(position, underlyingSecurityDesc, underlyingSecurityDescOffset, underlyingSecurityDescLength);
            position += underlyingSecurityDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedUnderlyingSecurityDescLen)
        {
            buffer.putBytes(position, encodedUnderlyingSecurityDescLenHeader, 0, encodedUnderlyingSecurityDescLenHeaderLength);
            position += encodedUnderlyingSecurityDescLenHeaderLength;
            position += buffer.putIntAscii(position, encodedUnderlyingSecurityDescLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedUnderlyingSecurityDesc)
        {
            buffer.putBytes(position, encodedUnderlyingSecurityDescHeader, 0, encodedUnderlyingSecurityDescHeaderLength);
            position += encodedUnderlyingSecurityDescHeaderLength;
            buffer.putBytes(position, encodedUnderlyingSecurityDesc);
            position += encodedUnderlyingSecurityDesc.length;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingCPProgramLength > 0)
        {
            buffer.putBytes(position, underlyingCPProgramHeader, 0, underlyingCPProgramHeaderLength);
            position += underlyingCPProgramHeaderLength;
            buffer.putBytes(position, underlyingCPProgram, underlyingCPProgramOffset, underlyingCPProgramLength);
            position += underlyingCPProgramLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingCPRegTypeLength > 0)
        {
            buffer.putBytes(position, underlyingCPRegTypeHeader, 0, underlyingCPRegTypeHeaderLength);
            position += underlyingCPRegTypeHeaderLength;
            buffer.putBytes(position, underlyingCPRegType, underlyingCPRegTypeOffset, underlyingCPRegTypeLength);
            position += underlyingCPRegTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingCurrencyLength > 0)
        {
            buffer.putBytes(position, underlyingCurrencyHeader, 0, underlyingCurrencyHeaderLength);
            position += underlyingCurrencyHeaderLength;
            buffer.putBytes(position, underlyingCurrency, underlyingCurrencyOffset, underlyingCurrencyLength);
            position += underlyingCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingQty)
        {
            buffer.putBytes(position, underlyingQtyHeader, 0, underlyingQtyHeaderLength);
            position += underlyingQtyHeaderLength;
            position += buffer.putFloatAscii(position, underlyingQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingPx)
        {
            buffer.putBytes(position, underlyingPxHeader, 0, underlyingPxHeaderLength);
            position += underlyingPxHeaderLength;
            position += buffer.putFloatAscii(position, underlyingPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingDirtyPrice)
        {
            buffer.putBytes(position, underlyingDirtyPriceHeader, 0, underlyingDirtyPriceHeaderLength);
            position += underlyingDirtyPriceHeaderLength;
            position += buffer.putFloatAscii(position, underlyingDirtyPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingEndPrice)
        {
            buffer.putBytes(position, underlyingEndPriceHeader, 0, underlyingEndPriceHeaderLength);
            position += underlyingEndPriceHeaderLength;
            position += buffer.putFloatAscii(position, underlyingEndPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingStartValue)
        {
            buffer.putBytes(position, underlyingStartValueHeader, 0, underlyingStartValueHeaderLength);
            position += underlyingStartValueHeaderLength;
            position += buffer.putFloatAscii(position, underlyingStartValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingCurrentValue)
        {
            buffer.putBytes(position, underlyingCurrentValueHeader, 0, underlyingCurrentValueHeaderLength);
            position += underlyingCurrentValueHeaderLength;
            position += buffer.putFloatAscii(position, underlyingCurrentValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingEndValue)
        {
            buffer.putBytes(position, underlyingEndValueHeader, 0, underlyingEndValueHeaderLength);
            position += underlyingEndValueHeaderLength;
            position += buffer.putFloatAscii(position, underlyingEndValue);
            buffer.putSeparator(position);
            position++;
        }

            position += underlyingStipulations.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingSymbol();
        this.resetUnderlyingSymbolSfx();
        this.resetUnderlyingSecurityID();
        this.resetUnderlyingSecurityIDSource();
        this.resetUnderlyingProduct();
        this.resetUnderlyingCFICode();
        this.resetUnderlyingSecurityType();
        this.resetUnderlyingSecuritySubType();
        this.resetUnderlyingMaturityMonthYear();
        this.resetUnderlyingMaturityDate();
        this.resetUnderlyingPutOrCall();
        this.resetUnderlyingCouponPaymentDate();
        this.resetUnderlyingIssueDate();
        this.resetUnderlyingRepoCollateralSecurityType();
        this.resetUnderlyingRepurchaseTerm();
        this.resetUnderlyingRepurchaseRate();
        this.resetUnderlyingFactor();
        this.resetUnderlyingCreditRating();
        this.resetUnderlyingInstrRegistry();
        this.resetUnderlyingCountryOfIssue();
        this.resetUnderlyingStateOrProvinceOfIssue();
        this.resetUnderlyingLocaleOfIssue();
        this.resetUnderlyingRedemptionDate();
        this.resetUnderlyingStrikePrice();
        this.resetUnderlyingStrikeCurrency();
        this.resetUnderlyingOptAttribute();
        this.resetUnderlyingContractMultiplier();
        this.resetUnderlyingCouponRate();
        this.resetUnderlyingSecurityExchange();
        this.resetUnderlyingIssuer();
        this.resetEncodedUnderlyingIssuerLen();
        this.resetEncodedUnderlyingIssuer();
        this.resetUnderlyingSecurityDesc();
        this.resetEncodedUnderlyingSecurityDescLen();
        this.resetEncodedUnderlyingSecurityDesc();
        this.resetUnderlyingCPProgram();
        this.resetUnderlyingCPRegType();
        this.resetUnderlyingCurrency();
        this.resetUnderlyingQty();
        this.resetUnderlyingPx();
        this.resetUnderlyingDirtyPrice();
        this.resetUnderlyingEndPrice();
        this.resetUnderlyingStartValue();
        this.resetUnderlyingCurrentValue();
        this.resetUnderlyingEndValue();
        underlyingStipulations.reset();
        this.resetUnderlyingSecurityAltIDGroup();
    }

    public void resetUnderlyingSymbol()
    {
        underlyingSymbolLength = 0;
        underlyingSymbol.wrap(underlyingSymbolInternalBuffer);
    }

    public void resetUnderlyingSymbolSfx()
    {
        underlyingSymbolSfxLength = 0;
        underlyingSymbolSfx.wrap(underlyingSymbolSfxInternalBuffer);
    }

    public void resetUnderlyingSecurityID()
    {
        underlyingSecurityIDLength = 0;
        underlyingSecurityID.wrap(underlyingSecurityIDInternalBuffer);
    }

    public void resetUnderlyingSecurityIDSource()
    {
        underlyingSecurityIDSourceLength = 0;
        underlyingSecurityIDSource.wrap(underlyingSecurityIDSourceInternalBuffer);
    }

    public void resetUnderlyingProduct()
    {
        hasUnderlyingProduct = false;
    }

    public void resetUnderlyingCFICode()
    {
        underlyingCFICodeLength = 0;
        underlyingCFICode.wrap(underlyingCFICodeInternalBuffer);
    }

    public void resetUnderlyingSecurityType()
    {
        underlyingSecurityTypeLength = 0;
        underlyingSecurityType.wrap(underlyingSecurityTypeInternalBuffer);
    }

    public void resetUnderlyingSecuritySubType()
    {
        underlyingSecuritySubTypeLength = 0;
        underlyingSecuritySubType.wrap(underlyingSecuritySubTypeInternalBuffer);
    }

    public void resetUnderlyingMaturityMonthYear()
    {
        underlyingMaturityMonthYearLength = 0;
        underlyingMaturityMonthYear.wrap(underlyingMaturityMonthYearInternalBuffer);
    }

    public void resetUnderlyingMaturityDate()
    {
        underlyingMaturityDateLength = 0;
        underlyingMaturityDate.wrap(underlyingMaturityDateInternalBuffer);
    }

    public void resetUnderlyingPutOrCall()
    {
        hasUnderlyingPutOrCall = false;
    }

    public void resetUnderlyingCouponPaymentDate()
    {
        underlyingCouponPaymentDateLength = 0;
        underlyingCouponPaymentDate.wrap(underlyingCouponPaymentDateInternalBuffer);
    }

    public void resetUnderlyingIssueDate()
    {
        underlyingIssueDateLength = 0;
        underlyingIssueDate.wrap(underlyingIssueDateInternalBuffer);
    }

    public void resetUnderlyingRepoCollateralSecurityType()
    {
        underlyingRepoCollateralSecurityTypeLength = 0;
        underlyingRepoCollateralSecurityType.wrap(underlyingRepoCollateralSecurityTypeInternalBuffer);
    }

    public void resetUnderlyingRepurchaseTerm()
    {
        hasUnderlyingRepurchaseTerm = false;
    }

    public void resetUnderlyingRepurchaseRate()
    {
        hasUnderlyingRepurchaseRate = false;
    }

    public void resetUnderlyingFactor()
    {
        hasUnderlyingFactor = false;
    }

    public void resetUnderlyingCreditRating()
    {
        underlyingCreditRatingLength = 0;
        underlyingCreditRating.wrap(underlyingCreditRatingInternalBuffer);
    }

    public void resetUnderlyingInstrRegistry()
    {
        underlyingInstrRegistryLength = 0;
        underlyingInstrRegistry.wrap(underlyingInstrRegistryInternalBuffer);
    }

    public void resetUnderlyingCountryOfIssue()
    {
        underlyingCountryOfIssueLength = 0;
        underlyingCountryOfIssue.wrap(underlyingCountryOfIssueInternalBuffer);
    }

    public void resetUnderlyingStateOrProvinceOfIssue()
    {
        underlyingStateOrProvinceOfIssueLength = 0;
        underlyingStateOrProvinceOfIssue.wrap(underlyingStateOrProvinceOfIssueInternalBuffer);
    }

    public void resetUnderlyingLocaleOfIssue()
    {
        underlyingLocaleOfIssueLength = 0;
        underlyingLocaleOfIssue.wrap(underlyingLocaleOfIssueInternalBuffer);
    }

    public void resetUnderlyingRedemptionDate()
    {
        underlyingRedemptionDateLength = 0;
        underlyingRedemptionDate.wrap(underlyingRedemptionDateInternalBuffer);
    }

    public void resetUnderlyingStrikePrice()
    {
        hasUnderlyingStrikePrice = false;
    }

    public void resetUnderlyingStrikeCurrency()
    {
        underlyingStrikeCurrencyLength = 0;
        underlyingStrikeCurrency.wrap(underlyingStrikeCurrencyInternalBuffer);
    }

    public void resetUnderlyingOptAttribute()
    {
        hasUnderlyingOptAttribute = false;
    }

    public void resetUnderlyingContractMultiplier()
    {
        hasUnderlyingContractMultiplier = false;
    }

    public void resetUnderlyingCouponRate()
    {
        hasUnderlyingCouponRate = false;
    }

    public void resetUnderlyingSecurityExchange()
    {
        underlyingSecurityExchangeLength = 0;
        underlyingSecurityExchange.wrap(underlyingSecurityExchangeInternalBuffer);
    }

    public void resetUnderlyingIssuer()
    {
        underlyingIssuerLength = 0;
        underlyingIssuer.wrap(underlyingIssuerInternalBuffer);
    }

    public void resetEncodedUnderlyingIssuerLen()
    {
        hasEncodedUnderlyingIssuerLen = false;
    }

    public void resetEncodedUnderlyingIssuer()
    {
        hasEncodedUnderlyingIssuer = false;
    }

    public void resetUnderlyingSecurityDesc()
    {
        underlyingSecurityDescLength = 0;
        underlyingSecurityDesc.wrap(underlyingSecurityDescInternalBuffer);
    }

    public void resetEncodedUnderlyingSecurityDescLen()
    {
        hasEncodedUnderlyingSecurityDescLen = false;
    }

    public void resetEncodedUnderlyingSecurityDesc()
    {
        hasEncodedUnderlyingSecurityDesc = false;
    }

    public void resetUnderlyingCPProgram()
    {
        underlyingCPProgramLength = 0;
        underlyingCPProgram.wrap(underlyingCPProgramInternalBuffer);
    }

    public void resetUnderlyingCPRegType()
    {
        underlyingCPRegTypeLength = 0;
        underlyingCPRegType.wrap(underlyingCPRegTypeInternalBuffer);
    }

    public void resetUnderlyingCurrency()
    {
        underlyingCurrencyLength = 0;
        underlyingCurrency.wrap(underlyingCurrencyInternalBuffer);
    }

    public void resetUnderlyingQty()
    {
        hasUnderlyingQty = false;
    }

    public void resetUnderlyingPx()
    {
        hasUnderlyingPx = false;
    }

    public void resetUnderlyingDirtyPrice()
    {
        hasUnderlyingDirtyPrice = false;
    }

    public void resetUnderlyingEndPrice()
    {
        hasUnderlyingEndPrice = false;
    }

    public void resetUnderlyingStartValue()
    {
        hasUnderlyingStartValue = false;
    }

    public void resetUnderlyingCurrentValue()
    {
        hasUnderlyingCurrentValue = false;
    }

    public void resetUnderlyingEndValue()
    {
        hasUnderlyingEndValue = false;
    }

    public void resetUnderlyingSecurityAltIDGroup()
    {
        if (underlyingSecurityAltIDGroup != null)
        {
            underlyingSecurityAltIDGroup.reset();
        }
        noUnderlyingSecurityAltIDGroupCounter = 0;
        hasNoUnderlyingSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"UnderlyingInstrument\",\n");
        if (hasUnderlyingSymbol())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSymbol\": \"");
            appendBuffer(builder, underlyingSymbol, underlyingSymbolOffset, underlyingSymbolLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSymbolSfx\": \"");
            appendBuffer(builder, underlyingSymbolSfx, underlyingSymbolSfxOffset, underlyingSymbolSfxLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityID\": \"");
            appendBuffer(builder, underlyingSecurityID, underlyingSecurityIDOffset, underlyingSecurityIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityIDSource\": \"");
            appendBuffer(builder, underlyingSecurityIDSource, underlyingSecurityIDSourceOffset, underlyingSecurityIDSourceLength);
            builder.append("\",\n");
        }

        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltIDGroup\": [\n");
            final int noUnderlyingSecurityAltIDGroupCounter = this.noUnderlyingSecurityAltIDGroupCounter;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
            for (int i = 0; i < noUnderlyingSecurityAltIDGroupCounter; i++)
            {
                indent(builder, level);
                underlyingSecurityAltIDGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingSecurityAltIDGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasUnderlyingProduct())
        {
            indent(builder, level);
            builder.append("\"UnderlyingProduct\": \"");
            builder.append(underlyingProduct);
            builder.append("\",\n");
        }

        if (hasUnderlyingCFICode())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCFICode\": \"");
            appendBuffer(builder, underlyingCFICode, underlyingCFICodeOffset, underlyingCFICodeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityType\": \"");
            appendBuffer(builder, underlyingSecurityType, underlyingSecurityTypeOffset, underlyingSecurityTypeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecuritySubType\": \"");
            appendBuffer(builder, underlyingSecuritySubType, underlyingSecuritySubTypeOffset, underlyingSecuritySubTypeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityMonthYear\": \"");
            appendBuffer(builder, underlyingMaturityMonthYear, underlyingMaturityMonthYearOffset, underlyingMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityDate\": \"");
            appendBuffer(builder, underlyingMaturityDate, underlyingMaturityDateOffset, underlyingMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingPutOrCall())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPutOrCall\": \"");
            builder.append(underlyingPutOrCall);
            builder.append("\",\n");
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCouponPaymentDate\": \"");
            appendBuffer(builder, underlyingCouponPaymentDate, underlyingCouponPaymentDateOffset, underlyingCouponPaymentDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingIssueDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingIssueDate\": \"");
            appendBuffer(builder, underlyingIssueDate, underlyingIssueDateOffset, underlyingIssueDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingRepoCollateralSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepoCollateralSecurityType\": \"");
            appendBuffer(builder, underlyingRepoCollateralSecurityType, underlyingRepoCollateralSecurityTypeOffset, underlyingRepoCollateralSecurityTypeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingRepurchaseTerm())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepurchaseTerm\": \"");
            builder.append(underlyingRepurchaseTerm);
            builder.append("\",\n");
        }

        if (hasUnderlyingRepurchaseRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepurchaseRate\": \"");
            underlyingRepurchaseRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingFactor())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFactor\": \"");
            underlyingFactor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCreditRating())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCreditRating\": \"");
            appendBuffer(builder, underlyingCreditRating, underlyingCreditRatingOffset, underlyingCreditRatingLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrRegistry\": \"");
            appendBuffer(builder, underlyingInstrRegistry, underlyingInstrRegistryOffset, underlyingInstrRegistryLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCountryOfIssue\": \"");
            appendBuffer(builder, underlyingCountryOfIssue, underlyingCountryOfIssueOffset, underlyingCountryOfIssueLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStateOrProvinceOfIssue\": \"");
            appendBuffer(builder, underlyingStateOrProvinceOfIssue, underlyingStateOrProvinceOfIssueOffset, underlyingStateOrProvinceOfIssueLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLocaleOfIssue\": \"");
            appendBuffer(builder, underlyingLocaleOfIssue, underlyingLocaleOfIssueOffset, underlyingLocaleOfIssueLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRedemptionDate\": \"");
            appendBuffer(builder, underlyingRedemptionDate, underlyingRedemptionDateOffset, underlyingRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingStrikePrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStrikePrice\": \"");
            underlyingStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStrikeCurrency\": \"");
            appendBuffer(builder, underlyingStrikeCurrency, underlyingStrikeCurrencyOffset, underlyingStrikeCurrencyLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingOptAttribute())
        {
            indent(builder, level);
            builder.append("\"UnderlyingOptAttribute\": \"");
            builder.append(underlyingOptAttribute);
            builder.append("\",\n");
        }

        if (hasUnderlyingContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"UnderlyingContractMultiplier\": \"");
            underlyingContractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCouponRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCouponRate\": \"");
            underlyingCouponRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityExchange\": \"");
            appendBuffer(builder, underlyingSecurityExchange, underlyingSecurityExchangeOffset, underlyingSecurityExchangeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingIssuer())
        {
            indent(builder, level);
            builder.append("\"UnderlyingIssuer\": \"");
            appendBuffer(builder, underlyingIssuer, underlyingIssuerOffset, underlyingIssuerLength);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingIssuerLen())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingIssuerLen\": \"");
            builder.append(encodedUnderlyingIssuerLen);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingIssuer())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingIssuer\": \"");
            appendData(builder, encodedUnderlyingIssuer, encodedUnderlyingIssuerLen);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityDesc\": \"");
            appendBuffer(builder, underlyingSecurityDesc, underlyingSecurityDescOffset, underlyingSecurityDescLength);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingSecurityDescLen\": \"");
            builder.append(encodedUnderlyingSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingSecurityDesc\": \"");
            appendData(builder, encodedUnderlyingSecurityDesc, encodedUnderlyingSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasUnderlyingCPProgram())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCPProgram\": \"");
            appendBuffer(builder, underlyingCPProgram, underlyingCPProgramOffset, underlyingCPProgramLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingCPRegType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCPRegType\": \"");
            appendBuffer(builder, underlyingCPRegType, underlyingCPRegTypeOffset, underlyingCPRegTypeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingCurrency())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCurrency\": \"");
            appendBuffer(builder, underlyingCurrency, underlyingCurrencyOffset, underlyingCurrencyLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingQty\": \"");
            underlyingQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingPx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPx\": \"");
            underlyingPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingDirtyPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingDirtyPrice\": \"");
            underlyingDirtyPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingEndPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingEndPrice\": \"");
            underlyingEndPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingStartValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStartValue\": \"");
            underlyingStartValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCurrentValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCurrentValue\": \"");
            underlyingCurrentValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingEndValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingEndValue\": \"");
            underlyingEndValue.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingStipulations\": ");
    underlyingStipulations.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public UnderlyingInstrumentEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingInstrumentEncoder)encoder);
    }

    public UnderlyingInstrumentEncoder copyTo(final UnderlyingInstrumentEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingSymbol())
        {
            encoder.underlyingSymbolAsCopy(underlyingSymbol.byteArray(), 0, underlyingSymbolLength);
        }

        if (hasUnderlyingSymbolSfx())
        {
            encoder.underlyingSymbolSfxAsCopy(underlyingSymbolSfx.byteArray(), 0, underlyingSymbolSfxLength);
        }

        if (hasUnderlyingSecurityID())
        {
            encoder.underlyingSecurityIDAsCopy(underlyingSecurityID.byteArray(), 0, underlyingSecurityIDLength);
        }

        if (hasUnderlyingSecurityIDSource())
        {
            encoder.underlyingSecurityIDSourceAsCopy(underlyingSecurityIDSource.byteArray(), 0, underlyingSecurityIDSourceLength);
        }

        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            final int size = this.noUnderlyingSecurityAltIDGroupCounter;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroupEncoder = encoder.underlyingSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingSecurityAltIDGroup != null)
                {
                    underlyingSecurityAltIDGroup.copyTo(underlyingSecurityAltIDGroupEncoder);
                    underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();
                    underlyingSecurityAltIDGroupEncoder = underlyingSecurityAltIDGroupEncoder.next();
                }
            }
        }

        if (hasUnderlyingProduct())
        {
            encoder.underlyingProduct(this.underlyingProduct());
        }

        if (hasUnderlyingCFICode())
        {
            encoder.underlyingCFICodeAsCopy(underlyingCFICode.byteArray(), 0, underlyingCFICodeLength);
        }

        if (hasUnderlyingSecurityType())
        {
            encoder.underlyingSecurityTypeAsCopy(underlyingSecurityType.byteArray(), 0, underlyingSecurityTypeLength);
        }

        if (hasUnderlyingSecuritySubType())
        {
            encoder.underlyingSecuritySubTypeAsCopy(underlyingSecuritySubType.byteArray(), 0, underlyingSecuritySubTypeLength);
        }

        if (hasUnderlyingMaturityMonthYear())
        {
            encoder.underlyingMaturityMonthYearAsCopy(underlyingMaturityMonthYear.byteArray(), 0, underlyingMaturityMonthYearLength);
        }

        if (hasUnderlyingMaturityDate())
        {
            encoder.underlyingMaturityDateAsCopy(underlyingMaturityDate.byteArray(), 0, underlyingMaturityDateLength);
        }

        if (hasUnderlyingPutOrCall())
        {
            encoder.underlyingPutOrCall(this.underlyingPutOrCall());
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            encoder.underlyingCouponPaymentDateAsCopy(underlyingCouponPaymentDate.byteArray(), 0, underlyingCouponPaymentDateLength);
        }

        if (hasUnderlyingIssueDate())
        {
            encoder.underlyingIssueDateAsCopy(underlyingIssueDate.byteArray(), 0, underlyingIssueDateLength);
        }

        if (hasUnderlyingRepoCollateralSecurityType())
        {
            encoder.underlyingRepoCollateralSecurityTypeAsCopy(underlyingRepoCollateralSecurityType.byteArray(), 0, underlyingRepoCollateralSecurityTypeLength);
        }

        if (hasUnderlyingRepurchaseTerm())
        {
            encoder.underlyingRepurchaseTerm(this.underlyingRepurchaseTerm());
        }

        if (hasUnderlyingRepurchaseRate())
        {
            encoder.underlyingRepurchaseRate(this.underlyingRepurchaseRate());
        }

        if (hasUnderlyingFactor())
        {
            encoder.underlyingFactor(this.underlyingFactor());
        }

        if (hasUnderlyingCreditRating())
        {
            encoder.underlyingCreditRatingAsCopy(underlyingCreditRating.byteArray(), 0, underlyingCreditRatingLength);
        }

        if (hasUnderlyingInstrRegistry())
        {
            encoder.underlyingInstrRegistryAsCopy(underlyingInstrRegistry.byteArray(), 0, underlyingInstrRegistryLength);
        }

        if (hasUnderlyingCountryOfIssue())
        {
            encoder.underlyingCountryOfIssueAsCopy(underlyingCountryOfIssue.byteArray(), 0, underlyingCountryOfIssueLength);
        }

        if (hasUnderlyingStateOrProvinceOfIssue())
        {
            encoder.underlyingStateOrProvinceOfIssueAsCopy(underlyingStateOrProvinceOfIssue.byteArray(), 0, underlyingStateOrProvinceOfIssueLength);
        }

        if (hasUnderlyingLocaleOfIssue())
        {
            encoder.underlyingLocaleOfIssueAsCopy(underlyingLocaleOfIssue.byteArray(), 0, underlyingLocaleOfIssueLength);
        }

        if (hasUnderlyingRedemptionDate())
        {
            encoder.underlyingRedemptionDateAsCopy(underlyingRedemptionDate.byteArray(), 0, underlyingRedemptionDateLength);
        }

        if (hasUnderlyingStrikePrice())
        {
            encoder.underlyingStrikePrice(this.underlyingStrikePrice());
        }

        if (hasUnderlyingStrikeCurrency())
        {
            encoder.underlyingStrikeCurrencyAsCopy(underlyingStrikeCurrency.byteArray(), 0, underlyingStrikeCurrencyLength);
        }

        if (hasUnderlyingOptAttribute())
        {
            encoder.underlyingOptAttribute(this.underlyingOptAttribute());
        }

        if (hasUnderlyingContractMultiplier())
        {
            encoder.underlyingContractMultiplier(this.underlyingContractMultiplier());
        }

        if (hasUnderlyingCouponRate())
        {
            encoder.underlyingCouponRate(this.underlyingCouponRate());
        }

        if (hasUnderlyingSecurityExchange())
        {
            encoder.underlyingSecurityExchangeAsCopy(underlyingSecurityExchange.byteArray(), 0, underlyingSecurityExchangeLength);
        }

        if (hasUnderlyingIssuer())
        {
            encoder.underlyingIssuerAsCopy(underlyingIssuer.byteArray(), 0, underlyingIssuerLength);
        }

        if (hasEncodedUnderlyingIssuerLen())
        {
            encoder.encodedUnderlyingIssuerLen(this.encodedUnderlyingIssuerLen());
        }

        if (hasEncodedUnderlyingIssuer())
        {
            encoder.encodedUnderlyingIssuerAsCopy(this.encodedUnderlyingIssuer(), 0, encodedUnderlyingIssuerLen());
            encoder.encodedUnderlyingIssuerLen(encodedUnderlyingIssuerLen());
        }

        if (hasUnderlyingSecurityDesc())
        {
            encoder.underlyingSecurityDescAsCopy(underlyingSecurityDesc.byteArray(), 0, underlyingSecurityDescLength);
        }

        if (hasEncodedUnderlyingSecurityDescLen())
        {
            encoder.encodedUnderlyingSecurityDescLen(this.encodedUnderlyingSecurityDescLen());
        }

        if (hasEncodedUnderlyingSecurityDesc())
        {
            encoder.encodedUnderlyingSecurityDescAsCopy(this.encodedUnderlyingSecurityDesc(), 0, encodedUnderlyingSecurityDescLen());
            encoder.encodedUnderlyingSecurityDescLen(encodedUnderlyingSecurityDescLen());
        }

        if (hasUnderlyingCPProgram())
        {
            encoder.underlyingCPProgramAsCopy(underlyingCPProgram.byteArray(), 0, underlyingCPProgramLength);
        }

        if (hasUnderlyingCPRegType())
        {
            encoder.underlyingCPRegTypeAsCopy(underlyingCPRegType.byteArray(), 0, underlyingCPRegTypeLength);
        }

        if (hasUnderlyingCurrency())
        {
            encoder.underlyingCurrencyAsCopy(underlyingCurrency.byteArray(), 0, underlyingCurrencyLength);
        }

        if (hasUnderlyingQty())
        {
            encoder.underlyingQty(this.underlyingQty());
        }

        if (hasUnderlyingPx())
        {
            encoder.underlyingPx(this.underlyingPx());
        }

        if (hasUnderlyingDirtyPrice())
        {
            encoder.underlyingDirtyPrice(this.underlyingDirtyPrice());
        }

        if (hasUnderlyingEndPrice())
        {
            encoder.underlyingEndPrice(this.underlyingEndPrice());
        }

        if (hasUnderlyingStartValue())
        {
            encoder.underlyingStartValue(this.underlyingStartValue());
        }

        if (hasUnderlyingCurrentValue())
        {
            encoder.underlyingCurrentValue(this.underlyingCurrentValue());
        }

        if (hasUnderlyingEndValue())
        {
            encoder.underlyingEndValue(this.underlyingEndValue());
        }


        underlyingStipulations.copyTo(encoder.underlyingStipulations());        return encoder;
    }

}
