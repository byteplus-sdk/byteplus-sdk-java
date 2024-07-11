package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetBodyCallbackDetailListItem
 */
@lombok.Data
public final class CreateRecordPresetBodyCallbackDetailListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackType")
    private String callbackType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
