package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPostProcessTaskDetailResResult
 */
@lombok.Data
public final class ListPostProcessTaskDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ListPostProcessTaskDetailResult")
    private ListPostProcessTaskDetailResResultListPostProcessTaskDetailResult listPostProcessTaskDetailResult;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
