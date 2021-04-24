package com.example.gasnugasfinal;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListTugas extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        MyListTugas[] myListData = new MyListTugas[] {
                new MyListTugas("Membuat Aplikasi",R.drawable.ic_baseline_star_24,"12-02-2021","16-02-2021"," " ),
                new MyListTugas("Web Design", R.drawable.ic_baseline_star_24,"13-02-2021","15-02-2021","Mockup"),
                new MyListTugas("Statistika ", R.drawable.ic_baseline_star_24,"12-02-2021","16-02-2021","Data Mahasiswa "),
                new MyListTugas("Arduino", R.drawable.ic_baseline_star_24,"13-02-2021","17-02-2021","Sensor"),
                new MyListTugas("Arduino UNO", R.drawable.ic_baseline_star_24,"14-02-2021","18-02-2021","Micro"),
                new MyListTugas("PPL 1 ", R.drawable.ic_baseline_star_24,"13-02-2021","17-02-2021","Mind Map"),
                new MyListTugas("Database", R.drawable.ic_baseline_star_24,"12-02-2021","15-02-2021","Perpus"),
        };
        View view = inflater.inflate(R.layout.fragment_list_tugas, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ListTugas);
        MyListTugasAdapter adapter = new MyListTugasAdapter(getContext(),myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

}