package com.example.smdassignment02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ViewHolder>{

    List<Model> itemList1;
    public itemAdapter(List<Model> itemList) {
this.itemList1=itemList;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemimage.setImageResource(itemList1.get(position).getImage());
        holder.itemtxt.setText(itemList1.get(position).getName());

    }

    @Override
    public int getItemCount() {


        return itemList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemimage;
        TextView itemtxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            itemimage=itemView.findViewById(R.id.itemid);
            itemtxt=itemView.findViewById(R.id.itemname);



        }
    }
}
