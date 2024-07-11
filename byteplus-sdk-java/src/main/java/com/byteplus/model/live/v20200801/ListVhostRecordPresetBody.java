package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetBody
 */
@lombok.Data
public final class ListVhostRecordPresetBody  {

    /**
     * <p>域名空间名称。</p>
     *
     * <p>参数 `Domain` 和 `Vhost`传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播录制的存储类型。默认值为 tos，支持以下取值。vod：录制文件存在</p>
     *
     * <p>VoD；tos：录制文件存在 ToS。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
