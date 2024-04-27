package com.example.pr_22_106_km;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "contactDB";
    public static final String TABLE_USER = "user";
    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_SURNAME = "surname";
    public static final String KEY_NUMBER = "number";

    public static final String TABLE_TEACHER = "teacher";
    public static final String TABLE_SCHEDULE = "schedule";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_USER + "(" + KEY_ID + " integer primary key,"
                + KEY_NAME + " text, " + KEY_SURNAME + " text, " + KEY_NUMBER + " integer" + ")");

        db.execSQL("INSERT INTO " + TABLE_USER +
         "(" + KEY_NAME + ", " + KEY_SURNAME + ", " + KEY_NUMBER + ")" +
                " VALUES " + "(" + "Марина" + ", " + "Кошелевская"  + ", " + "89137987546" + ")");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("drop table if exists " + TABLE_USER);

        onCreate(db);


    }
}
