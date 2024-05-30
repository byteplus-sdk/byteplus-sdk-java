package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTranscodePresetPatchByAdminRes
 */
@lombok.Data
public final class DeleteTranscodePresetPatchByAdminRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteTranscodePresetPatchByAdminResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteTranscodePresetPatchByAdminResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
