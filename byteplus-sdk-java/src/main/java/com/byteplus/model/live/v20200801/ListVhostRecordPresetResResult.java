package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRecordPresetResResult
 */
@lombok.Data
public final class ListVhostRecordPresetResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostRecordPresetResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
