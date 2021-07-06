package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.request.CommonAPIRequest;
import com.byteplus.model.livesaas.response.GetActivityAPIResponse;
import com.byteplus.service.livesaas.LivesaasService;
import com.byteplus.service.livesaas.impl.LivesaasServiceImpl;

public class GetActivityAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            CommonAPIRequest commonAPIRequest = new CommonAPIRequest();
            commonAPIRequest.setActivityId(1690743605747741L);

            GetActivityAPIResponse getActivityAPIResponse = livesaasService.getActivityAPI(commonAPIRequest);
            System.out.println(JSON.toJSONString(getActivityAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
