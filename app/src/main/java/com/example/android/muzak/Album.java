package com.example.android.muzak;

/**
 * Created by pkennedy on 11/19/17.
 */

public class Album {

    private String mTitle;
    private String mArtist;
    private String mDuration;
    private int mImageResourceId;

    public Album(String title, String artist, String duration, int imageResourceId){
        mTitle = title;
        mArtist = artist;
        mImageResourceId = imageResourceId;
        mDuration = duration;

    }

    public String getTitle() { return mTitle; }

    public String getArtist() { return mArtist; }

    public String getDuration() { return mDuration; }

    public int getImageResourceId() { return mImageResourceId; }

}
