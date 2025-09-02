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
public class MarketDataSnapshotFullRefreshEncoder implements Encoder
{
    public long messageType()
    {
        return 87L;
    }

    public MarketDataSnapshotFullRefreshEncoder()
    {
        header.msgType("W");
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

    private static final int mDReqIDHeaderLength = 4;
    private static final byte[] mDReqIDHeader = new byte[] {50, 54, 50, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int financialStatusHeaderLength = 4;
    private static final byte[] financialStatusHeader = new byte[] {50, 57, 49, (byte) '='};

    private static final int corporateActionHeaderLength = 4;
    private static final byte[] corporateActionHeader = new byte[] {50, 57, 50, (byte) '='};

    private static final int netChgPrevDayHeaderLength = 4;
    private static final byte[] netChgPrevDayHeader = new byte[] {52, 53, 49, (byte) '='};

    private static final int noMDEntriesGroupCounterHeaderLength = 4;
    private static final byte[] noMDEntriesGroupCounterHeader = new byte[] {50, 54, 56, (byte) '='};

    private static final int applQueueDepthHeaderLength = 4;
    private static final byte[] applQueueDepthHeader = new byte[] {56, 49, 51, (byte) '='};

    private static final int applQueueResolutionHeaderLength = 4;
    private static final byte[] applQueueResolutionHeader = new byte[] {56, 49, 52, (byte) '='};

    private final MutableDirectBuffer mDReqID = new UnsafeBuffer();
    private byte[] mDReqIDInternalBuffer = mDReqID.byteArray();
    private int mDReqIDOffset = 0;
    private int mDReqIDLength = 0;

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final DirectBuffer value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final DirectBuffer value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final DirectBuffer value)
    {
        return mDReqID(value, 0, value.capacity());
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final byte[] value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDReqID, value, offset, length))
        {
            mDReqIDInternalBuffer = mDReqID.byteArray();
        }
        mDReqIDOffset = 0;
        mDReqIDLength = length;
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final byte[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final byte[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    /* MDReqID = 262 */
    public boolean hasMDReqID()
    {
        return mDReqIDLength > 0;
    }

    /* MDReqID = 262 */
    public MutableDirectBuffer mDReqID()
    {
        return mDReqID;
    }

    /* MDReqID = 262 */
    public String mDReqIDAsString()
    {
        return mDReqID.getStringWithoutLengthAscii(mDReqIDOffset, mDReqIDLength);
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final CharSequence value)
    {
        if (toBytes(value, mDReqID))
        {
            mDReqIDInternalBuffer = mDReqID.byteArray();
        }
        mDReqIDOffset = 0;
        mDReqIDLength = value.length();
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDReqID.wrap(buffer);
            mDReqIDOffset = value.offset();
            mDReqIDLength = value.length();
        }
        return this;
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final char[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final char[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    /* MDReqID = 262 */
    public MarketDataSnapshotFullRefreshEncoder mDReqID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, mDReqID, offset, length))
        {
            mDReqIDInternalBuffer = mDReqID.byteArray();
        }
        mDReqIDOffset = 0;
        mDReqIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
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
    public MarketDataSnapshotFullRefreshEncoder noUnderlyingsGroupCounter(int value)
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
    public MarketDataSnapshotFullRefreshEncoder noLegsGroupCounter(int value)
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

    private final MutableDirectBuffer financialStatus = new UnsafeBuffer();
    private byte[] financialStatusInternalBuffer = financialStatus.byteArray();
    private int financialStatusOffset = 0;
    private int financialStatusLength = 0;

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final DirectBuffer value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final DirectBuffer value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final DirectBuffer value)
    {
        return financialStatus(value, 0, value.capacity());
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final byte[] value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(financialStatus, value, offset, length))
        {
            financialStatusInternalBuffer = financialStatus.byteArray();
        }
        financialStatusOffset = 0;
        financialStatusLength = length;
        return this;
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final byte[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final byte[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    /* FinancialStatus = 291 */
    public boolean hasFinancialStatus()
    {
        return financialStatusLength > 0;
    }

    /* FinancialStatus = 291 */
    public MutableDirectBuffer financialStatus()
    {
        return financialStatus;
    }

    /* FinancialStatus = 291 */
    public String financialStatusAsString()
    {
        return financialStatus.getStringWithoutLengthAscii(financialStatusOffset, financialStatusLength);
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final CharSequence value)
    {
        if (toBytes(value, financialStatus))
        {
            financialStatusInternalBuffer = financialStatus.byteArray();
        }
        financialStatusOffset = 0;
        financialStatusLength = value.length();
        return this;
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            financialStatus.wrap(buffer);
            financialStatusOffset = value.offset();
            financialStatusLength = value.length();
        }
        return this;
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final char[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final char[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    /* FinancialStatus = 291 */
    public MarketDataSnapshotFullRefreshEncoder financialStatus(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, financialStatus, offset, length))
        {
            financialStatusInternalBuffer = financialStatus.byteArray();
        }
        financialStatusOffset = 0;
        financialStatusLength = length;
        return this;
    }

    private final MutableDirectBuffer corporateAction = new UnsafeBuffer();
    private byte[] corporateActionInternalBuffer = corporateAction.byteArray();
    private int corporateActionOffset = 0;
    private int corporateActionLength = 0;

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final DirectBuffer value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final DirectBuffer value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final DirectBuffer value)
    {
        return corporateAction(value, 0, value.capacity());
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final byte[] value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateActionAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(corporateAction, value, offset, length))
        {
            corporateActionInternalBuffer = corporateAction.byteArray();
        }
        corporateActionOffset = 0;
        corporateActionLength = length;
        return this;
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final byte[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final byte[] value)
    {
        return corporateAction(value, 0, value.length);
    }

    /* CorporateAction = 292 */
    public boolean hasCorporateAction()
    {
        return corporateActionLength > 0;
    }

    /* CorporateAction = 292 */
    public MutableDirectBuffer corporateAction()
    {
        return corporateAction;
    }

    /* CorporateAction = 292 */
    public String corporateActionAsString()
    {
        return corporateAction.getStringWithoutLengthAscii(corporateActionOffset, corporateActionLength);
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final CharSequence value)
    {
        if (toBytes(value, corporateAction))
        {
            corporateActionInternalBuffer = corporateAction.byteArray();
        }
        corporateActionOffset = 0;
        corporateActionLength = value.length();
        return this;
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            corporateAction.wrap(buffer);
            corporateActionOffset = value.offset();
            corporateActionLength = value.length();
        }
        return this;
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final char[] value)
    {
        return corporateAction(value, 0, value.length);
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final char[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    /* CorporateAction = 292 */
    public MarketDataSnapshotFullRefreshEncoder corporateAction(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, corporateAction, offset, length))
        {
            corporateActionInternalBuffer = corporateAction.byteArray();
        }
        corporateActionOffset = 0;
        corporateActionLength = length;
        return this;
    }

    private final DecimalFloat netChgPrevDay = new DecimalFloat();

    private boolean hasNetChgPrevDay;

    public boolean hasNetChgPrevDay()
    {
        return hasNetChgPrevDay;
    }

    /* NetChgPrevDay = 451 */
    public MarketDataSnapshotFullRefreshEncoder netChgPrevDay(ReadOnlyDecimalFloat value)
    {
        netChgPrevDay.set(value);
        hasNetChgPrevDay = true;
        return this;
    }

    /* NetChgPrevDay = 451 */
    public MarketDataSnapshotFullRefreshEncoder netChgPrevDay(long value, int scale)
    {
        netChgPrevDay.set(value, scale);
        hasNetChgPrevDay = true;
        return this;
    }

    /* NetChgPrevDay = 451 */
    public DecimalFloat netChgPrevDay()
    {
        return netChgPrevDay;
    }


@Generated("uk.co.real_logic.artio")
public static class MDEntriesGroupEncoder
{
    private MDEntriesGroupEncoder next = null;

    public MDEntriesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MDEntriesGroupEncoder();
        }
        return next;
    }

    private static final int mDEntryTypeHeaderLength = 4;
    private static final byte[] mDEntryTypeHeader = new byte[] {50, 54, 57, (byte) '='};

