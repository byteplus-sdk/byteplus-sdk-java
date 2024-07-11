package com.byteplus.model.live.v20200801;


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
    private String iD;

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
     * <p>SDK版本，精简版：1、互动版：2</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKVersion")
    private String sDKVersion;

    /**
     * <p>操作类型，1：激活</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>License 类型,1:基础版本，2：高级版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseType")
    private String licenseType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
