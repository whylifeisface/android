package com.example.myapplication;

import android.os.Bundle;

import com.example.myapplication.ViewPage.BlankFragment;
import com.example.myapplication.ViewPage.viewpgaeAdapter;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.KeyEvent;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements ViewPager.OnPageChangeListener{
    private ImageView imageView1;
private ImageView imageView2;
private ImageView imageView3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.re);



        // Inflate the layout for this fragment
        viewpgaeAdapter viewpgaeAdapter = new viewpgaeAdapter(getSupportFragmentManager(),getLifecycle());
        ViewPager2 ViewPage = findViewById(R.id.viewpage);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
         imageView3 = findViewById(R.id.imageView3);



        ViewPage.setAdapter(viewpgaeAdapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        System.out.println("color");
        switch (position){
            case 0:
                imageView1.setBackgroundColor(getResources().getColor(R.color.black));
            case 1:
                imageView2.setBackgroundColor(getResources().getColor(R.color.black));
            case 2:
                imageView3.setBackgroundColor(getResources().getColor(R.color.black));
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}