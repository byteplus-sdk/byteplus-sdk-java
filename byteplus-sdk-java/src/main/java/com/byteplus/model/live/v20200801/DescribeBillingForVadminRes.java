package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForVadminRes
 */
@lombok.Data
public final class DescribeBillingForVadminRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeBillingForVadminResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeBillingForVadminResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
