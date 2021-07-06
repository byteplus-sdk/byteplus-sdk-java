package com.byteplus.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateActivityAPIResultBean result;

    @Data
    public static class CreateActivityAPIResultBean {
        @JSONField(name = "ActivityId")
        Long activityId;
    }
}
