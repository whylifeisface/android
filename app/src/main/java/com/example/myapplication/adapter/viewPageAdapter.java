package com.example.myapplication.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.adapter.fragment.fourFragment;
import com.example.myapplication.adapter.fragment.oneFragment;
import com.example.myapplication.adapter.fragment.threeFragment;
import com.example.myapplication.adapter.fragment.twoFragment;

import java.util.ArrayList;
import java.util.List;

public class viewPageAdapter extends FragmentStateAdapter  {

    public List<createFragment> fragmentList = new ArrayList<>(4);

    public viewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        init();
    }
    public void init(){
        fragmentList.add(new createFragment("one",oneFragment.class));
        fragmentList.add(new createFragment("two",twoFragment.class));
        fragmentList.add(new createFragment("three",threeFragment.class));
        fragmentList.add(new createFragment("four",fourFragment.class));
        System.out.println("Aaa");
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        oneFragment oneFragment = new oneFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("args",position);
        System.out.println("bbb");
        return  oneFragment;
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
