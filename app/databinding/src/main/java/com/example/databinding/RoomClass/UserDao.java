package com.example.databinding.RoomClass;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
     void InsertAll(User... users);

    @Query("select * from user")
     List<User> queryAll();
}
