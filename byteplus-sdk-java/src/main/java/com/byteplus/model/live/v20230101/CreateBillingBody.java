package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateBillingBody
 */
@lombok.Data
public final class CreateBillingBody  {

    /**
     * <p>标准直播计费项，支持以下取值</p>
     *
     * <p>live-traffic: 日流量月结</p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结</p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结</p>
     *
     * <p>live-bandwidth-daily：直播日峰值带宽日结</p>
     *
     * <p>live-traffic-daily：直播流量日结</p>
     *
     * <p>live-bandwidth-95daily：直播日95带宽日结</p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费</p>
     *
     * <p>live-month-bandwidth-inner：对内客户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingType")
    private String billingType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
