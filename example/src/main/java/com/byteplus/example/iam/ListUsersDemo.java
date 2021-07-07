package com.byteplus.example.iam;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.ListUsersRequest;
import com.byteplus.model.response.ListUsersResponse;
import com.byteplus.service.iam.IIamService;
import com.byteplus.service.iam.impl.IamServiceImpl;

public class ListUsersDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.byteplus/config

        iamService.setAccessKey("ak");
        iamService.setSecretKey("sk");
        // list users
        try {
            ListUsersRequest listUsersRequest = new ListUsersRequest();
            listUsersRequest.setLimit(3);

            ListUsersResponse listUsersResponse = iamService.listUsers(listUsersRequest);
            System.out.println(JSON.toJSONString(listUsersResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
