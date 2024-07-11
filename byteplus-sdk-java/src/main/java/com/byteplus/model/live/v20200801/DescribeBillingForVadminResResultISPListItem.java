package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForVadminResResultISPListItem
 */
@lombok.Data
public final class DescribeBillingForVadminResResultISPListItem  {

    /**
     * <p>isp名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
