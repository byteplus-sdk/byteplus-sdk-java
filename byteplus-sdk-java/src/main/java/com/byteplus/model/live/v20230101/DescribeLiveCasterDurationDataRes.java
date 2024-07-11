package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveCasterDurationDataRes
 */
@lombok.Data
public final class DescribeLiveCasterDurationDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveCasterDurationDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveCasterDurationDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
