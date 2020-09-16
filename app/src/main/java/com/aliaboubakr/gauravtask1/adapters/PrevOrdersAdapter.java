package com.aliaboubakr.gauravtask1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aliaboubakr.gauravtask1.R;
import com.aliaboubakr.gauravtask1.model.PrevOrdersModel;

import java.util.ArrayList;


public class PrevOrdersAdapter extends RecyclerView.Adapter<PrevOrdersAdapter.PrevOrdersViewHolder> {

    private ArrayList<PrevOrdersModel>prevOrdersModelArrayList;


    public PrevOrdersAdapter(ArrayList<PrevOrdersModel> prevOrdersModelArrayList) {
        this.prevOrdersModelArrayList = prevOrdersModelArrayList;
    }


    @NonNull
    @Override
    public PrevOrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.prev_orders_item, parent, false);
        PrevOrdersViewHolder prevOrdersViewHolder = new PrevOrdersViewHolder(v);
        return prevOrdersViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PrevOrdersViewHolder holder, int position) {
        PrevOrdersModel prevOrdersModelCurrent = prevOrdersModelArrayList.get(position);
        holder.mItemImage.setImageResource(prevOrdersModelCurrent.getmImageResourse());
        holder.mItemName.setText(prevOrdersModelCurrent.getmItemName());
        holder.mItemPrice.setText(prevOrdersModelCurrent.getmItemPrice());
        holder.mItemWeight.setText(prevOrdersModelCurrent.getmItemWeight());
    }


    @Override
    public int getItemCount() {
        return prevOrdersModelArrayList.size();
    }

    public  static class PrevOrdersViewHolder extends RecyclerView.ViewHolder{

        public ImageView mItemImage;
        public TextView mItemName;
        public TextView mItemPrice;
        public TextView mItemWeight;



        public PrevOrdersViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemImage=itemView.findViewById(R.id.iv_prev_order_image);
            mItemName=itemView.findViewById(R.id.tv_prev_orders_name);
            mItemPrice=itemView.findViewById(R.id.tv_prev_orders_price);
            mItemWeight=itemView.findViewById(R.id.tv_prev_orders_wheight);
        }
    }
}
