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
public class InstanceTypeInfo implements libthrift091.TBase<InstanceTypeInfo, InstanceTypeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<InstanceTypeInfo> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("InstanceTypeInfo");

  private static final libthrift091.protocol.TField NAME_FIELD_DESC = new libthrift091.protocol.TField("name", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField CPU_FIELD_DESC = new libthrift091.protocol.TField("cpu", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField RAM_FIELD_DESC = new libthrift091.protocol.TField("ram", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField DISK_FIELD_DESC = new libthrift091.protocol.TField("disk", libthrift091.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InstanceTypeInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InstanceTypeInfoTupleSchemeFactory());
  }

  public String name; // optional
  public int cpu; // optional
  public int ram; // optional
  public int disk; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    NAME((short)1, "name"),
    CPU((short)2, "cpu"),
    RAM((short)3, "ram"),
    DISK((short)4, "disk");

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
        case 1: // NAME
          return NAME;
        case 2: // CPU
          return CPU;
        case 3: // RAM
          return RAM;
        case 4: // DISK
          return DISK;
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
  private static final int __CPU_ISSET_ID = 0;
  private static final int __RAM_ISSET_ID = 1;
  private static final int __DISK_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.CPU,_Fields.RAM,_Fields.DISK};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new libthrift091.meta_data.FieldMetaData("name", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CPU, new libthrift091.meta_data.FieldMetaData("cpu", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.RAM, new libthrift091.meta_data.FieldMetaData("ram", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.DISK, new libthrift091.meta_data.FieldMetaData("disk", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(InstanceTypeInfo.class, metaDataMap);
  }

  public InstanceTypeInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InstanceTypeInfo(InstanceTypeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.cpu = other.cpu;
    this.ram = other.ram;
    this.disk = other.disk;
  }

  public InstanceTypeInfo deepCopy() {
    return new InstanceTypeInfo(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setCpuIsSet(false);
    this.cpu = 0;
    setRamIsSet(false);
    this.ram = 0;
    setDiskIsSet(false);
    this.disk = 0;
  }

  public String getName() {
    return this.name;
  }

  public InstanceTypeInfo setName(String name) {
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

  public int getCpu() {
    return this.cpu;
  }

  public InstanceTypeInfo setCpu(int cpu) {
    this.cpu = cpu;
    setCpuIsSet(true);
    return this;
  }

  public void unsetCpu() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CPU_ISSET_ID);
  }

  /** Returns true if field cpu is set (has been assigned a value) and false otherwise */
  public boolean isSetCpu() {
    return EncodingUtils.testBit(__isset_bitfield, __CPU_ISSET_ID);
  }

  public void setCpuIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CPU_ISSET_ID, value);
  }

  public int getRam() {
    return this.ram;
  }

  public InstanceTypeInfo setRam(int ram) {
    this.ram = ram;
    setRamIsSet(true);
    return this;
  }

  public void unsetRam() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RAM_ISSET_ID);
  }

  /** Returns true if field ram is set (has been assigned a value) and false otherwise */
  public boolean isSetRam() {
    return EncodingUtils.testBit(__isset_bitfield, __RAM_ISSET_ID);
  }

  public void setRamIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RAM_ISSET_ID, value);
  }

  public int getDisk() {
    return this.disk;
  }

  public InstanceTypeInfo setDisk(int disk) {
    this.disk = disk;
    setDiskIsSet(true);
    return this;
  }

  public void unsetDisk() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DISK_ISSET_ID);
  }

  /** Returns true if field disk is set (has been assigned a value) and false otherwise */
  public boolean isSetDisk() {
    return EncodingUtils.testBit(__isset_bitfield, __DISK_ISSET_ID);
  }

  public void setDiskIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DISK_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CPU:
      if (value == null) {
        unsetCpu();
      } else {
        setCpu((Integer)value);
      }
      break;

    case RAM:
      if (value == null) {
        unsetRam();
      } else {
        setRam((Integer)value);
      }
      break;

    case DISK:
      if (value == null) {
        unsetDisk();
      } else {
        setDisk((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case CPU:
      return Integer.valueOf(getCpu());

    case RAM:
      return Integer.valueOf(getRam());

    case DISK:
      return Integer.valueOf(getDisk());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case CPU:
      return isSetCpu();
    case RAM:
      return isSetRam();
    case DISK:
      return isSetDisk();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InstanceTypeInfo)
      return this.equals((InstanceTypeInfo)that);
    return false;
  }

  public boolean equals(InstanceTypeInfo that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_cpu = true && this.isSetCpu();
    boolean that_present_cpu = true && that.isSetCpu();
    if (this_present_cpu || that_present_cpu) {
      if (!(this_present_cpu && that_present_cpu))
        return false;
      if (this.cpu != that.cpu)
        return false;
    }

    boolean this_present_ram = true && this.isSetRam();
    boolean that_present_ram = true && that.isSetRam();
    if (this_present_ram || that_present_ram) {
      if (!(this_present_ram && that_present_ram))
        return false;
      if (this.ram != that.ram)
        return false;
    }

    boolean this_present_disk = true && this.isSetDisk();
    boolean that_present_disk = true && that.isSetDisk();
    if (this_present_disk || that_present_disk) {
      if (!(this_present_disk && that_present_disk))
        return false;
      if (this.disk != that.disk)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_cpu = true && (isSetCpu());
    list.add(present_cpu);
    if (present_cpu)
      list.add(cpu);

    boolean present_ram = true && (isSetRam());
    list.add(present_ram);
    if (present_ram)
      list.add(ram);

    boolean present_disk = true && (isSetDisk());
    list.add(present_disk);
    if (present_disk)
      list.add(disk);

    return list.hashCode();
  }

  @Override
  public int compareTo(InstanceTypeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetCpu()).compareTo(other.isSetCpu());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpu()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.cpu, other.cpu);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRam()).compareTo(other.isSetRam());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRam()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.ram, other.ram);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisk()).compareTo(other.isSetDisk());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisk()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.disk, other.disk);
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
    StringBuilder sb = new StringBuilder("InstanceTypeInfo(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetCpu()) {
      if (!first) sb.append(", ");
      sb.append("cpu:");
      sb.append(this.cpu);
      first = false;
    }
    if (isSetRam()) {
      if (!first) sb.append(", ");
      sb.append("ram:");
      sb.append(this.ram);
      first = false;
    }
    if (isSetDisk()) {
      if (!first) sb.append(", ");
      sb.append("disk:");
      sb.append(this.disk);
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InstanceTypeInfoStandardSchemeFactory implements SchemeFactory {
    public InstanceTypeInfoStandardScheme getScheme() {
      return new InstanceTypeInfoStandardScheme();
    }
  }

  private static class InstanceTypeInfoStandardScheme extends StandardScheme<InstanceTypeInfo> {

    public void read(libthrift091.protocol.TProtocol iprot, InstanceTypeInfo struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CPU
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.cpu = iprot.readI32();
              struct.setCpuIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RAM
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.ram = iprot.readI32();
              struct.setRamIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISK
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.disk = iprot.readI32();
              struct.setDiskIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, InstanceTypeInfo struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCpu()) {
        oprot.writeFieldBegin(CPU_FIELD_DESC);
        oprot.writeI32(struct.cpu);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRam()) {
        oprot.writeFieldBegin(RAM_FIELD_DESC);
        oprot.writeI32(struct.ram);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDisk()) {
        oprot.writeFieldBegin(DISK_FIELD_DESC);
        oprot.writeI32(struct.disk);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InstanceTypeInfoTupleSchemeFactory implements SchemeFactory {
    public InstanceTypeInfoTupleScheme getScheme() {
      return new InstanceTypeInfoTupleScheme();
    }
  }

  private static class InstanceTypeInfoTupleScheme extends TupleScheme<InstanceTypeInfo> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, InstanceTypeInfo struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetCpu()) {
        optionals.set(1);
      }
      if (struct.isSetRam()) {
        optionals.set(2);
      }
      if (struct.isSetDisk()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetCpu()) {
        oprot.writeI32(struct.cpu);
      }
      if (struct.isSetRam()) {
        oprot.writeI32(struct.ram);
      }
      if (struct.isSetDisk()) {
        oprot.writeI32(struct.disk);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, InstanceTypeInfo struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cpu = iprot.readI32();
        struct.setCpuIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ram = iprot.readI32();
        struct.setRamIsSet(true);
      }
      if (incoming.get(3)) {
        struct.disk = iprot.readI32();
        struct.setDiskIsSet(true);
      }
    }
  }

}

