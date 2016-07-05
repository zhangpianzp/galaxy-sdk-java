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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-18")
public class ClusterBills implements libthrift091.TBase<ClusterBills, ClusterBills._Fields>, java.io.Serializable, Cloneable, Comparable<ClusterBills> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ClusterBills");

  private static final libthrift091.protocol.TField BILLLIST_FIELD_DESC = new libthrift091.protocol.TField("billlist", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClusterBillsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClusterBillsTupleSchemeFactory());
  }

  public List<ClusterBill> billlist; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    BILLLIST((short)1, "billlist");

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
        case 1: // BILLLIST
          return BILLLIST;
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
    tmpMap.put(_Fields.BILLLIST, new libthrift091.meta_data.FieldMetaData("billlist", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, ClusterBill.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ClusterBills.class, metaDataMap);
  }

  public ClusterBills() {
  }

  public ClusterBills(
    List<ClusterBill> billlist)
  {
    this();
    this.billlist = billlist;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterBills(ClusterBills other) {
    if (other.isSetBilllist()) {
      List<ClusterBill> __this__billlist = new ArrayList<ClusterBill>(other.billlist.size());
      for (ClusterBill other_element : other.billlist) {
        __this__billlist.add(new ClusterBill(other_element));
      }
      this.billlist = __this__billlist;
    }
  }

  public ClusterBills deepCopy() {
    return new ClusterBills(this);
  }

  @Override
  public void clear() {
    this.billlist = null;
  }

  public int getBilllistSize() {
    return (this.billlist == null) ? 0 : this.billlist.size();
  }

  public java.util.Iterator<ClusterBill> getBilllistIterator() {
    return (this.billlist == null) ? null : this.billlist.iterator();
  }

  public void addToBilllist(ClusterBill elem) {
    if (this.billlist == null) {
      this.billlist = new ArrayList<ClusterBill>();
    }
    this.billlist.add(elem);
  }

  public List<ClusterBill> getBilllist() {
    return this.billlist;
  }

  public ClusterBills setBilllist(List<ClusterBill> billlist) {
    this.billlist = billlist;
    return this;
  }

  public void unsetBilllist() {
    this.billlist = null;
  }

  /** Returns true if field billlist is set (has been assigned a value) and false otherwise */
  public boolean isSetBilllist() {
    return this.billlist != null;
  }

  public void setBilllistIsSet(boolean value) {
    if (!value) {
      this.billlist = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BILLLIST:
      if (value == null) {
        unsetBilllist();
      } else {
        setBilllist((List<ClusterBill>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BILLLIST:
      return getBilllist();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BILLLIST:
      return isSetBilllist();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClusterBills)
      return this.equals((ClusterBills)that);
    return false;
  }

  public boolean equals(ClusterBills that) {
    if (that == null)
      return false;

    boolean this_present_billlist = true && this.isSetBilllist();
    boolean that_present_billlist = true && that.isSetBilllist();
    if (this_present_billlist || that_present_billlist) {
      if (!(this_present_billlist && that_present_billlist))
        return false;
      if (!this.billlist.equals(that.billlist))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_billlist = true && (isSetBilllist());
    list.add(present_billlist);
    if (present_billlist)
      list.add(billlist);

    return list.hashCode();
  }

  @Override
  public int compareTo(ClusterBills other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBilllist()).compareTo(other.isSetBilllist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBilllist()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.billlist, other.billlist);
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
    StringBuilder sb = new StringBuilder("ClusterBills(");
    boolean first = true;

    sb.append("billlist:");
    if (this.billlist == null) {
      sb.append("null");
    } else {
      sb.append(this.billlist);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class ClusterBillsStandardSchemeFactory implements SchemeFactory {
    public ClusterBillsStandardScheme getScheme() {
      return new ClusterBillsStandardScheme();
    }
  }

  private static class ClusterBillsStandardScheme extends StandardScheme<ClusterBills> {

    public void read(libthrift091.protocol.TProtocol iprot, ClusterBills struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BILLLIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.billlist = new ArrayList<ClusterBill>(_list0.size);
                ClusterBill _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ClusterBill();
                  _elem1.read(iprot);
                  struct.billlist.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setBilllistIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ClusterBills struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.billlist != null) {
        oprot.writeFieldBegin(BILLLIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.billlist.size()));
          for (ClusterBill _iter3 : struct.billlist)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClusterBillsTupleSchemeFactory implements SchemeFactory {
    public ClusterBillsTupleScheme getScheme() {
      return new ClusterBillsTupleScheme();
    }
  }

  private static class ClusterBillsTupleScheme extends TupleScheme<ClusterBills> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ClusterBills struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBilllist()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBilllist()) {
        {
          oprot.writeI32(struct.billlist.size());
          for (ClusterBill _iter4 : struct.billlist)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ClusterBills struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.billlist = new ArrayList<ClusterBill>(_list5.size);
          ClusterBill _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new ClusterBill();
            _elem6.read(iprot);
            struct.billlist.add(_elem6);
          }
        }
        struct.setBilllistIsSet(true);
      }
    }
  }

}

