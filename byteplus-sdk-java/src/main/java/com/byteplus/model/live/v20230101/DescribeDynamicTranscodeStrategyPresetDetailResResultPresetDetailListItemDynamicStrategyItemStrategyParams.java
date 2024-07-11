package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItemStrategyParams
 */
@lombok.Data
public final class DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItemStrategyParams  {

    /**
     * <p>码率，单位 bps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Integer videoBitrate;

    /**
     * <p>热流相对原始流的码率百分比，取值 [0,300]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrateRatio")
    private Integer videoBitrateRatio;

    /**
     * <p>策略生效后的帧率，0 为复制源流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameRate")
    private Integer frameRate;

    /**
     * <p>roi编码。</p>
     *
     * <p>- 0：关闭。</p>
     *
     * <p>- 1：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Integer roi;

    /**
     * <p>编码器参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoEncoderParams")
    private List<DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItemStrategyParamsVideoEncoderParamsItem> videoEncoderParams;

    /**
     * <p>高级参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdvancedParam")
    private String advancedParam;

    /**
     * <p>前处理参数，开启时加上高级参数生效。</p>
     *
     * <p>- 0：关闭。</p>
     *
     * <p>- 1：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HVSpre")
    private Integer hVSpre;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
