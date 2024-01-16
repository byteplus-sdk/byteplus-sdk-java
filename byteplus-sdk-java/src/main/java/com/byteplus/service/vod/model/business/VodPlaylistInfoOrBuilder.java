// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

public interface VodPlaylistInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodPlaylistInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string Id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string Name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string Name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string Format = 3;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <code>string Format = 3;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <code>string Codec = 4;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <code>string Codec = 4;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <code>string Definition = 5;</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <code>string Definition = 5;</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <code>string StartTime = 6;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <code>string StartTime = 6;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <code>string EndTime = 7;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <code>string EndTime = 7;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <code>string Cycles = 8;</code>
   * @return The cycles.
   */
  java.lang.String getCycles();
  /**
   * <code>string Cycles = 8;</code>
   * @return The bytes for cycles.
   */
  com.google.protobuf.ByteString
      getCyclesBytes();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPlaylistVideoInfo VideoInfos = 9;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.VodPlaylistVideoInfo> 
      getVideoInfosList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPlaylistVideoInfo VideoInfos = 9;</code>
   */
  com.byteplus.service.vod.model.business.VodPlaylistVideoInfo getVideoInfos(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPlaylistVideoInfo VideoInfos = 9;</code>
   */
  int getVideoInfosCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPlaylistVideoInfo VideoInfos = 9;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.VodPlaylistVideoInfoOrBuilder> 
      getVideoInfosOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.VodPlaylistVideoInfo VideoInfos = 9;</code>
   */
  com.byteplus.service.vod.model.business.VodPlaylistVideoInfoOrBuilder getVideoInfosOrBuilder(
      int index);
}
