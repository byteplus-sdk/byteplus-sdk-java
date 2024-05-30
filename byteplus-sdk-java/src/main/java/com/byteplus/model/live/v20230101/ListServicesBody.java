package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListServicesBody
 */
@lombok.Data
public final class ListServicesBody  {

    /**
     * <p>页码大小 [1~1000]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private String pageNum;

    /**
     * <p>分页大小 [1~1000]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private String pageSize;

    /**
     * <p>用户账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>公司名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompanyName")
    private String companyName;

    /**
     * <p>联系人名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContactPerson")
    private String contactPerson;

    /**
     * <p>联系人号码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContactNumber")
    private String contactNumber;

    /**
     * <p>用户创建的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
