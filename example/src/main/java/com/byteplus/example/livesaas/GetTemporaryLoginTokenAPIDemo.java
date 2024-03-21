package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.GetTemporaryLoginTokenAPIRequest;
import com.byteplus.model.livesaas.GetTemporaryLoginTokenAPIResponse;
import com.byteplus.service.livesaas.LiveSaaSService;
import com.byteplus.service.livesaas.impl.LiveSaaSServiceImpl;

/**
 * 与Auth相关的demo
 */
public class GetTemporaryLoginTokenAPIDemo {
    public static void main(String[] args) {
        LiveSaaSService liveService = LiveSaaSServiceImpl.getInstance();
        liveService.setAccessKey("ak");
        liveService.setSecretKey("sk");

        GetTemporaryLoginTokenAPIRequest request = new GetTemporaryLoginTokenAPIRequest();
        request.setActivityId(1783257554462721l);
        try {
            GetTemporaryLoginTokenAPIResponse response = liveService.GetTemporaryLoginTokenAPI(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
