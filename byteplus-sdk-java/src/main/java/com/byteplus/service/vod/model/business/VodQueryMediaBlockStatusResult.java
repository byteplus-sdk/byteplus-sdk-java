// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult}
 */
public final class VodQueryMediaBlockStatusResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult)
    VodQueryMediaBlockStatusResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodQueryMediaBlockStatusResult.newBuilder() to construct.
  private VodQueryMediaBlockStatusResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodQueryMediaBlockStatusResult() {
    notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    mediaBlockStatuses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodQueryMediaBlockStatusResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodQueryMediaBlockStatusResult(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              notExistVids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            notExistVids_.add(s);
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              mediaBlockStatuses_ = new java.util.ArrayList<com.byteplus.service.vod.model.business.MediaBlockStatus>();
              mutable_bitField0_ |= 0x00000002;
            }
            mediaBlockStatuses_.add(
                input.readMessage(com.byteplus.service.vod.model.business.MediaBlockStatus.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        notExistVids_ = notExistVids_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        mediaBlockStatuses_ = java.util.Collections.unmodifiableList(mediaBlockStatuses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodQueryMediaBlockStatusResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodQueryMediaBlockStatusResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult.class, com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult.Builder.class);
  }

  public static final int NOTEXISTVIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList notExistVids_;
  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return A list containing the notExistVids.
   */
  public com.google.protobuf.ProtocolStringList
      getNotExistVidsList() {
    return notExistVids_;
  }
  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return The count of notExistVids.
   */
  public int getNotExistVidsCount() {
    return notExistVids_.size();
  }
  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the element to return.
   * @return The notExistVids at the given index.
   */
  public java.lang.String getNotExistVids(int index) {
    return notExistVids_.get(index);
  }
  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistVids at the given index.
   */
  public com.google.protobuf.ByteString
      getNotExistVidsBytes(int index) {
    return notExistVids_.getByteString(index);
  }

  public static final int MEDIABLOCKSTATUSES_FIELD_NUMBER = 2;
  private java.util.List<com.byteplus.service.vod.model.business.MediaBlockStatus> mediaBlockStatuses_;
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.byteplus.service.vod.model.business.MediaBlockStatus> getMediaBlockStatusesList() {
    return mediaBlockStatuses_;
  }
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder> 
      getMediaBlockStatusesOrBuilderList() {
    return mediaBlockStatuses_;
  }
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  @java.lang.Override
  public int getMediaBlockStatusesCount() {
    return mediaBlockStatuses_.size();
  }
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.MediaBlockStatus getMediaBlockStatuses(int index) {
    return mediaBlockStatuses_.get(index);
  }
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder getMediaBlockStatusesOrBuilder(
      int index) {
    return mediaBlockStatuses_.get(index);
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
    for (int i = 0; i < notExistVids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notExistVids_.getRaw(i));
    }
    for (int i = 0; i < mediaBlockStatuses_.size(); i++) {
      output.writeMessage(2, mediaBlockStatuses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < notExistVids_.size(); i++) {
        dataSize += computeStringSizeNoTag(notExistVids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotExistVidsList().size();
    }
    for (int i = 0; i < mediaBlockStatuses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, mediaBlockStatuses_.get(i));
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult other = (com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult) obj;

    if (!getNotExistVidsList()
        .equals(other.getNotExistVidsList())) return false;
    if (!getMediaBlockStatusesList()
        .equals(other.getMediaBlockStatusesList())) return false;
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
    if (getNotExistVidsCount() > 0) {
      hash = (37 * hash) + NOTEXISTVIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotExistVidsList().hashCode();
    }
    if (getMediaBlockStatusesCount() > 0) {
      hash = (37 * hash) + MEDIABLOCKSTATUSES_FIELD_NUMBER;
      hash = (53 * hash) + getMediaBlockStatusesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult)
      com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodQueryMediaBlockStatusResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodQueryMediaBlockStatusResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult.class, com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult.newBuilder()
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
        getMediaBlockStatusesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (mediaBlockStatusesBuilder_ == null) {
        mediaBlockStatuses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        mediaBlockStatusesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodQueryMediaBlockStatusResult_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult build() {
      com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult buildPartial() {
      com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult result = new com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        notExistVids_ = notExistVids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.notExistVids_ = notExistVids_;
      if (mediaBlockStatusesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          mediaBlockStatuses_ = java.util.Collections.unmodifiableList(mediaBlockStatuses_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.mediaBlockStatuses_ = mediaBlockStatuses_;
      } else {
        result.mediaBlockStatuses_ = mediaBlockStatusesBuilder_.build();
      }
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
      if (other instanceof com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult) {
        return mergeFrom((com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult other) {
      if (other == com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult.getDefaultInstance()) return this;
      if (!other.notExistVids_.isEmpty()) {
        if (notExistVids_.isEmpty()) {
          notExistVids_ = other.notExistVids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNotExistVidsIsMutable();
          notExistVids_.addAll(other.notExistVids_);
        }
        onChanged();
      }
      if (mediaBlockStatusesBuilder_ == null) {
        if (!other.mediaBlockStatuses_.isEmpty()) {
          if (mediaBlockStatuses_.isEmpty()) {
            mediaBlockStatuses_ = other.mediaBlockStatuses_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMediaBlockStatusesIsMutable();
            mediaBlockStatuses_.addAll(other.mediaBlockStatuses_);
          }
          onChanged();
        }
      } else {
        if (!other.mediaBlockStatuses_.isEmpty()) {
          if (mediaBlockStatusesBuilder_.isEmpty()) {
            mediaBlockStatusesBuilder_.dispose();
            mediaBlockStatusesBuilder_ = null;
            mediaBlockStatuses_ = other.mediaBlockStatuses_;
            bitField0_ = (bitField0_ & ~0x00000002);
            mediaBlockStatusesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMediaBlockStatusesFieldBuilder() : null;
          } else {
            mediaBlockStatusesBuilder_.addAllMessages(other.mediaBlockStatuses_);
          }
        }
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
      com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotExistVidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notExistVids_ = new com.google.protobuf.LazyStringArrayList(notExistVids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @return A list containing the notExistVids.
     */
    public com.google.protobuf.ProtocolStringList
        getNotExistVidsList() {
      return notExistVids_.getUnmodifiableView();
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @return The count of notExistVids.
     */
    public int getNotExistVidsCount() {
      return notExistVids_.size();
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param index The index of the element to return.
     * @return The notExistVids at the given index.
     */
    public java.lang.String getNotExistVids(int index) {
      return notExistVids_.get(index);
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notExistVids at the given index.
     */
    public com.google.protobuf.ByteString
        getNotExistVidsBytes(int index) {
      return notExistVids_.getByteString(index);
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param index The index to set the value at.
     * @param value The notExistVids to set.
     * @return This builder for chaining.
     */
    public Builder setNotExistVids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistVidsIsMutable();
      notExistVids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param value The notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistVids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistVidsIsMutable();
      notExistVids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param values The notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotExistVids(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotExistVidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notExistVids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotExistVids() {
      notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 不存在的Vid列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 1;</code>
     * @param value The bytes of the notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistVidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotExistVidsIsMutable();
      notExistVids_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<com.byteplus.service.vod.model.business.MediaBlockStatus> mediaBlockStatuses_ =
      java.util.Collections.emptyList();
    private void ensureMediaBlockStatusesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        mediaBlockStatuses_ = new java.util.ArrayList<com.byteplus.service.vod.model.business.MediaBlockStatus>(mediaBlockStatuses_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.byteplus.service.vod.model.business.MediaBlockStatus, com.byteplus.service.vod.model.business.MediaBlockStatus.Builder, com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder> mediaBlockStatusesBuilder_;

    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public java.util.List<com.byteplus.service.vod.model.business.MediaBlockStatus> getMediaBlockStatusesList() {
      if (mediaBlockStatusesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mediaBlockStatuses_);
      } else {
        return mediaBlockStatusesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public int getMediaBlockStatusesCount() {
      if (mediaBlockStatusesBuilder_ == null) {
        return mediaBlockStatuses_.size();
      } else {
        return mediaBlockStatusesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public com.byteplus.service.vod.model.business.MediaBlockStatus getMediaBlockStatuses(int index) {
      if (mediaBlockStatusesBuilder_ == null) {
        return mediaBlockStatuses_.get(index);
      } else {
        return mediaBlockStatusesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder setMediaBlockStatuses(
        int index, com.byteplus.service.vod.model.business.MediaBlockStatus value) {
      if (mediaBlockStatusesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaBlockStatusesIsMutable();
        mediaBlockStatuses_.set(index, value);
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder setMediaBlockStatuses(
        int index, com.byteplus.service.vod.model.business.MediaBlockStatus.Builder builderForValue) {
      if (mediaBlockStatusesBuilder_ == null) {
        ensureMediaBlockStatusesIsMutable();
        mediaBlockStatuses_.set(index, builderForValue.build());
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder addMediaBlockStatuses(com.byteplus.service.vod.model.business.MediaBlockStatus value) {
      if (mediaBlockStatusesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaBlockStatusesIsMutable();
        mediaBlockStatuses_.add(value);
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder addMediaBlockStatuses(
        int index, com.byteplus.service.vod.model.business.MediaBlockStatus value) {
      if (mediaBlockStatusesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaBlockStatusesIsMutable();
        mediaBlockStatuses_.add(index, value);
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder addMediaBlockStatuses(
        com.byteplus.service.vod.model.business.MediaBlockStatus.Builder builderForValue) {
      if (mediaBlockStatusesBuilder_ == null) {
        ensureMediaBlockStatusesIsMutable();
        mediaBlockStatuses_.add(builderForValue.build());
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder addMediaBlockStatuses(
        int index, com.byteplus.service.vod.model.business.MediaBlockStatus.Builder builderForValue) {
      if (mediaBlockStatusesBuilder_ == null) {
        ensureMediaBlockStatusesIsMutable();
        mediaBlockStatuses_.add(index, builderForValue.build());
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder addAllMediaBlockStatuses(
        java.lang.Iterable<? extends com.byteplus.service.vod.model.business.MediaBlockStatus> values) {
      if (mediaBlockStatusesBuilder_ == null) {
        ensureMediaBlockStatusesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mediaBlockStatuses_);
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder clearMediaBlockStatuses() {
      if (mediaBlockStatusesBuilder_ == null) {
        mediaBlockStatuses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public Builder removeMediaBlockStatuses(int index) {
      if (mediaBlockStatusesBuilder_ == null) {
        ensureMediaBlockStatusesIsMutable();
        mediaBlockStatuses_.remove(index);
        onChanged();
      } else {
        mediaBlockStatusesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public com.byteplus.service.vod.model.business.MediaBlockStatus.Builder getMediaBlockStatusesBuilder(
        int index) {
      return getMediaBlockStatusesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder getMediaBlockStatusesOrBuilder(
        int index) {
      if (mediaBlockStatusesBuilder_ == null) {
        return mediaBlockStatuses_.get(index);  } else {
        return mediaBlockStatusesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public java.util.List<? extends com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder> 
         getMediaBlockStatusesOrBuilderList() {
      if (mediaBlockStatusesBuilder_ != null) {
        return mediaBlockStatusesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mediaBlockStatuses_);
      }
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public com.byteplus.service.vod.model.business.MediaBlockStatus.Builder addMediaBlockStatusesBuilder() {
      return getMediaBlockStatusesFieldBuilder().addBuilder(
          com.byteplus.service.vod.model.business.MediaBlockStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public com.byteplus.service.vod.model.business.MediaBlockStatus.Builder addMediaBlockStatusesBuilder(
        int index) {
      return getMediaBlockStatusesFieldBuilder().addBuilder(
          index, com.byteplus.service.vod.model.business.MediaBlockStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * 已封禁的Vid列表
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
     */
    public java.util.List<com.byteplus.service.vod.model.business.MediaBlockStatus.Builder> 
         getMediaBlockStatusesBuilderList() {
      return getMediaBlockStatusesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.byteplus.service.vod.model.business.MediaBlockStatus, com.byteplus.service.vod.model.business.MediaBlockStatus.Builder, com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder> 
        getMediaBlockStatusesFieldBuilder() {
      if (mediaBlockStatusesBuilder_ == null) {
        mediaBlockStatusesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.byteplus.service.vod.model.business.MediaBlockStatus, com.byteplus.service.vod.model.business.MediaBlockStatus.Builder, com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder>(
                mediaBlockStatuses_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        mediaBlockStatuses_ = null;
      }
      return mediaBlockStatusesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult)
  private static final com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult();
  }

  public static com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodQueryMediaBlockStatusResult>
      PARSER = new com.google.protobuf.AbstractParser<VodQueryMediaBlockStatusResult>() {
    @java.lang.Override
    public VodQueryMediaBlockStatusResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodQueryMediaBlockStatusResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodQueryMediaBlockStatusResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodQueryMediaBlockStatusResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.VodQueryMediaBlockStatusResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

