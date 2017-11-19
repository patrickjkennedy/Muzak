package com.example.android.muzak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    private ArrayList<Album> albums;
    private ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        albums = new ArrayList<Album>();

        //Create album data

        albums.add(new Album("Every Open Eye", "CHVRCHES", "1:17", R.drawable.every_open_eye));
        albums.add(new Album("Blue Valentine", "Tom Waits", "0:49", R.drawable.blue_valentine));
        albums.add(new Album("Flook! Live!", "Flook", "0:36" , R.drawable.flook_live));
        albums.add(new Album("Love You to Death", "Tegan and Sara", "0:31" , R.drawable.love_you_to_death));

        //Create song data

        songs.add(new Song("That Girl", "Tegan and Sara", "Love You to Death",
                R.drawable.love_you_to_death, "2:44"));
        songs.add(new Song("Faint of Heart", "Tegan and Sara", "Love You to Death",
                R.drawable.love_you_to_death, "2:55"));
        songs.add(new Song("Boyfriend", "Tegan and Sara", "Love You to Death",
                R.drawable.love_you_to_death, "2:47"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Create a new intent to open the {@link SongsActivity}
                Intent albumSongsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);

                // Construct the songs arraylist for the album that was selected
                ArrayList<Song> albumSongs = new ArrayList<Song>();

                Album album =  albums.get(i);
                for (Song song: songs){
                    if (song.getAlbum().equals(album.getTitle())){
                        albumSongs.add(song);
                    }
                }

                // Create a parcelable bundle to pass to the next intent

               albumSongsIntent.put

                // Send bundle through Intent
                albumSongsIntent.putExtras(bundle);

                // Start the new activity
                startActivity(albumSongsIntent);
            }
        });




    }




}
