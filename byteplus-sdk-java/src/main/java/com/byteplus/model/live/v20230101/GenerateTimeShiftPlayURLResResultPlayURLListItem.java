package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GenerateTimeShiftPlayURLResResultPlayURLListItem
 */
@lombok.Data
public final class GenerateTimeShiftPlayURLResResultPlayURLListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BackupPlayURL")
    private String backupPlayURL;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MainPlayURL")
    private String mainPlayURL;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URLExpire")
    private String uRLExpire;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
