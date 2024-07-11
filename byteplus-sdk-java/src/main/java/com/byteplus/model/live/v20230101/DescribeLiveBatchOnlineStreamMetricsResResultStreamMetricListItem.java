package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchOnlineStreamMetricsResResultStreamMetricListItem
 */
@lombok.Data
public final class DescribeLiveBatchOnlineStreamMetricsResResultStreamMetricListItem  {

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
     * <p>推流客户端 IP，只有流类型为推流（即 `StreamType` 为 `push`）时返回此值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientIp")
    private String clientIp;

    /**
     * <p>在线流的视频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoFps")
    private Float videoFps;

    /**
     * <p>在线流的视频帧率，单位为 fps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoRate")
    private Float videoRate;

    /**
     * <p>在线流的音频帧率，单位为 fps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFps")
    private Float audioFps;

    /**
     * <p>在线流的音频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioRate")
    private Float audioRate;

    /**
     * <p>在线流的音频编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Acodec")
    private String acodec;

    /**
     * <p>在线流的开始时间，RFC3339 格式的时间字符串，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamBeginTime")
    private String streamBeginTime;

    /**
     * <p>在线流的视频编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vcodec")
    private String vcodec;

    /**
     * <p>在线流的实时分辨率，使用宽 x 高表示。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>接收客户端推流的服务器 IP，只有流类型为推流（即 `StreamType` 为 `push`）时返回此值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerIp")
    private String serverIp;

    /**
     * <p>在线流元信息（Metadata）中的音频码率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetaAudioRate")
    private Float metaAudioRate;

    /**
     * <p>在线流元信息（Metadata）中的视频帧率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetaVideoFps")
    private Integer metaVideoFps;

    /**
     * <p>在线流元信息（Metadata）中的视频码率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetaVideoRate")
    private Float metaVideoRate;

    /**
     * <p>在线流的类型，取值及含义如下所示。</p>
     *
     * <p>- `push`：推流；</p>
     *
     * <p>- `relay`：回源流；</p>
     *
     * <p>- `transcode`：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private String streamType;

    /**
     * <p>回源首字节耗时，单位ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FirstByteTime")
    private Integer firstByteTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
