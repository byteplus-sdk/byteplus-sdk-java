package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForAdminResResultActivityBillingActivityItemFeeDetailListItemProcDetailListItem
 */
@lombok.Data
public final class DescribeBillingForAdminResResultActivityBillingActivityItemFeeDetailListItemProcDetailListItem  {

    /**
     * <p>区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AreaName")
    private String areaName;

    /**
     * <p>带宽，单位Gbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bandwidth")
    private Float bandwidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
