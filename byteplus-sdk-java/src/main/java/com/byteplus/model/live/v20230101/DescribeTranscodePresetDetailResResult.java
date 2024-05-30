package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeTranscodePresetDetailResResult
 */
@lombok.Data
public final class DescribeTranscodePresetDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetDetailList")
    private DescribeTranscodePresetDetailResResultPresetDetailList presetDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