    private static final int mDEntryPxHeaderLength = 4;
    private static final byte[] mDEntryPxHeader = new byte[] {50, 55, 48, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int mDEntrySizeHeaderLength = 4;
    private static final byte[] mDEntrySizeHeader = new byte[] {50, 55, 49, (byte) '='};

    private static final int mDEntryDateHeaderLength = 4;
    private static final byte[] mDEntryDateHeader = new byte[] {50, 55, 50, (byte) '='};

    private static final int mDEntryTimeHeaderLength = 4;
    private static final byte[] mDEntryTimeHeader = new byte[] {50, 55, 51, (byte) '='};

    private static final int tickDirectionHeaderLength = 4;
    private static final byte[] tickDirectionHeader = new byte[] {50, 55, 52, (byte) '='};

    private static final int mDMktHeaderLength = 4;
    private static final byte[] mDMktHeader = new byte[] {50, 55, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int quoteConditionHeaderLength = 4;
    private static final byte[] quoteConditionHeader = new byte[] {50, 55, 54, (byte) '='};

    private static final int tradeConditionHeaderLength = 4;
    private static final byte[] tradeConditionHeader = new byte[] {50, 55, 55, (byte) '='};

    private static final int mDEntryOriginatorHeaderLength = 4;
    private static final byte[] mDEntryOriginatorHeader = new byte[] {50, 56, 50, (byte) '='};

    private static final int locationIDHeaderLength = 4;
    private static final byte[] locationIDHeader = new byte[] {50, 56, 51, (byte) '='};

    private static final int deskIDHeaderLength = 4;
    private static final byte[] deskIDHeader = new byte[] {50, 56, 52, (byte) '='};

    private static final int openCloseSettlFlagHeaderLength = 4;
    private static final byte[] openCloseSettlFlagHeader = new byte[] {50, 56, 54, (byte) '='};

    private static final int timeInForceHeaderLength = 3;
    private static final byte[] timeInForceHeader = new byte[] {53, 57, (byte) '='};

    private static final int expireDateHeaderLength = 4;
    private static final byte[] expireDateHeader = new byte[] {52, 51, 50, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int minQtyHeaderLength = 4;
    private static final byte[] minQtyHeader = new byte[] {49, 49, 48, (byte) '='};

    private static final int execInstHeaderLength = 3;
    private static final byte[] execInstHeader = new byte[] {49, 56, (byte) '='};

    private static final int sellerDaysHeaderLength = 4;
    private static final byte[] sellerDaysHeader = new byte[] {50, 56, 55, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int quoteEntryIDHeaderLength = 4;
    private static final byte[] quoteEntryIDHeader = new byte[] {50, 57, 57, (byte) '='};

    private static final int mDEntryBuyerHeaderLength = 4;
    private static final byte[] mDEntryBuyerHeader = new byte[] {50, 56, 56, (byte) '='};

    private static final int mDEntrySellerHeaderLength = 4;
    private static final byte[] mDEntrySellerHeader = new byte[] {50, 56, 57, (byte) '='};

    private static final int numberOfOrdersHeaderLength = 4;
    private static final byte[] numberOfOrdersHeader = new byte[] {51, 52, 54, (byte) '='};

    private static final int mDEntryPositionNoHeaderLength = 4;
    private static final byte[] mDEntryPositionNoHeader = new byte[] {50, 57, 48, (byte) '='};

    private static final int scopeHeaderLength = 4;
    private static final byte[] scopeHeader = new byte[] {53, 52, 54, (byte) '='};

    private static final int priceDeltaHeaderLength = 4;
    private static final byte[] priceDeltaHeader = new byte[] {56, 49, 49, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private char mDEntryType;

    private boolean hasMDEntryType;

    public boolean hasMDEntryType()
    {
        return hasMDEntryType;
    }

    /* MDEntryType = 269 */
    public MDEntriesGroupEncoder mDEntryType(char value)
    {
        mDEntryType = value;
        hasMDEntryType = true;
        return this;
    }

    /* MDEntryType = 269 */
    public char mDEntryType()
    {
        return mDEntryType;
    }

    public MDEntriesGroupEncoder mDEntryType(MDEntryType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDEntryType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDEntryType Value: " + value );
            }
            if (value == MDEntryType.NULL_VAL)
            {
                return this;
            }
        }
        return mDEntryType(value.representation());
    }

    private final DecimalFloat mDEntryPx = new DecimalFloat();

    private boolean hasMDEntryPx;

    public boolean hasMDEntryPx()
    {
        return hasMDEntryPx;
    }

    /* MDEntryPx = 270 */
    public MDEntriesGroupEncoder mDEntryPx(ReadOnlyDecimalFloat value)
    {
        mDEntryPx.set(value);
        hasMDEntryPx = true;
        return this;
    }

    /* MDEntryPx = 270 */
    public MDEntriesGroupEncoder mDEntryPx(long value, int scale)
    {
        mDEntryPx.set(value, scale);
        hasMDEntryPx = true;
        return this;
    }

    /* MDEntryPx = 270 */
    public DecimalFloat mDEntryPx()
    {
        return mDEntryPx;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();
    private byte[] currencyInternalBuffer = currency.byteArray();
    private int currencyOffset = 0;
    private int currencyLength = 0;

    /* Currency = 15 */
    public MDEntriesGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public MDEntriesGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public MDEntriesGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    /* Currency = 15 */
    public MDEntriesGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public MDEntriesGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
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
    public MDEntriesGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public MDEntriesGroupEncoder currency(final byte[] value)
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
    public MDEntriesGroupEncoder currency(final CharSequence value)
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
    public MDEntriesGroupEncoder currency(final AsciiSequenceView value)
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
    public MDEntriesGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public MDEntriesGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public MDEntriesGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, currency, offset, length))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final DecimalFloat mDEntrySize = new DecimalFloat();

    private boolean hasMDEntrySize;

    public boolean hasMDEntrySize()
    {
        return hasMDEntrySize;
    }

    /* MDEntrySize = 271 */
    public MDEntriesGroupEncoder mDEntrySize(ReadOnlyDecimalFloat value)
    {
        mDEntrySize.set(value);
        hasMDEntrySize = true;
        return this;
    }

    /* MDEntrySize = 271 */
    public MDEntriesGroupEncoder mDEntrySize(long value, int scale)
    {
        mDEntrySize.set(value, scale);
        hasMDEntrySize = true;
        return this;
    }

    /* MDEntrySize = 271 */
    public DecimalFloat mDEntrySize()
    {
        return mDEntrySize;
    }

    private final MutableDirectBuffer mDEntryDate = new UnsafeBuffer();
    private byte[] mDEntryDateInternalBuffer = mDEntryDate.byteArray();
    private int mDEntryDateOffset = 0;
    private int mDEntryDateLength = 0;

    /* MDEntryDate = 272 */
    public MDEntriesGroupEncoder mDEntryDate(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryDate.wrap(value);
        mDEntryDateOffset = offset;
        mDEntryDateLength = length;
        return this;
    }

    /* MDEntryDate = 272 */
    public MDEntriesGroupEncoder mDEntryDate(final DirectBuffer value, final int length)
    {
        return mDEntryDate(value, 0, length);
    }

    /* MDEntryDate = 272 */
    public MDEntriesGroupEncoder mDEntryDate(final DirectBuffer value)
    {
        return mDEntryDate(value, 0, value.capacity());
    }

    /* MDEntryDate = 272 */
    public MDEntriesGroupEncoder mDEntryDate(final byte[] value, final int offset, final int length)
    {
        mDEntryDate.wrap(value);
        mDEntryDateOffset = offset;
        mDEntryDateLength = length;
        return this;
    }

    /* MDEntryDate = 272 */
    public MDEntriesGroupEncoder mDEntryDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDEntryDate, value, offset, length))
        {
            mDEntryDateInternalBuffer = mDEntryDate.byteArray();
        }
        mDEntryDateOffset = 0;
        mDEntryDateLength = length;
        return this;
    }

    /* MDEntryDate = 272 */
    public MDEntriesGroupEncoder mDEntryDate(final byte[] value, final int length)
    {
        return mDEntryDate(value, 0, length);
    }

    /* MDEntryDate = 272 */
    public MDEntriesGroupEncoder mDEntryDate(final byte[] value)
    {
        return mDEntryDate(value, 0, value.length);
    }

    /* MDEntryDate = 272 */
    public boolean hasMDEntryDate()
    {
        return mDEntryDateLength > 0;
    }

    /* MDEntryDate = 272 */
    public MutableDirectBuffer mDEntryDate()
    {
        return mDEntryDate;
    }

    /* MDEntryDate = 272 */
    public String mDEntryDateAsString()
    {
        return mDEntryDate.getStringWithoutLengthAscii(mDEntryDateOffset, mDEntryDateLength);
    }

    private final MutableDirectBuffer mDEntryTime = new UnsafeBuffer();
    private byte[] mDEntryTimeInternalBuffer = mDEntryTime.byteArray();
    private int mDEntryTimeOffset = 0;
    private int mDEntryTimeLength = 0;

    /* MDEntryTime = 273 */
    public MDEntriesGroupEncoder mDEntryTime(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryTime.wrap(value);
        mDEntryTimeOffset = offset;
        mDEntryTimeLength = length;
        return this;
    }

    /* MDEntryTime = 273 */
    public MDEntriesGroupEncoder mDEntryTime(final DirectBuffer value, final int length)
    {
        return mDEntryTime(value, 0, length);
    }

    /* MDEntryTime = 273 */
    public MDEntriesGroupEncoder mDEntryTime(final DirectBuffer value)
    {
        return mDEntryTime(value, 0, value.capacity());
    }

    /* MDEntryTime = 273 */
    public MDEntriesGroupEncoder mDEntryTime(final byte[] value, final int offset, final int length)
    {
        mDEntryTime.wrap(value);
        mDEntryTimeOffset = offset;
        mDEntryTimeLength = length;
        return this;
    }

    /* MDEntryTime = 273 */
    public MDEntriesGroupEncoder mDEntryTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDEntryTime, value, offset, length))
        {
            mDEntryTimeInternalBuffer = mDEntryTime.byteArray();
        }
        mDEntryTimeOffset = 0;
        mDEntryTimeLength = length;
        return this;
    }

    /* MDEntryTime = 273 */
    public MDEntriesGroupEncoder mDEntryTime(final byte[] value, final int length)
    {
        return mDEntryTime(value, 0, length);
    }

    /* MDEntryTime = 273 */
    public MDEntriesGroupEncoder mDEntryTime(final byte[] value)
    {
        return mDEntryTime(value, 0, value.length);
    }

    /* MDEntryTime = 273 */
    public boolean hasMDEntryTime()
    {
        return mDEntryTimeLength > 0;
    }

    /* MDEntryTime = 273 */
    public MutableDirectBuffer mDEntryTime()
    {
        return mDEntryTime;
    }

    /* MDEntryTime = 273 */
    public String mDEntryTimeAsString()
    {
        return mDEntryTime.getStringWithoutLengthAscii(mDEntryTimeOffset, mDEntryTimeLength);
    }

    private char tickDirection;

    private boolean hasTickDirection;

    public boolean hasTickDirection()
    {
        return hasTickDirection;
    }

    /* TickDirection = 274 */
    public MDEntriesGroupEncoder tickDirection(char value)
    {
        tickDirection = value;
        hasTickDirection = true;
        return this;
    }

    /* TickDirection = 274 */
    public char tickDirection()
    {
        return tickDirection;
    }

    public MDEntriesGroupEncoder tickDirection(TickDirection value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TickDirection.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tickDirection Value: " + value );
            }
            if (value == TickDirection.NULL_VAL)
            {
                return this;
            }
        }
        return tickDirection(value.representation());
    }

    private final MutableDirectBuffer mDMkt = new UnsafeBuffer();
    private byte[] mDMktInternalBuffer = mDMkt.byteArray();
    private int mDMktOffset = 0;
    private int mDMktLength = 0;

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final DirectBuffer value, final int offset, final int length)
    {
        mDMkt.wrap(value);
        mDMktOffset = offset;
        mDMktLength = length;
        return this;
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final DirectBuffer value, final int length)
    {
        return mDMkt(value, 0, length);
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final DirectBuffer value)
    {
        return mDMkt(value, 0, value.capacity());
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final byte[] value, final int offset, final int length)
    {
        mDMkt.wrap(value);
        mDMktOffset = offset;
        mDMktLength = length;
        return this;
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMktAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDMkt, value, offset, length))
        {
            mDMktInternalBuffer = mDMkt.byteArray();
        }
        mDMktOffset = 0;
        mDMktLength = length;
        return this;
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final byte[] value, final int length)
    {
        return mDMkt(value, 0, length);
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final byte[] value)
    {
        return mDMkt(value, 0, value.length);
    }

    /* MDMkt = 275 */
    public boolean hasMDMkt()
    {
        return mDMktLength > 0;
    }

    /* MDMkt = 275 */
    public MutableDirectBuffer mDMkt()
    {
        return mDMkt;
    }

    /* MDMkt = 275 */
    public String mDMktAsString()
    {
        return mDMkt.getStringWithoutLengthAscii(mDMktOffset, mDMktLength);
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final CharSequence value)
    {
        if (toBytes(value, mDMkt))
        {
            mDMktInternalBuffer = mDMkt.byteArray();
        }
        mDMktOffset = 0;
        mDMktLength = value.length();
        return this;
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDMkt.wrap(buffer);
            mDMktOffset = value.offset();
            mDMktLength = value.length();
        }
        return this;
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final char[] value)
    {
        return mDMkt(value, 0, value.length);
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final char[] value, final int length)
    {
        return mDMkt(value, 0, length);
    }

    /* MDMkt = 275 */
    public MDEntriesGroupEncoder mDMkt(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, mDMkt, offset, length))
        {
            mDMktInternalBuffer = mDMkt.byteArray();
        }
        mDMktOffset = 0;
        mDMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public MDEntriesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionID(final byte[] value)
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
    public MDEntriesGroupEncoder tradingSessionID(final CharSequence value)
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
    public MDEntriesGroupEncoder tradingSessionID(final AsciiSequenceView value)
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
    public MDEntriesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public MDEntriesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public MDEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public MDEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public MDEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public MDEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public MDEntriesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public MDEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public MDEntriesGroupEncoder tradingSessionSubID(final byte[] value)
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
    public MDEntriesGroupEncoder tradingSessionSubID(final CharSequence value)
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
    public MDEntriesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public MDEntriesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public MDEntriesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public MDEntriesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteCondition = new UnsafeBuffer();
    private byte[] quoteConditionInternalBuffer = quoteCondition.byteArray();
    private int quoteConditionOffset = 0;
    private int quoteConditionLength = 0;

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final DirectBuffer value, final int offset, final int length)
    {
        quoteCondition.wrap(value);
        quoteConditionOffset = offset;
        quoteConditionLength = length;
        return this;
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final DirectBuffer value, final int length)
    {
        return quoteCondition(value, 0, length);
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final DirectBuffer value)
    {
        return quoteCondition(value, 0, value.capacity());
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final byte[] value, final int offset, final int length)
    {
        quoteCondition.wrap(value);
        quoteConditionOffset = offset;
        quoteConditionLength = length;
        return this;
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteConditionAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(quoteCondition, value, offset, length))
        {
            quoteConditionInternalBuffer = quoteCondition.byteArray();
        }
        quoteConditionOffset = 0;
        quoteConditionLength = length;
        return this;
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final byte[] value, final int length)
    {
        return quoteCondition(value, 0, length);
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final byte[] value)
    {
        return quoteCondition(value, 0, value.length);
    }

    /* QuoteCondition = 276 */
    public boolean hasQuoteCondition()
    {
        return quoteConditionLength > 0;
    }

    /* QuoteCondition = 276 */
    public MutableDirectBuffer quoteCondition()
    {
        return quoteCondition;
    }

    /* QuoteCondition = 276 */
    public String quoteConditionAsString()
    {
        return quoteCondition.getStringWithoutLengthAscii(quoteConditionOffset, quoteConditionLength);
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final CharSequence value)
    {
        if (toBytes(value, quoteCondition))
        {
            quoteConditionInternalBuffer = quoteCondition.byteArray();
        }
        quoteConditionOffset = 0;
        quoteConditionLength = value.length();
        return this;
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteCondition.wrap(buffer);
            quoteConditionOffset = value.offset();
            quoteConditionLength = value.length();
        }
        return this;
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final char[] value)
    {
        return quoteCondition(value, 0, value.length);
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final char[] value, final int length)
    {
        return quoteCondition(value, 0, length);
    }

    /* QuoteCondition = 276 */
    public MDEntriesGroupEncoder quoteCondition(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, quoteCondition, offset, length))
        {
            quoteConditionInternalBuffer = quoteCondition.byteArray();
        }
        quoteConditionOffset = 0;
        quoteConditionLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeCondition = new UnsafeBuffer();
    private byte[] tradeConditionInternalBuffer = tradeCondition.byteArray();
    private int tradeConditionOffset = 0;
    private int tradeConditionLength = 0;

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final DirectBuffer value, final int offset, final int length)
    {
        tradeCondition.wrap(value);
        tradeConditionOffset = offset;
        tradeConditionLength = length;
        return this;
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final DirectBuffer value, final int length)
    {
        return tradeCondition(value, 0, length);
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final DirectBuffer value)
    {
        return tradeCondition(value, 0, value.capacity());
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final byte[] value, final int offset, final int length)
    {
        tradeCondition.wrap(value);
        tradeConditionOffset = offset;
        tradeConditionLength = length;
        return this;
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeConditionAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeCondition, value, offset, length))
        {
            tradeConditionInternalBuffer = tradeCondition.byteArray();
        }
        tradeConditionOffset = 0;
        tradeConditionLength = length;
        return this;
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final byte[] value, final int length)
    {
        return tradeCondition(value, 0, length);
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final byte[] value)
    {
        return tradeCondition(value, 0, value.length);
    }

    /* TradeCondition = 277 */
    public boolean hasTradeCondition()
    {
        return tradeConditionLength > 0;
    }

    /* TradeCondition = 277 */
    public MutableDirectBuffer tradeCondition()
    {
        return tradeCondition;
    }

    /* TradeCondition = 277 */
    public String tradeConditionAsString()
    {
        return tradeCondition.getStringWithoutLengthAscii(tradeConditionOffset, tradeConditionLength);
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final CharSequence value)
    {
        if (toBytes(value, tradeCondition))
        {
            tradeConditionInternalBuffer = tradeCondition.byteArray();
        }
        tradeConditionOffset = 0;
        tradeConditionLength = value.length();
        return this;
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeCondition.wrap(buffer);
            tradeConditionOffset = value.offset();
            tradeConditionLength = value.length();
        }
        return this;
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final char[] value)
    {
        return tradeCondition(value, 0, value.length);
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final char[] value, final int length)
    {
        return tradeCondition(value, 0, length);
    }

    /* TradeCondition = 277 */
    public MDEntriesGroupEncoder tradeCondition(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeCondition, offset, length))
        {
            tradeConditionInternalBuffer = tradeCondition.byteArray();
        }
        tradeConditionOffset = 0;
        tradeConditionLength = length;
        return this;
    }

    private final MutableDirectBuffer mDEntryOriginator = new UnsafeBuffer();
    private byte[] mDEntryOriginatorInternalBuffer = mDEntryOriginator.byteArray();
    private int mDEntryOriginatorOffset = 0;
    private int mDEntryOriginatorLength = 0;

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryOriginator.wrap(value);
        mDEntryOriginatorOffset = offset;
        mDEntryOriginatorLength = length;
        return this;
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final DirectBuffer value, final int length)
    {
        return mDEntryOriginator(value, 0, length);
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final DirectBuffer value)
    {
        return mDEntryOriginator(value, 0, value.capacity());
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final byte[] value, final int offset, final int length)
    {
        mDEntryOriginator.wrap(value);
        mDEntryOriginatorOffset = offset;
        mDEntryOriginatorLength = length;
        return this;
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginatorAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDEntryOriginator, value, offset, length))
        {
            mDEntryOriginatorInternalBuffer = mDEntryOriginator.byteArray();
        }
        mDEntryOriginatorOffset = 0;
        mDEntryOriginatorLength = length;
        return this;
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final byte[] value, final int length)
    {
        return mDEntryOriginator(value, 0, length);
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final byte[] value)
    {
        return mDEntryOriginator(value, 0, value.length);
    }

    /* MDEntryOriginator = 282 */
    public boolean hasMDEntryOriginator()
    {
        return mDEntryOriginatorLength > 0;
    }

    /* MDEntryOriginator = 282 */
    public MutableDirectBuffer mDEntryOriginator()
    {
        return mDEntryOriginator;
    }

    /* MDEntryOriginator = 282 */
    public String mDEntryOriginatorAsString()
    {
        return mDEntryOriginator.getStringWithoutLengthAscii(mDEntryOriginatorOffset, mDEntryOriginatorLength);
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final CharSequence value)
    {
        if (toBytes(value, mDEntryOriginator))
        {
            mDEntryOriginatorInternalBuffer = mDEntryOriginator.byteArray();
        }
        mDEntryOriginatorOffset = 0;
        mDEntryOriginatorLength = value.length();
        return this;
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntryOriginator.wrap(buffer);
            mDEntryOriginatorOffset = value.offset();
            mDEntryOriginatorLength = value.length();
        }
        return this;
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final char[] value)
    {
        return mDEntryOriginator(value, 0, value.length);
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final char[] value, final int length)
    {
        return mDEntryOriginator(value, 0, length);
    }

    /* MDEntryOriginator = 282 */
    public MDEntriesGroupEncoder mDEntryOriginator(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, mDEntryOriginator, offset, length))
        {
            mDEntryOriginatorInternalBuffer = mDEntryOriginator.byteArray();
        }
        mDEntryOriginatorOffset = 0;
        mDEntryOriginatorLength = length;
        return this;
    }

    private final MutableDirectBuffer locationID = new UnsafeBuffer();
    private byte[] locationIDInternalBuffer = locationID.byteArray();
    private int locationIDOffset = 0;
    private int locationIDLength = 0;

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final DirectBuffer value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final DirectBuffer value, final int length)
    {
        return locationID(value, 0, length);
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final DirectBuffer value)
    {
        return locationID(value, 0, value.capacity());
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final byte[] value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(locationID, value, offset, length))
        {
            locationIDInternalBuffer = locationID.byteArray();
        }
        locationIDOffset = 0;
        locationIDLength = length;
        return this;
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final byte[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final byte[] value)
    {
        return locationID(value, 0, value.length);
    }

    /* LocationID = 283 */
    public boolean hasLocationID()
    {
        return locationIDLength > 0;
    }

    /* LocationID = 283 */
    public MutableDirectBuffer locationID()
    {
        return locationID;
    }

    /* LocationID = 283 */
    public String locationIDAsString()
    {
        return locationID.getStringWithoutLengthAscii(locationIDOffset, locationIDLength);
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final CharSequence value)
    {
        if (toBytes(value, locationID))
        {
            locationIDInternalBuffer = locationID.byteArray();
        }
        locationIDOffset = 0;
        locationIDLength = value.length();
        return this;
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            locationID.wrap(buffer);
            locationIDOffset = value.offset();
            locationIDLength = value.length();
        }
        return this;
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final char[] value)
    {
        return locationID(value, 0, value.length);
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final char[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    /* LocationID = 283 */
    public MDEntriesGroupEncoder locationID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, locationID, offset, length))
        {
            locationIDInternalBuffer = locationID.byteArray();
        }
        locationIDOffset = 0;
        locationIDLength = length;
        return this;
    }

    private final MutableDirectBuffer deskID = new UnsafeBuffer();
    private byte[] deskIDInternalBuffer = deskID.byteArray();
    private int deskIDOffset = 0;
    private int deskIDLength = 0;

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final DirectBuffer value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final DirectBuffer value, final int length)
    {
        return deskID(value, 0, length);
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final DirectBuffer value)
    {
        return deskID(value, 0, value.capacity());
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final byte[] value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(deskID, value, offset, length))
        {
            deskIDInternalBuffer = deskID.byteArray();
        }
        deskIDOffset = 0;
        deskIDLength = length;
        return this;
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final byte[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final byte[] value)
    {
        return deskID(value, 0, value.length);
    }

    /* DeskID = 284 */
    public boolean hasDeskID()
    {
        return deskIDLength > 0;
    }

    /* DeskID = 284 */
    public MutableDirectBuffer deskID()
    {
        return deskID;
    }

    /* DeskID = 284 */
    public String deskIDAsString()
    {
        return deskID.getStringWithoutLengthAscii(deskIDOffset, deskIDLength);
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final CharSequence value)
    {
        if (toBytes(value, deskID))
        {
            deskIDInternalBuffer = deskID.byteArray();
        }
        deskIDOffset = 0;
        deskIDLength = value.length();
        return this;
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            deskID.wrap(buffer);
            deskIDOffset = value.offset();
            deskIDLength = value.length();
        }
        return this;
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final char[] value)
    {
        return deskID(value, 0, value.length);
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final char[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    /* DeskID = 284 */
    public MDEntriesGroupEncoder deskID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, deskID, offset, length))
        {
            deskIDInternalBuffer = deskID.byteArray();
        }
        deskIDOffset = 0;
        deskIDLength = length;
        return this;
    }

    private final MutableDirectBuffer openCloseSettlFlag = new UnsafeBuffer();
    private byte[] openCloseSettlFlagInternalBuffer = openCloseSettlFlag.byteArray();
    private int openCloseSettlFlagOffset = 0;
    private int openCloseSettlFlagLength = 0;

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final DirectBuffer value, final int offset, final int length)
    {
        openCloseSettlFlag.wrap(value);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final DirectBuffer value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final DirectBuffer value)
    {
        return openCloseSettlFlag(value, 0, value.capacity());
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final byte[] value, final int offset, final int length)
    {
        openCloseSettlFlag.wrap(value);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlagAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(openCloseSettlFlag, value, offset, length))
        {
            openCloseSettlFlagInternalBuffer = openCloseSettlFlag.byteArray();
        }
        openCloseSettlFlagOffset = 0;
        openCloseSettlFlagLength = length;
        return this;
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final byte[] value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final byte[] value)
    {
        return openCloseSettlFlag(value, 0, value.length);
    }

    /* OpenCloseSettlFlag = 286 */
    public boolean hasOpenCloseSettlFlag()
    {
        return openCloseSettlFlagLength > 0;
    }

    /* OpenCloseSettlFlag = 286 */
    public MutableDirectBuffer openCloseSettlFlag()
    {
        return openCloseSettlFlag;
    }

    /* OpenCloseSettlFlag = 286 */
    public String openCloseSettlFlagAsString()
    {
        return openCloseSettlFlag.getStringWithoutLengthAscii(openCloseSettlFlagOffset, openCloseSettlFlagLength);
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final CharSequence value)
    {
        if (toBytes(value, openCloseSettlFlag))
        {
            openCloseSettlFlagInternalBuffer = openCloseSettlFlag.byteArray();
        }
        openCloseSettlFlagOffset = 0;
        openCloseSettlFlagLength = value.length();
        return this;
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            openCloseSettlFlag.wrap(buffer);
            openCloseSettlFlagOffset = value.offset();
            openCloseSettlFlagLength = value.length();
        }
        return this;
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final char[] value)
    {
        return openCloseSettlFlag(value, 0, value.length);
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final char[] value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    /* OpenCloseSettlFlag = 286 */
    public MDEntriesGroupEncoder openCloseSettlFlag(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, openCloseSettlFlag, offset, length))
        {
            openCloseSettlFlagInternalBuffer = openCloseSettlFlag.byteArray();
        }
        openCloseSettlFlagOffset = 0;
        openCloseSettlFlagLength = length;
        return this;
    }

    private char timeInForce;

    private boolean hasTimeInForce;

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }

    /* TimeInForce = 59 */
    public MDEntriesGroupEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    /* TimeInForce = 59 */
    public char timeInForce()
    {
        return timeInForce;
    }

    public MDEntriesGroupEncoder timeInForce(TimeInForce value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TimeInForce.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: timeInForce Value: " + value );
            }
            if (value == TimeInForce.NULL_VAL)
            {
                return this;
            }
        }
        return timeInForce(value.representation());
    }

    private final MutableDirectBuffer expireDate = new UnsafeBuffer();
    private byte[] expireDateInternalBuffer = expireDate.byteArray();
    private int expireDateOffset = 0;
    private int expireDateLength = 0;

    /* ExpireDate = 432 */
    public MDEntriesGroupEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    /* ExpireDate = 432 */
    public MDEntriesGroupEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    /* ExpireDate = 432 */
    public MDEntriesGroupEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    /* ExpireDate = 432 */
    public MDEntriesGroupEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    /* ExpireDate = 432 */
    public MDEntriesGroupEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(expireDate, value, offset, length))
        {
            expireDateInternalBuffer = expireDate.byteArray();
        }
        expireDateOffset = 0;
        expireDateLength = length;
        return this;
    }

    /* ExpireDate = 432 */
    public MDEntriesGroupEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    /* ExpireDate = 432 */
    public MDEntriesGroupEncoder expireDate(final byte[] value)
    {
        return expireDate(value, 0, value.length);
    }

    /* ExpireDate = 432 */
    public boolean hasExpireDate()
    {
        return expireDateLength > 0;
    }

    /* ExpireDate = 432 */
    public MutableDirectBuffer expireDate()
    {
        return expireDate;
    }

    /* ExpireDate = 432 */
    public String expireDateAsString()
    {
        return expireDate.getStringWithoutLengthAscii(expireDateOffset, expireDateLength);
    }

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();
    private byte[] expireTimeInternalBuffer = expireTime.byteArray();
    private int expireTimeOffset = 0;
    private int expireTimeLength = 0;

    /* ExpireTime = 126 */
    public MDEntriesGroupEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    /* ExpireTime = 126 */
    public MDEntriesGroupEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    /* ExpireTime = 126 */
    public MDEntriesGroupEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    /* ExpireTime = 126 */
    public MDEntriesGroupEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    /* ExpireTime = 126 */
    public MDEntriesGroupEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(expireTime, value, offset, length))
        {
            expireTimeInternalBuffer = expireTime.byteArray();
        }
        expireTimeOffset = 0;
        expireTimeLength = length;
        return this;
    }

    /* ExpireTime = 126 */
    public MDEntriesGroupEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    /* ExpireTime = 126 */
    public MDEntriesGroupEncoder expireTime(final byte[] value)
    {
        return expireTime(value, 0, value.length);
    }

    /* ExpireTime = 126 */
    public boolean hasExpireTime()
    {
        return expireTimeLength > 0;
    }

    /* ExpireTime = 126 */
    public MutableDirectBuffer expireTime()
    {
        return expireTime;
    }

    /* ExpireTime = 126 */
    public String expireTimeAsString()
    {
        return expireTime.getStringWithoutLengthAscii(expireTimeOffset, expireTimeLength);
    }

    private final DecimalFloat minQty = new DecimalFloat();

    private boolean hasMinQty;

    public boolean hasMinQty()
    {
        return hasMinQty;
    }

    /* MinQty = 110 */
    public MDEntriesGroupEncoder minQty(ReadOnlyDecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    /* MinQty = 110 */
    public MDEntriesGroupEncoder minQty(long value, int scale)
    {
        minQty.set(value, scale);
        hasMinQty = true;
        return this;
    }

    /* MinQty = 110 */
    public DecimalFloat minQty()
    {
        return minQty;
    }

    private final MutableDirectBuffer execInst = new UnsafeBuffer();
    private byte[] execInstInternalBuffer = execInst.byteArray();
    private int execInstOffset = 0;
    private int execInstLength = 0;

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(execInst, value, offset, length))
        {
            execInstInternalBuffer = execInst.byteArray();
        }
        execInstOffset = 0;
        execInstLength = length;
        return this;
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final byte[] value)
    {
        return execInst(value, 0, value.length);
    }

    /* ExecInst = 18 */
    public boolean hasExecInst()
    {
        return execInstLength > 0;
    }

    /* ExecInst = 18 */
    public MutableDirectBuffer execInst()
    {
        return execInst;
    }

    /* ExecInst = 18 */
    public String execInstAsString()
    {
        return execInst.getStringWithoutLengthAscii(execInstOffset, execInstLength);
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final CharSequence value)
    {
        if (toBytes(value, execInst))
        {
            execInstInternalBuffer = execInst.byteArray();
        }
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execInst.wrap(buffer);
            execInstOffset = value.offset();
            execInstLength = value.length();
        }
        return this;
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    /* ExecInst = 18 */
    public MDEntriesGroupEncoder execInst(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, execInst, offset, length))
        {
            execInstInternalBuffer = execInst.byteArray();
        }
        execInstOffset = 0;
        execInstLength = length;
        return this;
    }

    private int sellerDays;

    private boolean hasSellerDays;

    public boolean hasSellerDays()
    {
        return hasSellerDays;
    }

    /* SellerDays = 287 */
    public MDEntriesGroupEncoder sellerDays(int value)
    {
        sellerDays = value;
        hasSellerDays = true;
        return this;
    }

    /* SellerDays = 287 */
    public int sellerDays()
    {
        return sellerDays;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();
    private byte[] orderIDInternalBuffer = orderID.byteArray();
    private int orderIDOffset = 0;
    private int orderIDLength = 0;

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
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
    public MDEntriesGroupEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderID(final byte[] value)
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
    public MDEntriesGroupEncoder orderID(final CharSequence value)
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
    public MDEntriesGroupEncoder orderID(final AsciiSequenceView value)
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
    public MDEntriesGroupEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public MDEntriesGroupEncoder orderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, orderID, offset, length))
        {
            orderIDInternalBuffer = orderID.byteArray();
        }
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteEntryID = new UnsafeBuffer();
    private byte[] quoteEntryIDInternalBuffer = quoteEntryID.byteArray();
    private int quoteEntryIDOffset = 0;
    private int quoteEntryIDLength = 0;

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final DirectBuffer value)
    {
        return quoteEntryID(value, 0, value.capacity());
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final byte[] value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(quoteEntryID, value, offset, length))
        {
            quoteEntryIDInternalBuffer = quoteEntryID.byteArray();
        }
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = length;
        return this;
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final byte[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final byte[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    /* QuoteEntryID = 299 */
    public boolean hasQuoteEntryID()
    {
        return quoteEntryIDLength > 0;
    }

    /* QuoteEntryID = 299 */
    public MutableDirectBuffer quoteEntryID()
    {
        return quoteEntryID;
    }

    /* QuoteEntryID = 299 */
    public String quoteEntryIDAsString()
    {
        return quoteEntryID.getStringWithoutLengthAscii(quoteEntryIDOffset, quoteEntryIDLength);
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final CharSequence value)
    {
        if (toBytes(value, quoteEntryID))
        {
            quoteEntryIDInternalBuffer = quoteEntryID.byteArray();
        }
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = value.length();
        return this;
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteEntryID.wrap(buffer);
            quoteEntryIDOffset = value.offset();
            quoteEntryIDLength = value.length();
        }
        return this;
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final char[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final char[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    /* QuoteEntryID = 299 */
    public MDEntriesGroupEncoder quoteEntryID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, quoteEntryID, offset, length))
        {
            quoteEntryIDInternalBuffer = quoteEntryID.byteArray();
        }
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = length;
        return this;
    }

    private final MutableDirectBuffer mDEntryBuyer = new UnsafeBuffer();
    private byte[] mDEntryBuyerInternalBuffer = mDEntryBuyer.byteArray();
    private int mDEntryBuyerOffset = 0;
    private int mDEntryBuyerLength = 0;

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryBuyer.wrap(value);
        mDEntryBuyerOffset = offset;
        mDEntryBuyerLength = length;
        return this;
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final DirectBuffer value, final int length)
    {
        return mDEntryBuyer(value, 0, length);
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final DirectBuffer value)
    {
        return mDEntryBuyer(value, 0, value.capacity());
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final byte[] value, final int offset, final int length)
    {
        mDEntryBuyer.wrap(value);
        mDEntryBuyerOffset = offset;
        mDEntryBuyerLength = length;
        return this;
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyerAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDEntryBuyer, value, offset, length))
        {
            mDEntryBuyerInternalBuffer = mDEntryBuyer.byteArray();
        }
        mDEntryBuyerOffset = 0;
        mDEntryBuyerLength = length;
        return this;
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final byte[] value, final int length)
    {
        return mDEntryBuyer(value, 0, length);
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final byte[] value)
    {
        return mDEntryBuyer(value, 0, value.length);
    }

    /* MDEntryBuyer = 288 */
    public boolean hasMDEntryBuyer()
    {
        return mDEntryBuyerLength > 0;
    }

    /* MDEntryBuyer = 288 */
    public MutableDirectBuffer mDEntryBuyer()
    {
        return mDEntryBuyer;
    }

    /* MDEntryBuyer = 288 */
    public String mDEntryBuyerAsString()
    {
        return mDEntryBuyer.getStringWithoutLengthAscii(mDEntryBuyerOffset, mDEntryBuyerLength);
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final CharSequence value)
    {
        if (toBytes(value, mDEntryBuyer))
        {
            mDEntryBuyerInternalBuffer = mDEntryBuyer.byteArray();
        }
        mDEntryBuyerOffset = 0;
        mDEntryBuyerLength = value.length();
        return this;
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntryBuyer.wrap(buffer);
            mDEntryBuyerOffset = value.offset();
            mDEntryBuyerLength = value.length();
        }
        return this;
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final char[] value)
    {
        return mDEntryBuyer(value, 0, value.length);
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final char[] value, final int length)
    {
        return mDEntryBuyer(value, 0, length);
    }

    /* MDEntryBuyer = 288 */
    public MDEntriesGroupEncoder mDEntryBuyer(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, mDEntryBuyer, offset, length))
        {
            mDEntryBuyerInternalBuffer = mDEntryBuyer.byteArray();
        }
        mDEntryBuyerOffset = 0;
        mDEntryBuyerLength = length;
        return this;
    }

    private final MutableDirectBuffer mDEntrySeller = new UnsafeBuffer();
    private byte[] mDEntrySellerInternalBuffer = mDEntrySeller.byteArray();
    private int mDEntrySellerOffset = 0;
    private int mDEntrySellerLength = 0;

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final DirectBuffer value, final int offset, final int length)
    {
        mDEntrySeller.wrap(value);
        mDEntrySellerOffset = offset;
        mDEntrySellerLength = length;
        return this;
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final DirectBuffer value, final int length)
    {
        return mDEntrySeller(value, 0, length);
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final DirectBuffer value)
    {
        return mDEntrySeller(value, 0, value.capacity());
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final byte[] value, final int offset, final int length)
    {
        mDEntrySeller.wrap(value);
        mDEntrySellerOffset = offset;
        mDEntrySellerLength = length;
        return this;
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySellerAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(mDEntrySeller, value, offset, length))
        {
            mDEntrySellerInternalBuffer = mDEntrySeller.byteArray();
        }
        mDEntrySellerOffset = 0;
        mDEntrySellerLength = length;
        return this;
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final byte[] value, final int length)
    {
        return mDEntrySeller(value, 0, length);
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final byte[] value)
    {
        return mDEntrySeller(value, 0, value.length);
    }

    /* MDEntrySeller = 289 */
    public boolean hasMDEntrySeller()
    {
        return mDEntrySellerLength > 0;
    }

    /* MDEntrySeller = 289 */
    public MutableDirectBuffer mDEntrySeller()
    {
        return mDEntrySeller;
    }

    /* MDEntrySeller = 289 */
    public String mDEntrySellerAsString()
    {
        return mDEntrySeller.getStringWithoutLengthAscii(mDEntrySellerOffset, mDEntrySellerLength);
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final CharSequence value)
    {
        if (toBytes(value, mDEntrySeller))
        {
            mDEntrySellerInternalBuffer = mDEntrySeller.byteArray();
        }
        mDEntrySellerOffset = 0;
        mDEntrySellerLength = value.length();
        return this;
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntrySeller.wrap(buffer);
            mDEntrySellerOffset = value.offset();
            mDEntrySellerLength = value.length();
        }
        return this;
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final char[] value)
    {
        return mDEntrySeller(value, 0, value.length);
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final char[] value, final int length)
    {
        return mDEntrySeller(value, 0, length);
    }

    /* MDEntrySeller = 289 */
    public MDEntriesGroupEncoder mDEntrySeller(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, mDEntrySeller, offset, length))
        {
            mDEntrySellerInternalBuffer = mDEntrySeller.byteArray();
        }
        mDEntrySellerOffset = 0;
        mDEntrySellerLength = length;
        return this;
    }

    private int numberOfOrders;

    private boolean hasNumberOfOrders;

    public boolean hasNumberOfOrders()
    {
        return hasNumberOfOrders;
    }

    /* NumberOfOrders = 346 */
    public MDEntriesGroupEncoder numberOfOrders(int value)
    {
        numberOfOrders = value;
        hasNumberOfOrders = true;
        return this;
    }

    /* NumberOfOrders = 346 */
    public int numberOfOrders()
    {
        return numberOfOrders;
    }

    private int mDEntryPositionNo;

    private boolean hasMDEntryPositionNo;

    public boolean hasMDEntryPositionNo()
    {
        return hasMDEntryPositionNo;
    }

    /* MDEntryPositionNo = 290 */
    public MDEntriesGroupEncoder mDEntryPositionNo(int value)
    {
        mDEntryPositionNo = value;
        hasMDEntryPositionNo = true;
        return this;
    }

    /* MDEntryPositionNo = 290 */
    public int mDEntryPositionNo()
    {
        return mDEntryPositionNo;
    }

    private final MutableDirectBuffer scope = new UnsafeBuffer();
    private byte[] scopeInternalBuffer = scope.byteArray();
    private int scopeOffset = 0;
    private int scopeLength = 0;

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final DirectBuffer value, final int offset, final int length)
    {
        scope.wrap(value);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final DirectBuffer value, final int length)
    {
        return scope(value, 0, length);
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final DirectBuffer value)
    {
        return scope(value, 0, value.capacity());
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final byte[] value, final int offset, final int length)
    {
        scope.wrap(value);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scopeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(scope, value, offset, length))
        {
            scopeInternalBuffer = scope.byteArray();
        }
        scopeOffset = 0;
        scopeLength = length;
        return this;
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final byte[] value, final int length)
    {
        return scope(value, 0, length);
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final byte[] value)
    {
        return scope(value, 0, value.length);
    }

    /* Scope = 546 */
    public boolean hasScope()
    {
        return scopeLength > 0;
    }

    /* Scope = 546 */
    public MutableDirectBuffer scope()
    {
        return scope;
    }

    /* Scope = 546 */
    public String scopeAsString()
    {
        return scope.getStringWithoutLengthAscii(scopeOffset, scopeLength);
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final CharSequence value)
    {
        if (toBytes(value, scope))
        {
            scopeInternalBuffer = scope.byteArray();
        }
        scopeOffset = 0;
        scopeLength = value.length();
        return this;
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            scope.wrap(buffer);
            scopeOffset = value.offset();
            scopeLength = value.length();
        }
        return this;
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final char[] value)
    {
        return scope(value, 0, value.length);
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final char[] value, final int length)
    {
        return scope(value, 0, length);
    }

    /* Scope = 546 */
    public MDEntriesGroupEncoder scope(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, scope, offset, length))
        {
            scopeInternalBuffer = scope.byteArray();
        }
        scopeOffset = 0;
        scopeLength = length;
        return this;
    }

    private final DecimalFloat priceDelta = new DecimalFloat();

    private boolean hasPriceDelta;

    public boolean hasPriceDelta()
    {
        return hasPriceDelta;
    }

    /* PriceDelta = 811 */
    public MDEntriesGroupEncoder priceDelta(ReadOnlyDecimalFloat value)
    {
        priceDelta.set(value);
        hasPriceDelta = true;
        return this;
    }

    /* PriceDelta = 811 */
    public MDEntriesGroupEncoder priceDelta(long value, int scale)
    {
        priceDelta.set(value, scale);
        hasPriceDelta = true;
        return this;
    }

    /* PriceDelta = 811 */
    public DecimalFloat priceDelta()
    {
        return priceDelta;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public MDEntriesGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public MDEntriesGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MDEntriesGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public MDEntriesGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public MDEntriesGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public MDEntriesGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MDEntriesGroupEncoder text(final byte[] value)
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
    public MDEntriesGroupEncoder text(final CharSequence value)
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
    public MDEntriesGroupEncoder text(final AsciiSequenceView value)
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
    public MDEntriesGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public MDEntriesGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MDEntriesGroupEncoder text(final char[] value, final int offset, final int length)
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
    public MDEntriesGroupEncoder encodedTextLen(int value)
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
    public MDEntriesGroupEncoder encodedText(byte[] value)
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
    public MDEntriesGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasMDEntryType)
        {
            buffer.putBytes(position, mDEntryTypeHeader, 0, mDEntryTypeHeaderLength);
            position += mDEntryTypeHeaderLength;
            position += buffer.putCharAscii(position, mDEntryType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MDEntryType");
        }

        if (hasMDEntryPx)
        {
            buffer.putBytes(position, mDEntryPxHeader, 0, mDEntryPxHeaderLength);
            position += mDEntryPxHeaderLength;
            position += buffer.putFloatAscii(position, mDEntryPx);
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

        if (hasMDEntrySize)
        {
            buffer.putBytes(position, mDEntrySizeHeader, 0, mDEntrySizeHeaderLength);
            position += mDEntrySizeHeaderLength;
            position += buffer.putFloatAscii(position, mDEntrySize);
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryDateLength > 0)
        {
            buffer.putBytes(position, mDEntryDateHeader, 0, mDEntryDateHeaderLength);
            position += mDEntryDateHeaderLength;
            buffer.putBytes(position, mDEntryDate, mDEntryDateOffset, mDEntryDateLength);
            position += mDEntryDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryTimeLength > 0)
        {
            buffer.putBytes(position, mDEntryTimeHeader, 0, mDEntryTimeHeaderLength);
            position += mDEntryTimeHeaderLength;
            buffer.putBytes(position, mDEntryTime, mDEntryTimeOffset, mDEntryTimeLength);
            position += mDEntryTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTickDirection)
        {
            buffer.putBytes(position, tickDirectionHeader, 0, tickDirectionHeaderLength);
            position += tickDirectionHeaderLength;
            position += buffer.putCharAscii(position, tickDirection);
            buffer.putSeparator(position);
            position++;
        }

        if (mDMktLength > 0)
        {
            buffer.putBytes(position, mDMktHeader, 0, mDMktHeaderLength);
            position += mDMktHeaderLength;
            buffer.putBytes(position, mDMkt, mDMktOffset, mDMktLength);
            position += mDMktLength;
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

        if (quoteConditionLength > 0)
        {
            buffer.putBytes(position, quoteConditionHeader, 0, quoteConditionHeaderLength);
            position += quoteConditionHeaderLength;
            buffer.putBytes(position, quoteCondition, quoteConditionOffset, quoteConditionLength);
            position += quoteConditionLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeConditionLength > 0)
        {
            buffer.putBytes(position, tradeConditionHeader, 0, tradeConditionHeaderLength);
            position += tradeConditionHeaderLength;
            buffer.putBytes(position, tradeCondition, tradeConditionOffset, tradeConditionLength);
            position += tradeConditionLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryOriginatorLength > 0)
        {
            buffer.putBytes(position, mDEntryOriginatorHeader, 0, mDEntryOriginatorHeaderLength);
            position += mDEntryOriginatorHeaderLength;
            buffer.putBytes(position, mDEntryOriginator, mDEntryOriginatorOffset, mDEntryOriginatorLength);
            position += mDEntryOriginatorLength;
            buffer.putSeparator(position);
            position++;
        }

        if (locationIDLength > 0)
        {
            buffer.putBytes(position, locationIDHeader, 0, locationIDHeaderLength);
            position += locationIDHeaderLength;
            buffer.putBytes(position, locationID, locationIDOffset, locationIDLength);
            position += locationIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (deskIDLength > 0)
        {
            buffer.putBytes(position, deskIDHeader, 0, deskIDHeaderLength);
            position += deskIDHeaderLength;
            buffer.putBytes(position, deskID, deskIDOffset, deskIDLength);
            position += deskIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (openCloseSettlFlagLength > 0)
        {
            buffer.putBytes(position, openCloseSettlFlagHeader, 0, openCloseSettlFlagHeaderLength);
            position += openCloseSettlFlagHeaderLength;
            buffer.putBytes(position, openCloseSettlFlag, openCloseSettlFlagOffset, openCloseSettlFlagLength);
            position += openCloseSettlFlagLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTimeInForce)
        {
            buffer.putBytes(position, timeInForceHeader, 0, timeInForceHeaderLength);
            position += timeInForceHeaderLength;
            position += buffer.putCharAscii(position, timeInForce);
            buffer.putSeparator(position);
            position++;
        }

        if (expireDateLength > 0)
        {
            buffer.putBytes(position, expireDateHeader, 0, expireDateHeaderLength);
            position += expireDateHeaderLength;
            buffer.putBytes(position, expireDate, expireDateOffset, expireDateLength);
            position += expireDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (expireTimeLength > 0)
        {
            buffer.putBytes(position, expireTimeHeader, 0, expireTimeHeaderLength);
            position += expireTimeHeaderLength;
            buffer.putBytes(position, expireTime, expireTimeOffset, expireTimeLength);
            position += expireTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinQty)
        {
            buffer.putBytes(position, minQtyHeader, 0, minQtyHeaderLength);
            position += minQtyHeaderLength;
            position += buffer.putFloatAscii(position, minQty);
            buffer.putSeparator(position);
            position++;
        }

        if (execInstLength > 0)
        {
            buffer.putBytes(position, execInstHeader, 0, execInstHeaderLength);
            position += execInstHeaderLength;
            buffer.putBytes(position, execInst, execInstOffset, execInstLength);
            position += execInstLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSellerDays)
        {
            buffer.putBytes(position, sellerDaysHeader, 0, sellerDaysHeaderLength);
            position += sellerDaysHeaderLength;
            position += buffer.putIntAscii(position, sellerDays);
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

        if (quoteEntryIDLength > 0)
        {
            buffer.putBytes(position, quoteEntryIDHeader, 0, quoteEntryIDHeaderLength);
            position += quoteEntryIDHeaderLength;
            buffer.putBytes(position, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            position += quoteEntryIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryBuyerLength > 0)
        {
            buffer.putBytes(position, mDEntryBuyerHeader, 0, mDEntryBuyerHeaderLength);
            position += mDEntryBuyerHeaderLength;
            buffer.putBytes(position, mDEntryBuyer, mDEntryBuyerOffset, mDEntryBuyerLength);
            position += mDEntryBuyerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntrySellerLength > 0)
        {
            buffer.putBytes(position, mDEntrySellerHeader, 0, mDEntrySellerHeaderLength);
            position += mDEntrySellerHeaderLength;
            buffer.putBytes(position, mDEntrySeller, mDEntrySellerOffset, mDEntrySellerLength);
            position += mDEntrySellerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNumberOfOrders)
        {
            buffer.putBytes(position, numberOfOrdersHeader, 0, numberOfOrdersHeaderLength);
            position += numberOfOrdersHeaderLength;
            position += buffer.putIntAscii(position, numberOfOrders);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDEntryPositionNo)
        {
            buffer.putBytes(position, mDEntryPositionNoHeader, 0, mDEntryPositionNoHeaderLength);
            position += mDEntryPositionNoHeaderLength;
            position += buffer.putIntAscii(position, mDEntryPositionNo);
            buffer.putSeparator(position);
            position++;
        }

        if (scopeLength > 0)
        {
            buffer.putBytes(position, scopeHeader, 0, scopeHeaderLength);
            position += scopeHeaderLength;
            buffer.putBytes(position, scope, scopeOffset, scopeLength);
            position += scopeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceDelta)
        {
            buffer.putBytes(position, priceDeltaHeader, 0, priceDeltaHeaderLength);
            position += priceDeltaHeaderLength;
            position += buffer.putFloatAscii(position, priceDelta);
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetMDEntryType();
        this.resetMDEntryPx();
        this.resetCurrency();
        this.resetMDEntrySize();
        this.resetMDEntryDate();
        this.resetMDEntryTime();
        this.resetTickDirection();
        this.resetMDMkt();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetQuoteCondition();
        this.resetTradeCondition();
        this.resetMDEntryOriginator();
        this.resetLocationID();
        this.resetDeskID();
        this.resetOpenCloseSettlFlag();
        this.resetTimeInForce();
        this.resetExpireDate();
        this.resetExpireTime();
        this.resetMinQty();
        this.resetExecInst();
        this.resetSellerDays();
        this.resetOrderID();
        this.resetQuoteEntryID();
        this.resetMDEntryBuyer();
        this.resetMDEntrySeller();
        this.resetNumberOfOrders();
        this.resetMDEntryPositionNo();
        this.resetScope();
        this.resetPriceDelta();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMDEntryType()
    {
        mDEntryType = MISSING_CHAR;
    }

    public void resetMDEntryPx()
    {
        hasMDEntryPx = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
        currency.wrap(currencyInternalBuffer);
    }

    public void resetMDEntrySize()
    {
        hasMDEntrySize = false;
    }

    public void resetMDEntryDate()
    {
        mDEntryDateLength = 0;
        mDEntryDate.wrap(mDEntryDateInternalBuffer);
    }

    public void resetMDEntryTime()
    {
        mDEntryTimeLength = 0;
        mDEntryTime.wrap(mDEntryTimeInternalBuffer);
    }

    public void resetTickDirection()
    {
        hasTickDirection = false;
    }

    public void resetMDMkt()
    {
        mDMktLength = 0;
        mDMkt.wrap(mDMktInternalBuffer);
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

    public void resetQuoteCondition()
    {
        quoteConditionLength = 0;
        quoteCondition.wrap(quoteConditionInternalBuffer);
    }

    public void resetTradeCondition()
    {
        tradeConditionLength = 0;
        tradeCondition.wrap(tradeConditionInternalBuffer);
    }

    public void resetMDEntryOriginator()
    {
        mDEntryOriginatorLength = 0;
        mDEntryOriginator.wrap(mDEntryOriginatorInternalBuffer);
    }

    public void resetLocationID()
    {
        locationIDLength = 0;
        locationID.wrap(locationIDInternalBuffer);
    }

    public void resetDeskID()
    {
        deskIDLength = 0;
        deskID.wrap(deskIDInternalBuffer);
    }

    public void resetOpenCloseSettlFlag()
    {
        openCloseSettlFlagLength = 0;
        openCloseSettlFlag.wrap(openCloseSettlFlagInternalBuffer);
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetExpireDate()
    {
        expireDateLength = 0;
        expireDate.wrap(expireDateInternalBuffer);
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
        expireTime.wrap(expireTimeInternalBuffer);
    }

    public void resetMinQty()
    {
        hasMinQty = false;
    }

    public void resetExecInst()
    {
        execInstLength = 0;
        execInst.wrap(execInstInternalBuffer);
    }

    public void resetSellerDays()
    {
        hasSellerDays = false;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
        orderID.wrap(orderIDInternalBuffer);
    }

    public void resetQuoteEntryID()
    {
        quoteEntryIDLength = 0;
        quoteEntryID.wrap(quoteEntryIDInternalBuffer);
    }

    public void resetMDEntryBuyer()
    {
        mDEntryBuyerLength = 0;
        mDEntryBuyer.wrap(mDEntryBuyerInternalBuffer);
    }

    public void resetMDEntrySeller()
    {
        mDEntrySellerLength = 0;
        mDEntrySeller.wrap(mDEntrySellerInternalBuffer);
    }

    public void resetNumberOfOrders()
    {
        hasNumberOfOrders = false;
    }

    public void resetMDEntryPositionNo()
    {
        hasMDEntryPositionNo = false;
    }

    public void resetScope()
    {
        scopeLength = 0;
        scope.wrap(scopeInternalBuffer);
    }

    public void resetPriceDelta()
    {
        hasPriceDelta = false;
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
        builder.append("\"MessageName\": \"MDEntriesGroup\",\n");
        if (hasMDEntryType())
        {
            indent(builder, level);
            builder.append("\"MDEntryType\": \"");
            builder.append(mDEntryType);
            builder.append("\",\n");
        }

        if (hasMDEntryPx())
        {
            indent(builder, level);
            builder.append("\"MDEntryPx\": \"");
            mDEntryPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasMDEntrySize())
        {
            indent(builder, level);
            builder.append("\"MDEntrySize\": \"");
            mDEntrySize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMDEntryDate())
        {
            indent(builder, level);
            builder.append("\"MDEntryDate\": \"");
            appendBuffer(builder, mDEntryDate, mDEntryDateOffset, mDEntryDateLength);
            builder.append("\",\n");
        }

        if (hasMDEntryTime())
        {
            indent(builder, level);
            builder.append("\"MDEntryTime\": \"");
            appendBuffer(builder, mDEntryTime, mDEntryTimeOffset, mDEntryTimeLength);
            builder.append("\",\n");
        }

        if (hasTickDirection())
        {
            indent(builder, level);
            builder.append("\"TickDirection\": \"");
            builder.append(tickDirection);
            builder.append("\",\n");
        }

        if (hasMDMkt())
        {
            indent(builder, level);
            builder.append("\"MDMkt\": \"");
            appendBuffer(builder, mDMkt, mDMktOffset, mDMktLength);
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

        if (hasQuoteCondition())
        {
            indent(builder, level);
            builder.append("\"QuoteCondition\": \"");
            appendBuffer(builder, quoteCondition, quoteConditionOffset, quoteConditionLength);
            builder.append("\",\n");
        }

        if (hasTradeCondition())
        {
            indent(builder, level);
            builder.append("\"TradeCondition\": \"");
            appendBuffer(builder, tradeCondition, tradeConditionOffset, tradeConditionLength);
            builder.append("\",\n");
        }

        if (hasMDEntryOriginator())
        {
            indent(builder, level);
            builder.append("\"MDEntryOriginator\": \"");
            appendBuffer(builder, mDEntryOriginator, mDEntryOriginatorOffset, mDEntryOriginatorLength);
            builder.append("\",\n");
        }

        if (hasLocationID())
        {
            indent(builder, level);
            builder.append("\"LocationID\": \"");
            appendBuffer(builder, locationID, locationIDOffset, locationIDLength);
            builder.append("\",\n");
        }

        if (hasDeskID())
        {
            indent(builder, level);
            builder.append("\"DeskID\": \"");
            appendBuffer(builder, deskID, deskIDOffset, deskIDLength);
            builder.append("\",\n");
        }

        if (hasOpenCloseSettlFlag())
        {
            indent(builder, level);
            builder.append("\"OpenCloseSettlFlag\": \"");
            appendBuffer(builder, openCloseSettlFlag, openCloseSettlFlagOffset, openCloseSettlFlagLength);
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasExpireDate())
        {
            indent(builder, level);
            builder.append("\"ExpireDate\": \"");
            appendBuffer(builder, expireDate, expireDateOffset, expireDateLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasMinQty())
        {
            indent(builder, level);
            builder.append("\"MinQty\": \"");
            minQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            appendBuffer(builder, execInst, execInstOffset, execInstLength);
            builder.append("\",\n");
        }

        if (hasSellerDays())
        {
            indent(builder, level);
            builder.append("\"SellerDays\": \"");
            builder.append(sellerDays);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteEntryID())
        {
            indent(builder, level);
            builder.append("\"QuoteEntryID\": \"");
            appendBuffer(builder, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            builder.append("\",\n");
        }

        if (hasMDEntryBuyer())
        {
            indent(builder, level);
            builder.append("\"MDEntryBuyer\": \"");
            appendBuffer(builder, mDEntryBuyer, mDEntryBuyerOffset, mDEntryBuyerLength);
            builder.append("\",\n");
        }

        if (hasMDEntrySeller())
        {
            indent(builder, level);
            builder.append("\"MDEntrySeller\": \"");
            appendBuffer(builder, mDEntrySeller, mDEntrySellerOffset, mDEntrySellerLength);
            builder.append("\",\n");
        }

        if (hasNumberOfOrders())
        {
            indent(builder, level);
            builder.append("\"NumberOfOrders\": \"");
            builder.append(numberOfOrders);
            builder.append("\",\n");
        }

        if (hasMDEntryPositionNo())
        {
            indent(builder, level);
            builder.append("\"MDEntryPositionNo\": \"");
            builder.append(mDEntryPositionNo);
            builder.append("\",\n");
        }

        if (hasScope())
        {
            indent(builder, level);
            builder.append("\"Scope\": \"");
            appendBuffer(builder, scope, scopeOffset, scopeLength);
            builder.append("\",\n");
        }

        if (hasPriceDelta())
        {
            indent(builder, level);
            builder.append("\"PriceDelta\": \"");
            priceDelta.appendTo(builder);
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

    public MDEntriesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MDEntriesGroupEncoder)encoder);
    }

    public MDEntriesGroupEncoder copyTo(final MDEntriesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDEntryType())
        {
            encoder.mDEntryType(this.mDEntryType());
        }

        if (hasMDEntryPx())
        {
            encoder.mDEntryPx(this.mDEntryPx());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasMDEntrySize())
        {
            encoder.mDEntrySize(this.mDEntrySize());
        }

        if (hasMDEntryDate())
        {
            encoder.mDEntryDateAsCopy(mDEntryDate.byteArray(), 0, mDEntryDateLength);
        }

        if (hasMDEntryTime())
        {
            encoder.mDEntryTimeAsCopy(mDEntryTime.byteArray(), 0, mDEntryTimeLength);
        }

        if (hasTickDirection())
        {
            encoder.tickDirection(this.tickDirection());
        }

        if (hasMDMkt())
        {
            encoder.mDMktAsCopy(mDMkt.byteArray(), 0, mDMktLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasQuoteCondition())
        {
            encoder.quoteConditionAsCopy(quoteCondition.byteArray(), 0, quoteConditionLength);
        }

        if (hasTradeCondition())
        {
            encoder.tradeConditionAsCopy(tradeCondition.byteArray(), 0, tradeConditionLength);
        }

        if (hasMDEntryOriginator())
        {
            encoder.mDEntryOriginatorAsCopy(mDEntryOriginator.byteArray(), 0, mDEntryOriginatorLength);
        }

        if (hasLocationID())
        {
            encoder.locationIDAsCopy(locationID.byteArray(), 0, locationIDLength);
        }

        if (hasDeskID())
        {
            encoder.deskIDAsCopy(deskID.byteArray(), 0, deskIDLength);
        }

        if (hasOpenCloseSettlFlag())
        {
            encoder.openCloseSettlFlagAsCopy(openCloseSettlFlag.byteArray(), 0, openCloseSettlFlagLength);
        }

        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }

        if (hasExpireDate())
        {
            encoder.expireDateAsCopy(expireDate.byteArray(), 0, expireDateLength);
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }

        if (hasMinQty())
        {
            encoder.minQty(this.minQty());
        }

        if (hasExecInst())
        {
            encoder.execInstAsCopy(execInst.byteArray(), 0, execInstLength);
        }

        if (hasSellerDays())
        {
            encoder.sellerDays(this.sellerDays());
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasQuoteEntryID())
        {
            encoder.quoteEntryIDAsCopy(quoteEntryID.byteArray(), 0, quoteEntryIDLength);
        }

        if (hasMDEntryBuyer())
        {
            encoder.mDEntryBuyerAsCopy(mDEntryBuyer.byteArray(), 0, mDEntryBuyerLength);
        }

        if (hasMDEntrySeller())
        {
            encoder.mDEntrySellerAsCopy(mDEntrySeller.byteArray(), 0, mDEntrySellerLength);
        }

        if (hasNumberOfOrders())
        {
            encoder.numberOfOrders(this.numberOfOrders());
        }

        if (hasMDEntryPositionNo())
        {
            encoder.mDEntryPositionNo(this.mDEntryPositionNo());
        }

        if (hasScope())
        {
            encoder.scopeAsCopy(scope.byteArray(), 0, scopeLength);
        }

        if (hasPriceDelta())
        {
            encoder.priceDelta(this.priceDelta());
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
    private int noMDEntriesGroupCounter;

    private boolean hasNoMDEntriesGroupCounter;

    public boolean hasNoMDEntriesGroupCounter()
    {
        return hasNoMDEntriesGroupCounter;
    }

    /* NoMDEntriesGroupCounter = 268 */
    public MarketDataSnapshotFullRefreshEncoder noMDEntriesGroupCounter(int value)
    {
        noMDEntriesGroupCounter = value;
        hasNoMDEntriesGroupCounter = true;
        return this;
    }

    /* NoMDEntriesGroupCounter = 268 */
    public int noMDEntriesGroupCounter()
    {
        return noMDEntriesGroupCounter;
    }


    private MDEntriesGroupEncoder mDEntriesGroup = null;

    public MDEntriesGroupEncoder mDEntriesGroup(final int numberOfElements)
    {
        hasNoMDEntriesGroupCounter = true;
        noMDEntriesGroupCounter = numberOfElements;
        if (mDEntriesGroup == null)
        {
            mDEntriesGroup = new MDEntriesGroupEncoder();
        }
        return mDEntriesGroup;
    }

    private int applQueueDepth;

    private boolean hasApplQueueDepth;

    public boolean hasApplQueueDepth()
    {
        return hasApplQueueDepth;
    }

    /* ApplQueueDepth = 813 */
    public MarketDataSnapshotFullRefreshEncoder applQueueDepth(int value)
    {
        applQueueDepth = value;
        hasApplQueueDepth = true;
        return this;
    }

    /* ApplQueueDepth = 813 */
    public int applQueueDepth()
    {
        return applQueueDepth;
    }

    private int applQueueResolution;

    private boolean hasApplQueueResolution;

    public boolean hasApplQueueResolution()
    {
        return hasApplQueueResolution;
    }

    /* ApplQueueResolution = 814 */
    public MarketDataSnapshotFullRefreshEncoder applQueueResolution(int value)
    {
        applQueueResolution = value;
        hasApplQueueResolution = true;
        return this;
    }

    /* ApplQueueResolution = 814 */
    public int applQueueResolution()
    {
        return applQueueResolution;
    }

    public MarketDataSnapshotFullRefreshEncoder applQueueResolution(ApplQueueResolution value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ApplQueueResolution.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: applQueueResolution Value: " + value );
            }
            if (value == ApplQueueResolution.NULL_VAL)
            {
                return this;
            }
        }
        return applQueueResolution(value.representation());
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (mDReqIDLength > 0)
        {
            buffer.putBytes(position, mDReqIDHeader, 0, mDReqIDHeaderLength);
            position += mDReqIDHeaderLength;
            buffer.putBytes(position, mDReqID, mDReqIDOffset, mDReqIDLength);
            position += mDReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

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


        if (financialStatusLength > 0)
        {
            buffer.putBytes(position, financialStatusHeader, 0, financialStatusHeaderLength);
            position += financialStatusHeaderLength;
            buffer.putBytes(position, financialStatus, financialStatusOffset, financialStatusLength);
            position += financialStatusLength;
            buffer.putSeparator(position);
            position++;
        }

        if (corporateActionLength > 0)
        {
            buffer.putBytes(position, corporateActionHeader, 0, corporateActionHeaderLength);
            position += corporateActionHeaderLength;
            buffer.putBytes(position, corporateAction, corporateActionOffset, corporateActionLength);
            position += corporateActionLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNetChgPrevDay)
        {
            buffer.putBytes(position, netChgPrevDayHeader, 0, netChgPrevDayHeaderLength);
            position += netChgPrevDayHeaderLength;
            position += buffer.putFloatAscii(position, netChgPrevDay);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoMDEntriesGroupCounter)
        {
            buffer.putBytes(position, noMDEntriesGroupCounterHeader, 0, noMDEntriesGroupCounterHeaderLength);
            position += noMDEntriesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMDEntriesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntriesGroup != null)
        {
            position += mDEntriesGroup.encode(buffer, position, noMDEntriesGroupCounter);
        }


        if (hasApplQueueDepth)
        {
            buffer.putBytes(position, applQueueDepthHeader, 0, applQueueDepthHeaderLength);
            position += applQueueDepthHeaderLength;
            position += buffer.putIntAscii(position, applQueueDepth);
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplQueueResolution)
        {
            buffer.putBytes(position, applQueueResolutionHeader, 0, applQueueResolutionHeaderLength);
            position += applQueueResolutionHeaderLength;
            position += buffer.putIntAscii(position, applQueueResolution);
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
        this.resetMDReqID();
        this.resetFinancialStatus();
        this.resetCorporateAction();
        this.resetNetChgPrevDay();
        this.resetApplQueueDepth();
        this.resetApplQueueResolution();
        instrument.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        this.resetMDEntriesGroup();
    }

    public void resetMDReqID()
    {
        mDReqIDLength = 0;
        mDReqID.wrap(mDReqIDInternalBuffer);
    }

    public void resetFinancialStatus()
    {
        financialStatusLength = 0;
        financialStatus.wrap(financialStatusInternalBuffer);
    }

    public void resetCorporateAction()
    {
        corporateActionLength = 0;
        corporateAction.wrap(corporateActionInternalBuffer);
    }

    public void resetNetChgPrevDay()
    {
        hasNetChgPrevDay = false;
    }

    public void resetApplQueueDepth()
    {
        hasApplQueueDepth = false;
    }

    public void resetApplQueueResolution()
    {
        hasApplQueueResolution = false;
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

    public void resetLegsGroup()
    {
        if (legsGroup != null)
        {
            legsGroup.reset();
        }
        noLegsGroupCounter = 0;
        hasNoLegsGroupCounter = false;
    }

    public void resetMDEntriesGroup()
    {
        if (mDEntriesGroup != null)
        {
            mDEntriesGroup.reset();
        }
        noMDEntriesGroupCounter = 0;
        hasNoMDEntriesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataSnapshotFullRefresh\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasMDReqID())
        {
            indent(builder, level);
            builder.append("\"MDReqID\": \"");
            appendBuffer(builder, mDReqID, mDReqIDOffset, mDReqIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
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

        if (hasFinancialStatus())
        {
            indent(builder, level);
            builder.append("\"FinancialStatus\": \"");
            appendBuffer(builder, financialStatus, financialStatusOffset, financialStatusLength);
            builder.append("\",\n");
        }

        if (hasCorporateAction())
        {
            indent(builder, level);
            builder.append("\"CorporateAction\": \"");
            appendBuffer(builder, corporateAction, corporateActionOffset, corporateActionLength);
            builder.append("\",\n");
        }

        if (hasNetChgPrevDay())
        {
            indent(builder, level);
            builder.append("\"NetChgPrevDay\": \"");
            netChgPrevDay.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNoMDEntriesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MDEntriesGroup\": [\n");
            final int noMDEntriesGroupCounter = this.noMDEntriesGroupCounter;
            MDEntriesGroupEncoder mDEntriesGroup = this.mDEntriesGroup;
            for (int i = 0; i < noMDEntriesGroupCounter; i++)
            {
                indent(builder, level);
                mDEntriesGroup.appendTo(builder, level + 1);
                if (i < (noMDEntriesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                mDEntriesGroup = mDEntriesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasApplQueueDepth())
        {
            indent(builder, level);
            builder.append("\"ApplQueueDepth\": \"");
            builder.append(applQueueDepth);
            builder.append("\",\n");
        }

        if (hasApplQueueResolution())
        {
            indent(builder, level);
            builder.append("\"ApplQueueResolution\": \"");
            builder.append(applQueueResolution);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public MarketDataSnapshotFullRefreshEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDataSnapshotFullRefreshEncoder)encoder);
    }

    public MarketDataSnapshotFullRefreshEncoder copyTo(final MarketDataSnapshotFullRefreshEncoder encoder)
    {
        encoder.reset();
        if (hasMDReqID())
        {
            encoder.mDReqIDAsCopy(mDReqID.byteArray(), 0, mDReqIDLength);
        }


        instrument.copyTo(encoder.instrument());
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

        if (hasFinancialStatus())
        {
            encoder.financialStatusAsCopy(financialStatus.byteArray(), 0, financialStatusLength);
        }

        if (hasCorporateAction())
        {
            encoder.corporateActionAsCopy(corporateAction.byteArray(), 0, corporateActionLength);
        }

        if (hasNetChgPrevDay())
        {
            encoder.netChgPrevDay(this.netChgPrevDay());
        }

        if (hasNoMDEntriesGroupCounter)
        {
            final int size = this.noMDEntriesGroupCounter;
            MDEntriesGroupEncoder mDEntriesGroup = this.mDEntriesGroup;
            MDEntriesGroupEncoder mDEntriesGroupEncoder = encoder.mDEntriesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDEntriesGroup != null)
                {
                    mDEntriesGroup.copyTo(mDEntriesGroupEncoder);
                    mDEntriesGroup = mDEntriesGroup.next();
                    mDEntriesGroupEncoder = mDEntriesGroupEncoder.next();
                }
            }
        }

        if (hasApplQueueDepth())
        {
            encoder.applQueueDepth(this.applQueueDepth());
        }

        if (hasApplQueueResolution())
        {
            encoder.applQueueResolution(this.applQueueResolution());
        }
        return encoder;
    }

}
