package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteSDKBody
 */
@lombok.Data
public final class DeleteSDKBody  {

    /**
     * <p>库记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>应用ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private Integer appID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
