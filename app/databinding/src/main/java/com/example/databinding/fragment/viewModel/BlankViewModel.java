package com.example.databinding.fragment.viewModel;

import android.app.Application;

import androidx.lifecycle.ViewModel;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.example.databinding.fragment.volley.volley;

public class BlankViewModel extends ViewModel {
    private Application application;

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    // TODO: Implement the ViewModel
    public void fetchData(){
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                getUrl(),
                response -> {
                },
                error -> {
                }
        );
        volley.getInstance(getApplication()).getQueue().add(stringRequest);

    }

    public String getUrl(){
        return " aa";
    }

}