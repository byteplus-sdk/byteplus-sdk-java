package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateAppBody
 */
@lombok.Data
public final class UpdateAppBody  {

    /**
     * <p>appid</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private Integer appID;

    /**
     * <p>应用名称中文名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppCnName")
    private String appCnName;

    /**
     * <p>应用名称英文名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppEnName")
    private String appEnName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
