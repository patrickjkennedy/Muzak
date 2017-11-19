package com.example.android.muzak;

/**
 * Created by pkennedy on 11/19/17.
 */

public class Artist {

    private String mName;
    private int mImageResourceId;

    public Artist(String name, int imageResourceId){
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public String getName() { return mName; }

    public int getImageResourceId() { return mImageResourceId; }
}
