package com.example.akhilkailas.samplestudy.RoomDatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {UserEntity.class},version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract DbDao dbDao();
}
