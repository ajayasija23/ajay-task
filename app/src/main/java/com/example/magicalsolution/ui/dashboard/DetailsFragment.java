package com.example.magicalsolution.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.magicalsolution.R;
import com.example.magicalsolution.adapter.ExperienceAdapter;
import com.example.magicalsolution.databinding.FragmentDetailsBinding;

public class DetailsFragment extends Fragment {

    private FragmentDetailsBinding binding;
    private int[] images={R.drawable.image2,R.drawable.image3};
    private String[] experience={"2 Years in Android Development","5 Years in Ios Development"};
    private String[] cities={"Tohana","Mumbai"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=FragmentDetailsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        binding.rvExperiences.setAdapter(new ExperienceAdapter(images,experience,cities));
        binding.rvExperiences.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}