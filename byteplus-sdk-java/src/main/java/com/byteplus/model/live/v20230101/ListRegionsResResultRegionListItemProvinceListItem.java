package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListRegionsResResultRegionListItemProvinceListItem
 */
@lombok.Data
public final class ListRegionsResResultRegionListItemProvinceListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
