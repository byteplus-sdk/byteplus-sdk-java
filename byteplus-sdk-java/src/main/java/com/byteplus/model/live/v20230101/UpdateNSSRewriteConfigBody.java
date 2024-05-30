package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateNSSRewriteConfigBody
 */
@lombok.Data
public final class UpdateNSSRewriteConfigBody  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>服务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>是否开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>debug</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DebugHeader")
    private String debugHeader;

    /**
     * <p>具体的配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Config")
    private List<String> config;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
