package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListReferenceInfoResResultReferenceInfosItem
 */
@lombok.Data
public final class ListReferenceInfoResResultReferenceInfosItem  {

    /**
     * <p>引用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>引用类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>服务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>配置块名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateName")
    private String templateName;

    /**
     * <p>具体配置的值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
