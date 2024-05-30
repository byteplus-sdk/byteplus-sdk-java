package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLatencyConfigResResult
 */
@lombok.Data
public final class DescribeLatencyConfigResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LatencyConfigList")
    private List<DescribeLatencyConfigResResultLatencyConfigListItem> latencyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
