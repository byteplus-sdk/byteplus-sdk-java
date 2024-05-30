package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateActivityBillingBodyActivityBillingActivityItemFeeDetailListItem
 */
@lombok.Data
public final class UpdateActivityBillingBodyActivityBillingActivityItemFeeDetailListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProcDetailList")
    private List<UpdateActivityBillingBodyActivityBillingActivityItemFeeDetailListItemProcDetailListItem> procDetailList;

    /**
     * <p>协议</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
