package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchStreamTrafficDataRes
 */
@lombok.Data
public final class DescribeLiveBatchStreamTrafficDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveBatchStreamTrafficDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveBatchStreamTrafficDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
