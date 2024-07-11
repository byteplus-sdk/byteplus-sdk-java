package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCDNTrafficDataResResultTrafficTotalDataItem
 */
@lombok.Data
public final class DescribeCDNTrafficDataResResultTrafficTotalDataItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Traffic")
    private Float traffic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
