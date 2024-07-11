package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DeletePullToPushTaskBody
 */
@lombok.Data
public final class DeletePullToPushTaskBody  {

    /**
     * <p>任务 ID，任务的唯一标识</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
