package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SmsSendVerifyCodeRequest;
import com.byteplus.model.response.SmsSendResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

public class SendSmsVerifyCodeDemo {
    public static void main(String[] args) {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AccessKey");
        smsService.setSecretKey("SecretKey");

        SmsSendVerifyCodeRequest req = new SmsSendVerifyCodeRequest();
        req.setSign("signature");
        req.setSmsAccount("smsAccount");
        req.setPhoneNumber("phoneNo");
        req.setTemplateId("templateId");
        req.setScene("Test");
        req.setExpireTime(240);
        req.setTryCount(3);
        req.setCodeType(6);

        // If you have set up phone number encryption on the official website, you can set this configuration.
        // Not a mandatory parameter to set
        req.setEncryptName("encryptName");
        try {
            SmsSendResponse respones = smsService.sendVerifyCode(req);
            System.out.println(JSON.toJSONString(respones));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
