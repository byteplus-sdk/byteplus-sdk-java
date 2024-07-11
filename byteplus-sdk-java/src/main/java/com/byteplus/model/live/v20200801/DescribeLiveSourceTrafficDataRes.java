package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceTrafficDataRes
 */
@lombok.Data
public final class DescribeLiveSourceTrafficDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveSourceTrafficDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveSourceTrafficDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
