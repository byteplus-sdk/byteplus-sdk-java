package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCDNTrafficDataRes
 */
@lombok.Data
public final class DescribeCDNTrafficDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeCDNTrafficDataResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeCDNTrafficDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
