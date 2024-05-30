package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListSDKBody
 */
@lombok.Data
public final class ListSDKBody  {

    /**
     * <p>每页大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>页码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>sdk 记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>应用ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private Integer appID;

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
    private Integer sDKVersion;

    /**
     * <p>状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private List<Integer> status;

    /**
     * <p>购买方式,1:线上，2：线下</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellType")
    private Integer sellType;

    /**
     * <p>license类型：1：基础版，2：高级版，3：试用版，0：无版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseType")
    private Integer licenseType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
