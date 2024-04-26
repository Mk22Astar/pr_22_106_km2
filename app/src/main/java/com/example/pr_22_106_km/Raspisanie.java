package com.example.pr_22_106_km;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Raspisanie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspisanie);

    }

    public void onClick(View view)
    {
        Intent intent = new Intent(this, Prepodavateli.class);
        startActivity(intent);


    }


}