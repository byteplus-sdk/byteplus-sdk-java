package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataResResult
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResult  {

    /**
     * <p>拉流域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>运营商</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>CDN 节点 IP 所属区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLivePlayStatusCodeDataResResultRegionListItem> regionList;

    /**
     * <p>客户端 IP 所属区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserRegionList")
    private List<DescribeLivePlayStatusCodeDataResResultUserRegionListItem> userRegionList;

    /**
     * <p>起始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>按状态码区分的数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SummaryStatusList")
    private List<DescribeLivePlayStatusCodeDataResResultSummaryStatusListItem> summaryStatusList;

    /**
     * <p>按指定时间粒度聚合的状态码数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStatusDataList")
    private List<DescribeLivePlayStatusCodeDataResResultTotalStatusDataListItem> totalStatusDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
