package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListRegionsRes
 */
@lombok.Data
public final class ListRegionsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<ListRegionsResRegionListItem> regionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
