package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class main_score_board extends AppCompatActivity {
    private int teamScore;
    private TextView display_run;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_score_board);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.trun);
        textView.setText(message);
display_run=findViewById(R.id.display_run);
    }

    public void update_1(View view) {
        teamScore= teamScore+1;
displayScore(teamScore);


    }
    public void displayScore(int score){
        display_run.setText(String.valueOf(score));

    }

    public void update_6(View view) {
        teamScore= teamScore+6;
        displayScore(teamScore);
    }

    public void update_4(View view) {
        teamScore= teamScore+4;
        displayScore(teamScore);
    }

    public void update_2(View view) {
        teamScore= teamScore+2;
        displayScore(teamScore);
    }
}
