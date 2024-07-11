package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveMetricOriginDataBody
 */
@lombok.Data
public final class DescribeLiveMetricOriginDataBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "total")
    private Integer total;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "data")
    private List<DescribeLiveMetricOriginDataBodyDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
