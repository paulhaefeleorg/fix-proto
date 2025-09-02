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
public class CollateralInquiryAckEncoder implements Encoder
{
    public long messageType()
    {
        return 18242L;
    }

    public CollateralInquiryAckEncoder()
    {
        header.msgType("BG");
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

    private static final int collInquiryIDHeaderLength = 4;
    private static final byte[] collInquiryIDHeader = new byte[] {57, 48, 57, (byte) '='};

    private static final int collInquiryStatusHeaderLength = 4;
    private static final byte[] collInquiryStatusHeader = new byte[] {57, 52, 53, (byte) '='};

    private static final int collInquiryResultHeaderLength = 4;
    private static final byte[] collInquiryResultHeader = new byte[] {57, 52, 54, (byte) '='};

    private static final int noCollInquiryQualifierGroupCounterHeaderLength = 4;
    private static final byte[] noCollInquiryQualifierGroupCounterHeader = new byte[] {57, 51, 56, (byte) '='};

    private static final int totNumReportsHeaderLength = 4;
    private static final byte[] totNumReportsHeader = new byte[] {57, 49, 49, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int noExecsGroupCounterHeaderLength = 4;
    private static final byte[] noExecsGroupCounterHeader = new byte[] {49, 50, 52, (byte) '='};

    private static final int noTradesGroupCounterHeaderLength = 4;
    private static final byte[] noTradesGroupCounterHeader = new byte[] {56, 57, 55, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int quantityHeaderLength = 3;
    private static final byte[] quantityHeader = new byte[] {53, 51, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int responseTransportTypeHeaderLength = 4;
    private static final byte[] responseTransportTypeHeader = new byte[] {55, 50, 53, (byte) '='};

    private static final int responseDestinationHeaderLength = 4;
    private static final byte[] responseDestinationHeader = new byte[] {55, 50, 54, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer collInquiryID = new UnsafeBuffer();
    private byte[] collInquiryIDInternalBuffer = collInquiryID.byteArray();
    private int collInquiryIDOffset = 0;
    private int collInquiryIDLength = 0;

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final DirectBuffer value, final int offset, final int length)
    {
        collInquiryID.wrap(value);
        collInquiryIDOffset = offset;
        collInquiryIDLength = length;
        return this;
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final DirectBuffer value, final int length)
    {
        return collInquiryID(value, 0, length);
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final DirectBuffer value)
    {
        return collInquiryID(value, 0, value.capacity());
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final byte[] value, final int offset, final int length)
    {
        collInquiryID.wrap(value);
        collInquiryIDOffset = offset;
        collInquiryIDLength = length;
        return this;
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(collInquiryID, value, offset, length))
        {
            collInquiryIDInternalBuffer = collInquiryID.byteArray();
        }
        collInquiryIDOffset = 0;
        collInquiryIDLength = length;
        return this;
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final byte[] value, final int length)
    {
        return collInquiryID(value, 0, length);
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final byte[] value)
    {
        return collInquiryID(value, 0, value.length);
    }

    /* CollInquiryID = 909 */
    public boolean hasCollInquiryID()
    {
        return collInquiryIDLength > 0;
    }

    /* CollInquiryID = 909 */
    public MutableDirectBuffer collInquiryID()
    {
        return collInquiryID;
    }

    /* CollInquiryID = 909 */
    public String collInquiryIDAsString()
    {
        return collInquiryID.getStringWithoutLengthAscii(collInquiryIDOffset, collInquiryIDLength);
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final CharSequence value)
    {
        if (toBytes(value, collInquiryID))
        {
            collInquiryIDInternalBuffer = collInquiryID.byteArray();
        }
        collInquiryIDOffset = 0;
        collInquiryIDLength = value.length();
        return this;
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collInquiryID.wrap(buffer);
            collInquiryIDOffset = value.offset();
            collInquiryIDLength = value.length();
        }
        return this;
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final char[] value)
    {
        return collInquiryID(value, 0, value.length);
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final char[] value, final int length)
    {
        return collInquiryID(value, 0, length);
    }

    /* CollInquiryID = 909 */
    public CollateralInquiryAckEncoder collInquiryID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, collInquiryID, offset, length))
        {
            collInquiryIDInternalBuffer = collInquiryID.byteArray();
        }
        collInquiryIDOffset = 0;
        collInquiryIDLength = length;
        return this;
    }

    private int collInquiryStatus;

    private boolean hasCollInquiryStatus;

    public boolean hasCollInquiryStatus()
    {
        return hasCollInquiryStatus;
    }

    /* CollInquiryStatus = 945 */
    public CollateralInquiryAckEncoder collInquiryStatus(int value)
    {
        collInquiryStatus = value;
        hasCollInquiryStatus = true;
        return this;
    }

    /* CollInquiryStatus = 945 */
    public int collInquiryStatus()
    {
        return collInquiryStatus;
    }

    public CollateralInquiryAckEncoder collInquiryStatus(CollInquiryStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollInquiryStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collInquiryStatus Value: " + value );
            }
            if (value == CollInquiryStatus.NULL_VAL)
            {
                return this;
            }
        }
        return collInquiryStatus(value.representation());
    }

    private int collInquiryResult;

    private boolean hasCollInquiryResult;

    public boolean hasCollInquiryResult()
    {
        return hasCollInquiryResult;
    }

    /* CollInquiryResult = 946 */
    public CollateralInquiryAckEncoder collInquiryResult(int value)
    {
        collInquiryResult = value;
        hasCollInquiryResult = true;
        return this;
    }

    /* CollInquiryResult = 946 */
    public int collInquiryResult()
    {
        return collInquiryResult;
    }

    public CollateralInquiryAckEncoder collInquiryResult(CollInquiryResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollInquiryResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collInquiryResult Value: " + value );
            }
            if (value == CollInquiryResult.NULL_VAL)
            {
                return this;
            }
        }
        return collInquiryResult(value.representation());
    }


