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
public class TradeCaptureReportEncoder implements Encoder
{
    public long messageType()
    {
        return 17729L;
    }

    public TradeCaptureReportEncoder()
    {
        header.msgType("AE");
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

    private static final int tradeReportIDHeaderLength = 4;
    private static final byte[] tradeReportIDHeader = new byte[] {53, 55, 49, (byte) '='};

    private static final int tradeReportTransTypeHeaderLength = 4;
    private static final byte[] tradeReportTransTypeHeader = new byte[] {52, 56, 55, (byte) '='};

    private static final int tradeReportTypeHeaderLength = 4;
    private static final byte[] tradeReportTypeHeader = new byte[] {56, 53, 54, (byte) '='};

    private static final int tradeRequestIDHeaderLength = 4;
    private static final byte[] tradeRequestIDHeader = new byte[] {53, 54, 56, (byte) '='};

    private static final int trdTypeHeaderLength = 4;
    private static final byte[] trdTypeHeader = new byte[] {56, 50, 56, (byte) '='};

    private static final int trdSubTypeHeaderLength = 4;
    private static final byte[] trdSubTypeHeader = new byte[] {56, 50, 57, (byte) '='};

    private static final int secondaryTrdTypeHeaderLength = 4;
    private static final byte[] secondaryTrdTypeHeader = new byte[] {56, 53, 53, (byte) '='};

    private static final int transferReasonHeaderLength = 4;
    private static final byte[] transferReasonHeader = new byte[] {56, 51, 48, (byte) '='};

    private static final int execTypeHeaderLength = 4;
    private static final byte[] execTypeHeader = new byte[] {49, 53, 48, (byte) '='};

    private static final int totNumTradeReportsHeaderLength = 4;
    private static final byte[] totNumTradeReportsHeader = new byte[] {55, 52, 56, (byte) '='};

    private static final int lastRptRequestedHeaderLength = 4;
    private static final byte[] lastRptRequestedHeader = new byte[] {57, 49, 50, (byte) '='};

    private static final int unsolicitedIndicatorHeaderLength = 4;
    private static final byte[] unsolicitedIndicatorHeader = new byte[] {51, 50, 53, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int tradeReportRefIDHeaderLength = 4;
    private static final byte[] tradeReportRefIDHeader = new byte[] {53, 55, 50, (byte) '='};

    private static final int secondaryTradeReportRefIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportRefIDHeader = new byte[] {56, 56, 49, (byte) '='};

    private static final int secondaryTradeReportIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportIDHeader = new byte[] {56, 49, 56, (byte) '='};

    private static final int tradeLinkIDHeaderLength = 4;
    private static final byte[] tradeLinkIDHeader = new byte[] {56, 50, 48, (byte) '='};

    private static final int trdMatchIDHeaderLength = 4;
    private static final byte[] trdMatchIDHeader = new byte[] {56, 56, 48, (byte) '='};

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private static final int ordStatusHeaderLength = 3;
    private static final byte[] ordStatusHeader = new byte[] {51, 57, (byte) '='};

    private static final int secondaryExecIDHeaderLength = 4;
    private static final byte[] secondaryExecIDHeader = new byte[] {53, 50, 55, (byte) '='};

    private static final int execRestatementReasonHeaderLength = 4;
    private static final byte[] execRestatementReasonHeader = new byte[] {51, 55, 56, (byte) '='};

    private static final int previouslyReportedHeaderLength = 4;
    private static final byte[] previouslyReportedHeader = new byte[] {53, 55, 48, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int underlyingTradingSessionIDHeaderLength = 4;
    private static final byte[] underlyingTradingSessionIDHeader = new byte[] {56, 50, 50, (byte) '='};

    private static final int underlyingTradingSessionSubIDHeaderLength = 4;
    private static final byte[] underlyingTradingSessionSubIDHeader = new byte[] {56, 50, 51, (byte) '='};

    private static final int lastQtyHeaderLength = 3;
    private static final byte[] lastQtyHeader = new byte[] {51, 50, (byte) '='};

    private static final int lastPxHeaderLength = 3;
    private static final byte[] lastPxHeader = new byte[] {51, 49, (byte) '='};

    private static final int lastParPxHeaderLength = 4;
    private static final byte[] lastParPxHeader = new byte[] {54, 54, 57, (byte) '='};

    private static final int lastSpotRateHeaderLength = 4;
    private static final byte[] lastSpotRateHeader = new byte[] {49, 57, 52, (byte) '='};

    private static final int lastForwardPointsHeaderLength = 4;
    private static final byte[] lastForwardPointsHeader = new byte[] {49, 57, 53, (byte) '='};

    private static final int lastMktHeaderLength = 3;
    private static final byte[] lastMktHeader = new byte[] {51, 48, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int avgPxHeaderLength = 2;
    private static final byte[] avgPxHeader = new byte[] {54, (byte) '='};

    private static final int avgPxIndicatorHeaderLength = 4;
    private static final byte[] avgPxIndicatorHeader = new byte[] {56, 49, 57, (byte) '='};

    private static final int multiLegReportingTypeHeaderLength = 4;
    private static final byte[] multiLegReportingTypeHeader = new byte[] {52, 52, 50, (byte) '='};

    private static final int tradeLegRefIDHeaderLength = 4;
    private static final byte[] tradeLegRefIDHeader = new byte[] {56, 50, 52, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int matchTypeHeaderLength = 4;
    private static final byte[] matchTypeHeader = new byte[] {53, 55, 52, (byte) '='};

    private static final int noSidesGroupCounterHeaderLength = 4;
    private static final byte[] noSidesGroupCounterHeader = new byte[] {53, 53, 50, (byte) '='};

    private static final int copyMsgIndicatorHeaderLength = 4;
    private static final byte[] copyMsgIndicatorHeader = new byte[] {55, 57, 55, (byte) '='};

    private static final int publishTrdIndicatorHeaderLength = 4;
    private static final byte[] publishTrdIndicatorHeader = new byte[] {56, 53, 50, (byte) '='};

    private static final int shortSaleReasonHeaderLength = 4;
    private static final byte[] shortSaleReasonHeader = new byte[] {56, 53, 51, (byte) '='};

    private final MutableDirectBuffer tradeReportID = new UnsafeBuffer();
    private byte[] tradeReportIDInternalBuffer = tradeReportID.byteArray();
    private int tradeReportIDOffset = 0;
    private int tradeReportIDLength = 0;

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportID(final DirectBuffer value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportID(final DirectBuffer value)
    {
        return tradeReportID(value, 0, value.capacity());
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportID(final byte[] value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder tradeReportID(final byte[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportID(final byte[] value)
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
    public TradeCaptureReportEncoder tradeReportID(final CharSequence value)
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
    public TradeCaptureReportEncoder tradeReportID(final AsciiSequenceView value)
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
    public TradeCaptureReportEncoder tradeReportID(final char[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportID(final char[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportEncoder tradeReportID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeReportID, offset, length))
        {
            tradeReportIDInternalBuffer = tradeReportID.byteArray();
        }
        tradeReportIDOffset = 0;
        tradeReportIDLength = length;
        return this;
    }

    private int tradeReportTransType;

    private boolean hasTradeReportTransType;

    public boolean hasTradeReportTransType()
    {
        return hasTradeReportTransType;
    }

    /* TradeReportTransType = 487 */
    public TradeCaptureReportEncoder tradeReportTransType(int value)
    {
        tradeReportTransType = value;
        hasTradeReportTransType = true;
        return this;
    }

    /* TradeReportTransType = 487 */
    public int tradeReportTransType()
    {
        return tradeReportTransType;
    }

    public TradeCaptureReportEncoder tradeReportTransType(TradeReportTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeReportTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeReportTransType Value: " + value );
            }
            if (value == TradeReportTransType.NULL_VAL)
            {
                return this;
            }
        }
        return tradeReportTransType(value.representation());
    }

    private int tradeReportType;

    private boolean hasTradeReportType;

    public boolean hasTradeReportType()
    {
        return hasTradeReportType;
    }

    /* TradeReportType = 856 */
    public TradeCaptureReportEncoder tradeReportType(int value)
    {
        tradeReportType = value;
        hasTradeReportType = true;
        return this;
    }

    /* TradeReportType = 856 */
    public int tradeReportType()
    {
        return tradeReportType;
    }

    public TradeCaptureReportEncoder tradeReportType(TradeReportType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeReportType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeReportType Value: " + value );
            }
            if (value == TradeReportType.NULL_VAL)
            {
                return this;
            }
        }
        return tradeReportType(value.representation());
    }

    private final MutableDirectBuffer tradeRequestID = new UnsafeBuffer();
    private byte[] tradeRequestIDInternalBuffer = tradeRequestID.byteArray();
    private int tradeRequestIDOffset = 0;
    private int tradeRequestIDLength = 0;

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final DirectBuffer value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final DirectBuffer value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final DirectBuffer value)
    {
        return tradeRequestID(value, 0, value.capacity());
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final byte[] value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeRequestID, value, offset, length))
        {
            tradeRequestIDInternalBuffer = tradeRequestID.byteArray();
        }
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = length;
        return this;
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final byte[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final byte[] value)
    {
        return tradeRequestID(value, 0, value.length);
    }

    /* TradeRequestID = 568 */
    public boolean hasTradeRequestID()
    {
        return tradeRequestIDLength > 0;
    }

    /* TradeRequestID = 568 */
    public MutableDirectBuffer tradeRequestID()
    {
        return tradeRequestID;
    }

    /* TradeRequestID = 568 */
    public String tradeRequestIDAsString()
    {
        return tradeRequestID.getStringWithoutLengthAscii(tradeRequestIDOffset, tradeRequestIDLength);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final CharSequence value)
    {
        if (toBytes(value, tradeRequestID))
        {
            tradeRequestIDInternalBuffer = tradeRequestID.byteArray();
        }
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = value.length();
        return this;
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeRequestID.wrap(buffer);
            tradeRequestIDOffset = value.offset();
            tradeRequestIDLength = value.length();
        }
        return this;
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final char[] value)
    {
        return tradeRequestID(value, 0, value.length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final char[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportEncoder tradeRequestID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeRequestID, offset, length))
        {
            tradeRequestIDInternalBuffer = tradeRequestID.byteArray();
        }
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = length;
        return this;
    }

    private int trdType;

    private boolean hasTrdType;

    public boolean hasTrdType()
    {
        return hasTrdType;
    }

    /* TrdType = 828 */
    public TradeCaptureReportEncoder trdType(int value)
    {
        trdType = value;
        hasTrdType = true;
        return this;
    }

    /* TrdType = 828 */
    public int trdType()
    {
        return trdType;
    }

    public TradeCaptureReportEncoder trdType(TrdType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TrdType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: trdType Value: " + value );
            }
            if (value == TrdType.NULL_VAL)
            {
                return this;
            }
        }
        return trdType(value.representation());
    }

    private int trdSubType;

    private boolean hasTrdSubType;

    public boolean hasTrdSubType()
    {
        return hasTrdSubType;
    }

    /* TrdSubType = 829 */
    public TradeCaptureReportEncoder trdSubType(int value)
    {
        trdSubType = value;
        hasTrdSubType = true;
        return this;
    }

    /* TrdSubType = 829 */
    public int trdSubType()
    {
        return trdSubType;
    }

    private int secondaryTrdType;

    private boolean hasSecondaryTrdType;

    public boolean hasSecondaryTrdType()
    {
        return hasSecondaryTrdType;
    }

    /* SecondaryTrdType = 855 */
    public TradeCaptureReportEncoder secondaryTrdType(int value)
    {
        secondaryTrdType = value;
        hasSecondaryTrdType = true;
        return this;
    }

    /* SecondaryTrdType = 855 */
    public int secondaryTrdType()
    {
        return secondaryTrdType;
    }

    private final MutableDirectBuffer transferReason = new UnsafeBuffer();
    private byte[] transferReasonInternalBuffer = transferReason.byteArray();
    private int transferReasonOffset = 0;
    private int transferReasonLength = 0;

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final DirectBuffer value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final DirectBuffer value, final int length)
    {
        return transferReason(value, 0, length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final DirectBuffer value)
    {
        return transferReason(value, 0, value.capacity());
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final byte[] value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReasonAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(transferReason, value, offset, length))
        {
            transferReasonInternalBuffer = transferReason.byteArray();
        }
        transferReasonOffset = 0;
        transferReasonLength = length;
        return this;
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final byte[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final byte[] value)
    {
        return transferReason(value, 0, value.length);
    }

    /* TransferReason = 830 */
    public boolean hasTransferReason()
    {
        return transferReasonLength > 0;
    }

    /* TransferReason = 830 */
    public MutableDirectBuffer transferReason()
    {
        return transferReason;
    }

    /* TransferReason = 830 */
    public String transferReasonAsString()
    {
        return transferReason.getStringWithoutLengthAscii(transferReasonOffset, transferReasonLength);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final CharSequence value)
    {
        if (toBytes(value, transferReason))
        {
            transferReasonInternalBuffer = transferReason.byteArray();
        }
        transferReasonOffset = 0;
        transferReasonLength = value.length();
        return this;
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            transferReason.wrap(buffer);
            transferReasonOffset = value.offset();
            transferReasonLength = value.length();
        }
        return this;
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final char[] value)
    {
        return transferReason(value, 0, value.length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final char[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportEncoder transferReason(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, transferReason, offset, length))
        {
            transferReasonInternalBuffer = transferReason.byteArray();
        }
        transferReasonOffset = 0;
        transferReasonLength = length;
        return this;
    }

    private char execType;

    private boolean hasExecType;

    public boolean hasExecType()
    {
        return hasExecType;
    }

    /* ExecType = 150 */
    public TradeCaptureReportEncoder execType(char value)
    {
        execType = value;
        hasExecType = true;
        return this;
    }

    /* ExecType = 150 */
    public char execType()
    {
        return execType;
    }

    public TradeCaptureReportEncoder execType(ExecType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExecType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: execType Value: " + value );
            }
            if (value == ExecType.NULL_VAL)
            {
                return this;
            }
        }
        return execType(value.representation());
    }

    private int totNumTradeReports;

    private boolean hasTotNumTradeReports;

    public boolean hasTotNumTradeReports()
    {
        return hasTotNumTradeReports;
    }

    /* TotNumTradeReports = 748 */
    public TradeCaptureReportEncoder totNumTradeReports(int value)
    {
        totNumTradeReports = value;
        hasTotNumTradeReports = true;
        return this;
    }

    /* TotNumTradeReports = 748 */
    public int totNumTradeReports()
    {
        return totNumTradeReports;
    }

    private boolean lastRptRequested;

    private boolean hasLastRptRequested;

    public boolean hasLastRptRequested()
    {
        return hasLastRptRequested;
    }

    /* LastRptRequested = 912 */
    public TradeCaptureReportEncoder lastRptRequested(boolean value)
    {
        lastRptRequested = value;
        hasLastRptRequested = true;
        return this;
    }

    /* LastRptRequested = 912 */
    public boolean lastRptRequested()
    {
        return lastRptRequested;
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }

    /* UnsolicitedIndicator = 325 */
    public TradeCaptureReportEncoder unsolicitedIndicator(boolean value)
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

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    /* SubscriptionRequestType = 263 */
    public TradeCaptureReportEncoder subscriptionRequestType(char value)
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

