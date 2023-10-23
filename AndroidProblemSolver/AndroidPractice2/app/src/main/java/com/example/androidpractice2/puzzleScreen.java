package com.example.androidpractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class puzzleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_screen);
    }

    public void toPuzzleGame(View v) {
        Intent toGame = new Intent(this, puzzleMain.class);
        startActivity(toGame);
    }

}