// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

/**
 * Protobuf type {@code Byteplus.Vod.Models.Request.VodStopDomainRequest}
 */
public final class VodStopDomainRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Byteplus.Vod.Models.Request.VodStopDomainRequest)
    VodStopDomainRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodStopDomainRequest.newBuilder() to construct.
  private VodStopDomainRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodStopDomainRequest() {
    spaceName_ = "";
    domainType_ = "";
    domain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodStopDomainRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodStopDomainRequest(
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

            spaceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            domainType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            domain_ = s;
            break;
          }
          case 32: {

            sourceStationType_ = input.readInt32();
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
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodStopDomainRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodStopDomainRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.byteplus.service.vod.model.request.VodStopDomainRequest.class, com.byteplus.service.vod.model.request.VodStopDomainRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  @java.lang.Override
  public java.lang.String getSpaceName() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOMAINTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object domainType_;
  /**
   * <code>string DomainType = 2;</code>
   * @return The domainType.
   */
  @java.lang.Override
  public java.lang.String getDomainType() {
    java.lang.Object ref = domainType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domainType_ = s;
      return s;
    }
  }
  /**
   * <code>string DomainType = 2;</code>
   * @return The bytes for domainType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainTypeBytes() {
    java.lang.Object ref = domainType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domainType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOMAIN_FIELD_NUMBER = 3;
  private volatile java.lang.Object domain_;
  /**
   * <code>string Domain = 3;</code>
   * @return The domain.
   */
  @java.lang.Override
  public java.lang.String getDomain() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domain_ = s;
      return s;
    }
  }
  /**
   * <code>string Domain = 3;</code>
   * @return The bytes for domain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainBytes() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCESTATIONTYPE_FIELD_NUMBER = 4;
  private int sourceStationType_;
  /**
   * <pre>
   * 0未定义 1点播源站 2第三方源站
   * </pre>
   *
   * <code>int32 SourceStationType = 4;</code>
   * @return The sourceStationType.
   */
  @java.lang.Override
  public int getSourceStationType() {
    return sourceStationType_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, domainType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, domain_);
    }
    if (sourceStationType_ != 0) {
      output.writeInt32(4, sourceStationType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, domainType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, domain_);
    }
    if (sourceStationType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, sourceStationType_);
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
    if (!(obj instanceof com.byteplus.service.vod.model.request.VodStopDomainRequest)) {
      return super.equals(obj);
    }
    com.byteplus.service.vod.model.request.VodStopDomainRequest other = (com.byteplus.service.vod.model.request.VodStopDomainRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getDomainType()
        .equals(other.getDomainType())) return false;
    if (!getDomain()
        .equals(other.getDomain())) return false;
    if (getSourceStationType()
        != other.getSourceStationType()) return false;
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
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (37 * hash) + DOMAINTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDomainType().hashCode();
    hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getDomain().hashCode();
    hash = (37 * hash) + SOURCESTATIONTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSourceStationType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.byteplus.service.vod.model.request.VodStopDomainRequest parseFrom(
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
  public static Builder newBuilder(com.byteplus.service.vod.model.request.VodStopDomainRequest prototype) {
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
   * Protobuf type {@code Byteplus.Vod.Models.Request.VodStopDomainRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Byteplus.Vod.Models.Request.VodStopDomainRequest)
      com.byteplus.service.vod.model.request.VodStopDomainRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodStopDomainRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodStopDomainRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.byteplus.service.vod.model.request.VodStopDomainRequest.class, com.byteplus.service.vod.model.request.VodStopDomainRequest.Builder.class);
    }

    // Construct using com.byteplus.service.vod.model.request.VodStopDomainRequest.newBuilder()
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
      spaceName_ = "";

      domainType_ = "";

      domain_ = "";

      sourceStationType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.byteplus.service.vod.model.request.VodRequest.internal_static_Byteplus_Vod_Models_Request_VodStopDomainRequest_descriptor;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodStopDomainRequest getDefaultInstanceForType() {
      return com.byteplus.service.vod.model.request.VodStopDomainRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodStopDomainRequest build() {
      com.byteplus.service.vod.model.request.VodStopDomainRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.byteplus.service.vod.model.request.VodStopDomainRequest buildPartial() {
      com.byteplus.service.vod.model.request.VodStopDomainRequest result = new com.byteplus.service.vod.model.request.VodStopDomainRequest(this);
      result.spaceName_ = spaceName_;
      result.domainType_ = domainType_;
      result.domain_ = domain_;
      result.sourceStationType_ = sourceStationType_;
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
      if (other instanceof com.byteplus.service.vod.model.request.VodStopDomainRequest) {
        return mergeFrom((com.byteplus.service.vod.model.request.VodStopDomainRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.byteplus.service.vod.model.request.VodStopDomainRequest other) {
      if (other == com.byteplus.service.vod.model.request.VodStopDomainRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getDomainType().isEmpty()) {
        domainType_ = other.domainType_;
        onChanged();
      }
      if (!other.getDomain().isEmpty()) {
        domain_ = other.domain_;
        onChanged();
      }
      if (other.getSourceStationType() != 0) {
        setSourceStationType(other.getSourceStationType());
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
      com.byteplus.service.vod.model.request.VodStopDomainRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.byteplus.service.vod.model.request.VodStopDomainRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <code>string SpaceName = 1;</code>
     * @return The spaceName.
     */
    public java.lang.String getSpaceName() {
      java.lang.Object ref = spaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      java.lang.Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @param value The bytes for spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object domainType_ = "";
    /**
     * <code>string DomainType = 2;</code>
     * @return The domainType.
     */
    public java.lang.String getDomainType() {
      java.lang.Object ref = domainType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domainType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string DomainType = 2;</code>
     * @return The bytes for domainType.
     */
    public com.google.protobuf.ByteString
        getDomainTypeBytes() {
      java.lang.Object ref = domainType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domainType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string DomainType = 2;</code>
     * @param value The domainType to set.
     * @return This builder for chaining.
     */
    public Builder setDomainType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domainType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string DomainType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomainType() {
      
      domainType_ = getDefaultInstance().getDomainType();
      onChanged();
      return this;
    }
    /**
     * <code>string DomainType = 2;</code>
     * @param value The bytes for domainType to set.
     * @return This builder for chaining.
     */
    public Builder setDomainTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domainType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object domain_ = "";
    /**
     * <code>string Domain = 3;</code>
     * @return The domain.
     */
    public java.lang.String getDomain() {
      java.lang.Object ref = domain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Domain = 3;</code>
     * @return The bytes for domain.
     */
    public com.google.protobuf.ByteString
        getDomainBytes() {
      java.lang.Object ref = domain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Domain = 3;</code>
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domain_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Domain = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      
      domain_ = getDefaultInstance().getDomain();
      onChanged();
      return this;
    }
    /**
     * <code>string Domain = 3;</code>
     * @param value The bytes for domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domain_ = value;
      onChanged();
      return this;
    }

    private int sourceStationType_ ;
    /**
     * <pre>
     * 0未定义 1点播源站 2第三方源站
     * </pre>
     *
     * <code>int32 SourceStationType = 4;</code>
     * @return The sourceStationType.
     */
    @java.lang.Override
    public int getSourceStationType() {
      return sourceStationType_;
    }
    /**
     * <pre>
     * 0未定义 1点播源站 2第三方源站
     * </pre>
     *
     * <code>int32 SourceStationType = 4;</code>
     * @param value The sourceStationType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceStationType(int value) {
      
      sourceStationType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 0未定义 1点播源站 2第三方源站
     * </pre>
     *
     * <code>int32 SourceStationType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceStationType() {
      
      sourceStationType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Byteplus.Vod.Models.Request.VodStopDomainRequest)
  }

  // @@protoc_insertion_point(class_scope:Byteplus.Vod.Models.Request.VodStopDomainRequest)
  private static final com.byteplus.service.vod.model.request.VodStopDomainRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.byteplus.service.vod.model.request.VodStopDomainRequest();
  }

  public static com.byteplus.service.vod.model.request.VodStopDomainRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodStopDomainRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodStopDomainRequest>() {
    @java.lang.Override
    public VodStopDomainRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodStopDomainRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodStopDomainRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodStopDomainRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.byteplus.service.vod.model.request.VodStopDomainRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