    public TradeCaptureReportEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private final MutableDirectBuffer tradeReportRefID = new UnsafeBuffer();
    private byte[] tradeReportRefIDInternalBuffer = tradeReportRefID.byteArray();
    private int tradeReportRefIDOffset = 0;
    private int tradeReportRefIDLength = 0;

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportRefID.wrap(value);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final DirectBuffer value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final DirectBuffer value)
    {
        return tradeReportRefID(value, 0, value.capacity());
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final byte[] value, final int offset, final int length)
    {
        tradeReportRefID.wrap(value);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeReportRefID, value, offset, length))
        {
            tradeReportRefIDInternalBuffer = tradeReportRefID.byteArray();
        }
        tradeReportRefIDOffset = 0;
        tradeReportRefIDLength = length;
        return this;
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final byte[] value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final byte[] value)
    {
        return tradeReportRefID(value, 0, value.length);
    }

    /* TradeReportRefID = 572 */
    public boolean hasTradeReportRefID()
    {
        return tradeReportRefIDLength > 0;
    }

    /* TradeReportRefID = 572 */
    public MutableDirectBuffer tradeReportRefID()
    {
        return tradeReportRefID;
    }

    /* TradeReportRefID = 572 */
    public String tradeReportRefIDAsString()
    {
        return tradeReportRefID.getStringWithoutLengthAscii(tradeReportRefIDOffset, tradeReportRefIDLength);
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final CharSequence value)
    {
        if (toBytes(value, tradeReportRefID))
        {
            tradeReportRefIDInternalBuffer = tradeReportRefID.byteArray();
        }
        tradeReportRefIDOffset = 0;
        tradeReportRefIDLength = value.length();
        return this;
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeReportRefID.wrap(buffer);
            tradeReportRefIDOffset = value.offset();
            tradeReportRefIDLength = value.length();
        }
        return this;
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final char[] value)
    {
        return tradeReportRefID(value, 0, value.length);
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final char[] value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    /* TradeReportRefID = 572 */
    public TradeCaptureReportEncoder tradeReportRefID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeReportRefID, offset, length))
        {
            tradeReportRefIDInternalBuffer = tradeReportRefID.byteArray();
        }
        tradeReportRefIDOffset = 0;
        tradeReportRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportRefID = new UnsafeBuffer();
    private byte[] secondaryTradeReportRefIDInternalBuffer = secondaryTradeReportRefID.byteArray();
    private int secondaryTradeReportRefIDOffset = 0;
    private int secondaryTradeReportRefIDLength = 0;

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportRefID.wrap(value);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final DirectBuffer value)
    {
        return secondaryTradeReportRefID(value, 0, value.capacity());
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportRefID.wrap(value);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(secondaryTradeReportRefID, value, offset, length))
        {
            secondaryTradeReportRefIDInternalBuffer = secondaryTradeReportRefID.byteArray();
        }
        secondaryTradeReportRefIDOffset = 0;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final byte[] value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final byte[] value)
    {
        return secondaryTradeReportRefID(value, 0, value.length);
    }

    /* SecondaryTradeReportRefID = 881 */
    public boolean hasSecondaryTradeReportRefID()
    {
        return secondaryTradeReportRefIDLength > 0;
    }

    /* SecondaryTradeReportRefID = 881 */
    public MutableDirectBuffer secondaryTradeReportRefID()
    {
        return secondaryTradeReportRefID;
    }

    /* SecondaryTradeReportRefID = 881 */
    public String secondaryTradeReportRefIDAsString()
    {
        return secondaryTradeReportRefID.getStringWithoutLengthAscii(secondaryTradeReportRefIDOffset, secondaryTradeReportRefIDLength);
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final CharSequence value)
    {
        if (toBytes(value, secondaryTradeReportRefID))
        {
            secondaryTradeReportRefIDInternalBuffer = secondaryTradeReportRefID.byteArray();
        }
        secondaryTradeReportRefIDOffset = 0;
        secondaryTradeReportRefIDLength = value.length();
        return this;
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryTradeReportRefID.wrap(buffer);
            secondaryTradeReportRefIDOffset = value.offset();
            secondaryTradeReportRefIDLength = value.length();
        }
        return this;
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final char[] value)
    {
        return secondaryTradeReportRefID(value, 0, value.length);
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final char[] value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    /* SecondaryTradeReportRefID = 881 */
    public TradeCaptureReportEncoder secondaryTradeReportRefID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryTradeReportRefID, offset, length))
        {
            secondaryTradeReportRefIDInternalBuffer = secondaryTradeReportRefID.byteArray();
        }
        secondaryTradeReportRefIDOffset = 0;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportID = new UnsafeBuffer();
    private byte[] secondaryTradeReportIDInternalBuffer = secondaryTradeReportID.byteArray();
    private int secondaryTradeReportIDOffset = 0;
    private int secondaryTradeReportIDLength = 0;

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportID(final DirectBuffer value)
    {
        return secondaryTradeReportID(value, 0, value.capacity());
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder secondaryTradeReportID(final byte[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportID(final byte[] value)
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
    public TradeCaptureReportEncoder secondaryTradeReportID(final CharSequence value)
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
    public TradeCaptureReportEncoder secondaryTradeReportID(final AsciiSequenceView value)
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
    public TradeCaptureReportEncoder secondaryTradeReportID(final char[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportID(final char[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportEncoder secondaryTradeReportID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryTradeReportID, offset, length))
        {
            secondaryTradeReportIDInternalBuffer = secondaryTradeReportID.byteArray();
        }
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeLinkID = new UnsafeBuffer();
    private byte[] tradeLinkIDInternalBuffer = tradeLinkID.byteArray();
    private int tradeLinkIDOffset = 0;
    private int tradeLinkIDLength = 0;

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final DirectBuffer value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final DirectBuffer value)
    {
        return tradeLinkID(value, 0, value.capacity());
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final byte[] value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeLinkID, value, offset, length))
        {
            tradeLinkIDInternalBuffer = tradeLinkID.byteArray();
        }
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = length;
        return this;
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final byte[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final byte[] value)
    {
        return tradeLinkID(value, 0, value.length);
    }

    /* TradeLinkID = 820 */
    public boolean hasTradeLinkID()
    {
        return tradeLinkIDLength > 0;
    }

    /* TradeLinkID = 820 */
    public MutableDirectBuffer tradeLinkID()
    {
        return tradeLinkID;
    }

    /* TradeLinkID = 820 */
    public String tradeLinkIDAsString()
    {
        return tradeLinkID.getStringWithoutLengthAscii(tradeLinkIDOffset, tradeLinkIDLength);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final CharSequence value)
    {
        if (toBytes(value, tradeLinkID))
        {
            tradeLinkIDInternalBuffer = tradeLinkID.byteArray();
        }
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = value.length();
        return this;
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeLinkID.wrap(buffer);
            tradeLinkIDOffset = value.offset();
            tradeLinkIDLength = value.length();
        }
        return this;
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final char[] value)
    {
        return tradeLinkID(value, 0, value.length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final char[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportEncoder tradeLinkID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeLinkID, offset, length))
        {
            tradeLinkIDInternalBuffer = tradeLinkID.byteArray();
        }
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer trdMatchID = new UnsafeBuffer();
    private byte[] trdMatchIDInternalBuffer = trdMatchID.byteArray();
    private int trdMatchIDOffset = 0;
    private int trdMatchIDLength = 0;

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final DirectBuffer value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final DirectBuffer value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final DirectBuffer value)
    {
        return trdMatchID(value, 0, value.capacity());
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final byte[] value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(trdMatchID, value, offset, length))
        {
            trdMatchIDInternalBuffer = trdMatchID.byteArray();
        }
        trdMatchIDOffset = 0;
        trdMatchIDLength = length;
        return this;
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final byte[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final byte[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    /* TrdMatchID = 880 */
    public boolean hasTrdMatchID()
    {
        return trdMatchIDLength > 0;
    }

    /* TrdMatchID = 880 */
    public MutableDirectBuffer trdMatchID()
    {
        return trdMatchID;
    }

    /* TrdMatchID = 880 */
    public String trdMatchIDAsString()
    {
        return trdMatchID.getStringWithoutLengthAscii(trdMatchIDOffset, trdMatchIDLength);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final CharSequence value)
    {
        if (toBytes(value, trdMatchID))
        {
            trdMatchIDInternalBuffer = trdMatchID.byteArray();
        }
        trdMatchIDOffset = 0;
        trdMatchIDLength = value.length();
        return this;
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            trdMatchID.wrap(buffer);
            trdMatchIDOffset = value.offset();
            trdMatchIDLength = value.length();
        }
        return this;
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final char[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final char[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportEncoder trdMatchID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, trdMatchID, offset, length))
        {
            trdMatchIDInternalBuffer = trdMatchID.byteArray();
        }
        trdMatchIDOffset = 0;
        trdMatchIDLength = length;
        return this;
    }

    private final MutableDirectBuffer execID = new UnsafeBuffer();
    private byte[] execIDInternalBuffer = execID.byteArray();
    private int execIDOffset = 0;
    private int execIDLength = 0;

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execID(final byte[] value)
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
    public TradeCaptureReportEncoder execID(final CharSequence value)
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
    public TradeCaptureReportEncoder execID(final AsciiSequenceView value)
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
    public TradeCaptureReportEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportEncoder execID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, execID, offset, length))
        {
            execIDInternalBuffer = execID.byteArray();
        }
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    private char ordStatus;

    private boolean hasOrdStatus;

    public boolean hasOrdStatus()
    {
        return hasOrdStatus;
    }

    /* OrdStatus = 39 */
    public TradeCaptureReportEncoder ordStatus(char value)
    {
        ordStatus = value;
        hasOrdStatus = true;
        return this;
    }

    /* OrdStatus = 39 */
    public char ordStatus()
    {
        return ordStatus;
    }

    public TradeCaptureReportEncoder ordStatus(OrdStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordStatus Value: " + value );
            }
            if (value == OrdStatus.NULL_VAL)
            {
                return this;
            }
        }
        return ordStatus(value.representation());
    }

    private final MutableDirectBuffer secondaryExecID = new UnsafeBuffer();
    private byte[] secondaryExecIDInternalBuffer = secondaryExecID.byteArray();
    private int secondaryExecIDOffset = 0;
    private int secondaryExecIDLength = 0;

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final DirectBuffer value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final DirectBuffer value)
    {
        return secondaryExecID(value, 0, value.capacity());
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final byte[] value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(secondaryExecID, value, offset, length))
        {
            secondaryExecIDInternalBuffer = secondaryExecID.byteArray();
        }
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = length;
        return this;
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final byte[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final byte[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    /* SecondaryExecID = 527 */
    public boolean hasSecondaryExecID()
    {
        return secondaryExecIDLength > 0;
    }

    /* SecondaryExecID = 527 */
    public MutableDirectBuffer secondaryExecID()
    {
        return secondaryExecID;
    }

    /* SecondaryExecID = 527 */
    public String secondaryExecIDAsString()
    {
        return secondaryExecID.getStringWithoutLengthAscii(secondaryExecIDOffset, secondaryExecIDLength);
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final CharSequence value)
    {
        if (toBytes(value, secondaryExecID))
        {
            secondaryExecIDInternalBuffer = secondaryExecID.byteArray();
        }
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = value.length();
        return this;
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryExecID.wrap(buffer);
            secondaryExecIDOffset = value.offset();
            secondaryExecIDLength = value.length();
        }
        return this;
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final char[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final char[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    /* SecondaryExecID = 527 */
    public TradeCaptureReportEncoder secondaryExecID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryExecID, offset, length))
        {
            secondaryExecIDInternalBuffer = secondaryExecID.byteArray();
        }
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = length;
        return this;
    }

    private int execRestatementReason;

    private boolean hasExecRestatementReason;

    public boolean hasExecRestatementReason()
    {
        return hasExecRestatementReason;
    }

    /* ExecRestatementReason = 378 */
    public TradeCaptureReportEncoder execRestatementReason(int value)
    {
        execRestatementReason = value;
        hasExecRestatementReason = true;
        return this;
    }

    /* ExecRestatementReason = 378 */
    public int execRestatementReason()
    {
        return execRestatementReason;
    }

    public TradeCaptureReportEncoder execRestatementReason(ExecRestatementReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExecRestatementReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: execRestatementReason Value: " + value );
            }
            if (value == ExecRestatementReason.NULL_VAL)
            {
                return this;
            }
        }
        return execRestatementReason(value.representation());
    }

    private boolean previouslyReported;

    private boolean hasPreviouslyReported;

    public boolean hasPreviouslyReported()
    {
        return hasPreviouslyReported;
    }

    /* PreviouslyReported = 570 */
    public TradeCaptureReportEncoder previouslyReported(boolean value)
    {
        previouslyReported = value;
        hasPreviouslyReported = true;
        return this;
    }

    /* PreviouslyReported = 570 */
    public boolean previouslyReported()
    {
        return previouslyReported;
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    /* PriceType = 423 */
    public TradeCaptureReportEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    /* PriceType = 423 */
    public int priceType()
    {
        return priceType;
    }

    public TradeCaptureReportEncoder priceType(PriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceType Value: " + value );
            }
            if (value == PriceType.NULL_VAL)
            {
                return this;
            }
        }
        return priceType(value.representation());
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

    private final OrderQtyDataEncoder orderQtyData = new OrderQtyDataEncoder();
    public OrderQtyDataEncoder orderQtyData()
    {
        return orderQtyData;
    }

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    /* QtyType = 854 */
    public TradeCaptureReportEncoder qtyType(int value)
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

    public TradeCaptureReportEncoder qtyType(QtyType value)
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

    private final YieldDataEncoder yieldData = new YieldDataEncoder();
    public YieldDataEncoder yieldData()
    {
        return yieldData;
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
    public TradeCaptureReportEncoder noUnderlyingsGroupCounter(int value)
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

    private final MutableDirectBuffer underlyingTradingSessionID = new UnsafeBuffer();
    private byte[] underlyingTradingSessionIDInternalBuffer = underlyingTradingSessionID.byteArray();
    private int underlyingTradingSessionIDOffset = 0;
    private int underlyingTradingSessionIDLength = 0;

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingTradingSessionID.wrap(value);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final DirectBuffer value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final DirectBuffer value)
    {
        return underlyingTradingSessionID(value, 0, value.capacity());
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final byte[] value, final int offset, final int length)
    {
        underlyingTradingSessionID.wrap(value);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingTradingSessionID, value, offset, length))
        {
            underlyingTradingSessionIDInternalBuffer = underlyingTradingSessionID.byteArray();
        }
        underlyingTradingSessionIDOffset = 0;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final byte[] value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final byte[] value)
    {
        return underlyingTradingSessionID(value, 0, value.length);
    }

    /* UnderlyingTradingSessionID = 822 */
    public boolean hasUnderlyingTradingSessionID()
    {
        return underlyingTradingSessionIDLength > 0;
    }

    /* UnderlyingTradingSessionID = 822 */
    public MutableDirectBuffer underlyingTradingSessionID()
    {
        return underlyingTradingSessionID;
    }

    /* UnderlyingTradingSessionID = 822 */
    public String underlyingTradingSessionIDAsString()
    {
        return underlyingTradingSessionID.getStringWithoutLengthAscii(underlyingTradingSessionIDOffset, underlyingTradingSessionIDLength);
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final CharSequence value)
    {
        if (toBytes(value, underlyingTradingSessionID))
        {
            underlyingTradingSessionIDInternalBuffer = underlyingTradingSessionID.byteArray();
        }
        underlyingTradingSessionIDOffset = 0;
        underlyingTradingSessionIDLength = value.length();
        return this;
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingTradingSessionID.wrap(buffer);
            underlyingTradingSessionIDOffset = value.offset();
            underlyingTradingSessionIDLength = value.length();
        }
        return this;
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final char[] value)
    {
        return underlyingTradingSessionID(value, 0, value.length);
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final char[] value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    /* UnderlyingTradingSessionID = 822 */
    public TradeCaptureReportEncoder underlyingTradingSessionID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingTradingSessionID, offset, length))
        {
            underlyingTradingSessionIDInternalBuffer = underlyingTradingSessionID.byteArray();
        }
        underlyingTradingSessionIDOffset = 0;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingTradingSessionSubID = new UnsafeBuffer();
    private byte[] underlyingTradingSessionSubIDInternalBuffer = underlyingTradingSessionSubID.byteArray();
    private int underlyingTradingSessionSubIDOffset = 0;
    private int underlyingTradingSessionSubIDLength = 0;

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingTradingSessionSubID.wrap(value);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final DirectBuffer value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final DirectBuffer value)
    {
        return underlyingTradingSessionSubID(value, 0, value.capacity());
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        underlyingTradingSessionSubID.wrap(value);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(underlyingTradingSessionSubID, value, offset, length))
        {
            underlyingTradingSessionSubIDInternalBuffer = underlyingTradingSessionSubID.byteArray();
        }
        underlyingTradingSessionSubIDOffset = 0;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final byte[] value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final byte[] value)
    {
        return underlyingTradingSessionSubID(value, 0, value.length);
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public boolean hasUnderlyingTradingSessionSubID()
    {
        return underlyingTradingSessionSubIDLength > 0;
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public MutableDirectBuffer underlyingTradingSessionSubID()
    {
        return underlyingTradingSessionSubID;
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public String underlyingTradingSessionSubIDAsString()
    {
        return underlyingTradingSessionSubID.getStringWithoutLengthAscii(underlyingTradingSessionSubIDOffset, underlyingTradingSessionSubIDLength);
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final CharSequence value)
    {
        if (toBytes(value, underlyingTradingSessionSubID))
        {
            underlyingTradingSessionSubIDInternalBuffer = underlyingTradingSessionSubID.byteArray();
        }
        underlyingTradingSessionSubIDOffset = 0;
        underlyingTradingSessionSubIDLength = value.length();
        return this;
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingTradingSessionSubID.wrap(buffer);
            underlyingTradingSessionSubIDOffset = value.offset();
            underlyingTradingSessionSubIDLength = value.length();
        }
        return this;
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final char[] value)
    {
        return underlyingTradingSessionSubID(value, 0, value.length);
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final char[] value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    /* UnderlyingTradingSessionSubID = 823 */
    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, underlyingTradingSessionSubID, offset, length))
        {
            underlyingTradingSessionSubIDInternalBuffer = underlyingTradingSessionSubID.byteArray();
        }
        underlyingTradingSessionSubIDOffset = 0;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    private final DecimalFloat lastQty = new DecimalFloat();

    private boolean hasLastQty;

    public boolean hasLastQty()
    {
        return hasLastQty;
    }

    /* LastQty = 32 */
    public TradeCaptureReportEncoder lastQty(ReadOnlyDecimalFloat value)
    {
        lastQty.set(value);
        hasLastQty = true;
        return this;
    }

    /* LastQty = 32 */
    public TradeCaptureReportEncoder lastQty(long value, int scale)
    {
        lastQty.set(value, scale);
        hasLastQty = true;
        return this;
    }

    /* LastQty = 32 */
    public DecimalFloat lastQty()
    {
        return lastQty;
    }

    private final DecimalFloat lastPx = new DecimalFloat();

    private boolean hasLastPx;

    public boolean hasLastPx()
    {
        return hasLastPx;
    }

    /* LastPx = 31 */
    public TradeCaptureReportEncoder lastPx(ReadOnlyDecimalFloat value)
    {
        lastPx.set(value);
        hasLastPx = true;
        return this;
    }

    /* LastPx = 31 */
    public TradeCaptureReportEncoder lastPx(long value, int scale)
    {
        lastPx.set(value, scale);
        hasLastPx = true;
        return this;
    }

    /* LastPx = 31 */
    public DecimalFloat lastPx()
    {
        return lastPx;
    }

    private final DecimalFloat lastParPx = new DecimalFloat();

    private boolean hasLastParPx;

    public boolean hasLastParPx()
    {
        return hasLastParPx;
    }

    /* LastParPx = 669 */
    public TradeCaptureReportEncoder lastParPx(ReadOnlyDecimalFloat value)
    {
        lastParPx.set(value);
        hasLastParPx = true;
        return this;
    }

    /* LastParPx = 669 */
    public TradeCaptureReportEncoder lastParPx(long value, int scale)
    {
        lastParPx.set(value, scale);
        hasLastParPx = true;
        return this;
    }

    /* LastParPx = 669 */
    public DecimalFloat lastParPx()
    {
        return lastParPx;
    }

    private final DecimalFloat lastSpotRate = new DecimalFloat();

    private boolean hasLastSpotRate;

    public boolean hasLastSpotRate()
    {
        return hasLastSpotRate;
    }

    /* LastSpotRate = 194 */
    public TradeCaptureReportEncoder lastSpotRate(ReadOnlyDecimalFloat value)
    {
        lastSpotRate.set(value);
        hasLastSpotRate = true;
        return this;
    }

    /* LastSpotRate = 194 */
    public TradeCaptureReportEncoder lastSpotRate(long value, int scale)
    {
        lastSpotRate.set(value, scale);
        hasLastSpotRate = true;
        return this;
    }

    /* LastSpotRate = 194 */
    public DecimalFloat lastSpotRate()
    {
        return lastSpotRate;
    }

    private final DecimalFloat lastForwardPoints = new DecimalFloat();

    private boolean hasLastForwardPoints;

    public boolean hasLastForwardPoints()
    {
        return hasLastForwardPoints;
    }

    /* LastForwardPoints = 195 */
    public TradeCaptureReportEncoder lastForwardPoints(ReadOnlyDecimalFloat value)
    {
        lastForwardPoints.set(value);
        hasLastForwardPoints = true;
        return this;
    }

    /* LastForwardPoints = 195 */
    public TradeCaptureReportEncoder lastForwardPoints(long value, int scale)
    {
        lastForwardPoints.set(value, scale);
        hasLastForwardPoints = true;
        return this;
    }

    /* LastForwardPoints = 195 */
    public DecimalFloat lastForwardPoints()
    {
        return lastForwardPoints;
    }

    private final MutableDirectBuffer lastMkt = new UnsafeBuffer();
    private byte[] lastMktInternalBuffer = lastMkt.byteArray();
    private int lastMktOffset = 0;
    private int lastMktLength = 0;

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMkt(final DirectBuffer value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMkt(final DirectBuffer value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMkt(final DirectBuffer value)
    {
        return lastMkt(value, 0, value.capacity());
    }

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMkt(final byte[] value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMktAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder lastMkt(final byte[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMkt(final byte[] value)
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
    public TradeCaptureReportEncoder lastMkt(final CharSequence value)
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
    public TradeCaptureReportEncoder lastMkt(final AsciiSequenceView value)
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
    public TradeCaptureReportEncoder lastMkt(final char[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMkt(final char[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    /* LastMkt = 30 */
    public TradeCaptureReportEncoder lastMkt(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, lastMkt, offset, length))
        {
            lastMktInternalBuffer = lastMkt.byteArray();
        }
        lastMktOffset = 0;
        lastMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();
    private byte[] tradeDateInternalBuffer = tradeDate.byteArray();
    private int tradeDateOffset = 0;
    private int tradeDateLength = 0;

    /* TradeDate = 75 */
    public TradeCaptureReportEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public TradeCaptureReportEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public TradeCaptureReportEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    /* TradeDate = 75 */
    public TradeCaptureReportEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public TradeCaptureReportEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public TradeCaptureReportEncoder tradeDate(final byte[] value)
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

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();
    private byte[] clearingBusinessDateInternalBuffer = clearingBusinessDate.byteArray();
    private int clearingBusinessDateOffset = 0;
    private int clearingBusinessDateLength = 0;

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportEncoder clearingBusinessDate(final byte[] value)
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

    private final DecimalFloat avgPx = new DecimalFloat();

    private boolean hasAvgPx;

    public boolean hasAvgPx()
    {
        return hasAvgPx;
    }

    /* AvgPx = 6 */
    public TradeCaptureReportEncoder avgPx(ReadOnlyDecimalFloat value)
    {
        avgPx.set(value);
        hasAvgPx = true;
        return this;
    }

    /* AvgPx = 6 */
    public TradeCaptureReportEncoder avgPx(long value, int scale)
    {
        avgPx.set(value, scale);
        hasAvgPx = true;
        return this;
    }

    /* AvgPx = 6 */
    public DecimalFloat avgPx()
    {
        return avgPx;
    }

    private final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = new SpreadOrBenchmarkCurveDataEncoder();
    public SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData()
    {
        return spreadOrBenchmarkCurveData;
    }

    private int avgPxIndicator;

    private boolean hasAvgPxIndicator;

    public boolean hasAvgPxIndicator()
    {
        return hasAvgPxIndicator;
    }

    /* AvgPxIndicator = 819 */
    public TradeCaptureReportEncoder avgPxIndicator(int value)
    {
        avgPxIndicator = value;
        hasAvgPxIndicator = true;
        return this;
    }

    /* AvgPxIndicator = 819 */
    public int avgPxIndicator()
    {
        return avgPxIndicator;
    }

    public TradeCaptureReportEncoder avgPxIndicator(AvgPxIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AvgPxIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: avgPxIndicator Value: " + value );
            }
            if (value == AvgPxIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return avgPxIndicator(value.representation());
    }

    private final PositionAmountDataEncoder positionAmountData = new PositionAmountDataEncoder();
    public PositionAmountDataEncoder positionAmountData()
    {
        return positionAmountData;
    }

    private char multiLegReportingType;

    private boolean hasMultiLegReportingType;

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }

    /* MultiLegReportingType = 442 */
    public TradeCaptureReportEncoder multiLegReportingType(char value)
    {
        multiLegReportingType = value;
        hasMultiLegReportingType = true;
        return this;
    }

    /* MultiLegReportingType = 442 */
    public char multiLegReportingType()
    {
        return multiLegReportingType;
    }

    public TradeCaptureReportEncoder multiLegReportingType(MultiLegReportingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultiLegReportingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multiLegReportingType Value: " + value );
            }
            if (value == MultiLegReportingType.NULL_VAL)
            {
                return this;
            }
        }
        return multiLegReportingType(value.representation());
    }

    private final MutableDirectBuffer tradeLegRefID = new UnsafeBuffer();
    private byte[] tradeLegRefIDInternalBuffer = tradeLegRefID.byteArray();
    private int tradeLegRefIDOffset = 0;
    private int tradeLegRefIDLength = 0;

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLegRefID.wrap(value);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final DirectBuffer value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final DirectBuffer value)
    {
        return tradeLegRefID(value, 0, value.capacity());
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final byte[] value, final int offset, final int length)
    {
        tradeLegRefID.wrap(value);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeLegRefID, value, offset, length))
        {
            tradeLegRefIDInternalBuffer = tradeLegRefID.byteArray();
        }
        tradeLegRefIDOffset = 0;
        tradeLegRefIDLength = length;
        return this;
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final byte[] value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final byte[] value)
    {
        return tradeLegRefID(value, 0, value.length);
    }

    /* TradeLegRefID = 824 */
    public boolean hasTradeLegRefID()
    {
        return tradeLegRefIDLength > 0;
    }

    /* TradeLegRefID = 824 */
    public MutableDirectBuffer tradeLegRefID()
    {
        return tradeLegRefID;
    }

    /* TradeLegRefID = 824 */
    public String tradeLegRefIDAsString()
    {
        return tradeLegRefID.getStringWithoutLengthAscii(tradeLegRefIDOffset, tradeLegRefIDLength);
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final CharSequence value)
    {
        if (toBytes(value, tradeLegRefID))
        {
            tradeLegRefIDInternalBuffer = tradeLegRefID.byteArray();
        }
        tradeLegRefIDOffset = 0;
        tradeLegRefIDLength = value.length();
        return this;
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeLegRefID.wrap(buffer);
            tradeLegRefIDOffset = value.offset();
            tradeLegRefIDLength = value.length();
        }
        return this;
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final char[] value)
    {
        return tradeLegRefID(value, 0, value.length);
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final char[] value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    /* TradeLegRefID = 824 */
    public TradeCaptureReportEncoder tradeLegRefID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeLegRefID, offset, length))
        {
            tradeLegRefIDInternalBuffer = tradeLegRefID.byteArray();
        }
        tradeLegRefIDOffset = 0;
        tradeLegRefIDLength = length;
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

    private static final int legQtyHeaderLength = 4;
    private static final byte[] legQtyHeader = new byte[] {54, 56, 55, (byte) '='};

    private static final int legSwapTypeHeaderLength = 4;
    private static final byte[] legSwapTypeHeader = new byte[] {54, 57, 48, (byte) '='};

    private static final int legPositionEffectHeaderLength = 4;
    private static final byte[] legPositionEffectHeader = new byte[] {53, 54, 52, (byte) '='};

    private static final int legCoveredOrUncoveredHeaderLength = 4;
    private static final byte[] legCoveredOrUncoveredHeader = new byte[] {53, 54, 53, (byte) '='};

    private static final int legRefIDHeaderLength = 4;
    private static final byte[] legRefIDHeader = new byte[] {54, 53, 52, (byte) '='};

    private static final int legPriceHeaderLength = 4;
    private static final byte[] legPriceHeader = new byte[] {53, 54, 54, (byte) '='};

    private static final int legSettlTypeHeaderLength = 4;
    private static final byte[] legSettlTypeHeader = new byte[] {53, 56, 55, (byte) '='};

    private static final int legSettlDateHeaderLength = 4;
    private static final byte[] legSettlDateHeader = new byte[] {53, 56, 56, (byte) '='};

    private static final int legLastPxHeaderLength = 4;
    private static final byte[] legLastPxHeader = new byte[] {54, 51, 55, (byte) '='};

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    private final DecimalFloat legQty = new DecimalFloat();

    private boolean hasLegQty;

    public boolean hasLegQty()
    {
        return hasLegQty;
    }

    /* LegQty = 687 */
    public LegsGroupEncoder legQty(ReadOnlyDecimalFloat value)
    {
        legQty.set(value);
        hasLegQty = true;
        return this;
    }

    /* LegQty = 687 */
    public LegsGroupEncoder legQty(long value, int scale)
    {
        legQty.set(value, scale);
        hasLegQty = true;
        return this;
    }

    /* LegQty = 687 */
    public DecimalFloat legQty()
    {
        return legQty;
    }

    private int legSwapType;

    private boolean hasLegSwapType;

    public boolean hasLegSwapType()
    {
        return hasLegSwapType;
    }

    /* LegSwapType = 690 */
    public LegsGroupEncoder legSwapType(int value)
    {
        legSwapType = value;
        hasLegSwapType = true;
        return this;
    }

    /* LegSwapType = 690 */
    public int legSwapType()
    {
        return legSwapType;
    }

    public LegsGroupEncoder legSwapType(LegSwapType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LegSwapType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: legSwapType Value: " + value );
            }
            if (value == LegSwapType.NULL_VAL)
            {
                return this;
            }
        }
        return legSwapType(value.representation());
    }

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
    }

    private char legPositionEffect;

    private boolean hasLegPositionEffect;

    public boolean hasLegPositionEffect()
    {
        return hasLegPositionEffect;
    }

    /* LegPositionEffect = 564 */
    public LegsGroupEncoder legPositionEffect(char value)
    {
        legPositionEffect = value;
        hasLegPositionEffect = true;
        return this;
    }

    /* LegPositionEffect = 564 */
    public char legPositionEffect()
    {
        return legPositionEffect;
    }

    private int legCoveredOrUncovered;

    private boolean hasLegCoveredOrUncovered;

    public boolean hasLegCoveredOrUncovered()
    {
        return hasLegCoveredOrUncovered;
    }

    /* LegCoveredOrUncovered = 565 */
    public LegsGroupEncoder legCoveredOrUncovered(int value)
    {
        legCoveredOrUncovered = value;
        hasLegCoveredOrUncovered = true;
        return this;
    }

    /* LegCoveredOrUncovered = 565 */
    public int legCoveredOrUncovered()
    {
        return legCoveredOrUncovered;
    }

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    private final MutableDirectBuffer legRefID = new UnsafeBuffer();
    private byte[] legRefIDInternalBuffer = legRefID.byteArray();
    private int legRefIDOffset = 0;
    private int legRefIDLength = 0;

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final DirectBuffer value, final int offset, final int length)
    {
        legRefID.wrap(value);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final DirectBuffer value, final int length)
    {
        return legRefID(value, 0, length);
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final DirectBuffer value)
    {
        return legRefID(value, 0, value.capacity());
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final byte[] value, final int offset, final int length)
    {
        legRefID.wrap(value);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(legRefID, value, offset, length))
        {
            legRefIDInternalBuffer = legRefID.byteArray();
        }
        legRefIDOffset = 0;
        legRefIDLength = length;
        return this;
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final byte[] value, final int length)
    {
        return legRefID(value, 0, length);
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final byte[] value)
    {
        return legRefID(value, 0, value.length);
    }

    /* LegRefID = 654 */
    public boolean hasLegRefID()
    {
        return legRefIDLength > 0;
    }

    /* LegRefID = 654 */
    public MutableDirectBuffer legRefID()
    {
        return legRefID;
    }

    /* LegRefID = 654 */
    public String legRefIDAsString()
    {
        return legRefID.getStringWithoutLengthAscii(legRefIDOffset, legRefIDLength);
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final CharSequence value)
    {
        if (toBytes(value, legRefID))
        {
            legRefIDInternalBuffer = legRefID.byteArray();
        }
        legRefIDOffset = 0;
        legRefIDLength = value.length();
        return this;
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legRefID.wrap(buffer);
            legRefIDOffset = value.offset();
            legRefIDLength = value.length();
        }
        return this;
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final char[] value)
    {
        return legRefID(value, 0, value.length);
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final char[] value, final int length)
    {
        return legRefID(value, 0, length);
    }

    /* LegRefID = 654 */
    public LegsGroupEncoder legRefID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, legRefID, offset, length))
        {
            legRefIDInternalBuffer = legRefID.byteArray();
        }
        legRefIDOffset = 0;
        legRefIDLength = length;
        return this;
    }

    private final DecimalFloat legPrice = new DecimalFloat();

    private boolean hasLegPrice;

    public boolean hasLegPrice()
    {
        return hasLegPrice;
    }

    /* LegPrice = 566 */
    public LegsGroupEncoder legPrice(ReadOnlyDecimalFloat value)
    {
        legPrice.set(value);
        hasLegPrice = true;
        return this;
    }

    /* LegPrice = 566 */
    public LegsGroupEncoder legPrice(long value, int scale)
    {
        legPrice.set(value, scale);
        hasLegPrice = true;
        return this;
    }

    /* LegPrice = 566 */
    public DecimalFloat legPrice()
    {
        return legPrice;
    }

    private char legSettlType;

    private boolean hasLegSettlType;

    public boolean hasLegSettlType()
    {
        return hasLegSettlType;
    }

    /* LegSettlType = 587 */
    public LegsGroupEncoder legSettlType(char value)
    {
        legSettlType = value;
        hasLegSettlType = true;
        return this;
    }

    /* LegSettlType = 587 */
    public char legSettlType()
    {
        return legSettlType;
    }

    private final MutableDirectBuffer legSettlDate = new UnsafeBuffer();
    private byte[] legSettlDateInternalBuffer = legSettlDate.byteArray();
    private int legSettlDateOffset = 0;
    private int legSettlDateLength = 0;

    /* LegSettlDate = 588 */
    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    /* LegSettlDate = 588 */
    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    /* LegSettlDate = 588 */
    public LegsGroupEncoder legSettlDate(final DirectBuffer value)
    {
        return legSettlDate(value, 0, value.capacity());
    }

    /* LegSettlDate = 588 */
    public LegsGroupEncoder legSettlDate(final byte[] value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    /* LegSettlDate = 588 */
    public LegsGroupEncoder legSettlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(legSettlDate, value, offset, length))
        {
            legSettlDateInternalBuffer = legSettlDate.byteArray();
        }
        legSettlDateOffset = 0;
        legSettlDateLength = length;
        return this;
    }

    /* LegSettlDate = 588 */
    public LegsGroupEncoder legSettlDate(final byte[] value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    /* LegSettlDate = 588 */
    public LegsGroupEncoder legSettlDate(final byte[] value)
    {
        return legSettlDate(value, 0, value.length);
    }

    /* LegSettlDate = 588 */
    public boolean hasLegSettlDate()
    {
        return legSettlDateLength > 0;
    }

    /* LegSettlDate = 588 */
    public MutableDirectBuffer legSettlDate()
    {
        return legSettlDate;
    }

    /* LegSettlDate = 588 */
    public String legSettlDateAsString()
    {
        return legSettlDate.getStringWithoutLengthAscii(legSettlDateOffset, legSettlDateLength);
    }

    private final DecimalFloat legLastPx = new DecimalFloat();

    private boolean hasLegLastPx;

    public boolean hasLegLastPx()
    {
        return hasLegLastPx;
    }

    /* LegLastPx = 637 */
    public LegsGroupEncoder legLastPx(ReadOnlyDecimalFloat value)
    {
        legLastPx.set(value);
        hasLegLastPx = true;
        return this;
    }

    /* LegLastPx = 637 */
    public LegsGroupEncoder legLastPx(long value, int scale)
    {
        legLastPx.set(value, scale);
        hasLegLastPx = true;
        return this;
    }

    /* LegLastPx = 637 */
    public DecimalFloat legLastPx()
    {
        return legLastPx;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);

        if (hasLegQty)
        {
            buffer.putBytes(position, legQtyHeader, 0, legQtyHeaderLength);
            position += legQtyHeaderLength;
            position += buffer.putFloatAscii(position, legQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSwapType)
        {
            buffer.putBytes(position, legSwapTypeHeader, 0, legSwapTypeHeaderLength);
            position += legSwapTypeHeaderLength;
            position += buffer.putIntAscii(position, legSwapType);
            buffer.putSeparator(position);
            position++;
        }

            position += legStipulations.encode(buffer, position);

        if (hasLegPositionEffect)
        {
            buffer.putBytes(position, legPositionEffectHeader, 0, legPositionEffectHeaderLength);
            position += legPositionEffectHeaderLength;
            position += buffer.putCharAscii(position, legPositionEffect);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegCoveredOrUncovered)
        {
            buffer.putBytes(position, legCoveredOrUncoveredHeader, 0, legCoveredOrUncoveredHeaderLength);
            position += legCoveredOrUncoveredHeaderLength;
            position += buffer.putIntAscii(position, legCoveredOrUncovered);
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties.encode(buffer, position);

        if (legRefIDLength > 0)
        {
            buffer.putBytes(position, legRefIDHeader, 0, legRefIDHeaderLength);
            position += legRefIDHeaderLength;
            buffer.putBytes(position, legRefID, legRefIDOffset, legRefIDLength);
            position += legRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegPrice)
        {
            buffer.putBytes(position, legPriceHeader, 0, legPriceHeaderLength);
            position += legPriceHeaderLength;
            position += buffer.putFloatAscii(position, legPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSettlType)
        {
            buffer.putBytes(position, legSettlTypeHeader, 0, legSettlTypeHeaderLength);
            position += legSettlTypeHeaderLength;
            position += buffer.putCharAscii(position, legSettlType);
            buffer.putSeparator(position);
            position++;
        }

        if (legSettlDateLength > 0)
        {
            buffer.putBytes(position, legSettlDateHeader, 0, legSettlDateHeaderLength);
            position += legSettlDateHeaderLength;
            buffer.putBytes(position, legSettlDate, legSettlDateOffset, legSettlDateLength);
            position += legSettlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegLastPx)
        {
            buffer.putBytes(position, legLastPxHeader, 0, legLastPxHeaderLength);
            position += legLastPxHeaderLength;
            position += buffer.putFloatAscii(position, legLastPx);
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
        this.resetLegQty();
        this.resetLegSwapType();
        this.resetLegPositionEffect();
        this.resetLegCoveredOrUncovered();
        this.resetLegRefID();
        this.resetLegPrice();
        this.resetLegSettlType();
        this.resetLegSettlDate();
        this.resetLegLastPx();
        instrumentLeg.reset();
        legStipulations.reset();
        nestedParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegQty()
    {
        hasLegQty = false;
    }

    public void resetLegSwapType()
    {
        hasLegSwapType = false;
    }

    public void resetLegPositionEffect()
    {
        hasLegPositionEffect = false;
    }

    public void resetLegCoveredOrUncovered()
    {
        hasLegCoveredOrUncovered = false;
    }

    public void resetLegRefID()
    {
        legRefIDLength = 0;
        legRefID.wrap(legRefIDInternalBuffer);
    }

    public void resetLegPrice()
    {
        hasLegPrice = false;
    }

    public void resetLegSettlType()
    {
        hasLegSettlType = false;
    }

    public void resetLegSettlDate()
    {
        legSettlDateLength = 0;
        legSettlDate.wrap(legSettlDateInternalBuffer);
    }

    public void resetLegLastPx()
    {
        hasLegLastPx = false;
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

        if (hasLegQty())
        {
            indent(builder, level);
            builder.append("\"LegQty\": \"");
            legQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSwapType())
        {
            indent(builder, level);
            builder.append("\"LegSwapType\": \"");
            builder.append(legSwapType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegPositionEffect())
        {
            indent(builder, level);
            builder.append("\"LegPositionEffect\": \"");
            builder.append(legPositionEffect);
            builder.append("\",\n");
        }

        if (hasLegCoveredOrUncovered())
        {
            indent(builder, level);
            builder.append("\"LegCoveredOrUncovered\": \"");
            builder.append(legCoveredOrUncovered);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegRefID())
        {
            indent(builder, level);
            builder.append("\"LegRefID\": \"");
            appendBuffer(builder, legRefID, legRefIDOffset, legRefIDLength);
            builder.append("\",\n");
        }

        if (hasLegPrice())
        {
            indent(builder, level);
            builder.append("\"LegPrice\": \"");
            legPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSettlType())
        {
            indent(builder, level);
            builder.append("\"LegSettlType\": \"");
            builder.append(legSettlType);
            builder.append("\",\n");
        }

        if (hasLegSettlDate())
        {
            indent(builder, level);
            builder.append("\"LegSettlDate\": \"");
            appendBuffer(builder, legSettlDate, legSettlDateOffset, legSettlDateLength);
            builder.append("\",\n");
        }

        if (hasLegLastPx())
        {
            indent(builder, level);
            builder.append("\"LegLastPx\": \"");
            legLastPx.appendTo(builder);
            builder.append("\",\n");
        }
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

        instrumentLeg.copyTo(encoder.instrumentLeg());
        if (hasLegQty())
        {
            encoder.legQty(this.legQty());
        }

        if (hasLegSwapType())
        {
            encoder.legSwapType(this.legSwapType());
        }


        legStipulations.copyTo(encoder.legStipulations());
        if (hasLegPositionEffect())
        {
            encoder.legPositionEffect(this.legPositionEffect());
        }

        if (hasLegCoveredOrUncovered())
        {
            encoder.legCoveredOrUncovered(this.legCoveredOrUncovered());
        }


        nestedParties.copyTo(encoder.nestedParties());
        if (hasLegRefID())
        {
            encoder.legRefIDAsCopy(legRefID.byteArray(), 0, legRefIDLength);
        }

        if (hasLegPrice())
        {
            encoder.legPrice(this.legPrice());
        }

        if (hasLegSettlType())
        {
            encoder.legSettlType(this.legSettlType());
        }

        if (hasLegSettlDate())
        {
            encoder.legSettlDateAsCopy(legSettlDate.byteArray(), 0, legSettlDateLength);
        }

        if (hasLegLastPx())
        {
            encoder.legLastPx(this.legLastPx());
        }
        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    /* NoLegsGroupCounter = 555 */
    public TradeCaptureReportEncoder noLegsGroupCounter(int value)
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

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();
    private byte[] transactTimeInternalBuffer = transactTime.byteArray();
    private int transactTimeOffset = 0;
    private int transactTimeLength = 0;

    /* TransactTime = 60 */
    public TradeCaptureReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public TradeCaptureReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public TradeCaptureReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public TradeCaptureReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public TradeCaptureReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public TradeCaptureReportEncoder transactTime(final byte[] value)
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

    private final TrdRegTimestampsEncoder trdRegTimestamps = new TrdRegTimestampsEncoder();
    public TrdRegTimestampsEncoder trdRegTimestamps()
    {
        return trdRegTimestamps;
    }

    private char settlType;

    private boolean hasSettlType;

    public boolean hasSettlType()
    {
        return hasSettlType;
    }

    /* SettlType = 63 */
    public TradeCaptureReportEncoder settlType(char value)
    {
        settlType = value;
        hasSettlType = true;
        return this;
    }

    /* SettlType = 63 */
    public char settlType()
    {
        return settlType;
    }

    public TradeCaptureReportEncoder settlType(SettlType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlType Value: " + value );
            }
            if (value == SettlType.NULL_VAL)
            {
                return this;
            }
        }
        return settlType(value.representation());
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();
    private byte[] settlDateInternalBuffer = settlDate.byteArray();
    private int settlDateOffset = 0;
    private int settlDateLength = 0;

    /* SettlDate = 64 */
    public TradeCaptureReportEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    /* SettlDate = 64 */
    public TradeCaptureReportEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    /* SettlDate = 64 */
    public TradeCaptureReportEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    /* SettlDate = 64 */
    public TradeCaptureReportEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    /* SettlDate = 64 */
    public TradeCaptureReportEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    /* SettlDate = 64 */
    public TradeCaptureReportEncoder settlDate(final byte[] value)
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

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    /* MatchStatus = 573 */
    public TradeCaptureReportEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    /* MatchStatus = 573 */
    public char matchStatus()
    {
        return matchStatus;
    }

    public TradeCaptureReportEncoder matchStatus(MatchStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchStatus Value: " + value );
            }
            if (value == MatchStatus.NULL_VAL)
            {
                return this;
            }
        }
        return matchStatus(value.representation());
    }

    private final MutableDirectBuffer matchType = new UnsafeBuffer();
    private byte[] matchTypeInternalBuffer = matchType.byteArray();
    private int matchTypeOffset = 0;
    private int matchTypeLength = 0;

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final DirectBuffer value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final DirectBuffer value, final int length)
    {
        return matchType(value, 0, length);
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final DirectBuffer value)
    {
        return matchType(value, 0, value.capacity());
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final byte[] value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(matchType, value, offset, length))
        {
            matchTypeInternalBuffer = matchType.byteArray();
        }
        matchTypeOffset = 0;
        matchTypeLength = length;
        return this;
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final byte[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final byte[] value)
    {
        return matchType(value, 0, value.length);
    }

    /* MatchType = 574 */
    public boolean hasMatchType()
    {
        return matchTypeLength > 0;
    }

    /* MatchType = 574 */
    public MutableDirectBuffer matchType()
    {
        return matchType;
    }

    /* MatchType = 574 */
    public String matchTypeAsString()
    {
        return matchType.getStringWithoutLengthAscii(matchTypeOffset, matchTypeLength);
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final CharSequence value)
    {
        if (toBytes(value, matchType))
        {
            matchTypeInternalBuffer = matchType.byteArray();
        }
        matchTypeOffset = 0;
        matchTypeLength = value.length();
        return this;
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            matchType.wrap(buffer);
            matchTypeOffset = value.offset();
            matchTypeLength = value.length();
        }
        return this;
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final char[] value)
    {
        return matchType(value, 0, value.length);
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final char[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    /* MatchType = 574 */
    public TradeCaptureReportEncoder matchType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, matchType, offset, length))
        {
            matchTypeInternalBuffer = matchType.byteArray();
        }
        matchTypeOffset = 0;
        matchTypeLength = length;
        return this;
    }


@Generated("uk.co.real_logic.artio")
public static class SidesGroupEncoder
{
    private SidesGroupEncoder next = null;

    public SidesGroupEncoder next()
    {
        if (next == null)
        {
            next = new SidesGroupEncoder();
        }
        return next;
    }

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int processCodeHeaderLength = 3;
    private static final byte[] processCodeHeader = new byte[] {56, 49, (byte) '='};

    private static final int oddLotHeaderLength = 4;
    private static final byte[] oddLotHeader = new byte[] {53, 55, 53, (byte) '='};

    private static final int noClearingInstructionsGroupCounterHeaderLength = 4;
    private static final byte[] noClearingInstructionsGroupCounterHeader = new byte[] {53, 55, 54, (byte) '='};

    private static final int clearingFeeIndicatorHeaderLength = 4;
    private static final byte[] clearingFeeIndicatorHeader = new byte[] {54, 51, 53, (byte) '='};

    private static final int tradeInputSourceHeaderLength = 4;
    private static final byte[] tradeInputSourceHeader = new byte[] {53, 55, 56, (byte) '='};

    private static final int tradeInputDeviceHeaderLength = 4;
    private static final byte[] tradeInputDeviceHeader = new byte[] {53, 55, 57, (byte) '='};

    private static final int orderInputDeviceHeaderLength = 4;
    private static final byte[] orderInputDeviceHeader = new byte[] {56, 50, 49, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int complianceIDHeaderLength = 4;
    private static final byte[] complianceIDHeader = new byte[] {51, 55, 54, (byte) '='};

    private static final int solicitedFlagHeaderLength = 4;
    private static final byte[] solicitedFlagHeader = new byte[] {51, 55, 55, (byte) '='};

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private static final int custOrderCapacityHeaderLength = 4;
    private static final byte[] custOrderCapacityHeader = new byte[] {53, 56, 50, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int execInstHeaderLength = 3;
    private static final byte[] execInstHeader = new byte[] {49, 56, (byte) '='};

    private static final int transBkdTimeHeaderLength = 4;
    private static final byte[] transBkdTimeHeader = new byte[] {52, 56, 51, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int timeBracketHeaderLength = 4;
    private static final byte[] timeBracketHeader = new byte[] {57, 52, 51, (byte) '='};

    private static final int grossTradeAmtHeaderLength = 4;
    private static final byte[] grossTradeAmtHeader = new byte[] {51, 56, 49, (byte) '='};

    private static final int numDaysInterestHeaderLength = 4;
    private static final byte[] numDaysInterestHeader = new byte[] {49, 53, 55, (byte) '='};

    private static final int exDateHeaderLength = 4;
    private static final byte[] exDateHeader = new byte[] {50, 51, 48, (byte) '='};

    private static final int accruedInterestRateHeaderLength = 4;
    private static final byte[] accruedInterestRateHeader = new byte[] {49, 53, 56, (byte) '='};

    private static final int accruedInterestAmtHeaderLength = 4;
    private static final byte[] accruedInterestAmtHeader = new byte[] {49, 53, 57, (byte) '='};

    private static final int interestAtMaturityHeaderLength = 4;
    private static final byte[] interestAtMaturityHeader = new byte[] {55, 51, 56, (byte) '='};

    private static final int endAccruedInterestAmtHeaderLength = 4;
    private static final byte[] endAccruedInterestAmtHeader = new byte[] {57, 50, 48, (byte) '='};

    private static final int startCashHeaderLength = 4;
    private static final byte[] startCashHeader = new byte[] {57, 50, 49, (byte) '='};

    private static final int endCashHeaderLength = 4;
    private static final byte[] endCashHeader = new byte[] {57, 50, 50, (byte) '='};

    private static final int concessionHeaderLength = 4;
    private static final byte[] concessionHeader = new byte[] {50, 51, 56, (byte) '='};

    private static final int totalTakedownHeaderLength = 4;
    private static final byte[] totalTakedownHeader = new byte[] {50, 51, 55, (byte) '='};

    private static final int netMoneyHeaderLength = 4;
    private static final byte[] netMoneyHeader = new byte[] {49, 49, 56, (byte) '='};

    private static final int settlCurrAmtHeaderLength = 4;
    private static final byte[] settlCurrAmtHeader = new byte[] {49, 49, 57, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int settlCurrFxRateHeaderLength = 4;
    private static final byte[] settlCurrFxRateHeader = new byte[] {49, 53, 53, (byte) '='};

    private static final int settlCurrFxRateCalcHeaderLength = 4;
    private static final byte[] settlCurrFxRateCalcHeader = new byte[] {49, 53, 54, (byte) '='};

    private static final int positionEffectHeaderLength = 3;
    private static final byte[] positionEffectHeader = new byte[] {55, 55, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int sideMultiLegReportingTypeHeaderLength = 4;
    private static final byte[] sideMultiLegReportingTypeHeader = new byte[] {55, 53, 50, (byte) '='};

    private static final int noContAmtsGroupCounterHeaderLength = 4;
    private static final byte[] noContAmtsGroupCounterHeader = new byte[] {53, 49, 56, (byte) '='};

    private static final int noMiscFeesGroupCounterHeaderLength = 4;
    private static final byte[] noMiscFeesGroupCounterHeader = new byte[] {49, 51, 54, (byte) '='};

    private static final int exchangeRuleHeaderLength = 4;
    private static final byte[] exchangeRuleHeader = new byte[] {56, 50, 53, (byte) '='};

    private static final int tradeAllocIndicatorHeaderLength = 4;
    private static final byte[] tradeAllocIndicatorHeader = new byte[] {56, 50, 54, (byte) '='};

    private static final int preallocMethodHeaderLength = 4;
    private static final byte[] preallocMethodHeader = new byte[] {53, 57, 49, (byte) '='};

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int noAllocsGroupCounterHeaderLength = 3;
    private static final byte[] noAllocsGroupCounterHeader = new byte[] {55, 56, (byte) '='};

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    /* Side = 54 */
    public SidesGroupEncoder side(char value)
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

    public SidesGroupEncoder side(Side value)
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

    private final MutableDirectBuffer orderID = new UnsafeBuffer();
    private byte[] orderIDInternalBuffer = orderID.byteArray();
    private int orderIDOffset = 0;
    private int orderIDLength = 0;

    /* OrderID = 37 */
    public SidesGroupEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public SidesGroupEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public SidesGroupEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    /* OrderID = 37 */
    public SidesGroupEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public SidesGroupEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public SidesGroupEncoder orderID(final byte[] value)
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
    public SidesGroupEncoder orderID(final CharSequence value)
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
    public SidesGroupEncoder orderID(final AsciiSequenceView value)
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
    public SidesGroupEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    /* OrderID = 37 */
    public SidesGroupEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public SidesGroupEncoder orderID(final char[] value, final int offset, final int length)
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
    public SidesGroupEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    /* SecondaryOrderID = 198 */
    public SidesGroupEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public SidesGroupEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    /* SecondaryOrderID = 198 */
    public SidesGroupEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    /* SecondaryOrderID = 198 */
    public SidesGroupEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public SidesGroupEncoder secondaryOrderID(final byte[] value)
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
    public SidesGroupEncoder secondaryOrderID(final CharSequence value)
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
    public SidesGroupEncoder secondaryOrderID(final AsciiSequenceView value)
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
    public SidesGroupEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    /* SecondaryOrderID = 198 */
    public SidesGroupEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    /* SecondaryOrderID = 198 */
    public SidesGroupEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryOrderID, offset, length))
        {
            secondaryOrderIDInternalBuffer = secondaryOrderID.byteArray();
        }
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();
    private byte[] clOrdIDInternalBuffer = clOrdID.byteArray();
    private int clOrdIDOffset = 0;
    private int clOrdIDLength = 0;

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdID(final byte[] value)
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
    public SidesGroupEncoder clOrdID(final CharSequence value)
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
    public SidesGroupEncoder clOrdID(final AsciiSequenceView value)
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
    public SidesGroupEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public SidesGroupEncoder clOrdID(final char[] value, final int offset, final int length)
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
    public SidesGroupEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public SidesGroupEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public SidesGroupEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    /* SecondaryClOrdID = 526 */
    public SidesGroupEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    /* SecondaryClOrdID = 526 */
    public SidesGroupEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public SidesGroupEncoder secondaryClOrdID(final byte[] value)
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
    public SidesGroupEncoder secondaryClOrdID(final CharSequence value)
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
    public SidesGroupEncoder secondaryClOrdID(final AsciiSequenceView value)
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
    public SidesGroupEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    /* SecondaryClOrdID = 526 */
    public SidesGroupEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    /* SecondaryClOrdID = 526 */
    public SidesGroupEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryClOrdID, offset, length))
        {
            secondaryClOrdIDInternalBuffer = secondaryClOrdID.byteArray();
        }
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer listID = new UnsafeBuffer();
    private byte[] listIDInternalBuffer = listID.byteArray();
    private int listIDOffset = 0;
    private int listIDLength = 0;

    /* ListID = 66 */
    public SidesGroupEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    /* ListID = 66 */
    public SidesGroupEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    /* ListID = 66 */
    public SidesGroupEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    /* ListID = 66 */
    public SidesGroupEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    /* ListID = 66 */
    public SidesGroupEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    /* ListID = 66 */
    public SidesGroupEncoder listID(final byte[] value)
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
    public SidesGroupEncoder listID(final CharSequence value)
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
    public SidesGroupEncoder listID(final AsciiSequenceView value)
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
    public SidesGroupEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    /* ListID = 66 */
    public SidesGroupEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    /* ListID = 66 */
    public SidesGroupEncoder listID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, listID, offset, length))
        {
            listIDInternalBuffer = listID.byteArray();
        }
        listIDOffset = 0;
        listIDLength = length;
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
    public SidesGroupEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public SidesGroupEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public SidesGroupEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    /* Account = 1 */
    public SidesGroupEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public SidesGroupEncoder accountAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public SidesGroupEncoder account(final byte[] value)
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
    public SidesGroupEncoder account(final CharSequence value)
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
    public SidesGroupEncoder account(final AsciiSequenceView value)
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
    public SidesGroupEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    /* Account = 1 */
    public SidesGroupEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public SidesGroupEncoder account(final char[] value, final int offset, final int length)
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
    public SidesGroupEncoder acctIDSource(int value)
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

    public SidesGroupEncoder acctIDSource(AcctIDSource value)
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
    public SidesGroupEncoder accountType(int value)
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

    public SidesGroupEncoder accountType(AccountType value)
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

    private char processCode;

    private boolean hasProcessCode;

    public boolean hasProcessCode()
    {
        return hasProcessCode;
    }

    /* ProcessCode = 81 */
    public SidesGroupEncoder processCode(char value)
    {
        processCode = value;
        hasProcessCode = true;
        return this;
    }

    /* ProcessCode = 81 */
    public char processCode()
    {
        return processCode;
    }

    public SidesGroupEncoder processCode(ProcessCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ProcessCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: processCode Value: " + value );
            }
            if (value == ProcessCode.NULL_VAL)
            {
                return this;
            }
        }
        return processCode(value.representation());
    }

    private boolean oddLot;

    private boolean hasOddLot;

    public boolean hasOddLot()
    {
        return hasOddLot;
    }

    /* OddLot = 575 */
    public SidesGroupEncoder oddLot(boolean value)
    {
        oddLot = value;
        hasOddLot = true;
        return this;
    }

    /* OddLot = 575 */
    public boolean oddLot()
    {
        return oddLot;
    }


