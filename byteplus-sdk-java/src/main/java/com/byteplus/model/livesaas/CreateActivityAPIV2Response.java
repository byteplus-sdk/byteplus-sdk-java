package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateActivityAPIV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    CreateActivityAPIV2ResponseResult result;

    @Data
    static class CreateActivityAPIV2ResponseResult {
        @JSONField(name = "ActivityId")
        public Long activityId;

        @JSONField(name = "ActivityIdStr")
        public String activityIdStr;
    }
}
