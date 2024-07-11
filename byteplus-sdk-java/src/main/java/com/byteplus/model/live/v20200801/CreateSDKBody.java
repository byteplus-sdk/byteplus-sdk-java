package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateSDKBody
 */
@lombok.Data
public final class CreateSDKBody  {

    /**
     * <p>应用名称,长度小于129</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>应用英文名称，长度小于31</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppNameEN")
    private String appNameEN;

    /**
     * <p>应用ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private String appID;

    /**
     * <p>包名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>BundleID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BundleID")
    private String bundleID;

    /**
     * <p>SDK版本，精简版：1，互动版：2</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKVersion")
    private String sDKVersion;

    /**
     * <p>流量包ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageID")
    private String packageID;

    /**
     * <p>License 类型,1:基础版本，2：高级版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseType")
    private Integer licenseType;

    /**
     * <p>应用类型，App, Web二选一，默认不填为App</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKType")
    private String sDKType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
