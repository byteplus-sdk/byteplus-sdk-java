package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAuditDataResResultAuditDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveAuditDataResResultAuditDetailDataListItem  {

    /**
     * <p>按域名维度进行数据拆分时的域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>按维度进行数据拆分后，当前维度的截图审核总张数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDataList")
    private List<DescribeLiveAuditDataResResultAuditDetailDataListItemAuditDataListItem> auditDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
