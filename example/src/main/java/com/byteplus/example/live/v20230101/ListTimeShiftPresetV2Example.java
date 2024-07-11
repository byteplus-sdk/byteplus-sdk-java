package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class ListTimeShiftPresetV2Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ListTimeShiftPresetV2Body body = new ListTimeShiftPresetV2Body();

        try {
            ListTimeShiftPresetV2Res resp = service.listTimeShiftPresetV2(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
