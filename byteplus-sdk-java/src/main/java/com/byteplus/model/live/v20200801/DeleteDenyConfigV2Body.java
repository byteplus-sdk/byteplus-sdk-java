package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DeleteDenyConfigV2Body
 */
@lombok.Data
public final class DeleteDenyConfigV2Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推/拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
