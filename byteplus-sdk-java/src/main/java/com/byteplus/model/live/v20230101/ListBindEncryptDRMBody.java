package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListBindEncryptDRMBody
 */
@lombok.Data
public final class ListBindEncryptDRMBody  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>app</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
