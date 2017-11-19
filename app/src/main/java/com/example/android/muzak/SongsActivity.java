package com.example.android.muzak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    private ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        songs = new ArrayList<Song>();

        songs.add(new Song("Clearest Blue", "CHVRCHES", "Every Open Eye",
                R.drawable.every_open_eye, "3:54"));
        songs.add(new Song("Somewhere", "Tom Waits", "Blue Valentine",
                R.drawable.blue_valentine, "3:55"));
        songs.add(new Song("In Another Life", "Flook", "Flook! Live!",
                R.drawable.flook_live, "4:51"));
        songs.add(new Song("That Girl", "Tegan and Sara", "Love You to Death",
                R.drawable.love_you_to_death, "2:44"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Create a new intent to open the {@link NowPlaying}
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlaying.class);

                // Get the data for the song that was clicked
                Song song =  songs.get(i);


            }
        });



    }
}
