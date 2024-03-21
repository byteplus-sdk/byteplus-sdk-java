package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetTemporaryLoginTokenAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetTemporaryLoginTokenAPIResponseResult result;

    @Data
    static class GetTemporaryLoginTokenAPIResponseResult {
        @JSONField(name = "SecretKey")
        String secretKey;

        @JSONField(name = "ActivityId")
        Long activityId;
    }

}
