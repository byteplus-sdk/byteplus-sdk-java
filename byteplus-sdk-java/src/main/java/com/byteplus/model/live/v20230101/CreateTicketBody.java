package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateTicketBody
 */
@lombok.Data
public final class CreateTicketBody  {

    /**
     * <p>服务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>命名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Namespace")
    private String namespace;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TicketType")
    private Integer ticketType;

    /**
     * <p>灰度分组参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupParam")
    private CreateTicketBodyGroupParam groupParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkFlowParams")
    private CreateTicketBodyWorkFlowParams workFlowParams;

    /**
     * <p>配置块信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigList")
    private List<CreateTicketBodyConfigListItem> configList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
