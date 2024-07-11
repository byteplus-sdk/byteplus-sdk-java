package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePullToPushLogResResultLogListItem
 */
@lombok.Data
public final class DescribeLivePullToPushLogResResultLogListItem  {

    /**
     * <p>日志文件名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogName")
    private String logName;

    /**
     * <p>日志文件大小，单位为 byte</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogSize")
    private Integer logSize;

    /**
     * <p>日志记录的数据时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateTime")
    private String dateTime;

    /**
     * <p>日志下载链接</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
