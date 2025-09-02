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
public class MassQuoteAcknowledgementEncoder implements Encoder
{
    public long messageType()
    {
        return 98L;
    }

    public MassQuoteAcknowledgementEncoder()
    {
        header.msgType("b");
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

    private static final int quoteReqIDHeaderLength = 4;
    private static final byte[] quoteReqIDHeader = new byte[] {49, 51, 49, (byte) '='};

    private static final int quoteIDHeaderLength = 4;
    private static final byte[] quoteIDHeader = new byte[] {49, 49, 55, (byte) '='};

    private static final int quoteStatusHeaderLength = 4;
    private static final byte[] quoteStatusHeader = new byte[] {50, 57, 55, (byte) '='};

    private static final int quoteRejectReasonHeaderLength = 4;
    private static final byte[] quoteRejectReasonHeader = new byte[] {51, 48, 48, (byte) '='};

    private static final int quoteResponseLevelHeaderLength = 4;
    private static final byte[] quoteResponseLevelHeader = new byte[] {51, 48, 49, (byte) '='};

    private static final int quoteTypeHeaderLength = 4;
    private static final byte[] quoteTypeHeader = new byte[] {53, 51, 55, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int noQuoteSetsGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteSetsGroupCounterHeader = new byte[] {50, 57, 54, (byte) '='};

    private final MutableDirectBuffer quoteReqID = new UnsafeBuffer();
    private byte[] quoteReqIDInternalBuffer = quoteReqID.byteArray();
    private int quoteReqIDOffset = 0;
    private int quoteReqIDLength = 0;

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final DirectBuffer value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final DirectBuffer value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final DirectBuffer value)
    {
        return quoteReqID(value, 0, value.capacity());
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final byte[] value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(quoteReqID, value, offset, length))
        {
            quoteReqIDInternalBuffer = quoteReqID.byteArray();
        }
        quoteReqIDOffset = 0;
        quoteReqIDLength = length;
        return this;
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final byte[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final byte[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    /* QuoteReqID = 131 */
    public boolean hasQuoteReqID()
    {
        return quoteReqIDLength > 0;
    }

    /* QuoteReqID = 131 */
    public MutableDirectBuffer quoteReqID()
    {
        return quoteReqID;
    }

    /* QuoteReqID = 131 */
    public String quoteReqIDAsString()
    {
        return quoteReqID.getStringWithoutLengthAscii(quoteReqIDOffset, quoteReqIDLength);
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final CharSequence value)
    {
        if (toBytes(value, quoteReqID))
        {
            quoteReqIDInternalBuffer = quoteReqID.byteArray();
        }
        quoteReqIDOffset = 0;
        quoteReqIDLength = value.length();
        return this;
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteReqID.wrap(buffer);
            quoteReqIDOffset = value.offset();
            quoteReqIDLength = value.length();
        }
        return this;
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final char[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final char[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    /* QuoteReqID = 131 */
    public MassQuoteAcknowledgementEncoder quoteReqID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, quoteReqID, offset, length))
        {
            quoteReqIDInternalBuffer = quoteReqID.byteArray();
        }
        quoteReqIDOffset = 0;
        quoteReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();
    private byte[] quoteIDInternalBuffer = quoteID.byteArray();
    private int quoteIDOffset = 0;
    private int quoteIDLength = 0;

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(quoteID, value, offset, length))
        {
            quoteIDInternalBuffer = quoteID.byteArray();
        }
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final byte[] value)
    {
        return quoteID(value, 0, value.length);
    }

    /* QuoteID = 117 */
    public boolean hasQuoteID()
    {
        return quoteIDLength > 0;
    }

    /* QuoteID = 117 */
    public MutableDirectBuffer quoteID()
    {
        return quoteID;
    }

    /* QuoteID = 117 */
    public String quoteIDAsString()
    {
        return quoteID.getStringWithoutLengthAscii(quoteIDOffset, quoteIDLength);
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final CharSequence value)
    {
        if (toBytes(value, quoteID))
        {
            quoteIDInternalBuffer = quoteID.byteArray();
        }
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteID.wrap(buffer);
            quoteIDOffset = value.offset();
            quoteIDLength = value.length();
        }
        return this;
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    /* QuoteID = 117 */
    public MassQuoteAcknowledgementEncoder quoteID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, quoteID, offset, length))
        {
            quoteIDInternalBuffer = quoteID.byteArray();
        }
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    private int quoteStatus;

    private boolean hasQuoteStatus;

    public boolean hasQuoteStatus()
    {
        return hasQuoteStatus;
    }

    /* QuoteStatus = 297 */
    public MassQuoteAcknowledgementEncoder quoteStatus(int value)
    {
        quoteStatus = value;
        hasQuoteStatus = true;
        return this;
    }

    /* QuoteStatus = 297 */
    public int quoteStatus()
    {
        return quoteStatus;
    }

    public MassQuoteAcknowledgementEncoder quoteStatus(QuoteStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteStatus Value: " + value );
            }
            if (value == QuoteStatus.NULL_VAL)
            {
                return this;
            }
        }
        return quoteStatus(value.representation());
    }

    private int quoteRejectReason;

    private boolean hasQuoteRejectReason;

    public boolean hasQuoteRejectReason()
    {
        return hasQuoteRejectReason;
    }

    /* QuoteRejectReason = 300 */
    public MassQuoteAcknowledgementEncoder quoteRejectReason(int value)
    {
        quoteRejectReason = value;
        hasQuoteRejectReason = true;
        return this;
    }

    /* QuoteRejectReason = 300 */
    public int quoteRejectReason()
    {
        return quoteRejectReason;
    }

    public MassQuoteAcknowledgementEncoder quoteRejectReason(QuoteRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteRejectReason Value: " + value );
            }
            if (value == QuoteRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return quoteRejectReason(value.representation());
    }

    private int quoteResponseLevel;

    private boolean hasQuoteResponseLevel;

    public boolean hasQuoteResponseLevel()
    {
        return hasQuoteResponseLevel;
    }

    /* QuoteResponseLevel = 301 */
    public MassQuoteAcknowledgementEncoder quoteResponseLevel(int value)
    {
        quoteResponseLevel = value;
        hasQuoteResponseLevel = true;
        return this;
    }

    /* QuoteResponseLevel = 301 */
    public int quoteResponseLevel()
    {
        return quoteResponseLevel;
    }

    public MassQuoteAcknowledgementEncoder quoteResponseLevel(QuoteResponseLevel value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteResponseLevel.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteResponseLevel Value: " + value );
            }
            if (value == QuoteResponseLevel.NULL_VAL)
            {
                return this;
            }
        }
        return quoteResponseLevel(value.representation());
    }

    private int quoteType;

    private boolean hasQuoteType;

    public boolean hasQuoteType()
    {
        return hasQuoteType;
    }

    /* QuoteType = 537 */
    public MassQuoteAcknowledgementEncoder quoteType(int value)
    {
        quoteType = value;
        hasQuoteType = true;
        return this;
    }

    /* QuoteType = 537 */
    public int quoteType()
    {
        return quoteType;
    }

    public MassQuoteAcknowledgementEncoder quoteType(QuoteType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteType Value: " + value );
            }
            if (value == QuoteType.NULL_VAL)
            {
                return this;
            }
        }
        return quoteType(value.representation());
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
    public MassQuoteAcknowledgementEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public MassQuoteAcknowledgementEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public MassQuoteAcknowledgementEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    /* Account = 1 */
    public MassQuoteAcknowledgementEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    /* Account = 1 */
    public MassQuoteAcknowledgementEncoder accountAsCopy(final byte[] value, final int offset, final int length)
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
    public MassQuoteAcknowledgementEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public MassQuoteAcknowledgementEncoder account(final byte[] value)
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
    public MassQuoteAcknowledgementEncoder account(final CharSequence value)
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
    public MassQuoteAcknowledgementEncoder account(final AsciiSequenceView value)
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
    public MassQuoteAcknowledgementEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    /* Account = 1 */
    public MassQuoteAcknowledgementEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    /* Account = 1 */
    public MassQuoteAcknowledgementEncoder account(final char[] value, final int offset, final int length)
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
    public MassQuoteAcknowledgementEncoder acctIDSource(int value)
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

    public MassQuoteAcknowledgementEncoder acctIDSource(AcctIDSource value)
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
    public MassQuoteAcknowledgementEncoder accountType(int value)
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

    public MassQuoteAcknowledgementEncoder accountType(AccountType value)
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

    private final MutableDirectBuffer text = new UnsafeBuffer();
    private byte[] textInternalBuffer = text.byteArray();
    private int textOffset = 0;
    private int textLength = 0;

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder textAsCopy(final byte[] value, final int offset, final int length)
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
    public MassQuoteAcknowledgementEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder text(final byte[] value)
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
    public MassQuoteAcknowledgementEncoder text(final CharSequence value)
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
    public MassQuoteAcknowledgementEncoder text(final AsciiSequenceView value)
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
    public MassQuoteAcknowledgementEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    /* Text = 58 */
    public MassQuoteAcknowledgementEncoder text(final char[] value, final int offset, final int length)
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
    public MassQuoteAcknowledgementEncoder encodedTextLen(int value)
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
    public MassQuoteAcknowledgementEncoder encodedText(byte[] value)
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
    public MassQuoteAcknowledgementEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }


