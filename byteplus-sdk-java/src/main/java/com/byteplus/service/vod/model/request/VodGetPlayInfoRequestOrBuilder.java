// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: byteplus/vod/request/request_vod.proto

package com.byteplus.service.vod.model.request;

public interface VodGetPlayInfoRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Request.VodGetPlayInfoRequest)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The vid.
     */
    java.lang.String getVid();
    /**
     * <pre>
     * 视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The bytes for vid.
     */
    com.google.protobuf.ByteString
    getVidBytes();

    /**
     * <pre>
     * 封装格式，支持 mp4、dash、hls、mp3、m4a、ogg, 默认mp4
     * </pre>
     *
     * <code>string Format = 2;</code>
     * @return The format.
     */
    java.lang.String getFormat();
    /**
     * <pre>
     * 封装格式，支持 mp4、dash、hls、mp3、m4a、ogg, 默认mp4
     * </pre>
     *
     * <code>string Format = 2;</code>
     * @return The bytes for format.
     */
    com.google.protobuf.ByteString
    getFormatBytes();

    /**
     * <pre>
     * 编码格式，支持 mp3、aac、opus、H264、H265、H266, 视频默认H264，音频默认aac
     * </pre>
     *
     * <code>string Codec = 3;</code>
     * @return The codec.
     */
    java.lang.String getCodec();
    /**
     * <pre>
     * 编码格式，支持 mp3、aac、opus、H264、H265、H266, 视频默认H264，音频默认aac
     * </pre>
     *
     * <code>string Codec = 3;</code>
     * @return The bytes for codec.
     */
    com.google.protobuf.ByteString
    getCodecBytes();

    /**
     * <pre>
     * 视频流清晰度，支持：240p,360p,480p,540p,720p,1080p,2k,4k,od,oe.默认返回全部
     * </pre>
     *
     * <code>string Definition = 4;</code>
     * @return The definition.
     */
    java.lang.String getDefinition();
    /**
     * <pre>
     * 视频流清晰度，支持：240p,360p,480p,540p,720p,1080p,2k,4k,od,oe.默认返回全部
     * </pre>
     *
     * <code>string Definition = 4;</code>
     * @return The bytes for definition.
     */
    com.google.protobuf.ByteString
    getDefinitionBytes();

    /**
     * <pre>
     * 流文件类型,支持:
     * 加密视频流evideo，加密音频流传eaudio,非加密视频流video,普通音频音频流audio.默认video
     * </pre>
     *
     * <code>string FileType = 5;</code>
     * @return The fileType.
     */
    java.lang.String getFileType();
    /**
     * <pre>
     * 流文件类型,支持:
     * 加密视频流evideo，加密音频流传eaudio,非加密视频流video,普通音频音频流audio.默认video
     * </pre>
     *
     * <code>string FileType = 5;</code>
     * @return The bytes for fileType.
     */
    com.google.protobuf.ByteString
    getFileTypeBytes();

    /**
     * <pre>
     * 水印贴片标签
     * </pre>
     *
     * <code>string LogoType = 6;</code>
     * @return The logoType.
     */
    java.lang.String getLogoType();
    /**
     * <pre>
     * 水印贴片标签
     * </pre>
     *
     * <code>string LogoType = 6;</code>
     * @return The bytes for logoType.
     */
    com.google.protobuf.ByteString
    getLogoTypeBytes();

    /**
     * <pre>
     * 播放地址是否base64编码，默认否，支持设置： 0-否，1-是
     * </pre>
     *
     * <code>string Base64 = 7;</code>
     * @return The base64.
     */
    java.lang.String getBase64();
    /**
     * <pre>
     * 播放地址是否base64编码，默认否，支持设置： 0-否，1-是
     * </pre>
     *
     * <code>string Base64 = 7;</code>
     * @return The bytes for base64.
     */
    com.google.protobuf.ByteString
    getBase64Bytes();

    /**
     * <pre>
     * 返回https播放地址，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string Ssl = 8;</code>
     * @return The ssl.
     */
    java.lang.String getSsl();
    /**
     * <pre>
     * 返回https播放地址，默认否, 1-是；0-否
     * </pre>
     *
     * <code>string Ssl = 8;</code>
     * @return The bytes for ssl.
     */
    com.google.protobuf.ByteString
    getSslBytes();

    /**
     * <pre>
     * 是否需要雪碧图（缩略图），默认否，1-是；0-否
     * </pre>
     *
     * <code>string NeedThumbs = 9;</code>
     * @return The needThumbs.
     */
    java.lang.String getNeedThumbs();
    /**
     * <pre>
     * 是否需要雪碧图（缩略图），默认否，1-是；0-否
     * </pre>
     *
     * <code>string NeedThumbs = 9;</code>
     * @return The bytes for needThumbs.
     */
    com.google.protobuf.ByteString
    getNeedThumbsBytes();

    /**
     * <pre>
     * 是否需要蒙版弹幕，默认否，1-是；0-否
     * </pre>
     *
     * <code>string NeedBarrageMask = 10;</code>
     * @return The needBarrageMask.
     */
    java.lang.String getNeedBarrageMask();
    /**
     * <pre>
     * 是否需要蒙版弹幕，默认否，1-是；0-否
     * </pre>
     *
     * <code>string NeedBarrageMask = 10;</code>
     * @return The bytes for needBarrageMask.
     */
    com.google.protobuf.ByteString
    getNeedBarrageMaskBytes();

    /**
     * <pre>
     * 指定CDN类型, 默认不传为普通CDN, 若需使用请联系技术支持
     * </pre>
     *
     * <code>string CdnType = 11;</code>
     * @return The cdnType.
     */
    java.lang.String getCdnType();
    /**
     * <pre>
     * 指定CDN类型, 默认不传为普通CDN, 若需使用请联系技术支持
     * </pre>
     *
     * <code>string CdnType = 11;</code>
     * @return The bytes for cdnType.
     */
    com.google.protobuf.ByteString
    getCdnTypeBytes();

    /**
     * <pre>
     * 唯一性标识信息, 若需使用请联系技术支持
     * </pre>
     *
     * <code>string UnionInfo = 12;</code>
     * @return The unionInfo.
     */
    java.lang.String getUnionInfo();
    /**
     * <pre>
     * 唯一性标识信息, 若需使用请联系技术支持
     * </pre>
     *
     * <code>string UnionInfo = 12;</code>
     * @return The bytes for unionInfo.
     */
    com.google.protobuf.ByteString
    getUnionInfoBytes();

    /**
     * <pre>
     * HDR清晰度，默认不查询，支持：all, 240p, 360p, 420p, 480p, 540p, 720p,
     * 1080p, 2k, 4k
     * </pre>
     *
     * <code>string HDRDefinition = 13;</code>
     * @return The hDRDefinition.
     */
    java.lang.String getHDRDefinition();
    /**
     * <pre>
     * HDR清晰度，默认不查询，支持：all, 240p, 360p, 420p, 480p, 540p, 720p,
     * 1080p, 2k, 4k
     * </pre>
     *
     * <code>string HDRDefinition = 13;</code>
     * @return The bytes for hDRDefinition.
     */
    com.google.protobuf.ByteString
    getHDRDefinitionBytes();

    /**
     * <pre>
     * 播放场景，指定获取对应场景的音视频流。当前支持：preview-试看
     * </pre>
     *
     * <code>string PlayScene = 14;</code>
     * @return The playScene.
     */
    java.lang.String getPlayScene();
    /**
     * <pre>
     * 播放场景，指定获取对应场景的音视频流。当前支持：preview-试看
     * </pre>
     *
     * <code>string PlayScene = 14;</code>
     * @return The bytes for playScene.
     */
    com.google.protobuf.ByteString
    getPlaySceneBytes();

    /**
     * <pre>
     * DRM过期时间戳, 若需使用请联系技术支持
     * </pre>
     *
     * <code>string DrmExpireTimestamp = 15;</code>
     * @return The drmExpireTimestamp.
     */
    java.lang.String getDrmExpireTimestamp();
    /**
     * <pre>
     * DRM过期时间戳, 若需使用请联系技术支持
     * </pre>
     *
     * <code>string DrmExpireTimestamp = 15;</code>
     * @return The bytes for drmExpireTimestamp.
     */
    com.google.protobuf.ByteString
    getDrmExpireTimestampBytes();

    /**
     * <pre>
     * 音频音质。当FileType为audio和eaudio时起作用,表示音频音质参数.支持: medium,
     * higher, highest.默认返回所有音频流
     * </pre>
     *
     * <code>string Quality = 16;</code>
     * @return The quality.
     */
    java.lang.String getQuality();
    /**
     * <pre>
     * 音频音质。当FileType为audio和eaudio时起作用,表示音频音质参数.支持: medium,
     * higher, highest.默认返回所有音频流
     * </pre>
     *
     * <code>string Quality = 16;</code>
     * @return The bytes for quality.
     */
    com.google.protobuf.ByteString
    getQualityBytes();

    /**
     * <pre>
     *播放配置,可指定播放域名
     * </pre>
     *
     * <code>string PlayConfig = 17;</code>
     * @return The playConfig.
     */
    java.lang.String getPlayConfig();
    /**
     * <pre>
     *播放配置,可指定播放域名
     * </pre>
     *
     * <code>string PlayConfig = 17;</code>
     * @return The bytes for playConfig.
     */
    com.google.protobuf.ByteString
    getPlayConfigBytes();

    /**
     * <pre>
     *强行指定本次请求的时间戳防盗链 单位秒
     * </pre>
     *
     * <code>string ForceExpire = 18;</code>
     * @return The forceExpire.
     */
    java.lang.String getForceExpire();
    /**
     * <pre>
     *强行指定本次请求的时间戳防盗链 单位秒
     * </pre>
     *
     * <code>string ForceExpire = 18;</code>
     * @return The bytes for forceExpire.
     */
    com.google.protobuf.ByteString
    getForceExpireBytes();

    /**
     * <pre>
     *format=dash时,指定下发video model还是mpd文件
     * </pre>
     *
     * <code>string DashMode = 19;</code>
     * @return The dashMode.
     */
    java.lang.String getDashMode();
    /**
     * <pre>
     *format=dash时,指定下发video model还是mpd文件
     * </pre>
     *
     * <code>string DashMode = 19;</code>
     * @return The bytes for dashMode.
     */
    com.google.protobuf.ByteString
    getDashModeBytes();

    /**
     * <pre>
     *客户端生成 私有Drm加密 用于加密密钥明文,unionInfo,DrmExpireTImestamp
     * </pre>
     *
     * <code>string DrmKEK = 20;</code>
     * @return The drmKEK.
     */
    java.lang.String getDrmKEK();
    /**
     * <pre>
     *客户端生成 私有Drm加密 用于加密密钥明文,unionInfo,DrmExpireTImestamp
     * </pre>
     *
     * <code>string DrmKEK = 20;</code>
     * @return The bytes for drmKEK.
     */
    com.google.protobuf.ByteString
    getDrmKEKBytes();

    /**
     * <pre>
     *用于标识请求来自于web播放器 "1"表示web播放器
     * </pre>
     *
     * <code>string JSPlayer = 21;</code>
     * @return The jSPlayer.
     */
    java.lang.String getJSPlayer();
    /**
     * <pre>
     *用于标识请求来自于web播放器 "1"表示web播放器
     * </pre>
     *
     * <code>string JSPlayer = 21;</code>
     * @return The bytes for jSPlayer.
     */
    com.google.protobuf.ByteString
    getJSPlayerBytes();
}
