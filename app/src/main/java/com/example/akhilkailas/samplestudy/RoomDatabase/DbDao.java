package com.example.akhilkailas.samplestudy.RoomDatabase;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface DbDao {
    @Insert
    public void add(UserEntity userEntity);

    @Query("select * from users")
    public List<UserEntity> readValues();

    @Delete
    public void deleteValues(UserEntity userEntity);
}
