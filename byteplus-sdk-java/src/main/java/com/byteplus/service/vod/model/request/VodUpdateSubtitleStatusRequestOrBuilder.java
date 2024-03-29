// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodUpdateSubtitleStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodUpdateSubtitleStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *转码视频id列表，多个用","隔开
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The fileIds.
   */
  java.lang.String getFileIds();
  /**
   * <pre>
   *转码视频id列表，多个用","隔开
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The bytes for fileIds.
   */
  com.google.protobuf.ByteString
      getFileIdsBytes();

  /**
   * <pre>
   *字幕语言列表，多个用","隔开
   * </pre>
   *
   * <code>string Languages = 3;</code>
   * @return The languages.
   */
  java.lang.String getLanguages();
  /**
   * <pre>
   *字幕语言列表，多个用","隔开
   * </pre>
   *
   * <code>string Languages = 3;</code>
   * @return The bytes for languages.
   */
  com.google.protobuf.ByteString
      getLanguagesBytes();

  /**
   * <pre>
   *字幕格式列表，多个用","隔开
   * </pre>
   *
   * <code>string Formats = 4;</code>
   * @return The formats.
   */
  java.lang.String getFormats();
  /**
   * <pre>
   *字幕格式列表，多个用","隔开
   * </pre>
   *
   * <code>string Formats = 4;</code>
   * @return The bytes for formats.
   */
  com.google.protobuf.ByteString
      getFormatsBytes();

  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>string Status = 5;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>string Status = 5;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
