package com.aliaboubakr.gauravtask1.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aliaboubakr.gauravtask1.R;
import com.aliaboubakr.gauravtask1.adapters.DiscoverAdapter;
import com.aliaboubakr.gauravtask1.adapters.PrevOrdersAdapter;
import com.aliaboubakr.gauravtask1.model.DiscoverModel;
import com.aliaboubakr.gauravtask1.model.PrevOrdersModel;

import java.util.ArrayList;

public  class HomeFragment extends Fragment {
    private RecyclerView mDiscoverRV,mPrevOrdersRV;
    private DiscoverAdapter discoverAdapter;
    private PrevOrdersAdapter prevOrdersAdapter;
    private RecyclerView.LayoutManager mLayoutManager,mLayoutManager2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v= inflater.inflate(R.layout.fragment_home,container,false);


        ArrayList<PrevOrdersModel> prevOrdersModelArrayList = new ArrayList<>();
        ArrayList<DiscoverModel> discoverModelsArrayList = new ArrayList<>();
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.salad_sample, "salad", "20 $","1 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.buture_sample, "buture", "23 $","0.5 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.salad_sample, "salad", "22 $","2 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.buture_sample, "buture", "46 $","1.5 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.salad_sample, "sugar", "20 ","1 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.salad_sample, "salad", "20 $","1 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.buture_sample, "buture", "23 $","0.5 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.salad_sample, "salad", "22 $","2 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.buture_sample, "buture", "46 $","1.5 KG"));
        prevOrdersModelArrayList.add(new PrevOrdersModel(R.drawable.salad_sample, "sugar", "20 ","1 KG"));


        discoverModelsArrayList.add(new DiscoverModel(R.drawable.shampoo_sample,"shampo"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.cream_sample,"cream"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.bescuit_sample,"biscuit"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.clothes_sample,"Clothes"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.shampoo_sample,"shampo"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.cream_sample,"cream"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.bescuit_sample,"biscuit"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.clothes_sample,"Clothes"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.shampoo_sample,"shampo"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.cream_sample,"cream"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.bescuit_sample,"biscuit"));
        discoverModelsArrayList.add(new DiscoverModel(R.drawable.clothes_sample,"Clothes"));

        mDiscoverRV = v.findViewById(R.id.discover_rv);

        mPrevOrdersRV = v.findViewById(R.id.prev_orders_rv);

        mDiscoverRV.setHasFixedSize(true);
        mPrevOrdersRV.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this.getContext(),LinearLayoutManager.HORIZONTAL,false);
        mLayoutManager2= new LinearLayoutManager(this.getContext(),LinearLayoutManager.HORIZONTAL,false);
        discoverAdapter = new DiscoverAdapter(discoverModelsArrayList,getContext());
        prevOrdersAdapter = new PrevOrdersAdapter(prevOrdersModelArrayList);
     LayoutAnimationController controller= AnimationUtils.loadLayoutAnimation(getContext(),R.anim.layout_slide_right);
     mDiscoverRV.setLayoutAnimation(controller);
     mDiscoverRV.scheduleLayoutAnimation();
        mPrevOrdersRV.setLayoutAnimation(controller);
        mPrevOrdersRV.scheduleLayoutAnimation();

     mDiscoverRV.setLayoutManager(mLayoutManager);
        mPrevOrdersRV.setLayoutManager(mLayoutManager2);

        mDiscoverRV.setAdapter(discoverAdapter);
        mPrevOrdersRV.setAdapter(prevOrdersAdapter);



        return v;
    }
}
