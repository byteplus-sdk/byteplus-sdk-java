// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.VodGetContentBlockTasksResult}
 */
public final class VodGetContentBlockTasksResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.VodGetContentBlockTasksResult)
    VodGetContentBlockTasksResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetContentBlockTasksResult.newBuilder() to construct.
  private VodGetContentBlockTasksResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetContentBlockTasksResult() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetContentBlockTasksResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetContentBlockTasksResult(
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
          case 8: {

            total_ = input.readInt64();
            break;
          }
          case 16: {

            pageNum_ = input.readInt64();
            break;
          }
          case 24: {

            pageSize_ = input.readInt64();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ = new java.util.ArrayList<com.byteplus.service.vod.model.business.ContentTask>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.byteplus.service.vod.model.business.ContentTask.parser(), extensionRegistry));
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
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_VodGetContentBlockTasksResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_VodGetContentBlockTasksResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult.class, com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult.Builder.class);
  }

  public static final int TOTAL_FIELD_NUMBER = 1;
  private long total_;
  /**
   * <pre>
   *代表符合查询条件的任务总数。
   * </pre>
   *
   * <code>int64 Total = 1;</code>
   * @return The total.
   */
  @java.lang.Override
  public long getTotal() {
    return total_;
  }

  public static final int PAGENUM_FIELD_NUMBER = 2;
  private long pageNum_;
  /**
   * <pre>
   *代表当前页码。 该值与请求正文中的 PageNum 值相同。
   * </pre>
   *
   * <code>int64 PageNum = 2;</code>
   * @return The pageNum.
   */
  @java.lang.Override
  public long getPageNum() {
    return pageNum_;
  }

  public static final int PAGESIZE_FIELD_NUMBER = 3;
  private long pageSize_;
  /**
   * <pre>
   *代表每页的任务数量。
   * </pre>
   *
   * <code>int64 PageSize = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private java.util.List<com.byteplus.service.vod.model.business.ContentTask> data_;
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.byteplus.service.vod.model.business.ContentTask> getDataList() {
    return data_;
  }
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.byteplus.service.vod.model.business.ContentTaskOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.ContentTask getData(int index) {
    return data_.get(index);
  }
  /**
   * <pre>
   *符合条件的任务结构体
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
   */
  @java.lang.Override
  public com.byteplus.service.vod.model.business.ContentTaskOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    if (total_ != 0L) {
      output.writeInt64(1, total_);
    }
    if (pageNum_ != 0L) {
      output.writeInt64(2, pageNum_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(3, pageSize_);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(4, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (total_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, total_);
    }
    if (pageNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pageNum_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, pageSize_);
    }
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, data_.get(i));
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult other = (com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult) obj;

    if (getTotal()
        != other.getTotal()) return false;
    if (getPageNum()
        != other.getPageNum()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getDataList()
        .equals(other.getDataList())) return false;
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
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotal());
    hash = (37 * hash) + PAGENUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageNum());
    hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.VodGetContentBlockTasksResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.VodGetContentBlockTasksResult)
      com.byteplus.service.vod.model.business.VodGetContentBlockTasksResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_VodGetContentBlockTasksResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_VodGetContentBlockTasksResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult.class, com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      total_ = 0L;

      pageNum_ = 0L;

      pageSize_ = 0L;

      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodCdn.internal_static_Byteplus_Vod_Models_Business_VodGetContentBlockTasksResult_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult build() {
      com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult buildPartial() {
      com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult result = new com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult(this);
      int from_bitField0_ = bitField0_;
      result.total_ = total_;
      result.pageNum_ = pageNum_;
      result.pageSize_ = pageSize_;
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult) {
        return mergeFrom((com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult other) {
      if (other == com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult.getDefaultInstance()) return this;
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
      }
      if (other.getPageNum() != 0L) {
        setPageNum(other.getPageNum());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
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
      com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long total_ ;
    /**
     * <pre>
     *代表符合查询条件的任务总数。
     * </pre>
     *
     * <code>int64 Total = 1;</code>
     * @return The total.
     */
    @java.lang.Override
    public long getTotal() {
      return total_;
    }
    /**
     * <pre>
     *代表符合查询条件的任务总数。
     * </pre>
     *
     * <code>int64 Total = 1;</code>
     * @param value The total to set.
     * @return This builder for chaining.
     */
    public Builder setTotal(long value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *代表符合查询条件的任务总数。
     * </pre>
     *
     * <code>int64 Total = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotal() {
      
      total_ = 0L;
      onChanged();
      return this;
    }

    private long pageNum_ ;
    /**
     * <pre>
     *代表当前页码。 该值与请求正文中的 PageNum 值相同。
     * </pre>
     *
     * <code>int64 PageNum = 2;</code>
     * @return The pageNum.
     */
    @java.lang.Override
    public long getPageNum() {
      return pageNum_;
    }
    /**
     * <pre>
     *代表当前页码。 该值与请求正文中的 PageNum 值相同。
     * </pre>
     *
     * <code>int64 PageNum = 2;</code>
     * @param value The pageNum to set.
     * @return This builder for chaining.
     */
    public Builder setPageNum(long value) {
      
      pageNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *代表当前页码。 该值与请求正文中的 PageNum 值相同。
     * </pre>
     *
     * <code>int64 PageNum = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNum() {
      
      pageNum_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <pre>
     *代表每页的任务数量。
     * </pre>
     *
     * <code>int64 PageSize = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     *代表每页的任务数量。
     * </pre>
     *
     * <code>int64 PageSize = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *代表每页的任务数量。
     * </pre>
     *
     * <code>int64 PageSize = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.byteplus.service.vod.model.business.ContentTask> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.byteplus.service.vod.model.business.ContentTask>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.byteplus.service.vod.model.business.ContentTask, com.byteplus.service.vod.model.business.ContentTask.Builder, com.byteplus.service.vod.model.business.ContentTaskOrBuilder> dataBuilder_;

    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public java.util.List<com.byteplus.service.vod.model.business.ContentTask> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public com.byteplus.service.vod.model.business.ContentTask getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder setData(
        int index, com.byteplus.service.vod.model.business.ContentTask value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder setData(
        int index, com.byteplus.service.vod.model.business.ContentTask.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder addData(com.byteplus.service.vod.model.business.ContentTask value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder addData(
        int index, com.byteplus.service.vod.model.business.ContentTask value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder addData(
        com.byteplus.service.vod.model.business.ContentTask.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder addData(
        int index, com.byteplus.service.vod.model.business.ContentTask.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.byteplus.service.vod.model.business.ContentTask> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public com.byteplus.service.vod.model.business.ContentTask.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public com.byteplus.service.vod.model.business.ContentTaskOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public java.util.List<? extends com.byteplus.service.vod.model.business.ContentTaskOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public com.byteplus.service.vod.model.business.ContentTask.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.byteplus.service.vod.model.business.ContentTask.getDefaultInstance());
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public com.byteplus.service.vod.model.business.ContentTask.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.byteplus.service.vod.model.business.ContentTask.getDefaultInstance());
    }
    /**
     * <pre>
     *符合条件的任务结构体
     * </pre>
     *
     * <code>repeated .Byteplus.Vod.Models.Business.ContentTask Data = 4;</code>
     */
    public java.util.List<com.byteplus.service.vod.model.business.ContentTask.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.byteplus.service.vod.model.business.ContentTask, com.byteplus.service.vod.model.business.ContentTask.Builder, com.byteplus.service.vod.model.business.ContentTaskOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.byteplus.service.vod.model.business.ContentTask, com.byteplus.service.vod.model.business.ContentTask.Builder, com.byteplus.service.vod.model.business.ContentTaskOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.VodGetContentBlockTasksResult)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.VodGetContentBlockTasksResult)
  private static final com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult();
  }

  public static com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetContentBlockTasksResult>
      PARSER = new com.google.protobuf.AbstractParser<VodGetContentBlockTasksResult>() {
    @java.lang.Override
    public VodGetContentBlockTasksResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetContentBlockTasksResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetContentBlockTasksResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetContentBlockTasksResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.VodGetContentBlockTasksResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
