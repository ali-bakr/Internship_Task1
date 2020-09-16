package com.aliaboubakr.gauravtask1.model;

public  class DiscoverModel {
private int mImageResourse;
private String mItemName;

    public DiscoverModel(int mImageResourse, String mItemName) {
        this.mImageResourse = mImageResourse;
        this.mItemName = mItemName;
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
}
