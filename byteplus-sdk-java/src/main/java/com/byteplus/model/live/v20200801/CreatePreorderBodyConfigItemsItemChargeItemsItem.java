package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreatePreorderBodyConfigItemsItemChargeItemsItem
 */
@lombok.Data
public final class CreatePreorderBodyConfigItemsItemChargeItemsItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AttrValue")
    private String attrValue;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChargeItemCode")
    private String chargeItemCode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsPause")
    private Integer isPause;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ZoneCode")
    private String zoneCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
