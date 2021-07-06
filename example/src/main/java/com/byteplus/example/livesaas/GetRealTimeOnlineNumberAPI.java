package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.request.CommonAPIRequest;
import com.byteplus.model.livesaas.response.GetRealTimeOnlineNumberAPIResponse;
import com.byteplus.service.livesaas.LivesaasService;
import com.byteplus.service.livesaas.impl.LivesaasServiceImpl;

public class GetRealTimeOnlineNumberAPI {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        livesaasService.setAccessKey("");
        livesaasService.setSecretKey("");
        // list users
        try {
            CommonAPIRequest commonAPIRequest = new CommonAPIRequest();
            commonAPIRequest.setActivityId(1691034607911981L);

            GetRealTimeOnlineNumberAPIResponse getRealTimeOnlineNumberAPIResponse = livesaasService.getRealTimeOnlineNumberAPI(commonAPIRequest);
            System.out.println(JSON.toJSONString(getRealTimeOnlineNumberAPIResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
