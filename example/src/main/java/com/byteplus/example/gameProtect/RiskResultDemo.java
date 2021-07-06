package com.byteplus.example.gameProtect;
import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.GameProtectRiskResultRequest;
import com.byteplus.model.response.GameProtectRiskReusltResponse;
import com.byteplus.service.gameProtect.*;
import com.byteplus.service.gameProtect.impl.GameProtectServiceImpl;

public class RiskResultDemo {
    public static void main(String[] args) {
        GameProtectService gameProtectService = GameProtectServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        gameProtectService.setAccessKey("ak");
        gameProtectService.setSecretKey("sk");
        // risk result
        try {
            GameProtectRiskResultRequest riskResultRequest = new GameProtectRiskResultRequest();
            riskResultRequest.setAppId(218745);
            riskResultRequest.setStartTime(1618848000);
            riskResultRequest.setEndTime(1618921103);
            riskResultRequest.setPageNum(1);
            riskResultRequest.setPageSize(10);

            GameProtectRiskReusltResponse riskResultResponse = gameProtectService.RiskResult(riskResultRequest);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}