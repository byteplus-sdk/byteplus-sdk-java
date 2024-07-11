package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeBillingForVadminBody
 */
@lombok.Data
public final class DescribeBillingForVadminBody  {

    /**
     * <p>用户账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
