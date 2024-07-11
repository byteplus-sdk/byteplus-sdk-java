package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSceretV2Res
 */
@lombok.Data
public final class DescribeCertDetailSceretV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeCertDetailSceretV2ResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeCertDetailSceretV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
