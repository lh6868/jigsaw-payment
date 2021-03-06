// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: taglib.proto

package org.jigsaw.payment.model;

/**
 * <pre>
 **
 * 数据表字段option相关的设置
 * </pre>
 *
 * Protobuf type {@code ColumnFieldOption}
 */
public  final class ColumnFieldOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ColumnFieldOption)
    ColumnFieldOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ColumnFieldOption.newBuilder() to construct.
  private ColumnFieldOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ColumnFieldOption() {
    columnName_ = "";
    columnType_ = 1;
    needEncryptedStore_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ColumnFieldOption(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            columnName_ = bs;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            org.jigsaw.payment.model.ColumnType value = org.jigsaw.payment.model.ColumnType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              columnType_ = rawValue;
            }
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            needEncryptedStore_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.jigsaw.payment.model.Taglib.internal_static_ColumnFieldOption_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jigsaw.payment.model.Taglib.internal_static_ColumnFieldOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jigsaw.payment.model.ColumnFieldOption.class, org.jigsaw.payment.model.ColumnFieldOption.Builder.class);
  }

  private int bitField0_;
  public static final int COLUMN_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object columnName_;
  /**
   * <pre>
   *标识字段在数据表中的列，默认使用field name 作为列名
   * </pre>
   *
   * <code>optional string column_name = 1;</code>
   */
  public boolean hasColumnName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   *标识字段在数据表中的列，默认使用field name 作为列名
   * </pre>
   *
   * <code>optional string column_name = 1;</code>
   */
  public java.lang.String getColumnName() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        columnName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *标识字段在数据表中的列，默认使用field name 作为列名
   * </pre>
   *
   * <code>optional string column_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getColumnNameBytes() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      columnName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMN_TYPE_FIELD_NUMBER = 2;
  private int columnType_;
  /**
   * <pre>
   *标识字段数据库类型，默认使用field类型作为列类型。
   * </pre>
   *
   * <code>optional .ColumnType column_type = 2;</code>
   */
  public boolean hasColumnType() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   *标识字段数据库类型，默认使用field类型作为列类型。
   * </pre>
   *
   * <code>optional .ColumnType column_type = 2;</code>
   */
  public org.jigsaw.payment.model.ColumnType getColumnType() {
    org.jigsaw.payment.model.ColumnType result = org.jigsaw.payment.model.ColumnType.valueOf(columnType_);
    return result == null ? org.jigsaw.payment.model.ColumnType.VARCHAR : result;
  }

  public static final int NEED_ENCRYPTED_STORE_FIELD_NUMBER = 3;
  private boolean needEncryptedStore_;
  /**
   * <pre>
   *是否需要加密
   * </pre>
   *
   * <code>optional bool need_encrypted_store = 3;</code>
   */
  public boolean hasNeedEncryptedStore() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   *是否需要加密
   * </pre>
   *
   * <code>optional bool need_encrypted_store = 3;</code>
   */
  public boolean getNeedEncryptedStore() {
    return needEncryptedStore_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, columnName_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeEnum(2, columnType_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, needEncryptedStore_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, columnName_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, columnType_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, needEncryptedStore_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.jigsaw.payment.model.ColumnFieldOption)) {
      return super.equals(obj);
    }
    org.jigsaw.payment.model.ColumnFieldOption other = (org.jigsaw.payment.model.ColumnFieldOption) obj;

    boolean result = true;
    result = result && (hasColumnName() == other.hasColumnName());
    if (hasColumnName()) {
      result = result && getColumnName()
          .equals(other.getColumnName());
    }
    result = result && (hasColumnType() == other.hasColumnType());
    if (hasColumnType()) {
      result = result && columnType_ == other.columnType_;
    }
    result = result && (hasNeedEncryptedStore() == other.hasNeedEncryptedStore());
    if (hasNeedEncryptedStore()) {
      result = result && (getNeedEncryptedStore()
          == other.getNeedEncryptedStore());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasColumnName()) {
      hash = (37 * hash) + COLUMN_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getColumnName().hashCode();
    }
    if (hasColumnType()) {
      hash = (37 * hash) + COLUMN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + columnType_;
    }
    if (hasNeedEncryptedStore()) {
      hash = (37 * hash) + NEED_ENCRYPTED_STORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNeedEncryptedStore());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jigsaw.payment.model.ColumnFieldOption parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.jigsaw.payment.model.ColumnFieldOption prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * 数据表字段option相关的设置
   * </pre>
   *
   * Protobuf type {@code ColumnFieldOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ColumnFieldOption)
      org.jigsaw.payment.model.ColumnFieldOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jigsaw.payment.model.Taglib.internal_static_ColumnFieldOption_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jigsaw.payment.model.Taglib.internal_static_ColumnFieldOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jigsaw.payment.model.ColumnFieldOption.class, org.jigsaw.payment.model.ColumnFieldOption.Builder.class);
    }

    // Construct using org.jigsaw.payment.model.ColumnFieldOption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      columnName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      columnType_ = 1;
      bitField0_ = (bitField0_ & ~0x00000002);
      needEncryptedStore_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jigsaw.payment.model.Taglib.internal_static_ColumnFieldOption_descriptor;
    }

    public org.jigsaw.payment.model.ColumnFieldOption getDefaultInstanceForType() {
      return org.jigsaw.payment.model.ColumnFieldOption.getDefaultInstance();
    }

    public org.jigsaw.payment.model.ColumnFieldOption build() {
      org.jigsaw.payment.model.ColumnFieldOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jigsaw.payment.model.ColumnFieldOption buildPartial() {
      org.jigsaw.payment.model.ColumnFieldOption result = new org.jigsaw.payment.model.ColumnFieldOption(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.columnName_ = columnName_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.columnType_ = columnType_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.needEncryptedStore_ = needEncryptedStore_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.jigsaw.payment.model.ColumnFieldOption) {
        return mergeFrom((org.jigsaw.payment.model.ColumnFieldOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jigsaw.payment.model.ColumnFieldOption other) {
      if (other == org.jigsaw.payment.model.ColumnFieldOption.getDefaultInstance()) return this;
      if (other.hasColumnName()) {
        bitField0_ |= 0x00000001;
        columnName_ = other.columnName_;
        onChanged();
      }
      if (other.hasColumnType()) {
        setColumnType(other.getColumnType());
      }
      if (other.hasNeedEncryptedStore()) {
        setNeedEncryptedStore(other.getNeedEncryptedStore());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jigsaw.payment.model.ColumnFieldOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jigsaw.payment.model.ColumnFieldOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object columnName_ = "";
    /**
     * <pre>
     *标识字段在数据表中的列，默认使用field name 作为列名
     * </pre>
     *
     * <code>optional string column_name = 1;</code>
     */
    public boolean hasColumnName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *标识字段在数据表中的列，默认使用field name 作为列名
     * </pre>
     *
     * <code>optional string column_name = 1;</code>
     */
    public java.lang.String getColumnName() {
      java.lang.Object ref = columnName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          columnName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *标识字段在数据表中的列，默认使用field name 作为列名
     * </pre>
     *
     * <code>optional string column_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getColumnNameBytes() {
      java.lang.Object ref = columnName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        columnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *标识字段在数据表中的列，默认使用field name 作为列名
     * </pre>
     *
     * <code>optional string column_name = 1;</code>
     */
    public Builder setColumnName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      columnName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识字段在数据表中的列，默认使用field name 作为列名
     * </pre>
     *
     * <code>optional string column_name = 1;</code>
     */
    public Builder clearColumnName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      columnName_ = getDefaultInstance().getColumnName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识字段在数据表中的列，默认使用field name 作为列名
     * </pre>
     *
     * <code>optional string column_name = 1;</code>
     */
    public Builder setColumnNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      columnName_ = value;
      onChanged();
      return this;
    }

    private int columnType_ = 1;
    /**
     * <pre>
     *标识字段数据库类型，默认使用field类型作为列类型。
     * </pre>
     *
     * <code>optional .ColumnType column_type = 2;</code>
     */
    public boolean hasColumnType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *标识字段数据库类型，默认使用field类型作为列类型。
     * </pre>
     *
     * <code>optional .ColumnType column_type = 2;</code>
     */
    public org.jigsaw.payment.model.ColumnType getColumnType() {
      org.jigsaw.payment.model.ColumnType result = org.jigsaw.payment.model.ColumnType.valueOf(columnType_);
      return result == null ? org.jigsaw.payment.model.ColumnType.VARCHAR : result;
    }
    /**
     * <pre>
     *标识字段数据库类型，默认使用field类型作为列类型。
     * </pre>
     *
     * <code>optional .ColumnType column_type = 2;</code>
     */
    public Builder setColumnType(org.jigsaw.payment.model.ColumnType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      columnType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识字段数据库类型，默认使用field类型作为列类型。
     * </pre>
     *
     * <code>optional .ColumnType column_type = 2;</code>
     */
    public Builder clearColumnType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      columnType_ = 1;
      onChanged();
      return this;
    }

    private boolean needEncryptedStore_ ;
    /**
     * <pre>
     *是否需要加密
     * </pre>
     *
     * <code>optional bool need_encrypted_store = 3;</code>
     */
    public boolean hasNeedEncryptedStore() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     *是否需要加密
     * </pre>
     *
     * <code>optional bool need_encrypted_store = 3;</code>
     */
    public boolean getNeedEncryptedStore() {
      return needEncryptedStore_;
    }
    /**
     * <pre>
     *是否需要加密
     * </pre>
     *
     * <code>optional bool need_encrypted_store = 3;</code>
     */
    public Builder setNeedEncryptedStore(boolean value) {
      bitField0_ |= 0x00000004;
      needEncryptedStore_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *是否需要加密
     * </pre>
     *
     * <code>optional bool need_encrypted_store = 3;</code>
     */
    public Builder clearNeedEncryptedStore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      needEncryptedStore_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ColumnFieldOption)
  }

  // @@protoc_insertion_point(class_scope:ColumnFieldOption)
  private static final org.jigsaw.payment.model.ColumnFieldOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jigsaw.payment.model.ColumnFieldOption();
  }

  public static org.jigsaw.payment.model.ColumnFieldOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ColumnFieldOption>
      PARSER = new com.google.protobuf.AbstractParser<ColumnFieldOption>() {
    public ColumnFieldOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ColumnFieldOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ColumnFieldOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ColumnFieldOption> getParserForType() {
    return PARSER;
  }

  public org.jigsaw.payment.model.ColumnFieldOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

