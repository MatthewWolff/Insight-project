/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.Message;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2104341155365500011L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"avro.Message\",\"fields\":[{\"name\":\"userid\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"segment\",\"type\":\"string\"},{\"name\":\"rows\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Row\",\"fields\":[{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"userid\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"logtype\",\"type\":\"string\"},{\"name\":\"campaign\",\"type\":\"string\",\"default\":\"NA\"},{\"name\":\"publisher\",\"type\":\"string\",\"default\":\"NA\"},{\"name\":\"creative\",\"type\":\"string\",\"default\":\"NA\"},{\"name\":\"placement\",\"type\":\"string\",\"default\":\"NA\"},{\"name\":\"product\",\"type\":\"string\",\"default\":\"NA\"},{\"name\":\"quantity\",\"type\":\"int\",\"default\":0},{\"name\":\"revenue\",\"type\":\"double\",\"default\":0.0}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Event> ENCODER =
      new BinaryMessageEncoder<Event>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Event> DECODER =
      new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Event> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Event> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Event to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Event from a ByteBuffer. */
  public static Event fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence userid;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public java.lang.CharSequence segment;
  @Deprecated public java.util.List<avro.Message.Row> rows;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param userid The new value for userid
   * @param state The new value for state
   * @param segment The new value for segment
   * @param rows The new value for rows
   */
  public Event(java.lang.CharSequence userid, java.lang.CharSequence state, java.lang.CharSequence segment, java.util.List<avro.Message.Row> rows) {
    this.userid = userid;
    this.state = state;
    this.segment = segment;
    this.rows = rows;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userid;
    case 1: return state;
    case 2: return segment;
    case 3: return rows;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userid = (java.lang.CharSequence)value$; break;
    case 1: state = (java.lang.CharSequence)value$; break;
    case 2: segment = (java.lang.CharSequence)value$; break;
    case 3: rows = (java.util.List<avro.Message.Row>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userid' field.
   * @return The value of the 'userid' field.
   */
  public java.lang.CharSequence getUserid() {
    return userid;
  }

  /**
   * Sets the value of the 'userid' field.
   * @param value the value to set.
   */
  public void setUserid(java.lang.CharSequence value) {
    this.userid = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'segment' field.
   * @return The value of the 'segment' field.
   */
  public java.lang.CharSequence getSegment() {
    return segment;
  }

  /**
   * Sets the value of the 'segment' field.
   * @param value the value to set.
   */
  public void setSegment(java.lang.CharSequence value) {
    this.segment = value;
  }

  /**
   * Gets the value of the 'rows' field.
   * @return The value of the 'rows' field.
   */
  public java.util.List<avro.Message.Row> getRows() {
    return rows;
  }

  /**
   * Sets the value of the 'rows' field.
   * @param value the value to set.
   */
  public void setRows(java.util.List<avro.Message.Row> value) {
    this.rows = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static avro.Message.Event.Builder newBuilder() {
    return new avro.Message.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static avro.Message.Event.Builder newBuilder(avro.Message.Event.Builder other) {
    return new avro.Message.Event.Builder(other);
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static avro.Message.Event.Builder newBuilder(avro.Message.Event other) {
    return new avro.Message.Event.Builder(other);
  }

  /**
   * RecordBuilder for Event instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private java.lang.CharSequence userid;
    private java.lang.CharSequence state;
    private java.lang.CharSequence segment;
    private java.util.List<avro.Message.Row> rows;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.Message.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userid)) {
        this.userid = data().deepCopy(fields()[0].schema(), other.userid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.state)) {
        this.state = data().deepCopy(fields()[1].schema(), other.state);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.segment)) {
        this.segment = data().deepCopy(fields()[2].schema(), other.segment);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.rows)) {
        this.rows = data().deepCopy(fields()[3].schema(), other.rows);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.Message.Event other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userid)) {
        this.userid = data().deepCopy(fields()[0].schema(), other.userid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.state)) {
        this.state = data().deepCopy(fields()[1].schema(), other.state);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.segment)) {
        this.segment = data().deepCopy(fields()[2].schema(), other.segment);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.rows)) {
        this.rows = data().deepCopy(fields()[3].schema(), other.rows);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'userid' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserid() {
      return userid;
    }

    /**
      * Sets the value of the 'userid' field.
      * @param value The value of 'userid'.
      * @return This builder.
      */
    public avro.Message.Event.Builder setUserid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.userid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userid' field has been set.
      * @return True if the 'userid' field has been set, false otherwise.
      */
    public boolean hasUserid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userid' field.
      * @return This builder.
      */
    public avro.Message.Event.Builder clearUserid() {
      userid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public avro.Message.Event.Builder setState(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.state = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public avro.Message.Event.Builder clearState() {
      state = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'segment' field.
      * @return The value.
      */
    public java.lang.CharSequence getSegment() {
      return segment;
    }

    /**
      * Sets the value of the 'segment' field.
      * @param value The value of 'segment'.
      * @return This builder.
      */
    public avro.Message.Event.Builder setSegment(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.segment = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'segment' field has been set.
      * @return True if the 'segment' field has been set, false otherwise.
      */
    public boolean hasSegment() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'segment' field.
      * @return This builder.
      */
    public avro.Message.Event.Builder clearSegment() {
      segment = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'rows' field.
      * @return The value.
      */
    public java.util.List<avro.Message.Row> getRows() {
      return rows;
    }

    /**
      * Sets the value of the 'rows' field.
      * @param value The value of 'rows'.
      * @return This builder.
      */
    public avro.Message.Event.Builder setRows(java.util.List<avro.Message.Row> value) {
      validate(fields()[3], value);
      this.rows = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'rows' field has been set.
      * @return True if the 'rows' field has been set, false otherwise.
      */
    public boolean hasRows() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'rows' field.
      * @return This builder.
      */
    public avro.Message.Event.Builder clearRows() {
      rows = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Event build() {
      try {
        Event record = new Event();
        record.userid = fieldSetFlags()[0] ? this.userid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.state = fieldSetFlags()[1] ? this.state : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.segment = fieldSetFlags()[2] ? this.segment : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.rows = fieldSetFlags()[3] ? this.rows : (java.util.List<avro.Message.Row>) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Event>
    WRITER$ = (org.apache.avro.io.DatumWriter<Event>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Event>
    READER$ = (org.apache.avro.io.DatumReader<Event>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
