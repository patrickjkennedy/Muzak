package com.example.android.muzak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Receive the intent send by {@link SongsActivity}
        Intent intent = getIntent();
        // Get song data passed in the intent
        String songTitle = intent.getStringExtra("title");
        String songArtist = intent.getStringExtra("artist");
        String songDuration = intent.getStringExtra("song_duration");
        int songAlbumCoverId = intent.getIntExtra("album_cover", R.drawable.placeholder);



        // Set the title in the Now Playing view to be the current song
        TextView nowPlayingTitleTextView = (TextView) findViewById(R.id.now_playing_title_text_view);
        nowPlayingTitleTextView.setText(songTitle);

        // Set the artist in the Now Playing view to be the current artist
        TextView nowPlayingArtistTextView = (TextView) findViewById(R.id.now_playing_artist_text_view);
        nowPlayingArtistTextView.setText(songArtist);

        // Set the duration in the Now Playing view to be the current song's duration
        TextView nowPlayingDurationTextView = (TextView) findViewById(R.id.now_playing_duration_text_view);
        nowPlayingDurationTextView.setText(songDuration);

        // Set the album cover in the Now Playing view to the current song's album cover
        ImageView nowPlayingAlbumCover = (ImageView) findViewById(R.id.now_playing_image_view);
        nowPlayingAlbumCover.setImageResource(songAlbumCoverId);
    }
}
