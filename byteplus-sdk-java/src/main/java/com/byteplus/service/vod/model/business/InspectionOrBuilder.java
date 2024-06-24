// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_workflow.proto

package com.byteplus.service.vod.model.business;

public interface InspectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.Inspection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频检测质量
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.Quality Quality = 1;</code>
   * @return Whether the quality field is set.
   */
  boolean hasQuality();
  /**
   * <pre>
   * 视频检测质量
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.Quality Quality = 1;</code>
   * @return The quality.
   */
  com.byteplus.service.vod.model.business.Quality getQuality();
  /**
   * <pre>
   * 视频检测质量
   * </pre>
   *
   * <code>.Byteplus.Vod.Models.Business.Quality Quality = 1;</code>
   */
  com.byteplus.service.vod.model.business.QualityOrBuilder getQualityOrBuilder();

  /**
   * <pre>
   * 水印检测结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.DeLogoInfo DeLogo = 2;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.DeLogoInfo> 
      getDeLogoList();
  /**
   * <pre>
   * 水印检测结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.DeLogoInfo DeLogo = 2;</code>
   */
  com.byteplus.service.vod.model.business.DeLogoInfo getDeLogo(int index);
  /**
   * <pre>
   * 水印检测结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.DeLogoInfo DeLogo = 2;</code>
   */
  int getDeLogoCount();
  /**
   * <pre>
   * 水印检测结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.DeLogoInfo DeLogo = 2;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.DeLogoInfoOrBuilder> 
      getDeLogoOrBuilderList();
  /**
   * <pre>
   * 水印检测结果
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.DeLogoInfo DeLogo = 2;</code>
   */
  com.byteplus.service.vod.model.business.DeLogoInfoOrBuilder getDeLogoOrBuilder(
      int index);
}