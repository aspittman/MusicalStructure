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
        setContentView(R.layout.activity_rock);

        final ListView list = findViewById(R.id.rock_listview);

        ArrayList<Music> arrayList = new ArrayList<>();
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));
        arrayList.add(new Music("Play Song >", "Rock", "bleh"));



        ArrayAdapter<Music> arrayAdapter = new ArrayAdapter<Music>(this, android.R.layout.simple_list_item_activated_1, arrayList);
        list.setAdapter(arrayAdapter);
    }
}

