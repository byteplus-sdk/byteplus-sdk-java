// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Business.VodPlaylistVideoInfo}
 */
public final class VodPlaylistVideoInfo extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Business.VodPlaylistVideoInfo)
        VodPlaylistVideoInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VodPlaylistVideoInfo.newBuilder() to construct.
  private VodPlaylistVideoInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodPlaylistVideoInfo() {
    vid_ = "";
    title_ = "";
    posterUrl_ = "";
    videoStatus_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
    return new VodPlaylistVideoInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodPlaylistVideoInfo(
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

            vid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 25: {

            duration_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            posterUrl_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            videoStatus_ = s;
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
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodPlaylistVideoInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodPlaylistVideoInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    com.byteplus.service.vod.model.business.VodPlaylistVideoInfo.class, com.byteplus.service.vod.model.business.VodPlaylistVideoInfo.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  @java.lang.Override
  public java.lang.String getVid() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vid_ = s;
      return s;
    }
  }
  /**
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getVidBytes() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      vid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string Title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string Title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  private double duration_;
  /**
   * <code>double Duration = 3;</code>
   * @return The duration.
   */
  @java.lang.Override
  public double getDuration() {
    return duration_;
  }

  public static final int POSTERURL_FIELD_NUMBER = 4;
  private volatile java.lang.Object posterUrl_;
  /**
   * <code>string PosterUrl = 4;</code>
   * @return The posterUrl.
   */
  @java.lang.Override
  public java.lang.String getPosterUrl() {
    java.lang.Object ref = posterUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      posterUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string PosterUrl = 4;</code>
   * @return The bytes for posterUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getPosterUrlBytes() {
    java.lang.Object ref = posterUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      posterUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIDEOSTATUS_FIELD_NUMBER = 5;
  private volatile java.lang.Object videoStatus_;
  /**
   * <pre>
   * 视频状态: Published, Unpublished, Deleted
   * </pre>
   *
   * <code>string VideoStatus = 5;</code>
   * @return The videoStatus.
   */
  @java.lang.Override
  public java.lang.String getVideoStatus() {
    java.lang.Object ref = videoStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      videoStatus_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 视频状态: Published, Unpublished, Deleted
   * </pre>
   *
   * <code>string VideoStatus = 5;</code>
   * @return The bytes for videoStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getVideoStatusBytes() {
    java.lang.Object ref = videoStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      videoStatus_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (java.lang.Double.doubleToRawLongBits(duration_) != 0) {
      output.writeDouble(3, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(posterUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, posterUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(videoStatus_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, videoStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (java.lang.Double.doubleToRawLongBits(duration_) != 0) {
      size += com.google.protobuf.CodedOutputStream
              .computeDoubleSize(3, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(posterUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, posterUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(videoStatus_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, videoStatus_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.business.VodPlaylistVideoInfo)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.business.VodPlaylistVideoInfo other = (com.byteplus.service.vod.model.business.VodPlaylistVideoInfo) obj;

    if (!getVid()
            .equals(other.getVid())) return false;
    if (!getTitle()
            .equals(other.getTitle())) return false;
    if (java.lang.Double.doubleToLongBits(getDuration())
            != java.lang.Double.doubleToLongBits(
            other.getDuration())) return false;
    if (!getPosterUrl()
            .equals(other.getPosterUrl())) return false;
    if (!getVideoStatus()
            .equals(other.getVideoStatus())) return false;
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
    hash = (37 * hash) + VID_FIELD_NUMBER;
    hash = (53 * hash) + getVid().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDuration()));
    hash = (37 * hash) + POSTERURL_FIELD_NUMBER;
    hash = (53 * hash) + getPosterUrl().hashCode();
    hash = (37 * hash) + VIDEOSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getVideoStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.business.VodPlaylistVideoInfo prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Business.VodPlaylistVideoInfo}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Business.VodPlaylistVideoInfo)
          com.byteplus.service.vod.model.business.VodPlaylistVideoInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodPlaylistVideoInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodPlaylistVideoInfo_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.byteplus.service.vod.model.business.VodPlaylistVideoInfo.class, com.byteplus.service.vod.model.business.VodPlaylistVideoInfo.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.business.VodPlaylistVideoInfo.newBuilder()
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
      vid_ = "";

      title_ = "";

      duration_ = 0D;

      posterUrl_ = "";

      videoStatus_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.byteplus.service.vod.model.business.VodMedia.internal_static_Byteplus_Vod_Models_Business_VodPlaylistVideoInfo_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodPlaylistVideoInfo getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.business.VodPlaylistVideoInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodPlaylistVideoInfo build() {
      com.byteplus.service.vod.model.business.VodPlaylistVideoInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.business.VodPlaylistVideoInfo buildPartial() {
      com.byteplus.service.vod.model.business.VodPlaylistVideoInfo result = new com.byteplus.service.vod.model.business.VodPlaylistVideoInfo(this);
      result.vid_ = vid_;
      result.title_ = title_;
      result.duration_ = duration_;
      result.posterUrl_ = posterUrl_;
      result.videoStatus_ = videoStatus_;
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
      if (other instanceof com.byteplus.service.vod.model.business.VodPlaylistVideoInfo) {
        return mergeFrom((com.byteplus.service.vod.model.business.VodPlaylistVideoInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.business.VodPlaylistVideoInfo other) {
      if (other == com.byteplus.service.vod.model.business.VodPlaylistVideoInfo.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (other.getDuration() != 0D) {
        setDuration(other.getDuration());
      }
      if (!other.getPosterUrl().isEmpty()) {
        posterUrl_ = other.posterUrl_;
        onChanged();
      }
      if (!other.getVideoStatus().isEmpty()) {
        videoStatus_ = other.videoStatus_;
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
      com.byteplus.service.vod.model.business.VodPlaylistVideoInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.business.VodPlaylistVideoInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vid_ = "";
    /**
     * <code>string Vid = 1;</code>
     * @return The vid.
     */
    public java.lang.String getVid() {
      java.lang.Object ref = vid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Vid = 1;</code>
     * @return The bytes for vid.
     */
    public com.google.protobuf.ByteString
    getVidBytes() {
      java.lang.Object ref = vid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        vid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Vid = 1;</code>
     * @param value The vid to set.
     * @return This builder for chaining.
     */
    public Builder setVid(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      vid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Vid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVid() {

      vid_ = getDefaultInstance().getVid();
      onChanged();
      return this;
    }
    /**
     * <code>string Vid = 1;</code>
     * @param value The bytes for vid to set.
     * @return This builder for chaining.
     */
    public Builder setVidBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      vid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string Title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
    getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {

      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string Title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      title_ = value;
      onChanged();
      return this;
    }

    private double duration_ ;
    /**
     * <code>double Duration = 3;</code>
     * @return The duration.
     */
    @java.lang.Override
    public double getDuration() {
      return duration_;
    }
    /**
     * <code>double Duration = 3;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(double value) {

      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double Duration = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {

      duration_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object posterUrl_ = "";
    /**
     * <code>string PosterUrl = 4;</code>
     * @return The posterUrl.
     */
    public java.lang.String getPosterUrl() {
      java.lang.Object ref = posterUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        posterUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PosterUrl = 4;</code>
     * @return The bytes for posterUrl.
     */
    public com.google.protobuf.ByteString
    getPosterUrlBytes() {
      java.lang.Object ref = posterUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        posterUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PosterUrl = 4;</code>
     * @param value The posterUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPosterUrl(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      posterUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PosterUrl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosterUrl() {

      posterUrl_ = getDefaultInstance().getPosterUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string PosterUrl = 4;</code>
     * @param value The bytes for posterUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPosterUrlBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      posterUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object videoStatus_ = "";
    /**
     * <pre>
     * 视频状态: Published, Unpublished, Deleted
     * </pre>
     *
     * <code>string VideoStatus = 5;</code>
     * @return The videoStatus.
     */
    public java.lang.String getVideoStatus() {
      java.lang.Object ref = videoStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        videoStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 视频状态: Published, Unpublished, Deleted
     * </pre>
     *
     * <code>string VideoStatus = 5;</code>
     * @return The bytes for videoStatus.
     */
    public com.google.protobuf.ByteString
    getVideoStatusBytes() {
      java.lang.Object ref = videoStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        videoStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 视频状态: Published, Unpublished, Deleted
     * </pre>
     *
     * <code>string VideoStatus = 5;</code>
     * @param value The videoStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVideoStatus(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      videoStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频状态: Published, Unpublished, Deleted
     * </pre>
     *
     * <code>string VideoStatus = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearVideoStatus() {

      videoStatus_ = getDefaultInstance().getVideoStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频状态: Published, Unpublished, Deleted
     * </pre>
     *
     * <code>string VideoStatus = 5;</code>
     * @param value The bytes for videoStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVideoStatusBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      videoStatus_ = value;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Business.VodPlaylistVideoInfo)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Business.VodPlaylistVideoInfo)
  private static final com.byteplus.service.vod.model.business.VodPlaylistVideoInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.business.VodPlaylistVideoInfo();
  }

  public static com.byteplus.service.vod.model.business.VodPlaylistVideoInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodPlaylistVideoInfo>
          PARSER = new com.google.protobuf.AbstractParser<VodPlaylistVideoInfo>() {
    @java.lang.Override
    public VodPlaylistVideoInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodPlaylistVideoInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodPlaylistVideoInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodPlaylistVideoInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.business.VodPlaylistVideoInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

