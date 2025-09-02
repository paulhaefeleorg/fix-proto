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
public class PositionMaintenanceReportEncoder implements Encoder
{
    public long messageType()
    {
        return 19777L;
    }

    public PositionMaintenanceReportEncoder()
    {
        header.msgType("AM");
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

    private static final int posTransTypeHeaderLength = 4;
    private static final byte[] posTransTypeHeader = new byte[] {55, 48, 57, (byte) '='};

    private static final int posReqIDHeaderLength = 4;
    private static final byte[] posReqIDHeader = new byte[] {55, 49, 48, (byte) '='};

    private static final int posMaintActionHeaderLength = 4;
    private static final byte[] posMaintActionHeader = new byte[] {55, 49, 50, (byte) '='};

    private static final int origPosReqRefIDHeaderLength = 4;
    private static final byte[] origPosReqRefIDHeader = new byte[] {55, 49, 51, (byte) '='};

    private static final int posMaintStatusHeaderLength = 4;
    private static final byte[] posMaintStatusHeader = new byte[] {55, 50, 50, (byte) '='};

    private static final int posMaintResultHeaderLength = 4;
    private static final byte[] posMaintResultHeader = new byte[] {55, 50, 51, (byte) '='};

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

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noTradingSessionsGroupCounterHeaderLength = 4;
    private static final byte[] noTradingSessionsGroupCounterHeader = new byte[] {51, 56, 54, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int adjustmentTypeHeaderLength = 4;
    private static final byte[] adjustmentTypeHeader = new byte[] {55, 49, 56, (byte) '='};

    private static final int thresholdAmountHeaderLength = 4;
    private static final byte[] thresholdAmountHeader = new byte[] {56, 51, 52, (byte) '='};

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
    public PositionMaintenanceReportEncoder posMaintRptID(final DirectBuffer value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    /* PosMaintRptID = 721 */
    public PositionMaintenanceReportEncoder posMaintRptID(final DirectBuffer value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    /* PosMaintRptID = 721 */
    public PositionMaintenanceReportEncoder posMaintRptID(final DirectBuffer value)
    {
        return posMaintRptID(value, 0, value.capacity());
    }

    /* PosMaintRptID = 721 */
    public PositionMaintenanceReportEncoder posMaintRptID(final byte[] value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    /* PosMaintRptID = 721 */
    public PositionMaintenanceReportEncoder posMaintRptIDAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder posMaintRptID(final byte[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    /* PosMaintRptID = 721 */
    public PositionMaintenanceReportEncoder posMaintRptID(final byte[] value)
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
    public PositionMaintenanceReportEncoder posMaintRptID(final CharSequence value)
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
    public PositionMaintenanceReportEncoder posMaintRptID(final AsciiSequenceView value)
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
    public PositionMaintenanceReportEncoder posMaintRptID(final char[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    /* PosMaintRptID = 721 */
    public PositionMaintenanceReportEncoder posMaintRptID(final char[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    /* PosMaintRptID = 721 */
    public PositionMaintenanceReportEncoder posMaintRptID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, posMaintRptID, offset, length))
        {
            posMaintRptIDInternalBuffer = posMaintRptID.byteArray();
        }
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = length;
        return this;
    }

    private int posTransType;

    private boolean hasPosTransType;

    public boolean hasPosTransType()
    {
        return hasPosTransType;
    }

    /* PosTransType = 709 */
    public PositionMaintenanceReportEncoder posTransType(int value)
    {
        posTransType = value;
        hasPosTransType = true;
        return this;
    }

    /* PosTransType = 709 */
    public int posTransType()
    {
        return posTransType;
    }

    public PositionMaintenanceReportEncoder posTransType(PosTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posTransType Value: " + value );
            }
            if (value == PosTransType.NULL_VAL)
            {
                return this;
            }
        }
        return posTransType(value.representation());
    }

    private final MutableDirectBuffer posReqID = new UnsafeBuffer();
    private byte[] posReqIDInternalBuffer = posReqID.byteArray();
    private int posReqIDOffset = 0;
    private int posReqIDLength = 0;

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqID(final DirectBuffer value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqID(final DirectBuffer value, final int length)
    {
        return posReqID(value, 0, length);
    }

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqID(final DirectBuffer value)
    {
        return posReqID(value, 0, value.capacity());
    }

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqID(final byte[] value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqIDAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder posReqID(final byte[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqID(final byte[] value)
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
    public PositionMaintenanceReportEncoder posReqID(final CharSequence value)
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
    public PositionMaintenanceReportEncoder posReqID(final AsciiSequenceView value)
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
    public PositionMaintenanceReportEncoder posReqID(final char[] value)
    {
        return posReqID(value, 0, value.length);
    }

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqID(final char[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    /* PosReqID = 710 */
    public PositionMaintenanceReportEncoder posReqID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, posReqID, offset, length))
        {
            posReqIDInternalBuffer = posReqID.byteArray();
        }
        posReqIDOffset = 0;
        posReqIDLength = length;
        return this;
    }

    private int posMaintAction;

    private boolean hasPosMaintAction;

    public boolean hasPosMaintAction()
    {
        return hasPosMaintAction;
    }

    /* PosMaintAction = 712 */
    public PositionMaintenanceReportEncoder posMaintAction(int value)
    {
        posMaintAction = value;
        hasPosMaintAction = true;
        return this;
    }

    /* PosMaintAction = 712 */
    public int posMaintAction()
    {
        return posMaintAction;
    }

    public PositionMaintenanceReportEncoder posMaintAction(PosMaintAction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosMaintAction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posMaintAction Value: " + value );
            }
            if (value == PosMaintAction.NULL_VAL)
            {
                return this;
            }
        }
        return posMaintAction(value.representation());
    }

    private final MutableDirectBuffer origPosReqRefID = new UnsafeBuffer();
    private byte[] origPosReqRefIDInternalBuffer = origPosReqRefID.byteArray();
    private int origPosReqRefIDOffset = 0;
    private int origPosReqRefIDLength = 0;

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final DirectBuffer value, final int offset, final int length)
    {
        origPosReqRefID.wrap(value);
        origPosReqRefIDOffset = offset;
        origPosReqRefIDLength = length;
        return this;
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final DirectBuffer value, final int length)
    {
        return origPosReqRefID(value, 0, length);
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final DirectBuffer value)
    {
        return origPosReqRefID(value, 0, value.capacity());
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final byte[] value, final int offset, final int length)
    {
        origPosReqRefID.wrap(value);
        origPosReqRefIDOffset = offset;
        origPosReqRefIDLength = length;
        return this;
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(origPosReqRefID, value, offset, length))
        {
            origPosReqRefIDInternalBuffer = origPosReqRefID.byteArray();
        }
        origPosReqRefIDOffset = 0;
        origPosReqRefIDLength = length;
        return this;
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final byte[] value, final int length)
    {
        return origPosReqRefID(value, 0, length);
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final byte[] value)
    {
        return origPosReqRefID(value, 0, value.length);
    }

    /* OrigPosReqRefID = 713 */
    public boolean hasOrigPosReqRefID()
    {
        return origPosReqRefIDLength > 0;
    }

    /* OrigPosReqRefID = 713 */
    public MutableDirectBuffer origPosReqRefID()
    {
        return origPosReqRefID;
    }

    /* OrigPosReqRefID = 713 */
    public String origPosReqRefIDAsString()
    {
        return origPosReqRefID.getStringWithoutLengthAscii(origPosReqRefIDOffset, origPosReqRefIDLength);
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final CharSequence value)
    {
        if (toBytes(value, origPosReqRefID))
        {
            origPosReqRefIDInternalBuffer = origPosReqRefID.byteArray();
        }
        origPosReqRefIDOffset = 0;
        origPosReqRefIDLength = value.length();
        return this;
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origPosReqRefID.wrap(buffer);
            origPosReqRefIDOffset = value.offset();
            origPosReqRefIDLength = value.length();
        }
        return this;
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final char[] value)
    {
        return origPosReqRefID(value, 0, value.length);
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final char[] value, final int length)
    {
        return origPosReqRefID(value, 0, length);
    }

    /* OrigPosReqRefID = 713 */
    public PositionMaintenanceReportEncoder origPosReqRefID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, origPosReqRefID, offset, length))
        {
            origPosReqRefIDInternalBuffer = origPosReqRefID.byteArray();
        }
        origPosReqRefIDOffset = 0;
        origPosReqRefIDLength = length;
        return this;
    }

    private int posMaintStatus;

    private boolean hasPosMaintStatus;

    public boolean hasPosMaintStatus()
    {
        return hasPosMaintStatus;
    }

    /* PosMaintStatus = 722 */
    public PositionMaintenanceReportEncoder posMaintStatus(int value)
    {
        posMaintStatus = value;
        hasPosMaintStatus = true;
        return this;
    }

    /* PosMaintStatus = 722 */
    public int posMaintStatus()
    {
        return posMaintStatus;
    }

    public PositionMaintenanceReportEncoder posMaintStatus(PosMaintStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosMaintStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posMaintStatus Value: " + value );
            }
            if (value == PosMaintStatus.NULL_VAL)
            {
                return this;
            }
        }
        return posMaintStatus(value.representation());
    }

    private int posMaintResult;

    private boolean hasPosMaintResult;

    public boolean hasPosMaintResult()
    {
        return hasPosMaintResult;
    }

    /* PosMaintResult = 723 */
    public PositionMaintenanceReportEncoder posMaintResult(int value)
    {
        posMaintResult = value;
        hasPosMaintResult = true;
        return this;
    }

    /* PosMaintResult = 723 */
    public int posMaintResult()
    {
        return posMaintResult;
    }

    public PositionMaintenanceReportEncoder posMaintResult(PosMaintResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosMaintResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posMaintResult Value: " + value );
            }
            if (value == PosMaintResult.NULL_VAL)
            {
                return this;
            }
        }
        return posMaintResult(value.representation());
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();
    private byte[] clearingBusinessDateInternalBuffer = clearingBusinessDate.byteArray();
    private int clearingBusinessDateOffset = 0;
    private int clearingBusinessDateLength = 0;

    /* ClearingBusinessDate = 715 */
    public PositionMaintenanceReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public PositionMaintenanceReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public PositionMaintenanceReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    /* ClearingBusinessDate = 715 */
    public PositionMaintenanceReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public PositionMaintenanceReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public PositionMaintenanceReportEncoder clearingBusinessDate(final byte[] value)
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
    public PositionMaintenanceReportEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    /* SettlSessID = 716 */
    public PositionMaintenanceReportEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public PositionMaintenanceReportEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    /* SettlSessID = 716 */
    public PositionMaintenanceReportEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    /* SettlSessID = 716 */
    public PositionMaintenanceReportEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public PositionMaintenanceReportEncoder settlSessID(final byte[] value)
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
    public PositionMaintenanceReportEncoder settlSessID(final CharSequence value)
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
    public PositionMaintenanceReportEncoder settlSessID(final AsciiSequenceView value)
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
    public PositionMaintenanceReportEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    /* SettlSessID = 716 */
    public PositionMaintenanceReportEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    /* SettlSessID = 716 */
    public PositionMaintenanceReportEncoder settlSessID(final char[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    /* SettlSessSubID = 717 */
    public PositionMaintenanceReportEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public PositionMaintenanceReportEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    /* SettlSessSubID = 717 */
    public PositionMaintenanceReportEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    /* SettlSessSubID = 717 */
    public PositionMaintenanceReportEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public PositionMaintenanceReportEncoder settlSessSubID(final byte[] value)
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
    public PositionMaintenanceReportEncoder settlSessSubID(final CharSequence value)
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
    public PositionMaintenanceReportEncoder settlSessSubID(final AsciiSequenceView value)
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
    public PositionMaintenanceReportEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    /* SettlSessSubID = 717 */
    public PositionMaintenanceReportEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    /* SettlSessSubID = 717 */
    public PositionMaintenanceReportEncoder settlSessSubID(final char[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public PositionMaintenanceReportEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public PositionMaintenanceReportEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    /* Account = 1 */
    public PositionMaintenanceReportEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public PositionMaintenanceReportEncoder accountAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public PositionMaintenanceReportEncoder account(final byte[] value)
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
    public PositionMaintenanceReportEncoder account(final CharSequence value)
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
    public PositionMaintenanceReportEncoder account(final AsciiSequenceView value)
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
    public PositionMaintenanceReportEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    /* Account = 1 */
    public PositionMaintenanceReportEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public PositionMaintenanceReportEncoder account(final char[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder acctIDSource(int value)
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

    public PositionMaintenanceReportEncoder acctIDSource(AcctIDSource value)
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
    public PositionMaintenanceReportEncoder accountType(int value)
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

    public PositionMaintenanceReportEncoder accountType(AccountType value)
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
    public PositionMaintenanceReportEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public PositionMaintenanceReportEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public PositionMaintenanceReportEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    /* Currency = 15 */
    public PositionMaintenanceReportEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public PositionMaintenanceReportEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public PositionMaintenanceReportEncoder currency(final byte[] value)
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
    public PositionMaintenanceReportEncoder currency(final CharSequence value)
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
    public PositionMaintenanceReportEncoder currency(final AsciiSequenceView value)
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
    public PositionMaintenanceReportEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public PositionMaintenanceReportEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public PositionMaintenanceReportEncoder currency(final char[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder noLegsGroupCounter(int value)
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
    public PositionMaintenanceReportEncoder noUnderlyingsGroupCounter(int value)
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


@Generated("uk.co.real_logic.artio")
public static class TradingSessionsGroupEncoder
{
    private TradingSessionsGroupEncoder next = null;

    public TradingSessionsGroupEncoder next()
    {
        if (next == null)
        {
            next = new TradingSessionsGroupEncoder();
        }
        return next;
    }

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value)
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
    public TradingSessionsGroupEncoder tradingSessionID(final CharSequence value)
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
    public TradingSessionsGroupEncoder tradingSessionID(final AsciiSequenceView value)
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
    public TradingSessionsGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public TradingSessionsGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value)
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
    public TradingSessionsGroupEncoder tradingSessionSubID(final CharSequence value)
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
    public TradingSessionsGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"TradingSessionsGroup\",\n");
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

    public TradingSessionsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionsGroupEncoder)encoder);
    }

    public TradingSessionsGroupEncoder copyTo(final TradingSessionsGroupEncoder encoder)
    {
        encoder.reset();
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
    private int noTradingSessionsGroupCounter;

    private boolean hasNoTradingSessionsGroupCounter;

    public boolean hasNoTradingSessionsGroupCounter()
    {
        return hasNoTradingSessionsGroupCounter;
    }

    /* NoTradingSessionsGroupCounter = 386 */
    public PositionMaintenanceReportEncoder noTradingSessionsGroupCounter(int value)
    {
        noTradingSessionsGroupCounter = value;
        hasNoTradingSessionsGroupCounter = true;
        return this;
    }

    /* NoTradingSessionsGroupCounter = 386 */
    public int noTradingSessionsGroupCounter()
    {
        return noTradingSessionsGroupCounter;
    }


    private TradingSessionsGroupEncoder tradingSessionsGroup = null;

    public TradingSessionsGroupEncoder tradingSessionsGroup(final int numberOfElements)
    {
        hasNoTradingSessionsGroupCounter = true;
        noTradingSessionsGroupCounter = numberOfElements;
        if (tradingSessionsGroup == null)
        {
            tradingSessionsGroup = new TradingSessionsGroupEncoder();
        }
        return tradingSessionsGroup;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();
    private byte[] transactTimeInternalBuffer = transactTime.byteArray();
    private int transactTimeOffset = 0;
    private int transactTimeLength = 0;

    /* TransactTime = 60 */
    public PositionMaintenanceReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public PositionMaintenanceReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public PositionMaintenanceReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public PositionMaintenanceReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public PositionMaintenanceReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public PositionMaintenanceReportEncoder transactTime(final byte[] value)
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

    private int adjustmentType;

    private boolean hasAdjustmentType;

    public boolean hasAdjustmentType()
    {
        return hasAdjustmentType;
    }

    /* AdjustmentType = 718 */
    public PositionMaintenanceReportEncoder adjustmentType(int value)
    {
        adjustmentType = value;
        hasAdjustmentType = true;
        return this;
    }

    /* AdjustmentType = 718 */
    public int adjustmentType()
    {
        return adjustmentType;
    }

    public PositionMaintenanceReportEncoder adjustmentType(AdjustmentType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AdjustmentType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: adjustmentType Value: " + value );
            }
            if (value == AdjustmentType.NULL_VAL)
            {
                return this;
            }
        }
        return adjustmentType(value.representation());
    }

    private final DecimalFloat thresholdAmount = new DecimalFloat();

    private boolean hasThresholdAmount;

    public boolean hasThresholdAmount()
    {
        return hasThresholdAmount;
    }

    /* ThresholdAmount = 834 */
    public PositionMaintenanceReportEncoder thresholdAmount(ReadOnlyDecimalFloat value)
    {
        thresholdAmount.set(value);
        hasThresholdAmount = true;
        return this;
    }

    /* ThresholdAmount = 834 */
    public PositionMaintenanceReportEncoder thresholdAmount(long value, int scale)
    {
        thresholdAmount.set(value, scale);
        hasThresholdAmount = true;
        return this;
    }

    /* ThresholdAmount = 834 */
    public DecimalFloat thresholdAmount()
    {
        return thresholdAmount;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public PositionMaintenanceReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public PositionMaintenanceReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public PositionMaintenanceReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public PositionMaintenanceReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public PositionMaintenanceReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public PositionMaintenanceReportEncoder text(final byte[] value)
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
    public PositionMaintenanceReportEncoder text(final CharSequence value)
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
    public PositionMaintenanceReportEncoder text(final AsciiSequenceView value)
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
    public PositionMaintenanceReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public PositionMaintenanceReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public PositionMaintenanceReportEncoder text(final char[] value, final int offset, final int length)
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
    public PositionMaintenanceReportEncoder encodedTextLen(int value)
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
    public PositionMaintenanceReportEncoder encodedText(byte[] value)
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
    public PositionMaintenanceReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (hasPosTransType)
        {
            buffer.putBytes(position, posTransTypeHeader, 0, posTransTypeHeaderLength);
            position += posTransTypeHeaderLength;
            position += buffer.putIntAscii(position, posTransType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosTransType");
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

        if (hasPosMaintAction)
        {
            buffer.putBytes(position, posMaintActionHeader, 0, posMaintActionHeaderLength);
            position += posMaintActionHeaderLength;
            position += buffer.putIntAscii(position, posMaintAction);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintAction");
        }

        if (origPosReqRefIDLength > 0)
        {
            buffer.putBytes(position, origPosReqRefIDHeader, 0, origPosReqRefIDHeaderLength);
            position += origPosReqRefIDHeaderLength;
            buffer.putBytes(position, origPosReqRefID, origPosReqRefIDOffset, origPosReqRefIDLength);
            position += origPosReqRefIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrigPosReqRefID");
        }

        if (hasPosMaintStatus)
        {
            buffer.putBytes(position, posMaintStatusHeader, 0, posMaintStatusHeaderLength);
            position += posMaintStatusHeaderLength;
            position += buffer.putIntAscii(position, posMaintStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintStatus");
        }

        if (hasPosMaintResult)
        {
            buffer.putBytes(position, posMaintResultHeader, 0, posMaintResultHeaderLength);
            position += posMaintResultHeaderLength;
            position += buffer.putIntAscii(position, posMaintResult);
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


        if (hasNoTradingSessionsGroupCounter)
        {
            buffer.putBytes(position, noTradingSessionsGroupCounterHeader, 0, noTradingSessionsGroupCounterHeaderLength);
            position += noTradingSessionsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTradingSessionsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionsGroup != null)
        {
            position += tradingSessionsGroup.encode(buffer, position, noTradingSessionsGroupCounter);
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

            position += positionQty.encode(buffer, position);

            position += positionAmountData.encode(buffer, position);

        if (hasAdjustmentType)
        {
            buffer.putBytes(position, adjustmentTypeHeader, 0, adjustmentTypeHeaderLength);
            position += adjustmentTypeHeaderLength;
            position += buffer.putIntAscii(position, adjustmentType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasThresholdAmount)
        {
            buffer.putBytes(position, thresholdAmountHeader, 0, thresholdAmountHeaderLength);
            position += thresholdAmountHeaderLength;
            position += buffer.putFloatAscii(position, thresholdAmount);
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
        this.resetPosTransType();
        this.resetPosReqID();
        this.resetPosMaintAction();
        this.resetOrigPosReqRefID();
        this.resetPosMaintStatus();
        this.resetPosMaintResult();
        this.resetClearingBusinessDate();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetCurrency();
        this.resetTransactTime();
        this.resetAdjustmentType();
        this.resetThresholdAmount();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        positionQty.reset();
        positionAmountData.reset();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
        this.resetTradingSessionsGroup();
    }

    public void resetPosMaintRptID()
    {
        posMaintRptIDLength = 0;
        posMaintRptID.wrap(posMaintRptIDInternalBuffer);
    }

    public void resetPosTransType()
    {
        hasPosTransType = false;
    }

    public void resetPosReqID()
    {
        posReqIDLength = 0;
        posReqID.wrap(posReqIDInternalBuffer);
    }

    public void resetPosMaintAction()
    {
        hasPosMaintAction = false;
    }

    public void resetOrigPosReqRefID()
    {
        origPosReqRefIDLength = 0;
        origPosReqRefID.wrap(origPosReqRefIDInternalBuffer);
    }

    public void resetPosMaintStatus()
    {
        hasPosMaintStatus = false;
    }

    public void resetPosMaintResult()
    {
        hasPosMaintResult = false;
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

    public void resetTransactTime()
    {
        transactTimeLength = 0;
        transactTime.wrap(transactTimeInternalBuffer);
    }

    public void resetAdjustmentType()
    {
        hasAdjustmentType = false;
    }

    public void resetThresholdAmount()
    {
        hasThresholdAmount = false;
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

    public void resetTradingSessionsGroup()
    {
        if (tradingSessionsGroup != null)
        {
            tradingSessionsGroup.reset();
        }
        noTradingSessionsGroupCounter = 0;
        hasNoTradingSessionsGroupCounter = false;
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
        builder.append("\"MessageName\": \"PositionMaintenanceReport\",\n");
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

        if (hasPosTransType())
        {
            indent(builder, level);
            builder.append("\"PosTransType\": \"");
            builder.append(posTransType);
            builder.append("\",\n");
        }

        if (hasPosReqID())
        {
            indent(builder, level);
            builder.append("\"PosReqID\": \"");
            appendBuffer(builder, posReqID, posReqIDOffset, posReqIDLength);
            builder.append("\",\n");
        }

        if (hasPosMaintAction())
        {
            indent(builder, level);
            builder.append("\"PosMaintAction\": \"");
            builder.append(posMaintAction);
            builder.append("\",\n");
        }

        if (hasOrigPosReqRefID())
        {
            indent(builder, level);
            builder.append("\"OrigPosReqRefID\": \"");
            appendBuffer(builder, origPosReqRefID, origPosReqRefIDOffset, origPosReqRefIDLength);
            builder.append("\",\n");
        }

        if (hasPosMaintStatus())
        {
            indent(builder, level);
            builder.append("\"PosMaintStatus\": \"");
            builder.append(posMaintStatus);
            builder.append("\",\n");
        }

        if (hasPosMaintResult())
        {
            indent(builder, level);
            builder.append("\"PosMaintResult\": \"");
            builder.append(posMaintResult);
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

        if (hasNoTradingSessionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradingSessionsGroup\": [\n");
            final int noTradingSessionsGroupCounter = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            for (int i = 0; i < noTradingSessionsGroupCounter; i++)
            {
                indent(builder, level);
                tradingSessionsGroup.appendTo(builder, level + 1);
                if (i < (noTradingSessionsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradingSessionsGroup = tradingSessionsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PositionQty\": ");
    positionQty.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAdjustmentType())
        {
            indent(builder, level);
            builder.append("\"AdjustmentType\": \"");
            builder.append(adjustmentType);
            builder.append("\",\n");
        }

        if (hasThresholdAmount())
        {
            indent(builder, level);
            builder.append("\"ThresholdAmount\": \"");
            thresholdAmount.appendTo(builder);
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

    public PositionMaintenanceReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PositionMaintenanceReportEncoder)encoder);
    }

    public PositionMaintenanceReportEncoder copyTo(final PositionMaintenanceReportEncoder encoder)
    {
        encoder.reset();
        if (hasPosMaintRptID())
        {
            encoder.posMaintRptIDAsCopy(posMaintRptID.byteArray(), 0, posMaintRptIDLength);
        }

        if (hasPosTransType())
        {
            encoder.posTransType(this.posTransType());
        }

        if (hasPosReqID())
        {
            encoder.posReqIDAsCopy(posReqID.byteArray(), 0, posReqIDLength);
        }

        if (hasPosMaintAction())
        {
            encoder.posMaintAction(this.posMaintAction());
        }

        if (hasOrigPosReqRefID())
        {
            encoder.origPosReqRefIDAsCopy(origPosReqRefID.byteArray(), 0, origPosReqRefIDLength);
        }

        if (hasPosMaintStatus())
        {
            encoder.posMaintStatus(this.posMaintStatus());
        }

        if (hasPosMaintResult())
        {
            encoder.posMaintResult(this.posMaintResult());
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

        if (hasNoTradingSessionsGroupCounter)
        {
            final int size = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            TradingSessionsGroupEncoder tradingSessionsGroupEncoder = encoder.tradingSessionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionsGroup != null)
                {
                    tradingSessionsGroup.copyTo(tradingSessionsGroupEncoder);
                    tradingSessionsGroup = tradingSessionsGroup.next();
                    tradingSessionsGroupEncoder = tradingSessionsGroupEncoder.next();
                }
            }
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        positionQty.copyTo(encoder.positionQty());

        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasAdjustmentType())
        {
            encoder.adjustmentType(this.adjustmentType());
        }

        if (hasThresholdAmount())
        {
            encoder.thresholdAmount(this.thresholdAmount());
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
