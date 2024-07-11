package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class ListRelaySourceV4Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ListRelaySourceV4Body body = new ListRelaySourceV4Body();

        try {
            ListRelaySourceV4Res resp = service.listRelaySourceV4(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
