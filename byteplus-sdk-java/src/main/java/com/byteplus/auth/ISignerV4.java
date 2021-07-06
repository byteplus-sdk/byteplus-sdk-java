package com.byteplus.auth;

import com.byteplus.model.Credentials;
import com.byteplus.service.SignableRequest;

/**
 * The interface Signer.
 */
public interface ISignerV4 {

    /**
     * Sign.
     *
     * @param request     the request
     * @param credentials the credentials
     * @throws Exception the exception
     */
    void sign(SignableRequest request, Credentials credentials) throws Exception;

    /**
     * Sign url string.
     *
     * @param request     the request
     * @param credentials the credentials
     * @return the string
     * @throws Exception the exception
     */
    String signUrl(SignableRequest request, Credentials credentials) throws Exception;
}
