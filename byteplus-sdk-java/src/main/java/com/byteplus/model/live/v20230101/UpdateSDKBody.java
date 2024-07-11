package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSDKBody
 */
@lombok.Data
public final class UpdateSDKBody  {

    /**
     * <p>sdk记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>App名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>App英文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppNameEN")
    private String appNameEN;

    /**
     * <p>SDK版本，精简版：1、互动版：2，已经弃用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKVersion")
    private Integer sDKVersion;

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
