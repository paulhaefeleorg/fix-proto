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
public class OrderMassCancelReportEncoder implements Encoder
{
    public long messageType()
    {
        return 114L;
    }

    public OrderMassCancelReportEncoder()
    {
        header.msgType("r");
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

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int massCancelRequestTypeHeaderLength = 4;
    private static final byte[] massCancelRequestTypeHeader = new byte[] {53, 51, 48, (byte) '='};

    private static final int massCancelResponseHeaderLength = 4;
    private static final byte[] massCancelResponseHeader = new byte[] {53, 51, 49, (byte) '='};

    private static final int massCancelRejectReasonHeaderLength = 4;
    private static final byte[] massCancelRejectReasonHeader = new byte[] {53, 51, 50, (byte) '='};

    private static final int totalAffectedOrdersHeaderLength = 4;
    private static final byte[] totalAffectedOrdersHeader = new byte[] {53, 51, 51, (byte) '='};

    private static final int noAffectedOrdersGroupCounterHeaderLength = 4;
    private static final byte[] noAffectedOrdersGroupCounterHeader = new byte[] {53, 51, 52, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();
    private byte[] clOrdIDInternalBuffer = clOrdID.byteArray();
    private int clOrdIDOffset = 0;
    private int clOrdIDLength = 0;

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderMassCancelReportEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdID(final byte[] value)
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
    public OrderMassCancelReportEncoder clOrdID(final CharSequence value)
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
    public OrderMassCancelReportEncoder clOrdID(final AsciiSequenceView value)
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
    public OrderMassCancelReportEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public OrderMassCancelReportEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, clOrdID, offset, length))
        {
            clOrdIDInternalBuffer = clOrdID.byteArray();
        }
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();
    private byte[] secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
    private int secondaryClOrdIDOffset = 0;
    private int secondaryClOrdIDLength = 0;

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(secondaryClOrdID, value, offset, length))
        {
            secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
        }
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final byte[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    /* SecondaryClOrdID = 526 */
    public boolean hasSecondaryClOrdID()
    {
        return secondaryClOrdIDLength > 0;
    }

    /* SecondaryClOrdID = 526 */
    public MutableDirectBuffer secondaryClOrdID()
    {
        return secondaryClOrdID;
    }

    /* SecondaryClOrdID = 526 */
    public String secondaryClOrdIDAsString()
    {
        return secondaryClOrdID.getStringWithoutLengthAscii(secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final CharSequence value)
    {
        if (toBytes(value, secondaryClOrdID))
        {
            secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
        }
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryClOrdID.wrap(buffer);
            secondaryClOrdIDOffset = value.offset();
            secondaryClOrdIDLength = value.length();
        }
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderMassCancelReportEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryClOrdID, offset, length))
        {
            secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
        }
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();
    private byte[] orderIDInternalBuffer = orderID.byteArray();
    private int orderIDOffset = 0;
    private int orderIDLength = 0;

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(orderID, value, offset, length))
        {
            orderIDInternalBuffer = orderID.byteArray();
        }
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final byte[] value)
    {
        return orderID(value, 0, value.length);
    }

    /* OrderID = 37 */
    public boolean hasOrderID()
    {
        return orderIDLength > 0;
    }

    /* OrderID = 37 */
    public MutableDirectBuffer orderID()
    {
        return orderID;
    }

    /* OrderID = 37 */
    public String orderIDAsString()
    {
        return orderID.getStringWithoutLengthAscii(orderIDOffset, orderIDLength);
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final CharSequence value)
    {
        if (toBytes(value, orderID))
        {
            orderIDInternalBuffer = orderID.byteArray();
        }
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderID.wrap(buffer);
            orderIDOffset = value.offset();
            orderIDLength = value.length();
        }
        return this;
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public OrderMassCancelReportEncoder orderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, orderID, offset, length))
        {
            orderIDInternalBuffer = orderID.byteArray();
        }
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();
    private byte[] secondaryOrderIDInternalBuffer = secondaryOrderID.byteArray();
    private int secondaryOrderIDOffset = 0;
    private int secondaryOrderIDLength = 0;

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(secondaryOrderID, value, offset, length))
        {
            secondaryOrderIDInternalBuffer = secondaryOrderID.byteArray();
        }
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final byte[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    /* SecondaryOrderID = 198 */
    public boolean hasSecondaryOrderID()
    {
        return secondaryOrderIDLength > 0;
    }

    /* SecondaryOrderID = 198 */
    public MutableDirectBuffer secondaryOrderID()
    {
        return secondaryOrderID;
    }

    /* SecondaryOrderID = 198 */
    public String secondaryOrderIDAsString()
    {
        return secondaryOrderID.getStringWithoutLengthAscii(secondaryOrderIDOffset, secondaryOrderIDLength);
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final CharSequence value)
    {
        if (toBytes(value, secondaryOrderID))
        {
            secondaryOrderIDInternalBuffer = secondaryOrderID.byteArray();
        }
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryOrderID.wrap(buffer);
            secondaryOrderIDOffset = value.offset();
            secondaryOrderIDLength = value.length();
        }
        return this;
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public OrderMassCancelReportEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryOrderID, offset, length))
        {
            secondaryOrderIDInternalBuffer = secondaryOrderID.byteArray();
        }
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private char massCancelRequestType;

    private boolean hasMassCancelRequestType;

    public boolean hasMassCancelRequestType()
    {
        return hasMassCancelRequestType;
    }

    /* MassCancelRequestType = 530 */
    public OrderMassCancelReportEncoder massCancelRequestType(char value)
    {
        massCancelRequestType = value;
        hasMassCancelRequestType = true;
        return this;
    }

    /* MassCancelRequestType = 530 */
    public char massCancelRequestType()
    {
        return massCancelRequestType;
    }

    public OrderMassCancelReportEncoder massCancelRequestType(MassCancelRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassCancelRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massCancelRequestType Value: " + value );
            }
            if (value == MassCancelRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return massCancelRequestType(value.representation());
    }

    private char massCancelResponse;

    private boolean hasMassCancelResponse;

    public boolean hasMassCancelResponse()
    {
        return hasMassCancelResponse;
    }

    /* MassCancelResponse = 531 */
    public OrderMassCancelReportEncoder massCancelResponse(char value)
    {
        massCancelResponse = value;
        hasMassCancelResponse = true;
        return this;
    }

    /* MassCancelResponse = 531 */
    public char massCancelResponse()
    {
        return massCancelResponse;
    }

    public OrderMassCancelReportEncoder massCancelResponse(MassCancelResponse value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassCancelResponse.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massCancelResponse Value: " + value );
            }
            if (value == MassCancelResponse.NULL_VAL)
            {
                return this;
            }
        }
        return massCancelResponse(value.representation());
    }

    private final MutableDirectBuffer massCancelRejectReason = new UnsafeBuffer();
    private byte[] massCancelRejectReasonInternalBuffer = massCancelRejectReason.byteArray();
    private int massCancelRejectReasonOffset = 0;
    private int massCancelRejectReasonLength = 0;

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final DirectBuffer value, final int offset, final int length)
    {
        massCancelRejectReason.wrap(value);
        massCancelRejectReasonOffset = offset;
        massCancelRejectReasonLength = length;
        return this;
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final DirectBuffer value, final int length)
    {
        return massCancelRejectReason(value, 0, length);
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final DirectBuffer value)
    {
        return massCancelRejectReason(value, 0, value.capacity());
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final byte[] value, final int offset, final int length)
    {
        massCancelRejectReason.wrap(value);
        massCancelRejectReasonOffset = offset;
        massCancelRejectReasonLength = length;
        return this;
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReasonAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(massCancelRejectReason, value, offset, length))
        {
            massCancelRejectReasonInternalBuffer = massCancelRejectReason.byteArray();
        }
        massCancelRejectReasonOffset = 0;
        massCancelRejectReasonLength = length;
        return this;
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final byte[] value, final int length)
    {
        return massCancelRejectReason(value, 0, length);
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final byte[] value)
    {
        return massCancelRejectReason(value, 0, value.length);
    }

    /* MassCancelRejectReason = 532 */
    public boolean hasMassCancelRejectReason()
    {
        return massCancelRejectReasonLength > 0;
    }

    /* MassCancelRejectReason = 532 */
    public MutableDirectBuffer massCancelRejectReason()
    {
        return massCancelRejectReason;
    }

    /* MassCancelRejectReason = 532 */
    public String massCancelRejectReasonAsString()
    {
        return massCancelRejectReason.getStringWithoutLengthAscii(massCancelRejectReasonOffset, massCancelRejectReasonLength);
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final CharSequence value)
    {
        if (toBytes(value, massCancelRejectReason))
        {
            massCancelRejectReasonInternalBuffer = massCancelRejectReason.byteArray();
        }
        massCancelRejectReasonOffset = 0;
        massCancelRejectReasonLength = value.length();
        return this;
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            massCancelRejectReason.wrap(buffer);
            massCancelRejectReasonOffset = value.offset();
            massCancelRejectReasonLength = value.length();
        }
        return this;
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final char[] value)
    {
        return massCancelRejectReason(value, 0, value.length);
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final char[] value, final int length)
    {
        return massCancelRejectReason(value, 0, length);
    }

    /* MassCancelRejectReason = 532 */
    public OrderMassCancelReportEncoder massCancelRejectReason(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, massCancelRejectReason, offset, length))
        {
            massCancelRejectReasonInternalBuffer = massCancelRejectReason.byteArray();
        }
        massCancelRejectReasonOffset = 0;
        massCancelRejectReasonLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(MassCancelRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassCancelRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massCancelRejectReason Value: " + value );
            }
            if (value == MassCancelRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return massCancelRejectReason(value.representation());
    }

    private int totalAffectedOrders;

    private boolean hasTotalAffectedOrders;

    public boolean hasTotalAffectedOrders()
    {
        return hasTotalAffectedOrders;
    }

    /* TotalAffectedOrders = 533 */
    public OrderMassCancelReportEncoder totalAffectedOrders(int value)
    {
        totalAffectedOrders = value;
        hasTotalAffectedOrders = true;
        return this;
    }

    /* TotalAffectedOrders = 533 */
    public int totalAffectedOrders()
    {
        return totalAffectedOrders;
    }


