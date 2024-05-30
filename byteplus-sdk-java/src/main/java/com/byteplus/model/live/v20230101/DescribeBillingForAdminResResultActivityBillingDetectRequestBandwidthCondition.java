package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForAdminResResultActivityBillingDetectRequestBandwidthCondition
 */
@lombok.Data
public final class DescribeBillingForAdminResResultActivityBillingDetectRequestBandwidthCondition  {

    /**
     * <p>1：开启，0：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Switch")
    private Integer mySwitch;

    /**
     * <p>请求数超过近一个月的日峰月均值的x倍，增加倍速</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestLoop")
    private Float requestLoop;

    /**
     * <p>日峰月均值不低于 xx 的场景,日峰值月平均带宽，单位Gbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bandwidth")
    private Float bandwidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
