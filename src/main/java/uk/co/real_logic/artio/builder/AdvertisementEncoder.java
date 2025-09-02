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
public class AdvertisementEncoder implements Encoder
{
    public long messageType()
    {
        return 55L;
    }

    public AdvertisementEncoder()
    {
        header.msgType("7");
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

    private static final int advIdHeaderLength = 2;
    private static final byte[] advIdHeader = new byte[] {50, (byte) '='};

    private static final int advTransTypeHeaderLength = 2;
    private static final byte[] advTransTypeHeader = new byte[] {53, (byte) '='};

    private static final int advRefIDHeaderLength = 2;
    private static final byte[] advRefIDHeader = new byte[] {51, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int advSideHeaderLength = 2;
    private static final byte[] advSideHeader = new byte[] {52, (byte) '='};

    private static final int quantityHeaderLength = 3;
    private static final byte[] quantityHeader = new byte[] {53, 51, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int uRLLinkHeaderLength = 4;
    private static final byte[] uRLLinkHeader = new byte[] {49, 52, 57, (byte) '='};

    private static final int lastMktHeaderLength = 3;
    private static final byte[] lastMktHeader = new byte[] {51, 48, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private final MutableDirectBuffer advId = new UnsafeBuffer();
    private byte[] advIdInternalBuffer = advId.byteArray();
    private int advIdOffset = 0;
    private int advIdLength = 0;

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final DirectBuffer value, final int offset, final int length)
    {
        advId.wrap(value);
        advIdOffset = offset;
        advIdLength = length;
        return this;
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final DirectBuffer value, final int length)
    {
        return advId(value, 0, length);
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final DirectBuffer value)
    {
        return advId(value, 0, value.capacity());
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final byte[] value, final int offset, final int length)
    {
        advId.wrap(value);
        advIdOffset = offset;
        advIdLength = length;
        return this;
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advIdAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(advId, value, offset, length))
        {
            advIdInternalBuffer = advId.byteArray();
        }
        advIdOffset = 0;
        advIdLength = length;
        return this;
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final byte[] value, final int length)
    {
        return advId(value, 0, length);
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final byte[] value)
    {
        return advId(value, 0, value.length);
    }

    /* AdvId = 2 */
    public boolean hasAdvId()
    {
        return advIdLength > 0;
    }

    /* AdvId = 2 */
    public MutableDirectBuffer advId()
    {
        return advId;
    }

    /* AdvId = 2 */
    public String advIdAsString()
    {
        return advId.getStringWithoutLengthAscii(advIdOffset, advIdLength);
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final CharSequence value)
    {
        if (toBytes(value, advId))
        {
            advIdInternalBuffer = advId.byteArray();
        }
        advIdOffset = 0;
        advIdLength = value.length();
        return this;
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            advId.wrap(buffer);
            advIdOffset = value.offset();
            advIdLength = value.length();
        }
        return this;
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final char[] value)
    {
        return advId(value, 0, value.length);
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final char[] value, final int length)
    {
        return advId(value, 0, length);
    }

    /* AdvId = 2 */
    public AdvertisementEncoder advId(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, advId, offset, length))
        {
            advIdInternalBuffer = advId.byteArray();
        }
        advIdOffset = 0;
        advIdLength = length;
        return this;
    }

    private final MutableDirectBuffer advTransType = new UnsafeBuffer();
    private byte[] advTransTypeInternalBuffer = advTransType.byteArray();
    private int advTransTypeOffset = 0;
    private int advTransTypeLength = 0;

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final DirectBuffer value, final int offset, final int length)
    {
        advTransType.wrap(value);
        advTransTypeOffset = offset;
        advTransTypeLength = length;
        return this;
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final DirectBuffer value, final int length)
    {
        return advTransType(value, 0, length);
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final DirectBuffer value)
    {
        return advTransType(value, 0, value.capacity());
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final byte[] value, final int offset, final int length)
    {
        advTransType.wrap(value);
        advTransTypeOffset = offset;
        advTransTypeLength = length;
        return this;
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(advTransType, value, offset, length))
        {
            advTransTypeInternalBuffer = advTransType.byteArray();
        }
        advTransTypeOffset = 0;
        advTransTypeLength = length;
        return this;
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final byte[] value, final int length)
    {
        return advTransType(value, 0, length);
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final byte[] value)
    {
        return advTransType(value, 0, value.length);
    }

    /* AdvTransType = 5 */
    public boolean hasAdvTransType()
    {
        return advTransTypeLength > 0;
    }

    /* AdvTransType = 5 */
    public MutableDirectBuffer advTransType()
    {
        return advTransType;
    }

    /* AdvTransType = 5 */
    public String advTransTypeAsString()
    {
        return advTransType.getStringWithoutLengthAscii(advTransTypeOffset, advTransTypeLength);
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final CharSequence value)
    {
        if (toBytes(value, advTransType))
        {
            advTransTypeInternalBuffer = advTransType.byteArray();
        }
        advTransTypeOffset = 0;
        advTransTypeLength = value.length();
        return this;
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            advTransType.wrap(buffer);
            advTransTypeOffset = value.offset();
            advTransTypeLength = value.length();
        }
        return this;
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final char[] value)
    {
        return advTransType(value, 0, value.length);
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final char[] value, final int length)
    {
        return advTransType(value, 0, length);
    }

    /* AdvTransType = 5 */
    public AdvertisementEncoder advTransType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, advTransType, offset, length))
        {
            advTransTypeInternalBuffer = advTransType.byteArray();
        }
        advTransTypeOffset = 0;
        advTransTypeLength = length;
        return this;
    }

    public AdvertisementEncoder advTransType(AdvTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AdvTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: advTransType Value: " + value );
            }
            if (value == AdvTransType.NULL_VAL)
            {
                return this;
            }
        }
        return advTransType(value.representation());
    }

    private final MutableDirectBuffer advRefID = new UnsafeBuffer();
    private byte[] advRefIDInternalBuffer = advRefID.byteArray();
    private int advRefIDOffset = 0;
    private int advRefIDLength = 0;

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final DirectBuffer value, final int offset, final int length)
    {
        advRefID.wrap(value);
        advRefIDOffset = offset;
        advRefIDLength = length;
        return this;
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final DirectBuffer value, final int length)
    {
        return advRefID(value, 0, length);
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final DirectBuffer value)
    {
        return advRefID(value, 0, value.capacity());
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final byte[] value, final int offset, final int length)
    {
        advRefID.wrap(value);
        advRefIDOffset = offset;
        advRefIDLength = length;
        return this;
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(advRefID, value, offset, length))
        {
            advRefIDInternalBuffer = advRefID.byteArray();
        }
        advRefIDOffset = 0;
        advRefIDLength = length;
        return this;
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final byte[] value, final int length)
    {
        return advRefID(value, 0, length);
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final byte[] value)
    {
        return advRefID(value, 0, value.length);
    }

    /* AdvRefID = 3 */
    public boolean hasAdvRefID()
    {
        return advRefIDLength > 0;
    }

    /* AdvRefID = 3 */
    public MutableDirectBuffer advRefID()
    {
        return advRefID;
    }

    /* AdvRefID = 3 */
    public String advRefIDAsString()
    {
        return advRefID.getStringWithoutLengthAscii(advRefIDOffset, advRefIDLength);
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final CharSequence value)
    {
        if (toBytes(value, advRefID))
        {
            advRefIDInternalBuffer = advRefID.byteArray();
        }
        advRefIDOffset = 0;
        advRefIDLength = value.length();
        return this;
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            advRefID.wrap(buffer);
            advRefIDOffset = value.offset();
            advRefIDLength = value.length();
        }
        return this;
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final char[] value)
    {
        return advRefID(value, 0, value.length);
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final char[] value, final int length)
    {
        return advRefID(value, 0, length);
    }

    /* AdvRefID = 3 */
    public AdvertisementEncoder advRefID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, advRefID, offset, length))
        {
            advRefIDInternalBuffer = advRefID.byteArray();
        }
        advRefIDOffset = 0;
        advRefIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }


