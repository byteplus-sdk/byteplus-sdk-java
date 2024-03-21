package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.UpdateActivityBasicConfigAPIRequest;
import com.byteplus.model.livesaas.UpdateActivityBasicConfigAPIResponse;
import com.byteplus.service.livesaas.LiveSaaSService;
import com.byteplus.service.livesaas.impl.LiveSaaSServiceImpl;

/**
 * 与Auth相关的demo
 */
public class UpdateActivityBasicConfigAPIDemo {
    public static void main(String[] args) {
        LiveSaaSService liveService = LiveSaaSServiceImpl.getInstance();
        liveService.setAccessKey("ak");
        liveService.setSecretKey("sk");
        
        UpdateActivityBasicConfigAPIRequest request = new UpdateActivityBasicConfigAPIRequest();
        request.setActivityId(1793578085726257l);
        request.setName("Test123Demo123");
        try {
            UpdateActivityBasicConfigAPIResponse response = liveService.UpdateActivityBasicConfigAPI(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
