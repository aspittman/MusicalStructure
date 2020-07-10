package com.affinityapps.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        ArrayList<Music> arrayList = new ArrayList<>();
        arrayList.add(new Music("Play Song >", "Vespers of 1610", "Monteverdi"));
        arrayList.add(new Music("Play Song >", "Dido and Aeneas", "Purcell"));
        arrayList.add(new Music("Play Song >", "The Four Seasons", "Vivaldi"));
        arrayList.add(new Music("Play Song >", "Brandenburg Concerto No. 3", "Bach"));
        arrayList.add(new Music("Play Song >", "B-minor Mass", "Bach"));
        arrayList.add(new Music("Play Song >", "Goldberg Variations", "Bach"));
        arrayList.add(new Music("Play Song >", "Messiah", "Handel"));
        arrayList.add(new Music("Play Song >", "Symphony No. 94, Surprise", "Haydn"));

        MusicAdapter adapter = new MusicAdapter(this, arrayList);

        ListView listView = findViewById(R.id.music_list);

        listView.setAdapter(adapter);

    }
}