// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodUpdateDomainPlayRuleRequestRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodUpdateDomainPlayRuleRequestRequest)
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
   * <pre>
   *默认域名
   * </pre>
   *
   * <code>string DefaultDomain = 2;</code>
   * @return The defaultDomain.
   */
  java.lang.String getDefaultDomain();
  /**
   * <pre>
   *默认域名
   * </pre>
   *
   * <code>string DefaultDomain = 2;</code>
   * @return The bytes for defaultDomain.
   */
  com.google.protobuf.ByteString
      getDefaultDomainBytes();

  /**
   * <pre>
   * 0 随机模式 1 默认域名模式
   * </pre>
   *
   * <code>int32 PlayRule = 3;</code>
   * @return The playRule.
   */
  int getPlayRule();
}