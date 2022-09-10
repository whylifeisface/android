package com.example.databinding.fragment.viewModel.Adapt;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databinding.fragment.viewModel.Network;

public class LiAdapter extends ListAdapter<Network,LiAdapter.ViewHolder> {


    public LiAdapter() {
        super(new DiffUtil.ItemCallback<Network>() {
            @Override
            public boolean areItemsTheSame(@NonNull Network oldItem, @NonNull Network newItem) {
                return oldItem == newItem;
            }

            @Override
            public boolean areContentsTheSame(@NonNull Network oldItem, @NonNull Network newItem) {
                return false;
            }
        });
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
