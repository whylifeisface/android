package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class myframe extends Fragment {
    private static final String TAG = "RecyclerViewFragment";

    private static final int DATASET_COUNT = 60;
    protected String[] mDataset;

    private void initDataset() {

        mDataset = new String[DATASET_COUNT];
        for (int i = 0; i < DATASET_COUNT; i++) {
            mDataset[i] = "This is element #" + i;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recyc,container,false);
        RecyclerView recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);
//        recyclerView.setTag(TAG);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);

//        CustomAdapter adapter = new CustomAdapter(mDataset);
//        recyclerView.setAdapter(adapter);
        
        recyclerView.setLayoutManager(layoutManager);
        return rootView;
    }
//    public void setRecyclerViewLayoutManger(LayoutMa)

}
