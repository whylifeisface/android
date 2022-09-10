package com.example.databinding.fragment.viewModel;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.databinding.R;
import com.example.databinding.fragment.viewModel.Adapt.LiAdapter;
import com.google.gson.Gson;

public class BlankFragment extends Fragment {

    private BlankViewModel mViewModel;
    private RecyclerView recyclerView;
    private final String url = "https://api.bbmang.me/trendingTags?date=2022-09-10";
    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        TextView tv = view.findViewById(R.id.tv);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                response -> {
            tv.setText(response);
                    Gson gson = new Gson();
                    Network network = gson.fromJson(response, Network.class);
                    System.out.println(network.getName());
                }, error -> {
        });
        requestQueue.add(stringRequest);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BlankViewModel.class);
        // TODO: Use the ViewModel
    }

}