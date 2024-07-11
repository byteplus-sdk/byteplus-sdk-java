package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UpdateTranscodePresetResResponseMetadataError
 */
@lombok.Data
public final class UpdateTranscodePresetResResponseMetadataError  {

    /**
     * <p>错误码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>错误信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
