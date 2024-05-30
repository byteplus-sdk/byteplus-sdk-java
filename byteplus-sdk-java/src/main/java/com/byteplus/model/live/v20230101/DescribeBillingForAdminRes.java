package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForAdminRes
 */
@lombok.Data
public final class DescribeBillingForAdminRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeBillingForAdminResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeBillingForAdminResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
