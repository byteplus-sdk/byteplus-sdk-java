package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateDenyConfigV2Body
 */
@lombok.Data
public final class UpdateDenyConfigV2Body  {

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
     * <p>需要设置 IP 黑白名单的推/拉流域名。域名请在工信部完成备案。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>服务类型, pull: 拉流，push：推流</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>黑白名单配置详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyConfigList")
    private List<UpdateDenyConfigV2BodyDenyConfigListItem> denyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
