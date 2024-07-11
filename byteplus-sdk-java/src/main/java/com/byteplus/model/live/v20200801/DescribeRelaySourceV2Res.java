package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceV2Res
 */
@lombok.Data
public final class DescribeRelaySourceV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeRelaySourceV2ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeRelaySourceV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
