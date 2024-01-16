// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_upload.proto

package com.byteplus.service.vod.model.business;

public interface UploadAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.UploadAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.StoreInfo StoreInfos = 1;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.StoreInfo> 
      getStoreInfosList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.StoreInfo StoreInfos = 1;</code>
   */
  com.byteplus.service.vod.model.business.StoreInfo getStoreInfos(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.StoreInfo StoreInfos = 1;</code>
   */
  int getStoreInfosCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.StoreInfo StoreInfos = 1;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.StoreInfoOrBuilder> 
      getStoreInfosOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.StoreInfo StoreInfos = 1;</code>
   */
  com.byteplus.service.vod.model.business.StoreInfoOrBuilder getStoreInfosOrBuilder(
      int index);

  /**
   * <code>repeated string UploadHosts = 2;</code>
   * @return A list containing the uploadHosts.
   */
  java.util.List<java.lang.String>
      getUploadHostsList();
  /**
   * <code>repeated string UploadHosts = 2;</code>
   * @return The count of uploadHosts.
   */
  int getUploadHostsCount();
  /**
   * <code>repeated string UploadHosts = 2;</code>
   * @param index The index of the element to return.
   * @return The uploadHosts at the given index.
   */
  java.lang.String getUploadHosts(int index);
  /**
   * <code>repeated string UploadHosts = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the uploadHosts at the given index.
   */
  com.google.protobuf.ByteString
      getUploadHostsBytes(int index);

  /**
   * <code>repeated .Byteplus.Vod.Models.Business.HeaderPair UploadHeader = 3;</code>
   */
  java.util.List<com.byteplus.service.vod.model.business.HeaderPair> 
      getUploadHeaderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.HeaderPair UploadHeader = 3;</code>
   */
  com.byteplus.service.vod.model.business.HeaderPair getUploadHeader(int index);
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.HeaderPair UploadHeader = 3;</code>
   */
  int getUploadHeaderCount();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.HeaderPair UploadHeader = 3;</code>
   */
  java.util.List<? extends com.byteplus.service.vod.model.business.HeaderPairOrBuilder> 
      getUploadHeaderOrBuilderList();
  /**
   * <code>repeated .Byteplus.Vod.Models.Business.HeaderPair UploadHeader = 3;</code>
   */
  com.byteplus.service.vod.model.business.HeaderPairOrBuilder getUploadHeaderOrBuilder(
      int index);

  /**
   * <code>string SessionKey = 4;</code>
   * @return The sessionKey.
   */
  java.lang.String getSessionKey();
  /**
   * <code>string SessionKey = 4;</code>
   * @return The bytes for sessionKey.
   */
  com.google.protobuf.ByteString
      getSessionKeyBytes();
}
