package com.affinityapps.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        ArrayList<Music> arrayList = new ArrayList<>();
        arrayList.add(new Music("Play Song >",  "B.O.B", "Outkast"));
        arrayList.add(new Music("Play Song >",  "The Symphony", "Marley Marl"));
        arrayList.add(new Music("Play Song >",  "That’s the Joint", "Funky 4 + 1"));
        arrayList.add(new Music("Play Song >",  "Push It", "Salt-N-Pepa"));
        arrayList.add(new Music("Play Song >", "Lost Ones", "Lauryn Hill"));
        arrayList.add(new Music("Play Song >",  "Me, Myself and I", "De La Soul"));
        arrayList.add(new Music("Play Song >",  "Top Billin", "Audio Two"));
        arrayList.add(new Music("Play Song >",  "California Love", "2Pac and Dr. Dre"));

        MusicAdapter adapter = new MusicAdapter(this, arrayList);

        ListView listView = findViewById(R.id.music_list);

        listView.setAdapter(adapter);

    }
}
