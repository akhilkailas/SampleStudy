package com.example.akhilkailas.samplestudy;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    public static String Tag = "lgsss";

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String s = getArguments().getString("Key");
        Log.d(Tag, "onCreateView: InsertFragment "+s);
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        Button btn = (Button)view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),SecondActivity.class));
            }
        });
        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(Tag, "onAttach: InsertFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Tag, "onCreate: InsertFragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(Tag, "onActivityCreated: InsertFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(Tag, "onStart: InsertFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(Tag, "onResume: InsertFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(Tag, "onPause: InsertFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(Tag, "onStop: InsertFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy: InsertFragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(Tag, "onDestroyView: InsertFragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(Tag, "onDetach: InsertFragment");
    }
}
