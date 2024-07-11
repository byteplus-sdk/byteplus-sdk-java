package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * StopSimulationTaskBody
 */
@lombok.Data
public final class StopSimulationTaskBody  {

    /**
     * <p>推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>转码后缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
