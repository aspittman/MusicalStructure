package com.affinityapps.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        ArrayList<Music> arrayList = new ArrayList<>();
        arrayList.add(new Music("Play Song >", "Stairway to Heaven", "Led Zeppelin"));
        arrayList.add(new Music("Play Song >", "Hey Jude", "Beatles"));
        arrayList.add(new Music("Play Song >", "All Along the Watchtower", "Hendrix, Jimi"));
        arrayList.add(new Music("Play Song >", "Satisfaction", "Rolling Stones"));
        arrayList.add(new Music("Play Song >", "Like A Rolling Stone", "Dylan, Bob"));
        arrayList.add(new Music("Play Song >", "Another Brick In The Wall", "Pink Floyd"));
        arrayList.add(new Music("Play Song >", "Won't Get Fooled Again", "Who"));
        arrayList.add(new Music("Play Song >", "Hotel California", "Eagles"));

        MusicAdapter adapter = new MusicAdapter(this, arrayList);

        ListView listView = findViewById(R.id.music_list);

        listView.setAdapter(adapter);

    }
}

