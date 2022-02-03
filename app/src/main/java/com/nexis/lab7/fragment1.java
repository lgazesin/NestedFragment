package com.nexis.lab7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexis.lab7.databinding.FragmentFragment1Binding;


public class fragment1 extends Fragment {
    FragmentFragment1Binding binding;
    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFragment1Binding.inflate(inflater, container, false);

        binding.fragmentbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment2 fragment2 = new fragment2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.replace, fragment2);
                transaction.addToBackStack(null).commit();
            }
        });
        return binding.getRoot();

    }
}