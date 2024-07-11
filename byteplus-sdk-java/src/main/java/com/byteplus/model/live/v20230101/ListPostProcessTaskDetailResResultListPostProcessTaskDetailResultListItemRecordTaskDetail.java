package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemRecordTaskDetail
 */
@lombok.Data
public final class ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemRecordTaskDetail  {

    /**
     * <p>录制文件名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>录制文件时长，单位ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>录制文件大小，单位byte</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    /**
     * <p>下载地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadURL")
    private String downloadURL;

    /**
     * <p>录制类型 vod/tos</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
