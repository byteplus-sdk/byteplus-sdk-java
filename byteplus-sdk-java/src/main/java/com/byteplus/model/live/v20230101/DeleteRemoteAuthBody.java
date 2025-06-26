package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRemoteAuthBody
 */
@lombok.Data
public final class DeleteRemoteAuthBody  {

    /**
     * <p>域名空间，您可以调用[ListVhostRemoteAuth](https://www.volcengine.com/docs/6469/1250148)接口查看远程鉴权配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名，您可以调用[ListVhostRemoteAuth](https://www.volcengine.com/docs/6469/1250148)接口查看远程鉴权配置的 `Domain` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
