package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListResourcePackageResResultListItem
 */
@lombok.Data
public final class ListResourcePackageResResultListItem  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>资源包名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>资源包ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageID")
    private String packageID;

    /**
     * <p>过期时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireTime")
    private String expireTime;

    /**
     * <p>资源包总容量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalAmount")
    private Float totalAmount;

    /**
     * <p>资源包剩余容量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvailableAmount")
    private Float availableAmount;

    /**
     * <p>是否已经绑定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BindStatus")
    private Integer bindStatus;

    /**
     * <p>状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>配置项</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    /**
     * <p>资源包单位</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Unit")
    private String unit;

    /**
     * <p>资源包类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseSourceType")
    private String licenseSourceType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
