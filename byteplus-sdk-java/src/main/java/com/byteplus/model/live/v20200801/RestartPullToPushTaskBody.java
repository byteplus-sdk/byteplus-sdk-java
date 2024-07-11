package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * RestartPullToPushTaskBody
 */
@lombok.Data
public final class RestartPullToPushTaskBody  {

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
