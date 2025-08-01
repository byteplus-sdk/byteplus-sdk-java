// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodUpdatePlaylistRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodUpdatePlaylistRequest)
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
   * 播放列表Id
   * </pre>
   *
   * <code>string Id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * 播放列表Id
   * </pre>
   *
   * <code>string Id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
  getIdBytes();

  /**
   * <code>.google.protobuf.StringValue Name = 3;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>.google.protobuf.StringValue Name = 3;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <code>.google.protobuf.StringValue Name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * 封装格式，支持 mp4、dash、hls、mp3、m4a、ogg, 默认mp4
   * </pre>
   *
   * <code>.google.protobuf.StringValue Format = 4;</code>
   * @return Whether the format field is set.
   */
  boolean hasFormat();
  /**
   * <pre>
   * 封装格式，支持 mp4、dash、hls、mp3、m4a、ogg, 默认mp4
   * </pre>
   *
   * <code>.google.protobuf.StringValue Format = 4;</code>
   * @return The format.
   */
  com.google.protobuf.StringValue getFormat();
  /**
   * <pre>
   * 封装格式，支持 mp4、dash、hls、mp3、m4a、ogg, 默认mp4
   * </pre>
   *
   * <code>.google.protobuf.StringValue Format = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFormatOrBuilder();

  /**
   * <pre>
   * 编码格式，支持 mp3、aac、opus、H264、H265、H266, 视频默认H264
   * </pre>
   *
   * <code>.google.protobuf.StringValue Codec = 5;</code>
   * @return Whether the codec field is set.
   */
  boolean hasCodec();
  /**
   * <pre>
   * 编码格式，支持 mp3、aac、opus、H264、H265、H266, 视频默认H264
   * </pre>
   *
   * <code>.google.protobuf.StringValue Codec = 5;</code>
   * @return The codec.
   */
  com.google.protobuf.StringValue getCodec();
  /**
   * <pre>
   * 编码格式，支持 mp3、aac、opus、H264、H265、H266, 视频默认H264
   * </pre>
   *
   * <code>.google.protobuf.StringValue Codec = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCodecOrBuilder();

  /**
   * <pre>
   * 视频流清晰度，支持：240p,360p,480p,540p,720p,1080p,2k,4k,od,oe.
   * </pre>
   *
   * <code>.google.protobuf.StringValue Definition = 6;</code>
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();
  /**
   * <pre>
   * 视频流清晰度，支持：240p,360p,480p,540p,720p,1080p,2k,4k,od,oe.
   * </pre>
   *
   * <code>.google.protobuf.StringValue Definition = 6;</code>
   * @return The definition.
   */
  com.google.protobuf.StringValue getDefinition();
  /**
   * <pre>
   * 视频流清晰度，支持：240p,360p,480p,540p,720p,1080p,2k,4k,od,oe.
   * </pre>
   *
   * <code>.google.protobuf.StringValue Definition = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDefinitionOrBuilder();

  /**
   * <pre>
   * 以,分隔，最多100个
   * </pre>
   *
   * <code>.google.protobuf.StringValue Vids = 7;</code>
   * @return Whether the vids field is set.
   */
  boolean hasVids();
  /**
   * <pre>
   * 以,分隔，最多100个
   * </pre>
   *
   * <code>.google.protobuf.StringValue Vids = 7;</code>
   * @return The vids.
   */
  com.google.protobuf.StringValue getVids();
  /**
   * <pre>
   * 以,分隔，最多100个
   * </pre>
   *
   * <code>.google.protobuf.StringValue Vids = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getVidsOrBuilder();

  /**
   * <pre>
   * 以秒为单位的时间戳
   * </pre>
   *
   * <code>.google.protobuf.StringValue StartTime = 8;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * 以秒为单位的时间戳
   * </pre>
   *
   * <code>.google.protobuf.StringValue StartTime = 8;</code>
   * @return The startTime.
   */
  com.google.protobuf.StringValue getStartTime();
  /**
   * <pre>
   * 以秒为单位的时间戳
   * </pre>
   *
   * <code>.google.protobuf.StringValue StartTime = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * 以秒为单位的时间戳，大于StartTime
   * </pre>
   *
   * <code>.google.protobuf.StringValue EndTime = 9;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * 以秒为单位的时间戳，大于StartTime
   * </pre>
   *
   * <code>.google.protobuf.StringValue EndTime = 9;</code>
   * @return The endTime.
   */
  com.google.protobuf.StringValue getEndTime();
  /**
   * <pre>
   * 以秒为单位的时间戳，大于StartTime
   * </pre>
   *
   * <code>.google.protobuf.StringValue EndTime = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * 0代表无限循环
   * </pre>
   *
   * <code>.google.protobuf.StringValue Cycles = 10;</code>
   * @return Whether the cycles field is set.
   */
  boolean hasCycles();
  /**
   * <pre>
   * 0代表无限循环
   * </pre>
   *
   * <code>.google.protobuf.StringValue Cycles = 10;</code>
   * @return The cycles.
   */
  com.google.protobuf.StringValue getCycles();
  /**
   * <pre>
   * 0代表无限循环
   * </pre>
   *
   * <code>.google.protobuf.StringValue Cycles = 10;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCyclesOrBuilder();
}
