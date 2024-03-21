package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityBasicConfigAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateActivityBasicConfigAPIResponseResult result;

    @Data
    static class UpdateActivityBasicConfigAPIResponseResult {
        @JSONField(name = "ActivityId")
        public Long activityId;

        @JSONField(name = "ActivityIdStr")
        public String activityIdStr;
    }
}
