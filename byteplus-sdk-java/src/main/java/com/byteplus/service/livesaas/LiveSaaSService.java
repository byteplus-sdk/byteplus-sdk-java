package com.byteplus.service.livesaas;

import com.byteplus.model.livesaas.*;
import com.byteplus.service.IBaseService;

public interface LiveSaaSService extends IBaseService {

    CreateActivityAPIV2Response CreateActivityAPIV2(CreateActivityAPIV2Request request) throws Exception;

    ListActivityAPIResponse ListActivityAPI(ListActivityAPIRequest request) throws Exception;

    UpdateActivityBasicConfigAPIResponse UpdateActivityBasicConfigAPI(UpdateActivityBasicConfigAPIRequest request) throws Exception;

    GetTemporaryLoginTokenAPIResponse GetTemporaryLoginTokenAPI(GetTemporaryLoginTokenAPIRequest request) throws Exception;

    GetSDKTokenAPIResponse GetSDKTokenAPI(GetSDKTokenAPIRequest request) throws Exception;
}
