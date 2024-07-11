package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamSessionDataRes
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveStreamSessionDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveStreamSessionDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