@Generated("uk.co.real_logic.artio")
public static class AffectedOrdersGroupEncoder
{
    private AffectedOrdersGroupEncoder next = null;

    public AffectedOrdersGroupEncoder next()
    {
        if (next == null)
        {
            next = new AffectedOrdersGroupEncoder();
        }
        return next;
    }

    private static final int origClOrdIDHeaderLength = 3;
    private static final byte[] origClOrdIDHeader = new byte[] {52, 49, (byte) '='};

    private static final int affectedOrderIDHeaderLength = 4;
    private static final byte[] affectedOrderIDHeader = new byte[] {53, 51, 53, (byte) '='};

    private static final int affectedSecondaryOrderIDHeaderLength = 4;
    private static final byte[] affectedSecondaryOrderIDHeader = new byte[] {53, 51, 54, (byte) '='};

    private final MutableDirectBuffer origClOrdID = new UnsafeBuffer();
    private byte[] origClOrdIDInternalBuffer = origClOrdID.byteArray();
    private int origClOrdIDOffset = 0;
    private int origClOrdIDLength = 0;

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value)
    {
        return origClOrdID(value, 0, value.capacity());
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(origClOrdID, value, offset, length))
        {
            origClOrdIDInternalBuffer = origClOrdID.byteArray();
        }
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    /* OrigClOrdID = 41 */
    public boolean hasOrigClOrdID()
    {
        return origClOrdIDLength > 0;
    }

    /* OrigClOrdID = 41 */
    public MutableDirectBuffer origClOrdID()
    {
        return origClOrdID;
    }

    /* OrigClOrdID = 41 */
    public String origClOrdIDAsString()
    {
        return origClOrdID.getStringWithoutLengthAscii(origClOrdIDOffset, origClOrdIDLength);
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final CharSequence value)
    {
        if (toBytes(value, origClOrdID))
        {
            origClOrdIDInternalBuffer = origClOrdID.byteArray();
        }
        origClOrdIDOffset = 0;
        origClOrdIDLength = value.length();
        return this;
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origClOrdID.wrap(buffer);
            origClOrdIDOffset = value.offset();
            origClOrdIDLength = value.length();
        }
        return this;
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final char[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final char[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    /* OrigClOrdID = 41 */
    public AffectedOrdersGroupEncoder origClOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, origClOrdID, offset, length))
        {
            origClOrdIDInternalBuffer = origClOrdID.byteArray();
        }
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer affectedOrderID = new UnsafeBuffer();
    private byte[] affectedOrderIDInternalBuffer = affectedOrderID.byteArray();
    private int affectedOrderIDOffset = 0;
    private int affectedOrderIDLength = 0;

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value, final int offset, final int length)
    {
        affectedOrderID.wrap(value);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value)
    {
        return affectedOrderID(value, 0, value.capacity());
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value, final int offset, final int length)
    {
        affectedOrderID.wrap(value);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(affectedOrderID, value, offset, length))
        {
            affectedOrderIDInternalBuffer = affectedOrderID.byteArray();
        }
        affectedOrderIDOffset = 0;
        affectedOrderIDLength = length;
        return this;
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value)
    {
        return affectedOrderID(value, 0, value.length);
    }

    /* AffectedOrderID = 535 */
    public boolean hasAffectedOrderID()
    {
        return affectedOrderIDLength > 0;
    }

    /* AffectedOrderID = 535 */
    public MutableDirectBuffer affectedOrderID()
    {
        return affectedOrderID;
    }

    /* AffectedOrderID = 535 */
    public String affectedOrderIDAsString()
    {
        return affectedOrderID.getStringWithoutLengthAscii(affectedOrderIDOffset, affectedOrderIDLength);
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final CharSequence value)
    {
        if (toBytes(value, affectedOrderID))
        {
            affectedOrderIDInternalBuffer = affectedOrderID.byteArray();
        }
        affectedOrderIDOffset = 0;
        affectedOrderIDLength = value.length();
        return this;
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            affectedOrderID.wrap(buffer);
            affectedOrderIDOffset = value.offset();
            affectedOrderIDLength = value.length();
        }
        return this;
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value)
    {
        return affectedOrderID(value, 0, value.length);
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    /* AffectedOrderID = 535 */
    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, affectedOrderID, offset, length))
        {
            affectedOrderIDInternalBuffer = affectedOrderID.byteArray();
        }
        affectedOrderIDOffset = 0;
        affectedOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer affectedSecondaryOrderID = new UnsafeBuffer();
    private byte[] affectedSecondaryOrderIDInternalBuffer = affectedSecondaryOrderID.byteArray();
    private int affectedSecondaryOrderIDOffset = 0;
    private int affectedSecondaryOrderIDLength = 0;

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        affectedSecondaryOrderID.wrap(value);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value)
    {
        return affectedSecondaryOrderID(value, 0, value.capacity());
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value, final int offset, final int length)
    {
        affectedSecondaryOrderID.wrap(value);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(affectedSecondaryOrderID, value, offset, length))
        {
            affectedSecondaryOrderIDInternalBuffer = affectedSecondaryOrderID.byteArray();
        }
        affectedSecondaryOrderIDOffset = 0;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value)
    {
        return affectedSecondaryOrderID(value, 0, value.length);
    }

    /* AffectedSecondaryOrderID = 536 */
    public boolean hasAffectedSecondaryOrderID()
    {
        return affectedSecondaryOrderIDLength > 0;
    }

    /* AffectedSecondaryOrderID = 536 */
    public MutableDirectBuffer affectedSecondaryOrderID()
    {
        return affectedSecondaryOrderID;
    }

    /* AffectedSecondaryOrderID = 536 */
    public String affectedSecondaryOrderIDAsString()
    {
        return affectedSecondaryOrderID.getStringWithoutLengthAscii(affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final CharSequence value)
    {
        if (toBytes(value, affectedSecondaryOrderID))
        {
            affectedSecondaryOrderIDInternalBuffer = affectedSecondaryOrderID.byteArray();
        }
        affectedSecondaryOrderIDOffset = 0;
        affectedSecondaryOrderIDLength = value.length();
        return this;
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            affectedSecondaryOrderID.wrap(buffer);
            affectedSecondaryOrderIDOffset = value.offset();
            affectedSecondaryOrderIDLength = value.length();
        }
        return this;
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value)
    {
        return affectedSecondaryOrderID(value, 0, value.length);
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    /* AffectedSecondaryOrderID = 536 */
    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, affectedSecondaryOrderID, offset, length))
        {
            affectedSecondaryOrderIDInternalBuffer = affectedSecondaryOrderID.byteArray();
        }
        affectedSecondaryOrderIDOffset = 0;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (origClOrdIDLength > 0)
        {
            buffer.putBytes(position, origClOrdIDHeader, 0, origClOrdIDHeaderLength);
            position += origClOrdIDHeaderLength;
            buffer.putBytes(position, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            position += origClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (affectedOrderIDLength > 0)
        {
            buffer.putBytes(position, affectedOrderIDHeader, 0, affectedOrderIDHeaderLength);
            position += affectedOrderIDHeaderLength;
            buffer.putBytes(position, affectedOrderID, affectedOrderIDOffset, affectedOrderIDLength);
            position += affectedOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (affectedSecondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, affectedSecondaryOrderIDHeader, 0, affectedSecondaryOrderIDHeaderLength);
            position += affectedSecondaryOrderIDHeaderLength;
            buffer.putBytes(position, affectedSecondaryOrderID, affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
            position += affectedSecondaryOrderIDLength;
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
        this.resetOrigClOrdID();
        this.resetAffectedOrderID();
        this.resetAffectedSecondaryOrderID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetOrigClOrdID()
    {
        origClOrdIDLength = 0;
        origClOrdID.wrap(origClOrdIDInternalBuffer);
    }

    public void resetAffectedOrderID()
    {
        affectedOrderIDLength = 0;
        affectedOrderID.wrap(affectedOrderIDInternalBuffer);
    }

    public void resetAffectedSecondaryOrderID()
    {
        affectedSecondaryOrderIDLength = 0;
        affectedSecondaryOrderID.wrap(affectedSecondaryOrderIDInternalBuffer);
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
        builder.append("\"MessageName\": \"AffectedOrdersGroup\",\n");
        if (hasOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"OrigClOrdID\": \"");
            appendBuffer(builder, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasAffectedOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedOrderID\": \"");
            appendBuffer(builder, affectedOrderID, affectedOrderIDOffset, affectedOrderIDLength);
            builder.append("\",\n");
        }

        if (hasAffectedSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedSecondaryOrderID\": \"");
            appendBuffer(builder, affectedSecondaryOrderID, affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public AffectedOrdersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AffectedOrdersGroupEncoder)encoder);
    }

    public AffectedOrdersGroupEncoder copyTo(final AffectedOrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasOrigClOrdID())
        {
            encoder.origClOrdIDAsCopy(origClOrdID.byteArray(), 0, origClOrdIDLength);
        }

        if (hasAffectedOrderID())
        {
            encoder.affectedOrderIDAsCopy(affectedOrderID.byteArray(), 0, affectedOrderIDLength);
        }

        if (hasAffectedSecondaryOrderID())
        {
            encoder.affectedSecondaryOrderIDAsCopy(affectedSecondaryOrderID.byteArray(), 0, affectedSecondaryOrderIDLength);
        }
        return encoder;
    }

}
    private int noAffectedOrdersGroupCounter;

    private boolean hasNoAffectedOrdersGroupCounter;

    public boolean hasNoAffectedOrdersGroupCounter()
    {
        return hasNoAffectedOrdersGroupCounter;
    }

    /* NoAffectedOrdersGroupCounter = 534 */
    public OrderMassCancelReportEncoder noAffectedOrdersGroupCounter(int value)
    {
        noAffectedOrdersGroupCounter = value;
        hasNoAffectedOrdersGroupCounter = true;
        return this;
    }

    /* NoAffectedOrdersGroupCounter = 534 */
    public int noAffectedOrdersGroupCounter()
    {
        return noAffectedOrdersGroupCounter;
    }


    private AffectedOrdersGroupEncoder affectedOrdersGroup = null;

    public AffectedOrdersGroupEncoder affectedOrdersGroup(final int numberOfElements)
    {
        hasNoAffectedOrdersGroupCounter = true;
        noAffectedOrdersGroupCounter = numberOfElements;
        if (affectedOrdersGroup == null)
        {
            affectedOrdersGroup = new AffectedOrdersGroupEncoder();
        }
        return affectedOrdersGroup;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderMassCancelReportEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionID(final byte[] value)
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
    public OrderMassCancelReportEncoder tradingSessionID(final CharSequence value)
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
    public OrderMassCancelReportEncoder tradingSessionID(final AsciiSequenceView value)
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
    public OrderMassCancelReportEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public OrderMassCancelReportEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public OrderMassCancelReportEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public OrderMassCancelReportEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public OrderMassCancelReportEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public OrderMassCancelReportEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public OrderMassCancelReportEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderMassCancelReportEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public OrderMassCancelReportEncoder tradingSessionSubID(final byte[] value)
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
    public OrderMassCancelReportEncoder tradingSessionSubID(final CharSequence value)
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
    public OrderMassCancelReportEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public OrderMassCancelReportEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public OrderMassCancelReportEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public OrderMassCancelReportEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    /* Side = 54 */
    public OrderMassCancelReportEncoder side(char value)
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

    public OrderMassCancelReportEncoder side(Side value)
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

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();
    private byte[] transactTimeInternalBuffer = transactTime.byteArray();
    private int transactTimeOffset = 0;
    private int transactTimeLength = 0;

    /* TransactTime = 60 */
    public OrderMassCancelReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public OrderMassCancelReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public OrderMassCancelReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public OrderMassCancelReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public OrderMassCancelReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderMassCancelReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public OrderMassCancelReportEncoder transactTime(final byte[] value)
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
    public OrderMassCancelReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public OrderMassCancelReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public OrderMassCancelReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public OrderMassCancelReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public OrderMassCancelReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderMassCancelReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public OrderMassCancelReportEncoder text(final byte[] value)
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
    public OrderMassCancelReportEncoder text(final CharSequence value)
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
    public OrderMassCancelReportEncoder text(final AsciiSequenceView value)
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
    public OrderMassCancelReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public OrderMassCancelReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public OrderMassCancelReportEncoder text(final char[] value, final int offset, final int length)
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
    public OrderMassCancelReportEncoder encodedTextLen(int value)
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
    public OrderMassCancelReportEncoder encodedText(byte[] value)
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
    public OrderMassCancelReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryClOrdIDLength > 0)
        {
            buffer.putBytes(position, secondaryClOrdIDHeader, 0, secondaryClOrdIDHeaderLength);
            position += secondaryClOrdIDHeaderLength;
            buffer.putBytes(position, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            position += secondaryClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrderID");
        }

        if (secondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, secondaryOrderIDHeader, 0, secondaryOrderIDHeaderLength);
            position += secondaryOrderIDHeaderLength;
            buffer.putBytes(position, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            position += secondaryOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMassCancelRequestType)
        {
            buffer.putBytes(position, massCancelRequestTypeHeader, 0, massCancelRequestTypeHeaderLength);
            position += massCancelRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, massCancelRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassCancelRequestType");
        }

        if (hasMassCancelResponse)
        {
            buffer.putBytes(position, massCancelResponseHeader, 0, massCancelResponseHeaderLength);
            position += massCancelResponseHeaderLength;
            position += buffer.putCharAscii(position, massCancelResponse);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassCancelResponse");
        }

        if (massCancelRejectReasonLength > 0)
        {
            buffer.putBytes(position, massCancelRejectReasonHeader, 0, massCancelRejectReasonHeaderLength);
            position += massCancelRejectReasonHeaderLength;
            buffer.putBytes(position, massCancelRejectReason, massCancelRejectReasonOffset, massCancelRejectReasonLength);
            position += massCancelRejectReasonLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalAffectedOrders)
        {
            buffer.putBytes(position, totalAffectedOrdersHeader, 0, totalAffectedOrdersHeaderLength);
            position += totalAffectedOrdersHeaderLength;
            position += buffer.putIntAscii(position, totalAffectedOrders);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoAffectedOrdersGroupCounter)
        {
            buffer.putBytes(position, noAffectedOrdersGroupCounterHeader, 0, noAffectedOrdersGroupCounterHeaderLength);
            position += noAffectedOrdersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAffectedOrdersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (affectedOrdersGroup != null)
        {
            position += affectedOrdersGroup.encode(buffer, position, noAffectedOrdersGroupCounter);
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

            position += instrument.encode(buffer, position);

            position += underlyingInstrument.encode(buffer, position);

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
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
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetMassCancelRequestType();
        this.resetMassCancelResponse();
        this.resetMassCancelRejectReason();
        this.resetTotalAffectedOrders();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSide();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        instrument.reset();
        underlyingInstrument.reset();
        this.resetAffectedOrdersGroup();
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
        clOrdID.wrap(clOrdIDInternalBuffer);
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
        secondaryClOrdID.wrap(secondaryClOrdIDInternalBuffer);
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
        orderID.wrap(orderIDInternalBuffer);
    }

    public void resetSecondaryOrderID()
    {
        secondaryOrderIDLength = 0;
        secondaryOrderID.wrap(secondaryOrderIDInternalBuffer);
    }

    public void resetMassCancelRequestType()
    {
        massCancelRequestType = MISSING_CHAR;
    }

    public void resetMassCancelResponse()
    {
        massCancelResponse = MISSING_CHAR;
    }

    public void resetMassCancelRejectReason()
    {
        massCancelRejectReasonLength = 0;
        massCancelRejectReason.wrap(massCancelRejectReasonInternalBuffer);
    }

    public void resetTotalAffectedOrders()
    {
        hasTotalAffectedOrders = false;
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

    public void resetSide()
    {
        hasSide = false;
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

    public void resetAffectedOrdersGroup()
    {
        if (affectedOrdersGroup != null)
        {
            affectedOrdersGroup.reset();
        }
        noAffectedOrdersGroupCounter = 0;
        hasNoAffectedOrdersGroupCounter = false;
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
        builder.append("\"MessageName\": \"OrderMassCancelReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"SecondaryOrderID\": \"");
            appendBuffer(builder, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            builder.append("\",\n");
        }

        if (hasMassCancelRequestType())
        {
            indent(builder, level);
            builder.append("\"MassCancelRequestType\": \"");
            builder.append(massCancelRequestType);
            builder.append("\",\n");
        }

        if (hasMassCancelResponse())
        {
            indent(builder, level);
            builder.append("\"MassCancelResponse\": \"");
            builder.append(massCancelResponse);
            builder.append("\",\n");
        }

        if (hasMassCancelRejectReason())
        {
            indent(builder, level);
            builder.append("\"MassCancelRejectReason\": \"");
            appendBuffer(builder, massCancelRejectReason, massCancelRejectReasonOffset, massCancelRejectReasonLength);
            builder.append("\",\n");
        }

        if (hasTotalAffectedOrders())
        {
            indent(builder, level);
            builder.append("\"TotalAffectedOrders\": \"");
            builder.append(totalAffectedOrders);
            builder.append("\",\n");
        }

        if (hasNoAffectedOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AffectedOrdersGroup\": [\n");
            final int noAffectedOrdersGroupCounter = this.noAffectedOrdersGroupCounter;
            AffectedOrdersGroupEncoder affectedOrdersGroup = this.affectedOrdersGroup;
            for (int i = 0; i < noAffectedOrdersGroupCounter; i++)
            {
                indent(builder, level);
                affectedOrdersGroup.appendTo(builder, level + 1);
                if (i < (noAffectedOrdersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                affectedOrdersGroup = affectedOrdersGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
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

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public OrderMassCancelReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrderMassCancelReportEncoder)encoder);
    }

    public OrderMassCancelReportEncoder copyTo(final OrderMassCancelReportEncoder encoder)
    {
        encoder.reset();
        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasMassCancelRequestType())
        {
            encoder.massCancelRequestType(this.massCancelRequestType());
        }

        if (hasMassCancelResponse())
        {
            encoder.massCancelResponse(this.massCancelResponse());
        }

        if (hasMassCancelRejectReason())
        {
            encoder.massCancelRejectReasonAsCopy(massCancelRejectReason.byteArray(), 0, massCancelRejectReasonLength);
        }

        if (hasTotalAffectedOrders())
        {
            encoder.totalAffectedOrders(this.totalAffectedOrders());
        }

        if (hasNoAffectedOrdersGroupCounter)
        {
            final int size = this.noAffectedOrdersGroupCounter;
            AffectedOrdersGroupEncoder affectedOrdersGroup = this.affectedOrdersGroup;
            AffectedOrdersGroupEncoder affectedOrdersGroupEncoder = encoder.affectedOrdersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (affectedOrdersGroup != null)
                {
                    affectedOrdersGroup.copyTo(affectedOrdersGroupEncoder);
                    affectedOrdersGroup = affectedOrdersGroup.next();
                    affectedOrdersGroupEncoder = affectedOrdersGroupEncoder.next();
                }
            }
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }


        instrument.copyTo(encoder.instrument());

        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasSide())
        {
            encoder.side(this.side());
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
        return encoder;
    }

}
