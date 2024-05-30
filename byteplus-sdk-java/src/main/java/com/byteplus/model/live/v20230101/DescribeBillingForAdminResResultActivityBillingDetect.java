package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForAdminResResultActivityBillingDetect
 */
@lombok.Data
public final class DescribeBillingForAdminResResultActivityBillingDetect  {

    /**
     * <p>日峰值带宽突发增长量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthIncrCondition")
    private DescribeBillingForAdminResResultActivityBillingDetectBandwidthIncrCondition bandwidthIncrCondition;

    /**
     * <p>请求数场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestBandwidthCondition")
    private DescribeBillingForAdminResResultActivityBillingDetectRequestBandwidthCondition requestBandwidthCondition;

    /**
     * <p>突发增长量场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthCondition")
    private DescribeBillingForAdminResResultActivityBillingDetectBandwidthCondition bandwidthCondition;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
