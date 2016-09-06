package com.example.atecdroid.project20;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class webActivity extends AppAbs {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView web = new WebView(this);
        setContentView(web);

        //get intent extras (html code to display)
        Bundle bundle = getIntent().getExtras();
        String html = bundle.getString("html");

        //load page
        web.loadData(html, "text/html", null);
    }
}
