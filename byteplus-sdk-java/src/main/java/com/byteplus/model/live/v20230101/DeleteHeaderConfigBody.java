package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteHeaderConfigBody
 */
@lombok.Data
public final class DeleteHeaderConfigBody  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>header类型，支持hls,flv,dash</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderType")
    private String headerType;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
