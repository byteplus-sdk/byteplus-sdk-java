package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPostProcessTaskDetailRes
 */
@lombok.Data
public final class ListPostProcessTaskDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListPostProcessTaskDetailResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListPostProcessTaskDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