@Generated("uk.co.real_logic.artio")
public static class ClearingInstructionsGroupEncoder
{
    private ClearingInstructionsGroupEncoder next = null;

    public ClearingInstructionsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ClearingInstructionsGroupEncoder();
        }
        return next;
    }

    private static final int clearingInstructionHeaderLength = 4;
    private static final byte[] clearingInstructionHeader = new byte[] {53, 55, 55, (byte) '='};

    private int clearingInstruction;

    private boolean hasClearingInstruction;

    public boolean hasClearingInstruction()
    {
        return hasClearingInstruction;
    }

    /* ClearingInstruction = 577 */
    public ClearingInstructionsGroupEncoder clearingInstruction(int value)
    {
        clearingInstruction = value;
        hasClearingInstruction = true;
        return this;
    }

    /* ClearingInstruction = 577 */
    public int clearingInstruction()
    {
        return clearingInstruction;
    }

    public ClearingInstructionsGroupEncoder clearingInstruction(ClearingInstruction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ClearingInstruction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: clearingInstruction Value: " + value );
            }
            if (value == ClearingInstruction.NULL_VAL)
            {
                return this;
            }
        }
        return clearingInstruction(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasClearingInstruction)
        {
            buffer.putBytes(position, clearingInstructionHeader, 0, clearingInstructionHeaderLength);
            position += clearingInstructionHeaderLength;
            position += buffer.putIntAscii(position, clearingInstruction);
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
        this.resetClearingInstruction();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetClearingInstruction()
    {
        hasClearingInstruction = false;
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
        builder.append("\"MessageName\": \"ClearingInstructionsGroup\",\n");
        if (hasClearingInstruction())
        {
            indent(builder, level);
            builder.append("\"ClearingInstruction\": \"");
            builder.append(clearingInstruction);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public ClearingInstructionsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ClearingInstructionsGroupEncoder)encoder);
    }

    public ClearingInstructionsGroupEncoder copyTo(final ClearingInstructionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClearingInstruction())
        {
            encoder.clearingInstruction(this.clearingInstruction());
        }
        return encoder;
    }

}
    private int noClearingInstructionsGroupCounter;

    private boolean hasNoClearingInstructionsGroupCounter;

    public boolean hasNoClearingInstructionsGroupCounter()
    {
        return hasNoClearingInstructionsGroupCounter;
    }

    /* NoClearingInstructionsGroupCounter = 576 */
    public SidesGroupEncoder noClearingInstructionsGroupCounter(int value)
    {
        noClearingInstructionsGroupCounter = value;
        hasNoClearingInstructionsGroupCounter = true;
        return this;
    }

    /* NoClearingInstructionsGroupCounter = 576 */
    public int noClearingInstructionsGroupCounter()
    {
        return noClearingInstructionsGroupCounter;
    }


    private ClearingInstructionsGroupEncoder clearingInstructionsGroup = null;

    public ClearingInstructionsGroupEncoder clearingInstructionsGroup(final int numberOfElements)
    {
        hasNoClearingInstructionsGroupCounter = true;
        noClearingInstructionsGroupCounter = numberOfElements;
        if (clearingInstructionsGroup == null)
        {
            clearingInstructionsGroup = new ClearingInstructionsGroupEncoder();
        }
        return clearingInstructionsGroup;
    }

    private final MutableDirectBuffer clearingFeeIndicator = new UnsafeBuffer();
    private byte[] clearingFeeIndicatorInternalBuffer = clearingFeeIndicator.byteArray();
    private int clearingFeeIndicatorOffset = 0;
    private int clearingFeeIndicatorLength = 0;

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final DirectBuffer value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final DirectBuffer value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final DirectBuffer value)
    {
        return clearingFeeIndicator(value, 0, value.capacity());
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final byte[] value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicatorAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(clearingFeeIndicator, value, offset, length))
        {
            clearingFeeIndicatorInternalBuffer = clearingFeeIndicator.byteArray();
        }
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final byte[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final byte[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    /* ClearingFeeIndicator = 635 */
    public boolean hasClearingFeeIndicator()
    {
        return clearingFeeIndicatorLength > 0;
    }

    /* ClearingFeeIndicator = 635 */
    public MutableDirectBuffer clearingFeeIndicator()
    {
        return clearingFeeIndicator;
    }

    /* ClearingFeeIndicator = 635 */
    public String clearingFeeIndicatorAsString()
    {
        return clearingFeeIndicator.getStringWithoutLengthAscii(clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final CharSequence value)
    {
        if (toBytes(value, clearingFeeIndicator))
        {
            clearingFeeIndicatorInternalBuffer = clearingFeeIndicator.byteArray();
        }
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = value.length();
        return this;
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clearingFeeIndicator.wrap(buffer);
            clearingFeeIndicatorOffset = value.offset();
            clearingFeeIndicatorLength = value.length();
        }
        return this;
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final char[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final char[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    /* ClearingFeeIndicator = 635 */
    public SidesGroupEncoder clearingFeeIndicator(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, clearingFeeIndicator, offset, length))
        {
            clearingFeeIndicatorInternalBuffer = clearingFeeIndicator.byteArray();
        }
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public SidesGroupEncoder clearingFeeIndicator(ClearingFeeIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ClearingFeeIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: clearingFeeIndicator Value: " + value );
            }
            if (value == ClearingFeeIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return clearingFeeIndicator(value.representation());
    }

    private final MutableDirectBuffer tradeInputSource = new UnsafeBuffer();
    private byte[] tradeInputSourceInternalBuffer = tradeInputSource.byteArray();
    private int tradeInputSourceOffset = 0;
    private int tradeInputSourceLength = 0;

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final DirectBuffer value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final DirectBuffer value)
    {
        return tradeInputSource(value, 0, value.capacity());
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final byte[] value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeInputSource, value, offset, length))
        {
            tradeInputSourceInternalBuffer = tradeInputSource.byteArray();
        }
        tradeInputSourceOffset = 0;
        tradeInputSourceLength = length;
        return this;
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final byte[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final byte[] value)
    {
        return tradeInputSource(value, 0, value.length);
    }

    /* TradeInputSource = 578 */
    public boolean hasTradeInputSource()
    {
        return tradeInputSourceLength > 0;
    }

    /* TradeInputSource = 578 */
    public MutableDirectBuffer tradeInputSource()
    {
        return tradeInputSource;
    }

    /* TradeInputSource = 578 */
    public String tradeInputSourceAsString()
    {
        return tradeInputSource.getStringWithoutLengthAscii(tradeInputSourceOffset, tradeInputSourceLength);
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final CharSequence value)
    {
        if (toBytes(value, tradeInputSource))
        {
            tradeInputSourceInternalBuffer = tradeInputSource.byteArray();
        }
        tradeInputSourceOffset = 0;
        tradeInputSourceLength = value.length();
        return this;
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeInputSource.wrap(buffer);
            tradeInputSourceOffset = value.offset();
            tradeInputSourceLength = value.length();
        }
        return this;
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final char[] value)
    {
        return tradeInputSource(value, 0, value.length);
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final char[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    /* TradeInputSource = 578 */
    public SidesGroupEncoder tradeInputSource(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeInputSource, offset, length))
        {
            tradeInputSourceInternalBuffer = tradeInputSource.byteArray();
        }
        tradeInputSourceOffset = 0;
        tradeInputSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeInputDevice = new UnsafeBuffer();
    private byte[] tradeInputDeviceInternalBuffer = tradeInputDevice.byteArray();
    private int tradeInputDeviceOffset = 0;
    private int tradeInputDeviceLength = 0;

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final DirectBuffer value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final DirectBuffer value)
    {
        return tradeInputDevice(value, 0, value.capacity());
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final byte[] value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDeviceAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(tradeInputDevice, value, offset, length))
        {
            tradeInputDeviceInternalBuffer = tradeInputDevice.byteArray();
        }
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = length;
        return this;
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final byte[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final byte[] value)
    {
        return tradeInputDevice(value, 0, value.length);
    }

    /* TradeInputDevice = 579 */
    public boolean hasTradeInputDevice()
    {
        return tradeInputDeviceLength > 0;
    }

    /* TradeInputDevice = 579 */
    public MutableDirectBuffer tradeInputDevice()
    {
        return tradeInputDevice;
    }

    /* TradeInputDevice = 579 */
    public String tradeInputDeviceAsString()
    {
        return tradeInputDevice.getStringWithoutLengthAscii(tradeInputDeviceOffset, tradeInputDeviceLength);
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final CharSequence value)
    {
        if (toBytes(value, tradeInputDevice))
        {
            tradeInputDeviceInternalBuffer = tradeInputDevice.byteArray();
        }
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = value.length();
        return this;
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeInputDevice.wrap(buffer);
            tradeInputDeviceOffset = value.offset();
            tradeInputDeviceLength = value.length();
        }
        return this;
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final char[] value)
    {
        return tradeInputDevice(value, 0, value.length);
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final char[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    /* TradeInputDevice = 579 */
    public SidesGroupEncoder tradeInputDevice(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeInputDevice, offset, length))
        {
            tradeInputDeviceInternalBuffer = tradeInputDevice.byteArray();
        }
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = length;
        return this;
    }

    private final MutableDirectBuffer orderInputDevice = new UnsafeBuffer();
    private byte[] orderInputDeviceInternalBuffer = orderInputDevice.byteArray();
    private int orderInputDeviceOffset = 0;
    private int orderInputDeviceLength = 0;

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final DirectBuffer value, final int offset, final int length)
    {
        orderInputDevice.wrap(value);
        orderInputDeviceOffset = offset;
        orderInputDeviceLength = length;
        return this;
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final DirectBuffer value, final int length)
    {
        return orderInputDevice(value, 0, length);
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final DirectBuffer value)
    {
        return orderInputDevice(value, 0, value.capacity());
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final byte[] value, final int offset, final int length)
    {
        orderInputDevice.wrap(value);
        orderInputDeviceOffset = offset;
        orderInputDeviceLength = length;
        return this;
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDeviceAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(orderInputDevice, value, offset, length))
        {
            orderInputDeviceInternalBuffer = orderInputDevice.byteArray();
        }
        orderInputDeviceOffset = 0;
        orderInputDeviceLength = length;
        return this;
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final byte[] value, final int length)
    {
        return orderInputDevice(value, 0, length);
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final byte[] value)
    {
        return orderInputDevice(value, 0, value.length);
    }

    /* OrderInputDevice = 821 */
    public boolean hasOrderInputDevice()
    {
        return orderInputDeviceLength > 0;
    }

    /* OrderInputDevice = 821 */
    public MutableDirectBuffer orderInputDevice()
    {
        return orderInputDevice;
    }

    /* OrderInputDevice = 821 */
    public String orderInputDeviceAsString()
    {
        return orderInputDevice.getStringWithoutLengthAscii(orderInputDeviceOffset, orderInputDeviceLength);
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final CharSequence value)
    {
        if (toBytes(value, orderInputDevice))
        {
            orderInputDeviceInternalBuffer = orderInputDevice.byteArray();
        }
        orderInputDeviceOffset = 0;
        orderInputDeviceLength = value.length();
        return this;
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderInputDevice.wrap(buffer);
            orderInputDeviceOffset = value.offset();
            orderInputDeviceLength = value.length();
        }
        return this;
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final char[] value)
    {
        return orderInputDevice(value, 0, value.length);
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final char[] value, final int length)
    {
        return orderInputDevice(value, 0, length);
    }

    /* OrderInputDevice = 821 */
    public SidesGroupEncoder orderInputDevice(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, orderInputDevice, offset, length))
        {
            orderInputDeviceInternalBuffer = orderInputDevice.byteArray();
        }
        orderInputDeviceOffset = 0;
        orderInputDeviceLength = length;
        return this;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();
    private byte[] currencyInternalBuffer = currency.byteArray();
    private int currencyOffset = 0;
    private int currencyLength = 0;

    /* Currency = 15 */
    public SidesGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public SidesGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public SidesGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    /* Currency = 15 */
    public SidesGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public SidesGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public SidesGroupEncoder currency(final byte[] value)
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
    public SidesGroupEncoder currency(final CharSequence value)
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
    public SidesGroupEncoder currency(final AsciiSequenceView value)
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
    public SidesGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public SidesGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public SidesGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, currency, offset, length))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();
    private byte[] complianceIDInternalBuffer = complianceID.byteArray();
    private int complianceIDOffset = 0;
    private int complianceIDLength = 0;

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceID(final byte[] value)
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
    public SidesGroupEncoder complianceID(final CharSequence value)
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
    public SidesGroupEncoder complianceID(final AsciiSequenceView value)
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
    public SidesGroupEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    /* ComplianceID = 376 */
    public SidesGroupEncoder complianceID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, complianceID, offset, length))
        {
            complianceIDInternalBuffer = complianceID.byteArray();
        }
        complianceIDOffset = 0;
        complianceIDLength = length;
        return this;
    }

    private boolean solicitedFlag;

    private boolean hasSolicitedFlag;

    public boolean hasSolicitedFlag()
    {
        return hasSolicitedFlag;
    }

    /* SolicitedFlag = 377 */
    public SidesGroupEncoder solicitedFlag(boolean value)
    {
        solicitedFlag = value;
        hasSolicitedFlag = true;
        return this;
    }

    /* SolicitedFlag = 377 */
    public boolean solicitedFlag()
    {
        return solicitedFlag;
    }

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    /* OrderCapacity = 528 */
    public SidesGroupEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    /* OrderCapacity = 528 */
    public char orderCapacity()
    {
        return orderCapacity;
    }

    public SidesGroupEncoder orderCapacity(OrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderCapacity Value: " + value );
            }
            if (value == OrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return orderCapacity(value.representation());
    }

    private final MutableDirectBuffer orderRestrictions = new UnsafeBuffer();
    private byte[] orderRestrictionsInternalBuffer = orderRestrictions.byteArray();
    private int orderRestrictionsOffset = 0;
    private int orderRestrictionsLength = 0;

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(orderRestrictions, value, offset, length))
        {
            orderRestrictionsInternalBuffer = orderRestrictions.byteArray();
        }
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final byte[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    /* OrderRestrictions = 529 */
    public boolean hasOrderRestrictions()
    {
        return orderRestrictionsLength > 0;
    }

    /* OrderRestrictions = 529 */
    public MutableDirectBuffer orderRestrictions()
    {
        return orderRestrictions;
    }

    /* OrderRestrictions = 529 */
    public String orderRestrictionsAsString()
    {
        return orderRestrictions.getStringWithoutLengthAscii(orderRestrictionsOffset, orderRestrictionsLength);
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final CharSequence value)
    {
        if (toBytes(value, orderRestrictions))
        {
            orderRestrictionsInternalBuffer = orderRestrictions.byteArray();
        }
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderRestrictions.wrap(buffer);
            orderRestrictionsOffset = value.offset();
            orderRestrictionsLength = value.length();
        }
        return this;
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    /* OrderRestrictions = 529 */
    public SidesGroupEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, orderRestrictions, offset, length))
        {
            orderRestrictionsInternalBuffer = orderRestrictions.byteArray();
        }
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private int custOrderCapacity;

    private boolean hasCustOrderCapacity;

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }

    /* CustOrderCapacity = 582 */
    public SidesGroupEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    /* CustOrderCapacity = 582 */
    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public SidesGroupEncoder custOrderCapacity(CustOrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CustOrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: custOrderCapacity Value: " + value );
            }
            if (value == CustOrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return custOrderCapacity(value.representation());
    }

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    /* OrdType = 40 */
    public SidesGroupEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    /* OrdType = 40 */
    public char ordType()
    {
        return ordType;
    }

    public SidesGroupEncoder ordType(OrdType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordType Value: " + value );
            }
            if (value == OrdType.NULL_VAL)
            {
                return this;
            }
        }
        return ordType(value.representation());
    }

    private final MutableDirectBuffer execInst = new UnsafeBuffer();
    private byte[] execInstInternalBuffer = execInst.byteArray();
    private int execInstOffset = 0;
    private int execInstLength = 0;

    /* ExecInst = 18 */
    public SidesGroupEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    /* ExecInst = 18 */
    public SidesGroupEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    /* ExecInst = 18 */
    public SidesGroupEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    /* ExecInst = 18 */
    public SidesGroupEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    /* ExecInst = 18 */
    public SidesGroupEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    /* ExecInst = 18 */
    public SidesGroupEncoder execInst(final byte[] value)
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
    public SidesGroupEncoder execInst(final CharSequence value)
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
    public SidesGroupEncoder execInst(final AsciiSequenceView value)
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
    public SidesGroupEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    /* ExecInst = 18 */
    public SidesGroupEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    /* ExecInst = 18 */
    public SidesGroupEncoder execInst(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, execInst, offset, length))
        {
            execInstInternalBuffer = execInst.byteArray();
        }
        execInstOffset = 0;
        execInstLength = length;
        return this;
    }

    private final MutableDirectBuffer transBkdTime = new UnsafeBuffer();
    private byte[] transBkdTimeInternalBuffer = transBkdTime.byteArray();
    private int transBkdTimeOffset = 0;
    private int transBkdTimeLength = 0;

    /* TransBkdTime = 483 */
    public SidesGroupEncoder transBkdTime(final DirectBuffer value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    /* TransBkdTime = 483 */
    public SidesGroupEncoder transBkdTime(final DirectBuffer value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    /* TransBkdTime = 483 */
    public SidesGroupEncoder transBkdTime(final DirectBuffer value)
    {
        return transBkdTime(value, 0, value.capacity());
    }

    /* TransBkdTime = 483 */
    public SidesGroupEncoder transBkdTime(final byte[] value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    /* TransBkdTime = 483 */
    public SidesGroupEncoder transBkdTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(transBkdTime, value, offset, length))
        {
            transBkdTimeInternalBuffer = transBkdTime.byteArray();
        }
        transBkdTimeOffset = 0;
        transBkdTimeLength = length;
        return this;
    }

    /* TransBkdTime = 483 */
    public SidesGroupEncoder transBkdTime(final byte[] value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    /* TransBkdTime = 483 */
    public SidesGroupEncoder transBkdTime(final byte[] value)
    {
        return transBkdTime(value, 0, value.length);
    }

    /* TransBkdTime = 483 */
    public boolean hasTransBkdTime()
    {
        return transBkdTimeLength > 0;
    }

    /* TransBkdTime = 483 */
    public MutableDirectBuffer transBkdTime()
    {
        return transBkdTime;
    }

    /* TransBkdTime = 483 */
    public String transBkdTimeAsString()
    {
        return transBkdTime.getStringWithoutLengthAscii(transBkdTimeOffset, transBkdTimeLength);
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionID(final byte[] value)
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
    public SidesGroupEncoder tradingSessionID(final CharSequence value)
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
    public SidesGroupEncoder tradingSessionID(final AsciiSequenceView value)
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
    public SidesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public SidesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public SidesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public SidesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public SidesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public SidesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public SidesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public SidesGroupEncoder tradingSessionSubID(final byte[] value)
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
    public SidesGroupEncoder tradingSessionSubID(final CharSequence value)
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
    public SidesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public SidesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public SidesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public SidesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer timeBracket = new UnsafeBuffer();
    private byte[] timeBracketInternalBuffer = timeBracket.byteArray();
    private int timeBracketOffset = 0;
    private int timeBracketLength = 0;

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final DirectBuffer value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final DirectBuffer value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final DirectBuffer value)
    {
        return timeBracket(value, 0, value.capacity());
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final byte[] value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracketAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(timeBracket, value, offset, length))
        {
            timeBracketInternalBuffer = timeBracket.byteArray();
        }
        timeBracketOffset = 0;
        timeBracketLength = length;
        return this;
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final byte[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final byte[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    /* TimeBracket = 943 */
    public boolean hasTimeBracket()
    {
        return timeBracketLength > 0;
    }

    /* TimeBracket = 943 */
    public MutableDirectBuffer timeBracket()
    {
        return timeBracket;
    }

    /* TimeBracket = 943 */
    public String timeBracketAsString()
    {
        return timeBracket.getStringWithoutLengthAscii(timeBracketOffset, timeBracketLength);
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final CharSequence value)
    {
        if (toBytes(value, timeBracket))
        {
            timeBracketInternalBuffer = timeBracket.byteArray();
        }
        timeBracketOffset = 0;
        timeBracketLength = value.length();
        return this;
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            timeBracket.wrap(buffer);
            timeBracketOffset = value.offset();
            timeBracketLength = value.length();
        }
        return this;
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final char[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final char[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    /* TimeBracket = 943 */
    public SidesGroupEncoder timeBracket(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, timeBracket, offset, length))
        {
            timeBracketInternalBuffer = timeBracket.byteArray();
        }
        timeBracketOffset = 0;
        timeBracketLength = length;
        return this;
    }

    private final CommissionDataEncoder commissionData = new CommissionDataEncoder();
    public CommissionDataEncoder commissionData()
    {
        return commissionData;
    }

    private final DecimalFloat grossTradeAmt = new DecimalFloat();

    private boolean hasGrossTradeAmt;

    public boolean hasGrossTradeAmt()
    {
        return hasGrossTradeAmt;
    }

    /* GrossTradeAmt = 381 */
    public SidesGroupEncoder grossTradeAmt(ReadOnlyDecimalFloat value)
    {
        grossTradeAmt.set(value);
        hasGrossTradeAmt = true;
        return this;
    }

    /* GrossTradeAmt = 381 */
    public SidesGroupEncoder grossTradeAmt(long value, int scale)
    {
        grossTradeAmt.set(value, scale);
        hasGrossTradeAmt = true;
        return this;
    }

    /* GrossTradeAmt = 381 */
    public DecimalFloat grossTradeAmt()
    {
        return grossTradeAmt;
    }

    private int numDaysInterest;

    private boolean hasNumDaysInterest;

    public boolean hasNumDaysInterest()
    {
        return hasNumDaysInterest;
    }

    /* NumDaysInterest = 157 */
    public SidesGroupEncoder numDaysInterest(int value)
    {
        numDaysInterest = value;
        hasNumDaysInterest = true;
        return this;
    }

    /* NumDaysInterest = 157 */
    public int numDaysInterest()
    {
        return numDaysInterest;
    }

    private final MutableDirectBuffer exDate = new UnsafeBuffer();
    private byte[] exDateInternalBuffer = exDate.byteArray();
    private int exDateOffset = 0;
    private int exDateLength = 0;

    /* ExDate = 230 */
    public SidesGroupEncoder exDate(final DirectBuffer value, final int offset, final int length)
    {
        exDate.wrap(value);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    /* ExDate = 230 */
    public SidesGroupEncoder exDate(final DirectBuffer value, final int length)
    {
        return exDate(value, 0, length);
    }

    /* ExDate = 230 */
    public SidesGroupEncoder exDate(final DirectBuffer value)
    {
        return exDate(value, 0, value.capacity());
    }

    /* ExDate = 230 */
    public SidesGroupEncoder exDate(final byte[] value, final int offset, final int length)
    {
        exDate.wrap(value);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    /* ExDate = 230 */
    public SidesGroupEncoder exDateAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(exDate, value, offset, length))
        {
            exDateInternalBuffer = exDate.byteArray();
        }
        exDateOffset = 0;
        exDateLength = length;
        return this;
    }

    /* ExDate = 230 */
    public SidesGroupEncoder exDate(final byte[] value, final int length)
    {
        return exDate(value, 0, length);
    }

    /* ExDate = 230 */
    public SidesGroupEncoder exDate(final byte[] value)
    {
        return exDate(value, 0, value.length);
    }

    /* ExDate = 230 */
    public boolean hasExDate()
    {
        return exDateLength > 0;
    }

    /* ExDate = 230 */
    public MutableDirectBuffer exDate()
    {
        return exDate;
    }

    /* ExDate = 230 */
    public String exDateAsString()
    {
        return exDate.getStringWithoutLengthAscii(exDateOffset, exDateLength);
    }

    private final DecimalFloat accruedInterestRate = new DecimalFloat();

    private boolean hasAccruedInterestRate;

    public boolean hasAccruedInterestRate()
    {
        return hasAccruedInterestRate;
    }

    /* AccruedInterestRate = 158 */
    public SidesGroupEncoder accruedInterestRate(ReadOnlyDecimalFloat value)
    {
        accruedInterestRate.set(value);
        hasAccruedInterestRate = true;
        return this;
    }

    /* AccruedInterestRate = 158 */
    public SidesGroupEncoder accruedInterestRate(long value, int scale)
    {
        accruedInterestRate.set(value, scale);
        hasAccruedInterestRate = true;
        return this;
    }

    /* AccruedInterestRate = 158 */
    public DecimalFloat accruedInterestRate()
    {
        return accruedInterestRate;
    }

    private final DecimalFloat accruedInterestAmt = new DecimalFloat();

    private boolean hasAccruedInterestAmt;

    public boolean hasAccruedInterestAmt()
    {
        return hasAccruedInterestAmt;
    }

    /* AccruedInterestAmt = 159 */
    public SidesGroupEncoder accruedInterestAmt(ReadOnlyDecimalFloat value)
    {
        accruedInterestAmt.set(value);
        hasAccruedInterestAmt = true;
        return this;
    }

    /* AccruedInterestAmt = 159 */
    public SidesGroupEncoder accruedInterestAmt(long value, int scale)
    {
        accruedInterestAmt.set(value, scale);
        hasAccruedInterestAmt = true;
        return this;
    }

    /* AccruedInterestAmt = 159 */
    public DecimalFloat accruedInterestAmt()
    {
        return accruedInterestAmt;
    }

    private final DecimalFloat interestAtMaturity = new DecimalFloat();

    private boolean hasInterestAtMaturity;

    public boolean hasInterestAtMaturity()
    {
        return hasInterestAtMaturity;
    }

    /* InterestAtMaturity = 738 */
    public SidesGroupEncoder interestAtMaturity(ReadOnlyDecimalFloat value)
    {
        interestAtMaturity.set(value);
        hasInterestAtMaturity = true;
        return this;
    }

    /* InterestAtMaturity = 738 */
    public SidesGroupEncoder interestAtMaturity(long value, int scale)
    {
        interestAtMaturity.set(value, scale);
        hasInterestAtMaturity = true;
        return this;
    }

    /* InterestAtMaturity = 738 */
    public DecimalFloat interestAtMaturity()
    {
        return interestAtMaturity;
    }

    private final DecimalFloat endAccruedInterestAmt = new DecimalFloat();

    private boolean hasEndAccruedInterestAmt;

    public boolean hasEndAccruedInterestAmt()
    {
        return hasEndAccruedInterestAmt;
    }

    /* EndAccruedInterestAmt = 920 */
    public SidesGroupEncoder endAccruedInterestAmt(ReadOnlyDecimalFloat value)
    {
        endAccruedInterestAmt.set(value);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    /* EndAccruedInterestAmt = 920 */
    public SidesGroupEncoder endAccruedInterestAmt(long value, int scale)
    {
        endAccruedInterestAmt.set(value, scale);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    /* EndAccruedInterestAmt = 920 */
    public DecimalFloat endAccruedInterestAmt()
    {
        return endAccruedInterestAmt;
    }

    private final DecimalFloat startCash = new DecimalFloat();

    private boolean hasStartCash;

    public boolean hasStartCash()
    {
        return hasStartCash;
    }

    /* StartCash = 921 */
    public SidesGroupEncoder startCash(ReadOnlyDecimalFloat value)
    {
        startCash.set(value);
        hasStartCash = true;
        return this;
    }

    /* StartCash = 921 */
    public SidesGroupEncoder startCash(long value, int scale)
    {
        startCash.set(value, scale);
        hasStartCash = true;
        return this;
    }

    /* StartCash = 921 */
    public DecimalFloat startCash()
    {
        return startCash;
    }

    private final DecimalFloat endCash = new DecimalFloat();

    private boolean hasEndCash;

    public boolean hasEndCash()
    {
        return hasEndCash;
    }

    /* EndCash = 922 */
    public SidesGroupEncoder endCash(ReadOnlyDecimalFloat value)
    {
        endCash.set(value);
        hasEndCash = true;
        return this;
    }

    /* EndCash = 922 */
    public SidesGroupEncoder endCash(long value, int scale)
    {
        endCash.set(value, scale);
        hasEndCash = true;
        return this;
    }

    /* EndCash = 922 */
    public DecimalFloat endCash()
    {
        return endCash;
    }

    private final DecimalFloat concession = new DecimalFloat();

    private boolean hasConcession;

    public boolean hasConcession()
    {
        return hasConcession;
    }

    /* Concession = 238 */
    public SidesGroupEncoder concession(ReadOnlyDecimalFloat value)
    {
        concession.set(value);
        hasConcession = true;
        return this;
    }

    /* Concession = 238 */
    public SidesGroupEncoder concession(long value, int scale)
    {
        concession.set(value, scale);
        hasConcession = true;
        return this;
    }

    /* Concession = 238 */
    public DecimalFloat concession()
    {
        return concession;
    }

    private final DecimalFloat totalTakedown = new DecimalFloat();

    private boolean hasTotalTakedown;

    public boolean hasTotalTakedown()
    {
        return hasTotalTakedown;
    }

    /* TotalTakedown = 237 */
    public SidesGroupEncoder totalTakedown(ReadOnlyDecimalFloat value)
    {
        totalTakedown.set(value);
        hasTotalTakedown = true;
        return this;
    }

    /* TotalTakedown = 237 */
    public SidesGroupEncoder totalTakedown(long value, int scale)
    {
        totalTakedown.set(value, scale);
        hasTotalTakedown = true;
        return this;
    }

    /* TotalTakedown = 237 */
    public DecimalFloat totalTakedown()
    {
        return totalTakedown;
    }

    private final DecimalFloat netMoney = new DecimalFloat();

    private boolean hasNetMoney;

    public boolean hasNetMoney()
    {
        return hasNetMoney;
    }

    /* NetMoney = 118 */
    public SidesGroupEncoder netMoney(ReadOnlyDecimalFloat value)
    {
        netMoney.set(value);
        hasNetMoney = true;
        return this;
    }

    /* NetMoney = 118 */
    public SidesGroupEncoder netMoney(long value, int scale)
    {
        netMoney.set(value, scale);
        hasNetMoney = true;
        return this;
    }

    /* NetMoney = 118 */
    public DecimalFloat netMoney()
    {
        return netMoney;
    }

    private final DecimalFloat settlCurrAmt = new DecimalFloat();

    private boolean hasSettlCurrAmt;

    public boolean hasSettlCurrAmt()
    {
        return hasSettlCurrAmt;
    }

    /* SettlCurrAmt = 119 */
    public SidesGroupEncoder settlCurrAmt(ReadOnlyDecimalFloat value)
    {
        settlCurrAmt.set(value);
        hasSettlCurrAmt = true;
        return this;
    }

    /* SettlCurrAmt = 119 */
    public SidesGroupEncoder settlCurrAmt(long value, int scale)
    {
        settlCurrAmt.set(value, scale);
        hasSettlCurrAmt = true;
        return this;
    }

    /* SettlCurrAmt = 119 */
    public DecimalFloat settlCurrAmt()
    {
        return settlCurrAmt;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();
    private byte[] settlCurrencyInternalBuffer = settlCurrency.byteArray();
    private int settlCurrencyOffset = 0;
    private int settlCurrencyLength = 0;

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlCurrency, value, offset, length))
        {
            settlCurrencyInternalBuffer = settlCurrency.byteArray();
        }
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final byte[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    /* SettlCurrency = 120 */
    public boolean hasSettlCurrency()
    {
        return settlCurrencyLength > 0;
    }

    /* SettlCurrency = 120 */
    public MutableDirectBuffer settlCurrency()
    {
        return settlCurrency;
    }

    /* SettlCurrency = 120 */
    public String settlCurrencyAsString()
    {
        return settlCurrency.getStringWithoutLengthAscii(settlCurrencyOffset, settlCurrencyLength);
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final CharSequence value)
    {
        if (toBytes(value, settlCurrency))
        {
            settlCurrencyInternalBuffer = settlCurrency.byteArray();
        }
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlCurrency.wrap(buffer);
            settlCurrencyOffset = value.offset();
            settlCurrencyLength = value.length();
        }
        return this;
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    /* SettlCurrency = 120 */
    public SidesGroupEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, settlCurrency, offset, length))
        {
            settlCurrencyInternalBuffer = settlCurrency.byteArray();
        }
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final DecimalFloat settlCurrFxRate = new DecimalFloat();

    private boolean hasSettlCurrFxRate;

    public boolean hasSettlCurrFxRate()
    {
        return hasSettlCurrFxRate;
    }

    /* SettlCurrFxRate = 155 */
    public SidesGroupEncoder settlCurrFxRate(ReadOnlyDecimalFloat value)
    {
        settlCurrFxRate.set(value);
        hasSettlCurrFxRate = true;
        return this;
    }

    /* SettlCurrFxRate = 155 */
    public SidesGroupEncoder settlCurrFxRate(long value, int scale)
    {
        settlCurrFxRate.set(value, scale);
        hasSettlCurrFxRate = true;
        return this;
    }

    /* SettlCurrFxRate = 155 */
    public DecimalFloat settlCurrFxRate()
    {
        return settlCurrFxRate;
    }

    private char settlCurrFxRateCalc;

    private boolean hasSettlCurrFxRateCalc;

    public boolean hasSettlCurrFxRateCalc()
    {
        return hasSettlCurrFxRateCalc;
    }

    /* SettlCurrFxRateCalc = 156 */
    public SidesGroupEncoder settlCurrFxRateCalc(char value)
    {
        settlCurrFxRateCalc = value;
        hasSettlCurrFxRateCalc = true;
        return this;
    }

    /* SettlCurrFxRateCalc = 156 */
    public char settlCurrFxRateCalc()
    {
        return settlCurrFxRateCalc;
    }

    public SidesGroupEncoder settlCurrFxRateCalc(SettlCurrFxRateCalc value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlCurrFxRateCalc.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlCurrFxRateCalc Value: " + value );
            }
            if (value == SettlCurrFxRateCalc.NULL_VAL)
            {
                return this;
            }
        }
        return settlCurrFxRateCalc(value.representation());
    }

    private char positionEffect;

    private boolean hasPositionEffect;

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }

    /* PositionEffect = 77 */
    public SidesGroupEncoder positionEffect(char value)
    {
        positionEffect = value;
        hasPositionEffect = true;
        return this;
    }

    /* PositionEffect = 77 */
    public char positionEffect()
    {
        return positionEffect;
    }

    public SidesGroupEncoder positionEffect(PositionEffect value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PositionEffect.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: positionEffect Value: " + value );
            }
            if (value == PositionEffect.NULL_VAL)
            {
                return this;
            }
        }
        return positionEffect(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public SidesGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public SidesGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SidesGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public SidesGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public SidesGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public SidesGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SidesGroupEncoder text(final byte[] value)
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
    public SidesGroupEncoder text(final CharSequence value)
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
    public SidesGroupEncoder text(final AsciiSequenceView value)
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
    public SidesGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public SidesGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SidesGroupEncoder text(final char[] value, final int offset, final int length)
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
    public SidesGroupEncoder encodedTextLen(int value)
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
    public SidesGroupEncoder encodedText(byte[] value)
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
    public SidesGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private int sideMultiLegReportingType;

    private boolean hasSideMultiLegReportingType;

    public boolean hasSideMultiLegReportingType()
    {
        return hasSideMultiLegReportingType;
    }

    /* SideMultiLegReportingType = 752 */
    public SidesGroupEncoder sideMultiLegReportingType(int value)
    {
        sideMultiLegReportingType = value;
        hasSideMultiLegReportingType = true;
        return this;
    }

    /* SideMultiLegReportingType = 752 */
    public int sideMultiLegReportingType()
    {
        return sideMultiLegReportingType;
    }

    public SidesGroupEncoder sideMultiLegReportingType(SideMultiLegReportingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SideMultiLegReportingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: sideMultiLegReportingType Value: " + value );
            }
            if (value == SideMultiLegReportingType.NULL_VAL)
            {
                return this;
            }
        }
        return sideMultiLegReportingType(value.representation());
    }


