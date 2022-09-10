package com.example.myapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {asa.class},version = 1,exportSchema = false)
public abstract class asaDataBase extends RoomDatabase {
    public abstract asaDao asScDao();
    private static volatile asaDataBase INSTANCE;

    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static asaDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (asaDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    asaDataBase.class, "asa")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
