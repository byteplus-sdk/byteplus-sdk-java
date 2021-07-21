// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.byteplus.service.vod.model.business;

public interface SnapshotOverrideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.SnapshotOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 被覆盖的截图模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return A list containing the templateId.
   */
  java.util.List<java.lang.String>
      getTemplateIdList();
  /**
   * <pre>
   * 被覆盖的截图模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return The count of templateId.
   */
  int getTemplateIdCount();
  /**
   * <pre>
   * 被覆盖的截图模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the element to return.
   * @return The templateId at the given index.
   */
  java.lang.String getTemplateId(int index);
  /**
   * <pre>
   * 被覆盖的截图模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the templateId at the given index.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes(int index);

  /**
   * <pre>
   * 截图时间, 单位ms, AIDynpost和Sprite类型不支持
   * </pre>
   *
   * <code>int32 OffsetTime = 2;</code>
   * @return The offsetTime.
   */
  int getOffsetTime();

  /**
   * <pre>
   * 多Dynpost类型截取时间，单位ms
   * </pre>
   *
   * <code>repeated int32 OffsetTimeList = 3;</code>
   * @return A list containing the offsetTimeList.
   */
  java.util.List<java.lang.Integer> getOffsetTimeListList();
  /**
   * <pre>
   * 多Dynpost类型截取时间，单位ms
   * </pre>
   *
   * <code>repeated int32 OffsetTimeList = 3;</code>
   * @return The count of offsetTimeList.
   */
  int getOffsetTimeListCount();
  /**
   * <pre>
   * 多Dynpost类型截取时间，单位ms
   * </pre>
   *
   * <code>repeated int32 OffsetTimeList = 3;</code>
   * @param index The index of the element to return.
   * @return The offsetTimeList at the given index.
   */
  int getOffsetTimeList(int index);
}
