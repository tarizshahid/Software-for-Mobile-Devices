package com.example.smdassignment02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemAdapter1 extends RecyclerView.Adapter<itemAdapter1.ViewHolder>{

    List<Model1> itemList2;
    public itemAdapter1(List<Model1> itemList) {
this.itemList2=itemList;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item1,parent,false);

        ViewHolder viewHolder1=new ViewHolder(view);


        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder1, int position) {
        holder1.itemtxt1.setText(itemList2.get(position).getName());

    }

    @Override
    public int getItemCount() {


        return itemList2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView itemtxt1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemtxt1=itemView.findViewById(R.id.itemname1);



        }
    }
}
