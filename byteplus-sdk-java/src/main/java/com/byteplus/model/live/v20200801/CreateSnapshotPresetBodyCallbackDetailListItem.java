package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateSnapshotPresetBodyCallbackDetailListItem
 */
@lombok.Data
public final class CreateSnapshotPresetBodyCallbackDetailListItem  {

    /**
     * <p>回调类型。默认值为 http</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackType")
    private String callbackType;

    /**
     * <p>回调地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
