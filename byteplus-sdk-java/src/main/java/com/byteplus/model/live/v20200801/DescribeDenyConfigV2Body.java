package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDenyConfigV2Body
 */
@lombok.Data
public final class DescribeDenyConfigV2Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>App名称，app和domain二选一填</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>推/拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>服务类型，pull：拉流，push：推流</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
