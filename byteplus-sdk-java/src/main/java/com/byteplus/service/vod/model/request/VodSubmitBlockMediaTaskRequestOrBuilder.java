// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodSubmitBlockMediaTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodSubmitBlockMediaTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   *空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * Vid列表，以,隔开
   * </pre>
   *
   * <code>string Vids = 2;</code>
   * @return The vids.
   */
  java.lang.String getVids();
  /**
   * <pre>
   * Vid列表，以,隔开
   * </pre>
   *
   * <code>string Vids = 2;</code>
   * @return The bytes for vids.
   */
  com.google.protobuf.ByteString
      getVidsBytes();
}
