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
public class PositionReportEncoder implements Encoder
{
    public long messageType()
    {
        return 20545L;
    }

    public PositionReportEncoder()
    {
        header.msgType("AP");
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

    private static final int posMaintRptIDHeaderLength = 4;
    private static final byte[] posMaintRptIDHeader = new byte[] {55, 50, 49, (byte) '='};

    private static final int posReqIDHeaderLength = 4;
    private static final byte[] posReqIDHeader = new byte[] {55, 49, 48, (byte) '='};

    private static final int posReqTypeHeaderLength = 4;
    private static final byte[] posReqTypeHeader = new byte[] {55, 50, 52, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int totalNumPosReportsHeaderLength = 4;
    private static final byte[] totalNumPosReportsHeader = new byte[] {55, 50, 55, (byte) '='};

    private static final int unsolicitedIndicatorHeaderLength = 4;
    private static final byte[] unsolicitedIndicatorHeader = new byte[] {51, 50, 53, (byte) '='};

    private static final int posReqResultHeaderLength = 4;
    private static final byte[] posReqResultHeader = new byte[] {55, 50, 56, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int settlPriceHeaderLength = 4;
    private static final byte[] settlPriceHeader = new byte[] {55, 51, 48, (byte) '='};

    private static final int settlPriceTypeHeaderLength = 4;
    private static final byte[] settlPriceTypeHeader = new byte[] {55, 51, 49, (byte) '='};

    private static final int priorSettlPriceHeaderLength = 4;
    private static final byte[] priorSettlPriceHeader = new byte[] {55, 51, 52, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int registStatusHeaderLength = 4;
    private static final byte[] registStatusHeader = new byte[] {53, 48, 54, (byte) '='};

    private static final int deliveryDateHeaderLength = 4;
    private static final byte[] deliveryDateHeader = new byte[] {55, 52, 51, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer posMaintRptID = new UnsafeBuffer();
    private byte[] posMaintRptIDInternalBuffer = posMaintRptID.byteArray();
    private int posMaintRptIDOffset = 0;
    private int posMaintRptIDLength = 0;

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final DirectBuffer value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final DirectBuffer value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final DirectBuffer value)
    {
        return posMaintRptID(value, 0, value.capacity());
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final byte[] value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(posMaintRptID, value, offset, length))
        {
            posMaintRptIDInternalBuffer = posMaintRptID.byteArray();
        }
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = length;
        return this;
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final byte[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final byte[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    /* PosMaintRptID = 721 */
    public boolean hasPosMaintRptID()
    {
        return posMaintRptIDLength > 0;
    }

    /* PosMaintRptID = 721 */
    public MutableDirectBuffer posMaintRptID()
    {
        return posMaintRptID;
    }

    /* PosMaintRptID = 721 */
    public String posMaintRptIDAsString()
    {
        return posMaintRptID.getStringWithoutLengthAscii(posMaintRptIDOffset, posMaintRptIDLength);
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final CharSequence value)
    {
        if (toBytes(value, posMaintRptID))
        {
            posMaintRptIDInternalBuffer = posMaintRptID.byteArray();
        }
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = value.length();
        return this;
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posMaintRptID.wrap(buffer);
            posMaintRptIDOffset = value.offset();
            posMaintRptIDLength = value.length();
        }
        return this;
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final char[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final char[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    /* PosMaintRptID = 721 */
    public PositionReportEncoder posMaintRptID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, posMaintRptID, offset, length))
        {
            posMaintRptIDInternalBuffer = posMaintRptID.byteArray();
        }
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = length;
        return this;
    }

    private final MutableDirectBuffer posReqID = new UnsafeBuffer();
    private byte[] posReqIDInternalBuffer = posReqID.byteArray();
    private int posReqIDOffset = 0;
    private int posReqIDLength = 0;

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final DirectBuffer value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final DirectBuffer value, final int length)
    {
        return posReqID(value, 0, length);
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final DirectBuffer value)
    {
        return posReqID(value, 0, value.capacity());
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final byte[] value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(posReqID, value, offset, length))
        {
            posReqIDInternalBuffer = posReqID.byteArray();
        }
        posReqIDOffset = 0;
        posReqIDLength = length;
        return this;
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final byte[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final byte[] value)
    {
        return posReqID(value, 0, value.length);
    }

    /* PosReqID = 710 */
    public boolean hasPosReqID()
    {
        return posReqIDLength > 0;
    }

    /* PosReqID = 710 */
    public MutableDirectBuffer posReqID()
    {
        return posReqID;
    }

    /* PosReqID = 710 */
    public String posReqIDAsString()
    {
        return posReqID.getStringWithoutLengthAscii(posReqIDOffset, posReqIDLength);
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final CharSequence value)
    {
        if (toBytes(value, posReqID))
        {
            posReqIDInternalBuffer = posReqID.byteArray();
        }
        posReqIDOffset = 0;
        posReqIDLength = value.length();
        return this;
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posReqID.wrap(buffer);
            posReqIDOffset = value.offset();
            posReqIDLength = value.length();
        }
        return this;
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final char[] value)
    {
        return posReqID(value, 0, value.length);
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final char[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    /* PosReqID = 710 */
    public PositionReportEncoder posReqID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, posReqID, offset, length))
        {
            posReqIDInternalBuffer = posReqID.byteArray();
        }
        posReqIDOffset = 0;
        posReqIDLength = length;
        return this;
    }

    private int posReqType;

    private boolean hasPosReqType;

    public boolean hasPosReqType()
    {
        return hasPosReqType;
    }

    /* PosReqType = 724 */
    public PositionReportEncoder posReqType(int value)
    {
        posReqType = value;
        hasPosReqType = true;
        return this;
    }

    /* PosReqType = 724 */
    public int posReqType()
    {
        return posReqType;
    }

    public PositionReportEncoder posReqType(PosReqType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosReqType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posReqType Value: " + value );
            }
            if (value == PosReqType.NULL_VAL)
            {
                return this;
            }
        }
        return posReqType(value.representation());
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    /* SubscriptionRequestType = 263 */
    public PositionReportEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    /* SubscriptionRequestType = 263 */
    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public PositionReportEncoder subscriptionRequestType(SubscriptionRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SubscriptionRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: subscriptionRequestType Value: " + value );
            }
            if (value == SubscriptionRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return subscriptionRequestType(value.representation());
    }

    private int totalNumPosReports;

    private boolean hasTotalNumPosReports;

    public boolean hasTotalNumPosReports()
    {
        return hasTotalNumPosReports;
    }

    /* TotalNumPosReports = 727 */
    public PositionReportEncoder totalNumPosReports(int value)
    {
        totalNumPosReports = value;
        hasTotalNumPosReports = true;
        return this;
    }

    /* TotalNumPosReports = 727 */
    public int totalNumPosReports()
    {
        return totalNumPosReports;
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }

    /* UnsolicitedIndicator = 325 */
    public PositionReportEncoder unsolicitedIndicator(boolean value)
    {
        unsolicitedIndicator = value;
        hasUnsolicitedIndicator = true;
        return this;
    }

    /* UnsolicitedIndicator = 325 */
    public boolean unsolicitedIndicator()
    {
        return unsolicitedIndicator;
    }

    private int posReqResult;

    private boolean hasPosReqResult;

    public boolean hasPosReqResult()
    {
        return hasPosReqResult;
    }

    /* PosReqResult = 728 */
    public PositionReportEncoder posReqResult(int value)
    {
        posReqResult = value;
        hasPosReqResult = true;
        return this;
    }

    /* PosReqResult = 728 */
    public int posReqResult()
    {
        return posReqResult;
    }

    public PositionReportEncoder posReqResult(PosReqResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosReqResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posReqResult Value: " + value );
            }
            if (value == PosReqResult.NULL_VAL)
            {
                return this;
            }
        }
        return posReqResult(value.representation());
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();
    private byte[] clearingBusinessDateInternalBuffer = clearingBusinessDate.byteArray();
    private int clearingBusinessDateOffset = 0;
    private int clearingBusinessDateLength = 0;

