package com.aliaboubakr.gauravtask1.ui.fragments;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.view.animation.AnimationUtils;
        import android.view.animation.LayoutAnimationController;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;
        import androidx.recyclerview.widget.GridLayoutManager;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;
        import androidx.transition.Fade;
        import  androidx.core.util.Pair;
        import com.aliaboubakr.gauravtask1.R;

        import com.aliaboubakr.gauravtask1.ShampooCallBack;
        import com.aliaboubakr.gauravtask1.adapters.ShampoAdapter;

        import com.aliaboubakr.gauravtask1.model.PrevOrdersModel;
        import com.aliaboubakr.gauravtask1.model.ShampoModel;

        import java.util.ArrayList;
        import java.util.List;

public  class ItemFragment extends Fragment  {
    private RecyclerView mShampoRV;
    private ShampoAdapter mShampooAdapter;
GridLayoutManager gridLayoutManager;
List<ShampoModel>shampoModelList;
    private RecyclerView.LayoutManager mLayoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_items,container,false);



        v.findViewById(R.id.items_back_tb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,
                        new HomeFragment()).commit();
            }
        });
        ArrayList<ShampoModel> shampoModelArrayList = new ArrayList<>();


        shampoModelArrayList.add(new ShampoModel(R.drawable.salad_sample, "salad", "20 $","1 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.buture_sample, "buture", "23 $","0.5 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.salad_sample, "salad", "22 $","2 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.buture_sample, "buture", "46 $","1.5 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.salad_sample, "sugar", "20 ","1 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.salad_sample, "salad", "20 $","1 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.buture_sample, "buture", "23 $","0.5 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.salad_sample, "salad", "22 $","2 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.buture_sample, "buture", "46 $","1.5 KG"));
        shampoModelArrayList.add(new ShampoModel(R.drawable.salad_sample, "sugar", "20 ","1 KG"));




        mShampoRV = v.findViewById(R.id.item_rv);


        mShampoRV.setHasFixedSize(true);
gridLayoutManager= new GridLayoutManager(this.getContext(),2,GridLayoutManager.VERTICAL,false);

        mLayoutManager = new LinearLayoutManager(this.getContext(),GridLayoutManager.VERTICAL,false);

        mShampooAdapter = new ShampoAdapter(shampoModelArrayList,getContext());
        LayoutAnimationController controller= AnimationUtils.loadLayoutAnimation(getContext(),R.anim.layout_slide_up);
        mShampoRV.setLayoutAnimation(controller);
        mShampoRV.scheduleLayoutAnimation();

        mShampoRV.setLayoutManager(gridLayoutManager);

        mShampoRV.setAdapter(mShampooAdapter);






        return v;
    }



}
