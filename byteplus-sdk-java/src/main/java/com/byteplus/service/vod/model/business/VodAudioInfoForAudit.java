// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.VodAudioInfoForAudit}
 */
public final class VodAudioInfoForAudit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.VodAudioInfoForAudit)
    VodAudioInfoForAuditOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodAudioInfoForAudit.newBuilder() to construct.
  private VodAudioInfoForAudit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodAudioInfoForAudit() {
    storeUri_ = "";
    format_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodAudioInfoForAudit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodAudioInfoForAudit(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            storeUri_ = s;
            break;
          }
          case 17: {

            duration_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            format_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodAudioInfoForAudit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodAudioInfoForAudit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.VodAudioInfoForAudit.class, com.byteplus.service.vod.model.business.VodAudioInfoForAudit.Builder.class);
  }

  public static final int STOREURI_FIELD_NUMBER = 1;
  private volatile java.lang.Object storeUri_;
  /**
   * <pre>
   *审核音频存储的URI
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The storeUri.
   */
  @java.lang.Override
  public java.lang.String getStoreUri() {
    java.lang.Object ref = storeUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *审核音频存储的URI
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The bytes for storeUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreUriBytes() {
    java.lang.Object ref = storeUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private double duration_;
  /**
   * <pre>
   *音频时长(ms)
   * </pre>
   *
   * <code>double Duration = 2;</code>
   * @return The duration.
   */
  @java.lang.Override
  public double getDuration() {
    return duration_;
  }

  public static final int FORMAT_FIELD_NUMBER = 3;
  private volatile java.lang.Object format_;
  /**
   * <pre>
   *格式:wav
   * </pre>
   *
   * <code>string Format = 3;</code>
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *格式:wav
   * </pre>
   *
   * <code>string Format = 3;</code>
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storeUri_);
    }
    if (java.lang.Double.doubleToRawLongBits(duration_) != 0) {
      output.writeDouble(2, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, format_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, storeUri_);
    }
    if (java.lang.Double.doubleToRawLongBits(duration_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(format_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, format_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.VodAudioInfoForAudit)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.VodAudioInfoForAudit other = (com.byteplus.service.vod.model.business.VodAudioInfoForAudit) obj;

    if (!getStoreUri()
        .equals(other.getStoreUri())) return false;
    if (java.lang.Double.doubleToLongBits(getDuration())
        != java.lang.Double.doubleToLongBits(
            other.getDuration())) return false;
    if (!getFormat()
        .equals(other.getFormat())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STOREURI_FIELD_NUMBER;
    hash = (53 * hash) + getStoreUri().hashCode();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDuration()));
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.byteplus.service.vod.model.business.VodAudioInfoForAudit prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.VodAudioInfoForAudit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.VodAudioInfoForAudit)
      com.byteplus.service.vod.model.business.VodAudioInfoForAuditOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodAudioInfoForAudit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodAudioInfoForAudit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.VodAudioInfoForAudit.class, com.byteplus.service.vod.model.business.VodAudioInfoForAudit.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.VodAudioInfoForAudit.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      storeUri_ = "";

      duration_ = 0D;

      format_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodAudioInfoForAudit_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodAudioInfoForAudit getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.VodAudioInfoForAudit.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodAudioInfoForAudit build() {
      com.byteplus.service.vod.model.business.VodAudioInfoForAudit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodAudioInfoForAudit buildPartial() {
      com.byteplus.service.vod.model.business.VodAudioInfoForAudit result = new com.byteplus.service.vod.model.business.VodAudioInfoForAudit(this);
      result.storeUri_ = storeUri_;
      result.duration_ = duration_;
      result.format_ = format_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.byteplus.service.vod.model.business.VodAudioInfoForAudit) {
        return mergeFrom((com.byteplus.service.vod.model.business.VodAudioInfoForAudit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.VodAudioInfoForAudit other) {
      if (other == com.byteplus.service.vod.model.business.VodAudioInfoForAudit.getDefaultInstance()) return this;
      if (!other.getStoreUri().isEmpty()) {
        storeUri_ = other.storeUri_;
        onChanged();
      }
      if (other.getDuration() != 0D) {
        setDuration(other.getDuration());
      }
      if (!other.getFormat().isEmpty()) {
        format_ = other.format_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.byteplus.service.vod.model.business.VodAudioInfoForAudit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.VodAudioInfoForAudit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object storeUri_ = "";
    /**
     * <pre>
     *审核音频存储的URI
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @return The storeUri.
     */
    public java.lang.String getStoreUri() {
      java.lang.Object ref = storeUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *审核音频存储的URI
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @return The bytes for storeUri.
     */
    public com.google.protobuf.ByteString
        getStoreUriBytes() {
      java.lang.Object ref = storeUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *审核音频存储的URI
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @param value The storeUri to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      storeUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *审核音频存储的URI
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreUri() {
      
      storeUri_ = getDefaultInstance().getStoreUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *审核音频存储的URI
     * </pre>
     *
     * <code>string StoreUri = 1;</code>
     * @param value The bytes for storeUri to set.
     * @return This builder for chaining.
     */
    public Builder setStoreUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      storeUri_ = value;
      onChanged();
      return this;
    }

    private double duration_ ;
    /**
     * <pre>
     *音频时长(ms)
     * </pre>
     *
     * <code>double Duration = 2;</code>
     * @return The duration.
     */
    @java.lang.Override
    public double getDuration() {
      return duration_;
    }
    /**
     * <pre>
     *音频时长(ms)
     * </pre>
     *
     * <code>double Duration = 2;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(double value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *音频时长(ms)
     * </pre>
     *
     * <code>double Duration = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object format_ = "";
    /**
     * <pre>
     *格式:wav
     * </pre>
     *
     * <code>string Format = 3;</code>
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *格式:wav
     * </pre>
     *
     * <code>string Format = 3;</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *格式:wav
     * </pre>
     *
     * <code>string Format = 3;</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *格式:wav
     * </pre>
     *
     * <code>string Format = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      
      format_ = getDefaultInstance().getFormat();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *格式:wav
     * </pre>
     *
     * <code>string Format = 3;</code>
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      format_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.VodAudioInfoForAudit)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.VodAudioInfoForAudit)
  private static final com.byteplus.service.vod.model.business.VodAudioInfoForAudit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.VodAudioInfoForAudit();
  }

  public static com.byteplus.service.vod.model.business.VodAudioInfoForAudit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodAudioInfoForAudit>
      PARSER = new com.google.protobuf.AbstractParser<VodAudioInfoForAudit>() {
    @java.lang.Override
    public VodAudioInfoForAudit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodAudioInfoForAudit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodAudioInfoForAudit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodAudioInfoForAudit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.VodAudioInfoForAudit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

