package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.DeleteSmsTemplateRequest;
import com.byteplus.model.response.DeleteSmsTemplateResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

public class DeleteSmsTemplate {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance("ap-singapore-1");

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AccessKey");
        smsService.setSecretKey("SecretKey");

        DeleteSmsTemplateRequest req = new DeleteSmsTemplateRequest();
        req.setSubAccount("SubAccount");
        req.setOrder(true);
        req.setId("TemplateId");
        try {
            DeleteSmsTemplateResponse response = smsService.deleteSmsTemplate(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
