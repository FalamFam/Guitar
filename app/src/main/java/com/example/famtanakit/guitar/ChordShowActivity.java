package com.example.famtanakit.guitar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChordShowActivity extends AppCompatActivity {

    private TextView eChord;
    private TextView eNameChord;



    private long mId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord_show);

        Intent intent = getIntent();
        String chord = intent.getStringExtra("chord_name");
        String keyChord = intent.getStringExtra("key_chord");

        mId = intent.getLongExtra("id", 0);

        eChord = findViewById(R.id.chord_text);
        eNameChord = findViewById(R.id.name_chord_text);

        eChord.setText(chord);
        eNameChord.setText(keyChord);

    }
}
