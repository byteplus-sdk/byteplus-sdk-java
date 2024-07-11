package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListAllStreamStateResResultListItem
 */
@lombok.Data
public final class ListAllStreamStateResResultListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流状态， "online"：在线、"offline"：不在线、"forbidden"：禁播</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "State")
    private String state;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
