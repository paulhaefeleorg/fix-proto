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
public class NetworkStatusResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 17474L;
    }

    public NetworkStatusResponseEncoder()
    {
        header.msgType("BD");
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

    private static final int networkStatusResponseTypeHeaderLength = 4;
    private static final byte[] networkStatusResponseTypeHeader = new byte[] {57, 51, 55, (byte) '='};

    private static final int networkRequestIDHeaderLength = 4;
    private static final byte[] networkRequestIDHeader = new byte[] {57, 51, 51, (byte) '='};

    private static final int networkResponseIDHeaderLength = 4;
    private static final byte[] networkResponseIDHeader = new byte[] {57, 51, 50, (byte) '='};

    private static final int lastNetworkResponseIDHeaderLength = 4;
    private static final byte[] lastNetworkResponseIDHeader = new byte[] {57, 51, 52, (byte) '='};

    private static final int noCompIDsGroupCounterHeaderLength = 4;
    private static final byte[] noCompIDsGroupCounterHeader = new byte[] {57, 51, 54, (byte) '='};

    private int networkStatusResponseType;

    private boolean hasNetworkStatusResponseType;

    public boolean hasNetworkStatusResponseType()
    {
        return hasNetworkStatusResponseType;
    }

    /* NetworkStatusResponseType = 937 */
    public NetworkStatusResponseEncoder networkStatusResponseType(int value)
    {
        networkStatusResponseType = value;
        hasNetworkStatusResponseType = true;
        return this;
    }

    /* NetworkStatusResponseType = 937 */
    public int networkStatusResponseType()
    {
        return networkStatusResponseType;
    }

    public NetworkStatusResponseEncoder networkStatusResponseType(NetworkStatusResponseType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NetworkStatusResponseType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: networkStatusResponseType Value: " + value );
            }
            if (value == NetworkStatusResponseType.NULL_VAL)
            {
                return this;
            }
        }
        return networkStatusResponseType(value.representation());
    }

    private final MutableDirectBuffer networkRequestID = new UnsafeBuffer();
    private byte[] networkRequestIDInternalBuffer = networkRequestID.byteArray();
    private int networkRequestIDOffset = 0;
    private int networkRequestIDLength = 0;

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final DirectBuffer value, final int offset, final int length)
    {
        networkRequestID.wrap(value);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final DirectBuffer value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final DirectBuffer value)
    {
        return networkRequestID(value, 0, value.capacity());
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final byte[] value, final int offset, final int length)
    {
        networkRequestID.wrap(value);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(networkRequestID, value, offset, length))
        {
            networkRequestIDInternalBuffer = networkRequestID.byteArray();
        }
        networkRequestIDOffset = 0;
        networkRequestIDLength = length;
        return this;
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final byte[] value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final byte[] value)
    {
        return networkRequestID(value, 0, value.length);
    }

    /* NetworkRequestID = 933 */
    public boolean hasNetworkRequestID()
    {
        return networkRequestIDLength > 0;
    }

    /* NetworkRequestID = 933 */
    public MutableDirectBuffer networkRequestID()
    {
        return networkRequestID;
    }

    /* NetworkRequestID = 933 */
    public String networkRequestIDAsString()
    {
        return networkRequestID.getStringWithoutLengthAscii(networkRequestIDOffset, networkRequestIDLength);
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final CharSequence value)
    {
        if (toBytes(value, networkRequestID))
        {
            networkRequestIDInternalBuffer = networkRequestID.byteArray();
        }
        networkRequestIDOffset = 0;
        networkRequestIDLength = value.length();
        return this;
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            networkRequestID.wrap(buffer);
            networkRequestIDOffset = value.offset();
            networkRequestIDLength = value.length();
        }
        return this;
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final char[] value)
    {
        return networkRequestID(value, 0, value.length);
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final char[] value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    /* NetworkRequestID = 933 */
    public NetworkStatusResponseEncoder networkRequestID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, networkRequestID, offset, length))
        {
            networkRequestIDInternalBuffer = networkRequestID.byteArray();
        }
        networkRequestIDOffset = 0;
        networkRequestIDLength = length;
        return this;
    }

    private final MutableDirectBuffer networkResponseID = new UnsafeBuffer();
    private byte[] networkResponseIDInternalBuffer = networkResponseID.byteArray();
    private int networkResponseIDOffset = 0;
    private int networkResponseIDLength = 0;

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final DirectBuffer value, final int offset, final int length)
    {
        networkResponseID.wrap(value);
        networkResponseIDOffset = offset;
        networkResponseIDLength = length;
        return this;
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final DirectBuffer value, final int length)
    {
        return networkResponseID(value, 0, length);
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final DirectBuffer value)
    {
        return networkResponseID(value, 0, value.capacity());
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final byte[] value, final int offset, final int length)
    {
        networkResponseID.wrap(value);
        networkResponseIDOffset = offset;
        networkResponseIDLength = length;
        return this;
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(networkResponseID, value, offset, length))
        {
            networkResponseIDInternalBuffer = networkResponseID.byteArray();
        }
        networkResponseIDOffset = 0;
        networkResponseIDLength = length;
        return this;
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final byte[] value, final int length)
    {
        return networkResponseID(value, 0, length);
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final byte[] value)
    {
        return networkResponseID(value, 0, value.length);
    }

    /* NetworkResponseID = 932 */
    public boolean hasNetworkResponseID()
    {
        return networkResponseIDLength > 0;
    }

    /* NetworkResponseID = 932 */
    public MutableDirectBuffer networkResponseID()
    {
        return networkResponseID;
    }

    /* NetworkResponseID = 932 */
    public String networkResponseIDAsString()
    {
        return networkResponseID.getStringWithoutLengthAscii(networkResponseIDOffset, networkResponseIDLength);
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final CharSequence value)
    {
        if (toBytes(value, networkResponseID))
        {
            networkResponseIDInternalBuffer = networkResponseID.byteArray();
        }
        networkResponseIDOffset = 0;
        networkResponseIDLength = value.length();
        return this;
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            networkResponseID.wrap(buffer);
            networkResponseIDOffset = value.offset();
            networkResponseIDLength = value.length();
        }
        return this;
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final char[] value)
    {
        return networkResponseID(value, 0, value.length);
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final char[] value, final int length)
    {
        return networkResponseID(value, 0, length);
    }

    /* NetworkResponseID = 932 */
    public NetworkStatusResponseEncoder networkResponseID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, networkResponseID, offset, length))
        {
            networkResponseIDInternalBuffer = networkResponseID.byteArray();
        }
        networkResponseIDOffset = 0;
        networkResponseIDLength = length;
        return this;
    }

    private final MutableDirectBuffer lastNetworkResponseID = new UnsafeBuffer();
    private byte[] lastNetworkResponseIDInternalBuffer = lastNetworkResponseID.byteArray();
    private int lastNetworkResponseIDOffset = 0;
    private int lastNetworkResponseIDLength = 0;

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final DirectBuffer value, final int offset, final int length)
    {
        lastNetworkResponseID.wrap(value);
        lastNetworkResponseIDOffset = offset;
        lastNetworkResponseIDLength = length;
        return this;
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final DirectBuffer value, final int length)
    {
        return lastNetworkResponseID(value, 0, length);
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final DirectBuffer value)
    {
        return lastNetworkResponseID(value, 0, value.capacity());
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final byte[] value, final int offset, final int length)
    {
        lastNetworkResponseID.wrap(value);
        lastNetworkResponseIDOffset = offset;
        lastNetworkResponseIDLength = length;
        return this;
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(lastNetworkResponseID, value, offset, length))
        {
            lastNetworkResponseIDInternalBuffer = lastNetworkResponseID.byteArray();
        }
        lastNetworkResponseIDOffset = 0;
        lastNetworkResponseIDLength = length;
        return this;
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final byte[] value, final int length)
    {
        return lastNetworkResponseID(value, 0, length);
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final byte[] value)
    {
        return lastNetworkResponseID(value, 0, value.length);
    }

    /* LastNetworkResponseID = 934 */
    public boolean hasLastNetworkResponseID()
    {
        return lastNetworkResponseIDLength > 0;
    }

    /* LastNetworkResponseID = 934 */
    public MutableDirectBuffer lastNetworkResponseID()
    {
        return lastNetworkResponseID;
    }

    /* LastNetworkResponseID = 934 */
    public String lastNetworkResponseIDAsString()
    {
        return lastNetworkResponseID.getStringWithoutLengthAscii(lastNetworkResponseIDOffset, lastNetworkResponseIDLength);
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final CharSequence value)
    {
        if (toBytes(value, lastNetworkResponseID))
        {
            lastNetworkResponseIDInternalBuffer = lastNetworkResponseID.byteArray();
        }
        lastNetworkResponseIDOffset = 0;
        lastNetworkResponseIDLength = value.length();
        return this;
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            lastNetworkResponseID.wrap(buffer);
            lastNetworkResponseIDOffset = value.offset();
            lastNetworkResponseIDLength = value.length();
        }
        return this;
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final char[] value)
    {
        return lastNetworkResponseID(value, 0, value.length);
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final char[] value, final int length)
    {
        return lastNetworkResponseID(value, 0, length);
    }

    /* LastNetworkResponseID = 934 */
    public NetworkStatusResponseEncoder lastNetworkResponseID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, lastNetworkResponseID, offset, length))
        {
            lastNetworkResponseIDInternalBuffer = lastNetworkResponseID.byteArray();
        }
        lastNetworkResponseIDOffset = 0;
        lastNetworkResponseIDLength = length;
        return this;
    }


