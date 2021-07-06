package com.byteplus.service.gameProtect;

import com.byteplus.model.request.GameProtectRiskResultRequest;
import com.byteplus.model.response.GameProtectRiskReusltResponse;
import com.byteplus.service.IBaseService;

/**
 * The interface game protect service.
 */
public interface GameProtectService extends IBaseService {
    /**
     * Game Protect
     *
     * @param gameProtectRiskResultRequest game protect request
     * @return game protect response
     * @throws Exception the exception
     */
    GameProtectRiskReusltResponse RiskResult(GameProtectRiskResultRequest gameProtectRiskResultRequest) throws Exception;
}
