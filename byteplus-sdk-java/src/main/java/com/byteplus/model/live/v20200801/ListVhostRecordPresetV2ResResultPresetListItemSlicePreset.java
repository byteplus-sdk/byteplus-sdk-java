package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetV2ResResultPresetListItemSlicePreset
 */
@lombok.Data
public final class ListVhostRecordPresetV2ResResultPresetListItemSlicePreset  {

    /**
     * <p>模板 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>录制模板详细配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPresetConfig")
    private ListVhostRecordPresetV2ResResultPresetListItemSlicePresetRecordPresetConfig recordPresetConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
