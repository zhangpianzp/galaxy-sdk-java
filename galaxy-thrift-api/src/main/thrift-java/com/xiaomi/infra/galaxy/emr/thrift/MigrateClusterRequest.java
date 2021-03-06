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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-3-7")
public class MigrateClusterRequest implements libthrift091.TBase<MigrateClusterRequest, MigrateClusterRequest._Fields>, java.io.Serializable, Cloneable, Comparable<MigrateClusterRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MigrateClusterRequest");

  private static final libthrift091.protocol.TField ORG_ID_FIELD_DESC = new libthrift091.protocol.TField("orgId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField CLUSTER_ID_FIELD_DESC = new libthrift091.protocol.TField("clusterId", libthrift091.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MigrateClusterRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MigrateClusterRequestTupleSchemeFactory());
  }

  public String orgId; // required
  public String clusterId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    ORG_ID((short)1, "orgId"),
    CLUSTER_ID((short)2, "clusterId");

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
        case 1: // ORG_ID
          return ORG_ID;
        case 2: // CLUSTER_ID
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
    tmpMap.put(_Fields.ORG_ID, new libthrift091.meta_data.FieldMetaData("orgId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLUSTER_ID, new libthrift091.meta_data.FieldMetaData("clusterId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MigrateClusterRequest.class, metaDataMap);
  }

  public MigrateClusterRequest() {
  }

  public MigrateClusterRequest(
    String orgId,
    String clusterId)
  {
    this();
    this.orgId = orgId;
    this.clusterId = clusterId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MigrateClusterRequest(MigrateClusterRequest other) {
    if (other.isSetOrgId()) {
      this.orgId = other.orgId;
    }
    if (other.isSetClusterId()) {
      this.clusterId = other.clusterId;
    }
  }

  public MigrateClusterRequest deepCopy() {
    return new MigrateClusterRequest(this);
  }

  @Override
  public void clear() {
    this.orgId = null;
    this.clusterId = null;
  }

  public String getOrgId() {
    return this.orgId;
  }

  public MigrateClusterRequest setOrgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  public void unsetOrgId() {
    this.orgId = null;
  }

  /** Returns true if field orgId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgId() {
    return this.orgId != null;
  }

  public void setOrgIdIsSet(boolean value) {
    if (!value) {
      this.orgId = null;
    }
  }

  public String getClusterId() {
    return this.clusterId;
  }

  public MigrateClusterRequest setClusterId(String clusterId) {
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
    case ORG_ID:
      if (value == null) {
        unsetOrgId();
      } else {
        setOrgId((String)value);
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
    case ORG_ID:
      return getOrgId();

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
    case ORG_ID:
      return isSetOrgId();
    case CLUSTER_ID:
      return isSetClusterId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MigrateClusterRequest)
      return this.equals((MigrateClusterRequest)that);
    return false;
  }

  public boolean equals(MigrateClusterRequest that) {
    if (that == null)
      return false;

    boolean this_present_orgId = true && this.isSetOrgId();
    boolean that_present_orgId = true && that.isSetOrgId();
    if (this_present_orgId || that_present_orgId) {
      if (!(this_present_orgId && that_present_orgId))
        return false;
      if (!this.orgId.equals(that.orgId))
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

    boolean present_orgId = true && (isSetOrgId());
    list.add(present_orgId);
    if (present_orgId)
      list.add(orgId);

    boolean present_clusterId = true && (isSetClusterId());
    list.add(present_clusterId);
    if (present_clusterId)
      list.add(clusterId);

    return list.hashCode();
  }

  @Override
  public int compareTo(MigrateClusterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOrgId()).compareTo(other.isSetOrgId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.orgId, other.orgId);
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
    StringBuilder sb = new StringBuilder("MigrateClusterRequest(");
    boolean first = true;

    sb.append("orgId:");
    if (this.orgId == null) {
      sb.append("null");
    } else {
      sb.append(this.orgId);
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
    if (orgId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'orgId' was not present! Struct: " + toString());
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

  private static class MigrateClusterRequestStandardSchemeFactory implements SchemeFactory {
    public MigrateClusterRequestStandardScheme getScheme() {
      return new MigrateClusterRequestStandardScheme();
    }
  }

  private static class MigrateClusterRequestStandardScheme extends StandardScheme<MigrateClusterRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, MigrateClusterRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORG_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.orgId = iprot.readString();
              struct.setOrgIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER_ID
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

    public void write(libthrift091.protocol.TProtocol oprot, MigrateClusterRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orgId != null) {
        oprot.writeFieldBegin(ORG_ID_FIELD_DESC);
        oprot.writeString(struct.orgId);
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

  private static class MigrateClusterRequestTupleSchemeFactory implements SchemeFactory {
    public MigrateClusterRequestTupleScheme getScheme() {
      return new MigrateClusterRequestTupleScheme();
    }
  }

  private static class MigrateClusterRequestTupleScheme extends TupleScheme<MigrateClusterRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MigrateClusterRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.orgId);
      oprot.writeString(struct.clusterId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MigrateClusterRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.orgId = iprot.readString();
      struct.setOrgIdIsSet(true);
      struct.clusterId = iprot.readString();
      struct.setClusterIdIsSet(true);
    }
  }

}

