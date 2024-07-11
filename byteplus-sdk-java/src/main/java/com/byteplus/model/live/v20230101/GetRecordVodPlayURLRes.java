package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetRecordVodPlayURLRes
 */
@lombok.Data
public final class GetRecordVodPlayURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetRecordVodPlayURLResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetRecordVodPlayURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
