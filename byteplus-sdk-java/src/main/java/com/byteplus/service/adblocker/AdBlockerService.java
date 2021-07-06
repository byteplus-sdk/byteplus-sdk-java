package com.byteplus.service.adblocker;

import com.byteplus.model.request.AdBlockerRequest;
import com.byteplus.model.response.AdBlockerResponse;
import com.byteplus.service.IBaseService;

/**
 * The interface ad blocker service.
 */
public interface AdBlockerService extends IBaseService {
    /**
     * Ad Blocker.
     *
     * @param adBlockerRequest ad block request
     * @return ad block response
     * @throws Exception the exception
     */
    AdBlockerResponse AdBlock(AdBlockerRequest adBlockerRequest) throws Exception;
}
