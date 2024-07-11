package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeStreamQuotaConfigRes
 */
@lombok.Data
public final class DescribeStreamQuotaConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeStreamQuotaConfigResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeStreamQuotaConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
