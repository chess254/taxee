package com.taxee254.android.taxee.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by chess on 3/17/2018.
 */

public class RetrofitClient {
    public static Retrofit retrofit = null;
    public static Retrofit getClient(String baseURL)
    {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
