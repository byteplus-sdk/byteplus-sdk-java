package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRelaySourceV2Body
 */
@lombok.Data
public final class DeleteRelaySourceV2Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成，缺省情况下表示查询全部应用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
