package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        getSupportActionBar().setTitle("Color");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("Red", "Weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        word.add(new Word("Green", "Chokokki",R.drawable.color_green,R.raw.color_green));
        word.add(new Word("Brown", "Takaakki",R.drawable.color_brown,R.raw.color_brown));
        word.add(new Word("Gray", "Topoppi",R.drawable.color_gray,R.raw.color_gray));
        word.add(new Word("black", "Kululli",R.drawable.color_black,R.raw.color_black));
        word.add(new Word("White", "Kelelli",R.drawable.color_white,R.raw.color_white));
        word.add(new Word("Dusty Yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        word.add(new Word("Mustard Yellow", "chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));


        WordAdapter wordAdapter = new WordAdapter(this, word,R.color.category_colors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.colorList);
        listView.setAdapter(wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word words = word.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, words.getmAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
