package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateRelaySourceV4ResResult
 */
@lombok.Data
public final class CreateRelaySourceV4ResResult  {

    /**
     * <p>固定回源的任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
