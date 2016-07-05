/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-26")
public class SubmitJobResponse implements libthrift091.TBase<SubmitJobResponse, SubmitJobResponse._Fields>, java.io.Serializable, Cloneable, Comparable<SubmitJobResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SubmitJobResponse");

  private static final libthrift091.protocol.TField JOB_ID_FIELD_DESC = new libthrift091.protocol.TField("jobId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField NAME_FIELD_DESC = new libthrift091.protocol.TField("name", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField CLUSTER_ID_FIELD_DESC = new libthrift091.protocol.TField("clusterId", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SubmitJobResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SubmitJobResponseTupleSchemeFactory());
  }

  public String jobId; // required
  public String name; // required
  public String clusterId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    JOB_ID((short)1, "jobId"),
    NAME((short)2, "name"),
    CLUSTER_ID((short)3, "clusterId");

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
        case 1: // JOB_ID
          return JOB_ID;
        case 2: // NAME
          return NAME;
        case 3: // CLUSTER_ID
          return CLUSTER_ID;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_ID, new libthrift091.meta_data.FieldMetaData("jobId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new libthrift091.meta_data.FieldMetaData("name", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLUSTER_ID, new libthrift091.meta_data.FieldMetaData("clusterId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SubmitJobResponse.class, metaDataMap);
  }

  public SubmitJobResponse() {
  }

  public SubmitJobResponse(
    String jobId,
    String name,
    String clusterId)
  {
    this();
    this.jobId = jobId;
    this.name = name;
    this.clusterId = clusterId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubmitJobResponse(SubmitJobResponse other) {
    if (other.isSetJobId()) {
      this.jobId = other.jobId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetClusterId()) {
      this.clusterId = other.clusterId;
    }
  }

  public SubmitJobResponse deepCopy() {
    return new SubmitJobResponse(this);
  }

  @Override
  public void clear() {
    this.jobId = null;
    this.name = null;
    this.clusterId = null;
  }

  public String getJobId() {
    return this.jobId;
  }

  public SubmitJobResponse setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public void unsetJobId() {
    this.jobId = null;
  }

  /** Returns true if field jobId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return this.jobId != null;
  }

  public void setJobIdIsSet(boolean value) {
    if (!value) {
      this.jobId = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public SubmitJobResponse setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getClusterId() {
    return this.clusterId;
  }

  public SubmitJobResponse setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public void unsetClusterId() {
    this.clusterId = null;
  }

  /** Returns true if field clusterId is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterId() {
    return this.clusterId != null;
  }

  public void setClusterIdIsSet(boolean value) {
    if (!value) {
      this.clusterId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CLUSTER_ID:
      if (value == null) {
        unsetClusterId();
      } else {
        setClusterId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_ID:
      return getJobId();

    case NAME:
      return getName();

    case CLUSTER_ID:
      return getClusterId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_ID:
      return isSetJobId();
    case NAME:
      return isSetName();
    case CLUSTER_ID:
      return isSetClusterId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubmitJobResponse)
      return this.equals((SubmitJobResponse)that);
    return false;
  }

  public boolean equals(SubmitJobResponse that) {
    if (that == null)
      return false;

    boolean this_present_jobId = true && this.isSetJobId();
    boolean that_present_jobId = true && that.isSetJobId();
    if (this_present_jobId || that_present_jobId) {
      if (!(this_present_jobId && that_present_jobId))
        return false;
      if (!this.jobId.equals(that.jobId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_clusterId = true && this.isSetClusterId();
    boolean that_present_clusterId = true && that.isSetClusterId();
    if (this_present_clusterId || that_present_clusterId) {
      if (!(this_present_clusterId && that_present_clusterId))
        return false;
      if (!this.clusterId.equals(that.clusterId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobId = true && (isSetJobId());
    list.add(present_jobId);
    if (present_jobId)
      list.add(jobId);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_clusterId = true && (isSetClusterId());
    list.add(present_clusterId);
    if (present_clusterId)
      list.add(clusterId);

    return list.hashCode();
  }

  @Override
  public int compareTo(SubmitJobResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobId()).compareTo(other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.jobId, other.jobId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClusterId()).compareTo(other.isSetClusterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.clusterId, other.clusterId);
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
    StringBuilder sb = new StringBuilder("SubmitJobResponse(");
    boolean first = true;

    sb.append("jobId:");
    if (this.jobId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clusterId:");
    if (this.clusterId == null) {
      sb.append("null");
    } else {
      sb.append(this.clusterId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (jobId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'jobId' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (clusterId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'clusterId' was not present! Struct: " + toString());
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SubmitJobResponseStandardSchemeFactory implements SchemeFactory {
    public SubmitJobResponseStandardScheme getScheme() {
      return new SubmitJobResponseStandardScheme();
    }
  }

  private static class SubmitJobResponseStandardScheme extends StandardScheme<SubmitJobResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, SubmitJobResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.jobId = iprot.readString();
              struct.setJobIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CLUSTER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.clusterId = iprot.readString();
              struct.setClusterIdIsSet(true);
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
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, SubmitJobResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobId != null) {
        oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
        oprot.writeString(struct.jobId);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.clusterId != null) {
        oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
        oprot.writeString(struct.clusterId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SubmitJobResponseTupleSchemeFactory implements SchemeFactory {
    public SubmitJobResponseTupleScheme getScheme() {
      return new SubmitJobResponseTupleScheme();
    }
  }

  private static class SubmitJobResponseTupleScheme extends TupleScheme<SubmitJobResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SubmitJobResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jobId);
      oprot.writeString(struct.name);
      oprot.writeString(struct.clusterId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SubmitJobResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobId = iprot.readString();
      struct.setJobIdIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.clusterId = iprot.readString();
      struct.setClusterIdIsSet(true);
    }
  }

}

