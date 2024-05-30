package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DisassociateRefConfigBody
 */
@lombok.Data
public final class DisassociateRefConfigBody  {

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
     * <p>引用名，若不存在该引用绑定会直接报错</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
