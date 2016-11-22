package com.example.ankan.thinkb4utap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

import mehdi.sakout.fancybuttons.FancyButton;

public class ModeActivity extends AppCompatActivity {

    FancyButton butt1, butt2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);

        butt1 = (FancyButton)findViewById(R.id.classic);
        butt2 = (FancyButton)findViewById(R.id.math);
        txt = (TextView)findViewById(R.id.mode);
        txt.setTypeface(EasyFonts.androidNation(getApplicationContext()));

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MathGameActivity.class);
                startActivity(intent);
            }
        });
    }
}
