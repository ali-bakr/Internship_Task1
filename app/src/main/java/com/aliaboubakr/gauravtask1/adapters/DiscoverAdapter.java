package com.aliaboubakr.gauravtask1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.aliaboubakr.gauravtask1.R;
import com.aliaboubakr.gauravtask1.model.DiscoverModel;
import com.aliaboubakr.gauravtask1.ui.MainActivity;
import com.aliaboubakr.gauravtask1.ui.fragments.HomeFragment;
import com.aliaboubakr.gauravtask1.ui.fragments.ItemFragment;

import java.util.ArrayList;

public class DiscoverAdapter extends RecyclerView.Adapter<DiscoverAdapter.DiscoverViewHolder> {
    ArrayList<DiscoverModel> discoverModelArrayList;
    Context mContext;

    public DiscoverAdapter(ArrayList<DiscoverModel> discoverModelArrayList, Context mContext) {
        this.discoverModelArrayList = discoverModelArrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public DiscoverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_item,parent,false);
        DiscoverViewHolder discoverViewHolder=new DiscoverViewHolder(v);

       return  discoverViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DiscoverViewHolder holder, final int position) {

        final DiscoverModel discoverModelCurrent=discoverModelArrayList.get(position);
        holder.mItemName.setText(discoverModelCurrent.getmItemName());
        holder.mItemImage.setImageResource(discoverModelCurrent.getmImageResourse());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

if (position==0){
                    ((FragmentActivity)mContext).getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,
                                new ItemFragment()).commit();


            }
            }
        });
    }

    @Override
    public int getItemCount() {
        return discoverModelArrayList.size();
    }

    public static class DiscoverViewHolder extends RecyclerView.ViewHolder{

        public ImageView mItemImage;
        public TextView  mItemName;
        public DiscoverViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemImage=itemView.findViewById(R.id.iv_discover_item_image);
            mItemName=itemView.findViewById(R.id.tv_discover_item_name);


        }
    }
}
