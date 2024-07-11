package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribePullToPushDataRes
 */
@lombok.Data
public final class DescribePullToPushDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribePullToPushDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribePullToPushDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
