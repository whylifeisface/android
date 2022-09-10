package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface asaDao {
    @Query("select * From asa ")
    List<asa> getAll();
    @Query("select * from asa where id IN (:id)")
    List<asa> loadAllByIds(int[] id);
//    @Query("select * from assc where ")

    @Insert
    void insertAll(asa... asSc);

    @Delete
    void delete(asa asSc);
}
