package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRefererResResultRefererListItem
 */
@lombok.Data
public final class DescribeRefererResResultRefererListItem  {

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>Referer 防盗链详情列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefererInfoList")
    private List<DescribeRefererResResultRefererListItemRefererInfoListItem> refererInfoList;

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
