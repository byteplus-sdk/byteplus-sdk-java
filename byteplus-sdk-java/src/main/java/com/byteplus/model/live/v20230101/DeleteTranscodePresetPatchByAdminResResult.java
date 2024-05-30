package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteTranscodePresetPatchByAdminResResult
 */
@lombok.Data
public final class DeleteTranscodePresetPatchByAdminResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModuleDeployTasks")
    private List<Object> moduleDeployTasks;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
