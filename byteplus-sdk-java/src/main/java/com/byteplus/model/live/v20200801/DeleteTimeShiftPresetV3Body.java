package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTimeShiftPresetV3Body
 */
@lombok.Data
public final class DeleteTimeShiftPresetV3Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
