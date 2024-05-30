package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateBillingBody
 */
@lombok.Data
public final class UpdateBillingBody  {

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
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     *
     * <p>live-month-bandwidth-inner：对内客户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingType")
    private String billingType;

    /**
     * <p>低延迟直播计费项，不填跟随标准直播取值，支持以下取值</p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结</p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结</p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费</p>
     *
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingTypeRTM")
    private String billingTypeRTM;

    /**
     * <p>海外标准直播计费方式，0：拆分大区计费，1：海外统一计费，默认为0 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaChargeMode")
    private Integer overseaChargeMode;

    /**
     * <p>海外标准直播计费项，不填跟随国内标准直播取值，BillingType为日结方式时，该值必须与BillingType相同，如果为月结方式，则支持以下取值：</p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结</p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结</p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费</p>
     *
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaBillingType")
    private String overseaBillingType;

    /**
     * <p>海外低延迟直播计费方式，0：拆分大区计费，1：海外统一计费，默认为0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaChargeModeRTM")
    private Integer overseaChargeModeRTM;

    /**
     * <p>海外低延迟直播计费项，不填跟随国内标准直播取值，月结时支持以下取值</p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结</p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结</p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费</p>
     *
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaBillingTypeRTM")
    private String overseaBillingTypeRTM;

    /**
     * <p>自定义计费方式，入参为以为样式marshal后的json串：</p>
     *
     * <p>{"key1":"value1","key2":"value2"}</p>
     *
     * <p>key和value取值参考：[数据工程](https://bytedance.larkoffice.com/docx/Dqkvd8WAgogvjwxwlMpcW9HznIg)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CustomBilling")
    private String customBilling;

    /**
     * <p>低延迟直播计费项，不填跟随标准直播取值，支持以下取值</p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结</p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结</p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费</p>
     *
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingTypeQuic")
    private String billingTypeQuic;

    /**
     * <p>海外Quic直播计费方式，0：拆分大区计费，1：海外统一计费，默认为0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaChargeModeQuic")
    private Integer overseaChargeModeQuic;

    /**
     * <p>海外Quic直播计费项，不填跟随国内标准直播取值，月结时支持以下取值</p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结</p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结</p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费</p>
     *
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaBillingTypeQuic")
    private String overseaBillingTypeQuic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
