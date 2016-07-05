/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-30")
public class RedrivePolicy implements libthrift091.TBase<RedrivePolicy, RedrivePolicy._Fields>, java.io.Serializable, Cloneable, Comparable<RedrivePolicy> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RedrivePolicy");

  private static final libthrift091.protocol.TField DLQ_NAME_FIELD_DESC = new libthrift091.protocol.TField("dlqName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField MAX_RECEIVE_TIME_FIELD_DESC = new libthrift091.protocol.TField("maxReceiveTime", libthrift091.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RedrivePolicyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RedrivePolicyTupleSchemeFactory());
  }

  /**
   * The dead letter queue name;
   * 
   */
  public String dlqName; // required
  /**
   * The max receive time;
   * 
   */
  public int maxReceiveTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The dead letter queue name;
     * 
     */
    DLQ_NAME((short)1, "dlqName"),
    /**
     * The max receive time;
     * 
     */
    MAX_RECEIVE_TIME((short)2, "maxReceiveTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DLQ_NAME
          return DLQ_NAME;
        case 2: // MAX_RECEIVE_TIME
          return MAX_RECEIVE_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MAXRECEIVETIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DLQ_NAME, new libthrift091.meta_data.FieldMetaData("dlqName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAX_RECEIVE_TIME, new libthrift091.meta_data.FieldMetaData("maxReceiveTime", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RedrivePolicy.class, metaDataMap);
  }

  public RedrivePolicy() {
  }

  public RedrivePolicy(
    String dlqName,
    int maxReceiveTime)
  {
    this();
    this.dlqName = dlqName;
    this.maxReceiveTime = maxReceiveTime;
    setMaxReceiveTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RedrivePolicy(RedrivePolicy other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDlqName()) {
      this.dlqName = other.dlqName;
    }
    this.maxReceiveTime = other.maxReceiveTime;
  }

  public RedrivePolicy deepCopy() {
    return new RedrivePolicy(this);
  }

  @Override
  public void clear() {
    this.dlqName = null;
    setMaxReceiveTimeIsSet(false);
    this.maxReceiveTime = 0;
  }

  /**
   * The dead letter queue name;
   * 
   */
  public String getDlqName() {
    return this.dlqName;
  }

  /**
   * The dead letter queue name;
   * 
   */
  public RedrivePolicy setDlqName(String dlqName) {
    this.dlqName = dlqName;
    return this;
  }

  public void unsetDlqName() {
    this.dlqName = null;
  }

  /** Returns true if field dlqName is set (has been assigned a value) and false otherwise */
  public boolean isSetDlqName() {
    return this.dlqName != null;
  }

  public void setDlqNameIsSet(boolean value) {
    if (!value) {
      this.dlqName = null;
    }
  }

  /**
   * The max receive time;
   * 
   */
  public int getMaxReceiveTime() {
    return this.maxReceiveTime;
  }

  /**
   * The max receive time;
   * 
   */
  public RedrivePolicy setMaxReceiveTime(int maxReceiveTime) {
    this.maxReceiveTime = maxReceiveTime;
    setMaxReceiveTimeIsSet(true);
    return this;
  }

  public void unsetMaxReceiveTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXRECEIVETIME_ISSET_ID);
  }

  /** Returns true if field maxReceiveTime is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxReceiveTime() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXRECEIVETIME_ISSET_ID);
  }

  public void setMaxReceiveTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXRECEIVETIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DLQ_NAME:
      if (value == null) {
        unsetDlqName();
      } else {
        setDlqName((String)value);
      }
      break;

    case MAX_RECEIVE_TIME:
      if (value == null) {
        unsetMaxReceiveTime();
      } else {
        setMaxReceiveTime((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DLQ_NAME:
      return getDlqName();

    case MAX_RECEIVE_TIME:
      return Integer.valueOf(getMaxReceiveTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DLQ_NAME:
      return isSetDlqName();
    case MAX_RECEIVE_TIME:
      return isSetMaxReceiveTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RedrivePolicy)
      return this.equals((RedrivePolicy)that);
    return false;
  }

  public boolean equals(RedrivePolicy that) {
    if (that == null)
      return false;

    boolean this_present_dlqName = true && this.isSetDlqName();
    boolean that_present_dlqName = true && that.isSetDlqName();
    if (this_present_dlqName || that_present_dlqName) {
      if (!(this_present_dlqName && that_present_dlqName))
        return false;
      if (!this.dlqName.equals(that.dlqName))
        return false;
    }

    boolean this_present_maxReceiveTime = true;
    boolean that_present_maxReceiveTime = true;
    if (this_present_maxReceiveTime || that_present_maxReceiveTime) {
      if (!(this_present_maxReceiveTime && that_present_maxReceiveTime))
        return false;
      if (this.maxReceiveTime != that.maxReceiveTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dlqName = true && (isSetDlqName());
    list.add(present_dlqName);
    if (present_dlqName)
      list.add(dlqName);

    boolean present_maxReceiveTime = true;
    list.add(present_maxReceiveTime);
    if (present_maxReceiveTime)
      list.add(maxReceiveTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(RedrivePolicy other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDlqName()).compareTo(other.isSetDlqName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDlqName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.dlqName, other.dlqName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxReceiveTime()).compareTo(other.isSetMaxReceiveTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxReceiveTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxReceiveTime, other.maxReceiveTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RedrivePolicy(");
    boolean first = true;

    sb.append("dlqName:");
    if (this.dlqName == null) {
      sb.append("null");
    } else {
      sb.append(this.dlqName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxReceiveTime:");
    sb.append(this.maxReceiveTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (dlqName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'dlqName' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'maxReceiveTime' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RedrivePolicyStandardSchemeFactory implements SchemeFactory {
    public RedrivePolicyStandardScheme getScheme() {
      return new RedrivePolicyStandardScheme();
    }
  }

  private static class RedrivePolicyStandardScheme extends StandardScheme<RedrivePolicy> {

    public void read(libthrift091.protocol.TProtocol iprot, RedrivePolicy struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DLQ_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.dlqName = iprot.readString();
              struct.setDlqNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX_RECEIVE_TIME
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxReceiveTime = iprot.readI32();
              struct.setMaxReceiveTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetMaxReceiveTime()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'maxReceiveTime' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, RedrivePolicy struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dlqName != null) {
        oprot.writeFieldBegin(DLQ_NAME_FIELD_DESC);
        oprot.writeString(struct.dlqName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MAX_RECEIVE_TIME_FIELD_DESC);
      oprot.writeI32(struct.maxReceiveTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RedrivePolicyTupleSchemeFactory implements SchemeFactory {
    public RedrivePolicyTupleScheme getScheme() {
      return new RedrivePolicyTupleScheme();
    }
  }

  private static class RedrivePolicyTupleScheme extends TupleScheme<RedrivePolicy> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RedrivePolicy struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dlqName);
      oprot.writeI32(struct.maxReceiveTime);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RedrivePolicy struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dlqName = iprot.readString();
      struct.setDlqNameIsSet(true);
      struct.maxReceiveTime = iprot.readI32();
      struct.setMaxReceiveTimeIsSet(true);
    }
  }

}

