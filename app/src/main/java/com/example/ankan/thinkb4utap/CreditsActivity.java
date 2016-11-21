package com.example.ankan.thinkb4utap;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class CreditsActivity extends AppCompatActivity {
    Animation zoom_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        zoom_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);

        TextView tv1= (TextView) findViewById(R.id.ankan);
        tv1.setTypeface(EasyFonts.captureIt(this));
        tv1.setVisibility(View.VISIBLE);
        tv1.startAnimation(zoom_in);
        TextView tv2= (TextView) findViewById(R.id.srijit);
        tv2.setTypeface(EasyFonts.captureIt(this));
        tv2.setVisibility(View.VISIBLE);
        tv2.startAnimation(zoom_in);
        TextView tv3= (TextView) findViewById(R.id.raunaq);
        tv3.setTypeface(EasyFonts.captureIt(this));
        tv3.setVisibility(View.VISIBLE);
        tv3.startAnimation(zoom_in);
        TextView tv= (TextView) findViewById(R.id.cre);
        tv.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tv.setTypeface(EasyFonts.androidNation(this));
    }
}
