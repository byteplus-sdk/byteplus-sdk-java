package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateDynamicTranscodeStrategyPresetBody
 */
@lombok.Data
public final class UpdateDynamicTranscodeStrategyPresetBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>热流阈值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerThreshold")
    private Integer triggerThreshold;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