@Generated("uk.co.real_logic.artio")
public static class ContAmtsGroupEncoder
{
    private ContAmtsGroupEncoder next = null;

    public ContAmtsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ContAmtsGroupEncoder();
        }
        return next;
    }

    private static final int contAmtTypeHeaderLength = 4;
    private static final byte[] contAmtTypeHeader = new byte[] {53, 49, 57, (byte) '='};

    private static final int contAmtValueHeaderLength = 4;
    private static final byte[] contAmtValueHeader = new byte[] {53, 50, 48, (byte) '='};

    private static final int contAmtCurrHeaderLength = 4;
    private static final byte[] contAmtCurrHeader = new byte[] {53, 50, 49, (byte) '='};

    private int contAmtType;

    private boolean hasContAmtType;

    public boolean hasContAmtType()
    {
        return hasContAmtType;
    }

    /* ContAmtType = 519 */
    public ContAmtsGroupEncoder contAmtType(int value)
    {
        contAmtType = value;
        hasContAmtType = true;
        return this;
    }

    /* ContAmtType = 519 */
    public int contAmtType()
    {
        return contAmtType;
    }

    public ContAmtsGroupEncoder contAmtType(ContAmtType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ContAmtType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: contAmtType Value: " + value );
            }
            if (value == ContAmtType.NULL_VAL)
            {
                return this;
            }
        }
        return contAmtType(value.representation());
    }

    private final DecimalFloat contAmtValue = new DecimalFloat();

    private boolean hasContAmtValue;

    public boolean hasContAmtValue()
    {
        return hasContAmtValue;
    }

    /* ContAmtValue = 520 */
    public ContAmtsGroupEncoder contAmtValue(ReadOnlyDecimalFloat value)
    {
        contAmtValue.set(value);
        hasContAmtValue = true;
        return this;
    }

    /* ContAmtValue = 520 */
    public ContAmtsGroupEncoder contAmtValue(long value, int scale)
    {
        contAmtValue.set(value, scale);
        hasContAmtValue = true;
        return this;
    }

    /* ContAmtValue = 520 */
    public DecimalFloat contAmtValue()
    {
        return contAmtValue;
    }

    private final MutableDirectBuffer contAmtCurr = new UnsafeBuffer();
    private byte[] contAmtCurrInternalBuffer = contAmtCurr.byteArray();
    private int contAmtCurrOffset = 0;
    private int contAmtCurrLength = 0;

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final DirectBuffer value, final int offset, final int length)
    {
        contAmtCurr.wrap(value);
        contAmtCurrOffset = offset;
        contAmtCurrLength = length;
        return this;
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final DirectBuffer value, final int length)
    {
        return contAmtCurr(value, 0, length);
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final DirectBuffer value)
    {
        return contAmtCurr(value, 0, value.capacity());
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final byte[] value, final int offset, final int length)
    {
        contAmtCurr.wrap(value);
        contAmtCurrOffset = offset;
        contAmtCurrLength = length;
        return this;
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurrAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(contAmtCurr, value, offset, length))
        {
            contAmtCurrInternalBuffer = contAmtCurr.byteArray();
        }
        contAmtCurrOffset = 0;
        contAmtCurrLength = length;
        return this;
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final byte[] value, final int length)
    {
        return contAmtCurr(value, 0, length);
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final byte[] value)
    {
        return contAmtCurr(value, 0, value.length);
    }

    /* ContAmtCurr = 521 */
    public boolean hasContAmtCurr()
    {
        return contAmtCurrLength > 0;
    }

    /* ContAmtCurr = 521 */
    public MutableDirectBuffer contAmtCurr()
    {
        return contAmtCurr;
    }

    /* ContAmtCurr = 521 */
    public String contAmtCurrAsString()
    {
        return contAmtCurr.getStringWithoutLengthAscii(contAmtCurrOffset, contAmtCurrLength);
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final CharSequence value)
    {
        if (toBytes(value, contAmtCurr))
        {
            contAmtCurrInternalBuffer = contAmtCurr.byteArray();
        }
        contAmtCurrOffset = 0;
        contAmtCurrLength = value.length();
        return this;
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            contAmtCurr.wrap(buffer);
            contAmtCurrOffset = value.offset();
            contAmtCurrLength = value.length();
        }
        return this;
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final char[] value)
    {
        return contAmtCurr(value, 0, value.length);
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final char[] value, final int length)
    {
        return contAmtCurr(value, 0, length);
    }

    /* ContAmtCurr = 521 */
    public ContAmtsGroupEncoder contAmtCurr(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, contAmtCurr, offset, length))
        {
            contAmtCurrInternalBuffer = contAmtCurr.byteArray();
        }
        contAmtCurrOffset = 0;
        contAmtCurrLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasContAmtType)
        {
            buffer.putBytes(position, contAmtTypeHeader, 0, contAmtTypeHeaderLength);
            position += contAmtTypeHeaderLength;
            position += buffer.putIntAscii(position, contAmtType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasContAmtValue)
        {
            buffer.putBytes(position, contAmtValueHeader, 0, contAmtValueHeaderLength);
            position += contAmtValueHeaderLength;
            position += buffer.putFloatAscii(position, contAmtValue);
            buffer.putSeparator(position);
            position++;
        }

        if (contAmtCurrLength > 0)
        {
            buffer.putBytes(position, contAmtCurrHeader, 0, contAmtCurrHeaderLength);
            position += contAmtCurrHeaderLength;
            buffer.putBytes(position, contAmtCurr, contAmtCurrOffset, contAmtCurrLength);
            position += contAmtCurrLength;
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
        this.resetContAmtType();
        this.resetContAmtValue();
        this.resetContAmtCurr();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetContAmtType()
    {
        hasContAmtType = false;
    }

    public void resetContAmtValue()
    {
        hasContAmtValue = false;
    }

    public void resetContAmtCurr()
    {
        contAmtCurrLength = 0;
        contAmtCurr.wrap(contAmtCurrInternalBuffer);
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
        builder.append("\"MessageName\": \"ContAmtsGroup\",\n");
        if (hasContAmtType())
        {
            indent(builder, level);
            builder.append("\"ContAmtType\": \"");
            builder.append(contAmtType);
            builder.append("\",\n");
        }

        if (hasContAmtValue())
        {
            indent(builder, level);
            builder.append("\"ContAmtValue\": \"");
            contAmtValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasContAmtCurr())
        {
            indent(builder, level);
            builder.append("\"ContAmtCurr\": \"");
            appendBuffer(builder, contAmtCurr, contAmtCurrOffset, contAmtCurrLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public ContAmtsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ContAmtsGroupEncoder)encoder);
    }

    public ContAmtsGroupEncoder copyTo(final ContAmtsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasContAmtType())
        {
            encoder.contAmtType(this.contAmtType());
        }

        if (hasContAmtValue())
        {
            encoder.contAmtValue(this.contAmtValue());
        }

        if (hasContAmtCurr())
        {
            encoder.contAmtCurrAsCopy(contAmtCurr.byteArray(), 0, contAmtCurrLength);
        }
        return encoder;
    }

}
    private int noContAmtsGroupCounter;

    private boolean hasNoContAmtsGroupCounter;

    public boolean hasNoContAmtsGroupCounter()
    {
        return hasNoContAmtsGroupCounter;
    }

    /* NoContAmtsGroupCounter = 518 */
    public SidesGroupEncoder noContAmtsGroupCounter(int value)
    {
        noContAmtsGroupCounter = value;
        hasNoContAmtsGroupCounter = true;
        return this;
    }

    /* NoContAmtsGroupCounter = 518 */
    public int noContAmtsGroupCounter()
    {
        return noContAmtsGroupCounter;
    }


    private ContAmtsGroupEncoder contAmtsGroup = null;

    public ContAmtsGroupEncoder contAmtsGroup(final int numberOfElements)
    {
        hasNoContAmtsGroupCounter = true;
        noContAmtsGroupCounter = numberOfElements;
        if (contAmtsGroup == null)
        {
            contAmtsGroup = new ContAmtsGroupEncoder();
        }
        return contAmtsGroup;
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }


