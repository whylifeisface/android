package com.example.myapplication;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class setting extends PreferenceFragmentCompat implements Preference.OnPreferenceClickListener, Preference.OnPreferenceChangeListener {

    private Preference ua;
    private Preference search;
    private Preference search1;


    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.setting,rootKey);
            search = findPreference("ping");

            search1 = findPreference("search");

            ua = findPreference("UA");
            ua.setOnPreferenceClickListener(this);
            search.setOnPreferenceClickListener(this);


        }



    @Override
    public boolean onPreferenceClick(Preference preference) {
        String key = preference.getKey();
        String title;
        int array;
        switch (key){
            case "clear":
                title = "清除浏览器数据";
                array = R.array.clear;

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + key);
        }

        StartGameDialogFragment dialogFragment
                = new StartGameDialogFragment(title, array);
        dialogFragment.show(getFragmentManager(),null);
        return true;
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        String key = preference.getKey();
        String title;
        int array;
        switch (key){
            case "ping":
                title = "屏幕旋转";
                array = R.array.is;
                break;
            case "search":
                title ="默认搜索引擎";
                array = R.array.search;
                break;
            case "UA":
                title = "";
                array = R.array.ua;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + key);
        }
        StartGameDialogFragment dialogFragment
                = new StartGameDialogFragment(title, array);
        dialogFragment.show(getFragmentManager(),null);
        preference.setSummary((Integer) newValue);

        return false;
    }
}
