package com.example.ankan.thinkb4utap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class HiScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi_score);
        TextView textView = (TextView) findViewById(R.id.hi_score);
        textView.setText(SaveSharedPreference.getUserName(HiScoreActivity.this));
        textView.setTypeface(EasyFonts.ostrichBold(this));

        TextView ttt = (TextView) findViewById(R.id.tt);
        ttt.setTypeface(EasyFonts.ostrichRounded(this));
    }
}
