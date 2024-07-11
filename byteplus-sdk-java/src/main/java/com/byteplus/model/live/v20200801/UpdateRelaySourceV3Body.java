package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV3Body
 */
@lombok.Data
public final class UpdateRelaySourceV3Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>组的重试间隔/s，不填默认为1s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInterval")
    private String retryInterval;

    /**
     * <p>组的重试次数，不填默认等于group数-1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private String retryTimes;

    /**
     * <p>生效类型（order/rand/hot），不填默认order</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LBType")
    private String lBType;

    /**
     * <p>回源组配置详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupDetails")
    private List<UpdateRelaySourceV3BodyGroupDetailsItem> groupDetails;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
