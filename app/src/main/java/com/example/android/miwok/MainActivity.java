
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


    }

    public void openNumber(View view) {
        Intent obj = new Intent(this, NumberActivity.class);
        startActivity(obj);


    }
    public void openFamily(View view) {
        Intent obj = new Intent(this, FamilyActivity.class);
        startActivity(obj);


    }
    public void openColor(View view) {
        Intent obj = new Intent(this, ColorsActivity.class);
        startActivity(obj);


    }
    public void openPhrase(View view) {
        Intent obj = new Intent(this, PhrasesActivity.class);
        startActivity(obj);


    }

}
