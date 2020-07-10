package com.affinityapps.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rockText = (TextView) findViewById(R.id.rock_textview);

        rockText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        TextView rapText = (TextView) findViewById(R.id.rap_textview);

        rapText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rapIntent = new Intent(MainActivity.this, RapActivity.class);
                startActivity(rapIntent);
            }
        });

        TextView classicalText = (TextView) findViewById(R.id.classical_textview);

        classicalText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                startActivity(classicalIntent);
            }
        });

        TextView clubDanceText = (TextView) findViewById(R.id.club_dance_textview);

        clubDanceText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent clubDanceIntent = new Intent(MainActivity.this, ClubDanceActivity.class);
                startActivity(clubDanceIntent);
            }
        });
    }
}


