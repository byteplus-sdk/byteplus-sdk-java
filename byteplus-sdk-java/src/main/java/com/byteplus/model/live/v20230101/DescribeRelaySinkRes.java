package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySinkRes
 */
@lombok.Data
public final class DescribeRelaySinkRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeRelaySinkResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeRelaySinkResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
