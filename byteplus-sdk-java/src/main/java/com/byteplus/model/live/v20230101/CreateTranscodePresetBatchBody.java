package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateTranscodePresetBatchBody
 */
@lombok.Data
public final class CreateTranscodePresetBatchBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<CreateTranscodePresetBatchBodyPresetListItem> presetList;

    /**
     * <p>create associate hls-abr</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
