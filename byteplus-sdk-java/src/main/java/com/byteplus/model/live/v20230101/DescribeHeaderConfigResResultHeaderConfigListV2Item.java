package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHeaderConfigResResultHeaderConfigListV2Item
 */
@lombok.Data
public final class DescribeHeaderConfigResResultHeaderConfigListV2Item  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RealJSON")
    private String realJSON;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderDetailList")
    private List<DescribeHeaderConfigResResultHeaderConfigListV2ItemHeaderDetailListItem> headerDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
