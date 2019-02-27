package com.example.akhilkailas.samplestudy;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView rcy;
    RecyclerAdapter recyclerAdapter;
    ArrayList<String> arrayList;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        SharedPreferences.Editor editor = (SharedPreferences.Editor) getSharedPreferences("MySharedFile", MODE_PRIVATE).edit();
        editor.putString("name", "sample");
        editor.commit();

        SharedPreferences pref = (SharedPreferences) getSharedPreferences("MySharedFile", MODE_PRIVATE);
        Toast.makeText(this, "" + pref.getString("name", null), Toast.LENGTH_SHORT).show();
        rcy = (RecyclerView) findViewById(R.id.recy);
        arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        //Intent intent = new Intent();
        //intent.setAction("com.tutorialspoint.CUSTOM_INTENT"); sendBroadcast(intent);
        MyBoradCast myBoradCast = new MyBoradCast();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.sample.broadcastaction");
        registerReceiver(myBoradCast, intentFilter);

        recyclerAdapter = new RecyclerAdapter(RecyclerActivity.this, arrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rcy.setLayoutManager(mLayoutManager);
        rcy.setAdapter(recyclerAdapter);
        new MyAsync().execute("My");
        BlankFragment blankFragment = new BlankFragment();
        ScheduleJob();


    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void ScheduleJob() {
        ComponentName componentName = new ComponentName(this, MyJobScheduler.class);
        JobInfo info = new JobInfo.Builder(123, componentName)
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED).setPersisted(true).setPeriodic(4000).build();
        JobScheduler jobScheduler = (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        int result = jobScheduler.schedule(info);
        if (result == JobScheduler.RESULT_SUCCESS) {
            Log.d("ppp", "ScheduleJob: Success");
        } else {
            Log.d("ppp", "ScheduleJob: Failed");
        }
    }

    public void broadcastIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("com.tutorialspoint.CUSTOM_INTENT");
        sendBroadcast(intent);
    }

    public class MyAsync extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            Log.d("cccc", "Inside doInbackground: = " + strings[0]);
            return strings[0];
        }

        @Override
        protected void onPreExecute() {
            Log.d("cccc", "Inside onPreExecute: = ");
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            Log.d("cccc", "Inside onPostExecute: = " + s);
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }
    }

    public class MyBoradCast extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d("ppp", "onReceive: do the trick");
        }
    }
}
