package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.GetSDKTokenAPIRequest;
import com.byteplus.model.livesaas.GetSDKTokenAPIResponse;
import com.byteplus.service.livesaas.LiveSaaSService;
import com.byteplus.service.livesaas.impl.LiveSaaSServiceImpl;

/**
 * 与Auth相关的demo
 */
public class GetSDKTokenAPIDemo {
    public static void main(String[] args) {
        LiveSaaSService liveService = LiveSaaSServiceImpl.getInstance();
        liveService.setAccessKey("ak");
        liveService.setSecretKey("sk");
        
        GetSDKTokenAPIRequest request = new GetSDKTokenAPIRequest();
        request.setActivityId(1783257554462721l);
        request.setMode(1l);
        try {
            GetSDKTokenAPIResponse response = liveService.GetSDKTokenAPI(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
