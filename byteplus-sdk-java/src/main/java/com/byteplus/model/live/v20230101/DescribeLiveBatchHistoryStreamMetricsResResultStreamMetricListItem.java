package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchHistoryStreamMetricsResResultStreamMetricListItem
 */
@lombok.Data
public final class DescribeLiveBatchHistoryStreamMetricsResResultStreamMetricListItem  {

    /**
     * <p>历史流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>历史流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>历史流使用的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>推流客户端 IP，只有流类型为推流（即 `StreamType` 为 `push`）时返回此值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientIp")
    private String clientIp;

    /**
     * <p>断开时历史流的音频编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Acodec")
    private String acodec;

    /**
     * <p>历史流的开始时间，RFC3339 格式的时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamBeginTime")
    private String streamBeginTime;

    /**
     * <p>断开时历史流的视频编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vcodec")
    private String vcodec;

    /**
     * <p>断开时历史流的实时分辨率，使用宽 x 高表示。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>接收客户端推流的服务器 IP，只有流类型为推流（即 `StreamType` 为 `push`）时返回此值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerIp")
    private String serverIp;

    /**
     * <p>历史流元信息（Metadata）中的音频码率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetaAudioRate")
    private Float metaAudioRate;

    /**
     * <p>历史流元信息（Metadata）中的视频帧率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetaVideoFps")
    private Integer metaVideoFps;

    /**
     * <p>历史流元信息（Metadata）中的视频码率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetaVideoRate")
    private Float metaVideoRate;

    /**
     * <p>历史流的类型，取值及含义如下所示。</p>
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
     * <p>历史流的结束时间，RFC3339 格式的时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamEndTime")
    private String streamEndTime;

    /**
     * <p>历史流持续时长，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    /**
     * <p>推流断开原因，只有流类型为推流（即 `StreamType` 为 `push`）时返回此值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamBreakReason")
    private String streamBreakReason;

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
