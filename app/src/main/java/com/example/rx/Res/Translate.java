package com.example.rx.Res;

import com.example.rx.Bean.BaseBean;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class Translate {
    public static <T> ObservableTransformer<BaseBean<T>, T> transformer(){
        return upstream -> upstream.map(tBaseBean -> {
            if (tBaseBean.getCode() != 200) System.out.println("error");
            return tBaseBean.getData();
        });
    }
    public static <T> ObservableTransformer<T, T> switchSchedulers() {
            return upstream -> upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

}
