package com.byteplus.example.live.v20230101;


import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.live.v20230101.LiveService;

public class DeleteSubtitleTranscodePresetExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteSubtitleTranscodePresetBody body = new DeleteSubtitleTranscodePresetBody();

        try {
            DeleteSubtitleTranscodePresetRes resp = service.deleteSubtitleTranscodePreset(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
