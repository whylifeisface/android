package com.example.rx.Repos;


import com.example.rx.Bean.BaseBean;
import com.example.rx.Bean.SomeThing;
import com.example.rx.Res.Translate;
import com.example.rx.Res.retrofit;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Transformer;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class SomeThingRespority  {

    public List<SomeThing> data = new ArrayList<>();

    public List<SomeThing> getData() {
        return data;
    }



    public void setData(List<SomeThing> data) {
        this.data = data;
    }

    public  Observer<List<SomeThing>> subscribe(){
        return new Observer<List<SomeThing>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<SomeThing> value) {
                System.out.println("next");
                System.out.println(value.get(0).getName());
                data.addAll(value);

            }


            @Override
            public void onError(Throwable e) {
                System.out.println(e);
            }

            @Override
            public void onComplete() {
                System.out.println("complete");
            }
        };
    }

    public  List<SomeThing> page(){
        Retrofit retrofit = com.example.rx.Res.retrofit.fitBuilder();
         retrofit.create(SomeThingInterface.class).getPage()
                 .compose(Translate.transformer())
                 .compose(Translate.switchSchedulers())
                 .subscribe(new Observer<List<SomeThing>>() {

                     @Override
                     public void onSubscribe(Disposable d) {

                     }

                     @Override
                     public void onNext(List<SomeThing> value) {
                         System.out.println("next");
                         System.out.println(value.get(0).getName());

                     }

                     @Override
                     public void onError(Throwable e) {
                         System.out.println(e);
                     }

                     @Override
                     public void onComplete() {
                         System.out.println("complete");
                     }
                 });
        System.out.println("Aaa");
        System.out.println(data);

        return data;

    }

}
