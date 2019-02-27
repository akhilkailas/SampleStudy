package com.example.akhilkailas.samplestudy;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MyJobScheduler extends JobService {
    public static String TAG = "JobService";
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d("ppp", "onStartJob: ");
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d("ppp", "onStopJob: ");
        return false;
    }
}
