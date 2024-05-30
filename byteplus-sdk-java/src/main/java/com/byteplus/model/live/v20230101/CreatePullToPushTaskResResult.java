package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullToPushTaskResResult
 */
@lombok.Data
public final class CreatePullToPushTaskResResult  {

    /**
     * <p>任务 ID，任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
