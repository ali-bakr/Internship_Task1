package com.aliaboubakr.gauravtask1.model;

public class PrevOrdersModel {
    private int mImageResourse;
    private String mItemName;
    private String mItemPrice;
    private String mItemWeight;

    public PrevOrdersModel(int mImageResourse, String mItemName, String mItemPrice, String mItemWeight) {
        this.mImageResourse = mImageResourse;
        this.mItemName = mItemName;
        this.mItemPrice = mItemPrice;
        this.mItemWeight = mItemWeight;
    }

    public int getmImageResourse() {
        return mImageResourse;
    }

    public void setmImageResourse(int mImageResourse) {
        this.mImageResourse = mImageResourse;
    }

    public String getmItemName() {
        return mItemName;
    }

    public void setmItemName(String mItemName) {
        this.mItemName = mItemName;
    }

    public String getmItemPrice() {
        return mItemPrice;
    }

    public void setmItemPrice(String mItemPrice) {
        this.mItemPrice = mItemPrice;
    }

    public String getmItemWeight() {
        return mItemWeight;
    }

    public void setmItemWeight(String mItemWeight) {
        this.mItemWeight = mItemWeight;
    }
}
