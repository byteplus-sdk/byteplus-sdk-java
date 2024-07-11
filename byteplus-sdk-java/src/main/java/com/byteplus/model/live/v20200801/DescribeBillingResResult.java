package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingResResult
 */
@lombok.Data
public final class DescribeBillingResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingStatus")
    private Integer billingStatus;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingType")
    private String billingType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingTypeNextMonth")
    private String billingTypeNextMonth;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingTypeRTM")
    private String billingTypeRTM;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CustomBilling")
    private String customBilling;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstanceNo")
    private String instanceNo;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastUpdateTime")
    private String lastUpdateTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaBillingType")
    private String overseaBillingType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaBillingTypeRTM")
    private String overseaBillingTypeRTM;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaChargeMode")
    private Integer overseaChargeMode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverseaChargeModeRTM")
    private Integer overseaChargeModeRTM;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubOrder")
    private String subOrder;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
