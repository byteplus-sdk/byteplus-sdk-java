package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateServiceBody
 */
@lombok.Data
public final class CreateServiceBody  {

    /**
     * <p>公司名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompanyName")
    private String companyName;

    /**
     * <p>联系人姓名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContactPerson")
    private String contactPerson;

    /**
     * <p>联系人号码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContactNumber")
    private String contactNumber;

    /**
     * <p>业务领域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BusinessArea")
    private String businessArea;

    /**
     * <p>业务场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BusinessScene")
    private String businessScene;

    /**
     * <p>需要人工审批与否，默认需要审批</p>
     *
     * <p>auto: 不需要审批</p>
     *
     * <p>reserve：需要审批</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
