package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribePresetAssociationResResultListItemLiveDynamicTransStrategyListItem
 */
@lombok.Data
public final class DescribePresetAssociationResResultListItemLiveDynamicTransStrategyListItem  {

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>转码后缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>地区</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceType")
    private String sourceType;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
