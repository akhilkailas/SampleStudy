 package com.example.akhilkailas.samplestudy;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {
    public static String Tag = "lgsss";
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag, "Inside onCreate: MainActivty");
        BlankFragment blankFragment=new BlankFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Bundle b = new Bundle();
        b.putString("Key","value");
        blankFragment.setArguments(b);
        fragmentTransaction.add(R.id.fragment_container,blankFragment);
        //fragmentTransaction.addToBackStack("InsertFragment");
        fragmentTransaction.commit();
        btn = (Button)findViewById(R.id.btnClick1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart: MainActivty");
    }

     @Override
     protected void onResume() {
         super.onResume();
         Log.d(Tag, "onResume: MainActivty");
     }

     @Override
     protected void onPause() {
         super.onPause();
         Log.d(Tag, "onPause: MainActivty");
     }

     @Override
     protected void onRestart() {
         super.onRestart();
         Log.d(Tag, "onRestart: MainActivty");
     }

     @Override
     protected void onStop() {
         super.onStop();
         Log.d(Tag, "onStop: MainActivty");
     }

     @Override
     protected void onDestroy() {
         super.onDestroy();
         Log.d(Tag, "onDestroy: MainActivty");
     }
 }
