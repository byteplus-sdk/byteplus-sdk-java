package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribePushStreamMetricsResResultMetricListItem
 */
@lombok.Data
public final class DescribePushStreamMetricsResResultMetricListItem  {

    /**
     * <p>时间戳。RFC3339 格式的 UTC 时间，例如，`2022-04-13T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    /**
     * <p>音频帧间隔，单位为 ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFrameGap")
    private Integer audioFrameGap;

    /**
     * <p>视频帧间隔，单位为 ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoFrameGap")
    private Integer videoFrameGap;

    /**
     * <p>音视频时间戳差值，即 `AudioPts` 与 `VideoPts` 之间的差值，单位为 ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PtsDelta")
    private Integer ptsDelta;

    /**
     * <p>视频显示时间戳 PTS（Presentation Time Stamp），单位为 ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoPts")
    private Integer videoPts;

    /**
     * <p>音频显示时间戳 PTS（Presentation Time Stamp），单位为 ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioPts")
    private Integer audioPts;

    /**
     * <p>音频码率，单位为 kbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Float audioBitrate;

    /**
     * <p>音频帧率，单位为 fps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFramerate")
    private Float audioFramerate;

    /**
     * <p>视频帧率，单位为 fps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Framerate")
    private Float framerate;

    /**
     * <p>视频码率，单位为 kbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bitrate")
    private Float bitrate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
