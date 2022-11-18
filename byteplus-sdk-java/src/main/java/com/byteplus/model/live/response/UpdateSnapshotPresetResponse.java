package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateSnapshotPresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
