package com.example.magicalsolution.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.magicalsolution.R;

public class ExperienceAdapter extends RecyclerView.Adapter<ExperienceAdapter.MyViewHolder> {

    private final int[] images;
    private final String[] experience;
    private final String[] cities;

    public ExperienceAdapter(int[] images, String[] experience, String[] cities) {
        this.images=images;
        this.experience=experience;
        this.cities=cities;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_experience,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(images[position]);
        holder.tvLocation.setText(cities[position]);
        holder.tvTitle.setText(experience[position]);
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView tvLocation,tvTitle;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            tvLocation=itemView.findViewById(R.id.tvLocation);
            tvTitle=itemView.findViewById(R.id.tvTitle);
        }
    }
}

