package com.byteplus.service.iam;

import com.byteplus.model.request.ListUsersRequest;
import com.byteplus.model.response.ListUsersResponse;
import com.byteplus.service.IBaseService;

/**
 * The interface Iam service.
 */
public interface IIamService extends IBaseService {
    /**
     * List users.
     *
     * @param listUsersRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    ListUsersResponse listUsers(ListUsersRequest listUsersRequest) throws Exception;
}
