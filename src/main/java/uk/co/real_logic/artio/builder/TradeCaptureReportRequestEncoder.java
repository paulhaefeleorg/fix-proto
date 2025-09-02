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
public class TradeCaptureReportRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 17473L;
    }

    public TradeCaptureReportRequestEncoder()
    {
        header.msgType("AD");
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

    private static final int tradeRequestIDHeaderLength = 4;
    private static final byte[] tradeRequestIDHeader = new byte[] {53, 54, 56, (byte) '='};

    private static final int tradeRequestTypeHeaderLength = 4;
    private static final byte[] tradeRequestTypeHeader = new byte[] {53, 54, 57, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int tradeReportIDHeaderLength = 4;
    private static final byte[] tradeReportIDHeader = new byte[] {53, 55, 49, (byte) '='};

    private static final int secondaryTradeReportIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportIDHeader = new byte[] {56, 49, 56, (byte) '='};

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private static final int execTypeHeaderLength = 4;
    private static final byte[] execTypeHeader = new byte[] {49, 53, 48, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int trdTypeHeaderLength = 4;
    private static final byte[] trdTypeHeader = new byte[] {56, 50, 56, (byte) '='};

    private static final int trdSubTypeHeaderLength = 4;
    private static final byte[] trdSubTypeHeader = new byte[] {56, 50, 57, (byte) '='};

    private static final int transferReasonHeaderLength = 4;
    private static final byte[] transferReasonHeader = new byte[] {56, 51, 48, (byte) '='};

    private static final int secondaryTrdTypeHeaderLength = 4;
    private static final byte[] secondaryTrdTypeHeader = new byte[] {56, 53, 53, (byte) '='};

    private static final int tradeLinkIDHeaderLength = 4;
    private static final byte[] tradeLinkIDHeader = new byte[] {56, 50, 48, (byte) '='};

    private static final int trdMatchIDHeaderLength = 4;
    private static final byte[] trdMatchIDHeader = new byte[] {56, 56, 48, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noDatesGroupCounterHeaderLength = 4;
    private static final byte[] noDatesGroupCounterHeader = new byte[] {53, 56, 48, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int timeBracketHeaderLength = 4;
    private static final byte[] timeBracketHeader = new byte[] {57, 52, 51, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int multiLegReportingTypeHeaderLength = 4;
    private static final byte[] multiLegReportingTypeHeader = new byte[] {52, 52, 50, (byte) '='};

    private static final int tradeInputSourceHeaderLength = 4;
    private static final byte[] tradeInputSourceHeader = new byte[] {53, 55, 56, (byte) '='};

    private static final int tradeInputDeviceHeaderLength = 4;
    private static final byte[] tradeInputDeviceHeader = new byte[] {53, 55, 57, (byte) '='};

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

    private final MutableDirectBuffer tradeRequestID = new UnsafeBuffer();
    private byte[] tradeRequestIDInternalBuffer = tradeRequestID.byteArray();
    private int tradeRequestIDOffset = 0;
    private int tradeRequestIDLength = 0;

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestID(final DirectBuffer value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestID(final DirectBuffer value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestID(final DirectBuffer value)
    {
        return tradeRequestID(value, 0, value.capacity());
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestID(final byte[] value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradeRequestID(final byte[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder tradeRequestID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder tradeRequestID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder tradeRequestID(final char[] value)
    {
        return tradeRequestID(value, 0, value.length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestID(final char[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    /* TradeRequestID = 568 */
    public TradeCaptureReportRequestEncoder tradeRequestID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeRequestID, offset, length))
        {
            tradeRequestIDInternalBuffer = tradeRequestID.byteArray();
        }
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = length;
        return this;
    }

    private int tradeRequestType;

    private boolean hasTradeRequestType;

    public boolean hasTradeRequestType()
    {
        return hasTradeRequestType;
    }

    /* TradeRequestType = 569 */
    public TradeCaptureReportRequestEncoder tradeRequestType(int value)
    {
        tradeRequestType = value;
        hasTradeRequestType = true;
        return this;
    }

    /* TradeRequestType = 569 */
    public int tradeRequestType()
    {
        return tradeRequestType;
    }

    public TradeCaptureReportRequestEncoder tradeRequestType(TradeRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeRequestType Value: " + value );
            }
            if (value == TradeRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return tradeRequestType(value.representation());
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    /* SubscriptionRequestType = 263 */
    public TradeCaptureReportRequestEncoder subscriptionRequestType(char value)
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

    public TradeCaptureReportRequestEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private final MutableDirectBuffer tradeReportID = new UnsafeBuffer();
    private byte[] tradeReportIDInternalBuffer = tradeReportID.byteArray();
    private int tradeReportIDOffset = 0;
    private int tradeReportIDLength = 0;

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportID(final DirectBuffer value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportID(final DirectBuffer value)
    {
        return tradeReportID(value, 0, value.capacity());
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportID(final byte[] value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradeReportID(final byte[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder tradeReportID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder tradeReportID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder tradeReportID(final char[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportID(final char[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    /* TradeReportID = 571 */
    public TradeCaptureReportRequestEncoder tradeReportID(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final DirectBuffer value)
    {
        return secondaryTradeReportID(value, 0, value.capacity());
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportRequestEncoder secondaryTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final byte[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final char[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final char[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    /* SecondaryTradeReportID = 818 */
    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryTradeReportID, offset, length))
        {
            secondaryTradeReportIDInternalBuffer = secondaryTradeReportID.byteArray();
        }
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer execID = new UnsafeBuffer();
    private byte[] execIDInternalBuffer = execID.byteArray();
    private int execIDOffset = 0;
    private int execIDLength = 0;

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder execID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder execID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    /* ExecID = 17 */
    public TradeCaptureReportRequestEncoder execID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, execID, offset, length))
        {
            execIDInternalBuffer = execID.byteArray();
        }
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    private char execType;

    private boolean hasExecType;

    public boolean hasExecType()
    {
        return hasExecType;
    }

    /* ExecType = 150 */
    public TradeCaptureReportRequestEncoder execType(char value)
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

    public TradeCaptureReportRequestEncoder execType(ExecType value)
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

    private final MutableDirectBuffer orderID = new UnsafeBuffer();
    private byte[] orderIDInternalBuffer = orderID.byteArray();
    private int orderIDOffset = 0;
    private int orderIDLength = 0;

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder orderID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder orderID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    /* OrderID = 37 */
    public TradeCaptureReportRequestEncoder orderID(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public TradeCaptureReportRequestEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public TradeCaptureReportRequestEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    /* ClOrdID = 11 */
    public TradeCaptureReportRequestEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    /* ClOrdID = 11 */
    public TradeCaptureReportRequestEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public TradeCaptureReportRequestEncoder clOrdID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder clOrdID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder clOrdID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    /* ClOrdID = 11 */
    public TradeCaptureReportRequestEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    /* ClOrdID = 11 */
    public TradeCaptureReportRequestEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, clOrdID, offset, length))
        {
            clOrdIDInternalBuffer = clOrdID.byteArray();
        }
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    /* MatchStatus = 573 */
    public TradeCaptureReportRequestEncoder matchStatus(char value)
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

    public TradeCaptureReportRequestEncoder matchStatus(MatchStatus value)
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

    private int trdType;

    private boolean hasTrdType;

    public boolean hasTrdType()
    {
        return hasTrdType;
    }

    /* TrdType = 828 */
    public TradeCaptureReportRequestEncoder trdType(int value)
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

    public TradeCaptureReportRequestEncoder trdType(TrdType value)
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
    public TradeCaptureReportRequestEncoder trdSubType(int value)
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

    private final MutableDirectBuffer transferReason = new UnsafeBuffer();
    private byte[] transferReasonInternalBuffer = transferReason.byteArray();
    private int transferReasonOffset = 0;
    private int transferReasonLength = 0;

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReason(final DirectBuffer value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReason(final DirectBuffer value, final int length)
    {
        return transferReason(value, 0, length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReason(final DirectBuffer value)
    {
        return transferReason(value, 0, value.capacity());
    }

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReason(final byte[] value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReasonAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder transferReason(final byte[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReason(final byte[] value)
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
    public TradeCaptureReportRequestEncoder transferReason(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder transferReason(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder transferReason(final char[] value)
    {
        return transferReason(value, 0, value.length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReason(final char[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    /* TransferReason = 830 */
    public TradeCaptureReportRequestEncoder transferReason(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, transferReason, offset, length))
        {
            transferReasonInternalBuffer = transferReason.byteArray();
        }
        transferReasonOffset = 0;
        transferReasonLength = length;
        return this;
    }

    private int secondaryTrdType;

    private boolean hasSecondaryTrdType;

    public boolean hasSecondaryTrdType()
    {
        return hasSecondaryTrdType;
    }

    /* SecondaryTrdType = 855 */
    public TradeCaptureReportRequestEncoder secondaryTrdType(int value)
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

    private final MutableDirectBuffer tradeLinkID = new UnsafeBuffer();
    private byte[] tradeLinkIDInternalBuffer = tradeLinkID.byteArray();
    private int tradeLinkIDOffset = 0;
    private int tradeLinkIDLength = 0;

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkID(final DirectBuffer value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkID(final DirectBuffer value)
    {
        return tradeLinkID(value, 0, value.capacity());
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkID(final byte[] value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradeLinkID(final byte[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder tradeLinkID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder tradeLinkID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder tradeLinkID(final char[] value)
    {
        return tradeLinkID(value, 0, value.length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkID(final char[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    /* TradeLinkID = 820 */
    public TradeCaptureReportRequestEncoder tradeLinkID(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder trdMatchID(final DirectBuffer value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportRequestEncoder trdMatchID(final DirectBuffer value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportRequestEncoder trdMatchID(final DirectBuffer value)
    {
        return trdMatchID(value, 0, value.capacity());
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportRequestEncoder trdMatchID(final byte[] value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportRequestEncoder trdMatchIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder trdMatchID(final byte[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportRequestEncoder trdMatchID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder trdMatchID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder trdMatchID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder trdMatchID(final char[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportRequestEncoder trdMatchID(final char[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    /* TrdMatchID = 880 */
    public TradeCaptureReportRequestEncoder trdMatchID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, trdMatchID, offset, length))
        {
            trdMatchIDInternalBuffer = trdMatchID.byteArray();
        }
        trdMatchIDOffset = 0;
        trdMatchIDLength = length;
        return this;
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

    private final InstrumentExtensionEncoder instrumentExtension = new InstrumentExtensionEncoder();
    public InstrumentExtensionEncoder instrumentExtension()
    {
        return instrumentExtension;
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
    public TradeCaptureReportRequestEncoder noUnderlyingsGroupCounter(int value)
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
    public TradeCaptureReportRequestEncoder noLegsGroupCounter(int value)
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
public static class DatesGroupEncoder
{
    private DatesGroupEncoder next = null;

    public DatesGroupEncoder next()
    {
        if (next == null)
        {
            next = new DatesGroupEncoder();
        }
        return next;
    }

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();
    private byte[] tradeDateInternalBuffer = tradeDate.byteArray();
    private int tradeDateOffset = 0;
    private int tradeDateLength = 0;

    /* TradeDate = 75 */
    public DatesGroupEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public DatesGroupEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public DatesGroupEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    /* TradeDate = 75 */
    public DatesGroupEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public DatesGroupEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
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
    public DatesGroupEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public DatesGroupEncoder tradeDate(final byte[] value)
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
    public DatesGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public DatesGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public DatesGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public DatesGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public DatesGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public DatesGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public DatesGroupEncoder transactTime(final byte[] value)
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

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTradeDate();
        this.resetTransactTime();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"DatesGroup\",\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public DatesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DatesGroupEncoder)encoder);
    }

    public DatesGroupEncoder copyTo(final DatesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }
        return encoder;
    }

}
    private int noDatesGroupCounter;

    private boolean hasNoDatesGroupCounter;

    public boolean hasNoDatesGroupCounter()
    {
        return hasNoDatesGroupCounter;
    }

    /* NoDatesGroupCounter = 580 */
    public TradeCaptureReportRequestEncoder noDatesGroupCounter(int value)
    {
        noDatesGroupCounter = value;
        hasNoDatesGroupCounter = true;
        return this;
    }

    /* NoDatesGroupCounter = 580 */
    public int noDatesGroupCounter()
    {
        return noDatesGroupCounter;
    }


    private DatesGroupEncoder datesGroup = null;

    public DatesGroupEncoder datesGroup(final int numberOfElements)
    {
        hasNoDatesGroupCounter = true;
        noDatesGroupCounter = numberOfElements;
        if (datesGroup == null)
        {
            datesGroup = new DatesGroupEncoder();
        }
        return datesGroup;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();
    private byte[] clearingBusinessDateInternalBuffer = clearingBusinessDate.byteArray();
    private int clearingBusinessDateOffset = 0;
    private int clearingBusinessDateLength = 0;

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportRequestEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportRequestEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportRequestEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportRequestEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportRequestEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    /* ClearingBusinessDate = 715 */
    public TradeCaptureReportRequestEncoder clearingBusinessDate(final byte[] value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder tradingSessionID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder tradingSessionID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public TradeCaptureReportRequestEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public TradeCaptureReportRequestEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final byte[] value)
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
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public TradeCaptureReportRequestEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder timeBracket(final DirectBuffer value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    /* TimeBracket = 943 */
    public TradeCaptureReportRequestEncoder timeBracket(final DirectBuffer value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    /* TimeBracket = 943 */
    public TradeCaptureReportRequestEncoder timeBracket(final DirectBuffer value)
    {
        return timeBracket(value, 0, value.capacity());
    }

    /* TimeBracket = 943 */
    public TradeCaptureReportRequestEncoder timeBracket(final byte[] value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    /* TimeBracket = 943 */
    public TradeCaptureReportRequestEncoder timeBracketAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder timeBracket(final byte[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    /* TimeBracket = 943 */
    public TradeCaptureReportRequestEncoder timeBracket(final byte[] value)
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
    public TradeCaptureReportRequestEncoder timeBracket(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder timeBracket(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder timeBracket(final char[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    /* TimeBracket = 943 */
    public TradeCaptureReportRequestEncoder timeBracket(final char[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    /* TimeBracket = 943 */
    public TradeCaptureReportRequestEncoder timeBracket(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, timeBracket, offset, length))
        {
            timeBracketInternalBuffer = timeBracket.byteArray();
        }
        timeBracketOffset = 0;
        timeBracketLength = length;
        return this;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    /* Side = 54 */
    public TradeCaptureReportRequestEncoder side(char value)
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

    public TradeCaptureReportRequestEncoder side(Side value)
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

    private char multiLegReportingType;

    private boolean hasMultiLegReportingType;

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }

    /* MultiLegReportingType = 442 */
    public TradeCaptureReportRequestEncoder multiLegReportingType(char value)
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

    public TradeCaptureReportRequestEncoder multiLegReportingType(MultiLegReportingType value)
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

    private final MutableDirectBuffer tradeInputSource = new UnsafeBuffer();
    private byte[] tradeInputSourceInternalBuffer = tradeInputSource.byteArray();
    private int tradeInputSourceOffset = 0;
    private int tradeInputSourceLength = 0;

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSource(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSource(final DirectBuffer value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSource(final DirectBuffer value)
    {
        return tradeInputSource(value, 0, value.capacity());
    }

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSource(final byte[] value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSourceAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradeInputSource(final byte[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSource(final byte[] value)
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
    public TradeCaptureReportRequestEncoder tradeInputSource(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder tradeInputSource(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder tradeInputSource(final char[] value)
    {
        return tradeInputSource(value, 0, value.length);
    }

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSource(final char[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    /* TradeInputSource = 578 */
    public TradeCaptureReportRequestEncoder tradeInputSource(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradeInputDevice(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    /* TradeInputDevice = 579 */
    public TradeCaptureReportRequestEncoder tradeInputDevice(final DirectBuffer value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    /* TradeInputDevice = 579 */
    public TradeCaptureReportRequestEncoder tradeInputDevice(final DirectBuffer value)
    {
        return tradeInputDevice(value, 0, value.capacity());
    }

    /* TradeInputDevice = 579 */
    public TradeCaptureReportRequestEncoder tradeInputDevice(final byte[] value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    /* TradeInputDevice = 579 */
    public TradeCaptureReportRequestEncoder tradeInputDeviceAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder tradeInputDevice(final byte[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    /* TradeInputDevice = 579 */
    public TradeCaptureReportRequestEncoder tradeInputDevice(final byte[] value)
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
    public TradeCaptureReportRequestEncoder tradeInputDevice(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder tradeInputDevice(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder tradeInputDevice(final char[] value)
    {
        return tradeInputDevice(value, 0, value.length);
    }

    /* TradeInputDevice = 579 */
    public TradeCaptureReportRequestEncoder tradeInputDevice(final char[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    /* TradeInputDevice = 579 */
    public TradeCaptureReportRequestEncoder tradeInputDevice(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradeInputDevice, offset, length))
        {
            tradeInputDeviceInternalBuffer = tradeInputDevice.byteArray();
        }
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = length;
        return this;
    }

    private int responseTransportType;

    private boolean hasResponseTransportType;

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }

    /* ResponseTransportType = 725 */
    public TradeCaptureReportRequestEncoder responseTransportType(int value)
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

    public TradeCaptureReportRequestEncoder responseTransportType(ResponseTransportType value)
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
    public TradeCaptureReportRequestEncoder responseDestination(final DirectBuffer value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    /* ResponseDestination = 726 */
    public TradeCaptureReportRequestEncoder responseDestination(final DirectBuffer value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    /* ResponseDestination = 726 */
    public TradeCaptureReportRequestEncoder responseDestination(final DirectBuffer value)
    {
        return responseDestination(value, 0, value.capacity());
    }

    /* ResponseDestination = 726 */
    public TradeCaptureReportRequestEncoder responseDestination(final byte[] value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    /* ResponseDestination = 726 */
    public TradeCaptureReportRequestEncoder responseDestinationAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder responseDestination(final byte[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    /* ResponseDestination = 726 */
    public TradeCaptureReportRequestEncoder responseDestination(final byte[] value)
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
    public TradeCaptureReportRequestEncoder responseDestination(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder responseDestination(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder responseDestination(final char[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    /* ResponseDestination = 726 */
    public TradeCaptureReportRequestEncoder responseDestination(final char[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    /* ResponseDestination = 726 */
    public TradeCaptureReportRequestEncoder responseDestination(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public TradeCaptureReportRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public TradeCaptureReportRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public TradeCaptureReportRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public TradeCaptureReportRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public TradeCaptureReportRequestEncoder text(final byte[] value)
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
    public TradeCaptureReportRequestEncoder text(final CharSequence value)
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
    public TradeCaptureReportRequestEncoder text(final AsciiSequenceView value)
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
    public TradeCaptureReportRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public TradeCaptureReportRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public TradeCaptureReportRequestEncoder text(final char[] value, final int offset, final int length)
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
    public TradeCaptureReportRequestEncoder encodedTextLen(int value)
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
    public TradeCaptureReportRequestEncoder encodedText(byte[] value)
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
    public TradeCaptureReportRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (tradeRequestIDLength > 0)
        {
            buffer.putBytes(position, tradeRequestIDHeader, 0, tradeRequestIDHeaderLength);
            position += tradeRequestIDHeaderLength;
            buffer.putBytes(position, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
            position += tradeRequestIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeRequestID");
        }

        if (hasTradeRequestType)
        {
            buffer.putBytes(position, tradeRequestTypeHeader, 0, tradeRequestTypeHeaderLength);
            position += tradeRequestTypeHeaderLength;
            position += buffer.putIntAscii(position, tradeRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeRequestType");
        }

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
        }

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

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
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

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
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

        if (transferReasonLength > 0)
        {
            buffer.putBytes(position, transferReasonHeader, 0, transferReasonHeaderLength);
            position += transferReasonHeaderLength;
            buffer.putBytes(position, transferReason, transferReasonOffset, transferReasonLength);
            position += transferReasonLength;
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

            position += parties.encode(buffer, position);

            position += instrument.encode(buffer, position);

            position += instrumentExtension.encode(buffer, position);

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


        if (hasNoDatesGroupCounter)
        {
            buffer.putBytes(position, noDatesGroupCounterHeader, 0, noDatesGroupCounterHeaderLength);
            position += noDatesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDatesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (datesGroup != null)
        {
            position += datesGroup.encode(buffer, position, noDatesGroupCounter);
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

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMultiLegReportingType)
        {
            buffer.putBytes(position, multiLegReportingTypeHeader, 0, multiLegReportingTypeHeaderLength);
            position += multiLegReportingTypeHeaderLength;
            position += buffer.putCharAscii(position, multiLegReportingType);
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
        this.resetTradeRequestID();
        this.resetTradeRequestType();
        this.resetSubscriptionRequestType();
        this.resetTradeReportID();
        this.resetSecondaryTradeReportID();
        this.resetExecID();
        this.resetExecType();
        this.resetOrderID();
        this.resetClOrdID();
        this.resetMatchStatus();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetTransferReason();
        this.resetSecondaryTrdType();
        this.resetTradeLinkID();
        this.resetTrdMatchID();
        this.resetClearingBusinessDate();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTimeBracket();
        this.resetSide();
        this.resetMultiLegReportingType();
        this.resetTradeInputSource();
        this.resetTradeInputDevice();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        instrumentExtension.reset();
        financingDetails.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        this.resetDatesGroup();
    }

    public void resetTradeRequestID()
    {
        tradeRequestIDLength = 0;
        tradeRequestID.wrap(tradeRequestIDInternalBuffer);
    }

    public void resetTradeRequestType()
    {
        hasTradeRequestType = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
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

    public void resetExecID()
    {
        execIDLength = 0;
        execID.wrap(execIDInternalBuffer);
    }

    public void resetExecType()
    {
        hasExecType = false;
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

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetTrdSubType()
    {
        hasTrdSubType = false;
    }

    public void resetTransferReason()
    {
        transferReasonLength = 0;
        transferReason.wrap(transferReasonInternalBuffer);
    }

    public void resetSecondaryTrdType()
    {
        hasSecondaryTrdType = false;
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

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
        clearingBusinessDate.wrap(clearingBusinessDateInternalBuffer);
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

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
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

    public void resetDatesGroup()
    {
        if (datesGroup != null)
        {
            datesGroup.reset();
        }
        noDatesGroupCounter = 0;
        hasNoDatesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradeCaptureReportRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradeRequestID())
        {
            indent(builder, level);
            builder.append("\"TradeRequestID\": \"");
            appendBuffer(builder, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
            builder.append("\",\n");
        }

        if (hasTradeRequestType())
        {
            indent(builder, level);
            builder.append("\"TradeRequestType\": \"");
            builder.append(tradeRequestType);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

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

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
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

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
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

        if (hasTransferReason())
        {
            indent(builder, level);
            builder.append("\"TransferReason\": \"");
            appendBuffer(builder, transferReason, transferReasonOffset, transferReasonLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTrdType())
        {
            indent(builder, level);
            builder.append("\"SecondaryTrdType\": \"");
            builder.append(secondaryTrdType);
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

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrumentExtension\": ");
    instrumentExtension.appendTo(builder, level + 1);
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

        if (hasNoDatesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DatesGroup\": [\n");
            final int noDatesGroupCounter = this.noDatesGroupCounter;
            DatesGroupEncoder datesGroup = this.datesGroup;
            for (int i = 0; i < noDatesGroupCounter; i++)
            {
                indent(builder, level);
                datesGroup.appendTo(builder, level + 1);
                if (i < (noDatesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                datesGroup = datesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
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

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
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

    public TradeCaptureReportRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeCaptureReportRequestEncoder)encoder);
    }

    public TradeCaptureReportRequestEncoder copyTo(final TradeCaptureReportRequestEncoder encoder)
    {
        encoder.reset();
        if (hasTradeRequestID())
        {
            encoder.tradeRequestIDAsCopy(tradeRequestID.byteArray(), 0, tradeRequestIDLength);
        }

        if (hasTradeRequestType())
        {
            encoder.tradeRequestType(this.tradeRequestType());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTradeReportID())
        {
            encoder.tradeReportIDAsCopy(tradeReportID.byteArray(), 0, tradeReportIDLength);
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportIDAsCopy(secondaryTradeReportID.byteArray(), 0, secondaryTradeReportIDLength);
        }

        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }

        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasTrdSubType())
        {
            encoder.trdSubType(this.trdSubType());
        }

        if (hasTransferReason())
        {
            encoder.transferReasonAsCopy(transferReason.byteArray(), 0, transferReasonLength);
        }

        if (hasSecondaryTrdType())
        {
            encoder.secondaryTrdType(this.secondaryTrdType());
        }

        if (hasTradeLinkID())
        {
            encoder.tradeLinkIDAsCopy(tradeLinkID.byteArray(), 0, tradeLinkIDLength);
        }

        if (hasTrdMatchID())
        {
            encoder.trdMatchIDAsCopy(trdMatchID.byteArray(), 0, trdMatchIDLength);
        }


        parties.copyTo(encoder.parties());

        instrument.copyTo(encoder.instrument());

        instrumentExtension.copyTo(encoder.instrumentExtension());

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

        if (hasNoDatesGroupCounter)
        {
            final int size = this.noDatesGroupCounter;
            DatesGroupEncoder datesGroup = this.datesGroup;
            DatesGroupEncoder datesGroupEncoder = encoder.datesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (datesGroup != null)
                {
                    datesGroup.copyTo(datesGroupEncoder);
                    datesGroup = datesGroup.next();
                    datesGroupEncoder = datesGroupEncoder.next();
                }
            }
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
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

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasTradeInputSource())
        {
            encoder.tradeInputSourceAsCopy(tradeInputSource.byteArray(), 0, tradeInputSourceLength);
        }

        if (hasTradeInputDevice())
        {
            encoder.tradeInputDeviceAsCopy(tradeInputDevice.byteArray(), 0, tradeInputDeviceLength);
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
