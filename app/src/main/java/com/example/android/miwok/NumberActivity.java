package com.example.android.miwok;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;


public class NumberActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        getSupportActionBar().setTitle("Number");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("One", "Lutti",R.drawable.number_one,R.raw.number_one));
        word.add(new Word("Two", "Otiiko",R.drawable.number_two,R.raw.number_two));
        word.add(new Word("Three", "Tolookosu",R.drawable.number_three,R.raw.number_three));
        word.add(new Word("Four", "Oyyisa",R.drawable.number_four,R.raw.number_four));
        word.add(new Word("Five", "Massokka",R.drawable.number_five,R.raw.number_five));
        word.add(new Word("Six", "Temmokka",R.drawable.number_six,R.raw.number_six));
        word.add(new Word("Seven", "Kenekaku",R.drawable.number_seven,R.raw.number_seven));
        word.add(new Word("Eight", "Kawinta",R.drawable.number_eight,R.raw.number_eight));
        word.add(new Word("Nine", "Wo’e",R.drawable.number_nine,R.raw.number_nine));
        word.add(new Word("Ten", "Na’aacha",R.drawable.number_ten,R.raw.number_ten));


        WordAdapter wordAdapter = new WordAdapter(this, word,R.color.category_numbers);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.numbersList);

        listView.setAdapter(wordAdapter);


       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word words = word.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(NumberActivity.this, words.getmAudioResourceId());

                // Start the audio file


                mMediaPlayer.start();
            }
        });


    }

}
