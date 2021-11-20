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

public class chat_fragment extends Fragment {

    @Nullable
    RecyclerView recyclerView1;
    List<Model1> itemList1;




    public View onCreateView(@NonNull LayoutInflater inflater1, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view1=inflater1.inflate(R.layout.fragment_chat,container,false);
        recyclerView1=view1.findViewById(R.id.recycler_1);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));

//initData();

        recyclerView1.setAdapter(new itemAdapter1(initData1()));


        return view1;
    }

    private List<Model1> initData1()
    {
        itemList1=new ArrayList<>();
        itemList1.add(new Model1("Tariz Shahid"));
        itemList1.add(new Model1("Arham Irfan"));
        itemList1.add(new Model1("Rao Ahsan"));
        itemList1.add(new Model1("Muzamuil Khota"));
        itemList1.add(new Model1("Shabrez Gobbi"));
        itemList1.add(new Model1("Zunair Zuni"));
        itemList1.add(new Model1("Saad totta"));
        itemList1.add(new Model1("Yousaf Shapar"));
        itemList1.add(new Model1("Babar piyara"));
        itemList1.add(new Model1("Talha TT"));
        itemList1.add(new Model1("Afzal Piyara"));





        return itemList1;
    }
}
