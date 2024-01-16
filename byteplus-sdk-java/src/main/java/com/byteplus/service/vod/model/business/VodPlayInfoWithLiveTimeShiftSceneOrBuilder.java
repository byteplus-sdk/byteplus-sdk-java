// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_play.proto

package com.byteplus.service.vod.model.business;

public interface VodPlayInfoWithLiveTimeShiftSceneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodPlayInfoWithLiveTimeShiftScene)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URI
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The storeUri.
   */
  java.lang.String getStoreUri();
  /**
   * <pre>
   * URI
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The bytes for storeUri.
   */
  com.google.protobuf.ByteString
      getStoreUriBytes();

  /**
   * <pre>
   * 主播放URL
   * </pre>
   *
   * <code>string MainPlayUrl = 2;</code>
   * @return The mainPlayUrl.
   */
  java.lang.String getMainPlayUrl();
  /**
   * <pre>
   * 主播放URL
   * </pre>
   *
   * <code>string MainPlayUrl = 2;</code>
   * @return The bytes for mainPlayUrl.
   */
  com.google.protobuf.ByteString
      getMainPlayUrlBytes();

  /**
   * <pre>
   * 备播放URL，可能不存在
   * </pre>
   *
   * <code>string BackupPlayUrl = 3;</code>
   * @return The backupPlayUrl.
   */
  java.lang.String getBackupPlayUrl();
  /**
   * <pre>
   * 备播放URL，可能不存在
   * </pre>
   *
   * <code>string BackupPlayUrl = 3;</code>
   * @return The bytes for backupPlayUrl.
   */
  com.google.protobuf.ByteString
      getBackupPlayUrlBytes();

  /**
   * <pre>
   * 过期DDL,Unix时间戳，单位：秒
   * </pre>
   *
   * <code>double UrlExpire = 4;</code>
   * @return The urlExpire.
   */
  double getUrlExpire();
}
