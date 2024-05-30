package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeAppIDParamsAvailableBody
 */
@lombok.Data
public final class DescribeAppIDParamsAvailableBody  {

    /**
     * <p>英文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppEnName")
    private String appEnName;

    /**
     * <p>中文名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppCnName")
    private String appCnName;

    /**
     * <p>应用ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppID")
    private Integer appID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