@Generated("uk.co.real_logic.artio")
public static class CollInquiryQualifierGroupEncoder
{
    private CollInquiryQualifierGroupEncoder next = null;

    public CollInquiryQualifierGroupEncoder next()
    {
        if (next == null)
        {
            next = new CollInquiryQualifierGroupEncoder();
        }
        return next;
    }

    private static final int collInquiryQualifierHeaderLength = 4;
    private static final byte[] collInquiryQualifierHeader = new byte[] {56, 57, 54, (byte) '='};

    private int collInquiryQualifier;

    private boolean hasCollInquiryQualifier;

    public boolean hasCollInquiryQualifier()
    {
        return hasCollInquiryQualifier;
    }

    /* CollInquiryQualifier = 896 */
    public CollInquiryQualifierGroupEncoder collInquiryQualifier(int value)
    {
        collInquiryQualifier = value;
        hasCollInquiryQualifier = true;
        return this;
    }

    /* CollInquiryQualifier = 896 */
    public int collInquiryQualifier()
    {
        return collInquiryQualifier;
    }

    public CollInquiryQualifierGroupEncoder collInquiryQualifier(CollInquiryQualifier value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollInquiryQualifier.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collInquiryQualifier Value: " + value );
            }
            if (value == CollInquiryQualifier.NULL_VAL)
            {
                return this;
            }
        }
        return collInquiryQualifier(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasCollInquiryQualifier)
        {
            buffer.putBytes(position, collInquiryQualifierHeader, 0, collInquiryQualifierHeaderLength);
            position += collInquiryQualifierHeaderLength;
            position += buffer.putIntAscii(position, collInquiryQualifier);
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
        this.resetCollInquiryQualifier();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetCollInquiryQualifier()
    {
        hasCollInquiryQualifier = false;
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
        builder.append("\"MessageName\": \"CollInquiryQualifierGroup\",\n");
        if (hasCollInquiryQualifier())
        {
            indent(builder, level);
            builder.append("\"CollInquiryQualifier\": \"");
            builder.append(collInquiryQualifier);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public CollInquiryQualifierGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CollInquiryQualifierGroupEncoder)encoder);
    }

    public CollInquiryQualifierGroupEncoder copyTo(final CollInquiryQualifierGroupEncoder encoder)
    {
        encoder.reset();
        if (hasCollInquiryQualifier())
        {
            encoder.collInquiryQualifier(this.collInquiryQualifier());
        }
        return encoder;
    }

}
    private int noCollInquiryQualifierGroupCounter;

    private boolean hasNoCollInquiryQualifierGroupCounter;

    public boolean hasNoCollInquiryQualifierGroupCounter()
    {
        return hasNoCollInquiryQualifierGroupCounter;
    }

    /* NoCollInquiryQualifierGroupCounter = 938 */
    public CollateralInquiryAckEncoder noCollInquiryQualifierGroupCounter(int value)
    {
        noCollInquiryQualifierGroupCounter = value;
        hasNoCollInquiryQualifierGroupCounter = true;
        return this;
    }

    /* NoCollInquiryQualifierGroupCounter = 938 */
    public int noCollInquiryQualifierGroupCounter()
    {
        return noCollInquiryQualifierGroupCounter;
    }


    private CollInquiryQualifierGroupEncoder collInquiryQualifierGroup = null;

    public CollInquiryQualifierGroupEncoder collInquiryQualifierGroup(final int numberOfElements)
    {
        hasNoCollInquiryQualifierGroupCounter = true;
        noCollInquiryQualifierGroupCounter = numberOfElements;
        if (collInquiryQualifierGroup == null)
        {
            collInquiryQualifierGroup = new CollInquiryQualifierGroupEncoder();
        }
        return collInquiryQualifierGroup;
    }

    private int totNumReports;

    private boolean hasTotNumReports;

    public boolean hasTotNumReports()
    {
        return hasTotNumReports;
    }

    /* TotNumReports = 911 */
    public CollateralInquiryAckEncoder totNumReports(int value)
    {
        totNumReports = value;
        hasTotNumReports = true;
        return this;
    }

    /* TotNumReports = 911 */
    public int totNumReports()
    {
        return totNumReports;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();
    private byte[] accountInternalBuffer = account.byteArray();
    private int accountOffset = 0;
    private int accountLength = 0;

    /* Account = 1 */
    public CollateralInquiryAckEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public CollateralInquiryAckEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public CollateralInquiryAckEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    /* Account = 1 */
    public CollateralInquiryAckEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public CollateralInquiryAckEncoder accountAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public CollateralInquiryAckEncoder account(final byte[] value)
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
    public CollateralInquiryAckEncoder account(final CharSequence value)
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
    public CollateralInquiryAckEncoder account(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    /* Account = 1 */
    public CollateralInquiryAckEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public CollateralInquiryAckEncoder account(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, account, offset, length))
        {
            accountInternalBuffer = account.byteArray();
        }
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    /* AccountType = 581 */
    public CollateralInquiryAckEncoder accountType(int value)
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

    public CollateralInquiryAckEncoder accountType(AccountType value)
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

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();
    private byte[] clOrdIDInternalBuffer = clOrdID.byteArray();
    private int clOrdIDOffset = 0;
    private int clOrdIDLength = 0;

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdID(final byte[] value)
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
    public CollateralInquiryAckEncoder clOrdID(final CharSequence value)
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
    public CollateralInquiryAckEncoder clOrdID(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public CollateralInquiryAckEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, clOrdID, offset, length))
        {
            clOrdIDInternalBuffer = clOrdID.byteArray();
        }
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();
    private byte[] orderIDInternalBuffer = orderID.byteArray();
    private int orderIDOffset = 0;
    private int orderIDLength = 0;

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderID(final byte[] value)
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
    public CollateralInquiryAckEncoder orderID(final CharSequence value)
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
    public CollateralInquiryAckEncoder orderID(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public CollateralInquiryAckEncoder orderID(final char[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    /* SecondaryOrderID = 198 */
    public CollateralInquiryAckEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public CollateralInquiryAckEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    /* SecondaryOrderID = 198 */
    public CollateralInquiryAckEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    /* SecondaryOrderID = 198 */
    public CollateralInquiryAckEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public CollateralInquiryAckEncoder secondaryOrderID(final byte[] value)
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
    public CollateralInquiryAckEncoder secondaryOrderID(final CharSequence value)
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
    public CollateralInquiryAckEncoder secondaryOrderID(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    /* SecondaryOrderID = 198 */
    public CollateralInquiryAckEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public CollateralInquiryAckEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryOrderID, offset, length))
        {
            secondaryOrderIDInternalBuffer = secondaryOrderID.byteArray();
        }
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();
    private byte[] secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
    private int secondaryClOrdIDOffset = 0;
    private int secondaryClOrdIDLength = 0;

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdID(final byte[] value)
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
    public CollateralInquiryAckEncoder secondaryClOrdID(final CharSequence value)
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
    public CollateralInquiryAckEncoder secondaryClOrdID(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public CollateralInquiryAckEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryClOrdID, offset, length))
        {
            secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
        }
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }


