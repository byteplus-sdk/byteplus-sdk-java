package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribePresetAssociationResResultListItemAvextractorPresetListV2Item
 */
@lombok.Data
public final class DescribePresetAssociationResResultListItemAvextractorPresetListV2Item  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompositionSubtitle")
    private String compositionSubtitle;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeshiftSubtitle")
    private String timeshiftSubtitle;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