@Generated("uk.co.real_logic.artio")
public static class QuoteSetsGroupEncoder
{
    private QuoteSetsGroupEncoder next = null;

    public QuoteSetsGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteSetsGroupEncoder();
        }
        return next;
    }

    private static final int quoteSetIDHeaderLength = 4;
    private static final byte[] quoteSetIDHeader = new byte[] {51, 48, 50, (byte) '='};

    private static final int totNoQuoteEntriesHeaderLength = 4;
    private static final byte[] totNoQuoteEntriesHeader = new byte[] {51, 48, 52, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private static final int noQuoteEntriesGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteEntriesGroupCounterHeader = new byte[] {50, 57, 53, (byte) '='};

    private final MutableDirectBuffer quoteSetID = new UnsafeBuffer();
    private byte[] quoteSetIDInternalBuffer = quoteSetID.byteArray();
    private int quoteSetIDOffset = 0;
    private int quoteSetIDLength = 0;

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value, final int offset, final int length)
    {
        quoteSetID.wrap(value);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value)
    {
        return quoteSetID(value, 0, value.capacity());
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final byte[] value, final int offset, final int length)
    {
        quoteSetID.wrap(value);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(quoteSetID, value, offset, length))
        {
            quoteSetIDInternalBuffer = quoteSetID.byteArray();
        }
        quoteSetIDOffset = 0;
        quoteSetIDLength = length;
        return this;
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final byte[] value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final byte[] value)
    {
        return quoteSetID(value, 0, value.length);
    }

    /* QuoteSetID = 302 */
    public boolean hasQuoteSetID()
    {
        return quoteSetIDLength > 0;
    }

    /* QuoteSetID = 302 */
    public MutableDirectBuffer quoteSetID()
    {
        return quoteSetID;
    }

    /* QuoteSetID = 302 */
    public String quoteSetIDAsString()
    {
        return quoteSetID.getStringWithoutLengthAscii(quoteSetIDOffset, quoteSetIDLength);
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final CharSequence value)
    {
        if (toBytes(value, quoteSetID))
        {
            quoteSetIDInternalBuffer = quoteSetID.byteArray();
        }
        quoteSetIDOffset = 0;
        quoteSetIDLength = value.length();
        return this;
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteSetID.wrap(buffer);
            quoteSetIDOffset = value.offset();
            quoteSetIDLength = value.length();
        }
        return this;
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final char[] value)
    {
        return quoteSetID(value, 0, value.length);
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final char[] value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    /* QuoteSetID = 302 */
    public QuoteSetsGroupEncoder quoteSetID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, quoteSetID, offset, length))
        {
            quoteSetIDInternalBuffer = quoteSetID.byteArray();
        }
        quoteSetIDOffset = 0;
        quoteSetIDLength = length;
        return this;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private int totNoQuoteEntries;

    private boolean hasTotNoQuoteEntries;

    public boolean hasTotNoQuoteEntries()
    {
        return hasTotNoQuoteEntries;
    }

    /* TotNoQuoteEntries = 304 */
    public QuoteSetsGroupEncoder totNoQuoteEntries(int value)
    {
        totNoQuoteEntries = value;
        hasTotNoQuoteEntries = true;
        return this;
    }

    /* TotNoQuoteEntries = 304 */
    public int totNoQuoteEntries()
    {
        return totNoQuoteEntries;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    /* LastFragment = 893 */
    public QuoteSetsGroupEncoder lastFragment(boolean value)
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
public static class QuoteEntriesGroupEncoder
{
    private QuoteEntriesGroupEncoder next = null;

    public QuoteEntriesGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteEntriesGroupEncoder();
        }
        return next;
    }

    private static final int quoteEntryIDHeaderLength = 4;
    private static final byte[] quoteEntryIDHeader = new byte[] {50, 57, 57, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int bidPxHeaderLength = 4;
    private static final byte[] bidPxHeader = new byte[] {49, 51, 50, (byte) '='};

    private static final int offerPxHeaderLength = 4;
    private static final byte[] offerPxHeader = new byte[] {49, 51, 51, (byte) '='};

    private static final int bidSizeHeaderLength = 4;
    private static final byte[] bidSizeHeader = new byte[] {49, 51, 52, (byte) '='};

    private static final int offerSizeHeaderLength = 4;
    private static final byte[] offerSizeHeader = new byte[] {49, 51, 53, (byte) '='};

    private static final int validUntilTimeHeaderLength = 3;
    private static final byte[] validUntilTimeHeader = new byte[] {54, 50, (byte) '='};

    private static final int bidSpotRateHeaderLength = 4;
    private static final byte[] bidSpotRateHeader = new byte[] {49, 56, 56, (byte) '='};

    private static final int offerSpotRateHeaderLength = 4;
    private static final byte[] offerSpotRateHeader = new byte[] {49, 57, 48, (byte) '='};

    private static final int bidForwardPointsHeaderLength = 4;
    private static final byte[] bidForwardPointsHeader = new byte[] {49, 56, 57, (byte) '='};

    private static final int offerForwardPointsHeaderLength = 4;
    private static final byte[] offerForwardPointsHeader = new byte[] {49, 57, 49, (byte) '='};

    private static final int midPxHeaderLength = 4;
    private static final byte[] midPxHeader = new byte[] {54, 51, 49, (byte) '='};

    private static final int bidYieldHeaderLength = 4;
    private static final byte[] bidYieldHeader = new byte[] {54, 51, 50, (byte) '='};

    private static final int midYieldHeaderLength = 4;
    private static final byte[] midYieldHeader = new byte[] {54, 51, 51, (byte) '='};

    private static final int offerYieldHeaderLength = 4;
    private static final byte[] offerYieldHeader = new byte[] {54, 51, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int settlDate2HeaderLength = 4;
    private static final byte[] settlDate2Header = new byte[] {49, 57, 51, (byte) '='};

    private static final int orderQty2HeaderLength = 4;
    private static final byte[] orderQty2Header = new byte[] {49, 57, 50, (byte) '='};

    private static final int bidForwardPoints2HeaderLength = 4;
    private static final byte[] bidForwardPoints2Header = new byte[] {54, 52, 50, (byte) '='};

    private static final int offerForwardPoints2HeaderLength = 4;
    private static final byte[] offerForwardPoints2Header = new byte[] {54, 52, 51, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int quoteEntryRejectReasonHeaderLength = 4;
    private static final byte[] quoteEntryRejectReasonHeader = new byte[] {51, 54, 56, (byte) '='};

    private final MutableDirectBuffer quoteEntryID = new UnsafeBuffer();
    private byte[] quoteEntryIDInternalBuffer = quoteEntryID.byteArray();
    private int quoteEntryIDOffset = 0;
    private int quoteEntryIDLength = 0;

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value)
    {
        return quoteEntryID(value, 0, value.capacity());
    }

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryIDAsCopy(final byte[] value, final int offset, final int length)
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
    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value)
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
    public QuoteEntriesGroupEncoder quoteEntryID(final CharSequence value)
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
    public QuoteEntriesGroupEncoder quoteEntryID(final AsciiSequenceView value)
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
    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    /* QuoteEntryID = 299 */
    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, quoteEntryID, offset, length))
        {
            quoteEntryIDInternalBuffer = quoteEntryID.byteArray();
        }
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
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
    public QuoteEntriesGroupEncoder noLegsGroupCounter(int value)
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

    private final DecimalFloat bidPx = new DecimalFloat();

    private boolean hasBidPx;

    public boolean hasBidPx()
    {
        return hasBidPx;
    }

    /* BidPx = 132 */
    public QuoteEntriesGroupEncoder bidPx(ReadOnlyDecimalFloat value)
    {
        bidPx.set(value);
        hasBidPx = true;
        return this;
    }

    /* BidPx = 132 */
    public QuoteEntriesGroupEncoder bidPx(long value, int scale)
    {
        bidPx.set(value, scale);
        hasBidPx = true;
        return this;
    }

    /* BidPx = 132 */
    public DecimalFloat bidPx()
    {
        return bidPx;
    }

    private final DecimalFloat offerPx = new DecimalFloat();

    private boolean hasOfferPx;

    public boolean hasOfferPx()
    {
        return hasOfferPx;
    }

    /* OfferPx = 133 */
    public QuoteEntriesGroupEncoder offerPx(ReadOnlyDecimalFloat value)
    {
        offerPx.set(value);
        hasOfferPx = true;
        return this;
    }

    /* OfferPx = 133 */
    public QuoteEntriesGroupEncoder offerPx(long value, int scale)
    {
        offerPx.set(value, scale);
        hasOfferPx = true;
        return this;
    }

    /* OfferPx = 133 */
    public DecimalFloat offerPx()
    {
        return offerPx;
    }

    private final DecimalFloat bidSize = new DecimalFloat();

    private boolean hasBidSize;

    public boolean hasBidSize()
    {
        return hasBidSize;
    }

    /* BidSize = 134 */
    public QuoteEntriesGroupEncoder bidSize(ReadOnlyDecimalFloat value)
    {
        bidSize.set(value);
        hasBidSize = true;
        return this;
    }

    /* BidSize = 134 */
    public QuoteEntriesGroupEncoder bidSize(long value, int scale)
    {
        bidSize.set(value, scale);
        hasBidSize = true;
        return this;
    }

    /* BidSize = 134 */
    public DecimalFloat bidSize()
    {
        return bidSize;
    }

    private final DecimalFloat offerSize = new DecimalFloat();

    private boolean hasOfferSize;

    public boolean hasOfferSize()
    {
        return hasOfferSize;
    }

    /* OfferSize = 135 */
    public QuoteEntriesGroupEncoder offerSize(ReadOnlyDecimalFloat value)
    {
        offerSize.set(value);
        hasOfferSize = true;
        return this;
    }

    /* OfferSize = 135 */
    public QuoteEntriesGroupEncoder offerSize(long value, int scale)
    {
        offerSize.set(value, scale);
        hasOfferSize = true;
        return this;
    }

    /* OfferSize = 135 */
    public DecimalFloat offerSize()
    {
        return offerSize;
    }

    private final MutableDirectBuffer validUntilTime = new UnsafeBuffer();
    private byte[] validUntilTimeInternalBuffer = validUntilTime.byteArray();
    private int validUntilTimeOffset = 0;
    private int validUntilTimeLength = 0;

    /* ValidUntilTime = 62 */
    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    /* ValidUntilTime = 62 */
    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    /* ValidUntilTime = 62 */
    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value)
    {
        return validUntilTime(value, 0, value.capacity());
    }

    /* ValidUntilTime = 62 */
    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    /* ValidUntilTime = 62 */
    public QuoteEntriesGroupEncoder validUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(validUntilTime, value, offset, length))
        {
            validUntilTimeInternalBuffer = validUntilTime.byteArray();
        }
        validUntilTimeOffset = 0;
        validUntilTimeLength = length;
        return this;
    }

    /* ValidUntilTime = 62 */
    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    /* ValidUntilTime = 62 */
    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value)
    {
        return validUntilTime(value, 0, value.length);
    }

    /* ValidUntilTime = 62 */
    public boolean hasValidUntilTime()
    {
        return validUntilTimeLength > 0;
    }

    /* ValidUntilTime = 62 */
    public MutableDirectBuffer validUntilTime()
    {
        return validUntilTime;
    }

    /* ValidUntilTime = 62 */
    public String validUntilTimeAsString()
    {
        return validUntilTime.getStringWithoutLengthAscii(validUntilTimeOffset, validUntilTimeLength);
    }

    private final DecimalFloat bidSpotRate = new DecimalFloat();

    private boolean hasBidSpotRate;

    public boolean hasBidSpotRate()
    {
        return hasBidSpotRate;
    }

    /* BidSpotRate = 188 */
    public QuoteEntriesGroupEncoder bidSpotRate(ReadOnlyDecimalFloat value)
    {
        bidSpotRate.set(value);
        hasBidSpotRate = true;
        return this;
    }

    /* BidSpotRate = 188 */
    public QuoteEntriesGroupEncoder bidSpotRate(long value, int scale)
    {
        bidSpotRate.set(value, scale);
        hasBidSpotRate = true;
        return this;
    }

    /* BidSpotRate = 188 */
    public DecimalFloat bidSpotRate()
    {
        return bidSpotRate;
    }

    private final DecimalFloat offerSpotRate = new DecimalFloat();

    private boolean hasOfferSpotRate;

    public boolean hasOfferSpotRate()
    {
        return hasOfferSpotRate;
    }

    /* OfferSpotRate = 190 */
    public QuoteEntriesGroupEncoder offerSpotRate(ReadOnlyDecimalFloat value)
    {
        offerSpotRate.set(value);
        hasOfferSpotRate = true;
        return this;
    }

    /* OfferSpotRate = 190 */
    public QuoteEntriesGroupEncoder offerSpotRate(long value, int scale)
    {
        offerSpotRate.set(value, scale);
        hasOfferSpotRate = true;
        return this;
    }

    /* OfferSpotRate = 190 */
    public DecimalFloat offerSpotRate()
    {
        return offerSpotRate;
    }

    private final DecimalFloat bidForwardPoints = new DecimalFloat();

    private boolean hasBidForwardPoints;

    public boolean hasBidForwardPoints()
    {
        return hasBidForwardPoints;
    }

    /* BidForwardPoints = 189 */
    public QuoteEntriesGroupEncoder bidForwardPoints(ReadOnlyDecimalFloat value)
    {
        bidForwardPoints.set(value);
        hasBidForwardPoints = true;
        return this;
    }

    /* BidForwardPoints = 189 */
    public QuoteEntriesGroupEncoder bidForwardPoints(long value, int scale)
    {
        bidForwardPoints.set(value, scale);
        hasBidForwardPoints = true;
        return this;
    }

    /* BidForwardPoints = 189 */
    public DecimalFloat bidForwardPoints()
    {
        return bidForwardPoints;
    }

    private final DecimalFloat offerForwardPoints = new DecimalFloat();

    private boolean hasOfferForwardPoints;

    public boolean hasOfferForwardPoints()
    {
        return hasOfferForwardPoints;
    }

    /* OfferForwardPoints = 191 */
    public QuoteEntriesGroupEncoder offerForwardPoints(ReadOnlyDecimalFloat value)
    {
        offerForwardPoints.set(value);
        hasOfferForwardPoints = true;
        return this;
    }

    /* OfferForwardPoints = 191 */
    public QuoteEntriesGroupEncoder offerForwardPoints(long value, int scale)
    {
        offerForwardPoints.set(value, scale);
        hasOfferForwardPoints = true;
        return this;
    }

    /* OfferForwardPoints = 191 */
    public DecimalFloat offerForwardPoints()
    {
        return offerForwardPoints;
    }

    private final DecimalFloat midPx = new DecimalFloat();

    private boolean hasMidPx;

    public boolean hasMidPx()
    {
        return hasMidPx;
    }

    /* MidPx = 631 */
    public QuoteEntriesGroupEncoder midPx(ReadOnlyDecimalFloat value)
    {
        midPx.set(value);
        hasMidPx = true;
        return this;
    }

    /* MidPx = 631 */
    public QuoteEntriesGroupEncoder midPx(long value, int scale)
    {
        midPx.set(value, scale);
        hasMidPx = true;
        return this;
    }

    /* MidPx = 631 */
    public DecimalFloat midPx()
    {
        return midPx;
    }

    private final DecimalFloat bidYield = new DecimalFloat();

    private boolean hasBidYield;

    public boolean hasBidYield()
    {
        return hasBidYield;
    }

    /* BidYield = 632 */
    public QuoteEntriesGroupEncoder bidYield(ReadOnlyDecimalFloat value)
    {
        bidYield.set(value);
        hasBidYield = true;
        return this;
    }

    /* BidYield = 632 */
    public QuoteEntriesGroupEncoder bidYield(long value, int scale)
    {
        bidYield.set(value, scale);
        hasBidYield = true;
        return this;
    }

    /* BidYield = 632 */
    public DecimalFloat bidYield()
    {
        return bidYield;
    }

    private final DecimalFloat midYield = new DecimalFloat();

    private boolean hasMidYield;

    public boolean hasMidYield()
    {
        return hasMidYield;
    }

    /* MidYield = 633 */
    public QuoteEntriesGroupEncoder midYield(ReadOnlyDecimalFloat value)
    {
        midYield.set(value);
        hasMidYield = true;
        return this;
    }

    /* MidYield = 633 */
    public QuoteEntriesGroupEncoder midYield(long value, int scale)
    {
        midYield.set(value, scale);
        hasMidYield = true;
        return this;
    }

    /* MidYield = 633 */
    public DecimalFloat midYield()
    {
        return midYield;
    }

    private final DecimalFloat offerYield = new DecimalFloat();

    private boolean hasOfferYield;

    public boolean hasOfferYield()
    {
        return hasOfferYield;
    }

    /* OfferYield = 634 */
    public QuoteEntriesGroupEncoder offerYield(ReadOnlyDecimalFloat value)
    {
        offerYield.set(value);
        hasOfferYield = true;
        return this;
    }

    /* OfferYield = 634 */
    public QuoteEntriesGroupEncoder offerYield(long value, int scale)
    {
        offerYield.set(value, scale);
        hasOfferYield = true;
        return this;
    }

    /* OfferYield = 634 */
    public DecimalFloat offerYield()
    {
        return offerYield;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();
    private byte[] transactTimeInternalBuffer = transactTime.byteArray();
    private int transactTimeOffset = 0;
    private int transactTimeLength = 0;

    /* TransactTime = 60 */
    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    /* TransactTime = 60 */
    public QuoteEntriesGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    /* TransactTime = 60 */
    public QuoteEntriesGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
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
    public QuoteEntriesGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    /* TransactTime = 60 */
    public QuoteEntriesGroupEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();
    private byte[] tradingSessionIDInternalBuffer = tradingSessionID.byteArray();
    private int tradingSessionIDOffset = 0;
    private int tradingSessionIDLength = 0;

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
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
    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value)
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
    public QuoteEntriesGroupEncoder tradingSessionID(final CharSequence value)
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
    public QuoteEntriesGroupEncoder tradingSessionID(final AsciiSequenceView value)
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
    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    /* TradingSessionID = 336 */
    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
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
    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    /* TradingSessionSubID = 625 */
    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    /* TradingSessionSubID = 625 */
    public QuoteEntriesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
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
    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value)
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
    public QuoteEntriesGroupEncoder tradingSessionSubID(final CharSequence value)
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
    public QuoteEntriesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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
    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    /* TradingSessionSubID = 625 */
    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    /* TradingSessionSubID = 625 */
    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, tradingSessionSubID, offset, length))
        {
            tradingSessionSubIDInternalBuffer = tradingSessionSubID.byteArray();
        }
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();
    private byte[] settlDateInternalBuffer = settlDate.byteArray();
    private int settlDateOffset = 0;
    private int settlDateLength = 0;

    /* SettlDate = 64 */
    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    /* SettlDate = 64 */
    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    /* SettlDate = 64 */
    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    /* SettlDate = 64 */
    public QuoteEntriesGroupEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    /* SettlDate = 64 */
    public QuoteEntriesGroupEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
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
    public QuoteEntriesGroupEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    /* SettlDate = 64 */
    public QuoteEntriesGroupEncoder settlDate(final byte[] value)
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

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    /* OrdType = 40 */
    public QuoteEntriesGroupEncoder ordType(char value)
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

    public QuoteEntriesGroupEncoder ordType(OrdType value)
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

    private final MutableDirectBuffer settlDate2 = new UnsafeBuffer();
    private byte[] settlDate2InternalBuffer = settlDate2.byteArray();
    private int settlDate2Offset = 0;
    private int settlDate2Length = 0;

    /* SettlDate2 = 193 */
    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    /* SettlDate2 = 193 */
    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    /* SettlDate2 = 193 */
    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value)
    {
        return settlDate2(value, 0, value.capacity());
    }

    /* SettlDate2 = 193 */
    public QuoteEntriesGroupEncoder settlDate2(final byte[] value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    /* SettlDate2 = 193 */
    public QuoteEntriesGroupEncoder settlDate2AsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(settlDate2, value, offset, length))
        {
            settlDate2InternalBuffer = settlDate2.byteArray();
        }
        settlDate2Offset = 0;
        settlDate2Length = length;
        return this;
    }

    /* SettlDate2 = 193 */
    public QuoteEntriesGroupEncoder settlDate2(final byte[] value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    /* SettlDate2 = 193 */
    public QuoteEntriesGroupEncoder settlDate2(final byte[] value)
    {
        return settlDate2(value, 0, value.length);
    }

    /* SettlDate2 = 193 */
    public boolean hasSettlDate2()
    {
        return settlDate2Length > 0;
    }

    /* SettlDate2 = 193 */
    public MutableDirectBuffer settlDate2()
    {
        return settlDate2;
    }

    /* SettlDate2 = 193 */
    public String settlDate2AsString()
    {
        return settlDate2.getStringWithoutLengthAscii(settlDate2Offset, settlDate2Length);
    }

    private final DecimalFloat orderQty2 = new DecimalFloat();

    private boolean hasOrderQty2;

    public boolean hasOrderQty2()
    {
        return hasOrderQty2;
    }

    /* OrderQty2 = 192 */
    public QuoteEntriesGroupEncoder orderQty2(ReadOnlyDecimalFloat value)
    {
        orderQty2.set(value);
        hasOrderQty2 = true;
        return this;
    }

    /* OrderQty2 = 192 */
    public QuoteEntriesGroupEncoder orderQty2(long value, int scale)
    {
        orderQty2.set(value, scale);
        hasOrderQty2 = true;
        return this;
    }

    /* OrderQty2 = 192 */
    public DecimalFloat orderQty2()
    {
        return orderQty2;
    }

    private final DecimalFloat bidForwardPoints2 = new DecimalFloat();

    private boolean hasBidForwardPoints2;

    public boolean hasBidForwardPoints2()
    {
        return hasBidForwardPoints2;
    }

    /* BidForwardPoints2 = 642 */
    public QuoteEntriesGroupEncoder bidForwardPoints2(ReadOnlyDecimalFloat value)
    {
        bidForwardPoints2.set(value);
        hasBidForwardPoints2 = true;
        return this;
    }

    /* BidForwardPoints2 = 642 */
    public QuoteEntriesGroupEncoder bidForwardPoints2(long value, int scale)
    {
        bidForwardPoints2.set(value, scale);
        hasBidForwardPoints2 = true;
        return this;
    }

    /* BidForwardPoints2 = 642 */
    public DecimalFloat bidForwardPoints2()
    {
        return bidForwardPoints2;
    }

    private final DecimalFloat offerForwardPoints2 = new DecimalFloat();

    private boolean hasOfferForwardPoints2;

    public boolean hasOfferForwardPoints2()
    {
        return hasOfferForwardPoints2;
    }

    /* OfferForwardPoints2 = 643 */
    public QuoteEntriesGroupEncoder offerForwardPoints2(ReadOnlyDecimalFloat value)
    {
        offerForwardPoints2.set(value);
        hasOfferForwardPoints2 = true;
        return this;
    }

    /* OfferForwardPoints2 = 643 */
    public QuoteEntriesGroupEncoder offerForwardPoints2(long value, int scale)
    {
        offerForwardPoints2.set(value, scale);
        hasOfferForwardPoints2 = true;
        return this;
    }

    /* OfferForwardPoints2 = 643 */
    public DecimalFloat offerForwardPoints2()
    {
        return offerForwardPoints2;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();
    private byte[] currencyInternalBuffer = currency.byteArray();
    private int currencyOffset = 0;
    private int currencyLength = 0;

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
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
    public QuoteEntriesGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currency(final byte[] value)
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
    public QuoteEntriesGroupEncoder currency(final CharSequence value)
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
    public QuoteEntriesGroupEncoder currency(final AsciiSequenceView value)
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
    public QuoteEntriesGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    /* Currency = 15 */
    public QuoteEntriesGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, currency, offset, length))
        {
            currencyInternalBuffer = currency.byteArray();
        }
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private int quoteEntryRejectReason;

    private boolean hasQuoteEntryRejectReason;

    public boolean hasQuoteEntryRejectReason()
    {
        return hasQuoteEntryRejectReason;
    }

    /* QuoteEntryRejectReason = 368 */
    public QuoteEntriesGroupEncoder quoteEntryRejectReason(int value)
    {
        quoteEntryRejectReason = value;
        hasQuoteEntryRejectReason = true;
        return this;
    }

    /* QuoteEntryRejectReason = 368 */
    public int quoteEntryRejectReason()
    {
        return quoteEntryRejectReason;
    }

    public QuoteEntriesGroupEncoder quoteEntryRejectReason(QuoteEntryRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteEntryRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteEntryRejectReason Value: " + value );
            }
            if (value == QuoteEntryRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return quoteEntryRejectReason(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (quoteEntryIDLength > 0)
        {
            buffer.putBytes(position, quoteEntryIDHeader, 0, quoteEntryIDHeaderLength);
            position += quoteEntryIDHeaderLength;
            buffer.putBytes(position, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            position += quoteEntryIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

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


        if (hasBidPx)
        {
            buffer.putBytes(position, bidPxHeader, 0, bidPxHeaderLength);
            position += bidPxHeaderLength;
            position += buffer.putFloatAscii(position, bidPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferPx)
        {
            buffer.putBytes(position, offerPxHeader, 0, offerPxHeaderLength);
            position += offerPxHeaderLength;
            position += buffer.putFloatAscii(position, offerPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidSize)
        {
            buffer.putBytes(position, bidSizeHeader, 0, bidSizeHeaderLength);
            position += bidSizeHeaderLength;
            position += buffer.putFloatAscii(position, bidSize);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferSize)
        {
            buffer.putBytes(position, offerSizeHeader, 0, offerSizeHeaderLength);
            position += offerSizeHeaderLength;
            position += buffer.putFloatAscii(position, offerSize);
            buffer.putSeparator(position);
            position++;
        }

        if (validUntilTimeLength > 0)
        {
            buffer.putBytes(position, validUntilTimeHeader, 0, validUntilTimeHeaderLength);
            position += validUntilTimeHeaderLength;
            buffer.putBytes(position, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            position += validUntilTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidSpotRate)
        {
            buffer.putBytes(position, bidSpotRateHeader, 0, bidSpotRateHeaderLength);
            position += bidSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, bidSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferSpotRate)
        {
            buffer.putBytes(position, offerSpotRateHeader, 0, offerSpotRateHeaderLength);
            position += offerSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, offerSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidForwardPoints)
        {
            buffer.putBytes(position, bidForwardPointsHeader, 0, bidForwardPointsHeaderLength);
            position += bidForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, bidForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferForwardPoints)
        {
            buffer.putBytes(position, offerForwardPointsHeader, 0, offerForwardPointsHeaderLength);
            position += offerForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, offerForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMidPx)
        {
            buffer.putBytes(position, midPxHeader, 0, midPxHeaderLength);
            position += midPxHeaderLength;
            position += buffer.putFloatAscii(position, midPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidYield)
        {
            buffer.putBytes(position, bidYieldHeader, 0, bidYieldHeaderLength);
            position += bidYieldHeaderLength;
            position += buffer.putFloatAscii(position, bidYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMidYield)
        {
            buffer.putBytes(position, midYieldHeader, 0, midYieldHeaderLength);
            position += midYieldHeaderLength;
            position += buffer.putFloatAscii(position, midYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferYield)
        {
            buffer.putBytes(position, offerYieldHeader, 0, offerYieldHeaderLength);
            position += offerYieldHeaderLength;
            position += buffer.putFloatAscii(position, offerYield);
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

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
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

        if (settlDate2Length > 0)
        {
            buffer.putBytes(position, settlDate2Header, 0, settlDate2HeaderLength);
            position += settlDate2HeaderLength;
            buffer.putBytes(position, settlDate2, settlDate2Offset, settlDate2Length);
            position += settlDate2Length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderQty2)
        {
            buffer.putBytes(position, orderQty2Header, 0, orderQty2HeaderLength);
            position += orderQty2HeaderLength;
            position += buffer.putFloatAscii(position, orderQty2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidForwardPoints2)
        {
            buffer.putBytes(position, bidForwardPoints2Header, 0, bidForwardPoints2HeaderLength);
            position += bidForwardPoints2HeaderLength;
            position += buffer.putFloatAscii(position, bidForwardPoints2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferForwardPoints2)
        {
            buffer.putBytes(position, offerForwardPoints2Header, 0, offerForwardPoints2HeaderLength);
            position += offerForwardPoints2HeaderLength;
            position += buffer.putFloatAscii(position, offerForwardPoints2);
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

        if (hasQuoteEntryRejectReason)
        {
            buffer.putBytes(position, quoteEntryRejectReasonHeader, 0, quoteEntryRejectReasonHeaderLength);
            position += quoteEntryRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, quoteEntryRejectReason);
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
        this.resetQuoteEntryID();
        this.resetBidPx();
        this.resetOfferPx();
        this.resetBidSize();
        this.resetOfferSize();
        this.resetValidUntilTime();
        this.resetBidSpotRate();
        this.resetOfferSpotRate();
        this.resetBidForwardPoints();
        this.resetOfferForwardPoints();
        this.resetMidPx();
        this.resetBidYield();
        this.resetMidYield();
        this.resetOfferYield();
        this.resetTransactTime();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSettlDate();
        this.resetOrdType();
        this.resetSettlDate2();
        this.resetOrderQty2();
        this.resetBidForwardPoints2();
        this.resetOfferForwardPoints2();
        this.resetCurrency();
        this.resetQuoteEntryRejectReason();
        instrument.reset();
        this.resetLegsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetQuoteEntryID()
    {
        quoteEntryIDLength = 0;
        quoteEntryID.wrap(quoteEntryIDInternalBuffer);
    }

    public void resetBidPx()
    {
        hasBidPx = false;
    }

    public void resetOfferPx()
    {
        hasOfferPx = false;
    }

    public void resetBidSize()
    {
        hasBidSize = false;
    }

    public void resetOfferSize()
    {
        hasOfferSize = false;
    }

    public void resetValidUntilTime()
    {
        validUntilTimeLength = 0;
        validUntilTime.wrap(validUntilTimeInternalBuffer);
    }

    public void resetBidSpotRate()
    {
        hasBidSpotRate = false;
    }

    public void resetOfferSpotRate()
    {
        hasOfferSpotRate = false;
    }

    public void resetBidForwardPoints()
    {
        hasBidForwardPoints = false;
    }

    public void resetOfferForwardPoints()
    {
        hasOfferForwardPoints = false;
    }

    public void resetMidPx()
    {
        hasMidPx = false;
    }

    public void resetBidYield()
    {
        hasBidYield = false;
    }

    public void resetMidYield()
    {
        hasMidYield = false;
    }

    public void resetOfferYield()
    {
        hasOfferYield = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
        transactTime.wrap(transactTimeInternalBuffer);
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

    public void resetSettlDate()
    {
        settlDateLength = 0;
        settlDate.wrap(settlDateInternalBuffer);
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetSettlDate2()
    {
        settlDate2Length = 0;
        settlDate2.wrap(settlDate2InternalBuffer);
    }

    public void resetOrderQty2()
    {
        hasOrderQty2 = false;
    }

    public void resetBidForwardPoints2()
    {
        hasBidForwardPoints2 = false;
    }

    public void resetOfferForwardPoints2()
    {
        hasOfferForwardPoints2 = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
        currency.wrap(currencyInternalBuffer);
    }

    public void resetQuoteEntryRejectReason()
    {
        hasQuoteEntryRejectReason = false;
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
        builder.append("\"MessageName\": \"QuoteEntriesGroup\",\n");
        if (hasQuoteEntryID())
        {
            indent(builder, level);
            builder.append("\"QuoteEntryID\": \"");
            appendBuffer(builder, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasBidPx())
        {
            indent(builder, level);
            builder.append("\"BidPx\": \"");
            bidPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferPx())
        {
            indent(builder, level);
            builder.append("\"OfferPx\": \"");
            offerPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidSize())
        {
            indent(builder, level);
            builder.append("\"BidSize\": \"");
            bidSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferSize())
        {
            indent(builder, level);
            builder.append("\"OfferSize\": \"");
            offerSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasValidUntilTime())
        {
            indent(builder, level);
            builder.append("\"ValidUntilTime\": \"");
            appendBuffer(builder, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            builder.append("\",\n");
        }

        if (hasBidSpotRate())
        {
            indent(builder, level);
            builder.append("\"BidSpotRate\": \"");
            bidSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferSpotRate())
        {
            indent(builder, level);
            builder.append("\"OfferSpotRate\": \"");
            offerSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidForwardPoints())
        {
            indent(builder, level);
            builder.append("\"BidForwardPoints\": \"");
            bidForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferForwardPoints())
        {
            indent(builder, level);
            builder.append("\"OfferForwardPoints\": \"");
            offerForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMidPx())
        {
            indent(builder, level);
            builder.append("\"MidPx\": \"");
            midPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidYield())
        {
            indent(builder, level);
            builder.append("\"BidYield\": \"");
            bidYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMidYield())
        {
            indent(builder, level);
            builder.append("\"MidYield\": \"");
            midYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferYield())
        {
            indent(builder, level);
            builder.append("\"OfferYield\": \"");
            offerYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasSettlDate2())
        {
            indent(builder, level);
            builder.append("\"SettlDate2\": \"");
            appendBuffer(builder, settlDate2, settlDate2Offset, settlDate2Length);
            builder.append("\",\n");
        }

        if (hasOrderQty2())
        {
            indent(builder, level);
            builder.append("\"OrderQty2\": \"");
            orderQty2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidForwardPoints2())
        {
            indent(builder, level);
            builder.append("\"BidForwardPoints2\": \"");
            bidForwardPoints2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferForwardPoints2())
        {
            indent(builder, level);
            builder.append("\"OfferForwardPoints2\": \"");
            offerForwardPoints2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasQuoteEntryRejectReason())
        {
            indent(builder, level);
            builder.append("\"QuoteEntryRejectReason\": \"");
            builder.append(quoteEntryRejectReason);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public QuoteEntriesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteEntriesGroupEncoder)encoder);
    }

    public QuoteEntriesGroupEncoder copyTo(final QuoteEntriesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteEntryID())
        {
            encoder.quoteEntryIDAsCopy(quoteEntryID.byteArray(), 0, quoteEntryIDLength);
        }


        instrument.copyTo(encoder.instrument());
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

        if (hasBidPx())
        {
            encoder.bidPx(this.bidPx());
        }

        if (hasOfferPx())
        {
            encoder.offerPx(this.offerPx());
        }

        if (hasBidSize())
        {
            encoder.bidSize(this.bidSize());
        }

        if (hasOfferSize())
        {
            encoder.offerSize(this.offerSize());
        }

        if (hasValidUntilTime())
        {
            encoder.validUntilTimeAsCopy(validUntilTime.byteArray(), 0, validUntilTimeLength);
        }

        if (hasBidSpotRate())
        {
            encoder.bidSpotRate(this.bidSpotRate());
        }

        if (hasOfferSpotRate())
        {
            encoder.offerSpotRate(this.offerSpotRate());
        }

        if (hasBidForwardPoints())
        {
            encoder.bidForwardPoints(this.bidForwardPoints());
        }

        if (hasOfferForwardPoints())
        {
            encoder.offerForwardPoints(this.offerForwardPoints());
        }

        if (hasMidPx())
        {
            encoder.midPx(this.midPx());
        }

        if (hasBidYield())
        {
            encoder.bidYield(this.bidYield());
        }

        if (hasMidYield())
        {
            encoder.midYield(this.midYield());
        }

        if (hasOfferYield())
        {
            encoder.offerYield(this.offerYield());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasSettlDate2())
        {
            encoder.settlDate2AsCopy(settlDate2.byteArray(), 0, settlDate2Length);
        }

        if (hasOrderQty2())
        {
            encoder.orderQty2(this.orderQty2());
        }

        if (hasBidForwardPoints2())
        {
            encoder.bidForwardPoints2(this.bidForwardPoints2());
        }

        if (hasOfferForwardPoints2())
        {
            encoder.offerForwardPoints2(this.offerForwardPoints2());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasQuoteEntryRejectReason())
        {
            encoder.quoteEntryRejectReason(this.quoteEntryRejectReason());
        }
        return encoder;
    }

}
    private int noQuoteEntriesGroupCounter;

    private boolean hasNoQuoteEntriesGroupCounter;

    public boolean hasNoQuoteEntriesGroupCounter()
    {
        return hasNoQuoteEntriesGroupCounter;
    }

    /* NoQuoteEntriesGroupCounter = 295 */
    public QuoteSetsGroupEncoder noQuoteEntriesGroupCounter(int value)
    {
        noQuoteEntriesGroupCounter = value;
        hasNoQuoteEntriesGroupCounter = true;
        return this;
    }

    /* NoQuoteEntriesGroupCounter = 295 */
    public int noQuoteEntriesGroupCounter()
    {
        return noQuoteEntriesGroupCounter;
    }


    private QuoteEntriesGroupEncoder quoteEntriesGroup = null;

    public QuoteEntriesGroupEncoder quoteEntriesGroup(final int numberOfElements)
    {
        hasNoQuoteEntriesGroupCounter = true;
        noQuoteEntriesGroupCounter = numberOfElements;
        if (quoteEntriesGroup == null)
        {
            quoteEntriesGroup = new QuoteEntriesGroupEncoder();
        }
        return quoteEntriesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (quoteSetIDLength > 0)
        {
            buffer.putBytes(position, quoteSetIDHeader, 0, quoteSetIDHeaderLength);
            position += quoteSetIDHeaderLength;
            buffer.putBytes(position, quoteSetID, quoteSetIDOffset, quoteSetIDLength);
            position += quoteSetIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += underlyingInstrument.encode(buffer, position);

        if (hasTotNoQuoteEntries)
        {
            buffer.putBytes(position, totNoQuoteEntriesHeader, 0, totNoQuoteEntriesHeaderLength);
            position += totNoQuoteEntriesHeaderLength;
            position += buffer.putIntAscii(position, totNoQuoteEntries);
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

        if (hasNoQuoteEntriesGroupCounter)
        {
            buffer.putBytes(position, noQuoteEntriesGroupCounterHeader, 0, noQuoteEntriesGroupCounterHeaderLength);
            position += noQuoteEntriesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteEntriesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteEntriesGroup != null)
        {
            position += quoteEntriesGroup.encode(buffer, position, noQuoteEntriesGroupCounter);
        }

        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteSetID();
        this.resetTotNoQuoteEntries();
        this.resetLastFragment();
        underlyingInstrument.reset();
        this.resetQuoteEntriesGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetQuoteSetID()
    {
        quoteSetIDLength = 0;
        quoteSetID.wrap(quoteSetIDInternalBuffer);
    }

    public void resetTotNoQuoteEntries()
    {
        hasTotNoQuoteEntries = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
    }

    public void resetQuoteEntriesGroup()
    {
        if (quoteEntriesGroup != null)
        {
            quoteEntriesGroup.reset();
        }
        noQuoteEntriesGroupCounter = 0;
        hasNoQuoteEntriesGroupCounter = false;
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
        builder.append("\"MessageName\": \"QuoteSetsGroup\",\n");
        if (hasQuoteSetID())
        {
            indent(builder, level);
            builder.append("\"QuoteSetID\": \"");
            appendBuffer(builder, quoteSetID, quoteSetIDOffset, quoteSetIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTotNoQuoteEntries())
        {
            indent(builder, level);
            builder.append("\"TotNoQuoteEntries\": \"");
            builder.append(totNoQuoteEntries);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

        if (hasNoQuoteEntriesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteEntriesGroup\": [\n");
            final int noQuoteEntriesGroupCounter = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            for (int i = 0; i < noQuoteEntriesGroupCounter; i++)
            {
                indent(builder, level);
                quoteEntriesGroup.appendTo(builder, level + 1);
                if (i < (noQuoteEntriesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteEntriesGroup = quoteEntriesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public QuoteSetsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteSetsGroupEncoder)encoder);
    }

    public QuoteSetsGroupEncoder copyTo(final QuoteSetsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteSetID())
        {
            encoder.quoteSetIDAsCopy(quoteSetID.byteArray(), 0, quoteSetIDLength);
        }


        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasTotNoQuoteEntries())
        {
            encoder.totNoQuoteEntries(this.totNoQuoteEntries());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }

        if (hasNoQuoteEntriesGroupCounter)
        {
            final int size = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            QuoteEntriesGroupEncoder quoteEntriesGroupEncoder = encoder.quoteEntriesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteEntriesGroup != null)
                {
                    quoteEntriesGroup.copyTo(quoteEntriesGroupEncoder);
                    quoteEntriesGroup = quoteEntriesGroup.next();
                    quoteEntriesGroupEncoder = quoteEntriesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
    private int noQuoteSetsGroupCounter;

    private boolean hasNoQuoteSetsGroupCounter;

    public boolean hasNoQuoteSetsGroupCounter()
    {
        return hasNoQuoteSetsGroupCounter;
    }

    /* NoQuoteSetsGroupCounter = 296 */
    public MassQuoteAcknowledgementEncoder noQuoteSetsGroupCounter(int value)
    {
        noQuoteSetsGroupCounter = value;
        hasNoQuoteSetsGroupCounter = true;
        return this;
    }

    /* NoQuoteSetsGroupCounter = 296 */
    public int noQuoteSetsGroupCounter()
    {
        return noQuoteSetsGroupCounter;
    }


    private QuoteSetsGroupEncoder quoteSetsGroup = null;

    public QuoteSetsGroupEncoder quoteSetsGroup(final int numberOfElements)
    {
        hasNoQuoteSetsGroupCounter = true;
        noQuoteSetsGroupCounter = numberOfElements;
        if (quoteSetsGroup == null)
        {
            quoteSetsGroup = new QuoteSetsGroupEncoder();
        }
        return quoteSetsGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (quoteReqIDLength > 0)
        {
            buffer.putBytes(position, quoteReqIDHeader, 0, quoteReqIDHeaderLength);
            position += quoteReqIDHeaderLength;
            buffer.putBytes(position, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            position += quoteReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (quoteIDLength > 0)
        {
            buffer.putBytes(position, quoteIDHeader, 0, quoteIDHeaderLength);
            position += quoteIDHeaderLength;
            buffer.putBytes(position, quoteID, quoteIDOffset, quoteIDLength);
            position += quoteIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteStatus)
        {
            buffer.putBytes(position, quoteStatusHeader, 0, quoteStatusHeaderLength);
            position += quoteStatusHeaderLength;
            position += buffer.putIntAscii(position, quoteStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteStatus");
        }

        if (hasQuoteRejectReason)
        {
            buffer.putBytes(position, quoteRejectReasonHeader, 0, quoteRejectReasonHeaderLength);
            position += quoteRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, quoteRejectReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteResponseLevel)
        {
            buffer.putBytes(position, quoteResponseLevelHeader, 0, quoteResponseLevelHeaderLength);
            position += quoteResponseLevelHeaderLength;
            position += buffer.putIntAscii(position, quoteResponseLevel);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteType)
        {
            buffer.putBytes(position, quoteTypeHeader, 0, quoteTypeHeaderLength);
            position += quoteTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteType);
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

        if (hasNoQuoteSetsGroupCounter)
        {
            buffer.putBytes(position, noQuoteSetsGroupCounterHeader, 0, noQuoteSetsGroupCounterHeaderLength);
            position += noQuoteSetsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteSetsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteSetsGroup != null)
        {
            position += quoteSetsGroup.encode(buffer, position, noQuoteSetsGroupCounter);
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
        this.resetQuoteReqID();
        this.resetQuoteID();
        this.resetQuoteStatus();
        this.resetQuoteRejectReason();
        this.resetQuoteResponseLevel();
        this.resetQuoteType();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        this.resetQuoteSetsGroup();
    }

    public void resetQuoteReqID()
    {
        quoteReqIDLength = 0;
        quoteReqID.wrap(quoteReqIDInternalBuffer);
    }

    public void resetQuoteID()
    {
        quoteIDLength = 0;
        quoteID.wrap(quoteIDInternalBuffer);
    }

    public void resetQuoteStatus()
    {
        hasQuoteStatus = false;
    }

    public void resetQuoteRejectReason()
    {
        hasQuoteRejectReason = false;
    }

    public void resetQuoteResponseLevel()
    {
        hasQuoteResponseLevel = false;
    }

    public void resetQuoteType()
    {
        hasQuoteType = false;
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

    public void resetQuoteSetsGroup()
    {
        if (quoteSetsGroup != null)
        {
            quoteSetsGroup.reset();
        }
        noQuoteSetsGroupCounter = 0;
        hasNoQuoteSetsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MassQuoteAcknowledgement\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasQuoteReqID())
        {
            indent(builder, level);
            builder.append("\"QuoteReqID\": \"");
            appendBuffer(builder, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteID())
        {
            indent(builder, level);
            builder.append("\"QuoteID\": \"");
            appendBuffer(builder, quoteID, quoteIDOffset, quoteIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteStatus())
        {
            indent(builder, level);
            builder.append("\"QuoteStatus\": \"");
            builder.append(quoteStatus);
            builder.append("\",\n");
        }

        if (hasQuoteRejectReason())
        {
            indent(builder, level);
            builder.append("\"QuoteRejectReason\": \"");
            builder.append(quoteRejectReason);
            builder.append("\",\n");
        }

        if (hasQuoteResponseLevel())
        {
            indent(builder, level);
            builder.append("\"QuoteResponseLevel\": \"");
            builder.append(quoteResponseLevel);
            builder.append("\",\n");
        }

        if (hasQuoteType())
        {
            indent(builder, level);
            builder.append("\"QuoteType\": \"");
            builder.append(quoteType);
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

        if (hasNoQuoteSetsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteSetsGroup\": [\n");
            final int noQuoteSetsGroupCounter = this.noQuoteSetsGroupCounter;
            QuoteSetsGroupEncoder quoteSetsGroup = this.quoteSetsGroup;
            for (int i = 0; i < noQuoteSetsGroupCounter; i++)
            {
                indent(builder, level);
                quoteSetsGroup.appendTo(builder, level + 1);
                if (i < (noQuoteSetsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteSetsGroup = quoteSetsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public MassQuoteAcknowledgementEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MassQuoteAcknowledgementEncoder)encoder);
    }

    public MassQuoteAcknowledgementEncoder copyTo(final MassQuoteAcknowledgementEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteReqID())
        {
            encoder.quoteReqIDAsCopy(quoteReqID.byteArray(), 0, quoteReqIDLength);
        }

        if (hasQuoteID())
        {
            encoder.quoteIDAsCopy(quoteID.byteArray(), 0, quoteIDLength);
        }

        if (hasQuoteStatus())
        {
            encoder.quoteStatus(this.quoteStatus());
        }

        if (hasQuoteRejectReason())
        {
            encoder.quoteRejectReason(this.quoteRejectReason());
        }

        if (hasQuoteResponseLevel())
        {
            encoder.quoteResponseLevel(this.quoteResponseLevel());
        }

        if (hasQuoteType())
        {
            encoder.quoteType(this.quoteType());
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

        if (hasNoQuoteSetsGroupCounter)
        {
            final int size = this.noQuoteSetsGroupCounter;
            QuoteSetsGroupEncoder quoteSetsGroup = this.quoteSetsGroup;
            QuoteSetsGroupEncoder quoteSetsGroupEncoder = encoder.quoteSetsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteSetsGroup != null)
                {
                    quoteSetsGroup.copyTo(quoteSetsGroupEncoder);
                    quoteSetsGroup = quoteSetsGroup.next();
                    quoteSetsGroupEncoder = quoteSetsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
