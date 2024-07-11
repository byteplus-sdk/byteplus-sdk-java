package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceV3ResResultRelaySourceConfigListItem
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResultRelaySourceConfigListItem  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>App名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>组的重试间隔/s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInterval")
    private String retryInterval;

    /**
     * <p>组的重试次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private String retryTimes;

    /**
     * <p>生效类型（order/rand/hot）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LBType")
    private String lBType;

    /**
     * <p>回源组配置详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupDetails")
    private List<DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItem> groupDetails;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
