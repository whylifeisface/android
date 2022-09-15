package com.example.rx.Res;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofit {

    public static Retrofit fitBuilder(){
        String baseUrl = "http://10.128.69.53:8080/PixivController/";
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(Client.ClientInit())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }

}
