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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-23")
public class SendMessageBatchRequest implements libthrift091.TBase<SendMessageBatchRequest, SendMessageBatchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SendMessageBatchRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SendMessageBatchRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST_FIELD_DESC = new libthrift091.protocol.TField("sendMessageBatchRequestEntryList", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SendMessageBatchRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SendMessageBatchRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   * 
   */
  public String queueName; // required
  /**
   * List of SendMessageBatchRequestEntry;
   * 
   */
  public List<SendMessageBatchRequestEntry> sendMessageBatchRequestEntryList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * List of SendMessageBatchRequestEntry;
     * 
     */
    SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST((short)2, "sendMessageBatchRequestEntryList");

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
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST
          return SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST;
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
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST, new libthrift091.meta_data.FieldMetaData("sendMessageBatchRequestEntryList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, SendMessageBatchRequestEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SendMessageBatchRequest.class, metaDataMap);
  }

  public SendMessageBatchRequest() {
  }

  public SendMessageBatchRequest(
    String queueName,
    List<SendMessageBatchRequestEntry> sendMessageBatchRequestEntryList)
  {
    this();
    this.queueName = queueName;
    this.sendMessageBatchRequestEntryList = sendMessageBatchRequestEntryList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SendMessageBatchRequest(SendMessageBatchRequest other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetSendMessageBatchRequestEntryList()) {
      List<SendMessageBatchRequestEntry> __this__sendMessageBatchRequestEntryList = new ArrayList<SendMessageBatchRequestEntry>(other.sendMessageBatchRequestEntryList.size());
      for (SendMessageBatchRequestEntry other_element : other.sendMessageBatchRequestEntryList) {
        __this__sendMessageBatchRequestEntryList.add(new SendMessageBatchRequestEntry(other_element));
      }
      this.sendMessageBatchRequestEntryList = __this__sendMessageBatchRequestEntryList;
    }
  }

  public SendMessageBatchRequest deepCopy() {
    return new SendMessageBatchRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.sendMessageBatchRequestEntryList = null;
  }

  /**
   * Queue name;
   * 
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * Queue name;
   * 
   */
  public SendMessageBatchRequest setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public int getSendMessageBatchRequestEntryListSize() {
    return (this.sendMessageBatchRequestEntryList == null) ? 0 : this.sendMessageBatchRequestEntryList.size();
  }

  public java.util.Iterator<SendMessageBatchRequestEntry> getSendMessageBatchRequestEntryListIterator() {
    return (this.sendMessageBatchRequestEntryList == null) ? null : this.sendMessageBatchRequestEntryList.iterator();
  }

  public void addToSendMessageBatchRequestEntryList(SendMessageBatchRequestEntry elem) {
    if (this.sendMessageBatchRequestEntryList == null) {
      this.sendMessageBatchRequestEntryList = new ArrayList<SendMessageBatchRequestEntry>();
    }
    this.sendMessageBatchRequestEntryList.add(elem);
  }

  /**
   * List of SendMessageBatchRequestEntry;
   * 
   */
  public List<SendMessageBatchRequestEntry> getSendMessageBatchRequestEntryList() {
    return this.sendMessageBatchRequestEntryList;
  }

  /**
   * List of SendMessageBatchRequestEntry;
   * 
   */
  public SendMessageBatchRequest setSendMessageBatchRequestEntryList(List<SendMessageBatchRequestEntry> sendMessageBatchRequestEntryList) {
    this.sendMessageBatchRequestEntryList = sendMessageBatchRequestEntryList;
    return this;
  }

  public void unsetSendMessageBatchRequestEntryList() {
    this.sendMessageBatchRequestEntryList = null;
  }

  /** Returns true if field sendMessageBatchRequestEntryList is set (has been assigned a value) and false otherwise */
  public boolean isSetSendMessageBatchRequestEntryList() {
    return this.sendMessageBatchRequestEntryList != null;
  }

  public void setSendMessageBatchRequestEntryListIsSet(boolean value) {
    if (!value) {
      this.sendMessageBatchRequestEntryList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      if (value == null) {
        unsetSendMessageBatchRequestEntryList();
      } else {
        setSendMessageBatchRequestEntryList((List<SendMessageBatchRequestEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      return getSendMessageBatchRequestEntryList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      return isSetSendMessageBatchRequestEntryList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SendMessageBatchRequest)
      return this.equals((SendMessageBatchRequest)that);
    return false;
  }

  public boolean equals(SendMessageBatchRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_sendMessageBatchRequestEntryList = true && this.isSetSendMessageBatchRequestEntryList();
    boolean that_present_sendMessageBatchRequestEntryList = true && that.isSetSendMessageBatchRequestEntryList();
    if (this_present_sendMessageBatchRequestEntryList || that_present_sendMessageBatchRequestEntryList) {
      if (!(this_present_sendMessageBatchRequestEntryList && that_present_sendMessageBatchRequestEntryList))
        return false;
      if (!this.sendMessageBatchRequestEntryList.equals(that.sendMessageBatchRequestEntryList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_sendMessageBatchRequestEntryList = true && (isSetSendMessageBatchRequestEntryList());
    list.add(present_sendMessageBatchRequestEntryList);
    if (present_sendMessageBatchRequestEntryList)
      list.add(sendMessageBatchRequestEntryList);

    return list.hashCode();
  }

  @Override
  public int compareTo(SendMessageBatchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSendMessageBatchRequestEntryList()).compareTo(other.isSetSendMessageBatchRequestEntryList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSendMessageBatchRequestEntryList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sendMessageBatchRequestEntryList, other.sendMessageBatchRequestEntryList);
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
    StringBuilder sb = new StringBuilder("SendMessageBatchRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sendMessageBatchRequestEntryList:");
    if (this.sendMessageBatchRequestEntryList == null) {
      sb.append("null");
    } else {
      sb.append(this.sendMessageBatchRequestEntryList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (sendMessageBatchRequestEntryList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'sendMessageBatchRequestEntryList' was not present! Struct: " + toString());
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

  private static class SendMessageBatchRequestStandardSchemeFactory implements SchemeFactory {
    public SendMessageBatchRequestStandardScheme getScheme() {
      return new SendMessageBatchRequestStandardScheme();
    }
  }

  private static class SendMessageBatchRequestStandardScheme extends StandardScheme<SendMessageBatchRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SendMessageBatchRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list20 = iprot.readListBegin();
                struct.sendMessageBatchRequestEntryList = new ArrayList<SendMessageBatchRequestEntry>(_list20.size);
                SendMessageBatchRequestEntry _elem21;
                for (int _i22 = 0; _i22 < _list20.size; ++_i22)
                {
                  _elem21 = new SendMessageBatchRequestEntry();
                  _elem21.read(iprot);
                  struct.sendMessageBatchRequestEntryList.add(_elem21);
                }
                iprot.readListEnd();
              }
              struct.setSendMessageBatchRequestEntryListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SendMessageBatchRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.sendMessageBatchRequestEntryList != null) {
        oprot.writeFieldBegin(SEND_MESSAGE_BATCH_REQUEST_ENTRY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.sendMessageBatchRequestEntryList.size()));
          for (SendMessageBatchRequestEntry _iter23 : struct.sendMessageBatchRequestEntryList)
          {
            _iter23.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SendMessageBatchRequestTupleSchemeFactory implements SchemeFactory {
    public SendMessageBatchRequestTupleScheme getScheme() {
      return new SendMessageBatchRequestTupleScheme();
    }
  }

  private static class SendMessageBatchRequestTupleScheme extends TupleScheme<SendMessageBatchRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SendMessageBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      {
        oprot.writeI32(struct.sendMessageBatchRequestEntryList.size());
        for (SendMessageBatchRequestEntry _iter24 : struct.sendMessageBatchRequestEntryList)
        {
          _iter24.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SendMessageBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      {
        libthrift091.protocol.TList _list25 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.sendMessageBatchRequestEntryList = new ArrayList<SendMessageBatchRequestEntry>(_list25.size);
        SendMessageBatchRequestEntry _elem26;
        for (int _i27 = 0; _i27 < _list25.size; ++_i27)
        {
          _elem26 = new SendMessageBatchRequestEntry();
          _elem26.read(iprot);
          struct.sendMessageBatchRequestEntryList.add(_elem26);
        }
      }
      struct.setSendMessageBatchRequestEntryListIsSet(true);
    }
  }

}

