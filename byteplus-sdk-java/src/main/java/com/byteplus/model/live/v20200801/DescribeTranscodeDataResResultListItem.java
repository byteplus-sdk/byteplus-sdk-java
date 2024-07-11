package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeTranscodeDataResResultListItem
 */
@lombok.Data
public final class DescribeTranscodeDataResResultListItem  {

    /**
     * <p>视频编码格式，支持的取值和含义如下所示。</p>
     *
     *
     *
     * <p>- Normal\_H264：H.264 标准转码；</p>
     *
     * <p>- Normal\_H265：H.265 标准转码；</p>
     *
     * <p>- ByteHD\_H264：H.264 极智超清；</p>
     *
     * <p>- ByteHD\_H265：H.265 极智超清；</p>
     *
     * <p>- Audio：纯音频流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeType")
    private String transcodeType;

    /**
     * <p>视频编码格式，同 `TranscodeType` 参数。支持的取值和含义如下所示。</p>
     *
     *
     *
     * <p>- Normal\_H264：H.264 标准转码；</p>
     *
     * <p>- Normal\_H265：H.265 标准转码；</p>
     *
     * <p>- ByteHD\_H264：H.264 极智超清；</p>
     *
     * <p>- ByteHD\_H265：H.265 极智超清；</p>
     *
     * <p>- Audio：纯音频流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VCodec")
    private String vCodec;

    /**
     * <p>分辨率。</p>
     *
     *
     *
     * <p>- 480P：640 × 480；</p>
     *
     * <p>- 720P：1280 × 720；</p>
     *
     * <p>- 1080P：1920 × 1088；</p>
     *
     * <p>- 2K：2560 × 1440；</p>
     *
     * <p>- 4K：4096 × 21600；</p>
     *
     * <p>- 0：纯音频流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>聚合时刻</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    /**
     * <p>当前时间片内的转码时长，单位为分钟</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
