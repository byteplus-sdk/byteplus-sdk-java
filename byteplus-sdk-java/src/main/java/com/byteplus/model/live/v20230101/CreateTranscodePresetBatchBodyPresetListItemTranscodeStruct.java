package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateTranscodePresetBatchBodyPresetListItemTranscodeStruct
 */
@lombok.Data
public final class CreateTranscodePresetBatchBodyPresetListItemTranscodeStruct  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ABTest")
    private Map<String, CreateTranscodePresetBatchBodyPresetListItemTranscodeStructABTest> aBTest;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Codec")
    private String codec;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopInterval")
    private Integer stopInterval;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>标记模版是否为hlsabr</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsHlsAbr")
    private Boolean isHlsAbr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
