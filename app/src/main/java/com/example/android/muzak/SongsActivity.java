package com.example.android.muzak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Clearest Blue", "CHVRCHES", "Every Open Eye",
                R.drawable.placeholder, "3:54"));
        songs.add(new Song("Somewhere", "Tom Waits", "Blue Valentine",
                R.drawable.placeholder, "3:55"));
        songs.add(new Song("In Another Life", "Flook", "Flook! Live!",
                R.drawable.placeholder, "4:51"));
        songs.add(new Song("That Girl", "Tegan and Sara", "Love You to Death",
                R.drawable.placeholder, "2:44"));
        songs.add(new Song("Clearest Blue", "CHVRCHES", "Every Open Eye",
                R.drawable.placeholder, "3:54"));
        songs.add(new Song("Somewhere", "Tom Waits", "Blue Valentine",
                R.drawable.placeholder, "3:55"));
        songs.add(new Song("In Another Life", "Flook", "Flook! Live!",
                R.drawable.placeholder, "4:51"));
        songs.add(new Song("That Girl", "Tegan and Sara", "Love You to Death",
                R.drawable.placeholder, "2:44"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
