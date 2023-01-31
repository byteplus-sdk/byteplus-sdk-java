package com.byteplus.example.rtc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class StartRecordResponse {
    @JSONField(name = "Result")
    String Result;
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
}
