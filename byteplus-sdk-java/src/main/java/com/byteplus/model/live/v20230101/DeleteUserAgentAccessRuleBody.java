package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteUserAgentAccessRuleBody
 */
@lombok.Data
public final class DeleteUserAgentAccessRuleBody  {

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
