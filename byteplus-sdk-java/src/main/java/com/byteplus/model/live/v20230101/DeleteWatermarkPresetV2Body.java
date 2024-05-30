package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteWatermarkPresetV2Body
 */
@lombok.Data
public final class DeleteWatermarkPresetV2Body  {

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>模板ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
