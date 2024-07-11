package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDynamicTranscodeStrategyPresetDetailRes
 */
@lombok.Data
public final class DescribeDynamicTranscodeStrategyPresetDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeDynamicTranscodeStrategyPresetDetailResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeDynamicTranscodeStrategyPresetDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
