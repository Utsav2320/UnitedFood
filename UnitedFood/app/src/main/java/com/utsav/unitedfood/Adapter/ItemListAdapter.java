package com.utsav.unitedfood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.utsav.unitedfood.Model.ItemListModel;
import com.utsav.unitedfood.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder>{

    private ItemListModel[] data;

    public ItemListAdapter(ItemListModel[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_list, parent, false);
        ViewHolder viewHolder=new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position) {
        holder.cimage.setImageResource(data[position].getImgItem());
        holder.textItemName.setText(data[position].getItemName());
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView cimage;
        TextView textItemName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cimage=itemView.findViewById(R.id.imgCo);
            textItemName=itemView.findViewById(R.id.txtItemList);
        }
    }
}
