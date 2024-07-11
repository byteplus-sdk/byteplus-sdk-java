package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class DescribeLivePlayStatusCodeDataExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLivePlayStatusCodeDataBody body = new DescribeLivePlayStatusCodeDataBody();

        try {
            DescribeLivePlayStatusCodeDataRes resp = service.describeLivePlayStatusCodeData(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
