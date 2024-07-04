package com.byteplus.model.beans;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionsWorkflowInput {
    @JSONField(name = "TemplateId")
    String templateId;

    @JSONField(name = "TemplateIds")
    String[] templateIds;
}