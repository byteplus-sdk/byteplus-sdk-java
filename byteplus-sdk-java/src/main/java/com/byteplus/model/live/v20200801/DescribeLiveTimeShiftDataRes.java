package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTimeShiftDataRes
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveTimeShiftDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveTimeShiftDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
