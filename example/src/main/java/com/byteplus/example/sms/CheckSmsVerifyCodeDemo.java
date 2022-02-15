package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SmsCheckVerifyCodeRequest;
import com.byteplus.model.response.SmsCheckVerifyCodeResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

public class CheckSmsVerifyCodeDemo {
    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SmsCheckVerifyCodeRequest req = new SmsCheckVerifyCodeRequest();
        req.setSmsAccount("smsAccount");
        req.setScene("Test");
        req.setPhoneNumber("188xxxxxxxxx");
        req.setCode("123456");
        try{
            SmsCheckVerifyCodeResponse response = smsService.checkVerifyCode(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
