package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeBillingForAdminResResultActivityBilling
 */
@lombok.Data
public final class DescribeBillingForAdminResResultActivityBilling  {

    /**
     * <p>检测条件</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Detect")
    private DescribeBillingForAdminResResultActivityBillingDetect detect;

    /**
     * <p>活动条目列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Activity")
    private List<DescribeBillingForAdminResResultActivityBillingActivityItem> activity;

    /**
     * <p>当前配置是否生效，1：生效，0：不生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Switch")
    private Integer mySwitch;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
