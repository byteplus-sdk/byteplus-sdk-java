package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.request.CommonAPIRequest;
import com.byteplus.model.livesaas.response.GetStreamsAPIResponse;
import com.byteplus.service.livesaas.LivesaasService;
import com.byteplus.service.livesaas.impl.LivesaasServiceImpl;

public class GetStreamsAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            CommonAPIRequest commonAPIRequest = new CommonAPIRequest();
            commonAPIRequest.setActivityId(1690743605747741L);

            GetStreamsAPIResponse getStreamsAPIResponse = livesaasService.getStreamsAPI(commonAPIRequest);
            System.out.println(JSON.toJSONString(getStreamsAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
