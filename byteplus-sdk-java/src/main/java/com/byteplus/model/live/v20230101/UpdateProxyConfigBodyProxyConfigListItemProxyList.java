package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateProxyConfigBodyProxyConfigListItemProxyList
 */
@lombok.Data
public final class UpdateProxyConfigBodyProxyConfigListItemProxyList  {

    /**
     * <p>地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>权重</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Weight")
    private Integer weight;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
