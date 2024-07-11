package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDynamicTranscodeStrategyPresetDetailResResult
 */
@lombok.Data
public final class DescribeDynamicTranscodeStrategyPresetDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetDetailList")
    private List<DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItem> presetDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
