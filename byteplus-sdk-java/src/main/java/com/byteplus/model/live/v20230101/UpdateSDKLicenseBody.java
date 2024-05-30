package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSDKLicenseBody
 */
@lombok.Data
public final class UpdateSDKLicenseBody  {

    /**
     * <p>SDK记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>流量包ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageID")
    private String packageID;

    /**
     * <p>操作类型，1：续签，2：转正（sdk记录只能为试用版），3：延期（sdk的记录只能为试用版）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>licenseID,续签和转正必填</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseID")
    private Integer licenseID;

    /**
     * <p>license类型，1:基础版，2：高级版，3：试用版</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseType")
    private Integer licenseType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
