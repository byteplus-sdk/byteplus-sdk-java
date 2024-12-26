// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodRealtimeMediaDataDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Space = 1;</code>
   * @return The space.
   */
  java.lang.String getSpace();
  /**
   * <code>string Space = 1;</code>
   * @return The bytes for space.
   */
  com.google.protobuf.ByteString
      getSpaceBytes();

  /**
   * <code>int64 Total = 2;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 3;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItem> 
      getRealtimeMediaDataListList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 3;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItem getRealtimeMediaDataList(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 3;</code>
   */
  int getRealtimeMediaDataListCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 3;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItemOrBuilder> 
      getRealtimeMediaDataListOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodRealtimeMediaDataItem RealtimeMediaDataList = 3;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodRealtimeMediaDataItemOrBuilder getRealtimeMediaDataListOrBuilder(
      int index);
}