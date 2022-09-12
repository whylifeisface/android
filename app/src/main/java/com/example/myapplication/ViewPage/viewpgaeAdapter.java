package com.example.myapplication.ViewPage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class viewpgaeAdapter extends FragmentStateAdapter {

    public viewpgaeAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        InitFragment();
    }

    public List<Fragment> fragmentList = new ArrayList<>();

    public void InitFragment(){
        System.out.println("aaa");
            fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.action_settings));
            fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.second_fragment_label));
            fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.hello_second_fragment));
            fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.first_fragment_label));
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
//        fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.action_settings));
//        fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.second_fragment_label));
//        fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.hello_second_fragment));
//        fragmentList.add( BlankFragment.newInstance(R.color.black,R.string.first_fragment_label));
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
