package com.example.akhilkailas.samplestudy.RoomDatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.akhilkailas.samplestudy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InsertFragment extends Fragment {
    EditText etId,etName,etMail;
    Button btnInsert;

    public InsertFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        etId = view.findViewById(R.id.et_room_id);
        etName = view.findViewById(R.id.et_room_name);
        etMail = view.findViewById(R.id.et_room_email);
        btnInsert = view.findViewById(R.id.btn_insertValues_room);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(etId.getText().toString());
                String name = etName.getText().toString();
                String email = etMail.getText().toString();

                UserEntity userEntity = new UserEntity();
                userEntity.setId(id);
                userEntity.setName(name);
                userEntity.setEmail(email);

                RoomActivity.myDatabase.dbDao().add(userEntity);
                Toast.makeText(getContext(), "Saved Succesfully", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
