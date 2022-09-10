package com.example.myapplication;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class BlankFragment extends Fragment {
    private List<asa> asaList;
    private asaRepository all;
    private ListViewAdapt listViewAdapt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_blank, container,false);

        RecyclerView recyclerView = inflate.findViewById(R.id.rc);

//        System.out.println(recyclerView == null);
        listViewAdapt = new ListViewAdapt();
//        listViewAdapt.
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(listViewAdapt);
        Task task = new Task();
        task.execute(2000);
        return inflate;
    }
class Task extends AsyncTask<Integer,Integer,Integer>{

    @Override
    protected Integer doInBackground(Integer... integers) {
        try {
            all
                    = new asaRepository(getActivity().getApplication());
            asaList = all.getAll();
            listViewAdapt.submitList(asaList);

            System.out.println(asaList.size());
            Log.d(TAG, "onCreate:---------- "+ BlankFragment.this.all);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

}
