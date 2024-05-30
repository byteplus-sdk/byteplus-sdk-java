package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteProxyConfigBody
 */
@lombok.Data
public final class DeleteProxyConfigBody  {

    /**
     * <p>记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
