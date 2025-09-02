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
public class SecurityTypesEncoder implements Encoder
{
    public long messageType()
    {
        return 119L;
    }

    public SecurityTypesEncoder()
    {
        header.msgType("w");
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

    private static final int securityReqIDHeaderLength = 4;
    private static final byte[] securityReqIDHeader = new byte[] {51, 50, 48, (byte) '='};

    private static final int securityResponseIDHeaderLength = 4;
    private static final byte[] securityResponseIDHeader = new byte[] {51, 50, 50, (byte) '='};

    private static final int securityResponseTypeHeaderLength = 4;
    private static final byte[] securityResponseTypeHeader = new byte[] {51, 50, 51, (byte) '='};

    private static final int totNoSecurityTypesHeaderLength = 4;
    private static final byte[] totNoSecurityTypesHeader = new byte[] {53, 53, 55, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private static final int noSecurityTypesGroupCounterHeaderLength = 4;
    private static final byte[] noSecurityTypesGroupCounterHeader = new byte[] {53, 53, 56, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private final MutableDirectBuffer securityReqID = new UnsafeBuffer();
    private byte[] securityReqIDInternalBuffer = securityReqID.byteArray();
    private int securityReqIDOffset = 0;
    private int securityReqIDLength = 0;

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final DirectBuffer value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final DirectBuffer value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final DirectBuffer value)
    {
        return securityReqID(value, 0, value.capacity());
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final byte[] value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(securityReqID, value, offset, length))
        {
            securityReqIDInternalBuffer = securityReqID.byteArray();
        }
        securityReqIDOffset = 0;
        securityReqIDLength = length;
        return this;
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final byte[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final byte[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    /* SecurityReqID = 320 */
    public boolean hasSecurityReqID()
    {
        return securityReqIDLength > 0;
    }

    /* SecurityReqID = 320 */
    public MutableDirectBuffer securityReqID()
    {
        return securityReqID;
    }

    /* SecurityReqID = 320 */
    public String securityReqIDAsString()
    {
        return securityReqID.getStringWithoutLengthAscii(securityReqIDOffset, securityReqIDLength);
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final CharSequence value)
    {
        if (toBytes(value, securityReqID))
        {
            securityReqIDInternalBuffer = securityReqID.byteArray();
        }
        securityReqIDOffset = 0;
        securityReqIDLength = value.length();
        return this;
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityReqID.wrap(buffer);
            securityReqIDOffset = value.offset();
            securityReqIDLength = value.length();
        }
        return this;
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final char[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final char[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    /* SecurityReqID = 320 */
    public SecurityTypesEncoder securityReqID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, securityReqID, offset, length))
        {
            securityReqIDInternalBuffer = securityReqID.byteArray();
        }
        securityReqIDOffset = 0;
        securityReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityResponseID = new UnsafeBuffer();
    private byte[] securityResponseIDInternalBuffer = securityResponseID.byteArray();
    private int securityResponseIDOffset = 0;
    private int securityResponseIDLength = 0;

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final DirectBuffer value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final DirectBuffer value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final DirectBuffer value)
    {
        return securityResponseID(value, 0, value.capacity());
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final byte[] value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(securityResponseID, value, offset, length))
        {
            securityResponseIDInternalBuffer = securityResponseID.byteArray();
        }
        securityResponseIDOffset = 0;
        securityResponseIDLength = length;
        return this;
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final byte[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final byte[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    /* SecurityResponseID = 322 */
    public boolean hasSecurityResponseID()
    {
        return securityResponseIDLength > 0;
    }

    /* SecurityResponseID = 322 */
    public MutableDirectBuffer securityResponseID()
    {
        return securityResponseID;
    }

    /* SecurityResponseID = 322 */
    public String securityResponseIDAsString()
    {
        return securityResponseID.getStringWithoutLengthAscii(securityResponseIDOffset, securityResponseIDLength);
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final CharSequence value)
    {
        if (toBytes(value, securityResponseID))
        {
            securityResponseIDInternalBuffer = securityResponseID.byteArray();
        }
        securityResponseIDOffset = 0;
        securityResponseIDLength = value.length();
        return this;
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityResponseID.wrap(buffer);
            securityResponseIDOffset = value.offset();
            securityResponseIDLength = value.length();
        }
        return this;
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final char[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final char[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    /* SecurityResponseID = 322 */
    public SecurityTypesEncoder securityResponseID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, securityResponseID, offset, length))
        {
            securityResponseIDInternalBuffer = securityResponseID.byteArray();
        }
        securityResponseIDOffset = 0;
        securityResponseIDLength = length;
        return this;
    }

    private int securityResponseType;

    private boolean hasSecurityResponseType;

    public boolean hasSecurityResponseType()
    {
        return hasSecurityResponseType;
    }

    /* SecurityResponseType = 323 */
    public SecurityTypesEncoder securityResponseType(int value)
    {
        securityResponseType = value;
        hasSecurityResponseType = true;
        return this;
    }

    /* SecurityResponseType = 323 */
    public int securityResponseType()
    {
        return securityResponseType;
    }

    public SecurityTypesEncoder securityResponseType(SecurityResponseType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityResponseType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityResponseType Value: " + value );
            }
            if (value == SecurityResponseType.NULL_VAL)
            {
                return this;
            }
        }
        return securityResponseType(value.representation());
    }

    private int totNoSecurityTypes;

    private boolean hasTotNoSecurityTypes;

    public boolean hasTotNoSecurityTypes()
    {
        return hasTotNoSecurityTypes;
    }

    /* TotNoSecurityTypes = 557 */
    public SecurityTypesEncoder totNoSecurityTypes(int value)
    {
        totNoSecurityTypes = value;
        hasTotNoSecurityTypes = true;
        return this;
    }

    /* TotNoSecurityTypes = 557 */
    public int totNoSecurityTypes()
    {
        return totNoSecurityTypes;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    /* LastFragment = 893 */
    public SecurityTypesEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    /* LastFragment = 893 */
    public boolean lastFragment()
    {
        return lastFragment;
    }


@Generated("uk.co.real_logic.artio")
public static class SecurityTypesGroupEncoder
{
    private SecurityTypesGroupEncoder next = null;

    public SecurityTypesGroupEncoder next()
    {
        if (next == null)
        {
            next = new SecurityTypesGroupEncoder();
        }
        return next;
    }

    private static final int securityTypeHeaderLength = 4;
    private static final byte[] securityTypeHeader = new byte[] {49, 54, 55, (byte) '='};

    private static final int securitySubTypeHeaderLength = 4;
    private static final byte[] securitySubTypeHeader = new byte[] {55, 54, 50, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

    private static final int cFICodeHeaderLength = 4;
    private static final byte[] cFICodeHeader = new byte[] {52, 54, 49, (byte) '='};

    private final MutableDirectBuffer securityType = new UnsafeBuffer();
    private byte[] securityTypeInternalBuffer = securityType.byteArray();
    private int securityTypeOffset = 0;
    private int securityTypeLength = 0;

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
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
    public SecurityTypesGroupEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityType(final byte[] value)
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
    public SecurityTypesGroupEncoder securityType(final CharSequence value)
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
    public SecurityTypesGroupEncoder securityType(final AsciiSequenceView value)
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
    public SecurityTypesGroupEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    /* SecurityType = 167 */
    public SecurityTypesGroupEncoder securityType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, securityType, offset, length))
        {
            securityTypeInternalBuffer = securityType.byteArray();
        }
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securityType(SecurityType value)
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

    private final MutableDirectBuffer securitySubType = new UnsafeBuffer();
    private byte[] securitySubTypeInternalBuffer = securitySubType.byteArray();
    private int securitySubTypeOffset = 0;
    private int securitySubTypeLength = 0;

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final DirectBuffer value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final DirectBuffer value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final DirectBuffer value)
    {
        return securitySubType(value, 0, value.capacity());
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final byte[] value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(securitySubType, value, offset, length))
        {
            securitySubTypeInternalBuffer = securitySubType.byteArray();
        }
        securitySubTypeOffset = 0;
        securitySubTypeLength = length;
        return this;
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final byte[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final byte[] value)
    {
        return securitySubType(value, 0, value.length);
    }

    /* SecuritySubType = 762 */
    public boolean hasSecuritySubType()
    {
        return securitySubTypeLength > 0;
    }

    /* SecuritySubType = 762 */
    public MutableDirectBuffer securitySubType()
    {
        return securitySubType;
    }

    /* SecuritySubType = 762 */
    public String securitySubTypeAsString()
    {
        return securitySubType.getStringWithoutLengthAscii(securitySubTypeOffset, securitySubTypeLength);
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final CharSequence value)
    {
        if (toBytes(value, securitySubType))
        {
            securitySubTypeInternalBuffer = securitySubType.byteArray();
        }
        securitySubTypeOffset = 0;
        securitySubTypeLength = value.length();
        return this;
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securitySubType.wrap(buffer);
            securitySubTypeOffset = value.offset();
            securitySubTypeLength = value.length();
        }
        return this;
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final char[] value)
    {
        return securitySubType(value, 0, value.length);
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final char[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    /* SecuritySubType = 762 */
    public SecurityTypesGroupEncoder securitySubType(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, securitySubType, offset, length))
        {
            securitySubTypeInternalBuffer = securitySubType.byteArray();
        }
        securitySubTypeOffset = 0;
        securitySubTypeLength = length;
        return this;
    }

    private int product;

    private boolean hasProduct;

    public boolean hasProduct()
    {
        return hasProduct;
    }

    /* Product = 460 */
    public SecurityTypesGroupEncoder product(int value)
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

    public SecurityTypesGroupEncoder product(Product value)
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

    private final MutableDirectBuffer cFICode = new UnsafeBuffer();
    private byte[] cFICodeInternalBuffer = cFICode.byteArray();
    private int cFICodeOffset = 0;
    private int cFICodeLength = 0;

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final DirectBuffer value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final DirectBuffer value, final int length)
    {
        return cFICode(value, 0, length);
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final DirectBuffer value)
    {
        return cFICode(value, 0, value.capacity());
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final byte[] value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(cFICode, value, offset, length))
        {
            cFICodeInternalBuffer = cFICode.byteArray();
        }
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final byte[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final byte[] value)
    {
        return cFICode(value, 0, value.length);
    }

