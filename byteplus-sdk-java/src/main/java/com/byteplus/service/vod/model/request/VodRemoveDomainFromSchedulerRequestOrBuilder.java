// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodRemoveDomainFromSchedulerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodRemoveDomainFromSchedulerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string DomainType = 2;</code>
   * @return The domainType.
   */
  java.lang.String getDomainType();
  /**
   * <code>string DomainType = 2;</code>
   * @return The bytes for domainType.
   */
  com.google.protobuf.ByteString
      getDomainTypeBytes();

  /**
   * <code>string Domain = 3;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <code>string Domain = 3;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 0未定义 1点播源站 2第三方源站
   * </pre>
   *
   * <code>int32 SourceStationType = 4;</code>
   * @return The sourceStationType.
   */
  int getSourceStationType();
}