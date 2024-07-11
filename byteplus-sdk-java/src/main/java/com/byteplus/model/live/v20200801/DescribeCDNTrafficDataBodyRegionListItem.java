package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCDNTrafficDataBodyRegionListItem
 */
@lombok.Data
public final class DescribeCDNTrafficDataBodyRegionListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
