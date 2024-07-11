package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRegionAccessRuleRes
 */
@lombok.Data
public final class DescribeRegionAccessRuleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeRegionAccessRuleResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeRegionAccessRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
