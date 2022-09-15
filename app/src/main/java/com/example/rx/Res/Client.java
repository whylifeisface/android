package com.example.rx.Res;

import okhttp3.OkHttpClient;

public class Client {

    public static OkHttpClient ClientInit(){
        return new OkHttpClient.Builder()
                .build();
    }

}
