// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_measure.proto

package com.byteplus.service.vod.model.business;

public interface DescribeVodSpaceTranscodeDetailTVUnitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.DescribeVodSpaceTranscodeDetailTVUnit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Time = 1;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <code>string Time = 1;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceTranscodeItem TranscodeItemList = 2;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DescribeVodSpaceTranscodeItem> 
      getTranscodeItemListList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceTranscodeItem TranscodeItemList = 2;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceTranscodeItem getTranscodeItemList(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceTranscodeItem TranscodeItemList = 2;</code>
   */
  int getTranscodeItemListCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceTranscodeItem TranscodeItemList = 2;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DescribeVodSpaceTranscodeItemOrBuilder> 
      getTranscodeItemListOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.DescribeVodSpaceTranscodeItem TranscodeItemList = 2;</code>
   */
  com.byteplus.service.vod.model.business.DescribeVodSpaceTranscodeItemOrBuilder getTranscodeItemListOrBuilder(
      int index);
}