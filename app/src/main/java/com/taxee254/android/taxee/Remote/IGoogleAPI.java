package com.taxee254.android.taxee.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by chess on 3/17/2018.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);

}
