package com.byteplus.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class AsyncRiskDetectionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AsyncRiskDetectionResult result;

    @Data
    public static class AsyncRiskDetectionResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
    }
}
