package com.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.databinding.RoomClass.User;
import com.example.databinding.databinding.RecyItemBinding;

import java.util.Objects;


public class ListAdapter extends androidx.recyclerview.widget.ListAdapter<User,ListAdapter.viewHolder> {
    private RecyItemBinding Binding;
    private int rec;
    private int item;
    private View inflate;
    public ListAdapter() {
        super(new DiffUtil.ItemCallback<User>() {
            @Override
            public boolean areItemsTheSame(@NonNull User oldItem, @NonNull User newItem) {
                return oldItem == newItem;
            }

            @Override
            public boolean areContentsTheSame(@NonNull User oldItem, @NonNull User newItem) {
                return Objects.equals(oldItem.getId(), newItem.getId());
            }
        });
    }

    @Override
    public int getItemViewType(int position) {

        return position==getItemCount()-1?item:rec;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType==rec){
            inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.recy_item, parent,false);
            Binding = RecyItemBinding.bind(inflate);

            return new viewHolder(inflate);
        }else {
            inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        }
        return new viewHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        if (getItemCount()-1 == position){
            System.out.println("position TRue");
            return;
        }
        System.out.println(getItem(position).getSrc());
        Glide.with(holder.itemView)
                .load(getItem(position).getSrc())
                .into(Binding.imageView);

        Binding.textView.setText(getItem(position).getContent());

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
