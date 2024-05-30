package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLicenseDRMQuery
 */
@lombok.Data
public final class DescribeLicenseDRMQuery  {

    /**
     * <p>app</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>DRM加密的类型枚举，可以取fp（代表fairplay）或wv（代表widevine）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DRMType")
    private String dRMType;

    /**
     * <p>拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>流名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamName")
    private String streamName;

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
