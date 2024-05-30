package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateActivityBillingBodyActivityBillingDetectBandwidthCondition
 */
@lombok.Data
public final class UpdateActivityBillingBodyActivityBillingDetectBandwidthCondition  {

    /**
     * <p>1：开启，0：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Switch")
    private Integer mySwitch;

    /**
     * <p>突发增长量超过最近一个月日峰月均带宽值的x，增长倍数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthIncrLoop")
    private Float bandwidthIncrLoop;

    /**
     * <p>增量数值超过 xx 的场景xx,单位Gbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthIncr")
    private Float bandwidthIncr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
