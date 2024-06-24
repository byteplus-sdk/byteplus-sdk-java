// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

public interface FileBasicInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.FileBasicInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * tos侧的key，即directUrl中的FileName
   * </pre>
   *
   * <code>string FileName = 1;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <pre>
   * tos侧的key，即directUrl中的FileName
   * </pre>
   *
   * <code>string FileName = 1;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   *对象大小
   * </pre>
   *
   * <code>int64 Size = 2;</code>
   * @return The size.
   */
  long getSize();

  /**
   * <pre>
   *存储类型(STANDARD/ARCHIVE)
   * </pre>
   *
   * <code>string StorageClass = 3;</code>
   * @return The storageClass.
   */
  java.lang.String getStorageClass();
  /**
   * <pre>
   *存储类型(STANDARD/ARCHIVE)
   * </pre>
   *
   * <code>string StorageClass = 3;</code>
   * @return The bytes for storageClass.
   */
  com.google.protobuf.ByteString
      getStorageClassBytes();

  /**
   * <pre>
   *最近修改时间
   * </pre>
   *
   * <code>string UpdatedTime = 4;</code>
   * @return The updatedTime.
   */
  java.lang.String getUpdatedTime();
  /**
   * <pre>
   *最近修改时间
   * </pre>
   *
   * <code>string UpdatedTime = 4;</code>
   * @return The bytes for updatedTime.
   */
  com.google.protobuf.ByteString
      getUpdatedTimeBytes();
}