package com.example.magicalsolution.ui.notifications;

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

import com.example.magicalsolution.R;
import com.example.magicalsolution.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {


    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding= FragmentNotificationsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        return view;
    }
}