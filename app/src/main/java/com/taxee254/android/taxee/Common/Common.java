package com.taxee254.android.taxee.Common;

import com.taxee254.android.taxee.Remote.IGoogleAPI;
import com.taxee254.android.taxee.Remote.RetrofitClient;

/**
 * Created by chess on 3/17/2018.
 */

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleApi(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);

    }
}
