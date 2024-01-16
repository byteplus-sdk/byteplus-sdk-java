// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodUpdateMediaStorageClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodUpdateMediaStorageClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频ID列表,多个用英文逗号分隔，最多支持20个
   * </pre>
   *
   * <code>string Vids = 1;</code>
   * @return The vids.
   */
  java.lang.String getVids();
  /**
   * <pre>
   *视频ID列表,多个用英文逗号分隔，最多支持20个
   * </pre>
   *
   * <code>string Vids = 1;</code>
   * @return The bytes for vids.
   */
  com.google.protobuf.ByteString
      getVidsBytes();

  /**
   * <pre>
   *文件存储类型，STANDARD-标准存储，ARCHIVE-归档存储
   * </pre>
   *
   * <code>string StorageClass = 2;</code>
   * @return The storageClass.
   */
  java.lang.String getStorageClass();
  /**
   * <pre>
   *文件存储类型，STANDARD-标准存储，ARCHIVE-归档存储
   * </pre>
   *
   * <code>string StorageClass = 2;</code>
   * @return The bytes for storageClass.
   */
  com.google.protobuf.ByteString
      getStorageClassBytes();

  /**
   * <pre>
   *回调回传参数
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   *回调回传参数
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <pre>
   *转码视频ID列表,多个用英文逗号分隔，最多支持20个，传入该参数时，Vids只允许传一个视频ID
   * </pre>
   *
   * <code>string FileIds = 4;</code>
   * @return The fileIds.
   */
  java.lang.String getFileIds();
  /**
   * <pre>
   *转码视频ID列表,多个用英文逗号分隔，最多支持20个，传入该参数时，Vids只允许传一个视频ID
   * </pre>
   *
   * <code>string FileIds = 4;</code>
   * @return The bytes for fileIds.
   */
  com.google.protobuf.ByteString
      getFileIdsBytes();
}
