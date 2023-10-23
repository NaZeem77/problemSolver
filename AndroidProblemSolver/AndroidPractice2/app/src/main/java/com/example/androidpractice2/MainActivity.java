package com.example.androidpractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void toFWGC(View v) {
        Intent toFarmer = new Intent(this, FWGCscreen.class);
        startActivity(toFarmer);
    }
    public void toPuzzle(View v) {
        Intent toPuzz = new Intent(this, puzzleScreen.class);
        startActivity(toPuzz);
    }
    
}