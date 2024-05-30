package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSecretRes
 */
@lombok.Data
public final class DescribeCertDetailSecretRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeCertDetailSecretResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeCertDetailSecretResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
