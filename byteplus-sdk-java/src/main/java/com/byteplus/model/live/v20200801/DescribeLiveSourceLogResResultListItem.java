package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceLogResResultListItem
 */
@lombok.Data
public final class DescribeLiveSourceLogResResultListItem  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>日志下载链接</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    /**
     * <p>日志记录的数据时间，RFC3339 格式的 UTC 时间，精度为 s，例如，2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateTime")
    private String dateTime;

    /**
     * <p>日志大小，单位字节</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogSize")
    private Integer logSize;

    /**
     * <p>日志文件名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogName")
    private String logName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
