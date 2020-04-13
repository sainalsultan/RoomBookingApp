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
public class HomeFragment extends Fragment {

    private RecyclerView recyclerview_popular;
    private AdapterPopular mAdapter;
    private List<String> datas;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerview_popular = v.findViewById(R.id.recyclerview_popular);
        recyclerview_popular.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recyclerview_popular.setLayoutManager(layoutManager);

        datas = new ArrayList<>();
        datas.add("Room Name1");
        datas.add("Room Name2");
        datas.add("Room Name3");
        datas.add("Room Name4");
        datas.add("Room Name5");
        mAdapter = new AdapterPopular(datas,getActivity());
        recyclerview_popular.setAdapter(mAdapter);

        return v;
    }
}
