package com.example.databinding.fragment;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.ListAdapter;
import com.example.databinding.R;
import com.example.databinding.RoomClass.Init;
import com.example.databinding.RoomClass.RoomRepository;
import com.example.databinding.RoomClass.User;
import com.example.databinding.databinding.FragmentBlankBinding;

import java.util.List;



public class BlankFragment extends Fragment {
    private FragmentBlankBinding binding;
    private ListAdapter listAdapter;
    private  View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("aaaaaa");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rc);
        System.out.println(recyclerView == null );
        listAdapter = new ListAdapter();
        recyclerView.setAdapter(this.listAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        tak tak = new tak();
        tak.execute(2000);
        System.out.println("aaaaaa");

        return view;
    }
    class  tak extends AsyncTask<Integer,Integer,Integer> {

        @Override
        protected Integer doInBackground(Integer... integers) {
            RoomRepository roomRepository =
                    new RoomRepository(getActivity().getApplication());
            List<User> all =
                    roomRepository.getAll();
            System.out.println(all);
            if (all == null) {
                Init init = new Init();
                init.Insert(getActivity().getApplication());
            }
            listAdapter.submitList(all);

            return null;
        }
    }
}