package com.doanburak.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_first, container, false);

        Button btn_secondFragment = v.findViewById(R.id.btn_secondFragment);

        btn_secondFragment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                goSecond(v);
            }

        });

        return v;

    }

    public void goSecond(View view){

        SecondFragment secondFragment = new SecondFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //we used replace to remove the existing fragment and add a new one.
        transaction.replace(R.id.mainConstraint, secondFragment, "Second");
        transaction.commit();

    }
}