package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeAppIDParamsAvailableRes
 */
@lombok.Data
public final class DescribeAppIDParamsAvailableRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeAppIDParamsAvailableResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeAppIDParamsAvailableResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
