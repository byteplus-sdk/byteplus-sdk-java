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
     * <p>操作类型，1：激活，2：恢复，3：彻底删除</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>状态，0：未激活，1：激活，2：审批，3：过期，4：删除，5：试用过期，6：正式过期，7：试用激活，8：彻底删除</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>要迁移的目标账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TargetAccountID")
    private String targetAccountID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
