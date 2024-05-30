package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateAppResResult
 */
@lombok.Data
public final class CreateAppResResult  {

    /**
     * <p>appid</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private Integer appID;

    /**
     * <p>appKey</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppKey")
    private String appKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
