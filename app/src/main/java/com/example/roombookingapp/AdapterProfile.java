package com.example.roombookingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProfile extends RecyclerView.Adapter<AdapterProfile.MyViewHolder> {

    private List<String> data;
    private List<Integer> dataImages;
    private Context context;

    public AdapterProfile(List<String> data,List<Integer> dataImages, Context context) {
        this.data = data;
        this.dataImages = dataImages;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterProfile.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_profile,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProfile.MyViewHolder holder, int position) {
       holder.textview_item_profile.setText(data.get(position));
       holder.imageview_item_profile.setImageResource(dataImages.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageview_item_profile;
        private TextView textview_item_profile;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview_item_profile = itemView.findViewById(R.id.imageview_item_profile);
            textview_item_profile = itemView.findViewById(R.id.textview_item_profile);
        }
    }
}
