package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.ConversionRequest;
import com.byteplus.model.response.ConversionResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ConversionDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance("ap-singapore-1");

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AccessKey");
        smsService.setSecretKey("SecretKey");
        ConversionRequest req = new ConversionRequest();
        List<String> messageIDs = new ArrayList<>();
        messageIDs.add("test_msg_id");
        req.setMessageIDs(messageIDs);
        try {
            ConversionResponse response = smsService.conversion(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
