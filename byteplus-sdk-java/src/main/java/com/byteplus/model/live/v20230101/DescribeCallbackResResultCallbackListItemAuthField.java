package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * DescribeCallbackResResultCallbackListItemAuthField
 */
@lombok.Data
public final class DescribeCallbackResResultCallbackListItemAuthField  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthKeyPrimary")
    private String authKeyPrimary;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthKeySecond")
    private String authKeySecond;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdditionalProperties")
    private Map<String, String> additionalProperties;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
