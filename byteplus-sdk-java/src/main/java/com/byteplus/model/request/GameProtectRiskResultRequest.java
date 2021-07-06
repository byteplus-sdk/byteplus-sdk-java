package com.byteplus.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GameProtectRiskResultRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "StartTime")
    Integer startTime;
    @JSONField(name = "EndTime")
    Integer endTime;
    @JSONField(name = "PageNum")
    Integer pageNum;
    @JSONField(name = "PageSize")
    Integer pageSize;
}
