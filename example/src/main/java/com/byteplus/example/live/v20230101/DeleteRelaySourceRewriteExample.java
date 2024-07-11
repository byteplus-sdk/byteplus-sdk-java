package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class DeleteRelaySourceRewriteExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteRelaySourceRewriteBody body = new DeleteRelaySourceRewriteBody();

        try {
            DeleteRelaySourceRewriteRes resp = service.deleteRelaySourceRewrite(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
