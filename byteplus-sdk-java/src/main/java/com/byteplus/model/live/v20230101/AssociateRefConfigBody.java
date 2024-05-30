package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * AssociateRefConfigBody
 */
@lombok.Data
public final class AssociateRefConfigBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>App 与 Domain 二选一填</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>App 与 Domain 二选一填</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>引用名，若已存在相同类型的引用会直接覆盖</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
