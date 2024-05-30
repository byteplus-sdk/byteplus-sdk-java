package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveFreeTimeIntervalResResult
 */
@lombok.Data
public final class DescribeLiveFreeTimeIntervalResResult  {

    /**
     * <p>闲时时间段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreeTime")
    private String freeTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
