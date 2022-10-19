package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SmsCheckVerifyCodeRequest;
import com.byteplus.model.request.SubAccountRequest;
import com.byteplus.model.response.GetSubAccountDetailResponse;
import com.byteplus.model.response.SmsCheckVerifyCodeResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GetSubAccountDetailDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance("ap-singapore-1");

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AccessKey");
        smsService.setSecretKey("SecretKey");

        SubAccountRequest req = new SubAccountRequest();
        req.setSubAccount("SubAccount");

        try{
            GetSubAccountDetailResponse response = smsService.getSubAccountDetail(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
