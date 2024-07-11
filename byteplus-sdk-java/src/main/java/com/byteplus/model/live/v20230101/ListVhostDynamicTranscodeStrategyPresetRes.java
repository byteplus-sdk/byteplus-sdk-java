package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDynamicTranscodeStrategyPresetRes
 */
@lombok.Data
public final class ListVhostDynamicTranscodeStrategyPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostDynamicTranscodeStrategyPresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostDynamicTranscodeStrategyPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
