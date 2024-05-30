package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCustomLogConfigRes
 */
@lombok.Data
public final class DescribeCustomLogConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeCustomLogConfigResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeCustomLogConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
