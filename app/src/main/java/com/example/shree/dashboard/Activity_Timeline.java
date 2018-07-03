package com.example.shree.dashboard;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Activity_Timeline extends AppCompatActivity {

    RelativeLayout relativeLayout,relativeLayout2;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
        relativeLayout.setVisibility(View.VISIBLE);
        relativeLayout2.setVisibility(View.VISIBLE);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__timeline);
        relativeLayout = findViewById(R.id.really1);
        relativeLayout2 = findViewById(R.id.relativeLayout9);

        handler.postDelayed(runnable,2000);


    }
}
