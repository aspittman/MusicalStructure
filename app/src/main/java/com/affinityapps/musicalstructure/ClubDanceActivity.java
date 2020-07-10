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

public class ClubDanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        ArrayList<Music> arrayList = new ArrayList<>();
        arrayList.add(new Music("Play Song >", "Light Years Away", "Oliver"));
        arrayList.add(new Music("Play Song >", "Okay", "Shiba San"));
        arrayList.add(new Music("Play Song >", "Summertime Sadness", "Lana Del Ray"));
        arrayList.add(new Music("Play Song >", "Years", "Alesso feat. Matthew Koma"));
        arrayList.add(new Music("Play Song >", "Voicemail", "Green Velvet & Patrick Topping"));
        arrayList.add(new Music("Play Song >", "Time for us", "Nicolas Jaar"));
        arrayList.add(new Music("Play Song >", "Good Enough", "Alice Wonderland"));
        arrayList.add(new Music("Play Song >", "BTSTU", "Jai Paul"));

        MusicAdapter adapter = new MusicAdapter(this, arrayList);

        ListView listView = findViewById(R.id.music_list);

        listView.setAdapter(adapter);
    }
}