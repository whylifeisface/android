package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this,setting.class);
//        startActivity(intent);

//        FragmentManager supportFragmentManager = getSupportFragmentManager();
//        supportFragmentManager.beginTransaction().replace(R.id.frag, setting.class,null).commit();
    }
}