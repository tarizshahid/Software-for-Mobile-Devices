package com.example.smdassignment02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class message_fragment extends Fragment {

    @Nullable
    RecyclerView recyclerView;
    List<Model> itemList;




    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_message,container,false);
        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

//initData();

recyclerView.setAdapter(new itemAdapter(initData()));


         return view;
    }

    private List<Model> initData()
    {
        itemList=new ArrayList<>();
        itemList.add(new Model(R.drawable.courses , "Data Science"));
        itemList.add(new Model(R.drawable.courses, "Android Development"));
        itemList.add(new Model(R.drawable.courses, "Software Testing"));
        itemList.add(new Model(R.drawable.courses, "Professional Practices"));
        itemList.add(new Model(R.drawable.courses, "Information Security"));
        itemList.add(new Model(R.drawable.courses, "Blockchain Development"));
        itemList.add(new Model(R.drawable.courses, "Ethical Hacking"));
        itemList.add(new Model(R.drawable.courses, "Final Year Project"));


        return itemList;
    }
}
