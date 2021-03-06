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
/**
 * BaseQuota is the base struct of UserQuota and TopicQuota
 * the quota service is made for three aspects:
 * 1. the resource number taken up by users
 * 2. the read/write qps quota
 * 3. the traffic qps quota
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-3-14")
public class BaseQuota implements libthrift091.TBase<BaseQuota, BaseQuota._Fields>, java.io.Serializable, Cloneable, Comparable<BaseQuota> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("BaseQuota");

  private static final libthrift091.protocol.TField SPACE_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("spaceQuota", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField USED_SPACE_FIELD_DESC = new libthrift091.protocol.TField("usedSpace", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField REMAINING_SPACE_FIELD_DESC = new libthrift091.protocol.TField("remainingSpace", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField PUT_MESSAGE_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("putMessageQpsQuota", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField GET_MESSAGE_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("getMessageQpsQuota", libthrift091.protocol.TType.I32, (short)5);
  private static final libthrift091.protocol.TField PUT_MESSAGE_BYTES_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("putMessageBytesQpsQuota", libthrift091.protocol.TType.I64, (short)6);
  private static final libthrift091.protocol.TField GET_MESSAGE_BYTES_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("getMessageBytesQpsQuota", libthrift091.protocol.TType.I64, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BaseQuotaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BaseQuotaTupleSchemeFactory());
  }

  /**
   * The max space can be used for specified developer/topic
   * default 1T for developer, and 500G for topic
   * 
   */
  public long spaceQuota; // required
  /**
   * The used space quota
   * 
   */
  public long usedSpace; // optional
  /**
   * The remaining space quota
   * 
   */
  public long remainingSpace; // optional
  /**
   * The max total qps of putMessage of specified developer/topic
   * default 40000 for developer, and 4000 for topic
   * 
   */
  public int putMessageQpsQuota; // optional
  /**
   * The max total qps of getMessage of specified developer/topic
   * default 40000 for developer, and 4000 for topic
   * 
   */
  public int getMessageQpsQuota; // optional
  /**
   * The max total bytes of putMessage of specified developer/topic
   * default 500MB for developer, and 50MB for topic
   * 
   */
  public long putMessageBytesQpsQuota; // optional
  /**
   * The max total bytes of getMessage of specified developer/topic
   * default 500MB for developer, and 50MB for topic
   * 
   */
  public long getMessageBytesQpsQuota; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The max space can be used for specified developer/topic
     * default 1T for developer, and 500G for topic
     * 
     */
    SPACE_QUOTA((short)1, "spaceQuota"),
    /**
     * The used space quota
     * 
     */
    USED_SPACE((short)2, "usedSpace"),
    /**
     * The remaining space quota
     * 
     */
    REMAINING_SPACE((short)3, "remainingSpace"),
    /**
     * The max total qps of putMessage of specified developer/topic
     * default 40000 for developer, and 4000 for topic
     * 
     */
    PUT_MESSAGE_QPS_QUOTA((short)4, "putMessageQpsQuota"),
    /**
     * The max total qps of getMessage of specified developer/topic
     * default 40000 for developer, and 4000 for topic
     * 
     */
    GET_MESSAGE_QPS_QUOTA((short)5, "getMessageQpsQuota"),
    /**
     * The max total bytes of putMessage of specified developer/topic
     * default 500MB for developer, and 50MB for topic
     * 
     */
    PUT_MESSAGE_BYTES_QPS_QUOTA((short)6, "putMessageBytesQpsQuota"),
    /**
     * The max total bytes of getMessage of specified developer/topic
     * default 500MB for developer, and 50MB for topic
     * 
     */
    GET_MESSAGE_BYTES_QPS_QUOTA((short)7, "getMessageBytesQpsQuota");

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
        case 1: // SPACE_QUOTA
          return SPACE_QUOTA;
        case 2: // USED_SPACE
          return USED_SPACE;
        case 3: // REMAINING_SPACE
          return REMAINING_SPACE;
        case 4: // PUT_MESSAGE_QPS_QUOTA
          return PUT_MESSAGE_QPS_QUOTA;
        case 5: // GET_MESSAGE_QPS_QUOTA
          return GET_MESSAGE_QPS_QUOTA;
        case 6: // PUT_MESSAGE_BYTES_QPS_QUOTA
          return PUT_MESSAGE_BYTES_QPS_QUOTA;
        case 7: // GET_MESSAGE_BYTES_QPS_QUOTA
          return GET_MESSAGE_BYTES_QPS_QUOTA;
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
  private static final int __SPACEQUOTA_ISSET_ID = 0;
  private static final int __USEDSPACE_ISSET_ID = 1;
  private static final int __REMAININGSPACE_ISSET_ID = 2;
  private static final int __PUTMESSAGEQPSQUOTA_ISSET_ID = 3;
  private static final int __GETMESSAGEQPSQUOTA_ISSET_ID = 4;
  private static final int __PUTMESSAGEBYTESQPSQUOTA_ISSET_ID = 5;
  private static final int __GETMESSAGEBYTESQPSQUOTA_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USED_SPACE,_Fields.REMAINING_SPACE,_Fields.PUT_MESSAGE_QPS_QUOTA,_Fields.GET_MESSAGE_QPS_QUOTA,_Fields.PUT_MESSAGE_BYTES_QPS_QUOTA,_Fields.GET_MESSAGE_BYTES_QPS_QUOTA};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SPACE_QUOTA, new libthrift091.meta_data.FieldMetaData("spaceQuota", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.USED_SPACE, new libthrift091.meta_data.FieldMetaData("usedSpace", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.REMAINING_SPACE, new libthrift091.meta_data.FieldMetaData("remainingSpace", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.PUT_MESSAGE_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("putMessageQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.GET_MESSAGE_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("getMessageQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.PUT_MESSAGE_BYTES_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("putMessageBytesQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.GET_MESSAGE_BYTES_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("getMessageBytesQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(BaseQuota.class, metaDataMap);
  }

  public BaseQuota() {
  }

  public BaseQuota(
    long spaceQuota)
  {
    this();
    this.spaceQuota = spaceQuota;
    setSpaceQuotaIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BaseQuota(BaseQuota other) {
    __isset_bitfield = other.__isset_bitfield;
    this.spaceQuota = other.spaceQuota;
    this.usedSpace = other.usedSpace;
    this.remainingSpace = other.remainingSpace;
    this.putMessageQpsQuota = other.putMessageQpsQuota;
    this.getMessageQpsQuota = other.getMessageQpsQuota;
    this.putMessageBytesQpsQuota = other.putMessageBytesQpsQuota;
    this.getMessageBytesQpsQuota = other.getMessageBytesQpsQuota;
  }

  public BaseQuota deepCopy() {
    return new BaseQuota(this);
  }

  @Override
  public void clear() {
    setSpaceQuotaIsSet(false);
    this.spaceQuota = 0;
    setUsedSpaceIsSet(false);
    this.usedSpace = 0;
    setRemainingSpaceIsSet(false);
    this.remainingSpace = 0;
    setPutMessageQpsQuotaIsSet(false);
    this.putMessageQpsQuota = 0;
    setGetMessageQpsQuotaIsSet(false);
    this.getMessageQpsQuota = 0;
    setPutMessageBytesQpsQuotaIsSet(false);
    this.putMessageBytesQpsQuota = 0;
    setGetMessageBytesQpsQuotaIsSet(false);
    this.getMessageBytesQpsQuota = 0;
  }

  /**
   * The max space can be used for specified developer/topic
   * default 1T for developer, and 500G for topic
   * 
   */
  public long getSpaceQuota() {
    return this.spaceQuota;
  }

  /**
   * The max space can be used for specified developer/topic
   * default 1T for developer, and 500G for topic
   * 
   */
  public BaseQuota setSpaceQuota(long spaceQuota) {
    this.spaceQuota = spaceQuota;
    setSpaceQuotaIsSet(true);
    return this;
  }

  public void unsetSpaceQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPACEQUOTA_ISSET_ID);
  }

  /** Returns true if field spaceQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetSpaceQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __SPACEQUOTA_ISSET_ID);
  }

  public void setSpaceQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPACEQUOTA_ISSET_ID, value);
  }

  /**
   * The used space quota
   * 
   */
  public long getUsedSpace() {
    return this.usedSpace;
  }

  /**
   * The used space quota
   * 
   */
  public BaseQuota setUsedSpace(long usedSpace) {
    this.usedSpace = usedSpace;
    setUsedSpaceIsSet(true);
    return this;
  }

  public void unsetUsedSpace() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USEDSPACE_ISSET_ID);
  }

  /** Returns true if field usedSpace is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedSpace() {
    return EncodingUtils.testBit(__isset_bitfield, __USEDSPACE_ISSET_ID);
  }

  public void setUsedSpaceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USEDSPACE_ISSET_ID, value);
  }

  /**
   * The remaining space quota
   * 
   */
  public long getRemainingSpace() {
    return this.remainingSpace;
  }

  /**
   * The remaining space quota
   * 
   */
  public BaseQuota setRemainingSpace(long remainingSpace) {
    this.remainingSpace = remainingSpace;
    setRemainingSpaceIsSet(true);
    return this;
  }

  public void unsetRemainingSpace() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REMAININGSPACE_ISSET_ID);
  }

  /** Returns true if field remainingSpace is set (has been assigned a value) and false otherwise */
  public boolean isSetRemainingSpace() {
    return EncodingUtils.testBit(__isset_bitfield, __REMAININGSPACE_ISSET_ID);
  }

  public void setRemainingSpaceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REMAININGSPACE_ISSET_ID, value);
  }

  /**
   * The max total qps of putMessage of specified developer/topic
   * default 40000 for developer, and 4000 for topic
   * 
   */
  public int getPutMessageQpsQuota() {
    return this.putMessageQpsQuota;
  }

  /**
   * The max total qps of putMessage of specified developer/topic
   * default 40000 for developer, and 4000 for topic
   * 
   */
  public BaseQuota setPutMessageQpsQuota(int putMessageQpsQuota) {
    this.putMessageQpsQuota = putMessageQpsQuota;
    setPutMessageQpsQuotaIsSet(true);
    return this;
  }

  public void unsetPutMessageQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PUTMESSAGEQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field putMessageQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetPutMessageQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __PUTMESSAGEQPSQUOTA_ISSET_ID);
  }

  public void setPutMessageQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PUTMESSAGEQPSQUOTA_ISSET_ID, value);
  }

  /**
   * The max total qps of getMessage of specified developer/topic
   * default 40000 for developer, and 4000 for topic
   * 
   */
  public int getGetMessageQpsQuota() {
    return this.getMessageQpsQuota;
  }

  /**
   * The max total qps of getMessage of specified developer/topic
   * default 40000 for developer, and 4000 for topic
   * 
   */
  public BaseQuota setGetMessageQpsQuota(int getMessageQpsQuota) {
    this.getMessageQpsQuota = getMessageQpsQuota;
    setGetMessageQpsQuotaIsSet(true);
    return this;
  }

  public void unsetGetMessageQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GETMESSAGEQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field getMessageQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetGetMessageQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __GETMESSAGEQPSQUOTA_ISSET_ID);
  }

  public void setGetMessageQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GETMESSAGEQPSQUOTA_ISSET_ID, value);
  }

  /**
   * The max total bytes of putMessage of specified developer/topic
   * default 500MB for developer, and 50MB for topic
   * 
   */
  public long getPutMessageBytesQpsQuota() {
    return this.putMessageBytesQpsQuota;
  }

  /**
   * The max total bytes of putMessage of specified developer/topic
   * default 500MB for developer, and 50MB for topic
   * 
   */
  public BaseQuota setPutMessageBytesQpsQuota(long putMessageBytesQpsQuota) {
    this.putMessageBytesQpsQuota = putMessageBytesQpsQuota;
    setPutMessageBytesQpsQuotaIsSet(true);
    return this;
  }

  public void unsetPutMessageBytesQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PUTMESSAGEBYTESQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field putMessageBytesQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetPutMessageBytesQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __PUTMESSAGEBYTESQPSQUOTA_ISSET_ID);
  }

  public void setPutMessageBytesQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PUTMESSAGEBYTESQPSQUOTA_ISSET_ID, value);
  }

  /**
   * The max total bytes of getMessage of specified developer/topic
   * default 500MB for developer, and 50MB for topic
   * 
   */
  public long getGetMessageBytesQpsQuota() {
    return this.getMessageBytesQpsQuota;
  }

  /**
   * The max total bytes of getMessage of specified developer/topic
   * default 500MB for developer, and 50MB for topic
   * 
   */
  public BaseQuota setGetMessageBytesQpsQuota(long getMessageBytesQpsQuota) {
    this.getMessageBytesQpsQuota = getMessageBytesQpsQuota;
    setGetMessageBytesQpsQuotaIsSet(true);
    return this;
  }

  public void unsetGetMessageBytesQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GETMESSAGEBYTESQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field getMessageBytesQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetGetMessageBytesQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __GETMESSAGEBYTESQPSQUOTA_ISSET_ID);
  }

  public void setGetMessageBytesQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GETMESSAGEBYTESQPSQUOTA_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SPACE_QUOTA:
      if (value == null) {
        unsetSpaceQuota();
      } else {
        setSpaceQuota((Long)value);
      }
      break;

    case USED_SPACE:
      if (value == null) {
        unsetUsedSpace();
      } else {
        setUsedSpace((Long)value);
      }
      break;

    case REMAINING_SPACE:
      if (value == null) {
        unsetRemainingSpace();
      } else {
        setRemainingSpace((Long)value);
      }
      break;

    case PUT_MESSAGE_QPS_QUOTA:
      if (value == null) {
        unsetPutMessageQpsQuota();
      } else {
        setPutMessageQpsQuota((Integer)value);
      }
      break;

    case GET_MESSAGE_QPS_QUOTA:
      if (value == null) {
        unsetGetMessageQpsQuota();
      } else {
        setGetMessageQpsQuota((Integer)value);
      }
      break;

    case PUT_MESSAGE_BYTES_QPS_QUOTA:
      if (value == null) {
        unsetPutMessageBytesQpsQuota();
      } else {
        setPutMessageBytesQpsQuota((Long)value);
      }
      break;

    case GET_MESSAGE_BYTES_QPS_QUOTA:
      if (value == null) {
        unsetGetMessageBytesQpsQuota();
      } else {
        setGetMessageBytesQpsQuota((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SPACE_QUOTA:
      return Long.valueOf(getSpaceQuota());

    case USED_SPACE:
      return Long.valueOf(getUsedSpace());

    case REMAINING_SPACE:
      return Long.valueOf(getRemainingSpace());

    case PUT_MESSAGE_QPS_QUOTA:
      return Integer.valueOf(getPutMessageQpsQuota());

    case GET_MESSAGE_QPS_QUOTA:
      return Integer.valueOf(getGetMessageQpsQuota());

    case PUT_MESSAGE_BYTES_QPS_QUOTA:
      return Long.valueOf(getPutMessageBytesQpsQuota());

    case GET_MESSAGE_BYTES_QPS_QUOTA:
      return Long.valueOf(getGetMessageBytesQpsQuota());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SPACE_QUOTA:
      return isSetSpaceQuota();
    case USED_SPACE:
      return isSetUsedSpace();
    case REMAINING_SPACE:
      return isSetRemainingSpace();
    case PUT_MESSAGE_QPS_QUOTA:
      return isSetPutMessageQpsQuota();
    case GET_MESSAGE_QPS_QUOTA:
      return isSetGetMessageQpsQuota();
    case PUT_MESSAGE_BYTES_QPS_QUOTA:
      return isSetPutMessageBytesQpsQuota();
    case GET_MESSAGE_BYTES_QPS_QUOTA:
      return isSetGetMessageBytesQpsQuota();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BaseQuota)
      return this.equals((BaseQuota)that);
    return false;
  }

  public boolean equals(BaseQuota that) {
    if (that == null)
      return false;

    boolean this_present_spaceQuota = true;
    boolean that_present_spaceQuota = true;
    if (this_present_spaceQuota || that_present_spaceQuota) {
      if (!(this_present_spaceQuota && that_present_spaceQuota))
        return false;
      if (this.spaceQuota != that.spaceQuota)
        return false;
    }

    boolean this_present_usedSpace = true && this.isSetUsedSpace();
    boolean that_present_usedSpace = true && that.isSetUsedSpace();
    if (this_present_usedSpace || that_present_usedSpace) {
      if (!(this_present_usedSpace && that_present_usedSpace))
        return false;
      if (this.usedSpace != that.usedSpace)
        return false;
    }

    boolean this_present_remainingSpace = true && this.isSetRemainingSpace();
    boolean that_present_remainingSpace = true && that.isSetRemainingSpace();
    if (this_present_remainingSpace || that_present_remainingSpace) {
      if (!(this_present_remainingSpace && that_present_remainingSpace))
        return false;
      if (this.remainingSpace != that.remainingSpace)
        return false;
    }

    boolean this_present_putMessageQpsQuota = true && this.isSetPutMessageQpsQuota();
    boolean that_present_putMessageQpsQuota = true && that.isSetPutMessageQpsQuota();
    if (this_present_putMessageQpsQuota || that_present_putMessageQpsQuota) {
      if (!(this_present_putMessageQpsQuota && that_present_putMessageQpsQuota))
        return false;
      if (this.putMessageQpsQuota != that.putMessageQpsQuota)
        return false;
    }

    boolean this_present_getMessageQpsQuota = true && this.isSetGetMessageQpsQuota();
    boolean that_present_getMessageQpsQuota = true && that.isSetGetMessageQpsQuota();
    if (this_present_getMessageQpsQuota || that_present_getMessageQpsQuota) {
      if (!(this_present_getMessageQpsQuota && that_present_getMessageQpsQuota))
        return false;
      if (this.getMessageQpsQuota != that.getMessageQpsQuota)
        return false;
    }

    boolean this_present_putMessageBytesQpsQuota = true && this.isSetPutMessageBytesQpsQuota();
    boolean that_present_putMessageBytesQpsQuota = true && that.isSetPutMessageBytesQpsQuota();
    if (this_present_putMessageBytesQpsQuota || that_present_putMessageBytesQpsQuota) {
      if (!(this_present_putMessageBytesQpsQuota && that_present_putMessageBytesQpsQuota))
        return false;
      if (this.putMessageBytesQpsQuota != that.putMessageBytesQpsQuota)
        return false;
    }

    boolean this_present_getMessageBytesQpsQuota = true && this.isSetGetMessageBytesQpsQuota();
    boolean that_present_getMessageBytesQpsQuota = true && that.isSetGetMessageBytesQpsQuota();
    if (this_present_getMessageBytesQpsQuota || that_present_getMessageBytesQpsQuota) {
      if (!(this_present_getMessageBytesQpsQuota && that_present_getMessageBytesQpsQuota))
        return false;
      if (this.getMessageBytesQpsQuota != that.getMessageBytesQpsQuota)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_spaceQuota = true;
    list.add(present_spaceQuota);
    if (present_spaceQuota)
      list.add(spaceQuota);

    boolean present_usedSpace = true && (isSetUsedSpace());
    list.add(present_usedSpace);
    if (present_usedSpace)
      list.add(usedSpace);

    boolean present_remainingSpace = true && (isSetRemainingSpace());
    list.add(present_remainingSpace);
    if (present_remainingSpace)
      list.add(remainingSpace);

    boolean present_putMessageQpsQuota = true && (isSetPutMessageQpsQuota());
    list.add(present_putMessageQpsQuota);
    if (present_putMessageQpsQuota)
      list.add(putMessageQpsQuota);

    boolean present_getMessageQpsQuota = true && (isSetGetMessageQpsQuota());
    list.add(present_getMessageQpsQuota);
    if (present_getMessageQpsQuota)
      list.add(getMessageQpsQuota);

    boolean present_putMessageBytesQpsQuota = true && (isSetPutMessageBytesQpsQuota());
    list.add(present_putMessageBytesQpsQuota);
    if (present_putMessageBytesQpsQuota)
      list.add(putMessageBytesQpsQuota);

    boolean present_getMessageBytesQpsQuota = true && (isSetGetMessageBytesQpsQuota());
    list.add(present_getMessageBytesQpsQuota);
    if (present_getMessageBytesQpsQuota)
      list.add(getMessageBytesQpsQuota);

    return list.hashCode();
  }

  @Override
  public int compareTo(BaseQuota other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpaceQuota()).compareTo(other.isSetSpaceQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpaceQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.spaceQuota, other.spaceQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsedSpace()).compareTo(other.isSetUsedSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedSpace()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.usedSpace, other.usedSpace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemainingSpace()).compareTo(other.isSetRemainingSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemainingSpace()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.remainingSpace, other.remainingSpace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPutMessageQpsQuota()).compareTo(other.isSetPutMessageQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPutMessageQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.putMessageQpsQuota, other.putMessageQpsQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGetMessageQpsQuota()).compareTo(other.isSetGetMessageQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetMessageQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.getMessageQpsQuota, other.getMessageQpsQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPutMessageBytesQpsQuota()).compareTo(other.isSetPutMessageBytesQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPutMessageBytesQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.putMessageBytesQpsQuota, other.putMessageBytesQpsQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGetMessageBytesQpsQuota()).compareTo(other.isSetGetMessageBytesQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetMessageBytesQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.getMessageBytesQpsQuota, other.getMessageBytesQpsQuota);
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
    StringBuilder sb = new StringBuilder("BaseQuota(");
    boolean first = true;

    sb.append("spaceQuota:");
    sb.append(this.spaceQuota);
    first = false;
    if (isSetUsedSpace()) {
      if (!first) sb.append(", ");
      sb.append("usedSpace:");
      sb.append(this.usedSpace);
      first = false;
    }
    if (isSetRemainingSpace()) {
      if (!first) sb.append(", ");
      sb.append("remainingSpace:");
      sb.append(this.remainingSpace);
      first = false;
    }
    if (isSetPutMessageQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("putMessageQpsQuota:");
      sb.append(this.putMessageQpsQuota);
      first = false;
    }
    if (isSetGetMessageQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("getMessageQpsQuota:");
      sb.append(this.getMessageQpsQuota);
      first = false;
    }
    if (isSetPutMessageBytesQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("putMessageBytesQpsQuota:");
      sb.append(this.putMessageBytesQpsQuota);
      first = false;
    }
    if (isSetGetMessageBytesQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("getMessageBytesQpsQuota:");
      sb.append(this.getMessageBytesQpsQuota);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'spaceQuota' because it's a primitive and you chose the non-beans generator.
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

  private static class BaseQuotaStandardSchemeFactory implements SchemeFactory {
    public BaseQuotaStandardScheme getScheme() {
      return new BaseQuotaStandardScheme();
    }
  }

  private static class BaseQuotaStandardScheme extends StandardScheme<BaseQuota> {

    public void read(libthrift091.protocol.TProtocol iprot, BaseQuota struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SPACE_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.spaceQuota = iprot.readI64();
              struct.setSpaceQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_SPACE
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.usedSpace = iprot.readI64();
              struct.setUsedSpaceIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REMAINING_SPACE
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.remainingSpace = iprot.readI64();
              struct.setRemainingSpaceIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PUT_MESSAGE_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.putMessageQpsQuota = iprot.readI32();
              struct.setPutMessageQpsQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GET_MESSAGE_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.getMessageQpsQuota = iprot.readI32();
              struct.setGetMessageQpsQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PUT_MESSAGE_BYTES_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.putMessageBytesQpsQuota = iprot.readI64();
              struct.setPutMessageBytesQpsQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // GET_MESSAGE_BYTES_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.getMessageBytesQpsQuota = iprot.readI64();
              struct.setGetMessageBytesQpsQuotaIsSet(true);
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
      if (!struct.isSetSpaceQuota()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'spaceQuota' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, BaseQuota struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SPACE_QUOTA_FIELD_DESC);
      oprot.writeI64(struct.spaceQuota);
      oprot.writeFieldEnd();
      if (struct.isSetUsedSpace()) {
        oprot.writeFieldBegin(USED_SPACE_FIELD_DESC);
        oprot.writeI64(struct.usedSpace);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRemainingSpace()) {
        oprot.writeFieldBegin(REMAINING_SPACE_FIELD_DESC);
        oprot.writeI64(struct.remainingSpace);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPutMessageQpsQuota()) {
        oprot.writeFieldBegin(PUT_MESSAGE_QPS_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.putMessageQpsQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetGetMessageQpsQuota()) {
        oprot.writeFieldBegin(GET_MESSAGE_QPS_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.getMessageQpsQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPutMessageBytesQpsQuota()) {
        oprot.writeFieldBegin(PUT_MESSAGE_BYTES_QPS_QUOTA_FIELD_DESC);
        oprot.writeI64(struct.putMessageBytesQpsQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetGetMessageBytesQpsQuota()) {
        oprot.writeFieldBegin(GET_MESSAGE_BYTES_QPS_QUOTA_FIELD_DESC);
        oprot.writeI64(struct.getMessageBytesQpsQuota);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BaseQuotaTupleSchemeFactory implements SchemeFactory {
    public BaseQuotaTupleScheme getScheme() {
      return new BaseQuotaTupleScheme();
    }
  }

  private static class BaseQuotaTupleScheme extends TupleScheme<BaseQuota> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, BaseQuota struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.spaceQuota);
      BitSet optionals = new BitSet();
      if (struct.isSetUsedSpace()) {
        optionals.set(0);
      }
      if (struct.isSetRemainingSpace()) {
        optionals.set(1);
      }
      if (struct.isSetPutMessageQpsQuota()) {
        optionals.set(2);
      }
      if (struct.isSetGetMessageQpsQuota()) {
        optionals.set(3);
      }
      if (struct.isSetPutMessageBytesQpsQuota()) {
        optionals.set(4);
      }
      if (struct.isSetGetMessageBytesQpsQuota()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetUsedSpace()) {
        oprot.writeI64(struct.usedSpace);
      }
      if (struct.isSetRemainingSpace()) {
        oprot.writeI64(struct.remainingSpace);
      }
      if (struct.isSetPutMessageQpsQuota()) {
        oprot.writeI32(struct.putMessageQpsQuota);
      }
      if (struct.isSetGetMessageQpsQuota()) {
        oprot.writeI32(struct.getMessageQpsQuota);
      }
      if (struct.isSetPutMessageBytesQpsQuota()) {
        oprot.writeI64(struct.putMessageBytesQpsQuota);
      }
      if (struct.isSetGetMessageBytesQpsQuota()) {
        oprot.writeI64(struct.getMessageBytesQpsQuota);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, BaseQuota struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.spaceQuota = iprot.readI64();
      struct.setSpaceQuotaIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.usedSpace = iprot.readI64();
        struct.setUsedSpaceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.remainingSpace = iprot.readI64();
        struct.setRemainingSpaceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.putMessageQpsQuota = iprot.readI32();
        struct.setPutMessageQpsQuotaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.getMessageQpsQuota = iprot.readI32();
        struct.setGetMessageQpsQuotaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.putMessageBytesQpsQuota = iprot.readI64();
        struct.setPutMessageBytesQpsQuotaIsSet(true);
      }
      if (incoming.get(5)) {
        struct.getMessageBytesQpsQuota = iprot.readI64();
        struct.setGetMessageBytesQpsQuotaIsSet(true);
      }
    }
  }

}

