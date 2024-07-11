package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeClusterRateLimitRes
 */
@lombok.Data
public final class DescribeClusterRateLimitRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeClusterRateLimitResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeClusterRateLimitResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
