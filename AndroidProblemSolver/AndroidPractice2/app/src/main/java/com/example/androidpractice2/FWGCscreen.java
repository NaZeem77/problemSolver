package com.example.androidpractice2;

import androidx.appcompat.app.AppCompatActivity;
import com.example.domains.farmer.FarmerState;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FWGCscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fwgcscreen);
    }

    public void toFWGCMain(View v) {
        Intent toGame = new Intent(this, fwgcMain.class);
        startActivity(toGame);
    }
}