@Generated("uk.co.real_logic.artio")
public static class MiscFeesGroupEncoder
{
    private MiscFeesGroupEncoder next = null;

    public MiscFeesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MiscFeesGroupEncoder();
        }
        return next;
    }

    private static final int miscFeeAmtHeaderLength = 4;
    private static final byte[] miscFeeAmtHeader = new byte[] {49, 51, 55, (byte) '='};

    private static final int miscFeeCurrHeaderLength = 4;
    private static final byte[] miscFeeCurrHeader = new byte[] {49, 51, 56, (byte) '='};

    private static final int miscFeeTypeHeaderLength = 4;
    private static final byte[] miscFeeTypeHeader = new byte[] {49, 51, 57, (byte) '='};

    private static final int miscFeeBasisHeaderLength = 4;
    private static final byte[] miscFeeBasisHeader = new byte[] {56, 57, 49, (byte) '='};

    private final DecimalFloat miscFeeAmt = new DecimalFloat();

    private boolean hasMiscFeeAmt;

    public boolean hasMiscFeeAmt()
    {
        return hasMiscFeeAmt;
    }

    /* MiscFeeAmt = 137 */
    public MiscFeesGroupEncoder miscFeeAmt(ReadOnlyDecimalFloat value)
    {
        miscFeeAmt.set(value);
        hasMiscFeeAmt = true;
        return this;
    }

    /* MiscFeeAmt = 137 */
    public MiscFeesGroupEncoder miscFeeAmt(long value, int scale)
    {
        miscFeeAmt.set(value, scale);
        hasMiscFeeAmt = true;
        return this;
    }

    /* MiscFeeAmt = 137 */
    public DecimalFloat miscFeeAmt()
    {
        return miscFeeAmt;
    }

    private final MutableDirectBuffer miscFeeCurr = new UnsafeBuffer();
    private byte[] miscFeeCurrInternalBuffer = miscFeeCurr.byteArray();
    private int miscFeeCurrOffset = 0;
    private int miscFeeCurrLength = 0;

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final DirectBuffer value, final int offset, final int length)
    {
        miscFeeCurr.wrap(value);
        miscFeeCurrOffset = offset;
        miscFeeCurrLength = length;
        return this;
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final DirectBuffer value, final int length)
    {
        return miscFeeCurr(value, 0, length);
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final DirectBuffer value)
    {
        return miscFeeCurr(value, 0, value.capacity());
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final byte[] value, final int offset, final int length)
    {
        miscFeeCurr.wrap(value);
        miscFeeCurrOffset = offset;
        miscFeeCurrLength = length;
        return this;
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurrAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(miscFeeCurr, value, offset, length))
        {
            miscFeeCurrInternalBuffer = miscFeeCurr.byteArray();
        }
        miscFeeCurrOffset = 0;
        miscFeeCurrLength = length;
        return this;
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final byte[] value, final int length)
    {
        return miscFeeCurr(value, 0, length);
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final byte[] value)
    {
        return miscFeeCurr(value, 0, value.length);
    }

    /* MiscFeeCurr = 138 */
    public boolean hasMiscFeeCurr()
    {
        return miscFeeCurrLength > 0;
    }

    /* MiscFeeCurr = 138 */
    public MutableDirectBuffer miscFeeCurr()
    {
        return miscFeeCurr;
    }

    /* MiscFeeCurr = 138 */
    public String miscFeeCurrAsString()
    {
        return miscFeeCurr.getStringWithoutLengthAscii(miscFeeCurrOffset, miscFeeCurrLength);
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final CharSequence value)
    {
        if (toBytes(value, miscFeeCurr))
        {
            miscFeeCurrInternalBuffer = miscFeeCurr.byteArray();
        }
        miscFeeCurrOffset = 0;
        miscFeeCurrLength = value.length();
        return this;
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            miscFeeCurr.wrap(buffer);
            miscFeeCurrOffset = value.offset();
            miscFeeCurrLength = value.length();
        }
        return this;
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final char[] value)
    {
        return miscFeeCurr(value, 0, value.length);
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final char[] value, final int length)
    {
        return miscFeeCurr(value, 0, length);
    }

    /* MiscFeeCurr = 138 */
    public MiscFeesGroupEncoder miscFeeCurr(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, miscFeeCurr, offset, length))
        {
            miscFeeCurrInternalBuffer = miscFeeCurr.byteArray();
        }
        miscFeeCurrOffset = 0;
        miscFeeCurrLength = length;
        return this;
    }

    private final MutableDirectBuffer miscFeeType = new UnsafeBuffer();
    private byte[] miscFeeTypeInternalBuffer = miscFeeType.byteArray();
    private int miscFeeTypeOffset = 0;
    private int miscFeeTypeLength = 0;

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final DirectBuffer value, final int offset, final int length)
    {
        miscFeeType.wrap(value);
        miscFeeTypeOffset = offset;
        miscFeeTypeLength = length;
        return this;
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final DirectBuffer value, final int length)
    {
        return miscFeeType(value, 0, length);
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final DirectBuffer value)
    {
        return miscFeeType(value, 0, value.capacity());
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final byte[] value, final int offset, final int length)
    {
        miscFeeType.wrap(value);
        miscFeeTypeOffset = offset;
        miscFeeTypeLength = length;
        return this;
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(miscFeeType, value, offset, length))
        {
            miscFeeTypeInternalBuffer = miscFeeType.byteArray();
        }
        miscFeeTypeOffset = 0;
        miscFeeTypeLength = length;
        return this;
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final byte[] value, final int length)
    {
        return miscFeeType(value, 0, length);
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final byte[] value)
    {
        return miscFeeType(value, 0, value.length);
    }

    /* MiscFeeType = 139 */
    public boolean hasMiscFeeType()
    {
        return miscFeeTypeLength > 0;
    }

    /* MiscFeeType = 139 */
    public MutableDirectBuffer miscFeeType()
    {
        return miscFeeType;
    }

    /* MiscFeeType = 139 */
    public String miscFeeTypeAsString()
    {
        return miscFeeType.getStringWithoutLengthAscii(miscFeeTypeOffset, miscFeeTypeLength);
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final CharSequence value)
    {
        if (toBytes(value, miscFeeType))
        {
            miscFeeTypeInternalBuffer = miscFeeType.byteArray();
        }
        miscFeeTypeOffset = 0;
        miscFeeTypeLength = value.length();
        return this;
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            miscFeeType.wrap(buffer);
            miscFeeTypeOffset = value.offset();
            miscFeeTypeLength = value.length();
        }
        return this;
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final char[] value)
    {
        return miscFeeType(value, 0, value.length);
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final char[] value, final int length)
    {
        return miscFeeType(value, 0, length);
    }

    /* MiscFeeType = 139 */
    public MiscFeesGroupEncoder miscFeeType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, miscFeeType, offset, length))
        {
            miscFeeTypeInternalBuffer = miscFeeType.byteArray();
        }
        miscFeeTypeOffset = 0;
        miscFeeTypeLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeType(MiscFeeType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MiscFeeType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: miscFeeType Value: " + value );
            }
            if (value == MiscFeeType.NULL_VAL)
            {
                return this;
            }
        }
        return miscFeeType(value.representation());
    }

    private int miscFeeBasis;

    private boolean hasMiscFeeBasis;

    public boolean hasMiscFeeBasis()
    {
        return hasMiscFeeBasis;
    }

    /* MiscFeeBasis = 891 */
    public MiscFeesGroupEncoder miscFeeBasis(int value)
    {
        miscFeeBasis = value;
        hasMiscFeeBasis = true;
        return this;
    }

    /* MiscFeeBasis = 891 */
    public int miscFeeBasis()
    {
        return miscFeeBasis;
    }

    public MiscFeesGroupEncoder miscFeeBasis(MiscFeeBasis value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MiscFeeBasis.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: miscFeeBasis Value: " + value );
            }
            if (value == MiscFeeBasis.NULL_VAL)
            {
                return this;
            }
        }
        return miscFeeBasis(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasMiscFeeAmt)
        {
            buffer.putBytes(position, miscFeeAmtHeader, 0, miscFeeAmtHeaderLength);
            position += miscFeeAmtHeaderLength;
            position += buffer.putFloatAscii(position, miscFeeAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (miscFeeCurrLength > 0)
        {
            buffer.putBytes(position, miscFeeCurrHeader, 0, miscFeeCurrHeaderLength);
            position += miscFeeCurrHeaderLength;
            buffer.putBytes(position, miscFeeCurr, miscFeeCurrOffset, miscFeeCurrLength);
            position += miscFeeCurrLength;
            buffer.putSeparator(position);
            position++;
        }

        if (miscFeeTypeLength > 0)
        {
            buffer.putBytes(position, miscFeeTypeHeader, 0, miscFeeTypeHeaderLength);
            position += miscFeeTypeHeaderLength;
            buffer.putBytes(position, miscFeeType, miscFeeTypeOffset, miscFeeTypeLength);
            position += miscFeeTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMiscFeeBasis)
        {
            buffer.putBytes(position, miscFeeBasisHeader, 0, miscFeeBasisHeaderLength);
            position += miscFeeBasisHeaderLength;
            position += buffer.putIntAscii(position, miscFeeBasis);
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
        this.resetMiscFeeAmt();
        this.resetMiscFeeCurr();
        this.resetMiscFeeType();
        this.resetMiscFeeBasis();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMiscFeeAmt()
    {
        hasMiscFeeAmt = false;
    }

    public void resetMiscFeeCurr()
    {
        miscFeeCurrLength = 0;
        miscFeeCurr.wrap(miscFeeCurrInternalBuffer);
    }

    public void resetMiscFeeType()
    {
        miscFeeTypeLength = 0;
        miscFeeType.wrap(miscFeeTypeInternalBuffer);
    }

    public void resetMiscFeeBasis()
    {
        hasMiscFeeBasis = false;
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
        builder.append("\"MessageName\": \"MiscFeesGroup\",\n");
        if (hasMiscFeeAmt())
        {
            indent(builder, level);
            builder.append("\"MiscFeeAmt\": \"");
            miscFeeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMiscFeeCurr())
        {
            indent(builder, level);
            builder.append("\"MiscFeeCurr\": \"");
            appendBuffer(builder, miscFeeCurr, miscFeeCurrOffset, miscFeeCurrLength);
            builder.append("\",\n");
        }

        if (hasMiscFeeType())
        {
            indent(builder, level);
            builder.append("\"MiscFeeType\": \"");
            appendBuffer(builder, miscFeeType, miscFeeTypeOffset, miscFeeTypeLength);
            builder.append("\",\n");
        }

        if (hasMiscFeeBasis())
        {
            indent(builder, level);
            builder.append("\"MiscFeeBasis\": \"");
            builder.append(miscFeeBasis);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public MiscFeesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MiscFeesGroupEncoder)encoder);
    }

    public MiscFeesGroupEncoder copyTo(final MiscFeesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMiscFeeAmt())
        {
            encoder.miscFeeAmt(this.miscFeeAmt());
        }

        if (hasMiscFeeCurr())
        {
            encoder.miscFeeCurrAsCopy(miscFeeCurr.byteArray(), 0, miscFeeCurrLength);
        }

        if (hasMiscFeeType())
        {
            encoder.miscFeeTypeAsCopy(miscFeeType.byteArray(), 0, miscFeeTypeLength);
        }

        if (hasMiscFeeBasis())
        {
            encoder.miscFeeBasis(this.miscFeeBasis());
        }
        return encoder;
    }

}
    private int noMiscFeesGroupCounter;

    private boolean hasNoMiscFeesGroupCounter;

    public boolean hasNoMiscFeesGroupCounter()
    {
        return hasNoMiscFeesGroupCounter;
    }

    /* NoMiscFeesGroupCounter = 136 */
    public SidesGroupEncoder noMiscFeesGroupCounter(int value)
    {
        noMiscFeesGroupCounter = value;
        hasNoMiscFeesGroupCounter = true;
        return this;
    }

    /* NoMiscFeesGroupCounter = 136 */
    public int noMiscFeesGroupCounter()
    {
        return noMiscFeesGroupCounter;
    }


    private MiscFeesGroupEncoder miscFeesGroup = null;

    public MiscFeesGroupEncoder miscFeesGroup(final int numberOfElements)
    {
        hasNoMiscFeesGroupCounter = true;
        noMiscFeesGroupCounter = numberOfElements;
        if (miscFeesGroup == null)
        {
            miscFeesGroup = new MiscFeesGroupEncoder();
        }
        return miscFeesGroup;
    }

    private final MutableDirectBuffer exchangeRule = new UnsafeBuffer();
    private byte[] exchangeRuleInternalBuffer = exchangeRule.byteArray();
    private int exchangeRuleOffset = 0;
    private int exchangeRuleLength = 0;

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final DirectBuffer value, final int offset, final int length)
    {
        exchangeRule.wrap(value);
        exchangeRuleOffset = offset;
        exchangeRuleLength = length;
        return this;
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final DirectBuffer value, final int length)
    {
        return exchangeRule(value, 0, length);
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final DirectBuffer value)
    {
        return exchangeRule(value, 0, value.capacity());
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final byte[] value, final int offset, final int length)
    {
        exchangeRule.wrap(value);
        exchangeRuleOffset = offset;
        exchangeRuleLength = length;
        return this;
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRuleAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(exchangeRule, value, offset, length))
        {
            exchangeRuleInternalBuffer = exchangeRule.byteArray();
        }
        exchangeRuleOffset = 0;
        exchangeRuleLength = length;
        return this;
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final byte[] value, final int length)
    {
        return exchangeRule(value, 0, length);
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final byte[] value)
    {
        return exchangeRule(value, 0, value.length);
    }

    /* ExchangeRule = 825 */
    public boolean hasExchangeRule()
    {
        return exchangeRuleLength > 0;
    }

    /* ExchangeRule = 825 */
    public MutableDirectBuffer exchangeRule()
    {
        return exchangeRule;
    }

    /* ExchangeRule = 825 */
    public String exchangeRuleAsString()
    {
        return exchangeRule.getStringWithoutLengthAscii(exchangeRuleOffset, exchangeRuleLength);
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final CharSequence value)
    {
        if (toBytes(value, exchangeRule))
        {
            exchangeRuleInternalBuffer = exchangeRule.byteArray();
        }
        exchangeRuleOffset = 0;
        exchangeRuleLength = value.length();
        return this;
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            exchangeRule.wrap(buffer);
            exchangeRuleOffset = value.offset();
            exchangeRuleLength = value.length();
        }
        return this;
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final char[] value)
    {
        return exchangeRule(value, 0, value.length);
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final char[] value, final int length)
    {
        return exchangeRule(value, 0, length);
    }

    /* ExchangeRule = 825 */
    public SidesGroupEncoder exchangeRule(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, exchangeRule, offset, length))
        {
            exchangeRuleInternalBuffer = exchangeRule.byteArray();
        }
        exchangeRuleOffset = 0;
        exchangeRuleLength = length;
        return this;
    }

    private int tradeAllocIndicator;

    private boolean hasTradeAllocIndicator;

    public boolean hasTradeAllocIndicator()
    {
        return hasTradeAllocIndicator;
    }

    /* TradeAllocIndicator = 826 */
    public SidesGroupEncoder tradeAllocIndicator(int value)
    {
        tradeAllocIndicator = value;
        hasTradeAllocIndicator = true;
        return this;
    }

    /* TradeAllocIndicator = 826 */
    public int tradeAllocIndicator()
    {
        return tradeAllocIndicator;
    }

    public SidesGroupEncoder tradeAllocIndicator(TradeAllocIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeAllocIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeAllocIndicator Value: " + value );
            }
            if (value == TradeAllocIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return tradeAllocIndicator(value.representation());
    }

    private char preallocMethod;

    private boolean hasPreallocMethod;

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }

    /* PreallocMethod = 591 */
    public SidesGroupEncoder preallocMethod(char value)
    {
        preallocMethod = value;
        hasPreallocMethod = true;
        return this;
    }

    /* PreallocMethod = 591 */
    public char preallocMethod()
    {
        return preallocMethod;
    }

    public SidesGroupEncoder preallocMethod(PreallocMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PreallocMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: preallocMethod Value: " + value );
            }
            if (value == PreallocMethod.NULL_VAL)
            {
                return this;
            }
        }
        return preallocMethod(value.representation());
    }

    private final MutableDirectBuffer allocID = new UnsafeBuffer();
    private byte[] allocIDInternalBuffer = allocID.byteArray();
    private int allocIDOffset = 0;
    private int allocIDLength = 0;

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(allocID, value, offset, length))
        {
            allocIDInternalBuffer = allocID.byteArray();
        }
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final byte[] value)
    {
        return allocID(value, 0, value.length);
    }

    /* AllocID = 70 */
    public boolean hasAllocID()
    {
        return allocIDLength > 0;
    }

    /* AllocID = 70 */
    public MutableDirectBuffer allocID()
    {
        return allocID;
    }

    /* AllocID = 70 */
    public String allocIDAsString()
    {
        return allocID.getStringWithoutLengthAscii(allocIDOffset, allocIDLength);
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final CharSequence value)
    {
        if (toBytes(value, allocID))
        {
            allocIDInternalBuffer = allocID.byteArray();
        }
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocID.wrap(buffer);
            allocIDOffset = value.offset();
            allocIDLength = value.length();
        }
        return this;
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    /* AllocID = 70 */
    public SidesGroupEncoder allocID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, allocID, offset, length))
        {
            allocIDInternalBuffer = allocID.byteArray();
        }
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }


