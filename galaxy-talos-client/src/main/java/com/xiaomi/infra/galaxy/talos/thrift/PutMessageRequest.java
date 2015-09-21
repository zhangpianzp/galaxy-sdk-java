/**
 * Autogenerated by Thrift Compiler (0.9.2)
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-21")
public class PutMessageRequest implements libthrift091.TBase<PutMessageRequest, PutMessageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PutMessageRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PutMessageRequest");

  private static final libthrift091.protocol.TField TOPIC_AND_PARTITION_FIELD_DESC = new libthrift091.protocol.TField("topicAndPartition", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField MESSAGES_FIELD_DESC = new libthrift091.protocol.TField("messages", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField SEQUENCE_ID_FIELD_DESC = new libthrift091.protocol.TField("sequenceId", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PutMessageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PutMessageRequestTupleSchemeFactory());
  }

  /**
   * TopicAndPartititon for the messages to put;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition; // required
  /**
   * The message list to put, the talos producer should make sure all the messages
   * in the list have the same partitionId with topicAndParititon.partitionId;
   * 
   */
  public List<Message> messages; // required
  /**
   * The unique identifier for this PutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public String sequenceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * TopicAndPartititon for the messages to put;
     * 
     */
    TOPIC_AND_PARTITION((short)1, "topicAndPartition"),
    /**
     * The message list to put, the talos producer should make sure all the messages
     * in the list have the same partitionId with topicAndParititon.partitionId;
     * 
     */
    MESSAGES((short)2, "messages"),
    /**
     * The unique identifier for this PutMessageRequest, should in format
     * client_id#sequence_id;
     * 
     */
    SEQUENCE_ID((short)3, "sequenceId");

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
        case 1: // TOPIC_AND_PARTITION
          return TOPIC_AND_PARTITION;
        case 2: // MESSAGES
          return MESSAGES;
        case 3: // SEQUENCE_ID
          return SEQUENCE_ID;
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
    tmpMap.put(_Fields.TOPIC_AND_PARTITION, new libthrift091.meta_data.FieldMetaData("topicAndPartition", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition.class)));
    tmpMap.put(_Fields.MESSAGES, new libthrift091.meta_data.FieldMetaData("messages", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Message.class))));
    tmpMap.put(_Fields.SEQUENCE_ID, new libthrift091.meta_data.FieldMetaData("sequenceId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PutMessageRequest.class, metaDataMap);
  }

  public PutMessageRequest() {
  }

  public PutMessageRequest(
    com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition,
    List<Message> messages,
    String sequenceId)
  {
    this();
    this.topicAndPartition = topicAndPartition;
    this.messages = messages;
    this.sequenceId = sequenceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PutMessageRequest(PutMessageRequest other) {
    if (other.isSetTopicAndPartition()) {
      this.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition(other.topicAndPartition);
    }
    if (other.isSetMessages()) {
      List<Message> __this__messages = new ArrayList<Message>(other.messages.size());
      for (Message other_element : other.messages) {
        __this__messages.add(new Message(other_element));
      }
      this.messages = __this__messages;
    }
    if (other.isSetSequenceId()) {
      this.sequenceId = other.sequenceId;
    }
  }

  public PutMessageRequest deepCopy() {
    return new PutMessageRequest(this);
  }

  @Override
  public void clear() {
    this.topicAndPartition = null;
    this.messages = null;
    this.sequenceId = null;
  }

  /**
   * TopicAndPartititon for the messages to put;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition getTopicAndPartition() {
    return this.topicAndPartition;
  }

  /**
   * TopicAndPartititon for the messages to put;
   * 
   */
  public PutMessageRequest setTopicAndPartition(com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition) {
    this.topicAndPartition = topicAndPartition;
    return this;
  }

  public void unsetTopicAndPartition() {
    this.topicAndPartition = null;
  }

  /** Returns true if field topicAndPartition is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAndPartition() {
    return this.topicAndPartition != null;
  }

  public void setTopicAndPartitionIsSet(boolean value) {
    if (!value) {
      this.topicAndPartition = null;
    }
  }

  public int getMessagesSize() {
    return (this.messages == null) ? 0 : this.messages.size();
  }

  public java.util.Iterator<Message> getMessagesIterator() {
    return (this.messages == null) ? null : this.messages.iterator();
  }

  public void addToMessages(Message elem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(elem);
  }

  /**
   * The message list to put, the talos producer should make sure all the messages
   * in the list have the same partitionId with topicAndParititon.partitionId;
   * 
   */
  public List<Message> getMessages() {
    return this.messages;
  }

  /**
   * The message list to put, the talos producer should make sure all the messages
   * in the list have the same partitionId with topicAndParititon.partitionId;
   * 
   */
  public PutMessageRequest setMessages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public void unsetMessages() {
    this.messages = null;
  }

  /** Returns true if field messages is set (has been assigned a value) and false otherwise */
  public boolean isSetMessages() {
    return this.messages != null;
  }

  public void setMessagesIsSet(boolean value) {
    if (!value) {
      this.messages = null;
    }
  }

  /**
   * The unique identifier for this PutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public String getSequenceId() {
    return this.sequenceId;
  }

  /**
   * The unique identifier for this PutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public PutMessageRequest setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  public void unsetSequenceId() {
    this.sequenceId = null;
  }

  /** Returns true if field sequenceId is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceId() {
    return this.sequenceId != null;
  }

  public void setSequenceIdIsSet(boolean value) {
    if (!value) {
      this.sequenceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      if (value == null) {
        unsetTopicAndPartition();
      } else {
        setTopicAndPartition((com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition)value);
      }
      break;

    case MESSAGES:
      if (value == null) {
        unsetMessages();
      } else {
        setMessages((List<Message>)value);
      }
      break;

    case SEQUENCE_ID:
      if (value == null) {
        unsetSequenceId();
      } else {
        setSequenceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      return getTopicAndPartition();

    case MESSAGES:
      return getMessages();

    case SEQUENCE_ID:
      return getSequenceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_AND_PARTITION:
      return isSetTopicAndPartition();
    case MESSAGES:
      return isSetMessages();
    case SEQUENCE_ID:
      return isSetSequenceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PutMessageRequest)
      return this.equals((PutMessageRequest)that);
    return false;
  }

  public boolean equals(PutMessageRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicAndPartition = true && this.isSetTopicAndPartition();
    boolean that_present_topicAndPartition = true && that.isSetTopicAndPartition();
    if (this_present_topicAndPartition || that_present_topicAndPartition) {
      if (!(this_present_topicAndPartition && that_present_topicAndPartition))
        return false;
      if (!this.topicAndPartition.equals(that.topicAndPartition))
        return false;
    }

    boolean this_present_messages = true && this.isSetMessages();
    boolean that_present_messages = true && that.isSetMessages();
    if (this_present_messages || that_present_messages) {
      if (!(this_present_messages && that_present_messages))
        return false;
      if (!this.messages.equals(that.messages))
        return false;
    }

    boolean this_present_sequenceId = true && this.isSetSequenceId();
    boolean that_present_sequenceId = true && that.isSetSequenceId();
    if (this_present_sequenceId || that_present_sequenceId) {
      if (!(this_present_sequenceId && that_present_sequenceId))
        return false;
      if (!this.sequenceId.equals(that.sequenceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicAndPartition = true && (isSetTopicAndPartition());
    list.add(present_topicAndPartition);
    if (present_topicAndPartition)
      list.add(topicAndPartition);

    boolean present_messages = true && (isSetMessages());
    list.add(present_messages);
    if (present_messages)
      list.add(messages);

    boolean present_sequenceId = true && (isSetSequenceId());
    list.add(present_sequenceId);
    if (present_sequenceId)
      list.add(sequenceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(PutMessageRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicAndPartition()).compareTo(other.isSetTopicAndPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAndPartition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAndPartition, other.topicAndPartition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessages()).compareTo(other.isSetMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessages()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messages, other.messages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceId()).compareTo(other.isSetSequenceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sequenceId, other.sequenceId);
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
    StringBuilder sb = new StringBuilder("PutMessageRequest(");
    boolean first = true;

    sb.append("topicAndPartition:");
    if (this.topicAndPartition == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAndPartition);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messages:");
    if (this.messages == null) {
      sb.append("null");
    } else {
      sb.append(this.messages);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sequenceId:");
    if (this.sequenceId == null) {
      sb.append("null");
    } else {
      sb.append(this.sequenceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicAndPartition == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAndPartition' was not present! Struct: " + toString());
    }
    if (messages == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messages' was not present! Struct: " + toString());
    }
    if (sequenceId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'sequenceId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicAndPartition != null) {
      topicAndPartition.validate();
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PutMessageRequestStandardSchemeFactory implements SchemeFactory {
    public PutMessageRequestStandardScheme getScheme() {
      return new PutMessageRequestStandardScheme();
    }
  }

  private static class PutMessageRequestStandardScheme extends StandardScheme<PutMessageRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, PutMessageRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_AND_PARTITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
              struct.topicAndPartition.read(iprot);
              struct.setTopicAndPartitionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.messages = new ArrayList<Message>(_list0.size);
                Message _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Message();
                  _elem1.read(iprot);
                  struct.messages.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setMessagesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEQUENCE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.sequenceId = iprot.readString();
              struct.setSequenceIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, PutMessageRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicAndPartition != null) {
        oprot.writeFieldBegin(TOPIC_AND_PARTITION_FIELD_DESC);
        struct.topicAndPartition.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.messages != null) {
        oprot.writeFieldBegin(MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.messages.size()));
          for (Message _iter3 : struct.messages)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.sequenceId != null) {
        oprot.writeFieldBegin(SEQUENCE_ID_FIELD_DESC);
        oprot.writeString(struct.sequenceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PutMessageRequestTupleSchemeFactory implements SchemeFactory {
    public PutMessageRequestTupleScheme getScheme() {
      return new PutMessageRequestTupleScheme();
    }
  }

  private static class PutMessageRequestTupleScheme extends TupleScheme<PutMessageRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PutMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicAndPartition.write(oprot);
      {
        oprot.writeI32(struct.messages.size());
        for (Message _iter4 : struct.messages)
        {
          _iter4.write(oprot);
        }
      }
      oprot.writeString(struct.sequenceId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PutMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
      struct.topicAndPartition.read(iprot);
      struct.setTopicAndPartitionIsSet(true);
      {
        libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.messages = new ArrayList<Message>(_list5.size);
        Message _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new Message();
          _elem6.read(iprot);
          struct.messages.add(_elem6);
        }
      }
      struct.setMessagesIsSet(true);
      struct.sequenceId = iprot.readString();
      struct.setSequenceIdIsSet(true);
    }
  }

}

