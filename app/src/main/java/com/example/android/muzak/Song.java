package com.example.android.muzak;

/**
 * Created by pkennedy on 11/18/17.
 */

public class Song {
    private String mTitle;
    private String mArtist;
    private String mAlbum;
    private int mImageResourceId;
    private String mDuration;

    public Song(String title, String artist, String album, int imageResourceId, String duration){
        mTitle = title;
        mArtist = artist;
        mAlbum = album;
        mImageResourceId = imageResourceId;
        mDuration = duration;
    }

    public String getTitle() { return mTitle; }

    public String getArtist() { return mArtist; }

    public String getAlbum() { return mAlbum; }

    public int getImageResourceId() { return mImageResourceId; }

    public String getDuration() { return mDuration; }

}
