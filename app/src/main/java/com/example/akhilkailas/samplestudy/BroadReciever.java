package com.example.akhilkailas.samplestudy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("bbb", "onReceive: ");
        Toast.makeText(context, "Intent Detected", Toast.LENGTH_SHORT).show();
    }
}