    /* ClearingBusinessDate = 715 */
    public PositionReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public PositionReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public PositionReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    /* ClearingBusinessDate = 715 */
    public PositionReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public PositionReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public PositionReportEncoder clearingBusinessDate(final byte[] value)
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

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();
    private byte[] settlSessIDInternalBuffer = settlSessID.byteArray();
    private int settlSessIDOffset = 0;
    private int settlSessIDLength = 0;

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionReportEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessID(final byte[] value)
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
    public PositionReportEncoder settlSessID(final CharSequence value)
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
    public PositionReportEncoder settlSessID(final AsciiSequenceView value)
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
    public PositionReportEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public PositionReportEncoder settlSessID(final char[] value, final int offset, final int length)
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
    public PositionReportEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    /* SettlSessSubID = 717 */
    public PositionReportEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public PositionReportEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    /* SettlSessSubID = 717 */
    public PositionReportEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    /* SettlSessSubID = 717 */
    public PositionReportEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionReportEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public PositionReportEncoder settlSessSubID(final byte[] value)
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
    public PositionReportEncoder settlSessSubID(final CharSequence value)
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
    public PositionReportEncoder settlSessSubID(final AsciiSequenceView value)
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
    public PositionReportEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    /* SettlSessSubID = 717 */
    public PositionReportEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public PositionReportEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlSessSubID, offset, length))
        {
            settlSessSubIDInternalBuffer = settlSessSubID.byteArray();
        }
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
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
    public PositionReportEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public PositionReportEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public PositionReportEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    /* Account = 1 */
    public PositionReportEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public PositionReportEncoder accountAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionReportEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public PositionReportEncoder account(final byte[] value)
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
    public PositionReportEncoder account(final CharSequence value)
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
    public PositionReportEncoder account(final AsciiSequenceView value)
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
    public PositionReportEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    /* Account = 1 */
    public PositionReportEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public PositionReportEncoder account(final char[] value, final int offset, final int length)
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
    public PositionReportEncoder acctIDSource(int value)
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

    public PositionReportEncoder acctIDSource(AcctIDSource value)
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
    public PositionReportEncoder accountType(int value)
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

    public PositionReportEncoder accountType(AccountType value)
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

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();
    private byte[] currencyInternalBuffer = currency.byteArray();
    private int currencyOffset = 0;
    private int currencyLength = 0;

    /* Currency = 15 */
    public PositionReportEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public PositionReportEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public PositionReportEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    /* Currency = 15 */
    public PositionReportEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public PositionReportEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionReportEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public PositionReportEncoder currency(final byte[] value)
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
    public PositionReportEncoder currency(final CharSequence value)
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
    public PositionReportEncoder currency(final AsciiSequenceView value)
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
    public PositionReportEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public PositionReportEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public PositionReportEncoder currency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, currency, offset, length))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final DecimalFloat settlPrice = new DecimalFloat();

    private boolean hasSettlPrice;

    public boolean hasSettlPrice()
    {
        return hasSettlPrice;
    }

    /* SettlPrice = 730 */
    public PositionReportEncoder settlPrice(ReadOnlyDecimalFloat value)
    {
        settlPrice.set(value);
        hasSettlPrice = true;
        return this;
    }

    /* SettlPrice = 730 */
    public PositionReportEncoder settlPrice(long value, int scale)
    {
        settlPrice.set(value, scale);
        hasSettlPrice = true;
        return this;
    }

    /* SettlPrice = 730 */
    public DecimalFloat settlPrice()
    {
        return settlPrice;
    }

    private int settlPriceType;

    private boolean hasSettlPriceType;

    public boolean hasSettlPriceType()
    {
        return hasSettlPriceType;
    }

    /* SettlPriceType = 731 */
    public PositionReportEncoder settlPriceType(int value)
    {
        settlPriceType = value;
        hasSettlPriceType = true;
        return this;
    }

    /* SettlPriceType = 731 */
    public int settlPriceType()
    {
        return settlPriceType;
    }

    public PositionReportEncoder settlPriceType(SettlPriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlPriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlPriceType Value: " + value );
            }
            if (value == SettlPriceType.NULL_VAL)
            {
                return this;
            }
        }
        return settlPriceType(value.representation());
    }

    private final DecimalFloat priorSettlPrice = new DecimalFloat();

    private boolean hasPriorSettlPrice;

    public boolean hasPriorSettlPrice()
    {
        return hasPriorSettlPrice;
    }

    /* PriorSettlPrice = 734 */
    public PositionReportEncoder priorSettlPrice(ReadOnlyDecimalFloat value)
    {
        priorSettlPrice.set(value);
        hasPriorSettlPrice = true;
        return this;
    }

    /* PriorSettlPrice = 734 */
    public PositionReportEncoder priorSettlPrice(long value, int scale)
    {
        priorSettlPrice.set(value, scale);
        hasPriorSettlPrice = true;
        return this;
    }

    /* PriorSettlPrice = 734 */
    public DecimalFloat priorSettlPrice()
    {
        return priorSettlPrice;
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
    public PositionReportEncoder noLegsGroupCounter(int value)
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

    private static final int underlyingSettlPriceHeaderLength = 4;
    private static final byte[] underlyingSettlPriceHeader = new byte[] {55, 51, 50, (byte) '='};

    private static final int underlyingSettlPriceTypeHeaderLength = 4;
    private static final byte[] underlyingSettlPriceTypeHeader = new byte[] {55, 51, 51, (byte) '='};

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private final DecimalFloat underlyingSettlPrice = new DecimalFloat();

    private boolean hasUnderlyingSettlPrice;

    public boolean hasUnderlyingSettlPrice()
    {
        return hasUnderlyingSettlPrice;
    }

    /* UnderlyingSettlPrice = 732 */
    public UnderlyingsGroupEncoder underlyingSettlPrice(ReadOnlyDecimalFloat value)
    {
        underlyingSettlPrice.set(value);
        hasUnderlyingSettlPrice = true;
        return this;
    }

    /* UnderlyingSettlPrice = 732 */
    public UnderlyingsGroupEncoder underlyingSettlPrice(long value, int scale)
    {
        underlyingSettlPrice.set(value, scale);
        hasUnderlyingSettlPrice = true;
        return this;
    }

    /* UnderlyingSettlPrice = 732 */
    public DecimalFloat underlyingSettlPrice()
    {
        return underlyingSettlPrice;
    }

    private int underlyingSettlPriceType;

    private boolean hasUnderlyingSettlPriceType;

    public boolean hasUnderlyingSettlPriceType()
    {
        return hasUnderlyingSettlPriceType;
    }

    /* UnderlyingSettlPriceType = 733 */
    public UnderlyingsGroupEncoder underlyingSettlPriceType(int value)
    {
        underlyingSettlPriceType = value;
        hasUnderlyingSettlPriceType = true;
        return this;
    }

    /* UnderlyingSettlPriceType = 733 */
    public int underlyingSettlPriceType()
    {
        return underlyingSettlPriceType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);

        if (hasUnderlyingSettlPrice)
        {
            buffer.putBytes(position, underlyingSettlPriceHeader, 0, underlyingSettlPriceHeaderLength);
            position += underlyingSettlPriceHeaderLength;
            position += buffer.putFloatAscii(position, underlyingSettlPrice);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: UnderlyingSettlPrice");
        }

        if (hasUnderlyingSettlPriceType)
        {
            buffer.putBytes(position, underlyingSettlPriceTypeHeader, 0, underlyingSettlPriceTypeHeaderLength);
            position += underlyingSettlPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, underlyingSettlPriceType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: UnderlyingSettlPriceType");
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingSettlPrice();
        this.resetUnderlyingSettlPriceType();
        underlyingInstrument.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingSettlPrice()
    {
        hasUnderlyingSettlPrice = false;
    }

    public void resetUnderlyingSettlPriceType()
    {
        hasUnderlyingSettlPriceType = false;
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

        if (hasUnderlyingSettlPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlPrice\": \"");
            underlyingSettlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlPriceType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlPriceType\": \"");
            builder.append(underlyingSettlPriceType);
            builder.append("\",\n");
        }
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

        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasUnderlyingSettlPrice())
        {
            encoder.underlyingSettlPrice(this.underlyingSettlPrice());
        }

        if (hasUnderlyingSettlPriceType())
        {
            encoder.underlyingSettlPriceType(this.underlyingSettlPriceType());
        }
        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    /* NoUnderlyingsGroupCounter = 711 */
    public PositionReportEncoder noUnderlyingsGroupCounter(int value)
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

    private final PositionQtyEncoder positionQty = new PositionQtyEncoder();
    public PositionQtyEncoder positionQty()
    {
        return positionQty;
    }

    private final PositionAmountDataEncoder positionAmountData = new PositionAmountDataEncoder();
    public PositionAmountDataEncoder positionAmountData()
    {
        return positionAmountData;
    }

    private char registStatus;

    private boolean hasRegistStatus;

    public boolean hasRegistStatus()
    {
        return hasRegistStatus;
    }

    /* RegistStatus = 506 */
    public PositionReportEncoder registStatus(char value)
    {
        registStatus = value;
        hasRegistStatus = true;
        return this;
    }

    /* RegistStatus = 506 */
    public char registStatus()
    {
        return registStatus;
    }

    public PositionReportEncoder registStatus(RegistStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RegistStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: registStatus Value: " + value );
            }
            if (value == RegistStatus.NULL_VAL)
            {
                return this;
            }
        }
        return registStatus(value.representation());
    }

    private final MutableDirectBuffer deliveryDate = new UnsafeBuffer();
    private byte[] deliveryDateInternalBuffer = deliveryDate.byteArray();
    private int deliveryDateOffset = 0;
    private int deliveryDateLength = 0;

    /* DeliveryDate = 743 */
    public PositionReportEncoder deliveryDate(final DirectBuffer value, final int offset, final int length)
    {
        deliveryDate.wrap(value);
        deliveryDateOffset = offset;
        deliveryDateLength = length;
        return this;
    }

    /* DeliveryDate = 743 */
    public PositionReportEncoder deliveryDate(final DirectBuffer value, final int length)
    {
        return deliveryDate(value, 0, length);
    }

    /* DeliveryDate = 743 */
    public PositionReportEncoder deliveryDate(final DirectBuffer value)
    {
        return deliveryDate(value, 0, value.capacity());
    }

    /* DeliveryDate = 743 */
    public PositionReportEncoder deliveryDate(final byte[] value, final int offset, final int length)
    {
        deliveryDate.wrap(value);
        deliveryDateOffset = offset;
        deliveryDateLength = length;
        return this;
    }

    /* DeliveryDate = 743 */
    public PositionReportEncoder deliveryDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(deliveryDate, value, offset, length))
        {
            deliveryDateInternalBuffer = deliveryDate.byteArray();
        }
        deliveryDateOffset = 0;
        deliveryDateLength = length;
        return this;
    }

    /* DeliveryDate = 743 */
    public PositionReportEncoder deliveryDate(final byte[] value, final int length)
    {
        return deliveryDate(value, 0, length);
    }

    /* DeliveryDate = 743 */
    public PositionReportEncoder deliveryDate(final byte[] value)
    {
        return deliveryDate(value, 0, value.length);
    }

    /* DeliveryDate = 743 */
    public boolean hasDeliveryDate()
    {
        return deliveryDateLength > 0;
    }

    /* DeliveryDate = 743 */
    public MutableDirectBuffer deliveryDate()
    {
        return deliveryDate;
    }

    /* DeliveryDate = 743 */
    public String deliveryDateAsString()
    {
        return deliveryDate.getStringWithoutLengthAscii(deliveryDateOffset, deliveryDateLength);
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public PositionReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public PositionReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public PositionReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public PositionReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public PositionReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public PositionReportEncoder text(final byte[] value)
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
    public PositionReportEncoder text(final CharSequence value)
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
    public PositionReportEncoder text(final AsciiSequenceView value)
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
    public PositionReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public PositionReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public PositionReportEncoder text(final char[] value, final int offset, final int length)
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
    public PositionReportEncoder encodedTextLen(int value)
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
    public PositionReportEncoder encodedText(byte[] value)
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
    public PositionReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (posMaintRptIDLength > 0)
        {
            buffer.putBytes(position, posMaintRptIDHeader, 0, posMaintRptIDHeaderLength);
            position += posMaintRptIDHeaderLength;
            buffer.putBytes(position, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            position += posMaintRptIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintRptID");
        }

        if (posReqIDLength > 0)
        {
            buffer.putBytes(position, posReqIDHeader, 0, posReqIDHeaderLength);
            position += posReqIDHeaderLength;
            buffer.putBytes(position, posReqID, posReqIDOffset, posReqIDLength);
            position += posReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPosReqType)
        {
            buffer.putBytes(position, posReqTypeHeader, 0, posReqTypeHeaderLength);
            position += posReqTypeHeaderLength;
            position += buffer.putIntAscii(position, posReqType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalNumPosReports)
        {
            buffer.putBytes(position, totalNumPosReportsHeader, 0, totalNumPosReportsHeaderLength);
            position += totalNumPosReportsHeaderLength;
            position += buffer.putIntAscii(position, totalNumPosReports);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnsolicitedIndicator)
        {
            buffer.putBytes(position, unsolicitedIndicatorHeader, 0, unsolicitedIndicatorHeaderLength);
            position += unsolicitedIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, unsolicitedIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPosReqResult)
        {
            buffer.putBytes(position, posReqResultHeader, 0, posReqResultHeaderLength);
            position += posReqResultHeaderLength;
            position += buffer.putIntAscii(position, posReqResult);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosReqResult");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClearingBusinessDate");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Account");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AccountType");
        }

            position += instrument.encode(buffer, position);

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlPrice)
        {
            buffer.putBytes(position, settlPriceHeader, 0, settlPriceHeaderLength);
            position += settlPriceHeaderLength;
            position += buffer.putFloatAscii(position, settlPrice);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlPrice");
        }

        if (hasSettlPriceType)
        {
            buffer.putBytes(position, settlPriceTypeHeader, 0, settlPriceTypeHeaderLength);
            position += settlPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, settlPriceType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlPriceType");
        }

        if (hasPriorSettlPrice)
        {
            buffer.putBytes(position, priorSettlPriceHeader, 0, priorSettlPriceHeaderLength);
            position += priorSettlPriceHeaderLength;
            position += buffer.putFloatAscii(position, priorSettlPrice);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PriorSettlPrice");
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


            position += positionQty.encode(buffer, position);

            position += positionAmountData.encode(buffer, position);

        if (hasRegistStatus)
        {
            buffer.putBytes(position, registStatusHeader, 0, registStatusHeaderLength);
            position += registStatusHeaderLength;
            position += buffer.putCharAscii(position, registStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (deliveryDateLength > 0)
        {
            buffer.putBytes(position, deliveryDateHeader, 0, deliveryDateHeaderLength);
            position += deliveryDateHeaderLength;
            buffer.putBytes(position, deliveryDate, deliveryDateOffset, deliveryDateLength);
            position += deliveryDateLength;
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
        this.resetPosMaintRptID();
        this.resetPosReqID();
        this.resetPosReqType();
        this.resetSubscriptionRequestType();
        this.resetTotalNumPosReports();
        this.resetUnsolicitedIndicator();
        this.resetPosReqResult();
        this.resetClearingBusinessDate();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetCurrency();
        this.resetSettlPrice();
        this.resetSettlPriceType();
        this.resetPriorSettlPrice();
        this.resetRegistStatus();
        this.resetDeliveryDate();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        positionQty.reset();
        positionAmountData.reset();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
    }

    public void resetPosMaintRptID()
    {
        posMaintRptIDLength = 0;
        posMaintRptID.wrap(posMaintRptIDInternalBuffer);
    }

    public void resetPosReqID()
    {
        posReqIDLength = 0;
        posReqID.wrap(posReqIDInternalBuffer);
    }

    public void resetPosReqType()
    {
        hasPosReqType = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTotalNumPosReports()
    {
        hasTotalNumPosReports = false;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
    }

    public void resetPosReqResult()
    {
        hasPosReqResult = false;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
        clearingBusinessDate.wrap(clearingBusinessDateInternalBuffer);
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

    public void resetCurrency()
    {
        currencyLength = 0;
        currency.wrap(currencyInternalBuffer);
    }

    public void resetSettlPrice()
    {
        hasSettlPrice = false;
    }

    public void resetSettlPriceType()
    {
        hasSettlPriceType = false;
    }

    public void resetPriorSettlPrice()
    {
        hasPriorSettlPrice = false;
    }

    public void resetRegistStatus()
    {
        hasRegistStatus = false;
    }

    public void resetDeliveryDate()
    {
        deliveryDateLength = 0;
        deliveryDate.wrap(deliveryDateInternalBuffer);
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
        builder.append("\"MessageName\": \"PositionReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasPosMaintRptID())
        {
            indent(builder, level);
            builder.append("\"PosMaintRptID\": \"");
            appendBuffer(builder, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            builder.append("\",\n");
        }

        if (hasPosReqID())
        {
            indent(builder, level);
            builder.append("\"PosReqID\": \"");
            appendBuffer(builder, posReqID, posReqIDOffset, posReqIDLength);
            builder.append("\",\n");
        }

        if (hasPosReqType())
        {
            indent(builder, level);
            builder.append("\"PosReqType\": \"");
            builder.append(posReqType);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasTotalNumPosReports())
        {
            indent(builder, level);
            builder.append("\"TotalNumPosReports\": \"");
            builder.append(totalNumPosReports);
            builder.append("\",\n");
        }

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
        }

        if (hasPosReqResult())
        {
            indent(builder, level);
            builder.append("\"PosReqResult\": \"");
            builder.append(posReqResult);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
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
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasSettlPrice())
        {
            indent(builder, level);
            builder.append("\"SettlPrice\": \"");
            settlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlPriceType())
        {
            indent(builder, level);
            builder.append("\"SettlPriceType\": \"");
            builder.append(settlPriceType);
            builder.append("\",\n");
        }

        if (hasPriorSettlPrice())
        {
            indent(builder, level);
            builder.append("\"PriorSettlPrice\": \"");
            priorSettlPrice.appendTo(builder);
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

    indent(builder, level);
    builder.append("\"PositionQty\": ");
    positionQty.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasRegistStatus())
        {
            indent(builder, level);
            builder.append("\"RegistStatus\": \"");
            builder.append(registStatus);
            builder.append("\",\n");
        }

        if (hasDeliveryDate())
        {
            indent(builder, level);
            builder.append("\"DeliveryDate\": \"");
            appendBuffer(builder, deliveryDate, deliveryDateOffset, deliveryDateLength);
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

    public PositionReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PositionReportEncoder)encoder);
    }

    public PositionReportEncoder copyTo(final PositionReportEncoder encoder)
    {
        encoder.reset();
        if (hasPosMaintRptID())
        {
            encoder.posMaintRptIDAsCopy(posMaintRptID.byteArray(), 0, posMaintRptIDLength);
        }

        if (hasPosReqID())
        {
            encoder.posReqIDAsCopy(posReqID.byteArray(), 0, posReqIDLength);
        }

        if (hasPosReqType())
        {
            encoder.posReqType(this.posReqType());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTotalNumPosReports())
        {
            encoder.totalNumPosReports(this.totalNumPosReports());
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
        }

        if (hasPosReqResult())
        {
            encoder.posReqResult(this.posReqResult());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubIDAsCopy(settlSessSubID.byteArray(), 0, settlSessSubIDLength);
        }


        parties.copyTo(encoder.parties());
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


        instrument.copyTo(encoder.instrument());
        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasSettlPrice())
        {
            encoder.settlPrice(this.settlPrice());
        }

        if (hasSettlPriceType())
        {
            encoder.settlPriceType(this.settlPriceType());
        }

        if (hasPriorSettlPrice())
        {
            encoder.priorSettlPrice(this.priorSettlPrice());
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


        positionQty.copyTo(encoder.positionQty());

        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasRegistStatus())
        {
            encoder.registStatus(this.registStatus());
        }

        if (hasDeliveryDate())
        {
            encoder.deliveryDateAsCopy(deliveryDate.byteArray(), 0, deliveryDateLength);
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
