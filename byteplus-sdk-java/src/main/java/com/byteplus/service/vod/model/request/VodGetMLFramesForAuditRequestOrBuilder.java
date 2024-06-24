// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodGetMLFramesForAuditRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodGetMLFramesForAuditRequest)
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
   *审核帧模板信息中的Strategy，抽帧策略
   * </pre>
   *
   * <code>string Strategy = 2;</code>
   * @return The strategy.
   */
  java.lang.String getStrategy();
  /**
   * <pre>
   *审核帧模板信息中的Strategy，抽帧策略
   * </pre>
   *
   * <code>string Strategy = 2;</code>
   * @return The bytes for strategy.
   */
  com.google.protobuf.ByteString
      getStrategyBytes();

  /**
   * <pre>
   *抽帧方式,参考VodFrameExtractingOptionForAudit
   * </pre>
   *
   * <code>string FrameOpt = 3;</code>
   * @return The frameOpt.
   */
  java.lang.String getFrameOpt();
  /**
   * <pre>
   *抽帧方式,参考VodFrameExtractingOptionForAudit
   * </pre>
   *
   * <code>string FrameOpt = 3;</code>
   * @return The bytes for frameOpt.
   */
  com.google.protobuf.ByteString
      getFrameOptBytes();

  /**
   * <pre>
   *抽帧方式选择Fps或FpsLimitNumberOfFrames时生效,表示抽帧的帧率,生效时需要保证大于0
   * </pre>
   *
   * <code>string FrameFps = 4;</code>
   * @return The frameFps.
   */
  java.lang.String getFrameFps();
  /**
   * <pre>
   *抽帧方式选择Fps或FpsLimitNumberOfFrames时生效,表示抽帧的帧率,生效时需要保证大于0
   * </pre>
   *
   * <code>string FrameFps = 4;</code>
   * @return The bytes for frameFps.
   */
  com.google.protobuf.ByteString
      getFrameFpsBytes();

  /**
   * <pre>
   *抽帧方式选择NumberOfFrames时生效,表示需要多少帧,生效时需要保证大于0
   * </pre>
   *
   * <code>string NumberOfFrames = 5;</code>
   * @return The numberOfFrames.
   */
  java.lang.String getNumberOfFrames();
  /**
   * <pre>
   *抽帧方式选择NumberOfFrames时生效,表示需要多少帧,生效时需要保证大于0
   * </pre>
   *
   * <code>string NumberOfFrames = 5;</code>
   * @return The bytes for numberOfFrames.
   */
  com.google.protobuf.ByteString
      getNumberOfFramesBytes();

  /**
   * <pre>
   *抽帧方式选择CutTimes时生效,逗号分割,表示需要获取的帧的时间戳(ms)列表，生效时需要保证数组不为空
   * </pre>
   *
   * <code>string CutTimeMills = 6;</code>
   * @return The cutTimeMills.
   */
  java.lang.String getCutTimeMills();
  /**
   * <pre>
   *抽帧方式选择CutTimes时生效,逗号分割,表示需要获取的帧的时间戳(ms)列表，生效时需要保证数组不为空
   * </pre>
   *
   * <code>string CutTimeMills = 6;</code>
   * @return The bytes for cutTimeMills.
   */
  com.google.protobuf.ByteString
      getCutTimeMillsBytes();

  /**
   * <pre>
   *需要首帧, 默认0，支持设置： 0-否，1-是
   * </pre>
   *
   * <code>string NeedFirstFrame = 7;</code>
   * @return The needFirstFrame.
   */
  java.lang.String getNeedFirstFrame();
  /**
   * <pre>
   *需要首帧, 默认0，支持设置： 0-否，1-是
   * </pre>
   *
   * <code>string NeedFirstFrame = 7;</code>
   * @return The bytes for needFirstFrame.
   */
  com.google.protobuf.ByteString
      getNeedFirstFrameBytes();

  /**
   * <pre>
   *需要尾帧, 默认0，支持设置： 0-否，1-是
   * </pre>
   *
   * <code>string NeedLastFrame = 8;</code>
   * @return The needLastFrame.
   */
  java.lang.String getNeedLastFrame();
  /**
   * <pre>
   *需要尾帧, 默认0，支持设置： 0-否，1-是
   * </pre>
   *
   * <code>string NeedLastFrame = 8;</code>
   * @return The bytes for needLastFrame.
   */
  com.google.protobuf.ByteString
      getNeedLastFrameBytes();

  /**
   * <pre>
   *从视频的第几秒开始抽帧，单位:ms
   * </pre>
   *
   * <code>string StartTimeMill = 9;</code>
   * @return The startTimeMill.
   */
  java.lang.String getStartTimeMill();
  /**
   * <pre>
   *从视频的第几秒开始抽帧，单位:ms
   * </pre>
   *
   * <code>string StartTimeMill = 9;</code>
   * @return The bytes for startTimeMill.
   */
  com.google.protobuf.ByteString
      getStartTimeMillBytes();

  /**
   * <pre>
   *从视频的第几秒结束抽帧，单位:ms
   * </pre>
   *
   * <code>string EndTimeMill = 10;</code>
   * @return The endTimeMill.
   */
  java.lang.String getEndTimeMill();
  /**
   * <pre>
   *从视频的第几秒结束抽帧，单位:ms
   * </pre>
   *
   * <code>string EndTimeMill = 10;</code>
   * @return The bytes for endTimeMill.
   */
  com.google.protobuf.ByteString
      getEndTimeMillBytes();

  /**
   * <pre>
   *抽帧方式选择FpsLimitNumberOfFrames时生效,表示限制的最小帧数,为0表示不限制
   * </pre>
   *
   * <code>string MinNumberOfFrames = 11;</code>
   * @return The minNumberOfFrames.
   */
  java.lang.String getMinNumberOfFrames();
  /**
   * <pre>
   *抽帧方式选择FpsLimitNumberOfFrames时生效,表示限制的最小帧数,为0表示不限制
   * </pre>
   *
   * <code>string MinNumberOfFrames = 11;</code>
   * @return The bytes for minNumberOfFrames.
   */
  com.google.protobuf.ByteString
      getMinNumberOfFramesBytes();

  /**
   * <pre>
   *抽帧方式选择FpsLimitNumberOfFrames时生效,表示限制的最大帧数,为0表示不限制
   * </pre>
   *
   * <code>string MaxNumberOfFrames = 12;</code>
   * @return The maxNumberOfFrames.
   */
  java.lang.String getMaxNumberOfFrames();
  /**
   * <pre>
   *抽帧方式选择FpsLimitNumberOfFrames时生效,表示限制的最大帧数,为0表示不限制
   * </pre>
   *
   * <code>string MaxNumberOfFrames = 12;</code>
   * @return The bytes for maxNumberOfFrames.
   */
  com.google.protobuf.ByteString
      getMaxNumberOfFramesBytes();
}