package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateUserAgentAccessRuleBodyUaAccessRule
 */
@lombok.Data
public final class UpdateUserAgentAccessRuleBodyUaAccessRule  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowEmpty")
    private Boolean allowEmpty;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserAgent")
    private List<String> userAgent;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
