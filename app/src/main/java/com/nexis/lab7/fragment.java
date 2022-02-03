package com.nexis.lab7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexis.lab7.databinding.ActivityMainBinding;
import com.nexis.lab7.databinding.FragmentFragment1Binding;
import com.nexis.lab7.databinding.FragmentFragmentBinding;

public class fragment extends Fragment {
    FragmentFragmentBinding binding;
    public fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFragmentBinding.inflate(inflater, container, false);


        binding.fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment1 fragment1 = new fragment1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.replace, fragment1);
                transaction.addToBackStack(null).commit();
            }
        });
        return binding.getRoot();
    }
}