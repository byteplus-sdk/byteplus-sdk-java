package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeFormatAccessRuleRes
 */
@lombok.Data
public final class DescribeFormatAccessRuleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeFormatAccessRuleResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeFormatAccessRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
