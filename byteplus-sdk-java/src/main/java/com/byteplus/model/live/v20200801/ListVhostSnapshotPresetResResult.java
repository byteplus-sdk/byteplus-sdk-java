package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostSnapshotPresetResResult
 */
@lombok.Data
public final class ListVhostSnapshotPresetResResult  {

    /**
     * <p>模版列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostSnapshotPresetResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
