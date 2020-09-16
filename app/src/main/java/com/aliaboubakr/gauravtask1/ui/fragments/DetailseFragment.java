
package com.aliaboubakr.gauravtask1.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.transition.TransitionInflater;

import com.aliaboubakr.gauravtask1.R;

public  class DetailseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_details,container,false);
        ImageView imageView=v.findViewById(R.id.details_element_iv);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
           imageView.setImageResource( bundle.getInt("shared"));


        }

        v.findViewById(R.id.detals_back_tb).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,
                        new ItemFragment()).commit();
            }
        });
       // setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(android.R.transition.move));

        return v;
    }
}
