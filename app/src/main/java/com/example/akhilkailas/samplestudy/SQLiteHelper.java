package com.example.akhilkailas.samplestudy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;
    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertData(){
        db = getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("Hello","Hello");
        db.insert("talename",null,contentValues);
    }


    public void getValues(){
        db = getWritableDatabase();
        String query = "Select * from MyValues";
        Cursor res = db.rawQuery(query,null);
        if(res.getCount() >0 ){
            res.moveToFirst();
            do {

            }while (res.moveToNext());
        }
        res.close();
    }
}
