package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateActivityBillingBody
 */
@lombok.Data
public final class UpdateActivityBillingBody  {

    /**
     * <p>不填则更新为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActivityBilling")
    private UpdateActivityBillingBodyActivityBilling activityBilling;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
