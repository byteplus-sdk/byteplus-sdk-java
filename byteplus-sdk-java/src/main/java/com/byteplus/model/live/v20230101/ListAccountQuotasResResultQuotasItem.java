package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListAccountQuotasResResultQuotasItem
 */
@lombok.Data
public final class ListAccountQuotasResResultQuotasItem  {

    /**
     * <p>Quota Code</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaCode")
    private String quotaCode;

    /**
     * <p>单位</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Unit")
    private String unit;

    /**
     * <p>描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>配额</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    /**
     * <p>用量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UsageValue")
    private Integer usageValue;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
