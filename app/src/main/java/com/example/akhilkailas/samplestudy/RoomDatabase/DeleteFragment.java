package com.example.akhilkailas.samplestudy.RoomDatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akhilkailas.samplestudy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteFragment extends Fragment {

    EditText etDelete;
    Button btnDel;
    public DeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete, container, false);
        etDelete = view.findViewById(R.id.et_delete_values_romm);
        btnDel = view.findViewById(R.id.btn_delete_values_room);
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id =Integer.parseInt(etDelete.getText().toString());
                UserEntity userEntity = new UserEntity();
                userEntity.setId(id);
                RoomActivity.myDatabase.dbDao().deleteValues(userEntity);
                Toast.makeText(getContext(), "Deleted Successfully", Toast.LENGTH_SHORT).show();
                etDelete.setText("");
            }
        });
        return view;
    }

}
