// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_media.proto

package com.byteplus.service.vod.model.business;

public interface VodDeleteMediaDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodDeleteMediaData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return A list containing the notExistVids.
   */
  java.util.List<java.lang.String>
      getNotExistVidsList();
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @return The count of notExistVids.
   */
  int getNotExistVidsCount();
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the element to return.
   * @return The notExistVids at the given index.
   */
  java.lang.String getNotExistVids(int index);
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistVids at the given index.
   */
  com.google.protobuf.ByteString
      getNotExistVidsBytes(int index);
}
