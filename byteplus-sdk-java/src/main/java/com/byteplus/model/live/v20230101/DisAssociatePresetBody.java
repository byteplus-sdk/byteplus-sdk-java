package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DisAssociatePresetBody
 */
@lombok.Data
public final class DisAssociatePresetBody  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>app名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>模板类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetType")
    private String presetType;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
