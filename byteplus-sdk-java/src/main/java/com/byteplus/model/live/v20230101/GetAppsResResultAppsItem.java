package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetAppsResResultAppsItem
 */
@lombok.Data
public final class GetAppsResResultAppsItem  {

    /**
     * <p>APPID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private Integer appID;

    /**
     * <p>app英文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppEnName")
    private String appEnName;

    /**
     * <p>app中文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppCnName")
    private String appCnName;

    /**
     * <p>bundleID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BundleID")
    private String bundleID;

    /**
     * <p>packageName</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
