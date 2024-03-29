// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_cdn.proto

package com.byteplus.service.vod.model.business;

public interface VodCdnTaskResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodCdnTaskResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *结果总数
   * </pre>
   *
   * <code>int32 TotalCount = 1;</code>
   * @return The totalCount.
   */
  int getTotalCount();

  /**
   * <pre>
   *页码
   * </pre>
   *
   * <code>int32 PageNum = 2;</code>
   * @return The pageNum.
   */
  int getPageNum();

  /**
   * <pre>
   *页面大小
   * </pre>
   *
   * <code>int32 PageSize = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.VodContentInfo> 
      getContentInfosList();
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  com.byteplus.service.vod.model.business.VodContentInfo getContentInfos(int index);
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  int getContentInfosCount();
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.VodContentInfoOrBuilder> 
      getContentInfosOrBuilderList();
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  com.byteplus.service.vod.model.business.VodContentInfoOrBuilder getContentInfosOrBuilder(
      int index);
}
