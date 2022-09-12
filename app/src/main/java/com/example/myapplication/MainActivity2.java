package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.myapplication.adapter.viewPageAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        NavigationView navigationView = findViewById(R.id.navigationView);
        View headerView = navigationView.getHeaderView(0);
        headerView.setOnClickListener(view -> Toast.makeText(MainActivity2.this,"text",Toast.LENGTH_SHORT).show());
        navigationView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.one:
                    break;
                case R.id.two:
                    break;
                case R.id.three:
                    break;
            }
            return item.isChecked();
        });
        ViewPager2 viewPager2 = findViewById(R.id.viewpage);

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        TabLayoutMediator aaa = new TabLayoutMediator(tabLayout, viewPager2,true, (tab, position) -> {
//            tab.setText(viewPageAdapter.getTitle(position));
            System.out.println("aaa");
        });

        aaa.attach();
        System.out.println(aaa.isAttached());
    }

}