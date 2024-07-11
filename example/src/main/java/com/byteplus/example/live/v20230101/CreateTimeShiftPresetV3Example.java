package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class CreateTimeShiftPresetV3Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateTimeShiftPresetV3Body body = new CreateTimeShiftPresetV3Body();

        try {
            CreateTimeShiftPresetV3Res resp = service.createTimeShiftPresetV3(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
