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

        artists.add(new Artist("CHVRCHES", R.drawable.chvrches));
        artists.add(new Artist("Tom Waits", R.drawable.tom_waits));
        artists.add(new Artist("Flook", R.drawable.flook));
        artists.add(new Artist("Tegan and Sara", R.drawable.tegan_and_sara));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }




}