@Generated("uk.co.real_logic.artio")
public static class LegsGroupEncoder
{
    private LegsGroupEncoder next = null;

    public LegsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegsGroupEncoder();
        }
        return next;
    }

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        instrumentLeg.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"LegsGroup\",\n");
    indent(builder, level);
    builder.append("\"InstrumentLeg\": ");
    instrumentLeg.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public LegsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegsGroupEncoder)encoder);
    }

    public LegsGroupEncoder copyTo(final LegsGroupEncoder encoder)
    {
        encoder.reset();

        instrumentLeg.copyTo(encoder.instrumentLeg());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    /* NoLegsGroupCounter = 555 */
    public AdvertisementEncoder noLegsGroupCounter(int value)
    {
        noLegsGroupCounter = value;
        hasNoLegsGroupCounter = true;
        return this;
    }

    /* NoLegsGroupCounter = 555 */
    public int noLegsGroupCounter()
    {
        return noLegsGroupCounter;
    }


    private LegsGroupEncoder legsGroup = null;

    public LegsGroupEncoder legsGroup(final int numberOfElements)
    {
        hasNoLegsGroupCounter = true;
        noLegsGroupCounter = numberOfElements;
        if (legsGroup == null)
        {
            legsGroup = new LegsGroupEncoder();
        }
        return legsGroup;
    }


@Generated("uk.co.real_logic.artio")
public static class UnderlyingsGroupEncoder
{
    private UnderlyingsGroupEncoder next = null;

    public UnderlyingsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingsGroupEncoder();
        }
        return next;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        underlyingInstrument.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public UnderlyingsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingsGroupEncoder)encoder);
    }

    public UnderlyingsGroupEncoder copyTo(final UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        underlyingInstrument.copyTo(encoder.underlyingInstrument());        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    /* NoUnderlyingsGroupCounter = 711 */
    public AdvertisementEncoder noUnderlyingsGroupCounter(int value)
    {
        noUnderlyingsGroupCounter = value;
        hasNoUnderlyingsGroupCounter = true;
        return this;
    }

    /* NoUnderlyingsGroupCounter = 711 */
    public int noUnderlyingsGroupCounter()
    {
        return noUnderlyingsGroupCounter;
    }


    private UnderlyingsGroupEncoder underlyingsGroup = null;

    public UnderlyingsGroupEncoder underlyingsGroup(final int numberOfElements)
    {
        hasNoUnderlyingsGroupCounter = true;
        noUnderlyingsGroupCounter = numberOfElements;
        if (underlyingsGroup == null)
        {
            underlyingsGroup = new UnderlyingsGroupEncoder();
        }
        return underlyingsGroup;
    }

    private char advSide;

    private boolean hasAdvSide;

    public boolean hasAdvSide()
    {
        return hasAdvSide;
    }

    /* AdvSide = 4 */
    public AdvertisementEncoder advSide(char value)
    {
        advSide = value;
        hasAdvSide = true;
        return this;
    }

    /* AdvSide = 4 */
    public char advSide()
    {
        return advSide;
    }

    public AdvertisementEncoder advSide(AdvSide value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AdvSide.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: advSide Value: " + value );
            }
            if (value == AdvSide.NULL_VAL)
            {
                return this;
            }
        }
        return advSide(value.representation());
    }

    private final DecimalFloat quantity = new DecimalFloat();

    private boolean hasQuantity;

    public boolean hasQuantity()
    {
        return hasQuantity;
    }

    /* Quantity = 53 */
    public AdvertisementEncoder quantity(ReadOnlyDecimalFloat value)
    {
        quantity.set(value);
        hasQuantity = true;
        return this;
    }

    /* Quantity = 53 */
    public AdvertisementEncoder quantity(long value, int scale)
    {
        quantity.set(value, scale);
        hasQuantity = true;
        return this;
    }

    /* Quantity = 53 */
    public DecimalFloat quantity()
    {
        return quantity;
    }

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    /* QtyType = 854 */
    public AdvertisementEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    /* QtyType = 854 */
    public int qtyType()
    {
        return qtyType;
    }

    public AdvertisementEncoder qtyType(QtyType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QtyType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: qtyType Value: " + value );
            }
            if (value == QtyType.NULL_VAL)
            {
                return this;
            }
        }
        return qtyType(value.representation());
    }

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    /* Price = 44 */
    public AdvertisementEncoder price(ReadOnlyDecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    /* Price = 44 */
    public AdvertisementEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    /* Price = 44 */
    public DecimalFloat price()
    {
        return price;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();
    private byte[] currencyInternalBuffer = currency.byteArray();
    private int currencyOffset = 0;
    private int currencyLength = 0;

    /* Currency = 15 */
    public AdvertisementEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public AdvertisementEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(currency, value, offset, length))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final byte[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public boolean hasCurrency()
    {
        return currencyLength > 0;
    }

    /* Currency = 15 */
    public MutableDirectBuffer currency()
    {
        return currency;
    }

    /* Currency = 15 */
    public String currencyAsString()
    {
        return currency.getStringWithoutLengthAscii(currencyOffset, currencyLength);
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final CharSequence value)
    {
        if (toBytes(value, currency))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            currency.wrap(buffer);
            currencyOffset = value.offset();
            currencyLength = value.length();
        }
        return this;
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public AdvertisementEncoder currency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, currency, offset, length))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();
    private byte[] tradeDateInternalBuffer = tradeDate.byteArray();
    private int tradeDateOffset = 0;
    private int tradeDateLength = 0;

    /* TradeDate = 75 */
    public AdvertisementEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public AdvertisementEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public AdvertisementEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    /* TradeDate = 75 */
    public AdvertisementEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public AdvertisementEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeDate, value, offset, length))
        {
            tradeDateInternalBuffer = tradeDate.byteArray();
        }
        tradeDateOffset = 0;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public AdvertisementEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public AdvertisementEncoder tradeDate(final byte[] value)
    {
        return tradeDate(value, 0, value.length);
    }

    /* TradeDate = 75 */
    public boolean hasTradeDate()
    {
        return tradeDateLength > 0;
    }

    /* TradeDate = 75 */
    public MutableDirectBuffer tradeDate()
    {
        return tradeDate;
    }

    /* TradeDate = 75 */
    public String tradeDateAsString()
    {
        return tradeDate.getStringWithoutLengthAscii(tradeDateOffset, tradeDateLength);
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();
    private byte[] transactTimeInternalBuffer = transactTime.byteArray();
    private int transactTimeOffset = 0;
    private int transactTimeLength = 0;

    /* TransactTime = 60 */
    public AdvertisementEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public AdvertisementEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public AdvertisementEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public AdvertisementEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public AdvertisementEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public AdvertisementEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public AdvertisementEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public AdvertisementEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public AdvertisementEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public AdvertisementEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public AdvertisementEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public AdvertisementEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public AdvertisementEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public AdvertisementEncoder text(final byte[] value)
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
    public AdvertisementEncoder text(final CharSequence value)
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
    public AdvertisementEncoder text(final AsciiSequenceView value)
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
    public AdvertisementEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public AdvertisementEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public AdvertisementEncoder text(final char[] value, final int offset, final int length)
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
    public AdvertisementEncoder encodedTextLen(int value)
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
    public AdvertisementEncoder encodedText(byte[] value)
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
    public AdvertisementEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer uRLLink = new UnsafeBuffer();
    private byte[] uRLLinkInternalBuffer = uRLLink.byteArray();
    private int uRLLinkOffset = 0;
    private int uRLLinkLength = 0;

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final DirectBuffer value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final DirectBuffer value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final DirectBuffer value)
    {
        return uRLLink(value, 0, value.capacity());
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final byte[] value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLinkAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(uRLLink, value, offset, length))
        {
            uRLLinkInternalBuffer = uRLLink.byteArray();
        }
        uRLLinkOffset = 0;
        uRLLinkLength = length;
        return this;
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final byte[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final byte[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    /* URLLink = 149 */
    public boolean hasURLLink()
    {
        return uRLLinkLength > 0;
    }

    /* URLLink = 149 */
    public MutableDirectBuffer uRLLink()
    {
        return uRLLink;
    }

    /* URLLink = 149 */
    public String uRLLinkAsString()
    {
        return uRLLink.getStringWithoutLengthAscii(uRLLinkOffset, uRLLinkLength);
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final CharSequence value)
    {
        if (toBytes(value, uRLLink))
        {
            uRLLinkInternalBuffer = uRLLink.byteArray();
        }
        uRLLinkOffset = 0;
        uRLLinkLength = value.length();
        return this;
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            uRLLink.wrap(buffer);
            uRLLinkOffset = value.offset();
            uRLLinkLength = value.length();
        }
        return this;
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final char[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final char[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    /* URLLink = 149 */
    public AdvertisementEncoder uRLLink(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, uRLLink, offset, length))
        {
            uRLLinkInternalBuffer = uRLLink.byteArray();
        }
        uRLLinkOffset = 0;
        uRLLinkLength = length;
        return this;
    }

    private final MutableDirectBuffer lastMkt = new UnsafeBuffer();
    private byte[] lastMktInternalBuffer = lastMkt.byteArray();
    private int lastMktOffset = 0;
    private int lastMktLength = 0;

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final DirectBuffer value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final DirectBuffer value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final DirectBuffer value)
    {
        return lastMkt(value, 0, value.capacity());
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final byte[] value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMktAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(lastMkt, value, offset, length))
        {
            lastMktInternalBuffer = lastMkt.byteArray();
        }
        lastMktOffset = 0;
        lastMktLength = length;
        return this;
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final byte[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final byte[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    /* LastMkt = 30 */
    public boolean hasLastMkt()
    {
        return lastMktLength > 0;
    }

    /* LastMkt = 30 */
    public MutableDirectBuffer lastMkt()
    {
        return lastMkt;
    }

    /* LastMkt = 30 */
    public String lastMktAsString()
    {
        return lastMkt.getStringWithoutLengthAscii(lastMktOffset, lastMktLength);
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final CharSequence value)
    {
        if (toBytes(value, lastMkt))
        {
            lastMktInternalBuffer = lastMkt.byteArray();
        }
        lastMktOffset = 0;
        lastMktLength = value.length();
        return this;
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            lastMkt.wrap(buffer);
            lastMktOffset = value.offset();
            lastMktLength = value.length();
        }
        return this;
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final char[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final char[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    /* LastMkt = 30 */
    public AdvertisementEncoder lastMkt(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, lastMkt, offset, length))
        {
            lastMktInternalBuffer = lastMkt.byteArray();
        }
        lastMktOffset = 0;
        lastMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradingSessionID, value, offset, length))
        {
            tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
        }
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final byte[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public boolean hasTradingSessionID()
    {
        return tradingSessionIDLength > 0;
    }

    /* TradingSessionID = 336 */
    public MutableDirectBuffer tradingSessionID()
    {
        return tradingSessionID;
    }

    /* TradingSessionID = 336 */
    public String tradingSessionIDAsString()
    {
        return tradingSessionID.getStringWithoutLengthAscii(tradingSessionIDOffset, tradingSessionIDLength);
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final CharSequence value)
    {
        if (toBytes(value, tradingSessionID))
        {
            tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
        }
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionID.wrap(buffer);
            tradingSessionIDOffset = value.offset();
            tradingSessionIDLength = value.length();
        }
        return this;
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public AdvertisementEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionID, offset, length))
        {
            tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
        }
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();
    private byte[] tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
    private int tradingSessionSubIDOffset = 0;
    private int tradingSessionSubIDLength = 0;

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradingSessionSubID, value, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final byte[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public boolean hasTradingSessionSubID()
    {
        return tradingSessionSubIDLength > 0;
    }

    /* TradingSessionSubID = 625 */
    public MutableDirectBuffer tradingSessionSubID()
    {
        return tradingSessionSubID;
    }

    /* TradingSessionSubID = 625 */
    public String tradingSessionSubIDAsString()
    {
        return tradingSessionSubID.getStringWithoutLengthAscii(tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final CharSequence value)
    {
        if (toBytes(value, tradingSessionSubID))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionSubID.wrap(buffer);
            tradingSessionSubIDOffset = value.offset();
            tradingSessionSubIDLength = value.length();
        }
        return this;
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public AdvertisementEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (advIdLength > 0)
        {
            buffer.putBytes(position, advIdHeader, 0, advIdHeaderLength);
            position += advIdHeaderLength;
            buffer.putBytes(position, advId, advIdOffset, advIdLength);
            position += advIdLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AdvId");
        }

        if (advTransTypeLength > 0)
        {
            buffer.putBytes(position, advTransTypeHeader, 0, advTransTypeHeaderLength);
            position += advTransTypeHeaderLength;
            buffer.putBytes(position, advTransType, advTransTypeOffset, advTransTypeLength);
            position += advTransTypeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AdvTransType");
        }

        if (advRefIDLength > 0)
        {
            buffer.putBytes(position, advRefIDHeader, 0, advRefIDHeaderLength);
            position += advRefIDHeaderLength;
            buffer.putBytes(position, advRefID, advRefIDOffset, advRefIDLength);
            position += advRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

        if (hasNoLegsGroupCounter)
        {
            buffer.putBytes(position, noLegsGroupCounterHeader, 0, noLegsGroupCounterHeaderLength);
            position += noLegsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legsGroup != null)
        {
            position += legsGroup.encode(buffer, position, noLegsGroupCounter);
        }


        if (hasNoUnderlyingsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingsGroupCounterHeader, 0, noUnderlyingsGroupCounterHeaderLength);
            position += noUnderlyingsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingsGroup != null)
        {
            position += underlyingsGroup.encode(buffer, position, noUnderlyingsGroupCounter);
        }


        if (hasAdvSide)
        {
            buffer.putBytes(position, advSideHeader, 0, advSideHeaderLength);
            position += advSideHeaderLength;
            position += buffer.putCharAscii(position, advSide);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AdvSide");
        }

        if (hasQuantity)
        {
            buffer.putBytes(position, quantityHeader, 0, quantityHeaderLength);
            position += quantityHeaderLength;
            position += buffer.putFloatAscii(position, quantity);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Quantity");
        }

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPrice)
        {
            buffer.putBytes(position, priceHeader, 0, priceHeaderLength);
            position += priceHeaderLength;
            position += buffer.putFloatAscii(position, price);
            buffer.putSeparator(position);
            position++;
        }

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeDateLength > 0)
        {
            buffer.putBytes(position, tradeDateHeader, 0, tradeDateHeaderLength);
            position += tradeDateHeaderLength;
            buffer.putBytes(position, tradeDate, tradeDateOffset, tradeDateLength);
            position += tradeDateLength;
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

        if (uRLLinkLength > 0)
        {
            buffer.putBytes(position, uRLLinkHeader, 0, uRLLinkHeaderLength);
            position += uRLLinkHeaderLength;
            buffer.putBytes(position, uRLLink, uRLLinkOffset, uRLLinkLength);
            position += uRLLinkLength;
            buffer.putSeparator(position);
            position++;
        }

        if (lastMktLength > 0)
        {
            buffer.putBytes(position, lastMktHeader, 0, lastMktHeaderLength);
            position += lastMktHeaderLength;
            buffer.putBytes(position, lastMkt, lastMktOffset, lastMktLength);
            position += lastMktLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionIDHeader, 0, tradingSessionIDHeaderLength);
            position += tradingSessionIDHeaderLength;
            buffer.putBytes(position, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            position += tradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionSubIDHeader, 0, tradingSessionSubIDHeaderLength);
            position += tradingSessionSubIDHeaderLength;
            buffer.putBytes(position, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            position += tradingSessionSubIDLength;
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
        this.resetAdvId();
        this.resetAdvTransType();
        this.resetAdvRefID();
        this.resetAdvSide();
        this.resetQuantity();
        this.resetQtyType();
        this.resetPrice();
        this.resetCurrency();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetURLLink();
        this.resetLastMkt();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        instrument.reset();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
    }

    public void resetAdvId()
    {
        advIdLength = 0;
        advId.wrap(advIdInternalBuffer);
    }

    public void resetAdvTransType()
    {
        advTransTypeLength = 0;
        advTransType.wrap(advTransTypeInternalBuffer);
    }

    public void resetAdvRefID()
    {
        advRefIDLength = 0;
        advRefID.wrap(advRefIDInternalBuffer);
    }

    public void resetAdvSide()
    {
        advSide = MISSING_CHAR;
    }

    public void resetQuantity()
    {
        hasQuantity = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
        currency.wrap(currencyInternalBuffer);
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
        tradeDate.wrap(tradeDateInternalBuffer);
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
        transactTime.wrap(transactTimeInternalBuffer);
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

    public void resetURLLink()
    {
        uRLLinkLength = 0;
        uRLLink.wrap(uRLLinkInternalBuffer);
    }

    public void resetLastMkt()
    {
        lastMktLength = 0;
        lastMkt.wrap(lastMktInternalBuffer);
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
        tradingSessionID.wrap(tradingSessionIDInternalBuffer);
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
        tradingSessionSubID.wrap(tradingSessionSubIDInternalBuffer);
    }

    public void resetLegsGroup()
    {
        if (legsGroup != null)
        {
            legsGroup.reset();
        }
        noLegsGroupCounter = 0;
        hasNoLegsGroupCounter = false;
    }

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
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
        builder.append("\"MessageName\": \"Advertisement\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasAdvId())
        {
            indent(builder, level);
            builder.append("\"AdvId\": \"");
            appendBuffer(builder, advId, advIdOffset, advIdLength);
            builder.append("\",\n");
        }

        if (hasAdvTransType())
        {
            indent(builder, level);
            builder.append("\"AdvTransType\": \"");
            appendBuffer(builder, advTransType, advTransTypeOffset, advTransTypeLength);
            builder.append("\",\n");
        }

        if (hasAdvRefID())
        {
            indent(builder, level);
            builder.append("\"AdvRefID\": \"");
            appendBuffer(builder, advRefID, advRefIDOffset, advRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNoLegsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegsGroup\": [\n");
            final int noLegsGroupCounter = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            for (int i = 0; i < noLegsGroupCounter; i++)
            {
                indent(builder, level);
                legsGroup.appendTo(builder, level + 1);
                if (i < (noLegsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legsGroup = legsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingsGroup\": [\n");
            final int noUnderlyingsGroupCounter = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            for (int i = 0; i < noUnderlyingsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingsGroup = underlyingsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasAdvSide())
        {
            indent(builder, level);
            builder.append("\"AdvSide\": \"");
            builder.append(advSide);
            builder.append("\",\n");
        }

        if (hasQuantity())
        {
            indent(builder, level);
            builder.append("\"Quantity\": \"");
            quantity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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

        if (hasURLLink())
        {
            indent(builder, level);
            builder.append("\"URLLink\": \"");
            appendBuffer(builder, uRLLink, uRLLinkOffset, uRLLinkLength);
            builder.append("\",\n");
        }

        if (hasLastMkt())
        {
            indent(builder, level);
            builder.append("\"LastMkt\": \"");
            appendBuffer(builder, lastMkt, lastMktOffset, lastMktLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            appendBuffer(builder, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            appendBuffer(builder, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public AdvertisementEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AdvertisementEncoder)encoder);
    }

    public AdvertisementEncoder copyTo(final AdvertisementEncoder encoder)
    {
        encoder.reset();
        if (hasAdvId())
        {
            encoder.advIdAsCopy(advId.byteArray(), 0, advIdLength);
        }

        if (hasAdvTransType())
        {
            encoder.advTransTypeAsCopy(advTransType.byteArray(), 0, advTransTypeLength);
        }

        if (hasAdvRefID())
        {
            encoder.advRefIDAsCopy(advRefID.byteArray(), 0, advRefIDLength);
        }


        instrument.copyTo(encoder.instrument());
        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = encoder.legsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legsGroup != null)
                {
                    legsGroup.copyTo(legsGroupEncoder);
                    legsGroup = legsGroup.next();
                    legsGroupEncoder = legsGroupEncoder.next();
                }
            }
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = encoder.underlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingsGroup != null)
                {
                    underlyingsGroup.copyTo(underlyingsGroupEncoder);
                    underlyingsGroup = underlyingsGroup.next();
                    underlyingsGroupEncoder = underlyingsGroupEncoder.next();
                }
            }
        }

        if (hasAdvSide())
        {
            encoder.advSide(this.advSide());
        }

        if (hasQuantity())
        {
            encoder.quantity(this.quantity());
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
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

        if (hasURLLink())
        {
            encoder.uRLLinkAsCopy(uRLLink.byteArray(), 0, uRLLinkLength);
        }

        if (hasLastMkt())
        {
            encoder.lastMktAsCopy(lastMkt.byteArray(), 0, lastMktLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }
        return encoder;
    }

}
