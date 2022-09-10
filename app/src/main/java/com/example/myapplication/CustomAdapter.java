package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private static final String TAG = "CustomAdapter";
    private  Context context;
    private final List<entity> localDataSet;


    class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView textView;
        private final ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
            imageView = (ImageView)itemView.findViewById(R.id.iv);

        }

        public ImageView getImageView(){
            return imageView;
        }

        public TextView getView() {
            return textView;
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.viewholder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "Element " + position + " set.");
        holder.textView.setText(localDataSet.get(position).Text);
    }


    public CustomAdapter(Context context, List<entity> localDataSet) {
        this.context = context;
        this.localDataSet = localDataSet;
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
