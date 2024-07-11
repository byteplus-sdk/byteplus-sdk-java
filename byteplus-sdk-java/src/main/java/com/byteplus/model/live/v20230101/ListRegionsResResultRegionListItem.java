package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListRegionsResResultRegionListItem
 */
@lombok.Data
public final class ListRegionsResResultRegionListItem  {

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

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProvinceList")
    private List<ListRegionsResResultRegionListItemProvinceListItem> provinceList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
