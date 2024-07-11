package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertBindStatusRes
 */
@lombok.Data
public final class DescribeCertBindStatusRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeCertBindStatusResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeCertBindStatusResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
