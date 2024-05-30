package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetBatchBodyPresetListItemTranscodeStructABTest
 */
@lombok.Data
public final class CreateTranscodePresetBatchBodyPresetListItemTranscodeStructABTest  {

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
