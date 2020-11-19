package com.example.magicalsolution.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.magicalsolution.R;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.MyViewHolder> {


    private final int[] images;
    private final String[] jobTitles;
    private final String[] cities;

    public PeopleAdapter(int[] images, String[] jobTitles, String[] cities) {
        this.images=images;
        this.jobTitles=jobTitles;
        this.cities=cities;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_people,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(images[position]);
        holder.tvCity.setText(cities[position]);
        holder.tvTitle.setText(jobTitles[position]);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView tvCity,tvTitle;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            tvCity=itemView.findViewById(R.id.tvLocation);
            tvTitle=itemView.findViewById(R.id.tvName);
        }
    }
}

