package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class CreateRelaySourceV4Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateRelaySourceV4Body body = new CreateRelaySourceV4Body();

        try {
            CreateRelaySourceV4Res resp = service.createRelaySourceV4(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
