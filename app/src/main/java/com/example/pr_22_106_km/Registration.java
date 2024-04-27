package com.example.pr_22_106_km;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    DBHelper dbHelper;
    Button btn;
    EditText etLogin, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        btn = (Button) findViewById(R.id.button);
        etLogin = (EditText) findViewById(R.id.editTextNumber);
        etPassword = (EditText) findViewById(R.id.editTextPassword);
        dbHelper = new DBHelper(this);
    }

    public void onClick(View v) {
        /*SQLiteDatabase database = dbHelper.getWritableDatabase();
        Cursor cursor = database.query(DBHelper.TABLE_USER, null, null, null, null, null, null);
        if(cursor.moveToFirst()){
            etLogin = cursor.getColumnIndex(DBHelper.KEY_NUMBER);
            etPassword = cursor.getColumnIndex(DBHelper.KEY_NUMBER);
        }*/
        /*boolean isExist = dbHelper.checkUserEx*/



        /*dbHelper.close();*/


    }

}