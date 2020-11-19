package com.example.magicalsolution;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.magicalsolution.databinding.ActivityMainBinding;
import com.example.magicalsolution.ui.dashboard.DetailsFragment;
import com.example.magicalsolution.ui.home.HomeFragment;
import com.example.magicalsolution.ui.notifications.NotificationsFragment;
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigationItem;
import com.tenclouds.fluidbottomnavigation.listener.OnTabSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnTabSelectedListener {

    private ActivityMainBinding binding;
    private List<FluidBottomNavigationItem> list=new ArrayList<FluidBottomNavigationItem>();
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        fragment=new HomeFragment();
        loadFragment();
        setSupportActionBar(binding.toolbar);
        addItems();
        binding.fluidBottomNavigation.setItems(list);
        binding.fluidBottomNavigation.setOnTabSelectedListener(this);
    }

    private void addItems() {
        list.add(new FluidBottomNavigationItem(
                getString(R.string.title_home),
                ContextCompat.getDrawable(this, R.drawable.ic_home_black_24dp)));
        list.add(new FluidBottomNavigationItem(
                getString(R.string.title_dashboard),
                ContextCompat.getDrawable(this, R.drawable.ic_dashboard_black_24dp)));
        list.add(new FluidBottomNavigationItem(
                getString(R.string.title_notifications),
                ContextCompat.getDrawable(this, R.drawable.ic_notifications_black_24dp)));
    }

    @Override
    public void onTabSelected(int i) {
        switch (i){
            case 0:
                fragment=new HomeFragment();
                break;
            case 1:
                fragment=new DetailsFragment();
                break;
            case 2:
                fragment=new NotificationsFragment();
                break;
        }
        loadFragment();
    }

    private void loadFragment() {
        FragmentTransaction fragmentTransaction=
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment,fragment);
        fragmentTransaction.commitAllowingStateLoss();
    }
}