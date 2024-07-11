package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class DescribeCertDetailSecretV2Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeCertDetailSecretV2Body body = new DescribeCertDetailSecretV2Body();

        try {
            DescribeCertDetailSecretV2Res resp = service.describeCertDetailSecretV2(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
