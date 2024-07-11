package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListSDKResResultListItem
 */
@lombok.Data
public final class ListSDKResResultListItem  {

    /**
     * <p>sdk记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>应用英文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppNameEn")
    private String appNameEn;

    /**
     * <p>应用ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private Integer appID;

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
     * <p>状态，0：未激活，1：已激活，2：审核中，3：已过期</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>//SDK版本，精简版：1、互动版：2</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKVersion")
    private Integer sDKVersion;

    /**
     * <p>License下载地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseURL")
    private String licenseURL;

    /**
     * <p>证书ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseID")
    private String licenseID;

    /**
     * <p>激活时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActiveTime")
    private String activeTime;

    /**
     * <p>过期时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireTime")
    private String expireTime;

    /**
     * <p>购买方式，1：人工开通，2：线上购买</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellType")
    private Integer sellType;

    /**
     * <p>流量包ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageID")
    private String packageID;

    /**
     * <p>申请时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyTime")
    private String applyTime;

    /**
     * <p>操作时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OperateTime")
    private String operateTime;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>操作者</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OperateUser")
    private String operateUser;

    /**
     * <p>License类型，1：基础版本，2：高级版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseType")
    private Integer licenseType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
