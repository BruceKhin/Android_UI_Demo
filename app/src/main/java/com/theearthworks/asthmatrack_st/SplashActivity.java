package com.theearthworks.asthmatrack_st;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {

    TextView tvWelcome;
    ImageView ivMainLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_spirometry2);

    }
}
