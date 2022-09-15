package com.example.rx;

import android.os.Bundle;

import com.example.rx.Bean.BaseBean;
import com.example.rx.Bean.SomeThing;
import com.example.rx.Repos.SomeThingInterface;
import com.example.rx.Repos.SomeThingRespority;
import com.example.rx.Res.Translate;
import com.example.rx.Res.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);

        SomeThingRespority someThingRespority = new SomeThingRespority();
        List<SomeThing> page = someThingRespority.page();
        System.out.println(page);

    }

}