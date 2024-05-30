package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDenseSnapshotPresetResResultPresetListItemDenseSnapshotPreset
 */
@lombok.Data
public final class ListVhostDenseSnapshotPresetResResultPresetListItemDenseSnapshotPreset  {

    /**
     * <p>密集抽帧截图配置模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>截图在 ToS 中的存储位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>密集抽帧截图配置模版的开启状态。</p>
     *
     * <p>- 1：开启</p>
     *
     * <p>- 0：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>回调地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    /**
     * <p>veImageX 的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceID")
    private String serviceID;

    /**
     * <p>截图间隔时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
