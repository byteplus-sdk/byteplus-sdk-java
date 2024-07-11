package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DeleteSnapshotAuditPresetBody
 */
@lombok.Data
public final class DeleteSnapshotAuditPresetBody  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>App 名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>审核模版名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
