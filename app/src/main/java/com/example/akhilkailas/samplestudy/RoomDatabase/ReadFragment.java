package com.example.akhilkailas.samplestudy.RoomDatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.akhilkailas.samplestudy.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReadFragment extends Fragment {
        TextView tvRead;

    public ReadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_read, container, false);
        tvRead = v.findViewById(R.id.tv_read_room);
        String readValues = "";
        List<UserEntity> list = RoomActivity.myDatabase.dbDao().readValues();
        for (UserEntity user:list){
            int i = user.getId();
            String name  = user.getName();
            String email = user.getEmail();
            readValues = "id "+i +"\n\n"+"name "+name+"\n\n"+"email "+email;
        }
        tvRead.setText(readValues);
        return v;
    }

}
