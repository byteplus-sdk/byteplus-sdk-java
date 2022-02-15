package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SmsSendRequest;
import com.byteplus.model.response.SmsSendResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

public class SendSmsDemo {

    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SmsSendRequest req = new SmsSendRequest();
        req.setSign("signature");
        req.setSmsAccount("smsAccount");
        req.setPhoneNumbers("phoneNo");
        req.setTemplateId("templateId");
        req.setTemplateParam("param");//{"code":"1234"}
        req.setTag("tag");
        try {
            SmsSendResponse response = smsService.send(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}