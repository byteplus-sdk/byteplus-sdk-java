package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.Collections;

public class CreateRuleEngineTemplate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            String ruleJson = "{\"IfBlock\":{\"SubRules\":[],\"Actions\":[{\"Action\":\"request_header\",\"Stage\":\"client_request\",\"Phase\":1,\"Module\":1,\"Groups\":[{\"Dimension\":\"request_header\",\"GroupParameters\":[{\"Parameters\":[{\"Name\":\"action\",\"Values\":[\"set\"]},{\"Name\":\"header_name\",\"Values\":[\"key1\"]},{\"Name\":\"header_value\",\"Values\":[\"value2\"]}]}]}]}],\"Condition\":{\"IsGroup\":true,\"Connective\":\"and\",\"ConditionGroups\":[{\"IsGroup\":true,\"Connective\":\"and\",\"ConditionGroups\":[{\"IsGroup\":false,\"Condition\":{\"Object\":\"http_referer\",\"Operator\":\"equal\",\"Value\":[\"value1\"],\"IgnoreCase\":true}}]}]}}}";
            CDN.CreateRuleEngineTemplateRequest req = new CDN.CreateRuleEngineTemplateRequest()
                    .setTitle("example")
                    .setMessage("test")
                    .setProject("default")
                    .setRule(ruleJson);
            CDN.CreateRuleEngineTemplateResponse resp = service.createRuleEngineTemplate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
