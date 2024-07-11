package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListRegionsResRegionListItemProvinceListItem
 */
@lombok.Data
public final class ListRegionsResRegionListItemProvinceListItem  {

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
