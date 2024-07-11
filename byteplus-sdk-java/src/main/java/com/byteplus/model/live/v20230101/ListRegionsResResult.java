package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListRegionsResResult
 */
@lombok.Data
public final class ListRegionsResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<ListRegionsResResultRegionListItem> regionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
