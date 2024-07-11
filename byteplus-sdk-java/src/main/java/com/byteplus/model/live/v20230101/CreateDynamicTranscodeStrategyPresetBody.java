package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateDynamicTranscodeStrategyPresetBody
 */
@lombok.Data
public final class CreateDynamicTranscodeStrategyPresetBody  {

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

    /**
     * <p>转码后缀，生效类型为转码时必填，必须事先创建相应后缀的转码模板，一个后缀只能创建一个策略模板。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>生效类型。</p>
     *
     * <p>- trans：转码</p>
     *
     * <p>- origin：源流</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EffectiveType")
    private String effectiveType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
