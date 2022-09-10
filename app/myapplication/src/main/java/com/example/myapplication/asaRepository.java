package com.example.myapplication;

import android.app.Application;

import java.util.List;

public class asaRepository {
    public asaDao asaDao;
    public List<asa> all;

    asaRepository(Application application) {
        asaDataBase db = asaDataBase.getDatabase(application);
        asaDao = db.asScDao();
        all = asaDao.getAll();
    }
    List<asa> getAll(){
        return all;
    }
    void insert(asa asa) {
        asaDataBase.databaseWriteExecutor.execute(() -> {
            asaDao.insertAll(asa);
        });
    }


}