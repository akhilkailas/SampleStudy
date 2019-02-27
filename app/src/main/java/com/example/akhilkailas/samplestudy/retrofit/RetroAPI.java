package com.example.akhilkailas.samplestudy.retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroAPI {
    private static String BASE_URL = "https://jsonplaceholder.typicode.com";
    public static Retrofit sRetrofit;
    public static Retrofit getAPIClient(){
        if (sRetrofit == null){
            sRetrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        }
        return sRetrofit;
    }
}
