package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteDenseSnapshotPresetBody
 */
@lombok.Data
public final class DeleteDenseSnapshotPresetBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>密集抽帧截图配置模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
