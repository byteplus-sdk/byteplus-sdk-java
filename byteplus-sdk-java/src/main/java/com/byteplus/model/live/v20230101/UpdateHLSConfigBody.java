package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateHLSConfigBody
 */
@lombok.Data
public final class UpdateHLSConfigBody  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>服务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Float interval;

    /**
     * <p>切片最大大小，单位byte，默认 524288000</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxSize")
    private Integer maxSize;

    /**
     * <p>切片最大帧数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxFrame")
    private Integer maxFrame;

    /**
     * <p>m3u8的ts个数，默认3个</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlaylistLength")
    private Integer playlistLength;

    /**
     * <p>ts缓存时间，单位s，默认60s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TsExpiration")
    private Integer tsExpiration;

    /**
     * <p>开启预取，默认false</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnablePrefetch")
    private Boolean enablePrefetch;

    /**
     * <p>预取ts个数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrefetchNum")
    private Integer prefetchNum;

    /**
     * <p>ts存储位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Path")
    private String path;

    /**
     * <p>ts文件后缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>首个m3u8 ts的个数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FirstPlaylistLength")
    private Integer firstPlaylistLength;

    /**
     * <p>永久存储ts，默认为true，也就是清零</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CleanUp")
    private Boolean cleanUp;

    /**
     * <p>时间戳置零,默认为false</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CopyTs")
    private Boolean copyTs;

    /**
     * <p>时间戳gap，默认5s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Gap")
    private Integer gap;

    /**
     * <p>可选枚举值 "audio\_only" "video\_only "video\_keyframe\_only" "video\_single\_keyframe\_only"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PacketFilter")
    private String packetFilter;

    /**
     * <p>json配置，通过json的方式添加时填写</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Config")
    private String config;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PartTargetDuration")
    private Float partTargetDuration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PDTInterval")
    private Float pDTInterval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
