package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateAppBody
 */
@lombok.Data
public final class CreateAppBody  {

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
     * <p>地区，cn-north-1、as-singapore-1、us-east-1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>项目名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Project")
    private String project;

    /**
     * <p>app类型，WEB,APP,SERVICE,OTHERS</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppType")
    private String appType;

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
