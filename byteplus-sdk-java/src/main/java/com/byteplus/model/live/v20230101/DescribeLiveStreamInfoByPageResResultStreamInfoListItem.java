package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamInfoByPageResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeLiveStreamInfoByPageResResultStreamInfoListItem  {

    /**
     * <p>在线流的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>在线流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>在线流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>在线流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>在线流使用的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>在线流的开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionStartTime")
    private String sessionStartTime;

    /**
     * <p>在线人数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineUser")
    private String onlineUser;

    /**
     * <p>带宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandWidth")
    private String bandWidth;

    /**
     * <p>码率</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bitrate")
    private String bitrate;

    /**
     * <p>帧率</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Framerate")
    private String framerate;

    /**
     * <p>预览地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewURL")
    private String previewURL;

    /**
     * <p>在线流的来源类型，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `push`：直推流；</p>
     *
     * <p>- `relay`：回源流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceType")
    private String sourceType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
