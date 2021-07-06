package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.request.CreateActivityAPIRequest;
import com.byteplus.model.livesaas.response.CreateActivityAPIResponse;
import com.byteplus.service.livesaas.LivesaasService;
import com.byteplus.service.livesaas.impl.LivesaasServiceImpl;

public class CreateActivityAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            CreateActivityAPIRequest createActivityAPIRequest = new CreateActivityAPIRequest();
            createActivityAPIRequest.setLiveTime(System.currentTimeMillis()/1000L);
            createActivityAPIRequest.setName("example");
            System.out.println(JSON.toJSONString(createActivityAPIRequest));

            CreateActivityAPIResponse createActivityAPIResponse = livesaasService.createActivityAPI(createActivityAPIRequest);
            System.out.println(JSON.toJSONString(createActivityAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
