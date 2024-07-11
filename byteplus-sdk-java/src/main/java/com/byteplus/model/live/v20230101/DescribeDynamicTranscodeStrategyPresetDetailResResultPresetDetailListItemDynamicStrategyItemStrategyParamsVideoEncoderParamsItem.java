package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItemStrategyParamsVideoEncoderParamsItem
 */
@lombok.Data
public final class DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItemStrategyParamsVideoEncoderParamsItem  {

    /**
     * <p>编码格式，如bvc0ot、bytevc1等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VCodec")
    private String vCodec;

    /**
     * <p>编码档次，如main、high等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Profile")
    private String profile;

    /**
     * <p>视频编码档位，如fast、medium、slow等编码预制。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>码率控制方式，如abr、crf等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRateCtrl")
    private String vRateCtrl;

    /**
     * <p>码率控制方式对应的入参，如crf时可填21.5。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRateCtrlInput")
    private Float vRateCtrlInput;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VencAdvancedParam")
    private String vencAdvancedParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
