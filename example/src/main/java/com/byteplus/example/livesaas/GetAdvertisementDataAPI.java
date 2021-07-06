package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.request.GetAdvertisementDataAPIRequest;
import com.byteplus.model.livesaas.response.GetAdvertisementDataAPIResponse;
import com.byteplus.service.livesaas.LivesaasService;
import com.byteplus.service.livesaas.impl.LivesaasServiceImpl;

public class GetAdvertisementDataAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            GetAdvertisementDataAPIRequest getAdvertisementDataAPIRequest = new GetAdvertisementDataAPIRequest();
            getAdvertisementDataAPIRequest.setActivityId(1691034607911981L);

            GetAdvertisementDataAPIResponse getAdvertisementDataAPIResponse = livesaasService.getAdvertisementDataAPI(getAdvertisementDataAPIRequest);
            System.out.println(JSON.toJSONString(getAdvertisementDataAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
