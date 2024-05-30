package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostTransCodePresetBody
 */
@lombok.Data
public final class ListVhostTransCodePresetBody  {

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>是否是hls abr 请求</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsHlsAbr")
    private Boolean isHlsAbr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
