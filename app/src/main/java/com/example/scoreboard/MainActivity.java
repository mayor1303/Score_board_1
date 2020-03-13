package com.example.scoreboard;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText mMessageEditText;

public static final String TAG ="MainActivity";


    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.scoreboard.main_score_board.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.target);
//        ImageView imageView = (ImageView) findViewById(R.id.);
//        if(savedInstanceState != null){
//            int score =savedInstanceState.getInt(target);



        }


    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this,main_score_board.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);

    }




    @Override
    protected void onStart() {

        super.onStart();
        Log.d(TAG,"onStart");
    }



    @Override
        protected void onPause() {

        super.onPause();

        Log.d(TAG, "onPause");
    }


    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
