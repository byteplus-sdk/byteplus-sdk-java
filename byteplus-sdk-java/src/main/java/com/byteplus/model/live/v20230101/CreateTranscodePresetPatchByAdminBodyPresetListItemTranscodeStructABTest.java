package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetPatchByAdminBodyPresetListItemTranscodeStructABTest
 */
@lombok.Data
public final class CreateTranscodePresetPatchByAdminBodyPresetListItemTranscodeStructABTest  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Label")
    private Integer label;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ratio")
    private Integer ratio;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
