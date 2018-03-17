package com.example.android.myandroidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        String joke = "";
        if (intent != null){
            joke = intent.getStringExtra("joke");
        }
        TextView tvJoke = findViewById(R.id.tvJoke);
        tvJoke.setText(joke);
    }
}
