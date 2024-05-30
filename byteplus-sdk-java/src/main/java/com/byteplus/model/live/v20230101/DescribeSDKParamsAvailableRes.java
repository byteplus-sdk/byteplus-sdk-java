package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeSDKParamsAvailableRes
 */
@lombok.Data
public final class DescribeSDKParamsAvailableRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeSDKParamsAvailableResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeSDKParamsAvailableResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
