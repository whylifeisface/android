package com.example.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        helper=new DbContect(  main.this);
//        SQLiteDatabase db=helper.getWritableDatabase();
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.main,BlankFragment
//                .class,null)
//                .commit();

    }
}
