package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListAccountQuotaResResultAccountQuotaListItem
 */
@lombok.Data
public final class ListAccountQuotaResResultAccountQuotaListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LimitNum")
    private Integer limitNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CurrentNum")
    private Integer currentNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
