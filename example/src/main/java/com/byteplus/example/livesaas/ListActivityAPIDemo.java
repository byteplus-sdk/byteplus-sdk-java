package com.byteplus.example.livesaas;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.livesaas.ListActivityAPIRequest;
import com.byteplus.model.livesaas.ListActivityAPIResponse;
import com.byteplus.service.livesaas.LiveSaaSService;
import com.byteplus.service.livesaas.impl.LiveSaaSServiceImpl;

/**
 * 与Auth相关的demo
 */
public class ListActivityAPIDemo {
    public static void main(String[] args) {
        LiveSaaSService liveService = LiveSaaSServiceImpl.getInstance();
        liveService.setAccessKey("ak");
        liveService.setSecretKey("sk");
        
        ListActivityAPIRequest request = new ListActivityAPIRequest();
        try {
            ListActivityAPIResponse response = liveService.ListActivityAPI(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
