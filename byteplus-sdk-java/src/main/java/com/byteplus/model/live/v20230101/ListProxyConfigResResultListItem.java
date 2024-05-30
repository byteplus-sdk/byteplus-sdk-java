package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListProxyConfigResResultListItem
 */
@lombok.Data
public final class ListProxyConfigResResultListItem  {

    /**
     * <p>记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>配置级别，overall:全局，single:单客户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigLevel")
    private String configLevel;

    /**
     * <p>名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>代理模式，0：固定模式，1：解析模式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mode")
    private Integer mode;

    /**
     * <p>生效模式，1：默认生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EffectType")
    private Integer effectType;

    /**
     * <p>描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyConfigList")
    private List<ListProxyConfigResResultListItemProxyConfigListItem> proxyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
