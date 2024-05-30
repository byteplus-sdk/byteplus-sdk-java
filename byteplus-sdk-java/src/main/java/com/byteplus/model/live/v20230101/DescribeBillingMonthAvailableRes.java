package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingMonthAvailableRes
 */
@lombok.Data
public final class DescribeBillingMonthAvailableRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeBillingMonthAvailableResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeBillingMonthAvailableResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
