package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRecordPresetResResultPresetListItem
 */
@lombok.Data
public final class ListVhostRecordPresetResResultPresetListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SlicePreset")
    private List<ListVhostRecordPresetResResultPresetListItemSlicePresetItem> slicePreset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
