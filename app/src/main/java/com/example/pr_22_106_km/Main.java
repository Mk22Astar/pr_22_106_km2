package com.example.pr_22_106_km;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    public void onClick(View view)
    {
        Intent intent = new Intent(this, Raspisanie.class);
        startActivity(intent);

    }


}