package com.example.databinding.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.databinding.RoomClass.User;

import java.util.Objects;

public class Dao {

    public void create(Context context,String sql,String DbName,SQLiteDatabase.CursorFactory factory){
        SQLiteDatabase db = new DatabaseHelper(context,DbName,factory,1).getWritableDatabase();
        db.execSQL(sql);
    }
    public void Insert(Context context,String sql,String DbName,SQLiteDatabase.CursorFactory factory){
        SQLiteDatabase db = new DatabaseHelper(context,DbName,factory,1).getWritableDatabase();
        db.execSQL(sql);
    }
//    public void insert(Context context,String sql,String DbName,SQLiteDatabase.CursorFactory factory){
//        SQLiteDatabase db = new DatabaseHelper(context,DbName,factory,1).getWritableDatabase();
//        db.query("user",);
}
