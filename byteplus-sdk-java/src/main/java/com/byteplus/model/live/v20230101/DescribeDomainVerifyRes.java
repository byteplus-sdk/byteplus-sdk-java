package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDomainVerifyRes
 */
@lombok.Data
public final class DescribeDomainVerifyRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeDomainVerifyResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeDomainVerifyResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
