package com.aliaboubakr.gauravtask1;

import android.widget.ImageView;
import android.widget.TextView;

public interface ShampooCallBack {
    void onShampooItemClicked(int pos, ImageView itemImage, TextView itemPrice,TextView itemWeight,TextView itemDescription);

}
