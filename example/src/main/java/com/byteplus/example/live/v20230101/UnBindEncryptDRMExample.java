package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class UnBindEncryptDRMExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UnBindEncryptDRMBody body = new UnBindEncryptDRMBody();

        try {
            UnBindEncryptDRMRes resp = service.unBindEncryptDRM(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
