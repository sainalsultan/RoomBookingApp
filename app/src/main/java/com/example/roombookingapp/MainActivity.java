package com.example.roombookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;
    RadioGroup radiogroup_home;
    RadioButton radiobutton_home,radiobutton_search,radiobutton_profile;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.container);
        radiogroup_home = findViewById(R.id.radiogroup_home);
        radiobutton_home = findViewById(R.id.radiobutton_home);
        radiobutton_search = findViewById(R.id.radiobutton_search);
        radiobutton_profile = findViewById(R.id.radiobutton_profile);

        radiobutton_home.setChecked(true);
        showFragment(new HomeFragment());

        radiogroup_home.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radiobutton_home :
                        showFragment(new HomeFragment());
                        break;
                    case R.id.radiobutton_search :
                        showFragment(new SearchFragment());
                        break;
                    case R.id.radiobutton_profile :
                        showFragment(new ProfileFragment());
                        break;
                }
            }
        });
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.commit();
    }
}
