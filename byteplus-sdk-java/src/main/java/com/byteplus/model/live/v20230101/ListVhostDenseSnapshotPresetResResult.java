package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostDenseSnapshotPresetResResult
 */
@lombok.Data
public final class ListVhostDenseSnapshotPresetResResult  {

    /**
     * <p>模板列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostDenseSnapshotPresetResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
