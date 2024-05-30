package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingMonthAvailableResResult
 */
@lombok.Data
public final class DescribeBillingMonthAvailableResResult  {

    /**
     * <p>true: 支持，false：不支持</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MonthAvailable")
    private Boolean monthAvailable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
