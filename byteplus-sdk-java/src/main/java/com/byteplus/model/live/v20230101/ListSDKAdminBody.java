package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListSDKAdminBody
 */
@lombok.Data
public final class ListSDKAdminBody  {

    /**
     * <p>每页大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private String pageSize;

    /**
     * <p>页码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private String pageNum;

    /**
     * <p>sdk 记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>应用ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private String appID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BundleID")
    private String bundleID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseID")
    private String licenseID;

    /**
     * <p>SDK版本，精简版：1、互动版：2</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDKVersion")
    private String sDKVersion;

    /**
     * <p>状态，0：未激活，1：激活，2：审批，3：过期，4：删除，5：试用过期，6：正式过期，7：试用激活，8：彻底删除</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private List<Integer> status;

    /**
     * <p>购买方式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellType")
    private String sellType;

    /**
     * <p>应用名称，支持模糊搜索</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
