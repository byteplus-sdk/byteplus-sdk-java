package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostDynamicTranscodeStrategyPresetResResult
 */
@lombok.Data
public final class ListVhostDynamicTranscodeStrategyPresetResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostDynamicTranscodeStrategyPresetResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
