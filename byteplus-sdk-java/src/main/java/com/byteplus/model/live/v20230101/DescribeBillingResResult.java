package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingResResult
 */
@lombok.Data
public final class DescribeBillingResResult  {

    /**
     * <p>标准直播计费项，支持以下取值<br></p>
     *
     * <p>live-traffic: 日流量月结<br></p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结<br></p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结<br></p>
     *
     * <p>live-bandwidth-daily：直播日峰值带宽日结<br></p>
     *
     * <p>live-traffic-daily：直播流量日结<br></p>
     *
     * <p>live-bandwidth-95daily：直播日95带宽日结<br></p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费<br></p>
     *
     * <p>live-month-bandwidth-95average：按带宽日95峰月平均计费<br></p>
     *
     * <p>live-month-bandwidth-inner：对内客户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingType")
    private String billingType;

    /**
     * <p>国内低延迟直播计费项，不填跟随国内标准直播取值，月结时支持以下取值<br></p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结<br></p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结<br></p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费<br></p>
     *
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingTypeRTM")
    private String billingTypeRTM;

    /**
     * <p>订单状态</p>
     *
     * <p>- 0：正常</p>
     *
     * <p>- 1：正在开通</p>
     *
     * <p>- 2：没有开通</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingStatus")
    private Integer billingStatus;

    /**
     * <p>最新更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastUpdateTime")
    private String lastUpdateTime;

    /**
     * <p>下个月生效的计费方式，取值与BillingType相同</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingTypeNextMonth")
    private String billingTypeNextMonth;

    /**
     * <p>状态。</p>
     *
     * <p>- 0：正常</p>
     *
     * <p>- 1：删除</p>
     *
     * <p>- 2：需要人工审批</p>
     *
     * <p>- 3：试用</p>
     *
     * <p>- 4：欠费关停</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>海外标准直播计费方式，0：拆分大区计费，1：海外统一计费，默认为0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaChargeMode")
    private Integer overseaChargeMode;

    /**
     * <p>海外标准直播计费项，不填跟随国内标准直播取值，BillingType为日结方式时，该值必须与BillingType相同，如果为月结方式，则支持以下取值：<br></p>
     *
     * <p>live-day-bandwidth：带宽日峰值月结<br></p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结<br></p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费<br></p>
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
     * <p>live-day-bandwidth：带宽日峰值月结<br></p>
     *
     * <p>live-month-bandwidth：带宽月95峰值月结<br></p>
     *
     * <p>live-month-bandwidth-average：按日峰值月平均计费<br></p>
     *
     * <p>live-month-bandwidth-95average：日95峰月平均计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaBillingTypeRTM")
    private String overseaBillingTypeRTM;

    /**
     * <p>自定义计费方式，入参为以为样式marshal后的json串：<br></p>
     *
     * <p>{"key1":"value1","key2":"value2"}<br></p>
     *
     * <p>key和value取值参考：[【数据工程】FCDN控制台 v2.1.0 技术评审](https://bytedance.feishu.cn/docx/Dqkvd8WAgogvjwxwlMpcW9HznIg)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CustomBilling")
    private String customBilling;

    /**
     * <p>国内Quic直播计费项，不填跟随国内标准直播取值，月结时支持以下取值</p>
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

    /**
     * <p>海外Quic直播计费方式，0：拆分大区计费，1：海外统一计费，默认为0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaChargeModeQuic")
    private Integer overseaChargeModeQuic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
