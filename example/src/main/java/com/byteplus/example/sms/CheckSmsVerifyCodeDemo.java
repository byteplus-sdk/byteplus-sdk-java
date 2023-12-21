package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SmsCheckVerifyCodeRequest;
import com.byteplus.model.response.SmsCheckVerifyCodeResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

public class CheckSmsVerifyCodeDemo {
    public static void main(String[] args) {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AccessKey");
        smsService.setSecretKey("SecretKey");

        SmsCheckVerifyCodeRequest req = new SmsCheckVerifyCodeRequest();
        req.setSmsAccount("smsAccount");
        req.setScene("Test");
        req.setPhoneNumber("188xxxxxxxxx");
        req.setCode("123456");
        // If you have set up phone number encryption on the official website, you can set this configuration.
        // Not a mandatory parameter to set
        req.setEncryptName("encryptName");
        try{
            SmsCheckVerifyCodeResponse response = smsService.checkVerifyCode(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
