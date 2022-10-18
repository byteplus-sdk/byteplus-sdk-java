package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.GetSubAccountListRequest;
import com.byteplus.model.request.SmsCheckVerifyCodeRequest;
import com.byteplus.model.response.GetSubAccountListResponse;
import com.byteplus.model.response.SmsCheckVerifyCodeResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

public class GetSubAccountListDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance("ap-singapore-1");

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AKAPNzBkZTI2YjZiM2NkNDI0ZTk5YmZkOGM4ODFhZDFjODI");
        smsService.setSecretKey("WlRJNU1UVmtZVGd4WVROa05EUTBNMkk0TWprNVlqRmxPRFZsTldFMll6aw==");

        GetSubAccountListRequest req = new GetSubAccountListRequest();
        req.setPageIndex(1);
        req.setPageSize(1);

        try{
            GetSubAccountListResponse response = smsService.getSubAccountList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