@Generated("uk.co.real_logic.artio")
public static class AllocsGroupEncoder
{
    private AllocsGroupEncoder next = null;

    public AllocsGroupEncoder next()
    {
        if (next == null)
        {
            next = new AllocsGroupEncoder();
        }
        return next;
    }

    private static final int allocAccountHeaderLength = 3;
    private static final byte[] allocAccountHeader = new byte[] {55, 57, (byte) '='};

    private static final int allocAcctIDSourceHeaderLength = 4;
    private static final byte[] allocAcctIDSourceHeader = new byte[] {54, 54, 49, (byte) '='};

    private static final int allocSettlCurrencyHeaderLength = 4;
    private static final byte[] allocSettlCurrencyHeader = new byte[] {55, 51, 54, (byte) '='};

    private static final int individualAllocIDHeaderLength = 4;
    private static final byte[] individualAllocIDHeader = new byte[] {52, 54, 55, (byte) '='};

    private static final int allocQtyHeaderLength = 3;
    private static final byte[] allocQtyHeader = new byte[] {56, 48, (byte) '='};

    private final MutableDirectBuffer allocAccount = new UnsafeBuffer();
    private byte[] allocAccountInternalBuffer = allocAccount.byteArray();
    private int allocAccountOffset = 0;
    private int allocAccountLength = 0;

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final DirectBuffer value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final DirectBuffer value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final DirectBuffer value)
    {
        return allocAccount(value, 0, value.capacity());
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final byte[] value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccountAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(allocAccount, value, offset, length))
        {
            allocAccountInternalBuffer = allocAccount.byteArray();
        }
        allocAccountOffset = 0;
        allocAccountLength = length;
        return this;
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final byte[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final byte[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    /* AllocAccount = 79 */
    public boolean hasAllocAccount()
    {
        return allocAccountLength > 0;
    }

    /* AllocAccount = 79 */
    public MutableDirectBuffer allocAccount()
    {
        return allocAccount;
    }

    /* AllocAccount = 79 */
    public String allocAccountAsString()
    {
        return allocAccount.getStringWithoutLengthAscii(allocAccountOffset, allocAccountLength);
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final CharSequence value)
    {
        if (toBytes(value, allocAccount))
        {
            allocAccountInternalBuffer = allocAccount.byteArray();
        }
        allocAccountOffset = 0;
        allocAccountLength = value.length();
        return this;
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocAccount.wrap(buffer);
            allocAccountOffset = value.offset();
            allocAccountLength = value.length();
        }
        return this;
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final char[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final char[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    /* AllocAccount = 79 */
    public AllocsGroupEncoder allocAccount(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, allocAccount, offset, length))
        {
            allocAccountInternalBuffer = allocAccount.byteArray();
        }
        allocAccountOffset = 0;
        allocAccountLength = length;
        return this;
    }

    private int allocAcctIDSource;

    private boolean hasAllocAcctIDSource;

    public boolean hasAllocAcctIDSource()
    {
        return hasAllocAcctIDSource;
    }

    /* AllocAcctIDSource = 661 */
    public AllocsGroupEncoder allocAcctIDSource(int value)
    {
        allocAcctIDSource = value;
        hasAllocAcctIDSource = true;
        return this;
    }

    /* AllocAcctIDSource = 661 */
    public int allocAcctIDSource()
    {
        return allocAcctIDSource;
    }

    private final MutableDirectBuffer allocSettlCurrency = new UnsafeBuffer();
    private byte[] allocSettlCurrencyInternalBuffer = allocSettlCurrency.byteArray();
    private int allocSettlCurrencyOffset = 0;
    private int allocSettlCurrencyLength = 0;

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        allocSettlCurrency.wrap(value);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value)
    {
        return allocSettlCurrency(value, 0, value.capacity());
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final byte[] value, final int offset, final int length)
    {
        allocSettlCurrency.wrap(value);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(allocSettlCurrency, value, offset, length))
        {
            allocSettlCurrencyInternalBuffer = allocSettlCurrency.byteArray();
        }
        allocSettlCurrencyOffset = 0;
        allocSettlCurrencyLength = length;
        return this;
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final byte[] value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final byte[] value)
    {
        return allocSettlCurrency(value, 0, value.length);
    }

    /* AllocSettlCurrency = 736 */
    public boolean hasAllocSettlCurrency()
    {
        return allocSettlCurrencyLength > 0;
    }

    /* AllocSettlCurrency = 736 */
    public MutableDirectBuffer allocSettlCurrency()
    {
        return allocSettlCurrency;
    }

    /* AllocSettlCurrency = 736 */
    public String allocSettlCurrencyAsString()
    {
        return allocSettlCurrency.getStringWithoutLengthAscii(allocSettlCurrencyOffset, allocSettlCurrencyLength);
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final CharSequence value)
    {
        if (toBytes(value, allocSettlCurrency))
        {
            allocSettlCurrencyInternalBuffer = allocSettlCurrency.byteArray();
        }
        allocSettlCurrencyOffset = 0;
        allocSettlCurrencyLength = value.length();
        return this;
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocSettlCurrency.wrap(buffer);
            allocSettlCurrencyOffset = value.offset();
            allocSettlCurrencyLength = value.length();
        }
        return this;
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final char[] value)
    {
        return allocSettlCurrency(value, 0, value.length);
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final char[] value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    /* AllocSettlCurrency = 736 */
    public AllocsGroupEncoder allocSettlCurrency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, allocSettlCurrency, offset, length))
        {
            allocSettlCurrencyInternalBuffer = allocSettlCurrency.byteArray();
        }
        allocSettlCurrencyOffset = 0;
        allocSettlCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer individualAllocID = new UnsafeBuffer();
    private byte[] individualAllocIDInternalBuffer = individualAllocID.byteArray();
    private int individualAllocIDOffset = 0;
    private int individualAllocIDLength = 0;

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final DirectBuffer value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final DirectBuffer value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final DirectBuffer value)
    {
        return individualAllocID(value, 0, value.capacity());
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final byte[] value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(individualAllocID, value, offset, length))
        {
            individualAllocIDInternalBuffer = individualAllocID.byteArray();
        }
        individualAllocIDOffset = 0;
        individualAllocIDLength = length;
        return this;
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final byte[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final byte[] value)
    {
        return individualAllocID(value, 0, value.length);
    }

    /* IndividualAllocID = 467 */
    public boolean hasIndividualAllocID()
    {
        return individualAllocIDLength > 0;
    }

    /* IndividualAllocID = 467 */
    public MutableDirectBuffer individualAllocID()
    {
        return individualAllocID;
    }

    /* IndividualAllocID = 467 */
    public String individualAllocIDAsString()
    {
        return individualAllocID.getStringWithoutLengthAscii(individualAllocIDOffset, individualAllocIDLength);
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final CharSequence value)
    {
        if (toBytes(value, individualAllocID))
        {
            individualAllocIDInternalBuffer = individualAllocID.byteArray();
        }
        individualAllocIDOffset = 0;
        individualAllocIDLength = value.length();
        return this;
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            individualAllocID.wrap(buffer);
            individualAllocIDOffset = value.offset();
            individualAllocIDLength = value.length();
        }
        return this;
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final char[] value)
    {
        return individualAllocID(value, 0, value.length);
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final char[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    /* IndividualAllocID = 467 */
    public AllocsGroupEncoder individualAllocID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, individualAllocID, offset, length))
        {
            individualAllocIDInternalBuffer = individualAllocID.byteArray();
        }
        individualAllocIDOffset = 0;
        individualAllocIDLength = length;
        return this;
    }

    private final NestedParties2Encoder nestedParties2 = new NestedParties2Encoder();
    public NestedParties2Encoder nestedParties2()
    {
        return nestedParties2;
    }

    private final DecimalFloat allocQty = new DecimalFloat();

    private boolean hasAllocQty;

    public boolean hasAllocQty()
    {
        return hasAllocQty;
    }

    /* AllocQty = 80 */
    public AllocsGroupEncoder allocQty(ReadOnlyDecimalFloat value)
    {
        allocQty.set(value);
        hasAllocQty = true;
        return this;
    }

    /* AllocQty = 80 */
    public AllocsGroupEncoder allocQty(long value, int scale)
    {
        allocQty.set(value, scale);
        hasAllocQty = true;
        return this;
    }

    /* AllocQty = 80 */
    public DecimalFloat allocQty()
    {
        return allocQty;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (allocAccountLength > 0)
        {
            buffer.putBytes(position, allocAccountHeader, 0, allocAccountHeaderLength);
            position += allocAccountHeaderLength;
            buffer.putBytes(position, allocAccount, allocAccountOffset, allocAccountLength);
            position += allocAccountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocAcctIDSource)
        {
            buffer.putBytes(position, allocAcctIDSourceHeader, 0, allocAcctIDSourceHeaderLength);
            position += allocAcctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, allocAcctIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (allocSettlCurrencyLength > 0)
        {
            buffer.putBytes(position, allocSettlCurrencyHeader, 0, allocSettlCurrencyHeaderLength);
            position += allocSettlCurrencyHeaderLength;
            buffer.putBytes(position, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            position += allocSettlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (individualAllocIDLength > 0)
        {
            buffer.putBytes(position, individualAllocIDHeader, 0, individualAllocIDHeaderLength);
            position += individualAllocIDHeaderLength;
            buffer.putBytes(position, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            position += individualAllocIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties2.encode(buffer, position);

        if (hasAllocQty)
        {
            buffer.putBytes(position, allocQtyHeader, 0, allocQtyHeaderLength);
            position += allocQtyHeaderLength;
            position += buffer.putFloatAscii(position, allocQty);
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
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetAllocSettlCurrency();
        this.resetIndividualAllocID();
        this.resetAllocQty();
        nestedParties2.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetAllocAccount()
    {
        allocAccountLength = 0;
        allocAccount.wrap(allocAccountInternalBuffer);
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetAllocSettlCurrency()
    {
        allocSettlCurrencyLength = 0;
        allocSettlCurrency.wrap(allocSettlCurrencyInternalBuffer);
    }

    public void resetIndividualAllocID()
    {
        individualAllocIDLength = 0;
        individualAllocID.wrap(individualAllocIDInternalBuffer);
    }

    public void resetAllocQty()
    {
        hasAllocQty = false;
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
        builder.append("\"MessageName\": \"AllocsGroup\",\n");
        if (hasAllocAccount())
        {
            indent(builder, level);
            builder.append("\"AllocAccount\": \"");
            appendBuffer(builder, allocAccount, allocAccountOffset, allocAccountLength);
            builder.append("\",\n");
        }

        if (hasAllocAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AllocAcctIDSource\": \"");
            builder.append(allocAcctIDSource);
            builder.append("\",\n");
        }

        if (hasAllocSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"AllocSettlCurrency\": \"");
            appendBuffer(builder, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            appendBuffer(builder, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties2\": ");
    nestedParties2.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAllocQty())
        {
            indent(builder, level);
            builder.append("\"AllocQty\": \"");
            allocQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public AllocsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AllocsGroupEncoder)encoder);
    }

    public AllocsGroupEncoder copyTo(final AllocsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAllocAccount())
        {
            encoder.allocAccountAsCopy(allocAccount.byteArray(), 0, allocAccountLength);
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasAllocSettlCurrency())
        {
            encoder.allocSettlCurrencyAsCopy(allocSettlCurrency.byteArray(), 0, allocSettlCurrencyLength);
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }


        nestedParties2.copyTo(encoder.nestedParties2());
        if (hasAllocQty())
        {
            encoder.allocQty(this.allocQty());
        }
        return encoder;
    }

}
    private int noAllocsGroupCounter;

    private boolean hasNoAllocsGroupCounter;

    public boolean hasNoAllocsGroupCounter()
    {
        return hasNoAllocsGroupCounter;
    }

    /* NoAllocsGroupCounter = 78 */
    public SidesGroupEncoder noAllocsGroupCounter(int value)
    {
        noAllocsGroupCounter = value;
        hasNoAllocsGroupCounter = true;
        return this;
    }

    /* NoAllocsGroupCounter = 78 */
    public int noAllocsGroupCounter()
    {
        return noAllocsGroupCounter;
    }


    private AllocsGroupEncoder allocsGroup = null;

    public AllocsGroupEncoder allocsGroup(final int numberOfElements)
    {
        hasNoAllocsGroupCounter = true;
        noAllocsGroupCounter = numberOfElements;
        if (allocsGroup == null)
        {
            allocsGroup = new AllocsGroupEncoder();
        }
        return allocsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
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

        if (hasProcessCode)
        {
            buffer.putBytes(position, processCodeHeader, 0, processCodeHeaderLength);
            position += processCodeHeaderLength;
            position += buffer.putCharAscii(position, processCode);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOddLot)
        {
            buffer.putBytes(position, oddLotHeader, 0, oddLotHeaderLength);
            position += oddLotHeaderLength;
            position += buffer.putBooleanAscii(position, oddLot);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoClearingInstructionsGroupCounter)
        {
            buffer.putBytes(position, noClearingInstructionsGroupCounterHeader, 0, noClearingInstructionsGroupCounterHeaderLength);
            position += noClearingInstructionsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noClearingInstructionsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (clearingInstructionsGroup != null)
        {
            position += clearingInstructionsGroup.encode(buffer, position, noClearingInstructionsGroupCounter);
        }


        if (clearingFeeIndicatorLength > 0)
        {
            buffer.putBytes(position, clearingFeeIndicatorHeader, 0, clearingFeeIndicatorHeaderLength);
            position += clearingFeeIndicatorHeaderLength;
            buffer.putBytes(position, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            position += clearingFeeIndicatorLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeInputSourceLength > 0)
        {
            buffer.putBytes(position, tradeInputSourceHeader, 0, tradeInputSourceHeaderLength);
            position += tradeInputSourceHeaderLength;
            buffer.putBytes(position, tradeInputSource, tradeInputSourceOffset, tradeInputSourceLength);
            position += tradeInputSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeInputDeviceLength > 0)
        {
            buffer.putBytes(position, tradeInputDeviceHeader, 0, tradeInputDeviceHeaderLength);
            position += tradeInputDeviceHeaderLength;
            buffer.putBytes(position, tradeInputDevice, tradeInputDeviceOffset, tradeInputDeviceLength);
            position += tradeInputDeviceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (orderInputDeviceLength > 0)
        {
            buffer.putBytes(position, orderInputDeviceHeader, 0, orderInputDeviceHeaderLength);
            position += orderInputDeviceHeaderLength;
            buffer.putBytes(position, orderInputDevice, orderInputDeviceOffset, orderInputDeviceLength);
            position += orderInputDeviceLength;
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

        if (complianceIDLength > 0)
        {
            buffer.putBytes(position, complianceIDHeader, 0, complianceIDHeaderLength);
            position += complianceIDHeaderLength;
            buffer.putBytes(position, complianceID, complianceIDOffset, complianceIDLength);
            position += complianceIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSolicitedFlag)
        {
            buffer.putBytes(position, solicitedFlagHeader, 0, solicitedFlagHeaderLength);
            position += solicitedFlagHeaderLength;
            position += buffer.putBooleanAscii(position, solicitedFlag);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderCapacity)
        {
            buffer.putBytes(position, orderCapacityHeader, 0, orderCapacityHeaderLength);
            position += orderCapacityHeaderLength;
            position += buffer.putCharAscii(position, orderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (orderRestrictionsLength > 0)
        {
            buffer.putBytes(position, orderRestrictionsHeader, 0, orderRestrictionsHeaderLength);
            position += orderRestrictionsHeaderLength;
            buffer.putBytes(position, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            position += orderRestrictionsLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCustOrderCapacity)
        {
            buffer.putBytes(position, custOrderCapacityHeader, 0, custOrderCapacityHeaderLength);
            position += custOrderCapacityHeaderLength;
            position += buffer.putIntAscii(position, custOrderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrdType)
        {
            buffer.putBytes(position, ordTypeHeader, 0, ordTypeHeaderLength);
            position += ordTypeHeaderLength;
            position += buffer.putCharAscii(position, ordType);
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

        if (transBkdTimeLength > 0)
        {
            buffer.putBytes(position, transBkdTimeHeader, 0, transBkdTimeHeaderLength);
            position += transBkdTimeHeaderLength;
            buffer.putBytes(position, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
            position += transBkdTimeLength;
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

        if (timeBracketLength > 0)
        {
            buffer.putBytes(position, timeBracketHeader, 0, timeBracketHeaderLength);
            position += timeBracketHeaderLength;
            buffer.putBytes(position, timeBracket, timeBracketOffset, timeBracketLength);
            position += timeBracketLength;
            buffer.putSeparator(position);
            position++;
        }

            position += commissionData.encode(buffer, position);

        if (hasGrossTradeAmt)
        {
            buffer.putBytes(position, grossTradeAmtHeader, 0, grossTradeAmtHeaderLength);
            position += grossTradeAmtHeaderLength;
            position += buffer.putFloatAscii(position, grossTradeAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNumDaysInterest)
        {
            buffer.putBytes(position, numDaysInterestHeader, 0, numDaysInterestHeaderLength);
            position += numDaysInterestHeaderLength;
            position += buffer.putIntAscii(position, numDaysInterest);
            buffer.putSeparator(position);
            position++;
        }

        if (exDateLength > 0)
        {
            buffer.putBytes(position, exDateHeader, 0, exDateHeaderLength);
            position += exDateHeaderLength;
            buffer.putBytes(position, exDate, exDateOffset, exDateLength);
            position += exDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccruedInterestRate)
        {
            buffer.putBytes(position, accruedInterestRateHeader, 0, accruedInterestRateHeaderLength);
            position += accruedInterestRateHeaderLength;
            position += buffer.putFloatAscii(position, accruedInterestRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccruedInterestAmt)
        {
            buffer.putBytes(position, accruedInterestAmtHeader, 0, accruedInterestAmtHeaderLength);
            position += accruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, accruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasInterestAtMaturity)
        {
            buffer.putBytes(position, interestAtMaturityHeader, 0, interestAtMaturityHeaderLength);
            position += interestAtMaturityHeaderLength;
            position += buffer.putFloatAscii(position, interestAtMaturity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndAccruedInterestAmt)
        {
            buffer.putBytes(position, endAccruedInterestAmtHeader, 0, endAccruedInterestAmtHeaderLength);
            position += endAccruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, endAccruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStartCash)
        {
            buffer.putBytes(position, startCashHeader, 0, startCashHeaderLength);
            position += startCashHeaderLength;
            position += buffer.putFloatAscii(position, startCash);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndCash)
        {
            buffer.putBytes(position, endCashHeader, 0, endCashHeaderLength);
            position += endCashHeaderLength;
            position += buffer.putFloatAscii(position, endCash);
            buffer.putSeparator(position);
            position++;
        }

        if (hasConcession)
        {
            buffer.putBytes(position, concessionHeader, 0, concessionHeaderLength);
            position += concessionHeaderLength;
            position += buffer.putFloatAscii(position, concession);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalTakedown)
        {
            buffer.putBytes(position, totalTakedownHeader, 0, totalTakedownHeaderLength);
            position += totalTakedownHeaderLength;
            position += buffer.putFloatAscii(position, totalTakedown);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNetMoney)
        {
            buffer.putBytes(position, netMoneyHeader, 0, netMoneyHeaderLength);
            position += netMoneyHeaderLength;
            position += buffer.putFloatAscii(position, netMoney);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrAmt)
        {
            buffer.putBytes(position, settlCurrAmtHeader, 0, settlCurrAmtHeaderLength);
            position += settlCurrAmtHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (settlCurrencyLength > 0)
        {
            buffer.putBytes(position, settlCurrencyHeader, 0, settlCurrencyHeaderLength);
            position += settlCurrencyHeaderLength;
            buffer.putBytes(position, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            position += settlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrFxRate)
        {
            buffer.putBytes(position, settlCurrFxRateHeader, 0, settlCurrFxRateHeaderLength);
            position += settlCurrFxRateHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrFxRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrFxRateCalc)
        {
            buffer.putBytes(position, settlCurrFxRateCalcHeader, 0, settlCurrFxRateCalcHeaderLength);
            position += settlCurrFxRateCalcHeaderLength;
            position += buffer.putCharAscii(position, settlCurrFxRateCalc);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPositionEffect)
        {
            buffer.putBytes(position, positionEffectHeader, 0, positionEffectHeaderLength);
            position += positionEffectHeaderLength;
            position += buffer.putCharAscii(position, positionEffect);
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

        if (hasSideMultiLegReportingType)
        {
            buffer.putBytes(position, sideMultiLegReportingTypeHeader, 0, sideMultiLegReportingTypeHeaderLength);
            position += sideMultiLegReportingTypeHeaderLength;
            position += buffer.putIntAscii(position, sideMultiLegReportingType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoContAmtsGroupCounter)
        {
            buffer.putBytes(position, noContAmtsGroupCounterHeader, 0, noContAmtsGroupCounterHeaderLength);
            position += noContAmtsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noContAmtsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (contAmtsGroup != null)
        {
            position += contAmtsGroup.encode(buffer, position, noContAmtsGroupCounter);
        }


            position += stipulations.encode(buffer, position);

        if (hasNoMiscFeesGroupCounter)
        {
            buffer.putBytes(position, noMiscFeesGroupCounterHeader, 0, noMiscFeesGroupCounterHeaderLength);
            position += noMiscFeesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMiscFeesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (miscFeesGroup != null)
        {
            position += miscFeesGroup.encode(buffer, position, noMiscFeesGroupCounter);
        }


        if (exchangeRuleLength > 0)
        {
            buffer.putBytes(position, exchangeRuleHeader, 0, exchangeRuleHeaderLength);
            position += exchangeRuleHeaderLength;
            buffer.putBytes(position, exchangeRule, exchangeRuleOffset, exchangeRuleLength);
            position += exchangeRuleLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeAllocIndicator)
        {
            buffer.putBytes(position, tradeAllocIndicatorHeader, 0, tradeAllocIndicatorHeaderLength);
            position += tradeAllocIndicatorHeaderLength;
            position += buffer.putIntAscii(position, tradeAllocIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreallocMethod)
        {
            buffer.putBytes(position, preallocMethodHeader, 0, preallocMethodHeaderLength);
            position += preallocMethodHeaderLength;
            position += buffer.putCharAscii(position, preallocMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (allocIDLength > 0)
        {
            buffer.putBytes(position, allocIDHeader, 0, allocIDHeaderLength);
            position += allocIDHeaderLength;
            buffer.putBytes(position, allocID, allocIDOffset, allocIDLength);
            position += allocIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoAllocsGroupCounter)
        {
            buffer.putBytes(position, noAllocsGroupCounterHeader, 0, noAllocsGroupCounterHeaderLength);
            position += noAllocsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAllocsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (allocsGroup != null)
        {
            position += allocsGroup.encode(buffer, position, noAllocsGroupCounter);
        }

        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSide();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetListID();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetProcessCode();
        this.resetOddLot();
        this.resetClearingFeeIndicator();
        this.resetTradeInputSource();
        this.resetTradeInputDevice();
        this.resetOrderInputDevice();
        this.resetCurrency();
        this.resetComplianceID();
        this.resetSolicitedFlag();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetCustOrderCapacity();
        this.resetOrdType();
        this.resetExecInst();
        this.resetTransBkdTime();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTimeBracket();
        this.resetGrossTradeAmt();
        this.resetNumDaysInterest();
        this.resetExDate();
        this.resetAccruedInterestRate();
        this.resetAccruedInterestAmt();
        this.resetInterestAtMaturity();
        this.resetEndAccruedInterestAmt();
        this.resetStartCash();
        this.resetEndCash();
        this.resetConcession();
        this.resetTotalTakedown();
        this.resetNetMoney();
        this.resetSettlCurrAmt();
        this.resetSettlCurrency();
        this.resetSettlCurrFxRate();
        this.resetSettlCurrFxRateCalc();
        this.resetPositionEffect();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetSideMultiLegReportingType();
        this.resetExchangeRule();
        this.resetTradeAllocIndicator();
        this.resetPreallocMethod();
        this.resetAllocID();
        parties.reset();
        commissionData.reset();
        stipulations.reset();
        this.resetClearingInstructionsGroup();
        this.resetContAmtsGroup();
        this.resetMiscFeesGroup();
        this.resetAllocsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
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

    public void resetListID()
    {
        listIDLength = 0;
        listID.wrap(listIDInternalBuffer);
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

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetOddLot()
    {
        hasOddLot = false;
    }

    public void resetClearingFeeIndicator()
    {
        clearingFeeIndicatorLength = 0;
        clearingFeeIndicator.wrap(clearingFeeIndicatorInternalBuffer);
    }

    public void resetTradeInputSource()
    {
        tradeInputSourceLength = 0;
        tradeInputSource.wrap(tradeInputSourceInternalBuffer);
    }

    public void resetTradeInputDevice()
    {
        tradeInputDeviceLength = 0;
        tradeInputDevice.wrap(tradeInputDeviceInternalBuffer);
    }

    public void resetOrderInputDevice()
    {
        orderInputDeviceLength = 0;
        orderInputDevice.wrap(orderInputDeviceInternalBuffer);
    }

    public void resetCurrency()
    {
        currencyLength = 0;
        currency.wrap(currencyInternalBuffer);
    }

    public void resetComplianceID()
    {
        complianceIDLength = 0;
        complianceID.wrap(complianceIDInternalBuffer);
    }

    public void resetSolicitedFlag()
    {
        hasSolicitedFlag = false;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
        orderRestrictions.wrap(orderRestrictionsInternalBuffer);
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetExecInst()
    {
        execInstLength = 0;
        execInst.wrap(execInstInternalBuffer);
    }

    public void resetTransBkdTime()
    {
        transBkdTimeLength = 0;
        transBkdTime.wrap(transBkdTimeInternalBuffer);
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

    public void resetTimeBracket()
    {
        timeBracketLength = 0;
        timeBracket.wrap(timeBracketInternalBuffer);
    }

    public void resetGrossTradeAmt()
    {
        hasGrossTradeAmt = false;
    }

    public void resetNumDaysInterest()
    {
        hasNumDaysInterest = false;
    }

    public void resetExDate()
    {
        exDateLength = 0;
        exDate.wrap(exDateInternalBuffer);
    }

    public void resetAccruedInterestRate()
    {
        hasAccruedInterestRate = false;
    }

    public void resetAccruedInterestAmt()
    {
        hasAccruedInterestAmt = false;
    }

    public void resetInterestAtMaturity()
    {
        hasInterestAtMaturity = false;
    }

    public void resetEndAccruedInterestAmt()
    {
        hasEndAccruedInterestAmt = false;
    }

    public void resetStartCash()
    {
        hasStartCash = false;
    }

    public void resetEndCash()
    {
        hasEndCash = false;
    }

    public void resetConcession()
    {
        hasConcession = false;
    }

    public void resetTotalTakedown()
    {
        hasTotalTakedown = false;
    }

    public void resetNetMoney()
    {
        hasNetMoney = false;
    }

    public void resetSettlCurrAmt()
    {
        hasSettlCurrAmt = false;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
        settlCurrency.wrap(settlCurrencyInternalBuffer);
    }

    public void resetSettlCurrFxRate()
    {
        hasSettlCurrFxRate = false;
    }

    public void resetSettlCurrFxRateCalc()
    {
        hasSettlCurrFxRateCalc = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
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

    public void resetSideMultiLegReportingType()
    {
        hasSideMultiLegReportingType = false;
    }

    public void resetExchangeRule()
    {
        exchangeRuleLength = 0;
        exchangeRule.wrap(exchangeRuleInternalBuffer);
    }

    public void resetTradeAllocIndicator()
    {
        hasTradeAllocIndicator = false;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetAllocID()
    {
        allocIDLength = 0;
        allocID.wrap(allocIDInternalBuffer);
    }

    public void resetClearingInstructionsGroup()
    {
        if (clearingInstructionsGroup != null)
        {
            clearingInstructionsGroup.reset();
        }
        noClearingInstructionsGroupCounter = 0;
        hasNoClearingInstructionsGroupCounter = false;
    }

    public void resetContAmtsGroup()
    {
        if (contAmtsGroup != null)
        {
            contAmtsGroup.reset();
        }
        noContAmtsGroupCounter = 0;
        hasNoContAmtsGroupCounter = false;
    }

    public void resetMiscFeesGroup()
    {
        if (miscFeesGroup != null)
        {
            miscFeesGroup.reset();
        }
        noMiscFeesGroupCounter = 0;
        hasNoMiscFeesGroupCounter = false;
    }

    public void resetAllocsGroup()
    {
        if (allocsGroup != null)
        {
            allocsGroup.reset();
        }
        noAllocsGroupCounter = 0;
        hasNoAllocsGroupCounter = false;
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
        builder.append("\"MessageName\": \"SidesGroup\",\n");
        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
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

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
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

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

        if (hasOddLot())
        {
            indent(builder, level);
            builder.append("\"OddLot\": \"");
            builder.append(oddLot);
            builder.append("\",\n");
        }

        if (hasNoClearingInstructionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ClearingInstructionsGroup\": [\n");
            final int noClearingInstructionsGroupCounter = this.noClearingInstructionsGroupCounter;
            ClearingInstructionsGroupEncoder clearingInstructionsGroup = this.clearingInstructionsGroup;
            for (int i = 0; i < noClearingInstructionsGroupCounter; i++)
            {
                indent(builder, level);
                clearingInstructionsGroup.appendTo(builder, level + 1);
                if (i < (noClearingInstructionsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                clearingInstructionsGroup = clearingInstructionsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            appendBuffer(builder, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            builder.append("\",\n");
        }

        if (hasTradeInputSource())
        {
            indent(builder, level);
            builder.append("\"TradeInputSource\": \"");
            appendBuffer(builder, tradeInputSource, tradeInputSourceOffset, tradeInputSourceLength);
            builder.append("\",\n");
        }

        if (hasTradeInputDevice())
        {
            indent(builder, level);
            builder.append("\"TradeInputDevice\": \"");
            appendBuffer(builder, tradeInputDevice, tradeInputDeviceOffset, tradeInputDeviceLength);
            builder.append("\",\n");
        }

        if (hasOrderInputDevice())
        {
            indent(builder, level);
            builder.append("\"OrderInputDevice\": \"");
            appendBuffer(builder, orderInputDevice, orderInputDeviceOffset, orderInputDeviceLength);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasComplianceID())
        {
            indent(builder, level);
            builder.append("\"ComplianceID\": \"");
            appendBuffer(builder, complianceID, complianceIDOffset, complianceIDLength);
            builder.append("\",\n");
        }

        if (hasSolicitedFlag())
        {
            indent(builder, level);
            builder.append("\"SolicitedFlag\": \"");
            builder.append(solicitedFlag);
            builder.append("\",\n");
        }

        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            appendBuffer(builder, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            builder.append("\",\n");
        }

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            appendBuffer(builder, execInst, execInstOffset, execInstLength);
            builder.append("\",\n");
        }

        if (hasTransBkdTime())
        {
            indent(builder, level);
            builder.append("\"TransBkdTime\": \"");
            appendBuffer(builder, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
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

        if (hasTimeBracket())
        {
            indent(builder, level);
            builder.append("\"TimeBracket\": \"");
            appendBuffer(builder, timeBracket, timeBracketOffset, timeBracketLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"CommissionData\": ");
    commissionData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"GrossTradeAmt\": \"");
            grossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNumDaysInterest())
        {
            indent(builder, level);
            builder.append("\"NumDaysInterest\": \"");
            builder.append(numDaysInterest);
            builder.append("\",\n");
        }

        if (hasExDate())
        {
            indent(builder, level);
            builder.append("\"ExDate\": \"");
            appendBuffer(builder, exDate, exDateOffset, exDateLength);
            builder.append("\",\n");
        }

        if (hasAccruedInterestRate())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestRate\": \"");
            accruedInterestRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestAmt\": \"");
            accruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasInterestAtMaturity())
        {
            indent(builder, level);
            builder.append("\"InterestAtMaturity\": \"");
            interestAtMaturity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"EndAccruedInterestAmt\": \"");
            endAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStartCash())
        {
            indent(builder, level);
            builder.append("\"StartCash\": \"");
            startCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndCash())
        {
            indent(builder, level);
            builder.append("\"EndCash\": \"");
            endCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasConcession())
        {
            indent(builder, level);
            builder.append("\"Concession\": \"");
            concession.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotalTakedown())
        {
            indent(builder, level);
            builder.append("\"TotalTakedown\": \"");
            totalTakedown.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNetMoney())
        {
            indent(builder, level);
            builder.append("\"NetMoney\": \"");
            netMoney.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"SettlCurrAmt\": \"");
            settlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRate())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRate\": \"");
            settlCurrFxRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRateCalc())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRateCalc\": \"");
            builder.append(settlCurrFxRateCalc);
            builder.append("\",\n");
        }

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
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

        if (hasSideMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"SideMultiLegReportingType\": \"");
            builder.append(sideMultiLegReportingType);
            builder.append("\",\n");
        }

        if (hasNoContAmtsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ContAmtsGroup\": [\n");
            final int noContAmtsGroupCounter = this.noContAmtsGroupCounter;
            ContAmtsGroupEncoder contAmtsGroup = this.contAmtsGroup;
            for (int i = 0; i < noContAmtsGroupCounter; i++)
            {
                indent(builder, level);
                contAmtsGroup.appendTo(builder, level + 1);
                if (i < (noContAmtsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                contAmtsGroup = contAmtsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNoMiscFeesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MiscFeesGroup\": [\n");
            final int noMiscFeesGroupCounter = this.noMiscFeesGroupCounter;
            MiscFeesGroupEncoder miscFeesGroup = this.miscFeesGroup;
            for (int i = 0; i < noMiscFeesGroupCounter; i++)
            {
                indent(builder, level);
                miscFeesGroup.appendTo(builder, level + 1);
                if (i < (noMiscFeesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                miscFeesGroup = miscFeesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasExchangeRule())
        {
            indent(builder, level);
            builder.append("\"ExchangeRule\": \"");
            appendBuffer(builder, exchangeRule, exchangeRuleOffset, exchangeRuleLength);
            builder.append("\",\n");
        }

        if (hasTradeAllocIndicator())
        {
            indent(builder, level);
            builder.append("\"TradeAllocIndicator\": \"");
            builder.append(tradeAllocIndicator);
            builder.append("\",\n");
        }

        if (hasPreallocMethod())
        {
            indent(builder, level);
            builder.append("\"PreallocMethod\": \"");
            builder.append(preallocMethod);
            builder.append("\",\n");
        }

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            appendBuffer(builder, allocID, allocIDOffset, allocIDLength);
            builder.append("\",\n");
        }

        if (hasNoAllocsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AllocsGroup\": [\n");
            final int noAllocsGroupCounter = this.noAllocsGroupCounter;
            AllocsGroupEncoder allocsGroup = this.allocsGroup;
            for (int i = 0; i < noAllocsGroupCounter; i++)
            {
                indent(builder, level);
                allocsGroup.appendTo(builder, level + 1);
                if (i < (noAllocsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                allocsGroup = allocsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public SidesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SidesGroupEncoder)encoder);
    }

    public SidesGroupEncoder copyTo(final SidesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
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

        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }

        if (hasOddLot())
        {
            encoder.oddLot(this.oddLot());
        }

        if (hasNoClearingInstructionsGroupCounter)
        {
            final int size = this.noClearingInstructionsGroupCounter;
            ClearingInstructionsGroupEncoder clearingInstructionsGroup = this.clearingInstructionsGroup;
            ClearingInstructionsGroupEncoder clearingInstructionsGroupEncoder = encoder.clearingInstructionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (clearingInstructionsGroup != null)
                {
                    clearingInstructionsGroup.copyTo(clearingInstructionsGroupEncoder);
                    clearingInstructionsGroup = clearingInstructionsGroup.next();
                    clearingInstructionsGroupEncoder = clearingInstructionsGroupEncoder.next();
                }
            }
        }

        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicatorAsCopy(clearingFeeIndicator.byteArray(), 0, clearingFeeIndicatorLength);
        }

        if (hasTradeInputSource())
        {
            encoder.tradeInputSourceAsCopy(tradeInputSource.byteArray(), 0, tradeInputSourceLength);
        }

        if (hasTradeInputDevice())
        {
            encoder.tradeInputDeviceAsCopy(tradeInputDevice.byteArray(), 0, tradeInputDeviceLength);
        }

        if (hasOrderInputDevice())
        {
            encoder.orderInputDeviceAsCopy(orderInputDevice.byteArray(), 0, orderInputDeviceLength);
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasComplianceID())
        {
            encoder.complianceIDAsCopy(complianceID.byteArray(), 0, complianceIDLength);
        }

        if (hasSolicitedFlag())
        {
            encoder.solicitedFlag(this.solicitedFlag());
        }

        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasExecInst())
        {
            encoder.execInstAsCopy(execInst.byteArray(), 0, execInstLength);
        }

        if (hasTransBkdTime())
        {
            encoder.transBkdTimeAsCopy(transBkdTime.byteArray(), 0, transBkdTimeLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasTimeBracket())
        {
            encoder.timeBracketAsCopy(timeBracket.byteArray(), 0, timeBracketLength);
        }


        commissionData.copyTo(encoder.commissionData());
        if (hasGrossTradeAmt())
        {
            encoder.grossTradeAmt(this.grossTradeAmt());
        }

        if (hasNumDaysInterest())
        {
            encoder.numDaysInterest(this.numDaysInterest());
        }

        if (hasExDate())
        {
            encoder.exDateAsCopy(exDate.byteArray(), 0, exDateLength);
        }

        if (hasAccruedInterestRate())
        {
            encoder.accruedInterestRate(this.accruedInterestRate());
        }

        if (hasAccruedInterestAmt())
        {
            encoder.accruedInterestAmt(this.accruedInterestAmt());
        }

        if (hasInterestAtMaturity())
        {
            encoder.interestAtMaturity(this.interestAtMaturity());
        }

        if (hasEndAccruedInterestAmt())
        {
            encoder.endAccruedInterestAmt(this.endAccruedInterestAmt());
        }

        if (hasStartCash())
        {
            encoder.startCash(this.startCash());
        }

        if (hasEndCash())
        {
            encoder.endCash(this.endCash());
        }

        if (hasConcession())
        {
            encoder.concession(this.concession());
        }

        if (hasTotalTakedown())
        {
            encoder.totalTakedown(this.totalTakedown());
        }

        if (hasNetMoney())
        {
            encoder.netMoney(this.netMoney());
        }

        if (hasSettlCurrAmt())
        {
            encoder.settlCurrAmt(this.settlCurrAmt());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasSettlCurrFxRate())
        {
            encoder.settlCurrFxRate(this.settlCurrFxRate());
        }

        if (hasSettlCurrFxRateCalc())
        {
            encoder.settlCurrFxRateCalc(this.settlCurrFxRateCalc());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
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

        if (hasSideMultiLegReportingType())
        {
            encoder.sideMultiLegReportingType(this.sideMultiLegReportingType());
        }

        if (hasNoContAmtsGroupCounter)
        {
            final int size = this.noContAmtsGroupCounter;
            ContAmtsGroupEncoder contAmtsGroup = this.contAmtsGroup;
            ContAmtsGroupEncoder contAmtsGroupEncoder = encoder.contAmtsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (contAmtsGroup != null)
                {
                    contAmtsGroup.copyTo(contAmtsGroupEncoder);
                    contAmtsGroup = contAmtsGroup.next();
                    contAmtsGroupEncoder = contAmtsGroupEncoder.next();
                }
            }
        }


        stipulations.copyTo(encoder.stipulations());
        if (hasNoMiscFeesGroupCounter)
        {
            final int size = this.noMiscFeesGroupCounter;
            MiscFeesGroupEncoder miscFeesGroup = this.miscFeesGroup;
            MiscFeesGroupEncoder miscFeesGroupEncoder = encoder.miscFeesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (miscFeesGroup != null)
                {
                    miscFeesGroup.copyTo(miscFeesGroupEncoder);
                    miscFeesGroup = miscFeesGroup.next();
                    miscFeesGroupEncoder = miscFeesGroupEncoder.next();
                }
            }
        }

        if (hasExchangeRule())
        {
            encoder.exchangeRuleAsCopy(exchangeRule.byteArray(), 0, exchangeRuleLength);
        }

        if (hasTradeAllocIndicator())
        {
            encoder.tradeAllocIndicator(this.tradeAllocIndicator());
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }

        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }

        if (hasNoAllocsGroupCounter)
        {
            final int size = this.noAllocsGroupCounter;
            AllocsGroupEncoder allocsGroup = this.allocsGroup;
            AllocsGroupEncoder allocsGroupEncoder = encoder.allocsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (allocsGroup != null)
                {
                    allocsGroup.copyTo(allocsGroupEncoder);
                    allocsGroup = allocsGroup.next();
                    allocsGroupEncoder = allocsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
    private int noSidesGroupCounter;

    private boolean hasNoSidesGroupCounter;

    public boolean hasNoSidesGroupCounter()
    {
        return hasNoSidesGroupCounter;
    }

    /* NoSidesGroupCounter = 552 */
    public TradeCaptureReportEncoder noSidesGroupCounter(int value)
    {
        noSidesGroupCounter = value;
        hasNoSidesGroupCounter = true;
        return this;
    }

    /* NoSidesGroupCounter = 552 */
    public int noSidesGroupCounter()
    {
        return noSidesGroupCounter;
    }


    private SidesGroupEncoder sidesGroup = null;

    public SidesGroupEncoder sidesGroup(final int numberOfElements)
    {
        hasNoSidesGroupCounter = true;
        noSidesGroupCounter = numberOfElements;
        if (sidesGroup == null)
        {
            sidesGroup = new SidesGroupEncoder();
        }
        return sidesGroup;
    }

    private boolean copyMsgIndicator;

    private boolean hasCopyMsgIndicator;

    public boolean hasCopyMsgIndicator()
    {
        return hasCopyMsgIndicator;
    }

    /* CopyMsgIndicator = 797 */
    public TradeCaptureReportEncoder copyMsgIndicator(boolean value)
    {
        copyMsgIndicator = value;
        hasCopyMsgIndicator = true;
        return this;
    }

    /* CopyMsgIndicator = 797 */
    public boolean copyMsgIndicator()
    {
        return copyMsgIndicator;
    }

    private boolean publishTrdIndicator;

    private boolean hasPublishTrdIndicator;

    public boolean hasPublishTrdIndicator()
    {
        return hasPublishTrdIndicator;
    }

    /* PublishTrdIndicator = 852 */
    public TradeCaptureReportEncoder publishTrdIndicator(boolean value)
    {
        publishTrdIndicator = value;
        hasPublishTrdIndicator = true;
        return this;
    }

    /* PublishTrdIndicator = 852 */
    public boolean publishTrdIndicator()
    {
        return publishTrdIndicator;
    }

    private int shortSaleReason;

    private boolean hasShortSaleReason;

    public boolean hasShortSaleReason()
    {
        return hasShortSaleReason;
    }

    /* ShortSaleReason = 853 */
    public TradeCaptureReportEncoder shortSaleReason(int value)
    {
        shortSaleReason = value;
        hasShortSaleReason = true;
        return this;
    }

    /* ShortSaleReason = 853 */
    public int shortSaleReason()
    {
        return shortSaleReason;
    }

    public TradeCaptureReportEncoder shortSaleReason(ShortSaleReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ShortSaleReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: shortSaleReason Value: " + value );
            }
            if (value == ShortSaleReason.NULL_VAL)
            {
                return this;
            }
        }
        return shortSaleReason(value.representation());
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (tradeReportIDLength > 0)
        {
            buffer.putBytes(position, tradeReportIDHeader, 0, tradeReportIDHeaderLength);
            position += tradeReportIDHeaderLength;
            buffer.putBytes(position, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            position += tradeReportIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeReportID");
        }

        if (hasTradeReportTransType)
        {
            buffer.putBytes(position, tradeReportTransTypeHeader, 0, tradeReportTransTypeHeaderLength);
            position += tradeReportTransTypeHeaderLength;
            position += buffer.putIntAscii(position, tradeReportTransType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeReportType)
        {
            buffer.putBytes(position, tradeReportTypeHeader, 0, tradeReportTypeHeaderLength);
            position += tradeReportTypeHeaderLength;
            position += buffer.putIntAscii(position, tradeReportType);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeRequestIDLength > 0)
        {
            buffer.putBytes(position, tradeRequestIDHeader, 0, tradeRequestIDHeaderLength);
            position += tradeRequestIDHeaderLength;
            buffer.putBytes(position, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
            position += tradeRequestIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTrdType)
        {
            buffer.putBytes(position, trdTypeHeader, 0, trdTypeHeaderLength);
            position += trdTypeHeaderLength;
            position += buffer.putIntAscii(position, trdType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTrdSubType)
        {
            buffer.putBytes(position, trdSubTypeHeader, 0, trdSubTypeHeaderLength);
            position += trdSubTypeHeaderLength;
            position += buffer.putIntAscii(position, trdSubType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecondaryTrdType)
        {
            buffer.putBytes(position, secondaryTrdTypeHeader, 0, secondaryTrdTypeHeaderLength);
            position += secondaryTrdTypeHeaderLength;
            position += buffer.putIntAscii(position, secondaryTrdType);
            buffer.putSeparator(position);
            position++;
        }

        if (transferReasonLength > 0)
        {
            buffer.putBytes(position, transferReasonHeader, 0, transferReasonHeaderLength);
            position += transferReasonHeaderLength;
            buffer.putBytes(position, transferReason, transferReasonOffset, transferReasonLength);
            position += transferReasonLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasExecType)
        {
            buffer.putBytes(position, execTypeHeader, 0, execTypeHeaderLength);
            position += execTypeHeaderLength;
            position += buffer.putCharAscii(position, execType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNumTradeReports)
        {
            buffer.putBytes(position, totNumTradeReportsHeader, 0, totNumTradeReportsHeaderLength);
            position += totNumTradeReportsHeaderLength;
            position += buffer.putIntAscii(position, totNumTradeReports);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastRptRequested)
        {
            buffer.putBytes(position, lastRptRequestedHeader, 0, lastRptRequestedHeaderLength);
            position += lastRptRequestedHeaderLength;
            position += buffer.putBooleanAscii(position, lastRptRequested);
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

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeReportRefIDLength > 0)
        {
            buffer.putBytes(position, tradeReportRefIDHeader, 0, tradeReportRefIDHeaderLength);
            position += tradeReportRefIDHeaderLength;
            buffer.putBytes(position, tradeReportRefID, tradeReportRefIDOffset, tradeReportRefIDLength);
            position += tradeReportRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryTradeReportRefIDLength > 0)
        {
            buffer.putBytes(position, secondaryTradeReportRefIDHeader, 0, secondaryTradeReportRefIDHeaderLength);
            position += secondaryTradeReportRefIDHeaderLength;
            buffer.putBytes(position, secondaryTradeReportRefID, secondaryTradeReportRefIDOffset, secondaryTradeReportRefIDLength);
            position += secondaryTradeReportRefIDLength;
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

        if (tradeLinkIDLength > 0)
        {
            buffer.putBytes(position, tradeLinkIDHeader, 0, tradeLinkIDHeaderLength);
            position += tradeLinkIDHeaderLength;
            buffer.putBytes(position, tradeLinkID, tradeLinkIDOffset, tradeLinkIDLength);
            position += tradeLinkIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (trdMatchIDLength > 0)
        {
            buffer.putBytes(position, trdMatchIDHeader, 0, trdMatchIDHeaderLength);
            position += trdMatchIDHeaderLength;
            buffer.putBytes(position, trdMatchID, trdMatchIDOffset, trdMatchIDLength);
            position += trdMatchIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrdStatus)
        {
            buffer.putBytes(position, ordStatusHeader, 0, ordStatusHeaderLength);
            position += ordStatusHeaderLength;
            position += buffer.putCharAscii(position, ordStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryExecIDLength > 0)
        {
            buffer.putBytes(position, secondaryExecIDHeader, 0, secondaryExecIDHeaderLength);
            position += secondaryExecIDHeaderLength;
            buffer.putBytes(position, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            position += secondaryExecIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasExecRestatementReason)
        {
            buffer.putBytes(position, execRestatementReasonHeader, 0, execRestatementReasonHeaderLength);
            position += execRestatementReasonHeaderLength;
            position += buffer.putIntAscii(position, execRestatementReason);
            buffer.putSeparator(position);
            position++;
        }

        buffer.putBytes(position, previouslyReportedHeader, 0, previouslyReportedHeaderLength);
        position += previouslyReportedHeaderLength;
        position += buffer.putBooleanAscii(position, previouslyReported);
        buffer.putSeparator(position);
        position++;

        if (hasPriceType)
        {
            buffer.putBytes(position, priceTypeHeader, 0, priceTypeHeaderLength);
            position += priceTypeHeaderLength;
            position += buffer.putIntAscii(position, priceType);
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

            position += orderQtyData.encode(buffer, position);

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
            buffer.putSeparator(position);
            position++;
        }

            position += yieldData.encode(buffer, position);

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


        if (underlyingTradingSessionIDLength > 0)
        {
            buffer.putBytes(position, underlyingTradingSessionIDHeader, 0, underlyingTradingSessionIDHeaderLength);
            position += underlyingTradingSessionIDHeaderLength;
            buffer.putBytes(position, underlyingTradingSessionID, underlyingTradingSessionIDOffset, underlyingTradingSessionIDLength);
            position += underlyingTradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingTradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, underlyingTradingSessionSubIDHeader, 0, underlyingTradingSessionSubIDHeaderLength);
            position += underlyingTradingSessionSubIDHeaderLength;
            buffer.putBytes(position, underlyingTradingSessionSubID, underlyingTradingSessionSubIDOffset, underlyingTradingSessionSubIDLength);
            position += underlyingTradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastQty)
        {
            buffer.putBytes(position, lastQtyHeader, 0, lastQtyHeaderLength);
            position += lastQtyHeaderLength;
            position += buffer.putFloatAscii(position, lastQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: LastQty");
        }

        if (hasLastPx)
        {
            buffer.putBytes(position, lastPxHeader, 0, lastPxHeaderLength);
            position += lastPxHeaderLength;
            position += buffer.putFloatAscii(position, lastPx);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: LastPx");
        }

        if (hasLastParPx)
        {
            buffer.putBytes(position, lastParPxHeader, 0, lastParPxHeaderLength);
            position += lastParPxHeaderLength;
            position += buffer.putFloatAscii(position, lastParPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastSpotRate)
        {
            buffer.putBytes(position, lastSpotRateHeader, 0, lastSpotRateHeaderLength);
            position += lastSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, lastSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastForwardPoints)
        {
            buffer.putBytes(position, lastForwardPointsHeader, 0, lastForwardPointsHeaderLength);
            position += lastForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, lastForwardPoints);
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

        if (tradeDateLength > 0)
        {
            buffer.putBytes(position, tradeDateHeader, 0, tradeDateHeaderLength);
            position += tradeDateHeaderLength;
            buffer.putBytes(position, tradeDate, tradeDateOffset, tradeDateLength);
            position += tradeDateLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeDate");
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

        if (hasAvgPx)
        {
            buffer.putBytes(position, avgPxHeader, 0, avgPxHeaderLength);
            position += avgPxHeaderLength;
            position += buffer.putFloatAscii(position, avgPx);
            buffer.putSeparator(position);
            position++;
        }

            position += spreadOrBenchmarkCurveData.encode(buffer, position);

        if (hasAvgPxIndicator)
        {
            buffer.putBytes(position, avgPxIndicatorHeader, 0, avgPxIndicatorHeaderLength);
            position += avgPxIndicatorHeaderLength;
            position += buffer.putIntAscii(position, avgPxIndicator);
            buffer.putSeparator(position);
            position++;
        }

            position += positionAmountData.encode(buffer, position);

        if (hasMultiLegReportingType)
        {
            buffer.putBytes(position, multiLegReportingTypeHeader, 0, multiLegReportingTypeHeaderLength);
            position += multiLegReportingTypeHeaderLength;
            position += buffer.putCharAscii(position, multiLegReportingType);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeLegRefIDLength > 0)
        {
            buffer.putBytes(position, tradeLegRefIDHeader, 0, tradeLegRefIDHeaderLength);
            position += tradeLegRefIDHeaderLength;
            buffer.putBytes(position, tradeLegRefID, tradeLegRefIDOffset, tradeLegRefIDLength);
            position += tradeLegRefIDLength;
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

            position += trdRegTimestamps.encode(buffer, position);

        if (hasSettlType)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            position += buffer.putCharAscii(position, settlType);
            buffer.putSeparator(position);
            position++;
        }

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (matchTypeLength > 0)
        {
            buffer.putBytes(position, matchTypeHeader, 0, matchTypeHeaderLength);
            position += matchTypeHeaderLength;
            buffer.putBytes(position, matchType, matchTypeOffset, matchTypeLength);
            position += matchTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoSidesGroupCounter)
        {
            buffer.putBytes(position, noSidesGroupCounterHeader, 0, noSidesGroupCounterHeaderLength);
            position += noSidesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSidesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (sidesGroup != null)
        {
            position += sidesGroup.encode(buffer, position, noSidesGroupCounter);
        }


        if (hasCopyMsgIndicator)
        {
            buffer.putBytes(position, copyMsgIndicatorHeader, 0, copyMsgIndicatorHeaderLength);
            position += copyMsgIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, copyMsgIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPublishTrdIndicator)
        {
            buffer.putBytes(position, publishTrdIndicatorHeader, 0, publishTrdIndicatorHeaderLength);
            position += publishTrdIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, publishTrdIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasShortSaleReason)
        {
            buffer.putBytes(position, shortSaleReasonHeader, 0, shortSaleReasonHeaderLength);
            position += shortSaleReasonHeaderLength;
            position += buffer.putIntAscii(position, shortSaleReason);
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
        this.resetTradeReportID();
        this.resetTradeReportTransType();
        this.resetTradeReportType();
        this.resetTradeRequestID();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetSecondaryTrdType();
        this.resetTransferReason();
        this.resetExecType();
        this.resetTotNumTradeReports();
        this.resetLastRptRequested();
        this.resetUnsolicitedIndicator();
        this.resetSubscriptionRequestType();
        this.resetTradeReportRefID();
        this.resetSecondaryTradeReportRefID();
        this.resetSecondaryTradeReportID();
        this.resetTradeLinkID();
        this.resetTrdMatchID();
        this.resetExecID();
        this.resetOrdStatus();
        this.resetSecondaryExecID();
        this.resetExecRestatementReason();
        this.resetPreviouslyReported();
        this.resetPriceType();
        this.resetQtyType();
        this.resetUnderlyingTradingSessionID();
        this.resetUnderlyingTradingSessionSubID();
        this.resetLastQty();
        this.resetLastPx();
        this.resetLastParPx();
        this.resetLastSpotRate();
        this.resetLastForwardPoints();
        this.resetLastMkt();
        this.resetTradeDate();
        this.resetClearingBusinessDate();
        this.resetAvgPx();
        this.resetAvgPxIndicator();
        this.resetMultiLegReportingType();
        this.resetTradeLegRefID();
        this.resetTransactTime();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetMatchStatus();
        this.resetMatchType();
        this.resetCopyMsgIndicator();
        this.resetPublishTrdIndicator();
        this.resetShortSaleReason();
        instrument.reset();
        financingDetails.reset();
        orderQtyData.reset();
        yieldData.reset();
        spreadOrBenchmarkCurveData.reset();
        positionAmountData.reset();
        trdRegTimestamps.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        this.resetSidesGroup();
    }

    public void resetTradeReportID()
    {
        tradeReportIDLength = 0;
        tradeReportID.wrap(tradeReportIDInternalBuffer);
    }

    public void resetTradeReportTransType()
    {
        hasTradeReportTransType = false;
    }

    public void resetTradeReportType()
    {
        hasTradeReportType = false;
    }

    public void resetTradeRequestID()
    {
        tradeRequestIDLength = 0;
        tradeRequestID.wrap(tradeRequestIDInternalBuffer);
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetTrdSubType()
    {
        hasTrdSubType = false;
    }

    public void resetSecondaryTrdType()
    {
        hasSecondaryTrdType = false;
    }

    public void resetTransferReason()
    {
        transferReasonLength = 0;
        transferReason.wrap(transferReasonInternalBuffer);
    }

    public void resetExecType()
    {
        hasExecType = false;
    }

    public void resetTotNumTradeReports()
    {
        hasTotNumTradeReports = false;
    }

    public void resetLastRptRequested()
    {
        hasLastRptRequested = false;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTradeReportRefID()
    {
        tradeReportRefIDLength = 0;
        tradeReportRefID.wrap(tradeReportRefIDInternalBuffer);
    }

    public void resetSecondaryTradeReportRefID()
    {
        secondaryTradeReportRefIDLength = 0;
        secondaryTradeReportRefID.wrap(secondaryTradeReportRefIDInternalBuffer);
    }

    public void resetSecondaryTradeReportID()
    {
        secondaryTradeReportIDLength = 0;
        secondaryTradeReportID.wrap(secondaryTradeReportIDInternalBuffer);
    }

    public void resetTradeLinkID()
    {
        tradeLinkIDLength = 0;
        tradeLinkID.wrap(tradeLinkIDInternalBuffer);
    }

    public void resetTrdMatchID()
    {
        trdMatchIDLength = 0;
        trdMatchID.wrap(trdMatchIDInternalBuffer);
    }

    public void resetExecID()
    {
        execIDLength = 0;
        execID.wrap(execIDInternalBuffer);
    }

    public void resetOrdStatus()
    {
        hasOrdStatus = false;
    }

    public void resetSecondaryExecID()
    {
        secondaryExecIDLength = 0;
        secondaryExecID.wrap(secondaryExecIDInternalBuffer);
    }

    public void resetExecRestatementReason()
    {
        hasExecRestatementReason = false;
    }

    public void resetPreviouslyReported()
    {
        previouslyReported = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetUnderlyingTradingSessionID()
    {
        underlyingTradingSessionIDLength = 0;
        underlyingTradingSessionID.wrap(underlyingTradingSessionIDInternalBuffer);
    }

    public void resetUnderlyingTradingSessionSubID()
    {
        underlyingTradingSessionSubIDLength = 0;
        underlyingTradingSessionSubID.wrap(underlyingTradingSessionSubIDInternalBuffer);
    }

    public void resetLastQty()
    {
        hasLastQty = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetLastParPx()
    {
        hasLastParPx = false;
    }

    public void resetLastSpotRate()
    {
        hasLastSpotRate = false;
    }

    public void resetLastForwardPoints()
    {
        hasLastForwardPoints = false;
    }

    public void resetLastMkt()
    {
        lastMktLength = 0;
        lastMkt.wrap(lastMktInternalBuffer);
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
        tradeDate.wrap(tradeDateInternalBuffer);
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
        clearingBusinessDate.wrap(clearingBusinessDateInternalBuffer);
    }

    public void resetAvgPx()
    {
        hasAvgPx = false;
    }

    public void resetAvgPxIndicator()
    {
        hasAvgPxIndicator = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetTradeLegRefID()
    {
        tradeLegRefIDLength = 0;
        tradeLegRefID.wrap(tradeLegRefIDInternalBuffer);
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
        transactTime.wrap(transactTimeInternalBuffer);
    }

    public void resetSettlType()
    {
        hasSettlType = false;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
        settlDate.wrap(settlDateInternalBuffer);
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetMatchType()
    {
        matchTypeLength = 0;
        matchType.wrap(matchTypeInternalBuffer);
    }

    public void resetCopyMsgIndicator()
    {
        hasCopyMsgIndicator = false;
    }

    public void resetPublishTrdIndicator()
    {
        hasPublishTrdIndicator = false;
    }

    public void resetShortSaleReason()
    {
        hasShortSaleReason = false;
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

    public void resetSidesGroup()
    {
        if (sidesGroup != null)
        {
            sidesGroup.reset();
        }
        noSidesGroupCounter = 0;
        hasNoSidesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradeCaptureReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            appendBuffer(builder, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasTradeReportTransType())
        {
            indent(builder, level);
            builder.append("\"TradeReportTransType\": \"");
            builder.append(tradeReportTransType);
            builder.append("\",\n");
        }

        if (hasTradeReportType())
        {
            indent(builder, level);
            builder.append("\"TradeReportType\": \"");
            builder.append(tradeReportType);
            builder.append("\",\n");
        }

        if (hasTradeRequestID())
        {
            indent(builder, level);
            builder.append("\"TradeRequestID\": \"");
            appendBuffer(builder, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
            builder.append("\",\n");
        }

        if (hasTrdType())
        {
            indent(builder, level);
            builder.append("\"TrdType\": \"");
            builder.append(trdType);
            builder.append("\",\n");
        }

        if (hasTrdSubType())
        {
            indent(builder, level);
            builder.append("\"TrdSubType\": \"");
            builder.append(trdSubType);
            builder.append("\",\n");
        }

        if (hasSecondaryTrdType())
        {
            indent(builder, level);
            builder.append("\"SecondaryTrdType\": \"");
            builder.append(secondaryTrdType);
            builder.append("\",\n");
        }

        if (hasTransferReason())
        {
            indent(builder, level);
            builder.append("\"TransferReason\": \"");
            appendBuffer(builder, transferReason, transferReasonOffset, transferReasonLength);
            builder.append("\",\n");
        }

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
            builder.append("\",\n");
        }

        if (hasTotNumTradeReports())
        {
            indent(builder, level);
            builder.append("\"TotNumTradeReports\": \"");
            builder.append(totNumTradeReports);
            builder.append("\",\n");
        }

        if (hasLastRptRequested())
        {
            indent(builder, level);
            builder.append("\"LastRptRequested\": \"");
            builder.append(lastRptRequested);
            builder.append("\",\n");
        }

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasTradeReportRefID())
        {
            indent(builder, level);
            builder.append("\"TradeReportRefID\": \"");
            appendBuffer(builder, tradeReportRefID, tradeReportRefIDOffset, tradeReportRefIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportRefID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportRefID\": \"");
            appendBuffer(builder, secondaryTradeReportRefID, secondaryTradeReportRefIDOffset, secondaryTradeReportRefIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            appendBuffer(builder, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasTradeLinkID())
        {
            indent(builder, level);
            builder.append("\"TradeLinkID\": \"");
            appendBuffer(builder, tradeLinkID, tradeLinkIDOffset, tradeLinkIDLength);
            builder.append("\",\n");
        }

        if (hasTrdMatchID())
        {
            indent(builder, level);
            builder.append("\"TrdMatchID\": \"");
            appendBuffer(builder, trdMatchID, trdMatchIDOffset, trdMatchIDLength);
            builder.append("\",\n");
        }

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }

        if (hasOrdStatus())
        {
            indent(builder, level);
            builder.append("\"OrdStatus\": \"");
            builder.append(ordStatus);
            builder.append("\",\n");
        }

        if (hasSecondaryExecID())
        {
            indent(builder, level);
            builder.append("\"SecondaryExecID\": \"");
            appendBuffer(builder, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            builder.append("\",\n");
        }

        if (hasExecRestatementReason())
        {
            indent(builder, level);
            builder.append("\"ExecRestatementReason\": \"");
            builder.append(execRestatementReason);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"PreviouslyReported\": \"");
        builder.append(previouslyReported);
        builder.append("\",\n");

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"OrderQtyData\": ");
    orderQtyData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"YieldData\": ");
    yieldData.appendTo(builder, level + 1);
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

        if (hasUnderlyingTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTradingSessionID\": \"");
            appendBuffer(builder, underlyingTradingSessionID, underlyingTradingSessionIDOffset, underlyingTradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTradingSessionSubID\": \"");
            appendBuffer(builder, underlyingTradingSessionSubID, underlyingTradingSessionSubIDOffset, underlyingTradingSessionSubIDLength);
            builder.append("\",\n");
        }

        if (hasLastQty())
        {
            indent(builder, level);
            builder.append("\"LastQty\": \"");
            lastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastParPx())
        {
            indent(builder, level);
            builder.append("\"LastParPx\": \"");
            lastParPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastSpotRate())
        {
            indent(builder, level);
            builder.append("\"LastSpotRate\": \"");
            lastSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastForwardPoints())
        {
            indent(builder, level);
            builder.append("\"LastForwardPoints\": \"");
            lastForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastMkt())
        {
            indent(builder, level);
            builder.append("\"LastMkt\": \"");
            appendBuffer(builder, lastMkt, lastMktOffset, lastMktLength);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasAvgPx())
        {
            indent(builder, level);
            builder.append("\"AvgPx\": \"");
            avgPx.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAvgPxIndicator())
        {
            indent(builder, level);
            builder.append("\"AvgPxIndicator\": \"");
            builder.append(avgPxIndicator);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasTradeLegRefID())
        {
            indent(builder, level);
            builder.append("\"TradeLegRefID\": \"");
            appendBuffer(builder, tradeLegRefID, tradeLegRefIDOffset, tradeLegRefIDLength);
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

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdRegTimestamps\": ");
    trdRegTimestamps.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            builder.append(settlType);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasMatchType())
        {
            indent(builder, level);
            builder.append("\"MatchType\": \"");
            appendBuffer(builder, matchType, matchTypeOffset, matchTypeLength);
            builder.append("\",\n");
        }

        if (hasNoSidesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SidesGroup\": [\n");
            final int noSidesGroupCounter = this.noSidesGroupCounter;
            SidesGroupEncoder sidesGroup = this.sidesGroup;
            for (int i = 0; i < noSidesGroupCounter; i++)
            {
                indent(builder, level);
                sidesGroup.appendTo(builder, level + 1);
                if (i < (noSidesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                sidesGroup = sidesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasCopyMsgIndicator())
        {
            indent(builder, level);
            builder.append("\"CopyMsgIndicator\": \"");
            builder.append(copyMsgIndicator);
            builder.append("\",\n");
        }

        if (hasPublishTrdIndicator())
        {
            indent(builder, level);
            builder.append("\"PublishTrdIndicator\": \"");
            builder.append(publishTrdIndicator);
            builder.append("\",\n");
        }

        if (hasShortSaleReason())
        {
            indent(builder, level);
            builder.append("\"ShortSaleReason\": \"");
            builder.append(shortSaleReason);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public TradeCaptureReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeCaptureReportEncoder)encoder);
    }

    public TradeCaptureReportEncoder copyTo(final TradeCaptureReportEncoder encoder)
    {
        encoder.reset();
        if (hasTradeReportID())
        {
            encoder.tradeReportIDAsCopy(tradeReportID.byteArray(), 0, tradeReportIDLength);
        }

        if (hasTradeReportTransType())
        {
            encoder.tradeReportTransType(this.tradeReportTransType());
        }

        if (hasTradeReportType())
        {
            encoder.tradeReportType(this.tradeReportType());
        }

        if (hasTradeRequestID())
        {
            encoder.tradeRequestIDAsCopy(tradeRequestID.byteArray(), 0, tradeRequestIDLength);
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasTrdSubType())
        {
            encoder.trdSubType(this.trdSubType());
        }

        if (hasSecondaryTrdType())
        {
            encoder.secondaryTrdType(this.secondaryTrdType());
        }

        if (hasTransferReason())
        {
            encoder.transferReasonAsCopy(transferReason.byteArray(), 0, transferReasonLength);
        }

        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasTotNumTradeReports())
        {
            encoder.totNumTradeReports(this.totNumTradeReports());
        }

        if (hasLastRptRequested())
        {
            encoder.lastRptRequested(this.lastRptRequested());
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTradeReportRefID())
        {
            encoder.tradeReportRefIDAsCopy(tradeReportRefID.byteArray(), 0, tradeReportRefIDLength);
        }

        if (hasSecondaryTradeReportRefID())
        {
            encoder.secondaryTradeReportRefIDAsCopy(secondaryTradeReportRefID.byteArray(), 0, secondaryTradeReportRefIDLength);
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportIDAsCopy(secondaryTradeReportID.byteArray(), 0, secondaryTradeReportIDLength);
        }

        if (hasTradeLinkID())
        {
            encoder.tradeLinkIDAsCopy(tradeLinkID.byteArray(), 0, tradeLinkIDLength);
        }

        if (hasTrdMatchID())
        {
            encoder.trdMatchIDAsCopy(trdMatchID.byteArray(), 0, trdMatchIDLength);
        }

        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }

        if (hasOrdStatus())
        {
            encoder.ordStatus(this.ordStatus());
        }

        if (hasSecondaryExecID())
        {
            encoder.secondaryExecIDAsCopy(secondaryExecID.byteArray(), 0, secondaryExecIDLength);
        }

        if (hasExecRestatementReason())
        {
            encoder.execRestatementReason(this.execRestatementReason());
        }

        encoder.previouslyReported(this.previouslyReported());
        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }


        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());

        orderQtyData.copyTo(encoder.orderQtyData());
        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }


        yieldData.copyTo(encoder.yieldData());
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

        if (hasUnderlyingTradingSessionID())
        {
            encoder.underlyingTradingSessionIDAsCopy(underlyingTradingSessionID.byteArray(), 0, underlyingTradingSessionIDLength);
        }

        if (hasUnderlyingTradingSessionSubID())
        {
            encoder.underlyingTradingSessionSubIDAsCopy(underlyingTradingSessionSubID.byteArray(), 0, underlyingTradingSessionSubIDLength);
        }

        if (hasLastQty())
        {
            encoder.lastQty(this.lastQty());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasLastParPx())
        {
            encoder.lastParPx(this.lastParPx());
        }

        if (hasLastSpotRate())
        {
            encoder.lastSpotRate(this.lastSpotRate());
        }

        if (hasLastForwardPoints())
        {
            encoder.lastForwardPoints(this.lastForwardPoints());
        }

        if (hasLastMkt())
        {
            encoder.lastMktAsCopy(lastMkt.byteArray(), 0, lastMktLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasAvgPx())
        {
            encoder.avgPx(this.avgPx());
        }


        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());
        if (hasAvgPxIndicator())
        {
            encoder.avgPxIndicator(this.avgPxIndicator());
        }


        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasTradeLegRefID())
        {
            encoder.tradeLegRefIDAsCopy(tradeLegRefID.byteArray(), 0, tradeLegRefIDLength);
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

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        trdRegTimestamps.copyTo(encoder.trdRegTimestamps());
        if (hasSettlType())
        {
            encoder.settlType(this.settlType());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasMatchType())
        {
            encoder.matchTypeAsCopy(matchType.byteArray(), 0, matchTypeLength);
        }

        if (hasNoSidesGroupCounter)
        {
            final int size = this.noSidesGroupCounter;
            SidesGroupEncoder sidesGroup = this.sidesGroup;
            SidesGroupEncoder sidesGroupEncoder = encoder.sidesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (sidesGroup != null)
                {
                    sidesGroup.copyTo(sidesGroupEncoder);
                    sidesGroup = sidesGroup.next();
                    sidesGroupEncoder = sidesGroupEncoder.next();
                }
            }
        }

        if (hasCopyMsgIndicator())
        {
            encoder.copyMsgIndicator(this.copyMsgIndicator());
        }

        if (hasPublishTrdIndicator())
        {
            encoder.publishTrdIndicator(this.publishTrdIndicator());
        }

        if (hasShortSaleReason())
        {
            encoder.shortSaleReason(this.shortSaleReason());
        }
        return encoder;
    }

}
