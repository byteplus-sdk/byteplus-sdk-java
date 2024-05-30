package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListProxyConfigBody
 */
@lombok.Data
public final class ListProxyConfigBody  {

    /**
     * <p>页大小</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>页码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
