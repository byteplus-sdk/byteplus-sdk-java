package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetBodyTranscodeStructABTest
 */
@lombok.Data
public final class CreateTranscodePresetBodyTranscodeStructABTest  {

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
