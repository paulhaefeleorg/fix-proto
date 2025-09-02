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
public class AllocationInstructionAckEncoder implements Encoder
{
    public long messageType()
    {
        return 80L;
    }

    public AllocationInstructionAckEncoder()
    {
        header.msgType("P");
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

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int secondaryAllocIDHeaderLength = 4;
    private static final byte[] secondaryAllocIDHeader = new byte[] {55, 57, 51, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int allocStatusHeaderLength = 3;
    private static final byte[] allocStatusHeader = new byte[] {56, 55, (byte) '='};

    private static final int allocRejCodeHeaderLength = 3;
    private static final byte[] allocRejCodeHeader = new byte[] {56, 56, (byte) '='};

    private static final int allocTypeHeaderLength = 4;
    private static final byte[] allocTypeHeader = new byte[] {54, 50, 54, (byte) '='};

    private static final int allocIntermedReqTypeHeaderLength = 4;
    private static final byte[] allocIntermedReqTypeHeader = new byte[] {56, 48, 56, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

    private static final int securityTypeHeaderLength = 4;
    private static final byte[] securityTypeHeader = new byte[] {49, 54, 55, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int noAllocsGroupCounterHeaderLength = 3;
    private static final byte[] noAllocsGroupCounterHeader = new byte[] {55, 56, (byte) '='};

    private final MutableDirectBuffer allocID = new UnsafeBuffer();
    private byte[] allocIDInternalBuffer = allocID.byteArray();
    private int allocIDOffset = 0;
    private int allocIDLength = 0;

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
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
    public AllocationInstructionAckEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocID(final byte[] value)
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
    public AllocationInstructionAckEncoder allocID(final CharSequence value)
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
    public AllocationInstructionAckEncoder allocID(final AsciiSequenceView value)
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
    public AllocationInstructionAckEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    /* AllocID = 70 */
    public AllocationInstructionAckEncoder allocID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, allocID, offset, length))
        {
            allocIDInternalBuffer = allocID.byteArray();
        }
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer secondaryAllocID = new UnsafeBuffer();
    private byte[] secondaryAllocIDInternalBuffer = secondaryAllocID.byteArray();
    private int secondaryAllocIDOffset = 0;
    private int secondaryAllocIDLength = 0;

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryAllocID.wrap(value);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final DirectBuffer value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final DirectBuffer value)
    {
        return secondaryAllocID(value, 0, value.capacity());
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final byte[] value, final int offset, final int length)
    {
        secondaryAllocID.wrap(value);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(secondaryAllocID, value, offset, length))
        {
            secondaryAllocIDInternalBuffer = secondaryAllocID.byteArray();
        }
        secondaryAllocIDOffset = 0;
        secondaryAllocIDLength = length;
        return this;
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final byte[] value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final byte[] value)
    {
        return secondaryAllocID(value, 0, value.length);
    }

    /* SecondaryAllocID = 793 */
    public boolean hasSecondaryAllocID()
    {
        return secondaryAllocIDLength > 0;
    }

    /* SecondaryAllocID = 793 */
    public MutableDirectBuffer secondaryAllocID()
    {
        return secondaryAllocID;
    }

