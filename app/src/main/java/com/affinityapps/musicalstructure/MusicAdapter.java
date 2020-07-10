package com.affinityapps.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Context context, ArrayList<Music> musicArrayList) {
        super(context, 0, musicArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list_item, parent, false);
        }

        Music musicPosition = getItem(position);

        TextView playOptionTextView = listItemView.findViewById(R.id.play_option_text);
        TextView songNameTextView = listItemView.findViewById(R.id.song_name_text);
        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name_text);

        assert musicPosition != null;
        playOptionTextView.setText(musicPosition.getPlaySong());
        songNameTextView.setText(musicPosition.getSongTitle());
        artistNameTextView.setText(musicPosition.getArtistName());

        return listItemView;
    }
}
