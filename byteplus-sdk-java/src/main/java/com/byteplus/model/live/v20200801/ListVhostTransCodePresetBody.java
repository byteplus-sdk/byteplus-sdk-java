package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostTransCodePresetBody
 */
@lombok.Data
public final class ListVhostTransCodePresetBody  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
