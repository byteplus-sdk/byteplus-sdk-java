package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListProxyConfigRes
 */
@lombok.Data
public final class ListProxyConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListProxyConfigResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListProxyConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