    /* CFICode = 461 */
    public boolean hasCFICode()
    {
        return cFICodeLength > 0;
    }

    /* CFICode = 461 */
    public MutableDirectBuffer cFICode()
    {
        return cFICode;
    }

    /* CFICode = 461 */
    public String cFICodeAsString()
    {
        return cFICode.getStringWithoutLengthAscii(cFICodeOffset, cFICodeLength);
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final CharSequence value)
    {
        if (toBytes(value, cFICode))
        {
            cFICodeInternalBuffer = cFICode.byteArray();
        }
        cFICodeOffset = 0;
        cFICodeLength = value.length();
        return this;
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cFICode.wrap(buffer);
            cFICodeOffset = value.offset();
            cFICodeLength = value.length();
        }
        return this;
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final char[] value)
    {
        return cFICode(value, 0, value.length);
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final char[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    /* CFICode = 461 */
    public SecurityTypesGroupEncoder cFICode(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, cFICode, offset, length))
        {
            cFICodeInternalBuffer = cFICode.byteArray();
        }
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (securityTypeLength > 0)
        {
            buffer.putBytes(position, securityTypeHeader, 0, securityTypeHeaderLength);
            position += securityTypeHeaderLength;
            buffer.putBytes(position, securityType, securityTypeOffset, securityTypeLength);
            position += securityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securitySubTypeLength > 0)
        {
            buffer.putBytes(position, securitySubTypeHeader, 0, securitySubTypeHeaderLength);
            position += securitySubTypeHeaderLength;
            buffer.putBytes(position, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            position += securitySubTypeLength;
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

        if (cFICodeLength > 0)
        {
            buffer.putBytes(position, cFICodeHeader, 0, cFICodeHeaderLength);
            position += cFICodeHeaderLength;
            buffer.putBytes(position, cFICode, cFICodeOffset, cFICodeLength);
            position += cFICodeLength;
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
        this.resetSecurityType();
        this.resetSecuritySubType();
        this.resetProduct();
        this.resetCFICode();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSecurityType()
    {
        securityTypeLength = 0;
        securityType.wrap(securityTypeInternalBuffer);
    }

    public void resetSecuritySubType()
    {
        securitySubTypeLength = 0;
        securitySubType.wrap(securitySubTypeInternalBuffer);
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetCFICode()
    {
        cFICodeLength = 0;
        cFICode.wrap(cFICodeInternalBuffer);
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
        builder.append("\"MessageName\": \"SecurityTypesGroup\",\n");
        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            appendBuffer(builder, securityType, securityTypeOffset, securityTypeLength);
            builder.append("\",\n");
        }

        if (hasSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"SecuritySubType\": \"");
            appendBuffer(builder, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            appendBuffer(builder, cFICode, cFICodeOffset, cFICodeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public SecurityTypesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityTypesGroupEncoder)encoder);
    }

    public SecurityTypesGroupEncoder copyTo(final SecurityTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityType())
        {
            encoder.securityTypeAsCopy(securityType.byteArray(), 0, securityTypeLength);
        }

        if (hasSecuritySubType())
        {
            encoder.securitySubTypeAsCopy(securitySubType.byteArray(), 0, securitySubTypeLength);
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasCFICode())
        {
            encoder.cFICodeAsCopy(cFICode.byteArray(), 0, cFICodeLength);
        }
        return encoder;
    }

}
    private int noSecurityTypesGroupCounter;

    private boolean hasNoSecurityTypesGroupCounter;

    public boolean hasNoSecurityTypesGroupCounter()
    {
        return hasNoSecurityTypesGroupCounter;
    }

    /* NoSecurityTypesGroupCounter = 558 */
    public SecurityTypesEncoder noSecurityTypesGroupCounter(int value)
    {
        noSecurityTypesGroupCounter = value;
        hasNoSecurityTypesGroupCounter = true;
        return this;
    }

    /* NoSecurityTypesGroupCounter = 558 */
    public int noSecurityTypesGroupCounter()
    {
        return noSecurityTypesGroupCounter;
    }


    private SecurityTypesGroupEncoder securityTypesGroup = null;

    public SecurityTypesGroupEncoder securityTypesGroup(final int numberOfElements)
    {
        hasNoSecurityTypesGroupCounter = true;
        noSecurityTypesGroupCounter = numberOfElements;
        if (securityTypesGroup == null)
        {
            securityTypesGroup = new SecurityTypesGroupEncoder();
        }
        return securityTypesGroup;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public SecurityTypesEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public SecurityTypesEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SecurityTypesEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public SecurityTypesEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public SecurityTypesEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public SecurityTypesEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SecurityTypesEncoder text(final byte[] value)
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
    public SecurityTypesEncoder text(final CharSequence value)
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
    public SecurityTypesEncoder text(final AsciiSequenceView value)
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
    public SecurityTypesEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public SecurityTypesEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public SecurityTypesEncoder text(final char[] value, final int offset, final int length)
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
    public SecurityTypesEncoder encodedTextLen(int value)
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
    public SecurityTypesEncoder encodedText(byte[] value)
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
    public SecurityTypesEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SecurityTypesEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionID(final byte[] value)
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
    public SecurityTypesEncoder tradingSessionID(final CharSequence value)
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
    public SecurityTypesEncoder tradingSessionID(final AsciiSequenceView value)
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
    public SecurityTypesEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public SecurityTypesEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public SecurityTypesEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public SecurityTypesEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public SecurityTypesEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public SecurityTypesEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public SecurityTypesEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public SecurityTypesEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public SecurityTypesEncoder tradingSessionSubID(final byte[] value)
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
    public SecurityTypesEncoder tradingSessionSubID(final CharSequence value)
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
    public SecurityTypesEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public SecurityTypesEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public SecurityTypesEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public SecurityTypesEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    /* SubscriptionRequestType = 263 */
    public SecurityTypesEncoder subscriptionRequestType(char value)
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

    public SecurityTypesEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (securityReqIDLength > 0)
        {
            buffer.putBytes(position, securityReqIDHeader, 0, securityReqIDHeaderLength);
            position += securityReqIDHeaderLength;
            buffer.putBytes(position, securityReqID, securityReqIDOffset, securityReqIDLength);
            position += securityReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityReqID");
        }

        if (securityResponseIDLength > 0)
        {
            buffer.putBytes(position, securityResponseIDHeader, 0, securityResponseIDHeaderLength);
            position += securityResponseIDHeaderLength;
            buffer.putBytes(position, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            position += securityResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityResponseID");
        }

        if (hasSecurityResponseType)
        {
            buffer.putBytes(position, securityResponseTypeHeader, 0, securityResponseTypeHeaderLength);
            position += securityResponseTypeHeaderLength;
            position += buffer.putIntAscii(position, securityResponseType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityResponseType");
        }

        if (hasTotNoSecurityTypes)
        {
            buffer.putBytes(position, totNoSecurityTypesHeader, 0, totNoSecurityTypesHeaderLength);
            position += totNoSecurityTypesHeaderLength;
            position += buffer.putIntAscii(position, totNoSecurityTypes);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoSecurityTypesGroupCounter)
        {
            buffer.putBytes(position, noSecurityTypesGroupCounterHeader, 0, noSecurityTypesGroupCounterHeaderLength);
            position += noSecurityTypesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSecurityTypesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (securityTypesGroup != null)
        {
            position += securityTypesGroup.encode(buffer, position, noSecurityTypesGroupCounter);
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

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
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
        this.resetSecurityReqID();
        this.resetSecurityResponseID();
        this.resetSecurityResponseType();
        this.resetTotNoSecurityTypes();
        this.resetLastFragment();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSubscriptionRequestType();
        this.resetSecurityTypesGroup();
    }

    public void resetSecurityReqID()
    {
        securityReqIDLength = 0;
        securityReqID.wrap(securityReqIDInternalBuffer);
    }

    public void resetSecurityResponseID()
    {
        securityResponseIDLength = 0;
        securityResponseID.wrap(securityResponseIDInternalBuffer);
    }

    public void resetSecurityResponseType()
    {
        hasSecurityResponseType = false;
    }

    public void resetTotNoSecurityTypes()
    {
        hasTotNoSecurityTypes = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
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

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetSecurityTypesGroup()
    {
        if (securityTypesGroup != null)
        {
            securityTypesGroup.reset();
        }
        noSecurityTypesGroupCounter = 0;
        hasNoSecurityTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"SecurityTypes\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasSecurityReqID())
        {
            indent(builder, level);
            builder.append("\"SecurityReqID\": \"");
            appendBuffer(builder, securityReqID, securityReqIDOffset, securityReqIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityResponseID())
        {
            indent(builder, level);
            builder.append("\"SecurityResponseID\": \"");
            appendBuffer(builder, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityResponseType())
        {
            indent(builder, level);
            builder.append("\"SecurityResponseType\": \"");
            builder.append(securityResponseType);
            builder.append("\",\n");
        }

        if (hasTotNoSecurityTypes())
        {
            indent(builder, level);
            builder.append("\"TotNoSecurityTypes\": \"");
            builder.append(totNoSecurityTypes);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

        if (hasNoSecurityTypesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SecurityTypesGroup\": [\n");
            final int noSecurityTypesGroupCounter = this.noSecurityTypesGroupCounter;
            SecurityTypesGroupEncoder securityTypesGroup = this.securityTypesGroup;
            for (int i = 0; i < noSecurityTypesGroupCounter; i++)
            {
                indent(builder, level);
                securityTypesGroup.appendTo(builder, level + 1);
                if (i < (noSecurityTypesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                securityTypesGroup = securityTypesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
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

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public SecurityTypesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityTypesEncoder)encoder);
    }

    public SecurityTypesEncoder copyTo(final SecurityTypesEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityReqID())
        {
            encoder.securityReqIDAsCopy(securityReqID.byteArray(), 0, securityReqIDLength);
        }

        if (hasSecurityResponseID())
        {
            encoder.securityResponseIDAsCopy(securityResponseID.byteArray(), 0, securityResponseIDLength);
        }

        if (hasSecurityResponseType())
        {
            encoder.securityResponseType(this.securityResponseType());
        }

        if (hasTotNoSecurityTypes())
        {
            encoder.totNoSecurityTypes(this.totNoSecurityTypes());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }

        if (hasNoSecurityTypesGroupCounter)
        {
            final int size = this.noSecurityTypesGroupCounter;
            SecurityTypesGroupEncoder securityTypesGroup = this.securityTypesGroup;
            SecurityTypesGroupEncoder securityTypesGroupEncoder = encoder.securityTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (securityTypesGroup != null)
                {
                    securityTypesGroup.copyTo(securityTypesGroupEncoder);
                    securityTypesGroup = securityTypesGroup.next();
                    securityTypesGroupEncoder = securityTypesGroupEncoder.next();
                }
            }
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

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }
        return encoder;
    }

}
