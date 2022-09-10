package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class a extends AppCompatActivity {
    private List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i < 48; i++) {
            data.add("这是第"+i+"条数据");
        }
        RecyclerView recyclerView
                = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
//        TextView tv = findViewById(R.id.tv);
        CustomAdapter adapter = new CustomAdapter(this, );
        recyclerView.setAdapter(adapter);
//        if (savedInstanceState == null) {
//            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//            myframe myframe = new myframe();
//            transaction.replace(R.id.log_fragment,myframe);
//            transaction.commit();
//
//        }
//        tv.setText("你好世界");
        EditText Edit = findViewById(R.id.edit);
        Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searInt = new Intent(getApplicationContext(),a.class);

                startActivity(searInt);
            }
        });
    }
}
