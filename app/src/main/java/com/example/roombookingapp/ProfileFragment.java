package com.example.roombookingapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private RecyclerView recyclerview_profile;
    private AdapterProfile mAdapter;
    private List<String> datas = new ArrayList<>();
    private List<Integer> dataImages = new ArrayList<>();

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        recyclerview_profile = v.findViewById(R.id.recyclerview_profile);
        recyclerview_profile.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview_profile.setLayoutManager(layoutManager);
        //information
        datas.add("Account");
        datas.add("Booking");
        datas.add("Logout");

        //image
        dataImages.add(R.drawable.ic_account);
        dataImages.add(R.drawable.ic_booking);
        dataImages.add(R.drawable.ic_logout);

        mAdapter = new AdapterProfile(datas,dataImages,getActivity());
        recyclerview_profile.setAdapter(mAdapter);

        return v;
    }
}
