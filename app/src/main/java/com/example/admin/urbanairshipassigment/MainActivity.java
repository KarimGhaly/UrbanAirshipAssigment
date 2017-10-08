package com.example.admin.urbanairshipassigment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UAirship.shared().getPushManager().setUserNotificationsEnabled(true);
    }


}
