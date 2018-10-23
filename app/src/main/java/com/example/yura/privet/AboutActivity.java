package com.example.yura.privet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String user = "ЖЫвотное";
        String gift = "дырку от бублика";
        String usernamefrom="Печкин";

        user = getIntent().getStringExtra("username");
        gift = getIntent().getStringExtra("gift");
        usernamefrom=getIntent().getStringExtra("usernamefrom");

        TextView infoTextView = (TextView)findViewById(R.id.textViewInfo);
        infoTextView.setText(user + " , вам передали " + gift + " от " + usernamefrom);
    }


}
