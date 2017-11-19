package com.example.android.muzak;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pkennedy on 11/18/17.
 */

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_artists, parent, false);
        }

        // Get the {@link album} object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the TextView in the list_item_artists.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the title from the current song object and
        // set this text on the Title TextView
        nameTextView.setText(currentArtist.getName());

        // Find the ImageView in the list_item_artists.xml layout with the ID artist_image_view
        ImageView artistImageView = (ImageView) listItemView.findViewById(R.id.artist_image_view);
        // Get the title from the current song object and
        // set this text on the Title TextView
        artistImageView.setImageResource(currentArtist.getImageResourceId());

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
