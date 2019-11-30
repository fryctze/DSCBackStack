package com.example.dscbackstack;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

    Button btnAct1, btnAct2;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnAct1 = view.findViewById(R.id.btnActivityOne);
        btnAct1.setOnClickListener(this);
        btnAct2 = view.findViewById(R.id.btnActivityTwo);
        btnAct2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnActivityOne:
                intent = new Intent(getContext(), OneActivity.class);
                startActivity(intent);
                break;
            case R.id.btnActivityTwo:
                intent = new Intent(getContext(), TwoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
