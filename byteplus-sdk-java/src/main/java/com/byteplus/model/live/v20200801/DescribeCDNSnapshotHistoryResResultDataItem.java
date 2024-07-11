package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCDNSnapshotHistoryResResultDataItem
 */
@lombok.Data
public final class DescribeCDNSnapshotHistoryResResultDataItem  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>截图文件保存的路径</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Path")
    private String path;

    /**
     * <p>文件大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileSize")
    private Float fileSize;

    /**
     * <p>截图时间戳</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>视频宽度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>视频高度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
