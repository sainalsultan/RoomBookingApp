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
public class SearchFragment extends Fragment {

    private RecyclerView recyclerview_search;
    private AdapterSearch mAdapter;
    private List<String> datas = new ArrayList<>();

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerview_search = v.findViewById(R.id.recyclerview_search);
        recyclerview_search.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview_search.setLayoutManager(layoutManager);

        datas.add("Room Name 1");
        datas.add("Room Name 2");
        datas.add("Room Name 3");
        datas.add("Room Name 4");
        datas.add("Room Name 5");

        mAdapter = new AdapterSearch(datas,getActivity());
        recyclerview_search.setAdapter(mAdapter);

        return v;
    }
}
