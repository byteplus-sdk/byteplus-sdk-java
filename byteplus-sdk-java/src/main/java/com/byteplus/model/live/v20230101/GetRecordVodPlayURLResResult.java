package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetRecordVodPlayURLResResult
 */
@lombok.Data
public final class GetRecordVodPlayURLResResult  {

    /**
     * <p>播放URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlayURL")
    private String playURL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
