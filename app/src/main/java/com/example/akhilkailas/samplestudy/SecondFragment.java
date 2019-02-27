package com.example.akhilkailas.samplestudy;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    public static String Tag = "lgsss";
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(Tag, "onCreateView: SecondFragment");
        return inflater.inflate(R.layout.fragment_second, container, false);

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(Tag, "onAttach: SecondFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Tag, "onCreate: SecondFragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(Tag, "onActivityCreated: SecondFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(Tag, "onStart: SecondFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(Tag, "onResume: SecondFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(Tag, "onPause: SecondFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(Tag, "onStop: SecondFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy: SecondFragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(Tag, "onDestroyView: SecondFragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(Tag, "onDetach: SecondFragment");
    }
}
