package com.example.akhilkailas.samplestudy.retrofit;


import java.util.List;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/posts")
    Observable<List<DataModel>> getData();
}
