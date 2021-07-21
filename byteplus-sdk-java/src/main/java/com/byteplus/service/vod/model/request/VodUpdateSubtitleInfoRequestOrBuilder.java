// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodUpdateSubtitleInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodUpdateSubtitleInfoRequest)
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
   *转码视频id列表
   * </pre>
   *
   * <code>string FileId = 2;</code>
   * @return The fileId.
   */
  java.lang.String getFileId();
  /**
   * <pre>
   *转码视频id列表
   * </pre>
   *
   * <code>string FileId = 2;</code>
   * @return The bytes for fileId.
   */
  com.google.protobuf.ByteString
      getFileIdBytes();

  /**
   * <pre>
   *字幕语言列表
   * </pre>
   *
   * <code>string Language = 3;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   *字幕语言列表
   * </pre>
   *
   * <code>string Language = 3;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   *字幕格式列表
   * </pre>
   *
   * <code>string Format = 4;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   *字幕格式列表
   * </pre>
   *
   * <code>string Format = 4;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   *标题
   * </pre>
   *
   * <code>.google.protobuf.StringValue Title = 6;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   *标题
   * </pre>
   *
   * <code>.google.protobuf.StringValue Title = 6;</code>
   * @return The title.
   */
  com.google.protobuf.StringValue getTitle();
  /**
   * <pre>
   *标题
   * </pre>
   *
   * <code>.google.protobuf.StringValue Title = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTitleOrBuilder();

  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>.google.protobuf.StringValue Tag = 7;</code>
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>.google.protobuf.StringValue Tag = 7;</code>
   * @return The tag.
   */
  com.google.protobuf.StringValue getTag();
  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>.google.protobuf.StringValue Tag = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTagOrBuilder();
}
