package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRecordDataBody
 */
@lombok.Data
public final class DescribeLiveRecordDataBody  {

    /**
     * <p>域名列表，缺省情况表示当前用户的所有推拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒，支持的时间粒度如下所示。  </p>
     *
     * <p>- 300：（默认值）5 分钟。时间粒度为 5 分钟时，单次查询最大时间跨度为 31 天，历史查询最大时间范围为 366 天； </p>
     *
     * <p>- 3600：1 小时。时间粒度为 1 小时时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天； </p>
     *
     * <p>- 86400：1 天。时间粒度为 1 天时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，缺省情况下不进行数据拆分，支持的维度如下所示。</p>
     *
     * <p>- Domain：域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>配置数据拆分维度时，对应的维度参数需传入多个值时会返回按维度进行拆分的数据；对应的维度只传入一个值时不返回按维度进行拆分的数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>查询流粒度数据时的应用名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>使用 `App` 构造请求时，需同时定义 `Stream` 参数，不可缺省。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>查询流粒度数据时的流名称，</p>
     *
     * <p>:::tip</p>
     *
     * <p>使用 `Stream` 构造请求时，需同时定义 `App` 参数，不可缺省。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
