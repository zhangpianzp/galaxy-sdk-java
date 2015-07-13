/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2015-7-10")
public class DeletePermissionRequest implements libthrift091.TBase<DeletePermissionRequest, DeletePermissionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DeletePermissionRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeletePermissionRequest");

  private static final libthrift091.protocol.TField TOPIC_INFO_FIELD_DESC = new libthrift091.protocol.TField("topicInfo", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField PERMISSION_FIELD_DESC = new libthrift091.protocol.TField("permission", libthrift091.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeletePermissionRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeletePermissionRequestTupleSchemeFactory());
  }

  /**
   * Topic info for which to delete permission;
   * 
   */
  public TopicInfo topicInfo; // required
  /**
   * The developer to delete permission;
   * 
   */
  public String developerId; // required
  /**
   * The permission to delete, you should "|" with Permission to get this permission;
   * 
   */
  public long permission; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Topic info for which to delete permission;
     * 
     */
    TOPIC_INFO((short)1, "topicInfo"),
    /**
     * The developer to delete permission;
     * 
     */
    DEVELOPER_ID((short)2, "developerId"),
    /**
     * The permission to delete, you should "|" with Permission to get this permission;
     * 
     */
    PERMISSION((short)3, "permission");

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
        case 1: // TOPIC_INFO
          return TOPIC_INFO;
        case 2: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 3: // PERMISSION
          return PERMISSION;
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
  private static final int __PERMISSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_INFO, new libthrift091.meta_data.FieldMetaData("topicInfo", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicInfo.class)));
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERMISSION, new libthrift091.meta_data.FieldMetaData("permission", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeletePermissionRequest.class, metaDataMap);
  }

  public DeletePermissionRequest() {
  }

  public DeletePermissionRequest(
    TopicInfo topicInfo,
    String developerId,
    long permission)
  {
    this();
    this.topicInfo = topicInfo;
    this.developerId = developerId;
    this.permission = permission;
    setPermissionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeletePermissionRequest(DeletePermissionRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopicInfo()) {
      this.topicInfo = new TopicInfo(other.topicInfo);
    }
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    this.permission = other.permission;
  }

  public DeletePermissionRequest deepCopy() {
    return new DeletePermissionRequest(this);
  }

  @Override
  public void clear() {
    this.topicInfo = null;
    this.developerId = null;
    setPermissionIsSet(false);
    this.permission = 0;
  }

  /**
   * Topic info for which to delete permission;
   * 
   */
  public TopicInfo getTopicInfo() {
    return this.topicInfo;
  }

  /**
   * Topic info for which to delete permission;
   * 
   */
  public DeletePermissionRequest setTopicInfo(TopicInfo topicInfo) {
    this.topicInfo = topicInfo;
    return this;
  }

  public void unsetTopicInfo() {
    this.topicInfo = null;
  }

  /** Returns true if field topicInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicInfo() {
    return this.topicInfo != null;
  }

  public void setTopicInfoIsSet(boolean value) {
    if (!value) {
      this.topicInfo = null;
    }
  }

  /**
   * The developer to delete permission;
   * 
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * The developer to delete permission;
   * 
   */
  public DeletePermissionRequest setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  /**
   * The permission to delete, you should "|" with Permission to get this permission;
   * 
   */
  public long getPermission() {
    return this.permission;
  }

  /**
   * The permission to delete, you should "|" with Permission to get this permission;
   * 
   */
  public DeletePermissionRequest setPermission(long permission) {
    this.permission = permission;
    setPermissionIsSet(true);
    return this;
  }

  public void unsetPermission() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERMISSION_ISSET_ID);
  }

  /** Returns true if field permission is set (has been assigned a value) and false otherwise */
  public boolean isSetPermission() {
    return EncodingUtils.testBit(__isset_bitfield, __PERMISSION_ISSET_ID);
  }

  public void setPermissionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERMISSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_INFO:
      if (value == null) {
        unsetTopicInfo();
      } else {
        setTopicInfo((TopicInfo)value);
      }
      break;

    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case PERMISSION:
      if (value == null) {
        unsetPermission();
      } else {
        setPermission((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_INFO:
      return getTopicInfo();

    case DEVELOPER_ID:
      return getDeveloperId();

    case PERMISSION:
      return Long.valueOf(getPermission());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_INFO:
      return isSetTopicInfo();
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case PERMISSION:
      return isSetPermission();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeletePermissionRequest)
      return this.equals((DeletePermissionRequest)that);
    return false;
  }

  public boolean equals(DeletePermissionRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicInfo = true && this.isSetTopicInfo();
    boolean that_present_topicInfo = true && that.isSetTopicInfo();
    if (this_present_topicInfo || that_present_topicInfo) {
      if (!(this_present_topicInfo && that_present_topicInfo))
        return false;
      if (!this.topicInfo.equals(that.topicInfo))
        return false;
    }

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_permission = true;
    boolean that_present_permission = true;
    if (this_present_permission || that_present_permission) {
      if (!(this_present_permission && that_present_permission))
        return false;
      if (this.permission != that.permission)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicInfo = true && (isSetTopicInfo());
    list.add(present_topicInfo);
    if (present_topicInfo)
      list.add(topicInfo);

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_permission = true;
    list.add(present_permission);
    if (present_permission)
      list.add(permission);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeletePermissionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicInfo()).compareTo(other.isSetTopicInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicInfo()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicInfo, other.topicInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPermission()).compareTo(other.isSetPermission());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermission()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.permission, other.permission);
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
    StringBuilder sb = new StringBuilder("DeletePermissionRequest(");
    boolean first = true;

    sb.append("topicInfo:");
    if (this.topicInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.topicInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("developerId:");
    if (this.developerId == null) {
      sb.append("null");
    } else {
      sb.append(this.developerId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("permission:");
    sb.append(this.permission);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicInfo == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicInfo' was not present! Struct: " + toString());
    }
    if (developerId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'developerId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'permission' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (topicInfo != null) {
      topicInfo.validate();
    }
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

  private static class DeletePermissionRequestStandardSchemeFactory implements SchemeFactory {
    public DeletePermissionRequestStandardScheme getScheme() {
      return new DeletePermissionRequestStandardScheme();
    }
  }

  private static class DeletePermissionRequestStandardScheme extends StandardScheme<DeletePermissionRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, DeletePermissionRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_INFO
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicInfo = new TopicInfo();
              struct.topicInfo.read(iprot);
              struct.setTopicInfoIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PERMISSION
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.permission = iprot.readI64();
              struct.setPermissionIsSet(true);
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
      if (!struct.isSetPermission()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'permission' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, DeletePermissionRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicInfo != null) {
        oprot.writeFieldBegin(TOPIC_INFO_FIELD_DESC);
        struct.topicInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.developerId != null) {
        oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
        oprot.writeString(struct.developerId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PERMISSION_FIELD_DESC);
      oprot.writeI64(struct.permission);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeletePermissionRequestTupleSchemeFactory implements SchemeFactory {
    public DeletePermissionRequestTupleScheme getScheme() {
      return new DeletePermissionRequestTupleScheme();
    }
  }

  private static class DeletePermissionRequestTupleScheme extends TupleScheme<DeletePermissionRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeletePermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicInfo.write(oprot);
      oprot.writeString(struct.developerId);
      oprot.writeI64(struct.permission);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeletePermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicInfo = new TopicInfo();
      struct.topicInfo.read(iprot);
      struct.setTopicInfoIsSet(true);
      struct.developerId = iprot.readString();
      struct.setDeveloperIdIsSet(true);
      struct.permission = iprot.readI64();
      struct.setPermissionIsSet(true);
    }
  }

}

