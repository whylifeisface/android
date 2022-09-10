package com.example.databinding.RoomClass;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = User.class,version = 1,exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {
    public abstract UserDao useDao();
    private static volatile UserDataBase INSTANCE;

    private static final int NUMBER_OF_THREADS = 4;

    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static UserDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (UserDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    UserDataBase.class, "user")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
