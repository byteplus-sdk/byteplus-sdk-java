package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RestartPullToPushTaskBody
 */
@lombok.Data
public final class RestartPullToPushTaskBody  {

    /**
     * <p>任务 ID，任务的唯一标识，您可以通过[获取拉流转推任务列表](https://www.volcengine.com/docs/6469/1126896)接口获取状态为停用的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
