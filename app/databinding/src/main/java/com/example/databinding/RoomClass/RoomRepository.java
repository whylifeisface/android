package com.example.databinding.RoomClass;

import android.app.Application;

import androidx.room.RoomDatabase;

import java.util.List;

public class RoomRepository {
    private UserDao userDao;
    private List<User> users;
    public RoomRepository(Application application){
        UserDataBase db = UserDataBase.getDatabase(application);
        userDao = db.useDao();
        users = userDao.queryAll();
    }
     public List<User> getAll(){
        return users;
    }
    public void Insert(User user){
        UserDataBase.databaseWriteExecutor.execute(()->{
            userDao.InsertAll(user);
        });
    }
}
