package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateProxyConfigBody
 */
@lombok.Data
public final class UpdateProxyConfigBody  {

    /**
     * <p>代理名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>代理记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

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
     * <p>代理列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyConfigList")
    private List<UpdateProxyConfigBodyProxyConfigListItem> proxyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
