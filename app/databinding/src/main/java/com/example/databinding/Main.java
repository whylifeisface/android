package com.example.databinding;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.databinding.Helper.Dao;
import com.example.databinding.RoomClass.Init;
import com.example.databinding.RoomClass.RoomRepository;
import com.example.databinding.RoomClass.User;
import com.example.databinding.RoomClass.UserDao;
import com.example.databinding.RoomClass.UserDataBase;
import com.example.databinding.databinding.MainActivityBinding;

import java.util.List;


public class Main extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        MainActivityBinding inflate = MainActivityBinding.inflate(getLayoutInflater());
        View root = inflate.getRoot();
        setContentView(root);


    }
//


}
