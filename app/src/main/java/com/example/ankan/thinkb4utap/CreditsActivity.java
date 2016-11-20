package com.example.ankan.thinkb4utap;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class CreditsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        TextView tv1= (TextView) findViewById(R.id.ankan);
        tv1.setTypeface(EasyFonts.captureIt(this));
        TextView tv2= (TextView) findViewById(R.id.srijit);
        tv2.setTypeface(EasyFonts.captureIt(this));
        TextView tv3= (TextView) findViewById(R.id.raunaq);
        tv3.setTypeface(EasyFonts.captureIt(this));
        TextView tv= (TextView) findViewById(R.id.cre);
        tv.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tv.setTypeface(EasyFonts.androidNation(this));
    }
}
