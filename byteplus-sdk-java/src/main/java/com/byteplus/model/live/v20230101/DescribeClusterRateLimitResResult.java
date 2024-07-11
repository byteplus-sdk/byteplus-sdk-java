package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeClusterRateLimitResResult
 */
@lombok.Data
public final class DescribeClusterRateLimitResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClusterRateLimitItemList")
    private List<DescribeClusterRateLimitResResultClusterRateLimitItemListItem> clusterRateLimitItemList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
