package com.byteplus.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SmsTemplateInfo {
    @JSONField(name = "Id")
    String id;
    @JSONField(name = "ApplyId")
    String applyId;
    @JSONField(name = "TemplateId")
    String templateId;
    @JSONField(name = "ChannelType")
    String channelType;
    @JSONField(name = "ChannelTypeName")
    String channelTypeName;
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "Content")
    String content;
    @JSONField(name = "Status")
    int status;
    @JSONField(name = "IsOrder")
    boolean isOrder = true;
    @JSONField(name = "Reason")
    String reason;
    @JSONField(name = "CreatedTime")
    int createdTime;
    @JSONField(name = "ShortUrlConfig")
    ShortUrlConfig shortUrlConfig;
}
