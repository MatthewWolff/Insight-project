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
public class Propensity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7248347725564553377L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Propensity\",\"namespace\":\"avro.Message\",\"fields\":[{\"name\":\"userid\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"logtype\",\"type\":\"string\"},{\"name\":\"propensity\",\"type\":[\"null\",\"double\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Propensity> ENCODER =
      new BinaryMessageEncoder<Propensity>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Propensity> DECODER =
      new BinaryMessageDecoder<Propensity>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Propensity> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Propensity> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Propensity>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Propensity to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Propensity from a ByteBuffer. */
  public static Propensity fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence userid;
  @Deprecated public long timestamp;
  @Deprecated public java.lang.CharSequence logtype;
  @Deprecated public java.lang.Double propensity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Propensity() {}

  /**
   * All-args constructor.
   * @param userid The new value for userid
   * @param timestamp The new value for timestamp
   * @param logtype The new value for logtype
   * @param propensity The new value for propensity
   */
  public Propensity(java.lang.CharSequence userid, java.lang.Long timestamp, java.lang.CharSequence logtype, java.lang.Double propensity) {
    this.userid = userid;
    this.timestamp = timestamp;
    this.logtype = logtype;
    this.propensity = propensity;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userid;
    case 1: return timestamp;
    case 2: return logtype;
    case 3: return propensity;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userid = (java.lang.CharSequence)value$; break;
    case 1: timestamp = (java.lang.Long)value$; break;
    case 2: logtype = (java.lang.CharSequence)value$; break;
    case 3: propensity = (java.lang.Double)value$; break;
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
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'logtype' field.
   * @return The value of the 'logtype' field.
   */
  public java.lang.CharSequence getLogtype() {
    return logtype;
  }

  /**
   * Sets the value of the 'logtype' field.
   * @param value the value to set.
   */
  public void setLogtype(java.lang.CharSequence value) {
    this.logtype = value;
  }

  /**
   * Gets the value of the 'propensity' field.
   * @return The value of the 'propensity' field.
   */
  public java.lang.Double getPropensity() {
    return propensity;
  }

  /**
   * Sets the value of the 'propensity' field.
   * @param value the value to set.
   */
  public void setPropensity(java.lang.Double value) {
    this.propensity = value;
  }

  /**
   * Creates a new Propensity RecordBuilder.
   * @return A new Propensity RecordBuilder
   */
  public static avro.Message.Propensity.Builder newBuilder() {
    return new avro.Message.Propensity.Builder();
  }

  /**
   * Creates a new Propensity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Propensity RecordBuilder
   */
  public static avro.Message.Propensity.Builder newBuilder(avro.Message.Propensity.Builder other) {
    return new avro.Message.Propensity.Builder(other);
  }

  /**
   * Creates a new Propensity RecordBuilder by copying an existing Propensity instance.
   * @param other The existing instance to copy.
   * @return A new Propensity RecordBuilder
   */
  public static avro.Message.Propensity.Builder newBuilder(avro.Message.Propensity other) {
    return new avro.Message.Propensity.Builder(other);
  }

  /**
   * RecordBuilder for Propensity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Propensity>
    implements org.apache.avro.data.RecordBuilder<Propensity> {

    private java.lang.CharSequence userid;
    private long timestamp;
    private java.lang.CharSequence logtype;
    private java.lang.Double propensity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.Message.Propensity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userid)) {
        this.userid = data().deepCopy(fields()[0].schema(), other.userid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.logtype)) {
        this.logtype = data().deepCopy(fields()[2].schema(), other.logtype);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.propensity)) {
        this.propensity = data().deepCopy(fields()[3].schema(), other.propensity);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Propensity instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.Message.Propensity other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userid)) {
        this.userid = data().deepCopy(fields()[0].schema(), other.userid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.logtype)) {
        this.logtype = data().deepCopy(fields()[2].schema(), other.logtype);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.propensity)) {
        this.propensity = data().deepCopy(fields()[3].schema(), other.propensity);
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
    public avro.Message.Propensity.Builder setUserid(java.lang.CharSequence value) {
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
    public avro.Message.Propensity.Builder clearUserid() {
      userid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public avro.Message.Propensity.Builder setTimestamp(long value) {
      validate(fields()[1], value);
      this.timestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public avro.Message.Propensity.Builder clearTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'logtype' field.
      * @return The value.
      */
    public java.lang.CharSequence getLogtype() {
      return logtype;
    }

    /**
      * Sets the value of the 'logtype' field.
      * @param value The value of 'logtype'.
      * @return This builder.
      */
    public avro.Message.Propensity.Builder setLogtype(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.logtype = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'logtype' field has been set.
      * @return True if the 'logtype' field has been set, false otherwise.
      */
    public boolean hasLogtype() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'logtype' field.
      * @return This builder.
      */
    public avro.Message.Propensity.Builder clearLogtype() {
      logtype = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'propensity' field.
      * @return The value.
      */
    public java.lang.Double getPropensity() {
      return propensity;
    }

    /**
      * Sets the value of the 'propensity' field.
      * @param value The value of 'propensity'.
      * @return This builder.
      */
    public avro.Message.Propensity.Builder setPropensity(java.lang.Double value) {
      validate(fields()[3], value);
      this.propensity = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'propensity' field has been set.
      * @return True if the 'propensity' field has been set, false otherwise.
      */
    public boolean hasPropensity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'propensity' field.
      * @return This builder.
      */
    public avro.Message.Propensity.Builder clearPropensity() {
      propensity = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Propensity build() {
      try {
        Propensity record = new Propensity();
        record.userid = fieldSetFlags()[0] ? this.userid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.logtype = fieldSetFlags()[2] ? this.logtype : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.propensity = fieldSetFlags()[3] ? this.propensity : (java.lang.Double) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Propensity>
    WRITER$ = (org.apache.avro.io.DatumWriter<Propensity>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Propensity>
    READER$ = (org.apache.avro.io.DatumReader<Propensity>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}