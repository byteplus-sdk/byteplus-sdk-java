// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

public interface VodSubmitUnblockMediaTaskResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodSubmitUnblockMediaTaskResult)
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
   * <code>repeated string UnblockedVids = 2;</code>
   * @return A list containing the unblockedVids.
   */
  java.util.List<java.lang.String>
      getUnblockedVidsList();
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated string UnblockedVids = 2;</code>
   * @return The count of unblockedVids.
   */
  int getUnblockedVidsCount();
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated string UnblockedVids = 2;</code>
   * @param index The index of the element to return.
   * @return The unblockedVids at the given index.
   */
  java.lang.String getUnblockedVids(int index);
  /**
   * <pre>
   * 已封禁的Vid列表
   * </pre>
   *
   * <code>repeated string UnblockedVids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unblockedVids at the given index.
   */
  com.google.protobuf.ByteString
      getUnblockedVidsBytes(int index);

  /**
   * <pre>
   * 解封中的Vid列表
   * </pre>
   *
   * <code>repeated string BlockingVids = 3;</code>
   * @return A list containing the blockingVids.
   */
  java.util.List<java.lang.String>
      getBlockingVidsList();
  /**
   * <pre>
   * 解封中的Vid列表
   * </pre>
   *
   * <code>repeated string BlockingVids = 3;</code>
   * @return The count of blockingVids.
   */
  int getBlockingVidsCount();
  /**
   * <pre>
   * 解封中的Vid列表
   * </pre>
   *
   * <code>repeated string BlockingVids = 3;</code>
   * @param index The index of the element to return.
   * @return The blockingVids at the given index.
   */
  java.lang.String getBlockingVids(int index);
  /**
   * <pre>
   * 解封中的Vid列表
   * </pre>
   *
   * <code>repeated string BlockingVids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blockingVids at the given index.
   */
  com.google.protobuf.ByteString
      getBlockingVidsBytes(int index);
}
