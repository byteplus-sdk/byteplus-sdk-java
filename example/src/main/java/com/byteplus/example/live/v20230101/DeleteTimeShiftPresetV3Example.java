package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class DeleteTimeShiftPresetV3Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteTimeShiftPresetV3Body body = new DeleteTimeShiftPresetV3Body();

        try {
            DeleteTimeShiftPresetV3Res resp = service.deleteTimeShiftPresetV3(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
