package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateProxyConfigBody
 */
@lombok.Data
public final class CreateProxyConfigBody  {

    /**
     * <p>代理名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>配置级别，overall:全局，single:单客户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigLevel")
    private String configLevel;

    /**
     * <p>代理模式，0：固定模式，1：解析模式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mode")
    private Integer mode;

    /**
     * <p>描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>生效类型，1：默认生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EffectType")
    private Integer effectType;

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>是否与账号关联，associate:关联</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AssociateType")
    private String associateType;

    /**
     * <p>代理列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyConfigList")
    private List<CreateProxyConfigBodyProxyConfigListItem> proxyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
