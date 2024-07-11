package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDynamicTranscodeStrategyPresetDetailBody
 */
@lombok.Data
public final class DescribeDynamicTranscodeStrategyPresetDetailBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<String> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
