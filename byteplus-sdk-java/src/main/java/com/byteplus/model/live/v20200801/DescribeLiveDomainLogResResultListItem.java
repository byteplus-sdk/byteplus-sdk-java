package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveDomainLogResResultListItem
 */
@lombok.Data
public final class DescribeLiveDomainLogResResultListItem  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>日志文件名称，例如，www.example.com_2022_01_28_180000_190000.gz</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogName")
    private String logName;

    /**
     * <p>日志文件大小，单位为 byte</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogSize")
    private Integer logSize;

    /**
     * <p>日志文件对应小时区间，RFC3339 格式的 UTC 时间，精度为 s，例如，`2021-12-31T14:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateTime")
    private String dateTime;

    /**
     * <p>文件下载链接</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
