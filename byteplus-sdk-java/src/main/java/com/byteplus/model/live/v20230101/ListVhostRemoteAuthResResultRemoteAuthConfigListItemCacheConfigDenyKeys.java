package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRemoteAuthResResultRemoteAuthConfigListItemCacheConfigDenyKeys
 */
@lombok.Data
public final class ListVhostRemoteAuthResResultRemoteAuthConfigListItemCacheConfigDenyKeys  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamName")
    private String paramName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
