package com.example.homework2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragmentForBtn extends Fragment {
    Button buttonForPlus;
    Button buttonForMinus;
    TextView tv;
    public Integer count = 0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_for_btn, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonForPlus = view.findViewById(R.id.btn);
        buttonForMinus = view.findViewById(R.id.btn_minus);
        tv = view.findViewById(R.id.tv);
        buttonForPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tv.setText(String.valueOf(count));
            }
        });
        buttonForMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tv.setText(String.valueOf(count));
            }
        });
    }
}