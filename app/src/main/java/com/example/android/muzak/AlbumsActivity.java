package com.example.android.muzak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Album> albums = new ArrayList<Album>();

        //Create album data

        albums.add(new Album("Every Open Eye", "CHVRCHES", "1:17", R.drawable.every_open_eye));
        albums.add(new Album("Blue Valentine", "Tom Waits", "0:49", R.drawable.blue_valentine));
        albums.add(new Album("Flook! Live!", "Flook", "0:36" , R.drawable.flook_live));
        albums.add(new Album("Love You to Death", "Tegan and Sara", "0:31" , R.drawable.love_you_to_death));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }




}
