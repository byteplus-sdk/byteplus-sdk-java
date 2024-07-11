package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemSnapshotTaskDetail
 */
@lombok.Data
public final class ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemSnapshotTaskDetail  {

    /**
     * <p>截图间隔</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Long interval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
