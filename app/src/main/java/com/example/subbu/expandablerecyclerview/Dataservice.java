package com.example.subbu.expandablerecyclerview;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by saravanan on 16-Aug-17.
 */

public class Dataservice {

    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl("http://daiwiksoft.co.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    Scandetails scandetails=retrofit.create(Scandetails.class);

    public LiveData<Example> getscandata(){
        final MutableLiveData<Example> data=new MutableLiveData<>();
        scandetails.getscandetails().enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });
        return data;
    }

    public synchronized static Dataservice getInstance() {
        return new Dataservice();
    }
}
