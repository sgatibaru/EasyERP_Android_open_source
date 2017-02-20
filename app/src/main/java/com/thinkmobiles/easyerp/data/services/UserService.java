package com.thinkmobiles.easyerp.data.services;

import com.thinkmobiles.easyerp.data.model.user.ResponseGetCurrentUser;
import com.thinkmobiles.easyerp.data.model.user.organization.ResponseGetOrganizationSettings;
import com.thinkmobiles.easyerp.presentation.utils.Constants;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Lynx on 1/18/2017.
 */

public interface UserService {

    @GET(Constants.GET_CURRENT_USER)
    Observable<ResponseGetCurrentUser> getCurrentUser();

    @GET(Constants.GET_LOGOUT)
    Observable<String> logOut();

    @GET(Constants.GET_ORGANIZATION_SETTINGS)
    Observable<ResponseGetOrganizationSettings> getOrganizationSettings();

}
