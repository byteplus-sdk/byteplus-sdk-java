package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDenyConfigBody
 */
@lombok.Data
public final class DescribeDenyConfigBody  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>App的名称，由 1 到 30</p>
     *
     * <p>位数字、字母、下划线及"-"和"."组成。domain和app二选一填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
