// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodGetPlaylistsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodGetPlaylistsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 以,分隔
   * </pre>
   *
   * <code>string Ids = 1;</code>
   * @return The ids.
   */
  java.lang.String getIds();
  /**
   * <pre>
   * 以,分隔
   * </pre>
   *
   * <code>string Ids = 1;</code>
   * @return The bytes for ids.
   */
  com.google.protobuf.ByteString
      getIdsBytes();

  /**
   * <code>uint32 Limit = 2;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <code>uint32 Offset = 3;</code>
   * @return The offset.
   */
  int getOffset();
}
