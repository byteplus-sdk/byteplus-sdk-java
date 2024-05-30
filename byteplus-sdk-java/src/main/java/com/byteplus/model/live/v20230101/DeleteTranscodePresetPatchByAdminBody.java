package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteTranscodePresetPatchByAdminBody
 */
@lombok.Data
public final class DeleteTranscodePresetPatchByAdminBody  {

    /**
     * <p>操作的类型，associate: 删除模板的同时取消关联，create: 只删除模板</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<DeleteTranscodePresetPatchByAdminBodyPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