@Generated("uk.co.real_logic.artio")
public static class CompIDsGroupEncoder
{
    private CompIDsGroupEncoder next = null;

    public CompIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new CompIDsGroupEncoder();
        }
        return next;
    }

    private static final int refCompIDHeaderLength = 4;
    private static final byte[] refCompIDHeader = new byte[] {57, 51, 48, (byte) '='};

    private static final int refSubIDHeaderLength = 4;
    private static final byte[] refSubIDHeader = new byte[] {57, 51, 49, (byte) '='};

    private static final int locationIDHeaderLength = 4;
    private static final byte[] locationIDHeader = new byte[] {50, 56, 51, (byte) '='};

    private static final int deskIDHeaderLength = 4;
    private static final byte[] deskIDHeader = new byte[] {50, 56, 52, (byte) '='};

    private static final int statusValueHeaderLength = 4;
    private static final byte[] statusValueHeader = new byte[] {57, 50, 56, (byte) '='};

    private static final int statusTextHeaderLength = 4;
    private static final byte[] statusTextHeader = new byte[] {57, 50, 57, (byte) '='};

    private final MutableDirectBuffer refCompID = new UnsafeBuffer();
    private byte[] refCompIDInternalBuffer = refCompID.byteArray();
    private int refCompIDOffset = 0;
    private int refCompIDLength = 0;

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final DirectBuffer value, final int offset, final int length)
    {
        refCompID.wrap(value);
        refCompIDOffset = offset;
        refCompIDLength = length;
        return this;
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final DirectBuffer value, final int length)
    {
        return refCompID(value, 0, length);
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final DirectBuffer value)
    {
        return refCompID(value, 0, value.capacity());
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final byte[] value, final int offset, final int length)
    {
        refCompID.wrap(value);
        refCompIDOffset = offset;
        refCompIDLength = length;
        return this;
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(refCompID, value, offset, length))
        {
            refCompIDInternalBuffer = refCompID.byteArray();
        }
        refCompIDOffset = 0;
        refCompIDLength = length;
        return this;
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final byte[] value, final int length)
    {
        return refCompID(value, 0, length);
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final byte[] value)
    {
        return refCompID(value, 0, value.length);
    }

    /* RefCompID = 930 */
    public boolean hasRefCompID()
    {
        return refCompIDLength > 0;
    }

    /* RefCompID = 930 */
    public MutableDirectBuffer refCompID()
    {
        return refCompID;
    }

    /* RefCompID = 930 */
    public String refCompIDAsString()
    {
        return refCompID.getStringWithoutLengthAscii(refCompIDOffset, refCompIDLength);
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final CharSequence value)
    {
        if (toBytes(value, refCompID))
        {
            refCompIDInternalBuffer = refCompID.byteArray();
        }
        refCompIDOffset = 0;
        refCompIDLength = value.length();
        return this;
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refCompID.wrap(buffer);
            refCompIDOffset = value.offset();
            refCompIDLength = value.length();
        }
        return this;
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final char[] value)
    {
        return refCompID(value, 0, value.length);
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final char[] value, final int length)
    {
        return refCompID(value, 0, length);
    }

    /* RefCompID = 930 */
    public CompIDsGroupEncoder refCompID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, refCompID, offset, length))
        {
            refCompIDInternalBuffer = refCompID.byteArray();
        }
        refCompIDOffset = 0;
        refCompIDLength = length;
        return this;
    }

    private final MutableDirectBuffer refSubID = new UnsafeBuffer();
    private byte[] refSubIDInternalBuffer = refSubID.byteArray();
    private int refSubIDOffset = 0;
    private int refSubIDLength = 0;

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final DirectBuffer value, final int offset, final int length)
    {
        refSubID.wrap(value);
        refSubIDOffset = offset;
        refSubIDLength = length;
        return this;
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final DirectBuffer value, final int length)
    {
        return refSubID(value, 0, length);
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final DirectBuffer value)
    {
        return refSubID(value, 0, value.capacity());
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final byte[] value, final int offset, final int length)
    {
        refSubID.wrap(value);
        refSubIDOffset = offset;
        refSubIDLength = length;
        return this;
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(refSubID, value, offset, length))
        {
            refSubIDInternalBuffer = refSubID.byteArray();
        }
        refSubIDOffset = 0;
        refSubIDLength = length;
        return this;
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final byte[] value, final int length)
    {
        return refSubID(value, 0, length);
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final byte[] value)
    {
        return refSubID(value, 0, value.length);
    }

    /* RefSubID = 931 */
    public boolean hasRefSubID()
    {
        return refSubIDLength > 0;
    }

    /* RefSubID = 931 */
    public MutableDirectBuffer refSubID()
    {
        return refSubID;
    }

    /* RefSubID = 931 */
    public String refSubIDAsString()
    {
        return refSubID.getStringWithoutLengthAscii(refSubIDOffset, refSubIDLength);
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final CharSequence value)
    {
        if (toBytes(value, refSubID))
        {
            refSubIDInternalBuffer = refSubID.byteArray();
        }
        refSubIDOffset = 0;
        refSubIDLength = value.length();
        return this;
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refSubID.wrap(buffer);
            refSubIDOffset = value.offset();
            refSubIDLength = value.length();
        }
        return this;
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final char[] value)
    {
        return refSubID(value, 0, value.length);
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final char[] value, final int length)
    {
        return refSubID(value, 0, length);
    }

    /* RefSubID = 931 */
    public CompIDsGroupEncoder refSubID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, refSubID, offset, length))
        {
            refSubIDInternalBuffer = refSubID.byteArray();
        }
        refSubIDOffset = 0;
        refSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer locationID = new UnsafeBuffer();
    private byte[] locationIDInternalBuffer = locationID.byteArray();
    private int locationIDOffset = 0;
    private int locationIDLength = 0;

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationID(final DirectBuffer value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationID(final DirectBuffer value, final int length)
    {
        return locationID(value, 0, length);
    }

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationID(final DirectBuffer value)
    {
        return locationID(value, 0, value.capacity());
    }

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationID(final byte[] value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CompIDsGroupEncoder locationID(final byte[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationID(final byte[] value)
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
    public CompIDsGroupEncoder locationID(final CharSequence value)
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
    public CompIDsGroupEncoder locationID(final AsciiSequenceView value)
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
    public CompIDsGroupEncoder locationID(final char[] value)
    {
        return locationID(value, 0, value.length);
    }

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationID(final char[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    /* LocationID = 283 */
    public CompIDsGroupEncoder locationID(final char[] value, final int offset, final int length)
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
    public CompIDsGroupEncoder deskID(final DirectBuffer value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    /* DeskID = 284 */
    public CompIDsGroupEncoder deskID(final DirectBuffer value, final int length)
    {
        return deskID(value, 0, length);
    }

    /* DeskID = 284 */
    public CompIDsGroupEncoder deskID(final DirectBuffer value)
    {
        return deskID(value, 0, value.capacity());
    }

    /* DeskID = 284 */
    public CompIDsGroupEncoder deskID(final byte[] value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    /* DeskID = 284 */
    public CompIDsGroupEncoder deskIDAsCopy(final byte[] value, final int offset, final int length)
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
    public CompIDsGroupEncoder deskID(final byte[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    /* DeskID = 284 */
    public CompIDsGroupEncoder deskID(final byte[] value)
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
    public CompIDsGroupEncoder deskID(final CharSequence value)
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
    public CompIDsGroupEncoder deskID(final AsciiSequenceView value)
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
    public CompIDsGroupEncoder deskID(final char[] value)
    {
        return deskID(value, 0, value.length);
    }

    /* DeskID = 284 */
    public CompIDsGroupEncoder deskID(final char[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    /* DeskID = 284 */
    public CompIDsGroupEncoder deskID(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, deskID, offset, length))
        {
            deskIDInternalBuffer = deskID.byteArray();
        }
        deskIDOffset = 0;
        deskIDLength = length;
        return this;
    }

    private int statusValue;

    private boolean hasStatusValue;

    public boolean hasStatusValue()
    {
        return hasStatusValue;
    }

    /* StatusValue = 928 */
    public CompIDsGroupEncoder statusValue(int value)
    {
        statusValue = value;
        hasStatusValue = true;
        return this;
    }

    /* StatusValue = 928 */
    public int statusValue()
    {
        return statusValue;
    }

    public CompIDsGroupEncoder statusValue(StatusValue value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StatusValue.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: statusValue Value: " + value );
            }
            if (value == StatusValue.NULL_VAL)
            {
                return this;
            }
        }
        return statusValue(value.representation());
    }

    private final MutableDirectBuffer statusText = new UnsafeBuffer();
    private byte[] statusTextInternalBuffer = statusText.byteArray();
    private int statusTextOffset = 0;
    private int statusTextLength = 0;

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final DirectBuffer value, final int offset, final int length)
    {
        statusText.wrap(value);
        statusTextOffset = offset;
        statusTextLength = length;
        return this;
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final DirectBuffer value, final int length)
    {
        return statusText(value, 0, length);
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final DirectBuffer value)
    {
        return statusText(value, 0, value.capacity());
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final byte[] value, final int offset, final int length)
    {
        statusText.wrap(value);
        statusTextOffset = offset;
        statusTextLength = length;
        return this;
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusTextAsCopy(final byte[] value, final int offset, final int length)
    {
        if (copyInto(statusText, value, offset, length))
        {
            statusTextInternalBuffer = statusText.byteArray();
        }
        statusTextOffset = 0;
        statusTextLength = length;
        return this;
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final byte[] value, final int length)
    {
        return statusText(value, 0, length);
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final byte[] value)
    {
        return statusText(value, 0, value.length);
    }

    /* StatusText = 929 */
    public boolean hasStatusText()
    {
        return statusTextLength > 0;
    }

    /* StatusText = 929 */
    public MutableDirectBuffer statusText()
    {
        return statusText;
    }

    /* StatusText = 929 */
    public String statusTextAsString()
    {
        return statusText.getStringWithoutLengthAscii(statusTextOffset, statusTextLength);
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final CharSequence value)
    {
        if (toBytes(value, statusText))
        {
            statusTextInternalBuffer = statusText.byteArray();
        }
        statusTextOffset = 0;
        statusTextLength = value.length();
        return this;
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            statusText.wrap(buffer);
            statusTextOffset = value.offset();
            statusTextLength = value.length();
        }
        return this;
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final char[] value)
    {
        return statusText(value, 0, value.length);
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final char[] value, final int length)
    {
        return statusText(value, 0, length);
    }

    /* StatusText = 929 */
    public CompIDsGroupEncoder statusText(final char[] value, final int offset, final int length)
    {
        if (toBytes(value, statusText, offset, length))
        {
            statusTextInternalBuffer = statusText.byteArray();
        }
        statusTextOffset = 0;
        statusTextLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (refCompIDLength > 0)
        {
            buffer.putBytes(position, refCompIDHeader, 0, refCompIDHeaderLength);
            position += refCompIDHeaderLength;
            buffer.putBytes(position, refCompID, refCompIDOffset, refCompIDLength);
            position += refCompIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (refSubIDLength > 0)
        {
            buffer.putBytes(position, refSubIDHeader, 0, refSubIDHeaderLength);
            position += refSubIDHeaderLength;
            buffer.putBytes(position, refSubID, refSubIDOffset, refSubIDLength);
            position += refSubIDLength;
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

        if (hasStatusValue)
        {
            buffer.putBytes(position, statusValueHeader, 0, statusValueHeaderLength);
            position += statusValueHeaderLength;
            position += buffer.putIntAscii(position, statusValue);
            buffer.putSeparator(position);
            position++;
        }

        if (statusTextLength > 0)
        {
            buffer.putBytes(position, statusTextHeader, 0, statusTextHeaderLength);
            position += statusTextHeaderLength;
            buffer.putBytes(position, statusText, statusTextOffset, statusTextLength);
            position += statusTextLength;
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
        this.resetRefCompID();
        this.resetRefSubID();
        this.resetLocationID();
        this.resetDeskID();
        this.resetStatusValue();
        this.resetStatusText();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRefCompID()
    {
        refCompIDLength = 0;
        refCompID.wrap(refCompIDInternalBuffer);
    }

    public void resetRefSubID()
    {
        refSubIDLength = 0;
        refSubID.wrap(refSubIDInternalBuffer);
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

    public void resetStatusValue()
    {
        hasStatusValue = false;
    }

    public void resetStatusText()
    {
        statusTextLength = 0;
        statusText.wrap(statusTextInternalBuffer);
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
        builder.append("\"MessageName\": \"CompIDsGroup\",\n");
        if (hasRefCompID())
        {
            indent(builder, level);
            builder.append("\"RefCompID\": \"");
            appendBuffer(builder, refCompID, refCompIDOffset, refCompIDLength);
            builder.append("\",\n");
        }

        if (hasRefSubID())
        {
            indent(builder, level);
            builder.append("\"RefSubID\": \"");
            appendBuffer(builder, refSubID, refSubIDOffset, refSubIDLength);
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

        if (hasStatusValue())
        {
            indent(builder, level);
            builder.append("\"StatusValue\": \"");
            builder.append(statusValue);
            builder.append("\",\n");
        }

        if (hasStatusText())
        {
            indent(builder, level);
            builder.append("\"StatusText\": \"");
            appendBuffer(builder, statusText, statusTextOffset, statusTextLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public CompIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CompIDsGroupEncoder)encoder);
    }

    public CompIDsGroupEncoder copyTo(final CompIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefCompID())
        {
            encoder.refCompIDAsCopy(refCompID.byteArray(), 0, refCompIDLength);
        }

        if (hasRefSubID())
        {
            encoder.refSubIDAsCopy(refSubID.byteArray(), 0, refSubIDLength);
        }

        if (hasLocationID())
        {
            encoder.locationIDAsCopy(locationID.byteArray(), 0, locationIDLength);
        }

        if (hasDeskID())
        {
            encoder.deskIDAsCopy(deskID.byteArray(), 0, deskIDLength);
        }

        if (hasStatusValue())
        {
            encoder.statusValue(this.statusValue());
        }

        if (hasStatusText())
        {
            encoder.statusTextAsCopy(statusText.byteArray(), 0, statusTextLength);
        }
        return encoder;
    }

}
    private int noCompIDsGroupCounter;

    private boolean hasNoCompIDsGroupCounter;

    public boolean hasNoCompIDsGroupCounter()
    {
        return hasNoCompIDsGroupCounter;
    }

    /* NoCompIDsGroupCounter = 936 */
    public NetworkStatusResponseEncoder noCompIDsGroupCounter(int value)
    {
        noCompIDsGroupCounter = value;
        hasNoCompIDsGroupCounter = true;
        return this;
    }

    /* NoCompIDsGroupCounter = 936 */
    public int noCompIDsGroupCounter()
    {
        return noCompIDsGroupCounter;
    }


    private CompIDsGroupEncoder compIDsGroup = null;

    public CompIDsGroupEncoder compIDsGroup(final int numberOfElements)
    {
        hasNoCompIDsGroupCounter = true;
        noCompIDsGroupCounter = numberOfElements;
        if (compIDsGroup == null)
        {
            compIDsGroup = new CompIDsGroupEncoder();
        }
        return compIDsGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasNetworkStatusResponseType)
        {
            buffer.putBytes(position, networkStatusResponseTypeHeader, 0, networkStatusResponseTypeHeaderLength);
            position += networkStatusResponseTypeHeaderLength;
            position += buffer.putIntAscii(position, networkStatusResponseType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: NetworkStatusResponseType");
        }

        if (networkRequestIDLength > 0)
        {
            buffer.putBytes(position, networkRequestIDHeader, 0, networkRequestIDHeaderLength);
            position += networkRequestIDHeaderLength;
            buffer.putBytes(position, networkRequestID, networkRequestIDOffset, networkRequestIDLength);
            position += networkRequestIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (networkResponseIDLength > 0)
        {
            buffer.putBytes(position, networkResponseIDHeader, 0, networkResponseIDHeaderLength);
            position += networkResponseIDHeaderLength;
            buffer.putBytes(position, networkResponseID, networkResponseIDOffset, networkResponseIDLength);
            position += networkResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (lastNetworkResponseIDLength > 0)
        {
            buffer.putBytes(position, lastNetworkResponseIDHeader, 0, lastNetworkResponseIDHeaderLength);
            position += lastNetworkResponseIDHeaderLength;
            buffer.putBytes(position, lastNetworkResponseID, lastNetworkResponseIDOffset, lastNetworkResponseIDLength);
            position += lastNetworkResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoCompIDsGroupCounter)
        {
            buffer.putBytes(position, noCompIDsGroupCounterHeader, 0, noCompIDsGroupCounterHeaderLength);
            position += noCompIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noCompIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (compIDsGroup != null)
        {
            position += compIDsGroup.encode(buffer, position, noCompIDsGroupCounter);
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
        this.resetNetworkStatusResponseType();
        this.resetNetworkRequestID();
        this.resetNetworkResponseID();
        this.resetLastNetworkResponseID();
        this.resetCompIDsGroup();
    }

    public void resetNetworkStatusResponseType()
    {
        hasNetworkStatusResponseType = false;
    }

    public void resetNetworkRequestID()
    {
        networkRequestIDLength = 0;
        networkRequestID.wrap(networkRequestIDInternalBuffer);
    }

    public void resetNetworkResponseID()
    {
        networkResponseIDLength = 0;
        networkResponseID.wrap(networkResponseIDInternalBuffer);
    }

    public void resetLastNetworkResponseID()
    {
        lastNetworkResponseIDLength = 0;
        lastNetworkResponseID.wrap(lastNetworkResponseIDInternalBuffer);
    }

    public void resetCompIDsGroup()
    {
        if (compIDsGroup != null)
        {
            compIDsGroup.reset();
        }
        noCompIDsGroupCounter = 0;
        hasNoCompIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NetworkStatusResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasNetworkStatusResponseType())
        {
            indent(builder, level);
            builder.append("\"NetworkStatusResponseType\": \"");
            builder.append(networkStatusResponseType);
            builder.append("\",\n");
        }

        if (hasNetworkRequestID())
        {
            indent(builder, level);
            builder.append("\"NetworkRequestID\": \"");
            appendBuffer(builder, networkRequestID, networkRequestIDOffset, networkRequestIDLength);
            builder.append("\",\n");
        }

        if (hasNetworkResponseID())
        {
            indent(builder, level);
            builder.append("\"NetworkResponseID\": \"");
            appendBuffer(builder, networkResponseID, networkResponseIDOffset, networkResponseIDLength);
            builder.append("\",\n");
        }

        if (hasLastNetworkResponseID())
        {
            indent(builder, level);
            builder.append("\"LastNetworkResponseID\": \"");
            appendBuffer(builder, lastNetworkResponseID, lastNetworkResponseIDOffset, lastNetworkResponseIDLength);
            builder.append("\",\n");
        }

        if (hasNoCompIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"CompIDsGroup\": [\n");
            final int noCompIDsGroupCounter = this.noCompIDsGroupCounter;
            CompIDsGroupEncoder compIDsGroup = this.compIDsGroup;
            for (int i = 0; i < noCompIDsGroupCounter; i++)
            {
                indent(builder, level);
                compIDsGroup.appendTo(builder, level + 1);
                if (i < (noCompIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                compIDsGroup = compIDsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public NetworkStatusResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NetworkStatusResponseEncoder)encoder);
    }

    public NetworkStatusResponseEncoder copyTo(final NetworkStatusResponseEncoder encoder)
    {
        encoder.reset();
        if (hasNetworkStatusResponseType())
        {
            encoder.networkStatusResponseType(this.networkStatusResponseType());
        }

        if (hasNetworkRequestID())
        {
            encoder.networkRequestIDAsCopy(networkRequestID.byteArray(), 0, networkRequestIDLength);
        }

        if (hasNetworkResponseID())
        {
            encoder.networkResponseIDAsCopy(networkResponseID.byteArray(), 0, networkResponseIDLength);
        }

        if (hasLastNetworkResponseID())
        {
            encoder.lastNetworkResponseIDAsCopy(lastNetworkResponseID.byteArray(), 0, lastNetworkResponseIDLength);
        }

        if (hasNoCompIDsGroupCounter)
        {
            final int size = this.noCompIDsGroupCounter;
            CompIDsGroupEncoder compIDsGroup = this.compIDsGroup;
            CompIDsGroupEncoder compIDsGroupEncoder = encoder.compIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (compIDsGroup != null)
                {
                    compIDsGroup.copyTo(compIDsGroupEncoder);
                    compIDsGroup = compIDsGroup.next();
                    compIDsGroupEncoder = compIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
