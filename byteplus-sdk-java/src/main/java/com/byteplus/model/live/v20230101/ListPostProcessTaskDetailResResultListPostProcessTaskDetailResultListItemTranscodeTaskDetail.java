package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemTranscodeTaskDetail
 */
@lombok.Data
public final class ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemTranscodeTaskDetail  {

    /**
     * <p>转码模板后缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>视频码率</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Long videoBitrate;

    /**
     * <p>帧率</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Long fPS;

    /**
     * <p>宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Long width;

    /**
     * <p>高</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Long height;

    /**
     * <p>音频码率</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Long audioBitrate;

    /**
     * <p>采样率</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SampleRate")
    private Long sampleRate;

    /**
     * <p>模板类型，0：普通模板，1：OR模板，2：VR模板，3：延迟模板</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetKind")
    private Long presetKind;

    /**
     * <p>转码流名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamTranscoded")
    private String streamTranscoded;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
