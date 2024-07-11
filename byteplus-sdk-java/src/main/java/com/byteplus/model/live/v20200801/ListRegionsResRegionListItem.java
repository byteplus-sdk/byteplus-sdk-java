package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListRegionsResRegionListItem
 */
@lombok.Data
public final class ListRegionsResRegionListItem  {

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
    private List<ListRegionsResRegionListItemProvinceListItem> provinceList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
