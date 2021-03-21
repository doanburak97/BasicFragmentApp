package com.doanburak.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = new FirstFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();

        //if we want to show fragments on the activity we start transaction over the fragmentManager.
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.add(R.id.mainConstraint, firstFragment, "First");

        transaction.commit();
    }
}