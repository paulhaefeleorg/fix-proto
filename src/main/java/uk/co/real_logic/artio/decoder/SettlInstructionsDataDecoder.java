/* Generated Fix Gateway message codec */
package uk.co.real_logic.artio.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
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
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.CommonDecoderImpl;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import uk.co.real_logic.artio.*;
import uk.co.real_logic.artio.builder.SettlInstructionsDataEncoder;
import static uk.co.real_logic.artio.builder.SettlInstructionsDataEncoder.DlvyInstGroupEncoder;
import uk.co.real_logic.artio.builder.SettlPartiesEncoder;
import static uk.co.real_logic.artio.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import static uk.co.real_logic.artio.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder.SettlPartySubIDsGroupEncoder;
import uk.co.real_logic.artio.dictionary.Generated;

@Generated("uk.co.real_logic.artio")
public interface SettlInstructionsDataDecoder 
{

    /* SettlDeliveryType = 172 */
    public int settlDeliveryType();
    /* SettlDeliveryType = 172 */
    public boolean hasSettlDeliveryType();
    /* SettlDeliveryType = 172 */
    public SettlDeliveryType settlDeliveryTypeAsEnum();
    /* StandInstDbType = 169 */
    public int standInstDbType();
    /* StandInstDbType = 169 */
    public boolean hasStandInstDbType();
    /* StandInstDbType = 169 */
    public StandInstDbType standInstDbTypeAsEnum();
    /* StandInstDbName = 170 */
    public char[] standInstDbName();
    /* StandInstDbName = 170 */
    public boolean hasStandInstDbName();
    /* StandInstDbName = 170 */
    public int standInstDbNameLength();
    /* StandInstDbName = 170 */
    public AsciiSequenceView standInstDbName(AsciiSequenceView view);
    /* StandInstDbID = 171 */
    public char[] standInstDbID();
    /* StandInstDbID = 171 */
    public boolean hasStandInstDbID();
    /* StandInstDbID = 171 */
    public int standInstDbIDLength();
    /* StandInstDbID = 171 */
    public AsciiSequenceView standInstDbID(AsciiSequenceView view);

@Generated("uk.co.real_logic.artio")
public class DlvyInstGroupDecoder extends CommonDecoderImpl implements SettlPartiesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.SETTL_INST_SOURCE);
            GROUP_FIELDS.add(Constants.DLVY_INST_TYPE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.SETTL_INST_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.DLVY_INST_TYPE);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasSettlInstSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlInstSource.isValid(settlInstSource()))
        {
            invalidTagId = 165;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDlvyInstType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DlvyInstType.isValid(dlvyInstType()))
        {
            invalidTagId = 787;
            rejectReason = 5;
            return false;
        }
        }
        if (hasSettlInstSource)
        {
        if (CODEC_VALIDATION_ENABLED && settlInstSourceLength > 1)
        {
            invalidTagId = 165;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDlvyInstType)
        {
        if (CODEC_VALIDATION_ENABLED && dlvyInstTypeLength > 1)
        {
            invalidTagId = 787;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoSettlPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final SettlPartyIDsGroupIterator iterator = settlPartyIDsGroupIterator.iterator();
                for (final SettlPartyIDsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 781;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public DlvyInstGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DlvyInstGroupDecoder next = null;

    public DlvyInstGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char settlInstSource = MISSING_CHAR;

    private int settlInstSourceLength = 0;
    public int settlInstSourceLength()    {
       return settlInstSourceLength;
    }
    private boolean hasSettlInstSource;

    /* SettlInstSource = 165 */
    public char settlInstSource()
    {
        if (!hasSettlInstSource)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstSource");
        }

        return settlInstSource;
    }

    public boolean hasSettlInstSource()
    {
        return hasSettlInstSource;
    }



    private final CharArrayWrapper settlInstSourceWrapper = new CharArrayWrapper();
    /* SettlInstSource = 165 */
    public SettlInstSource settlInstSourceAsEnum()
    {
        if (!hasSettlInstSource)
 return SettlInstSource.NULL_VAL;
        return SettlInstSource.decode(settlInstSource);
    }

    private char dlvyInstType = MISSING_CHAR;

    private int dlvyInstTypeLength = 0;
    public int dlvyInstTypeLength()    {
       return dlvyInstTypeLength;
    }
    private boolean hasDlvyInstType;

    /* DlvyInstType = 787 */
    public char dlvyInstType()
    {
        if (!hasDlvyInstType)
        {
            throw new IllegalArgumentException("No value for optional field: DlvyInstType");
        }

        return dlvyInstType;
    }

    public boolean hasDlvyInstType()
    {
        return hasDlvyInstType;
    }



    private final CharArrayWrapper dlvyInstTypeWrapper = new CharArrayWrapper();
    /* DlvyInstType = 787 */
    public DlvyInstType dlvyInstTypeAsEnum()
    {
        if (!hasDlvyInstType)
 return DlvyInstType.NULL_VAL;
        return DlvyInstType.decode(dlvyInstType);
    }



    private SettlPartyIDsGroupDecoder settlPartyIDsGroup = null;
    public SettlPartyIDsGroupDecoder settlPartyIDsGroup()
    {
        return settlPartyIDsGroup;
    }

    private int noSettlPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoSettlPartyIDsGroupCounter;

    /* NoSettlPartyIDsGroupCounter = 781 */
    public int noSettlPartyIDsGroupCounter()
    {
        if (!hasNoSettlPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSettlPartyIDsGroupCounter");
        }

        return noSettlPartyIDsGroupCounter;
    }

    public boolean hasNoSettlPartyIDsGroupCounter()
    {
        return hasNoSettlPartyIDsGroupCounter;
    }




    private SettlPartyIDsGroupIterator settlPartyIDsGroupIterator = new SettlPartyIDsGroupIterator(this);
    public SettlPartyIDsGroupIterator settlPartyIDsGroupIterator()
    {
        return settlPartyIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DlvyInstGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        int positionIter = position;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new DlvyInstGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.SETTL_INST_SOURCE:
                hasSettlInstSource = true;
                settlInstSource = buffer.getChar(valueOffset);
                settlInstSourceLength = valueLength;
                break;

            case Constants.DLVY_INST_TYPE:
                hasDlvyInstType = true;
                dlvyInstType = buffer.getChar(valueOffset);
                dlvyInstTypeLength = valueLength;
                break;

            case Constants.NO_SETTL_PARTY_IDS_GROUP_COUNTER:
                hasNoSettlPartyIDsGroupCounter = true;
                noSettlPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 781, CODEC_VALIDATION_ENABLED);
                if (settlPartyIDsGroup == null)
                {
                    settlPartyIDsGroup = new SettlPartyIDsGroupDecoder(trailer, messageFields);
                }
                SettlPartyIDsGroupDecoder settlPartyIDsGroupCurrent = settlPartyIDsGroup;
                position = endOfField + 1;
                final int noSettlPartyIDsGroupCounter = this.noSettlPartyIDsGroupCounter;
                for (int i = 0; i < noSettlPartyIDsGroupCounter && position < end; i++)
                {
                    if (settlPartyIDsGroupCurrent != null)
                    {
                        positionIter = settlPartyIDsGroupCurrent.decode(buffer, position, end - position);
                        if (positionIter == 0 && CODEC_VALIDATION_ENABLED)
                        {
                                invalidTagId = tag;
                                rejectReason = 16;
                                break;
                        }
                        else
                        {
                                position += positionIter;
                        }
                        settlPartyIDsGroupCurrent = settlPartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (settlPartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            while (settlPartyIDsGroupCurrent != null) 
                            {
                               position += settlPartyIDsGroupCurrent.decode(buffer, position, end - position);
                               settlPartyIDsGroupCurrent = settlPartyIDsGroupCurrent.next();
                            }
                            return position - offset;
                        }
                    }
                }
                break;


            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSettlInstSource();
        this.resetDlvyInstType();
        this.resetSettlPartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSettlInstSource()
    {
        hasSettlInstSource = false;
    }

    public void resetDlvyInstType()
    {
        hasDlvyInstType = false;
    }

    public void resetSettlPartyIDsGroup()
    {
        for (final SettlPartyIDsGroupDecoder settlPartyIDsGroupDecoder : settlPartyIDsGroupIterator.iterator())
        {
            settlPartyIDsGroupDecoder.reset();
            if (settlPartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSettlPartyIDsGroupCounter = MISSING_INT;
        hasNoSettlPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"DlvyInstGroup\",\n");
        if (hasSettlInstSource())
        {
            indent(builder, level);
            builder.append("\"SettlInstSource\": \"");
            builder.append(settlInstSource);
            builder.append("\",\n");
        }

        if (hasDlvyInstType())
        {
            indent(builder, level);
            builder.append("\"DlvyInstType\": \"");
            builder.append(dlvyInstType);
            builder.append("\",\n");
        }

        if (hasNoSettlPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlPartyIDsGroup\": [\n");
            SettlPartyIDsGroupDecoder settlPartyIDsGroup = this.settlPartyIDsGroup;
            for (int i = 0, size = this.noSettlPartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                settlPartyIDsGroup.appendTo(builder, level + 1);
                if (settlPartyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlPartyIDsGroup = settlPartyIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    public SettlInstructionsDataEncoder.DlvyInstGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SettlInstructionsDataEncoder.DlvyInstGroupEncoder)encoder);
    }

    public SettlInstructionsDataEncoder.DlvyInstGroupEncoder toEncoder(final SettlInstructionsDataEncoder.DlvyInstGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstSource())
        {
            encoder.settlInstSource(this.settlInstSource());
        }

        if (hasDlvyInstType())
        {
            encoder.dlvyInstType(this.dlvyInstType());
        }


        final SettlPartiesEncoder settlParties = encoder.settlParties();        if (hasNoSettlPartyIDsGroupCounter)
        {
            final int size = this.noSettlPartyIDsGroupCounter;
            SettlPartyIDsGroupDecoder settlPartyIDsGroup = this.settlPartyIDsGroup;
            SettlPartyIDsGroupEncoder settlPartyIDsGroupEncoder = settlParties.settlPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlPartyIDsGroup != null)
                {
                    settlPartyIDsGroup.toEncoder(settlPartyIDsGroupEncoder);
                    settlPartyIDsGroup = settlPartyIDsGroup.next();
                    settlPartyIDsGroupEncoder = settlPartyIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    @Generated("uk.co.real_logic.artio")
    public class DlvyInstGroupIterator implements Iterable<DlvyInstGroupDecoder>, java.util.Iterator<DlvyInstGroupDecoder>
    {
        private final SettlInstructionsDataDecoder parent;
        private int remainder;
        private DlvyInstGroupDecoder current;

        public DlvyInstGroupIterator(final SettlInstructionsDataDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public DlvyInstGroupDecoder next()
        {
            remainder--;
            final DlvyInstGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoDlvyInstGroupCounter() ? parent.noDlvyInstGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.dlvyInstGroup();
        }

        public DlvyInstGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public DlvyInstGroupIterator dlvyInstGroupIterator();
    /* NoDlvyInstGroupCounter = 85 */
    public int noDlvyInstGroupCounter();
    /* NoDlvyInstGroupCounter = 85 */
    public boolean hasNoDlvyInstGroupCounter();
    public DlvyInstGroupDecoder dlvyInstGroup();

}
