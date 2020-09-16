package com.aliaboubakr.gauravtask1.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.aliaboubakr.gauravtask1.R;
import com.aliaboubakr.gauravtask1.model.PrevOrdersModel;
import com.aliaboubakr.gauravtask1.model.ShampoModel;
import com.aliaboubakr.gauravtask1.ui.fragments.DetailseFragment;
import com.aliaboubakr.gauravtask1.ui.fragments.ItemFragment;

import java.util.ArrayList;


public class ShampoAdapter extends RecyclerView.Adapter<ShampoAdapter.ShampooViewHolder> {

    private ArrayList<ShampoModel>shampoModelArrayList;
Context mContext;

    public ShampoAdapter(ArrayList<ShampoModel> shampoModelArrayList, Context mContext) {
        this.shampoModelArrayList = shampoModelArrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ShampooViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shampoo_item, parent, false);
        ShampooViewHolder shampooViewHolder = new ShampooViewHolder(v);
        return shampooViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ShampooViewHolder holder, final int position) {
        final ShampoModel shampoModelCurrent = shampoModelArrayList.get(position);
        holder.mItemImage.setImageResource(shampoModelCurrent.getmImageResourse());
        holder.mItemName.setText(shampoModelCurrent.getmItemName());
        holder.mItemPrice.setText(shampoModelCurrent.getmItemPrice());
        holder.mItemWeight.setText(shampoModelCurrent.getmItemWeight());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("shared",shampoModelCurrent.getmImageResourse() );
                DetailseFragment detailseFragment=new DetailseFragment();
                ((FragmentActivity)mContext).getSupportFragmentManager().beginTransaction().addToBackStack("TAG").replace(R.id.frag_container,
                            detailseFragment).commit();
                 detailseFragment.setArguments(bundle);


            }
        });
    }


    @Override
    public int getItemCount() {
        return shampoModelArrayList.size();
    }

    public  static class ShampooViewHolder extends RecyclerView.ViewHolder{

        public ImageView mItemImage;
        public TextView mItemName;
        public TextView mItemPrice;
        public TextView mItemWeight;



        public ShampooViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemImage=itemView.findViewById(R.id.iv_shampoo_image);
            mItemName=itemView.findViewById(R.id.tv_shampoo_name);
            mItemPrice=itemView.findViewById(R.id.tv_shampoo_price);
            mItemWeight=itemView.findViewById(R.id.tv_shampoo_wheight);
        }
    }
}