@Generated("uk.co.real_logic.artio")
public static class ExecsGroupEncoder
{
    private ExecsGroupEncoder next = null;

    public ExecsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ExecsGroupEncoder();
        }
        return next;
    }

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private final MutableDirectBuffer execID = new UnsafeBuffer();
    private byte[] execIDInternalBuffer = execID.byteArray();
    private int execIDOffset = 0;
    private int execIDLength = 0;

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(execID, value, offset, length))
        {
            execIDInternalBuffer = execID.byteArray();
        }
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final byte[] value)
    {
        return execID(value, 0, value.length);
    }

    /* ExecID = 17 */
    public boolean hasExecID()
    {
        return execIDLength > 0;
    }

    /* ExecID = 17 */
    public MutableDirectBuffer execID()
    {
        return execID;
    }

    /* ExecID = 17 */
    public String execIDAsString()
    {
        return execID.getStringWithoutLengthAscii(execIDOffset, execIDLength);
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final CharSequence value)
    {
        if (toBytes(value, execID))
        {
            execIDInternalBuffer = execID.byteArray();
        }
        execIDOffset = 0;
        execIDLength = value.length();
        return this;
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execID.wrap(buffer);
            execIDOffset = value.offset();
            execIDLength = value.length();
        }
        return this;
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public ExecsGroupEncoder execID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, execID, offset, length))
        {
            execIDInternalBuffer = execID.byteArray();
        }
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
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
        this.resetExecID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetExecID()
    {
        execIDLength = 0;
        execID.wrap(execIDInternalBuffer);
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
        builder.append("\"MessageName\": \"ExecsGroup\",\n");
        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public ExecsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecsGroupEncoder)encoder);
    }

    public ExecsGroupEncoder copyTo(final ExecsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }
        return encoder;
    }

}
    private int noExecsGroupCounter;

    private boolean hasNoExecsGroupCounter;

    public boolean hasNoExecsGroupCounter()
    {
        return hasNoExecsGroupCounter;
    }

    /* NoExecsGroupCounter = 124 */
    public CollateralInquiryAckEncoder noExecsGroupCounter(int value)
    {
        noExecsGroupCounter = value;
        hasNoExecsGroupCounter = true;
        return this;
    }

    /* NoExecsGroupCounter = 124 */
    public int noExecsGroupCounter()
    {
        return noExecsGroupCounter;
    }


    private ExecsGroupEncoder execsGroup = null;

    public ExecsGroupEncoder execsGroup(final int numberOfElements)
    {
        hasNoExecsGroupCounter = true;
        noExecsGroupCounter = numberOfElements;
        if (execsGroup == null)
        {
            execsGroup = new ExecsGroupEncoder();
        }
        return execsGroup;
    }


@Generated("uk.co.real_logic.artio")
public static class TradesGroupEncoder
{
    private TradesGroupEncoder next = null;

    public TradesGroupEncoder next()
    {
        if (next == null)
        {
            next = new TradesGroupEncoder();
        }
        return next;
    }

    private static final int tradeReportIDHeaderLength = 4;
    private static final byte[] tradeReportIDHeader = new byte[] {53, 55, 49, (byte) '='};

    private static final int secondaryTradeReportIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportIDHeader = new byte[] {56, 49, 56, (byte) '='};

