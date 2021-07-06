package com.byteplus.example.vedit;

import com.byteplus.model.request.GetDirectEditResultRequest;
import com.byteplus.model.response.GetDirectEditResultResponse;
import com.byteplus.service.vedit.IVEditService;
import com.byteplus.service.vedit.impl.VEditServiceImpl;

import java.util.Arrays;

public class GetDirectEditResultDemo {
    public static void main(String[] args) {
        IVEditService veditService = VEditServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        veditService.setAccessKey("your ak");
        veditService.setSecretKey("your sk");

        GetDirectEditResultRequest req = new GetDirectEditResultRequest();
        req.setReqIds(Arrays.asList("xxx", "yyy"));

        try {
            GetDirectEditResultResponse response = veditService.getDirectEditResult(req);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
