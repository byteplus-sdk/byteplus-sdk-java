package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateDenyConfigBody
 */
@lombok.Data
public final class UpdateDenyConfigBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推/拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>App 的名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。Domain 和 App 二选一填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>黑白名单配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyConfigList")
    private List<UpdateDenyConfigBodyDenyConfigListItem> denyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
