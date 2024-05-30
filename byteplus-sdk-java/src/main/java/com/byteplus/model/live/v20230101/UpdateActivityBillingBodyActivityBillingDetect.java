package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateActivityBillingBodyActivityBillingDetect
 */
@lombok.Data
public final class UpdateActivityBillingBodyActivityBillingDetect  {

    /**
     * <p>日峰值带宽突发增长量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthIncrCondition")
    private UpdateActivityBillingBodyActivityBillingDetectBandwidthIncrCondition bandwidthIncrCondition;

    /**
     * <p>请求数场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestBandwidthCondition")
    private UpdateActivityBillingBodyActivityBillingDetectRequestBandwidthCondition requestBandwidthCondition;

    /**
     * <p>突发增长量场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthCondition")
    private UpdateActivityBillingBodyActivityBillingDetectBandwidthCondition bandwidthCondition;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
