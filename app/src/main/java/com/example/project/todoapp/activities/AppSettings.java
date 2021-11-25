package com.example.project.todoapp.activities;


import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.project.todoapp.R;

public class AppSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(getString(R.string.settings_title));
        getPrefFragment();
    }



    //getting the setting fragment
    private void getPrefFragment(){
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();


    }
}
