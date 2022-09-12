package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Recyc extends RecyclerView.Adapter<Recyc.ViewHodlder> {



    @NonNull
    @Override
    public ViewHodlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(viewType, parent);

        return new ViewHodlder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodlder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHodlder extends RecyclerView.ViewHolder {
        public ViewHodlder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
