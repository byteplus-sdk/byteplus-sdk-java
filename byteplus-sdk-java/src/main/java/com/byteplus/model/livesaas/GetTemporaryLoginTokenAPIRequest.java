package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetTemporaryLoginTokenAPIRequest {
    @JSONField(name = "ActivityId")
    Long activityId;
}
