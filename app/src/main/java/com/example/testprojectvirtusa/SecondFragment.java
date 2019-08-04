package com.example.testprojectvirtusa;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;

public class SecondFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<String> textArray;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        textArray = new ArrayList<>();

        recyclerView.setHasFixedSize(true);
        recyclerViewAdapter = new RecyclerViewAdapter(textArray);
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    public void updateRecyclerView(String text) {
        textArray.add(text);
        Collections.sort(textArray);
        recyclerViewAdapter.notifyDataSetChanged();
    }
}
