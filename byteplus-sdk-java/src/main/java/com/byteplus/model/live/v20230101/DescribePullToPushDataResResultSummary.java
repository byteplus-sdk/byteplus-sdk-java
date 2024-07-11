package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribePullToPushDataResResultSummary
 */
@lombok.Data
public final class DescribePullToPushDataResResultSummary  {

    /**
     * <p>查询范围内拉流转推总时长，单位分钟，保留小数点后 2 位</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDuration")
    private Float totalDuration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
