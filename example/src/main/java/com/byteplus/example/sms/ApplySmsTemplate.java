package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.ShortUrlConfig;
import com.byteplus.model.request.ApplySmsTemplateRequest;
import com.byteplus.model.request.SmsCheckVerifyCodeRequest;
import com.byteplus.model.response.ApplySmsTemplateResponse;
import com.byteplus.model.response.SmsCheckVerifyCodeResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

import static com.byteplus.helper.Const.*;

public class ApplySmsTemplate {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance("ap-singapore-1");

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AccessKey");
        smsService.setSecretKey("SecretKey");

        ApplySmsTemplateRequest req = new ApplySmsTemplateRequest();
        req.setSubAccount("SubAccount");
        req.setArea(AreaOverseas);
        req.setChannelType(SmsChannelTypeI18nMKT);
        req.setContent("We're offering our xxxx community 20% off with code THANKYOU. It's our way of showing our appreciation to you for standing by us in this time. Shop Now: https://webhook.site/edd2b39a-6c8d-4161-a310-36a470c840d4");
        req.setDesc("Test SDK");
        req.setName("template_name");
        ShortUrlConfig shortUrlConfig = new ShortUrlConfig();
        shortUrlConfig.setIsEnable(EnableStatusEnabled);
        shortUrlConfig.setIsNeedClickDetails(EnableStatusNotEnabled);
        req.setShortUrlConfig(shortUrlConfig);
        try{
            ApplySmsTemplateResponse response = smsService.applySmsTemplate(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
