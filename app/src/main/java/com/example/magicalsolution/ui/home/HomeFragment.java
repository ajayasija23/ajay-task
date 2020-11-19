package com.example.magicalsolution.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.magicalsolution.R;
import com.example.magicalsolution.adapter.CommunityAdapter;
import com.example.magicalsolution.adapter.PeopleAdapter;
import com.example.magicalsolution.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private int[] images={R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5,R.drawable.image6};
    private String[] cities={"Tohana","Mumbai","Switzerlan","Maxico","Lahore"};
    private String[] jobTitles={"Android Developer","Designer","Web Developer","Ios Developer","Data Analyst"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentHomeBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
        binding.rvPeople.setAdapter(new PeopleAdapter(images,jobTitles,cities));
        binding.rvCommunities.setAdapter(new CommunityAdapter(images,jobTitles));
        binding.rvCommunities.setLayoutManager(new GridLayoutManager(getActivity(),2));

        return view;
    }
}