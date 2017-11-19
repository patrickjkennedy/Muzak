package com.example.android.muzak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    private ArrayList<Artist> artists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        artists = new ArrayList<Artist>();

        //Create artist data

        artists.add(new Artist("CHVRCHES", R.drawable.every_open_eye));
        artists.add(new Artist("Tom Waits", R.drawable.blue_valentine));
        artists.add(new Artist("Flook", R.drawable.flook_live));
        artists.add(new Artist("Tegan and Sara", R.drawable.love_you_to_death));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }




}
