package com.example.akhilkailas.samplestudy.RoomDatabase;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.akhilkailas.samplestudy.R;

public class RoomActivity extends AppCompatActivity {
   public static FragmentManager fragmentManager;
   public static MyDatabase myDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        fragmentManager = getSupportFragmentManager();
        myDatabase = Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"userdb").allowMainThreadQueries().build();
        if (findViewById(R.id.layout_container_room )!= null){
            if (savedInstanceState != null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.layout_container_room,new HomeFragment()).commit();
        }
    }
}