    /* SecondaryAllocID = 793 */
    public String secondaryAllocIDAsString()
    {
        return secondaryAllocID.getStringWithoutLengthAscii(secondaryAllocIDOffset, secondaryAllocIDLength);
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final CharSequence value)
    {
        if (toBytes(value, secondaryAllocID))
        {
            secondaryAllocIDInternalBuffer = secondaryAllocID.byteArray();
        }
        secondaryAllocIDOffset = 0;
        secondaryAllocIDLength = value.length();
        return this;
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryAllocID.wrap(buffer);
            secondaryAllocIDOffset = value.offset();
            secondaryAllocIDLength = value.length();
        }
        return this;
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final char[] value)
    {
        return secondaryAllocID(value, 0, value.length);
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final char[] value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    /* SecondaryAllocID = 793 */
    public AllocationInstructionAckEncoder secondaryAllocID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, secondaryAllocID, offset, length))
        {
            secondaryAllocIDInternalBuffer = secondaryAllocID.byteArray();
        }
        secondaryAllocIDOffset = 0;
        secondaryAllocIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();
    private byte[] tradeDateInternalBuffer = tradeDate.byteArray();
    private int tradeDateOffset = 0;
    private int tradeDateLength = 0;

    /* TradeDate = 75 */
    public AllocationInstructionAckEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public AllocationInstructionAckEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public AllocationInstructionAckEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    /* TradeDate = 75 */
    public AllocationInstructionAckEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    /* TradeDate = 75 */
    public AllocationInstructionAckEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
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
    public AllocationInstructionAckEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    /* TradeDate = 75 */
    public AllocationInstructionAckEncoder tradeDate(final byte[] value)
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
    public AllocationInstructionAckEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public AllocationInstructionAckEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public AllocationInstructionAckEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public AllocationInstructionAckEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public AllocationInstructionAckEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public AllocationInstructionAckEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public AllocationInstructionAckEncoder transactTime(final byte[] value)
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

    private int allocStatus;

    private boolean hasAllocStatus;

    public boolean hasAllocStatus()
    {
        return hasAllocStatus;
    }

    /* AllocStatus = 87 */
    public AllocationInstructionAckEncoder allocStatus(int value)
    {
        allocStatus = value;
        hasAllocStatus = true;
        return this;
    }

    /* AllocStatus = 87 */
    public int allocStatus()
    {
        return allocStatus;
    }

    public AllocationInstructionAckEncoder allocStatus(AllocStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocStatus Value: " + value );
            }
            if (value == AllocStatus.NULL_VAL)
            {
                return this;
            }
        }
        return allocStatus(value.representation());
    }

    private int allocRejCode;

    private boolean hasAllocRejCode;

    public boolean hasAllocRejCode()
    {
        return hasAllocRejCode;
    }

    /* AllocRejCode = 88 */
    public AllocationInstructionAckEncoder allocRejCode(int value)
    {
        allocRejCode = value;
        hasAllocRejCode = true;
        return this;
    }

    /* AllocRejCode = 88 */
    public int allocRejCode()
    {
        return allocRejCode;
    }

    public AllocationInstructionAckEncoder allocRejCode(AllocRejCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocRejCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocRejCode Value: " + value );
            }
            if (value == AllocRejCode.NULL_VAL)
            {
                return this;
            }
        }
        return allocRejCode(value.representation());
    }

    private int allocType;

    private boolean hasAllocType;

    public boolean hasAllocType()
    {
        return hasAllocType;
    }

    /* AllocType = 626 */
    public AllocationInstructionAckEncoder allocType(int value)
    {
        allocType = value;
        hasAllocType = true;
        return this;
    }

    /* AllocType = 626 */
    public int allocType()
    {
        return allocType;
    }

    public AllocationInstructionAckEncoder allocType(AllocType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocType Value: " + value );
            }
            if (value == AllocType.NULL_VAL)
            {
                return this;
            }
        }
        return allocType(value.representation());
    }

    private int allocIntermedReqType;

    private boolean hasAllocIntermedReqType;

    public boolean hasAllocIntermedReqType()
    {
        return hasAllocIntermedReqType;
    }

    /* AllocIntermedReqType = 808 */
    public AllocationInstructionAckEncoder allocIntermedReqType(int value)
    {
        allocIntermedReqType = value;
        hasAllocIntermedReqType = true;
        return this;
    }

    /* AllocIntermedReqType = 808 */
    public int allocIntermedReqType()
    {
        return allocIntermedReqType;
    }

    public AllocationInstructionAckEncoder allocIntermedReqType(AllocIntermedReqType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocIntermedReqType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocIntermedReqType Value: " + value );
            }
            if (value == AllocIntermedReqType.NULL_VAL)
            {
                return this;
            }
        }
        return allocIntermedReqType(value.representation());
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    /* MatchStatus = 573 */
    public AllocationInstructionAckEncoder matchStatus(char value)
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

    public AllocationInstructionAckEncoder matchStatus(MatchStatus value)
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

    private int product;

    private boolean hasProduct;

    public boolean hasProduct()
    {
        return hasProduct;
    }

    /* Product = 460 */
    public AllocationInstructionAckEncoder product(int value)
    {
        product = value;
        hasProduct = true;
        return this;
    }

    /* Product = 460 */
    public int product()
    {
        return product;
    }

    public AllocationInstructionAckEncoder product(Product value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Product.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: product Value: " + value );
            }
            if (value == Product.NULL_VAL)
            {
                return this;
            }
        }
        return product(value.representation());
    }

    private final MutableDirectBuffer securityType = new UnsafeBuffer();
    private byte[] securityTypeInternalBuffer = securityType.byteArray();
    private int securityTypeOffset = 0;
    private int securityTypeLength = 0;

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(securityType, value, offset, length))
        {
            securityTypeInternalBuffer = securityType.byteArray();
        }
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final byte[] value)
    {
        return securityType(value, 0, value.length);
    }

    /* SecurityType = 167 */
    public boolean hasSecurityType()
    {
        return securityTypeLength > 0;
    }

    /* SecurityType = 167 */
    public MutableDirectBuffer securityType()
    {
        return securityType;
    }

    /* SecurityType = 167 */
    public String securityTypeAsString()
    {
        return securityType.getStringWithoutLengthAscii(securityTypeOffset, securityTypeLength);
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final CharSequence value)
    {
        if (toBytes(value, securityType))
        {
            securityTypeInternalBuffer = securityType.byteArray();
        }
        securityTypeOffset = 0;
        securityTypeLength = value.length();
        return this;
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityType.wrap(buffer);
            securityTypeOffset = value.offset();
            securityTypeLength = value.length();
        }
        return this;
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public AllocationInstructionAckEncoder securityType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, securityType, offset, length))
        {
            securityTypeInternalBuffer = securityType.byteArray();
        }
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public AllocationInstructionAckEncoder securityType(SecurityType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityType Value: " + value );
            }
            if (value == SecurityType.NULL_VAL)
            {
                return this;
            }
        }
        return securityType(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public AllocationInstructionAckEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public AllocationInstructionAckEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public AllocationInstructionAckEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public AllocationInstructionAckEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public AllocationInstructionAckEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public AllocationInstructionAckEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public AllocationInstructionAckEncoder text(final byte[] value)
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
    public AllocationInstructionAckEncoder text(final CharSequence value)
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
    public AllocationInstructionAckEncoder text(final AsciiSequenceView value)
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
    public AllocationInstructionAckEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public AllocationInstructionAckEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public AllocationInstructionAckEncoder text(final char[] value, final int offset, final int length)
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
    public AllocationInstructionAckEncoder encodedTextLen(int value)
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
    public AllocationInstructionAckEncoder encodedText(byte[] value)
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
    public AllocationInstructionAckEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
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

    private static final int allocPriceHeaderLength = 4;
    private static final byte[] allocPriceHeader = new byte[] {51, 54, 54, (byte) '='};

    private static final int individualAllocIDHeaderLength = 4;
    private static final byte[] individualAllocIDHeader = new byte[] {52, 54, 55, (byte) '='};

    private static final int individualAllocRejCodeHeaderLength = 4;
    private static final byte[] individualAllocRejCodeHeader = new byte[] {55, 55, 54, (byte) '='};

    private static final int allocTextHeaderLength = 4;
    private static final byte[] allocTextHeader = new byte[] {49, 54, 49, (byte) '='};

    private static final int encodedAllocTextLenHeaderLength = 4;
    private static final byte[] encodedAllocTextLenHeader = new byte[] {51, 54, 48, (byte) '='};

    private static final int encodedAllocTextHeaderLength = 4;
    private static final byte[] encodedAllocTextHeader = new byte[] {51, 54, 49, (byte) '='};

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

    private final DecimalFloat allocPrice = new DecimalFloat();

    private boolean hasAllocPrice;

    public boolean hasAllocPrice()
    {
        return hasAllocPrice;
    }

    /* AllocPrice = 366 */
    public AllocsGroupEncoder allocPrice(ReadOnlyDecimalFloat value)
    {
        allocPrice.set(value);
        hasAllocPrice = true;
        return this;
    }

    /* AllocPrice = 366 */
    public AllocsGroupEncoder allocPrice(long value, int scale)
    {
        allocPrice.set(value, scale);
        hasAllocPrice = true;
        return this;
    }

    /* AllocPrice = 366 */
    public DecimalFloat allocPrice()
    {
        return allocPrice;
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

    private int individualAllocRejCode;

    private boolean hasIndividualAllocRejCode;

    public boolean hasIndividualAllocRejCode()
    {
        return hasIndividualAllocRejCode;
    }

    /* IndividualAllocRejCode = 776 */
    public AllocsGroupEncoder individualAllocRejCode(int value)
    {
        individualAllocRejCode = value;
        hasIndividualAllocRejCode = true;
        return this;
    }

    /* IndividualAllocRejCode = 776 */
    public int individualAllocRejCode()
    {
        return individualAllocRejCode;
    }

    private final MutableDirectBuffer allocText = new UnsafeBuffer();
    private byte[] allocTextInternalBuffer = allocText.byteArray();
    private int allocTextOffset = 0;
    private int allocTextLength = 0;

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final DirectBuffer value, final int offset, final int length)
    {
        allocText.wrap(value);
        allocTextOffset = offset;
        allocTextLength = length;
        return this;
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final DirectBuffer value, final int length)
    {
        return allocText(value, 0, length);
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final DirectBuffer value)
    {
        return allocText(value, 0, value.capacity());
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final byte[] value, final int offset, final int length)
    {
        allocText.wrap(value);
        allocTextOffset = offset;
        allocTextLength = length;
        return this;
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocTextAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(allocText, value, offset, length))
        {
            allocTextInternalBuffer = allocText.byteArray();
        }
        allocTextOffset = 0;
        allocTextLength = length;
        return this;
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final byte[] value, final int length)
    {
        return allocText(value, 0, length);
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final byte[] value)
    {
        return allocText(value, 0, value.length);
    }

    /* AllocText = 161 */
    public boolean hasAllocText()
    {
        return allocTextLength > 0;
    }

    /* AllocText = 161 */
    public MutableDirectBuffer allocText()
    {
        return allocText;
    }

    /* AllocText = 161 */
    public String allocTextAsString()
    {
        return allocText.getStringWithoutLengthAscii(allocTextOffset, allocTextLength);
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final CharSequence value)
    {
        if (toBytes(value, allocText))
        {
            allocTextInternalBuffer = allocText.byteArray();
        }
        allocTextOffset = 0;
        allocTextLength = value.length();
        return this;
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocText.wrap(buffer);
            allocTextOffset = value.offset();
            allocTextLength = value.length();
        }
        return this;
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final char[] value)
    {
        return allocText(value, 0, value.length);
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final char[] value, final int length)
    {
        return allocText(value, 0, length);
    }

    /* AllocText = 161 */
    public AllocsGroupEncoder allocText(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, allocText, offset, length))
        {
            allocTextInternalBuffer = allocText.byteArray();
        }
        allocTextOffset = 0;
        allocTextLength = length;
        return this;
    }

    private int encodedAllocTextLen;

    private boolean hasEncodedAllocTextLen;

    public boolean hasEncodedAllocTextLen()
    {
        return hasEncodedAllocTextLen;
    }

    /* EncodedAllocTextLen = 360 */
    public AllocsGroupEncoder encodedAllocTextLen(int value)
    {
        encodedAllocTextLen = value;
        hasEncodedAllocTextLen = true;
        return this;
    }

    /* EncodedAllocTextLen = 360 */
    public int encodedAllocTextLen()
    {
        return encodedAllocTextLen;
    }

    private byte[] encodedAllocText;

    private boolean hasEncodedAllocText;

    public boolean hasEncodedAllocText()
    {
        return hasEncodedAllocText;
    }

    /* EncodedAllocText = 361 */
    public AllocsGroupEncoder encodedAllocText(byte[] value)
    {
        encodedAllocText = value;
        hasEncodedAllocText = true;
        return this;
    }

    /* EncodedAllocText = 361 */
    public byte[] encodedAllocText()
    {
        return encodedAllocText;
    }

    /* EncodedAllocText = 361 */
    public AllocsGroupEncoder encodedAllocTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedAllocText = copyInto(encodedAllocText, value, offset, length);
        hasEncodedAllocText = true;
        return this;
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

        if (hasAllocPrice)
        {
            buffer.putBytes(position, allocPriceHeader, 0, allocPriceHeaderLength);
            position += allocPriceHeaderLength;
            position += buffer.putFloatAscii(position, allocPrice);
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

        if (hasIndividualAllocRejCode)
        {
            buffer.putBytes(position, individualAllocRejCodeHeader, 0, individualAllocRejCodeHeaderLength);
            position += individualAllocRejCodeHeaderLength;
            position += buffer.putIntAscii(position, individualAllocRejCode);
            buffer.putSeparator(position);
            position++;
        }

        if (allocTextLength > 0)
        {
            buffer.putBytes(position, allocTextHeader, 0, allocTextHeaderLength);
            position += allocTextHeaderLength;
            buffer.putBytes(position, allocText, allocTextOffset, allocTextLength);
            position += allocTextLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedAllocTextLen)
        {
            buffer.putBytes(position, encodedAllocTextLenHeader, 0, encodedAllocTextLenHeaderLength);
            position += encodedAllocTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedAllocTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedAllocText)
        {
            buffer.putBytes(position, encodedAllocTextHeader, 0, encodedAllocTextHeaderLength);
            position += encodedAllocTextHeaderLength;
            buffer.putBytes(position, encodedAllocText);
            position += encodedAllocText.length;
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
        this.resetAllocPrice();
        this.resetIndividualAllocID();
        this.resetIndividualAllocRejCode();
        this.resetAllocText();
        this.resetEncodedAllocTextLen();
        this.resetEncodedAllocText();
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

    public void resetAllocPrice()
    {
        hasAllocPrice = false;
    }

    public void resetIndividualAllocID()
    {
        individualAllocIDLength = 0;
        individualAllocID.wrap(individualAllocIDInternalBuffer);
    }

    public void resetIndividualAllocRejCode()
    {
        hasIndividualAllocRejCode = false;
    }

    public void resetAllocText()
    {
        allocTextLength = 0;
        allocText.wrap(allocTextInternalBuffer);
    }

    public void resetEncodedAllocTextLen()
    {
        hasEncodedAllocTextLen = false;
    }

    public void resetEncodedAllocText()
    {
        hasEncodedAllocText = false;
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

        if (hasAllocPrice())
        {
            indent(builder, level);
            builder.append("\"AllocPrice\": \"");
            allocPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            appendBuffer(builder, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            builder.append("\",\n");
        }

        if (hasIndividualAllocRejCode())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocRejCode\": \"");
            builder.append(individualAllocRejCode);
            builder.append("\",\n");
        }

        if (hasAllocText())
        {
            indent(builder, level);
            builder.append("\"AllocText\": \"");
            appendBuffer(builder, allocText, allocTextOffset, allocTextLength);
            builder.append("\",\n");
        }

        if (hasEncodedAllocTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedAllocTextLen\": \"");
            builder.append(encodedAllocTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedAllocText())
        {
            indent(builder, level);
            builder.append("\"EncodedAllocText\": \"");
            appendData(builder, encodedAllocText, encodedAllocTextLen);
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

        if (hasAllocPrice())
        {
            encoder.allocPrice(this.allocPrice());
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }

        if (hasIndividualAllocRejCode())
        {
            encoder.individualAllocRejCode(this.individualAllocRejCode());
        }

        if (hasAllocText())
        {
            encoder.allocTextAsCopy(allocText.byteArray(), 0, allocTextLength);
        }

        if (hasEncodedAllocTextLen())
        {
            encoder.encodedAllocTextLen(this.encodedAllocTextLen());
        }

        if (hasEncodedAllocText())
        {
            encoder.encodedAllocTextAsCopy(this.encodedAllocText(), 0, encodedAllocTextLen());
            encoder.encodedAllocTextLen(encodedAllocTextLen());
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
    public AllocationInstructionAckEncoder noAllocsGroupCounter(int value)
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

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (allocIDLength > 0)
        {
            buffer.putBytes(position, allocIDHeader, 0, allocIDHeaderLength);
            position += allocIDHeaderLength;
            buffer.putBytes(position, allocID, allocIDOffset, allocIDLength);
            position += allocIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AllocID");
        }

            position += parties.encode(buffer, position);

        if (secondaryAllocIDLength > 0)
        {
            buffer.putBytes(position, secondaryAllocIDHeader, 0, secondaryAllocIDHeaderLength);
            position += secondaryAllocIDHeaderLength;
            buffer.putBytes(position, secondaryAllocID, secondaryAllocIDOffset, secondaryAllocIDLength);
            position += secondaryAllocIDLength;
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TransactTime");
        }

        if (hasAllocStatus)
        {
            buffer.putBytes(position, allocStatusHeader, 0, allocStatusHeaderLength);
            position += allocStatusHeaderLength;
            position += buffer.putIntAscii(position, allocStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AllocStatus");
        }

        if (hasAllocRejCode)
        {
            buffer.putBytes(position, allocRejCodeHeader, 0, allocRejCodeHeaderLength);
            position += allocRejCodeHeaderLength;
            position += buffer.putIntAscii(position, allocRejCode);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocType)
        {
            buffer.putBytes(position, allocTypeHeader, 0, allocTypeHeaderLength);
            position += allocTypeHeaderLength;
            position += buffer.putIntAscii(position, allocType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocIntermedReqType)
        {
            buffer.putBytes(position, allocIntermedReqTypeHeader, 0, allocIntermedReqTypeHeaderLength);
            position += allocIntermedReqTypeHeaderLength;
            position += buffer.putIntAscii(position, allocIntermedReqType);
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

        if (hasProduct)
        {
            buffer.putBytes(position, productHeader, 0, productHeaderLength);
            position += productHeaderLength;
            position += buffer.putIntAscii(position, product);
            buffer.putSeparator(position);
            position++;
        }

        if (securityTypeLength > 0)
        {
            buffer.putBytes(position, securityTypeHeader, 0, securityTypeHeaderLength);
            position += securityTypeHeaderLength;
            buffer.putBytes(position, securityType, securityTypeOffset, securityTypeLength);
            position += securityTypeLength;
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
        this.resetAllocID();
        this.resetSecondaryAllocID();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetAllocStatus();
        this.resetAllocRejCode();
        this.resetAllocType();
        this.resetAllocIntermedReqType();
        this.resetMatchStatus();
        this.resetProduct();
        this.resetSecurityType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        this.resetAllocsGroup();
    }

    public void resetAllocID()
    {
        allocIDLength = 0;
        allocID.wrap(allocIDInternalBuffer);
    }

    public void resetSecondaryAllocID()
    {
        secondaryAllocIDLength = 0;
        secondaryAllocID.wrap(secondaryAllocIDInternalBuffer);
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

    public void resetAllocStatus()
    {
        hasAllocStatus = false;
    }

    public void resetAllocRejCode()
    {
        hasAllocRejCode = false;
    }

    public void resetAllocType()
    {
        hasAllocType = false;
    }

    public void resetAllocIntermedReqType()
    {
        hasAllocIntermedReqType = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetSecurityType()
    {
        securityTypeLength = 0;
        securityType.wrap(securityTypeInternalBuffer);
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
        builder.append("\"MessageName\": \"AllocationInstructionAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            appendBuffer(builder, allocID, allocIDOffset, allocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSecondaryAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryAllocID\": \"");
            appendBuffer(builder, secondaryAllocID, secondaryAllocIDOffset, secondaryAllocIDLength);
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

        if (hasAllocStatus())
        {
            indent(builder, level);
            builder.append("\"AllocStatus\": \"");
            builder.append(allocStatus);
            builder.append("\",\n");
        }

        if (hasAllocRejCode())
        {
            indent(builder, level);
            builder.append("\"AllocRejCode\": \"");
            builder.append(allocRejCode);
            builder.append("\",\n");
        }

        if (hasAllocType())
        {
            indent(builder, level);
            builder.append("\"AllocType\": \"");
            builder.append(allocType);
            builder.append("\",\n");
        }

        if (hasAllocIntermedReqType())
        {
            indent(builder, level);
            builder.append("\"AllocIntermedReqType\": \"");
            builder.append(allocIntermedReqType);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            appendBuffer(builder, securityType, securityTypeOffset, securityTypeLength);
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

    public AllocationInstructionAckEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AllocationInstructionAckEncoder)encoder);
    }

    public AllocationInstructionAckEncoder copyTo(final AllocationInstructionAckEncoder encoder)
    {
        encoder.reset();
        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }


        parties.copyTo(encoder.parties());
        if (hasSecondaryAllocID())
        {
            encoder.secondaryAllocIDAsCopy(secondaryAllocID.byteArray(), 0, secondaryAllocIDLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasAllocStatus())
        {
            encoder.allocStatus(this.allocStatus());
        }

        if (hasAllocRejCode())
        {
            encoder.allocRejCode(this.allocRejCode());
        }

        if (hasAllocType())
        {
            encoder.allocType(this.allocType());
        }

        if (hasAllocIntermedReqType())
        {
            encoder.allocIntermedReqType(this.allocIntermedReqType());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasSecurityType())
        {
            encoder.securityTypeAsCopy(securityType.byteArray(), 0, securityTypeLength);
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
