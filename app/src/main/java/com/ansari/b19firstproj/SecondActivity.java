package com.ansari.b19firstproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("mytag","SecondActivity Created");

        resultTextView = findViewById(R.id.textViewResult);

      String result =  getIntent().getExtras().getString("key_username");

      resultTextView.setText(result);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mytag","SecondActivity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mytag","SecondActivity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("mytag","SecondActivity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mytag","SecondActivity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("mytag","SecondActivity Destroyed");
    }
}
