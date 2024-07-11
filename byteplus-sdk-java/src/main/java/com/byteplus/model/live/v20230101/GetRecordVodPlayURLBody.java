package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetRecordVodPlayURLBody
 */
@lombok.Data
public final class GetRecordVodPlayURLBody  {

    /**
     * <p>vod的vid</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VID")
    private String vID;

    /**
     * <p>文件的格式 m3u8,mp4,flv</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>vid所对应的account_Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
