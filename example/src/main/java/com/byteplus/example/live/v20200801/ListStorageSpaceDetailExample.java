package com.byteplus.example.live.v20200801;


import com.byteplus.model.live.v20200801.*;
import com.byteplus.service.live.v20200801.LiveService;

public class ListStorageSpaceDetailExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ListStorageSpaceDetailBody body = new ListStorageSpaceDetailBody();

        try {
            ListStorageSpaceDetailRes resp = service.listStorageSpaceDetail(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
