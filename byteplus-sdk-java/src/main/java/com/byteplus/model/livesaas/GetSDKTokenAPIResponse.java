package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetSDKTokenAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    
    @JSONField(name = "Result")
    GetSDKTokenAPIResponseResult result;

    @Data
    static class GetSDKTokenAPIResponseResult {
        @JSONField(name = "Token")
        public String token;
    }

}
