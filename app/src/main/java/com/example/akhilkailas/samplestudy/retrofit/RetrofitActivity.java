package com.example.akhilkailas.samplestudy.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;


import com.example.akhilkailas.samplestudy.R;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RetrofitActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RetroRecyclerAdapter retroRecyclerAdapter;
    List<DataModel> arrayList;
    APIInterface retroAPI;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        recyclerView = findViewById(R.id.retro_recy);
        arrayList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        Retrofit retrofit = RetroAPI.getAPIClient();
        retroAPI = retrofit.create(APIInterface.class);
        compositeDisposable.add(retroAPI.getData().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<DataModel>>() {
                    @Override
                    public void accept(List<DataModel> dataModels) throws Exception {
                        retroRecyclerAdapter = new RetroRecyclerAdapter(RetrofitActivity.this,dataModels);
                        recyclerView.setAdapter(retroRecyclerAdapter);
                    }
                }));
       /* Call<List<DataModel>> call = retroAPI.getData();
        call.enqueue(new Callback<List<DataModel>>() {
            @Override
            public void onResponse(Call<List<DataModel>> call, Response<List<DataModel>> response) {
                arrayList =  response.body();
                retroRecyclerAdapter = new RetroRecyclerAdapter(RetrofitActivity.this,arrayList);
                recyclerView.setAdapter(retroRecyclerAdapter);
            }

            @Override
            public void onFailure(Call<List<DataModel>> call, Throwable t) {
                Toast.makeText(RetrofitActivity.this, "Failed...", Toast.LENGTH_SHORT).show();
            }
        });*/


    }

    @Override
    protected void onStop() {
        super.onStop();
        compositeDisposable.clear();
    }
}
