package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceRewriteRes
 */
@lombok.Data
public final class DescribeRelaySourceRewriteRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeRelaySourceRewriteResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeRelaySourceRewriteResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
