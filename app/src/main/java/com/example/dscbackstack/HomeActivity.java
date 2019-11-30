package com.example.dscbackstack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       frameLayout = findViewById(R.id.framelayout);
       bottomNavigationView = findViewById(R.id.btm_navigation);

       bottomNavigationView.setOnNavigationItemSelectedListener(this);

       bottomNavigationView.setSelectedItemId(R.id.home_Fragment);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment;
        switch (menuItem.getItemId()){
            case R.id.home_Fragment:
                fragment = new HomeFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(frameLayout.getId(), fragment, fragment.getClass().getSimpleName())
                        .commit();
                return true;
            case R.id.fragmentOne:
                fragment = new OneFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(frameLayout.getId(), fragment, fragment.getClass().getSimpleName())
                        .commit();
                return true;
            case R.id.fragmentTwo:
                fragment = new TwoFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(frameLayout.getId(), fragment, fragment.getClass().getSimpleName())
                        .commit();
                return true;
        }
        return false;
    }
}
