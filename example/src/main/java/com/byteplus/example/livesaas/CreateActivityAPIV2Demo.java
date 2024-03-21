package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.CreateActivityAPIV2Request;
import com.byteplus.model.livesaas.CreateActivityAPIV2Response;
import com.byteplus.service.livesaas.LiveSaaSService;
import com.byteplus.service.livesaas.impl.LiveSaaSServiceImpl;

/**
 * 与Auth相关的demo
 */
public class CreateActivityAPIV2Demo {
    public static void main(String[] args) {
        LiveSaaSService liveService = LiveSaaSServiceImpl.getInstance();
        liveService.setAccessKey("ak");
        liveService.setSecretKey("sk");

        CreateActivityAPIV2Request request = new CreateActivityAPIV2Request();
        request.setName("Test123Demo");
        try {
            CreateActivityAPIV2Response response = liveService.CreateActivityAPIV2(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
