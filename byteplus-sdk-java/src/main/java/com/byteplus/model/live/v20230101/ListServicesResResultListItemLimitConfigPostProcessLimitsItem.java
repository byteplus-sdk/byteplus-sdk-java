package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListServicesResResultListItemLimitConfigPostProcessLimitsItem
 */
@lombok.Data
public final class ListServicesResResultListItemLimitConfigPostProcessLimitsItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LimitType")
    private String limitType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LimitNum")
    private Integer limitNum;

    /**
     * <p>下发的Cluster， 不填默认按PRD给定的集群下发</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Clusters")
    private List<String> clusters;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
