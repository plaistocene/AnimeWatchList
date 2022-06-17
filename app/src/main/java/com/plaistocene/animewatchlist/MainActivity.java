package com.plaistocene.animewatchlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button search_fragment_btn, my_list_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_fragment_btn = findViewById(R.id.search_btn);
        my_list_btn = findViewById(R.id.my_list_btn);

        search_fragment_btn.setOnClickListener(view -> changeFragment(new SearchFragment()));

        my_list_btn.setOnClickListener(view -> changeFragment(new MyListFragment()));
    }

    private void changeFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_fl, fragment);
        fragmentTransaction.commit();
    }


}