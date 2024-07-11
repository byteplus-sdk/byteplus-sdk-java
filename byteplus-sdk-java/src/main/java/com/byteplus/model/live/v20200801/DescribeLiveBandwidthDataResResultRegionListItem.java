package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBandwidthDataResResultRegionListItem
 */
@lombok.Data
public final class DescribeLiveBandwidthDataResResultRegionListItem  {

    /**
     * <p>大区，映射关系请参见[区域映射](https://www.volcengine.com/docs/6469/114196)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>国家，映射关系请参见[区域映射](https://www.volcengine.com/docs/6469/114196)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>国内为省，国外暂不支持该参数，映射关系请参见[区域映射](https://www.volcengine.com/docs/6469/114196)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
