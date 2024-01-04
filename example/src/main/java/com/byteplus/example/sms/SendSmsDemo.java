package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.GetSubAccountListRequest;
import com.byteplus.model.request.SmsSendRequest;
import com.byteplus.model.response.SmsSendResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.SmsServiceInfoConfig;
import com.byteplus.service.sms.impl.SmsServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class SendSmsDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions

        // call below method if you dont set ak and sk in ～/.byteplus/config

        SmsSendRequest req = new SmsSendRequest();
        req.setFrom("BytePlus");
        req.setSmsAccount("smsAccount");
        req.setPhoneNumbers("phoneNo");
        req.setTemplateId("templateId");
        //req.setTemplateParam("param");//{"code":"1234"}
        Map<String,String> param = new HashMap<>();
        param.put("content","第一行\n第二行");
        req.setTemplateParamByMap(new HashMap<>());
        req.setTag("tag");

        // If you have set up phone number encryption on the official website, you can set this configuration.
        // Not a mandatory parameter to set
        req.setEncryptName("encryptName");
        try {
            SmsSendResponse response = smsService.sendV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}