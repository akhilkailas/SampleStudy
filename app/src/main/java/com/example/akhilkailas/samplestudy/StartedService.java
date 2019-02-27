package com.example.akhilkailas.samplestudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class StartedService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        thread.start();
    }

    Thread thread = new Thread() {
        @Override
        public void run() {

        }
    };
}
