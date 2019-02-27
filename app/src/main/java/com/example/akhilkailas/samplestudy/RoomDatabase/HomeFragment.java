package com.example.akhilkailas.samplestudy.RoomDatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.akhilkailas.samplestudy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button add = v.findViewById(R.id.btn_insert_room);
        Button read = v.findViewById(R.id.btn_read_room);
        Button update = v.findViewById(R.id.btn_update_room);
        Button delete = v.findViewById(R.id.btn_delete_room);
        add.setOnClickListener(this);
        read.setOnClickListener(this);
        delete.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_insert_room:
                    RoomActivity.fragmentManager.beginTransaction()
                            .replace(R.id.layout_container_room,new InsertFragment())
                            .addToBackStack(null).commit();
                break;
            case R.id.btn_read_room:
                    RoomActivity.fragmentManager.beginTransaction()
                            .replace(R.id.layout_container_room,new ReadFragment())
                            .addToBackStack(null).commit();
                break;

            case R.id.btn_delete_room:
                    RoomActivity.fragmentManager.beginTransaction()
                            .replace(R.id.layout_container_room,new DeleteFragment())
                            .addToBackStack(null).commit();
                    break;
            default:
                break;
        }

    }
}
