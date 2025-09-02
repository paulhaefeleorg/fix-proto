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
public class OrderCancelRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 70L;
    }

    public OrderCancelRequestEncoder()
    {
        header.msgType("F");
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

    private static final int origClOrdIDHeaderLength = 3;
    private static final byte[] origClOrdIDHeader = new byte[] {52, 49, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int clOrdLinkIDHeaderLength = 4;
    private static final byte[] clOrdLinkIDHeader = new byte[] {53, 56, 51, (byte) '='};

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int origOrdModTimeHeaderLength = 4;
    private static final byte[] origOrdModTimeHeader = new byte[] {53, 56, 54, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int complianceIDHeaderLength = 4;
    private static final byte[] complianceIDHeader = new byte[] {51, 55, 54, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer origClOrdID = new UnsafeBuffer();
    private byte[] origClOrdIDInternalBuffer = origClOrdID.byteArray();
    private int origClOrdIDOffset = 0;
    private int origClOrdIDLength = 0;

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdID(final DirectBuffer value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdID(final DirectBuffer value)
    {
        return origClOrdID(value, 0, value.capacity());
    }

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdID(final byte[] value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder origClOrdID(final byte[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdID(final byte[] value)
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
    public OrderCancelRequestEncoder origClOrdID(final CharSequence value)
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
    public OrderCancelRequestEncoder origClOrdID(final AsciiSequenceView value)
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
    public OrderCancelRequestEncoder origClOrdID(final char[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdID(final char[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    /* OrigClOrdID = 41 */
    public OrderCancelRequestEncoder origClOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, origClOrdID, offset, length))
        {
            origClOrdIDInternalBuffer = origClOrdID.byteArray();
        }
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();
    private byte[] orderIDInternalBuffer = orderID.byteArray();
    private int orderIDOffset = 0;
    private int orderIDLength = 0;

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderID(final byte[] value)
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
    public OrderCancelRequestEncoder orderID(final CharSequence value)
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
    public OrderCancelRequestEncoder orderID(final AsciiSequenceView value)
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
    public OrderCancelRequestEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public OrderCancelRequestEncoder orderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, orderID, offset, length))
        {
            orderIDInternalBuffer = orderID.byteArray();
        }
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();
    private byte[] clOrdIDInternalBuffer = clOrdID.byteArray();
    private int clOrdIDOffset = 0;
    private int clOrdIDLength = 0;

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdID(final byte[] value)
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
    public OrderCancelRequestEncoder clOrdID(final CharSequence value)
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
    public OrderCancelRequestEncoder clOrdID(final AsciiSequenceView value)
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
    public OrderCancelRequestEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public OrderCancelRequestEncoder clOrdID(final char[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public OrderCancelRequestEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderCancelRequestEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    /* SecondaryClOrdID = 526 */
    public OrderCancelRequestEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public OrderCancelRequestEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderCancelRequestEncoder secondaryClOrdID(final byte[] value)
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
    public OrderCancelRequestEncoder secondaryClOrdID(final CharSequence value)
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
    public OrderCancelRequestEncoder secondaryClOrdID(final AsciiSequenceView value)
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
    public OrderCancelRequestEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderCancelRequestEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public OrderCancelRequestEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryClOrdID, offset, length))
        {
            secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
        }
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdLinkID = new UnsafeBuffer();
    private byte[] clOrdLinkIDInternalBuffer = clOrdLinkID.byteArray();
    private int clOrdLinkIDOffset = 0;
    private int clOrdLinkIDLength = 0;

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final DirectBuffer value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final DirectBuffer value)
    {
        return clOrdLinkID(value, 0, value.capacity());
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final byte[] value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(clOrdLinkID, value, offset, length))
        {
            clOrdLinkIDInternalBuffer = clOrdLinkID.byteArray();
        }
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = length;
        return this;
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final byte[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final byte[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    /* ClOrdLinkID = 583 */
    public boolean hasClOrdLinkID()
    {
        return clOrdLinkIDLength > 0;
    }

    /* ClOrdLinkID = 583 */
    public MutableDirectBuffer clOrdLinkID()
    {
        return clOrdLinkID;
    }

    /* ClOrdLinkID = 583 */
    public String clOrdLinkIDAsString()
    {
        return clOrdLinkID.getStringWithoutLengthAscii(clOrdLinkIDOffset, clOrdLinkIDLength);
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final CharSequence value)
    {
        if (toBytes(value, clOrdLinkID))
        {
            clOrdLinkIDInternalBuffer = clOrdLinkID.byteArray();
        }
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = value.length();
        return this;
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdLinkID.wrap(buffer);
            clOrdLinkIDOffset = value.offset();
            clOrdLinkIDLength = value.length();
        }
        return this;
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final char[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final char[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    /* ClOrdLinkID = 583 */
    public OrderCancelRequestEncoder clOrdLinkID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, clOrdLinkID, offset, length))
        {
            clOrdLinkIDInternalBuffer = clOrdLinkID.byteArray();
        }
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer listID = new UnsafeBuffer();
    private byte[] listIDInternalBuffer = listID.byteArray();
    private int listIDOffset = 0;
    private int listIDLength = 0;

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(listID, value, offset, length))
        {
            listIDInternalBuffer = listID.byteArray();
        }
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final byte[] value)
    {
        return listID(value, 0, value.length);
    }

    /* ListID = 66 */
    public boolean hasListID()
    {
        return listIDLength > 0;
    }

    /* ListID = 66 */
    public MutableDirectBuffer listID()
    {
        return listID;
    }

    /* ListID = 66 */
    public String listIDAsString()
    {
        return listID.getStringWithoutLengthAscii(listIDOffset, listIDLength);
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final CharSequence value)
    {
        if (toBytes(value, listID))
        {
            listIDInternalBuffer = listID.byteArray();
        }
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listID.wrap(buffer);
            listIDOffset = value.offset();
            listIDLength = value.length();
        }
        return this;
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    /* ListID = 66 */
    public OrderCancelRequestEncoder listID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, listID, offset, length))
        {
            listIDInternalBuffer = listID.byteArray();
        }
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origOrdModTime = new UnsafeBuffer();
    private byte[] origOrdModTimeInternalBuffer = origOrdModTime.byteArray();
    private int origOrdModTimeOffset = 0;
    private int origOrdModTimeLength = 0;

    /* OrigOrdModTime = 586 */
    public OrderCancelRequestEncoder origOrdModTime(final DirectBuffer value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    /* OrigOrdModTime = 586 */
    public OrderCancelRequestEncoder origOrdModTime(final DirectBuffer value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    /* OrigOrdModTime = 586 */
    public OrderCancelRequestEncoder origOrdModTime(final DirectBuffer value)
    {
        return origOrdModTime(value, 0, value.capacity());
    }

    /* OrigOrdModTime = 586 */
    public OrderCancelRequestEncoder origOrdModTime(final byte[] value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    /* OrigOrdModTime = 586 */
    public OrderCancelRequestEncoder origOrdModTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(origOrdModTime, value, offset, length))
        {
            origOrdModTimeInternalBuffer = origOrdModTime.byteArray();
        }
        origOrdModTimeOffset = 0;
        origOrdModTimeLength = length;
        return this;
    }

    /* OrigOrdModTime = 586 */
    public OrderCancelRequestEncoder origOrdModTime(final byte[] value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    /* OrigOrdModTime = 586 */
    public OrderCancelRequestEncoder origOrdModTime(final byte[] value)
    {
        return origOrdModTime(value, 0, value.length);
    }

    /* OrigOrdModTime = 586 */
    public boolean hasOrigOrdModTime()
    {
        return origOrdModTimeLength > 0;
    }

    /* OrigOrdModTime = 586 */
    public MutableDirectBuffer origOrdModTime()
    {
        return origOrdModTime;
    }

    /* OrigOrdModTime = 586 */
    public String origOrdModTimeAsString()
    {
        return origOrdModTime.getStringWithoutLengthAscii(origOrdModTimeOffset, origOrdModTimeLength);
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();
    private byte[] accountInternalBuffer = account.byteArray();
    private int accountOffset = 0;
    private int accountLength = 0;

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(account, value, offset, length))
        {
            accountInternalBuffer = account.byteArray();
        }
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final byte[] value)
    {
        return account(value, 0, value.length);
    }

    /* Account = 1 */
    public boolean hasAccount()
    {
        return accountLength > 0;
    }

    /* Account = 1 */
    public MutableDirectBuffer account()
    {
        return account;
    }

    /* Account = 1 */
    public String accountAsString()
    {
        return account.getStringWithoutLengthAscii(accountOffset, accountLength);
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final CharSequence value)
    {
        if (toBytes(value, account))
        {
            accountInternalBuffer = account.byteArray();
        }
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            account.wrap(buffer);
            accountOffset = value.offset();
            accountLength = value.length();
        }
        return this;
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public OrderCancelRequestEncoder account(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, account, offset, length))
        {
            accountInternalBuffer = account.byteArray();
        }
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int acctIDSource;

    private boolean hasAcctIDSource;

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }

    /* AcctIDSource = 660 */
    public OrderCancelRequestEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    /* AcctIDSource = 660 */
    public int acctIDSource()
    {
        return acctIDSource;
    }

    public OrderCancelRequestEncoder acctIDSource(AcctIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AcctIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: acctIDSource Value: " + value );
            }
            if (value == AcctIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return acctIDSource(value.representation());
    }

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    /* AccountType = 581 */
    public OrderCancelRequestEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    /* AccountType = 581 */
    public int accountType()
    {
        return accountType;
    }

    public OrderCancelRequestEncoder accountType(AccountType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AccountType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: accountType Value: " + value );
            }
            if (value == AccountType.NULL_VAL)
            {
                return this;
            }
        }
        return accountType(value.representation());
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
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
    public OrderCancelRequestEncoder noUnderlyingsGroupCounter(int value)
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

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    /* Side = 54 */
    public OrderCancelRequestEncoder side(char value)
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

    public OrderCancelRequestEncoder side(Side value)
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
    public OrderCancelRequestEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public OrderCancelRequestEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public OrderCancelRequestEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public OrderCancelRequestEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public OrderCancelRequestEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public OrderCancelRequestEncoder transactTime(final byte[] value)
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

    private final OrderQtyDataEncoder orderQtyData = new OrderQtyDataEncoder();
    public OrderQtyDataEncoder orderQtyData()
    {
        return orderQtyData;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();
    private byte[] complianceIDInternalBuffer = complianceID.byteArray();
    private int complianceIDOffset = 0;
    private int complianceIDLength = 0;

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(complianceID, value, offset, length))
        {
            complianceIDInternalBuffer = complianceID.byteArray();
        }
        complianceIDOffset = 0;
        complianceIDLength = length;
        return this;
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final byte[] value)
    {
        return complianceID(value, 0, value.length);
    }

    /* ComplianceID = 376 */
    public boolean hasComplianceID()
    {
        return complianceIDLength > 0;
    }

    /* ComplianceID = 376 */
    public MutableDirectBuffer complianceID()
    {
        return complianceID;
    }

    /* ComplianceID = 376 */
    public String complianceIDAsString()
    {
        return complianceID.getStringWithoutLengthAscii(complianceIDOffset, complianceIDLength);
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final CharSequence value)
    {
        if (toBytes(value, complianceID))
        {
            complianceIDInternalBuffer = complianceID.byteArray();
        }
        complianceIDOffset = 0;
        complianceIDLength = value.length();
        return this;
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            complianceID.wrap(buffer);
            complianceIDOffset = value.offset();
            complianceIDLength = value.length();
        }
        return this;
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    /* ComplianceID = 376 */
    public OrderCancelRequestEncoder complianceID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, complianceID, offset, length))
        {
            complianceIDInternalBuffer = complianceID.byteArray();
        }
        complianceIDOffset = 0;
        complianceIDLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public OrderCancelRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public OrderCancelRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public OrderCancelRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public OrderCancelRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public OrderCancelRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public OrderCancelRequestEncoder text(final byte[] value)
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
    public OrderCancelRequestEncoder text(final CharSequence value)
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
    public OrderCancelRequestEncoder text(final AsciiSequenceView value)
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
    public OrderCancelRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public OrderCancelRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public OrderCancelRequestEncoder text(final char[] value, final int offset, final int length)
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
    public OrderCancelRequestEncoder encodedTextLen(int value)
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
    public OrderCancelRequestEncoder encodedText(byte[] value)
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
    public OrderCancelRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (origClOrdIDLength > 0)
        {
            buffer.putBytes(position, origClOrdIDHeader, 0, origClOrdIDHeaderLength);
            position += origClOrdIDHeaderLength;
            buffer.putBytes(position, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            position += origClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrigClOrdID");
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

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClOrdID");
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

        if (clOrdLinkIDLength > 0)
        {
            buffer.putBytes(position, clOrdLinkIDHeader, 0, clOrdLinkIDHeaderLength);
            position += clOrdLinkIDHeaderLength;
            buffer.putBytes(position, clOrdLinkID, clOrdLinkIDOffset, clOrdLinkIDLength);
            position += clOrdLinkIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (origOrdModTimeLength > 0)
        {
            buffer.putBytes(position, origOrdModTimeHeader, 0, origOrdModTimeHeaderLength);
            position += origOrdModTimeHeaderLength;
            buffer.putBytes(position, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
            position += origOrdModTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAcctIDSource)
        {
            buffer.putBytes(position, acctIDSourceHeader, 0, acctIDSourceHeaderLength);
            position += acctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, acctIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccountType)
        {
            buffer.putBytes(position, accountTypeHeader, 0, accountTypeHeaderLength);
            position += accountTypeHeaderLength;
            position += buffer.putIntAscii(position, accountType);
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

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


        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Side");
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

            position += orderQtyData.encode(buffer, position);

        if (complianceIDLength > 0)
        {
            buffer.putBytes(position, complianceIDHeader, 0, complianceIDHeaderLength);
            position += complianceIDHeaderLength;
            buffer.putBytes(position, complianceID, complianceIDOffset, complianceIDLength);
            position += complianceIDLength;
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
        this.resetOrigClOrdID();
        this.resetOrderID();
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetClOrdLinkID();
        this.resetListID();
        this.resetOrigOrdModTime();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetSide();
        this.resetTransactTime();
        this.resetComplianceID();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        financingDetails.reset();
        orderQtyData.reset();
        this.resetUnderlyingsGroup();
    }

    public void resetOrigClOrdID()
    {
        origClOrdIDLength = 0;
        origClOrdID.wrap(origClOrdIDInternalBuffer);
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
        orderID.wrap(orderIDInternalBuffer);
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

    public void resetClOrdLinkID()
    {
        clOrdLinkIDLength = 0;
        clOrdLinkID.wrap(clOrdLinkIDInternalBuffer);
    }

    public void resetListID()
    {
        listIDLength = 0;
        listID.wrap(listIDInternalBuffer);
    }

    public void resetOrigOrdModTime()
    {
        origOrdModTimeLength = 0;
        origOrdModTime.wrap(origOrdModTimeInternalBuffer);
    }

    public void resetAccount()
    {
        accountLength = 0;
        account.wrap(accountInternalBuffer);
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
        transactTime.wrap(transactTimeInternalBuffer);
    }

    public void resetComplianceID()
    {
        complianceIDLength = 0;
        complianceID.wrap(complianceIDInternalBuffer);
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
        builder.append("\"MessageName\": \"OrderCancelRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"OrigClOrdID\": \"");
            appendBuffer(builder, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

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

        if (hasClOrdLinkID())
        {
            indent(builder, level);
            builder.append("\"ClOrdLinkID\": \"");
            appendBuffer(builder, clOrdLinkID, clOrdLinkIDOffset, clOrdLinkIDLength);
            builder.append("\",\n");
        }

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

        if (hasOrigOrdModTime())
        {
            indent(builder, level);
            builder.append("\"OrigOrdModTime\": \"");
            appendBuffer(builder, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
            builder.append("\",\n");
        }

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"OrderQtyData\": ");
    orderQtyData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasComplianceID())
        {
            indent(builder, level);
            builder.append("\"ComplianceID\": \"");
            appendBuffer(builder, complianceID, complianceIDOffset, complianceIDLength);
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

    public OrderCancelRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrderCancelRequestEncoder)encoder);
    }

    public OrderCancelRequestEncoder copyTo(final OrderCancelRequestEncoder encoder)
    {
        encoder.reset();
        if (hasOrigClOrdID())
        {
            encoder.origClOrdIDAsCopy(origClOrdID.byteArray(), 0, origClOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasClOrdLinkID())
        {
            encoder.clOrdLinkIDAsCopy(clOrdLinkID.byteArray(), 0, clOrdLinkIDLength);
        }

        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasOrigOrdModTime())
        {
            encoder.origOrdModTimeAsCopy(origOrdModTime.byteArray(), 0, origOrdModTimeLength);
        }

        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }


        parties.copyTo(encoder.parties());

        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());
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

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        orderQtyData.copyTo(encoder.orderQtyData());
        if (hasComplianceID())
        {
            encoder.complianceIDAsCopy(complianceID.byteArray(), 0, complianceIDLength);
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
