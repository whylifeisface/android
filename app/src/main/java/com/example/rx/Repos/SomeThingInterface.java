package com.example.rx.Repos;


import com.example.rx.Bean.BaseBean;
import com.example.rx.Bean.SomeThing;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface SomeThingInterface {

    @GET("Page?num=1&size=5")
    Observable<BaseBean<List<SomeThing>>> getPage();

}
