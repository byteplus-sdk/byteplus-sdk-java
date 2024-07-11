package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateUserAgentAccessRuleBody
 */
@lombok.Data
public final class UpdateUserAgentAccessRuleBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UaAccessRule")
    private UpdateUserAgentAccessRuleBodyUaAccessRule uaAccessRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