    private final MutableDirectBuffer tradeReportID = new UnsafeBuffer();
    private byte[] tradeReportIDInternalBuffer = tradeReportID.byteArray();
    private int tradeReportIDOffset = 0;
    private int tradeReportIDLength = 0;

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final DirectBuffer value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final DirectBuffer value)
    {
        return tradeReportID(value, 0, value.capacity());
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final byte[] value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeReportID, value, offset, length))
        {
            tradeReportIDInternalBuffer = tradeReportID.byteArray();
        }
        tradeReportIDOffset = 0;
        tradeReportIDLength = length;
        return this;
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final byte[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final byte[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    /* TradeReportID = 571 */
    public boolean hasTradeReportID()
    {
        return tradeReportIDLength > 0;
    }

    /* TradeReportID = 571 */
    public MutableDirectBuffer tradeReportID()
    {
        return tradeReportID;
    }

    /* TradeReportID = 571 */
    public String tradeReportIDAsString()
    {
        return tradeReportID.getStringWithoutLengthAscii(tradeReportIDOffset, tradeReportIDLength);
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final CharSequence value)
    {
        if (toBytes(value, tradeReportID))
        {
            tradeReportIDInternalBuffer = tradeReportID.byteArray();
        }
        tradeReportIDOffset = 0;
        tradeReportIDLength = value.length();
        return this;
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeReportID.wrap(buffer);
            tradeReportIDOffset = value.offset();
            tradeReportIDLength = value.length();
        }
        return this;
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final char[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final char[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradesGroupEncoder tradeReportID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeReportID, offset, length))
        {
            tradeReportIDInternalBuffer = tradeReportID.byteArray();
        }
        tradeReportIDOffset = 0;
        tradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportID = new UnsafeBuffer();
    private byte[] secondaryTradeReportIDInternalBuffer = secondaryTradeReportID.byteArray();
    private int secondaryTradeReportIDOffset = 0;
    private int secondaryTradeReportIDLength = 0;

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final DirectBuffer value)
    {
        return secondaryTradeReportID(value, 0, value.capacity());
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(secondaryTradeReportID, value, offset, length))
        {
            secondaryTradeReportIDInternalBuffer = secondaryTradeReportID.byteArray();
        }
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final byte[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final byte[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    /* SecondaryTradeReportID = 818 */
    public boolean hasSecondaryTradeReportID()
    {
        return secondaryTradeReportIDLength > 0;
    }

    /* SecondaryTradeReportID = 818 */
    public MutableDirectBuffer secondaryTradeReportID()
    {
        return secondaryTradeReportID;
    }

    /* SecondaryTradeReportID = 818 */
    public String secondaryTradeReportIDAsString()
    {
        return secondaryTradeReportID.getStringWithoutLengthAscii(secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final CharSequence value)
    {
        if (toBytes(value, secondaryTradeReportID))
        {
            secondaryTradeReportIDInternalBuffer = secondaryTradeReportID.byteArray();
        }
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = value.length();
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryTradeReportID.wrap(buffer);
            secondaryTradeReportIDOffset = value.offset();
            secondaryTradeReportIDLength = value.length();
        }
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final char[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final char[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradesGroupEncoder secondaryTradeReportID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryTradeReportID, offset, length))
        {
            secondaryTradeReportIDInternalBuffer = secondaryTradeReportID.byteArray();
        }
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (tradeReportIDLength > 0)
        {
            buffer.putBytes(position, tradeReportIDHeader, 0, tradeReportIDHeaderLength);
            position += tradeReportIDHeaderLength;
            buffer.putBytes(position, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            position += tradeReportIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryTradeReportIDLength > 0)
        {
            buffer.putBytes(position, secondaryTradeReportIDHeader, 0, secondaryTradeReportIDHeaderLength);
            position += secondaryTradeReportIDHeaderLength;
            buffer.putBytes(position, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            position += secondaryTradeReportIDLength;
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
        this.resetTradeReportID();
        this.resetSecondaryTradeReportID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTradeReportID()
    {
        tradeReportIDLength = 0;
        tradeReportID.wrap(tradeReportIDInternalBuffer);
    }

    public void resetSecondaryTradeReportID()
    {
        secondaryTradeReportIDLength = 0;
        secondaryTradeReportID.wrap(secondaryTradeReportIDInternalBuffer);
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
        builder.append("\"MessageName\": \"TradesGroup\",\n");
        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            appendBuffer(builder, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            appendBuffer(builder, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public TradesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradesGroupEncoder)encoder);
    }

    public TradesGroupEncoder copyTo(final TradesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradeReportID())
        {
            encoder.tradeReportIDAsCopy(tradeReportID.byteArray(), 0, tradeReportIDLength);
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportIDAsCopy(secondaryTradeReportID.byteArray(), 0, secondaryTradeReportIDLength);
        }
        return encoder;
    }

}
    private int noTradesGroupCounter;

    private boolean hasNoTradesGroupCounter;

    public boolean hasNoTradesGroupCounter()
    {
        return hasNoTradesGroupCounter;
    }

    /* NoTradesGroupCounter = 897 */
    public CollateralInquiryAckEncoder noTradesGroupCounter(int value)
    {
        noTradesGroupCounter = value;
        hasNoTradesGroupCounter = true;
        return this;
    }

    /* NoTradesGroupCounter = 897 */
    public int noTradesGroupCounter()
    {
        return noTradesGroupCounter;
    }


    private TradesGroupEncoder tradesGroup = null;

    public TradesGroupEncoder tradesGroup(final int numberOfElements)
    {
        hasNoTradesGroupCounter = true;
        noTradesGroupCounter = numberOfElements;
        if (tradesGroup == null)
        {
            tradesGroup = new TradesGroupEncoder();
        }
        return tradesGroup;
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

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();
    private byte[] settlDateInternalBuffer = settlDate.byteArray();
    private int settlDateOffset = 0;
    private int settlDateLength = 0;

    /* SettlDate = 64 */
    public CollateralInquiryAckEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    /* SettlDate = 64 */
    public CollateralInquiryAckEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    /* SettlDate = 64 */
    public CollateralInquiryAckEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    /* SettlDate = 64 */
    public CollateralInquiryAckEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    /* SettlDate = 64 */
    public CollateralInquiryAckEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlDate, value, offset, length))
        {
            settlDateInternalBuffer = settlDate.byteArray();
        }
        settlDateOffset = 0;
        settlDateLength = length;
        return this;
    }

    /* SettlDate = 64 */
    public CollateralInquiryAckEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    /* SettlDate = 64 */
    public CollateralInquiryAckEncoder settlDate(final byte[] value)
    {
        return settlDate(value, 0, value.length);
    }

    /* SettlDate = 64 */
    public boolean hasSettlDate()
    {
        return settlDateLength > 0;
    }

    /* SettlDate = 64 */
    public MutableDirectBuffer settlDate()
    {
        return settlDate;
    }

    /* SettlDate = 64 */
    public String settlDateAsString()
    {
        return settlDate.getStringWithoutLengthAscii(settlDateOffset, settlDateLength);
    }

    private final DecimalFloat quantity = new DecimalFloat();

    private boolean hasQuantity;

    public boolean hasQuantity()
    {
        return hasQuantity;
    }

    /* Quantity = 53 */
    public CollateralInquiryAckEncoder quantity(ReadOnlyDecimalFloat value)
    {
        quantity.set(value);
        hasQuantity = true;
        return this;
    }

    /* Quantity = 53 */
    public CollateralInquiryAckEncoder quantity(long value, int scale)
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
    public CollateralInquiryAckEncoder qtyType(int value)
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

    public CollateralInquiryAckEncoder qtyType(QtyType value)
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

    private final MutableDirectBuffer currency = new UnsafeBuffer();
    private byte[] currencyInternalBuffer = currency.byteArray();
    private int currencyOffset = 0;
    private int currencyLength = 0;

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currency(final byte[] value)
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
    public CollateralInquiryAckEncoder currency(final CharSequence value)
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
    public CollateralInquiryAckEncoder currency(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public CollateralInquiryAckEncoder currency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, currency, offset, length))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = length;
        return this;
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
    public CollateralInquiryAckEncoder noLegsGroupCounter(int value)
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
    public CollateralInquiryAckEncoder noUnderlyingsGroupCounter(int value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionID(final byte[] value)
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
    public CollateralInquiryAckEncoder tradingSessionID(final CharSequence value)
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
    public CollateralInquiryAckEncoder tradingSessionID(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public CollateralInquiryAckEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public CollateralInquiryAckEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public CollateralInquiryAckEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public CollateralInquiryAckEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public CollateralInquiryAckEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public CollateralInquiryAckEncoder tradingSessionSubID(final byte[] value)
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
    public CollateralInquiryAckEncoder tradingSessionSubID(final CharSequence value)
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
    public CollateralInquiryAckEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public CollateralInquiryAckEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public CollateralInquiryAckEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();
    private byte[] settlSessIDInternalBuffer = settlSessID.byteArray();
    private int settlSessIDOffset = 0;
    private int settlSessIDLength = 0;

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlSessID, value, offset, length))
        {
            settlSessIDInternalBuffer = settlSessID.byteArray();
        }
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final byte[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    /* SettlSessID = 716 */
    public boolean hasSettlSessID()
    {
        return settlSessIDLength > 0;
    }

    /* SettlSessID = 716 */
    public MutableDirectBuffer settlSessID()
    {
        return settlSessID;
    }

    /* SettlSessID = 716 */
    public String settlSessIDAsString()
    {
        return settlSessID.getStringWithoutLengthAscii(settlSessIDOffset, settlSessIDLength);
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final CharSequence value)
    {
        if (toBytes(value, settlSessID))
        {
            settlSessIDInternalBuffer = settlSessID.byteArray();
        }
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessID.wrap(buffer);
            settlSessIDOffset = value.offset();
            settlSessIDLength = value.length();
        }
        return this;
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public CollateralInquiryAckEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlSessID, offset, length))
        {
            settlSessIDInternalBuffer = settlSessID.byteArray();
        }
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlSessSubID = new UnsafeBuffer();
    private byte[] settlSessSubIDInternalBuffer = settlSessSubID.byteArray();
    private int settlSessSubIDOffset = 0;
    private int settlSessSubIDLength = 0;

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlSessSubID, value, offset, length))
        {
            settlSessSubIDInternalBuffer = settlSessSubID.byteArray();
        }
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final byte[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    /* SettlSessSubID = 717 */
    public boolean hasSettlSessSubID()
    {
        return settlSessSubIDLength > 0;
    }

    /* SettlSessSubID = 717 */
    public MutableDirectBuffer settlSessSubID()
    {
        return settlSessSubID;
    }

    /* SettlSessSubID = 717 */
    public String settlSessSubIDAsString()
    {
        return settlSessSubID.getStringWithoutLengthAscii(settlSessSubIDOffset, settlSessSubIDLength);
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final CharSequence value)
    {
        if (toBytes(value, settlSessSubID))
        {
            settlSessSubIDInternalBuffer = settlSessSubID.byteArray();
        }
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessSubID.wrap(buffer);
            settlSessSubIDOffset = value.offset();
            settlSessSubIDLength = value.length();
        }
        return this;
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public CollateralInquiryAckEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlSessSubID, offset, length))
        {
            settlSessSubIDInternalBuffer = settlSessSubID.byteArray();
        }
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();
    private byte[] clearingBusinessDateInternalBuffer = clearingBusinessDate.byteArray();
    private int clearingBusinessDateOffset = 0;
    private int clearingBusinessDateLength = 0;

    /* ClearingBusinessDate = 715 */
    public CollateralInquiryAckEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public CollateralInquiryAckEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public CollateralInquiryAckEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    /* ClearingBusinessDate = 715 */
    public CollateralInquiryAckEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public CollateralInquiryAckEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(clearingBusinessDate, value, offset, length))
        {
            clearingBusinessDateInternalBuffer = clearingBusinessDate.byteArray();
        }
        clearingBusinessDateOffset = 0;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public CollateralInquiryAckEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public CollateralInquiryAckEncoder clearingBusinessDate(final byte[] value)
    {
        return clearingBusinessDate(value, 0, value.length);
    }

    /* ClearingBusinessDate = 715 */
    public boolean hasClearingBusinessDate()
    {
        return clearingBusinessDateLength > 0;
    }

    /* ClearingBusinessDate = 715 */
    public MutableDirectBuffer clearingBusinessDate()
    {
        return clearingBusinessDate;
    }

    /* ClearingBusinessDate = 715 */
    public String clearingBusinessDateAsString()
    {
        return clearingBusinessDate.getStringWithoutLengthAscii(clearingBusinessDateOffset, clearingBusinessDateLength);
    }

    private int responseTransportType;

    private boolean hasResponseTransportType;

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }

    /* ResponseTransportType = 725 */
    public CollateralInquiryAckEncoder responseTransportType(int value)
    {
        responseTransportType = value;
        hasResponseTransportType = true;
        return this;
    }

    /* ResponseTransportType = 725 */
    public int responseTransportType()
    {
        return responseTransportType;
    }

    public CollateralInquiryAckEncoder responseTransportType(ResponseTransportType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ResponseTransportType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: responseTransportType Value: " + value );
            }
            if (value == ResponseTransportType.NULL_VAL)
            {
                return this;
            }
        }
        return responseTransportType(value.representation());
    }

    private final MutableDirectBuffer responseDestination = new UnsafeBuffer();
    private byte[] responseDestinationInternalBuffer = responseDestination.byteArray();
    private int responseDestinationOffset = 0;
    private int responseDestinationLength = 0;

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final DirectBuffer value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final DirectBuffer value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final DirectBuffer value)
    {
        return responseDestination(value, 0, value.capacity());
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final byte[] value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(responseDestination, value, offset, length))
        {
            responseDestinationInternalBuffer = responseDestination.byteArray();
        }
        responseDestinationOffset = 0;
        responseDestinationLength = length;
        return this;
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final byte[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final byte[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    /* ResponseDestination = 726 */
    public boolean hasResponseDestination()
    {
        return responseDestinationLength > 0;
    }

    /* ResponseDestination = 726 */
    public MutableDirectBuffer responseDestination()
    {
        return responseDestination;
    }

    /* ResponseDestination = 726 */
    public String responseDestinationAsString()
    {
        return responseDestination.getStringWithoutLengthAscii(responseDestinationOffset, responseDestinationLength);
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final CharSequence value)
    {
        if (toBytes(value, responseDestination))
        {
            responseDestinationInternalBuffer = responseDestination.byteArray();
        }
        responseDestinationOffset = 0;
        responseDestinationLength = value.length();
        return this;
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            responseDestination.wrap(buffer);
            responseDestinationOffset = value.offset();
            responseDestinationLength = value.length();
        }
        return this;
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final char[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final char[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    /* ResponseDestination = 726 */
    public CollateralInquiryAckEncoder responseDestination(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, responseDestination, offset, length))
        {
            responseDestinationInternalBuffer = responseDestination.byteArray();
        }
        responseDestinationOffset = 0;
        responseDestinationLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public CollateralInquiryAckEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public CollateralInquiryAckEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public CollateralInquiryAckEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public CollateralInquiryAckEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public CollateralInquiryAckEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public CollateralInquiryAckEncoder text(final byte[] value)
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
    public CollateralInquiryAckEncoder text(final CharSequence value)
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
    public CollateralInquiryAckEncoder text(final AsciiSequenceView value)
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
    public CollateralInquiryAckEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public CollateralInquiryAckEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public CollateralInquiryAckEncoder text(final char[] value, final int offset, final int length)
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
    public CollateralInquiryAckEncoder encodedTextLen(int value)
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
    public CollateralInquiryAckEncoder encodedText(byte[] value)
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
    public CollateralInquiryAckEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (collInquiryIDLength > 0)
        {
            buffer.putBytes(position, collInquiryIDHeader, 0, collInquiryIDHeaderLength);
            position += collInquiryIDHeaderLength;
            buffer.putBytes(position, collInquiryID, collInquiryIDOffset, collInquiryIDLength);
            position += collInquiryIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollInquiryID");
        }

        if (hasCollInquiryStatus)
        {
            buffer.putBytes(position, collInquiryStatusHeader, 0, collInquiryStatusHeaderLength);
            position += collInquiryStatusHeaderLength;
            position += buffer.putIntAscii(position, collInquiryStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollInquiryStatus");
        }

        if (hasCollInquiryResult)
        {
            buffer.putBytes(position, collInquiryResultHeader, 0, collInquiryResultHeaderLength);
            position += collInquiryResultHeaderLength;
            position += buffer.putIntAscii(position, collInquiryResult);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoCollInquiryQualifierGroupCounter)
        {
            buffer.putBytes(position, noCollInquiryQualifierGroupCounterHeader, 0, noCollInquiryQualifierGroupCounterHeaderLength);
            position += noCollInquiryQualifierGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noCollInquiryQualifierGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (collInquiryQualifierGroup != null)
        {
            position += collInquiryQualifierGroup.encode(buffer, position, noCollInquiryQualifierGroupCounter);
        }


        if (hasTotNumReports)
        {
            buffer.putBytes(position, totNumReportsHeader, 0, totNumReportsHeaderLength);
            position += totNumReportsHeaderLength;
            position += buffer.putIntAscii(position, totNumReports);
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
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

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
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

        if (secondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, secondaryOrderIDHeader, 0, secondaryOrderIDHeaderLength);
            position += secondaryOrderIDHeaderLength;
            buffer.putBytes(position, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            position += secondaryOrderIDLength;
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

        if (hasNoExecsGroupCounter)
        {
            buffer.putBytes(position, noExecsGroupCounterHeader, 0, noExecsGroupCounterHeaderLength);
            position += noExecsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noExecsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (execsGroup != null)
        {
            position += execsGroup.encode(buffer, position, noExecsGroupCounter);
        }


        if (hasNoTradesGroupCounter)
        {
            buffer.putBytes(position, noTradesGroupCounterHeader, 0, noTradesGroupCounterHeaderLength);
            position += noTradesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTradesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tradesGroup != null)
        {
            position += tradesGroup.encode(buffer, position, noTradesGroupCounter);
        }


            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuantity)
        {
            buffer.putBytes(position, quantityHeader, 0, quantityHeaderLength);
            position += quantityHeaderLength;
            position += buffer.putFloatAscii(position, quantity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
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

        if (settlSessIDLength > 0)
        {
            buffer.putBytes(position, settlSessIDHeader, 0, settlSessIDHeaderLength);
            position += settlSessIDHeaderLength;
            buffer.putBytes(position, settlSessID, settlSessIDOffset, settlSessIDLength);
            position += settlSessIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlSessSubIDLength > 0)
        {
            buffer.putBytes(position, settlSessSubIDHeader, 0, settlSessSubIDHeaderLength);
            position += settlSessSubIDHeaderLength;
            buffer.putBytes(position, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            position += settlSessSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasResponseTransportType)
        {
            buffer.putBytes(position, responseTransportTypeHeader, 0, responseTransportTypeHeaderLength);
            position += responseTransportTypeHeaderLength;
            position += buffer.putIntAscii(position, responseTransportType);
            buffer.putSeparator(position);
            position++;
        }

        if (responseDestinationLength > 0)
        {
            buffer.putBytes(position, responseDestinationHeader, 0, responseDestinationHeaderLength);
            position += responseDestinationHeaderLength;
            buffer.putBytes(position, responseDestination, responseDestinationOffset, responseDestinationLength);
            position += responseDestinationLength;
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
        this.resetCollInquiryID();
        this.resetCollInquiryStatus();
        this.resetCollInquiryResult();
        this.resetTotNumReports();
        this.resetAccount();
        this.resetAccountType();
        this.resetClOrdID();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetSecondaryClOrdID();
        this.resetSettlDate();
        this.resetQuantity();
        this.resetQtyType();
        this.resetCurrency();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetClearingBusinessDate();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        financingDetails.reset();
        this.resetCollInquiryQualifierGroup();
        this.resetExecsGroup();
        this.resetTradesGroup();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
    }

    public void resetCollInquiryID()
    {
        collInquiryIDLength = 0;
        collInquiryID.wrap(collInquiryIDInternalBuffer);
    }

    public void resetCollInquiryStatus()
    {
        hasCollInquiryStatus = false;
    }

    public void resetCollInquiryResult()
    {
        hasCollInquiryResult = false;
    }

    public void resetTotNumReports()
    {
        hasTotNumReports = false;
    }

    public void resetAccount()
    {
        accountLength = 0;
        account.wrap(accountInternalBuffer);
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
        clOrdID.wrap(clOrdIDInternalBuffer);
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

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
        secondaryClOrdID.wrap(secondaryClOrdIDInternalBuffer);
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
        settlDate.wrap(settlDateInternalBuffer);
    }

    public void resetQuantity()
    {
        hasQuantity = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
        currency.wrap(currencyInternalBuffer);
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

    public void resetSettlSessID()
    {
        settlSessIDLength = 0;
        settlSessID.wrap(settlSessIDInternalBuffer);
    }

    public void resetSettlSessSubID()
    {
        settlSessSubIDLength = 0;
        settlSessSubID.wrap(settlSessSubIDInternalBuffer);
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
        clearingBusinessDate.wrap(clearingBusinessDateInternalBuffer);
    }

    public void resetResponseTransportType()
    {
        hasResponseTransportType = false;
    }

    public void resetResponseDestination()
    {
        responseDestinationLength = 0;
        responseDestination.wrap(responseDestinationInternalBuffer);
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

    public void resetCollInquiryQualifierGroup()
    {
        if (collInquiryQualifierGroup != null)
        {
            collInquiryQualifierGroup.reset();
        }
        noCollInquiryQualifierGroupCounter = 0;
        hasNoCollInquiryQualifierGroupCounter = false;
    }

    public void resetExecsGroup()
    {
        if (execsGroup != null)
        {
            execsGroup.reset();
        }
        noExecsGroupCounter = 0;
        hasNoExecsGroupCounter = false;
    }

    public void resetTradesGroup()
    {
        if (tradesGroup != null)
        {
            tradesGroup.reset();
        }
        noTradesGroupCounter = 0;
        hasNoTradesGroupCounter = false;
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
        builder.append("\"MessageName\": \"CollateralInquiryAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasCollInquiryID())
        {
            indent(builder, level);
            builder.append("\"CollInquiryID\": \"");
            appendBuffer(builder, collInquiryID, collInquiryIDOffset, collInquiryIDLength);
            builder.append("\",\n");
        }

        if (hasCollInquiryStatus())
        {
            indent(builder, level);
            builder.append("\"CollInquiryStatus\": \"");
            builder.append(collInquiryStatus);
            builder.append("\",\n");
        }

        if (hasCollInquiryResult())
        {
            indent(builder, level);
            builder.append("\"CollInquiryResult\": \"");
            builder.append(collInquiryResult);
            builder.append("\",\n");
        }

        if (hasNoCollInquiryQualifierGroupCounter)
        {
            indent(builder, level);
            builder.append("\"CollInquiryQualifierGroup\": [\n");
            final int noCollInquiryQualifierGroupCounter = this.noCollInquiryQualifierGroupCounter;
            CollInquiryQualifierGroupEncoder collInquiryQualifierGroup = this.collInquiryQualifierGroup;
            for (int i = 0; i < noCollInquiryQualifierGroupCounter; i++)
            {
                indent(builder, level);
                collInquiryQualifierGroup.appendTo(builder, level + 1);
                if (i < (noCollInquiryQualifierGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                collInquiryQualifierGroup = collInquiryQualifierGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTotNumReports())
        {
            indent(builder, level);
            builder.append("\"TotNumReports\": \"");
            builder.append(totNumReports);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
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

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasNoExecsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ExecsGroup\": [\n");
            final int noExecsGroupCounter = this.noExecsGroupCounter;
            ExecsGroupEncoder execsGroup = this.execsGroup;
            for (int i = 0; i < noExecsGroupCounter; i++)
            {
                indent(builder, level);
                execsGroup.appendTo(builder, level + 1);
                if (i < (noExecsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                execsGroup = execsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoTradesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradesGroup\": [\n");
            final int noTradesGroupCounter = this.noTradesGroupCounter;
            TradesGroupEncoder tradesGroup = this.tradesGroup;
            for (int i = 0; i < noTradesGroupCounter; i++)
            {
                indent(builder, level);
                tradesGroup.appendTo(builder, level + 1);
                if (i < (noTradesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradesGroup = tradesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
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

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

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

        if (hasSettlSessID())
        {
            indent(builder, level);
            builder.append("\"SettlSessID\": \"");
            appendBuffer(builder, settlSessID, settlSessIDOffset, settlSessIDLength);
            builder.append("\",\n");
        }

        if (hasSettlSessSubID())
        {
            indent(builder, level);
            builder.append("\"SettlSessSubID\": \"");
            appendBuffer(builder, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasResponseTransportType())
        {
            indent(builder, level);
            builder.append("\"ResponseTransportType\": \"");
            builder.append(responseTransportType);
            builder.append("\",\n");
        }

        if (hasResponseDestination())
        {
            indent(builder, level);
            builder.append("\"ResponseDestination\": \"");
            appendBuffer(builder, responseDestination, responseDestinationOffset, responseDestinationLength);
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

    public CollateralInquiryAckEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CollateralInquiryAckEncoder)encoder);
    }

    public CollateralInquiryAckEncoder copyTo(final CollateralInquiryAckEncoder encoder)
    {
        encoder.reset();
        if (hasCollInquiryID())
        {
            encoder.collInquiryIDAsCopy(collInquiryID.byteArray(), 0, collInquiryIDLength);
        }

        if (hasCollInquiryStatus())
        {
            encoder.collInquiryStatus(this.collInquiryStatus());
        }

        if (hasCollInquiryResult())
        {
            encoder.collInquiryResult(this.collInquiryResult());
        }

        if (hasNoCollInquiryQualifierGroupCounter)
        {
            final int size = this.noCollInquiryQualifierGroupCounter;
            CollInquiryQualifierGroupEncoder collInquiryQualifierGroup = this.collInquiryQualifierGroup;
            CollInquiryQualifierGroupEncoder collInquiryQualifierGroupEncoder = encoder.collInquiryQualifierGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (collInquiryQualifierGroup != null)
                {
                    collInquiryQualifierGroup.copyTo(collInquiryQualifierGroupEncoder);
                    collInquiryQualifierGroup = collInquiryQualifierGroup.next();
                    collInquiryQualifierGroupEncoder = collInquiryQualifierGroupEncoder.next();
                }
            }
        }

        if (hasTotNumReports())
        {
            encoder.totNumReports(this.totNumReports());
        }


        parties.copyTo(encoder.parties());
        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasNoExecsGroupCounter)
        {
            final int size = this.noExecsGroupCounter;
            ExecsGroupEncoder execsGroup = this.execsGroup;
            ExecsGroupEncoder execsGroupEncoder = encoder.execsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (execsGroup != null)
                {
                    execsGroup.copyTo(execsGroupEncoder);
                    execsGroup = execsGroup.next();
                    execsGroupEncoder = execsGroupEncoder.next();
                }
            }
        }

        if (hasNoTradesGroupCounter)
        {
            final int size = this.noTradesGroupCounter;
            TradesGroupEncoder tradesGroup = this.tradesGroup;
            TradesGroupEncoder tradesGroupEncoder = encoder.tradesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradesGroup != null)
                {
                    tradesGroup.copyTo(tradesGroupEncoder);
                    tradesGroup = tradesGroup.next();
                    tradesGroupEncoder = tradesGroupEncoder.next();
                }
            }
        }


        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());
        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasQuantity())
        {
            encoder.quantity(this.quantity());
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

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

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubIDAsCopy(settlSessSubID.byteArray(), 0, settlSessSubIDLength);
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasResponseTransportType())
        {
            encoder.responseTransportType(this.responseTransportType());
        }

        if (hasResponseDestination())
        {
            encoder.responseDestinationAsCopy(responseDestination.byteArray(), 0, responseDestinationLength);
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
