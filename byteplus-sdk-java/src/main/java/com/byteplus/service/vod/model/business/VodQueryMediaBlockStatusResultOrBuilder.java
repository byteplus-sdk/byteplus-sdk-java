// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

public interface VodQueryMediaBlockStatusResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodQueryMediaBlockStatusResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return A list containing the notExistVids.
   */
  java.util.List<java.lang.String>
      getNotExistVidsList();
  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return The count of notExistVids.
   */
  int getNotExistVidsCount();
  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the element to return.
   * @return The notExistVids at the given index.
   */
  java.lang.String getNotExistVids(int index);
  /**
   * <pre>
   * 不存在的Vid列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistVids at the given index.
   */
  com.google.protobuf.ByteString
      getNotExistVidsBytes(int index);

  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.MediaBlockStatus> 
      getMediaBlockStatusesList();
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  com.byteplus.service.vod.model.business.MediaBlockStatus getMediaBlockStatuses(int index);
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  int getMediaBlockStatusesCount();
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder> 
      getMediaBlockStatusesOrBuilderList();
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated .Byteplus.Vod.Models.Business.MediaBlockStatus MediaBlockStatuses = 2;</code>
   */
  com.byteplus.service.vod.model.business.MediaBlockStatusOrBuilder getMediaBlockStatusesOrBuilder(
      int index);
}
