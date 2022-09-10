package com.example.databinding.fragment.volley;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class volley {

    private static volatile volley INSTANCE = null;
    private Context context;
    public static volley getInstance(Context context){
       if (INSTANCE == null){
            synchronized (volley.class){
                if (INSTANCE == null){
                    INSTANCE = new volley();
                }
            }
       }
        return INSTANCE;
   }
   public RequestQueue getQueue(){
    return Volley.newRequestQueue(context.getApplicationContext());
   }

}
