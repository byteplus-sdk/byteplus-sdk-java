package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteTranscodePresetBatchBody
 */
@lombok.Data
public final class DeleteTranscodePresetBatchBody  {

    /**
     * <p>associate create hls-abr</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>删除模版的信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<DeleteTranscodePresetBatchBodyPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
