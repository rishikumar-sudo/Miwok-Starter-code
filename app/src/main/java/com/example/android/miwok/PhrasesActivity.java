package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        getSupportActionBar().setTitle("Phrases");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
        word.add(new Word("What is your name?", "tinnә oyaase'nә",R.raw.phrase_where_are_you_going));
        word.add(new Word("My name is...", "oyaaset...",R.raw.phrase_where_are_you_going));
        word.add(new Word("How are you feeling?", "michәksәs?",R.raw.phrase_where_are_you_going));
        word.add(new Word("I’m feeling good.", "kuchi achit",R.raw.phrase_where_are_you_going));
        word.add(new Word("Are you coming?", "әәnәs'aa?",R.raw.phrase_where_are_you_going));
        word.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_where_are_you_going));
        word.add(new Word("I’m coming.", "әәnәm",R.raw.phrase_where_are_you_going));
        word.add(new Word("Let’s go", "yoowutis",R.raw.phrase_where_are_you_going));
        word.add(new Word("Come here.", "әnni'nem",R.raw.phrase_where_are_you_going));


        WordAdapter wordAdapter = new WordAdapter(this, word,R.color.category_phrases);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.phrasesList);
        listView.setAdapter(wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word words = word.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, words.getmAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
