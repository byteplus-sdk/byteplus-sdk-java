// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/business/vod_workflow.proto

package com.byteplus.service.vod.model.business;

public interface SnapshotResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.SnapshotResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string Type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsPoster Poster = 2;</code>
   * @return Whether the poster field is set.
   */
  boolean hasPoster();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsPoster Poster = 2;</code>
   * @return The poster.
   */
  com.byteplus.service.vod.model.business.SnapshotParamsPoster getPoster();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsPoster Poster = 2;</code>
   */
  com.byteplus.service.vod.model.business.SnapshotParamsPosterOrBuilder getPosterOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsDynpost Dynpost = 3;</code>
   * @return Whether the dynpost field is set.
   */
  boolean hasDynpost();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsDynpost Dynpost = 3;</code>
   * @return The dynpost.
   */
  com.byteplus.service.vod.model.business.SnapshotParamsDynpost getDynpost();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsDynpost Dynpost = 3;</code>
   */
  com.byteplus.service.vod.model.business.SnapshotParamsDynpostOrBuilder getDynpostOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsAnimatedPoster AnimatedPoster = 4;</code>
   * @return Whether the animatedPoster field is set.
   */
  boolean hasAnimatedPoster();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsAnimatedPoster AnimatedPoster = 4;</code>
   * @return The animatedPoster.
   */
  com.byteplus.service.vod.model.business.SnapshotParamsAnimatedPoster getAnimatedPoster();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsAnimatedPoster AnimatedPoster = 4;</code>
   */
  com.byteplus.service.vod.model.business.SnapshotParamsAnimatedPosterOrBuilder getAnimatedPosterOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsAIDynpost AIDynpost = 5;</code>
   * @return Whether the aIDynpost field is set.
   */
  boolean hasAIDynpost();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsAIDynpost AIDynpost = 5;</code>
   * @return The aIDynpost.
   */
  com.byteplus.service.vod.model.business.SnapshotParamsAIDynpost getAIDynpost();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsAIDynpost AIDynpost = 5;</code>
   */
  com.byteplus.service.vod.model.business.SnapshotParamsAIDynpostOrBuilder getAIDynpostOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsSprite Sprite = 6;</code>
   * @return Whether the sprite field is set.
   */
  boolean hasSprite();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsSprite Sprite = 6;</code>
   * @return The sprite.
   */
  com.byteplus.service.vod.model.business.SnapshotParamsSprite getSprite();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsSprite Sprite = 6;</code>
   */
  com.byteplus.service.vod.model.business.SnapshotParamsSpriteOrBuilder getSpriteOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsSample Sample = 7;</code>
   * @return Whether the sample field is set.
   */
  boolean hasSample();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsSample Sample = 7;</code>
   * @return The sample.
   */
  com.byteplus.service.vod.model.business.SnapshotParamsSample getSample();
  /**
   * <code>.Byteplus.Vod.Models.Business.SnapshotParamsSample Sample = 7;</code>
   */
  com.byteplus.service.vod.model.business.SnapshotParamsSampleOrBuilder getSampleOrBuilder();

  public com.byteplus.service.vod.model.business.SnapshotResult.SnapshotParamsCase getSnapshotParamsCase();
}
