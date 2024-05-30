package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForAdminResResultActivityBillingDetectBandwidthIncrCondition
 */
@lombok.Data
public final class DescribeBillingForAdminResResultActivityBillingDetectBandwidthIncrCondition  {

    /**
     * <p>1：开启，0：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Switch")
    private Integer mySwitch;

    /**
     * <p>日峰值带宽突发增长量大于 xx 的场景，增量带宽，单位Gbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthIncr")
    private Float bandwidthIncr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
