package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ListViewAdapt extends ListAdapter<asa,ListViewAdapt.ViewHolder> {

    private View view;
    private TextView tv;
    private  int recy_item;
    private int pro;
    @NonNull
    @Override
    public List<asa> getCurrentList() {
        return super.getCurrentList();
    }

    protected ListViewAdapt() {
        super(new DiffUtil.ItemCallback<asa>() {
            @Override
            public boolean areItemsTheSame(@NonNull asa oldItem, @NonNull asa newItem) {
                return oldItem == newItem;
            }

            @Override
            public boolean areContentsTheSame(@NonNull asa oldItem, @NonNull asa newItem) {
                return oldItem.id.equals(newItem.id);
            }
        });
    }

//    public void pageChange(){
////        super();
////        if (new ListAdapter())
//    new ListViewAdapt()
//    }

    @NonNull
    @Override
    public ListViewAdapt.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int itemViewType = getItemViewType(1);
        if (itemViewType == recy_item) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recy_item, parent,false);

        }else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pro, parent,false);

        }

        return new ViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return getItemCount()==getItemId(position)?recy_item:pro;

    }

    @Override
    public void onBindViewHolder(@NonNull ListViewAdapt.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(1);
        if (itemViewType == recy_item) {
            asa now = getItem(position);
            tv = holder.itemView.findViewById(R.id.tv);
            TextView textView = holder.itemView.findViewById(R.id.textView);
            textView.setText(now.content);
            ImageView image = holder.itemView.findViewById(R.id.imageView);
            Glide.with(holder.itemView)
                    .load(now.src)
                    .circleCrop()
                    .into(image);
        }

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}