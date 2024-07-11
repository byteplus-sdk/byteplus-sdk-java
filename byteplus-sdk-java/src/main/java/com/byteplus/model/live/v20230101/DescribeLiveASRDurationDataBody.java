package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveASRDurationDataBody
 */
@lombok.Data
public final class DescribeLiveASRDurationDataBody  {

    /**
     * <p>域名列表，默认为空，表示查询您视频直播产品下所有域名下产生的 AI 语音转字幕时长用量数据。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>应用名称列表，取值与直播流地址中 AppName 字段取值相同，默认为空，表示查询所有应用名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppList")
    private List<String> appList;

    /**
     * <p>AI 语音转字幕时，语音的语言类型，取值及含义如下所示。</p>
     *
     * <p>- `ZH`：中文；</p>
     *
     * <p>- `EN`：英文；</p>
     *
     * <p>- `JA`：日文；</p>
     *
     * <p>- `KO`：韩文。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRSourceType")
    private String aSRSourceType;

    /**
     * <p>AI 语音转字幕时，字幕的语言类型，取值及含义如下所示。</p>
     *
     * <p>- `ZH`：中文；</p>
     *
     * <p>- `EN`：英文；</p>
     *
     * <p>- `JA`：日文；</p>
     *
     * <p>- `KO`：韩文。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>ASRTargetTypeList 和 ASRSourceType 必须同时指定。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRTargetTypeList")
    private List<String> aSRTargetTypeList;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒，支持的时间粒度如下所示。</p>
     *
     *
     *
     * <p>- `300`：（默认值）5 分钟。时间粒度为 5 分钟时，单次查询最大时间跨度为 31 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- `3600`：1 小时。时间粒度为 1 小时时，单次查询最大时间跨度为 93 天，历史查询时间范围为 93 天；</p>
     *
     * <p>- `86400`：1 天。时间粒度为 1 天时，单次查询最大时间跨度为 93 天，历史查询时间范围为 93 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
