package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeUserAgentAccessRuleRes
 */
@lombok.Data
public final class DescribeUserAgentAccessRuleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeUserAgentAccessRuleResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeUserAgentAccessRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
