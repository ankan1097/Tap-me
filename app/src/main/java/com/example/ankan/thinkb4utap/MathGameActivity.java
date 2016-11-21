package com.example.ankan.thinkb4utap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class MathGameActivity extends AppCompatActivity {

    TextView tv[]=new TextView[10];
    TextView eqntext;
    int mathscore;
    int mathans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_game);

        eqntext=(TextView) findViewById(R.id.eqn_ques);

        tv[0]=(TextView) findViewById(R.id.xx0);
        tv[0].setText("0");
        tv[0].setTypeface(EasyFonts.captureIt(this));
        tv[1]=(TextView) findViewById(R.id.xx1);
        tv[1].setText("1");
        tv[1].setTypeface(EasyFonts.captureIt(this));
        tv[2]=(TextView) findViewById(R.id.xx2);
        tv[2].setText("2");
        tv[2].setTypeface(EasyFonts.captureIt(this));
        tv[3]=(TextView) findViewById(R.id.xx3);
        tv[3].setText("3");
        tv[3].setTypeface(EasyFonts.captureIt(this));
        tv[4]=(TextView) findViewById(R.id.xx4);
        tv[4].setText("4");
        tv[4].setTypeface(EasyFonts.captureIt(this));
        tv[5]=(TextView) findViewById(R.id.xx5);
        tv[5].setText("5");
        tv[5].setTypeface(EasyFonts.captureIt(this));
        tv[6]=(TextView) findViewById(R.id.xx6);
        tv[6].setText("6");
        tv[6].setTypeface(EasyFonts.captureIt(this));
        tv[7]=(TextView) findViewById(R.id.xx7);
        tv[7].setText("7");
        tv[7].setTypeface(EasyFonts.captureIt(this));
        tv[8]=(TextView)findViewById(R.id.xx8);
        tv[8].setText("8");
        tv[8].setTypeface(EasyFonts.captureIt(this));
        tv[9]=(TextView) findViewById(R.id.xx9);
        tv[9].setText("9");
        tv[9].setTypeface(EasyFonts.captureIt(this));

        for(int i=0;i<10;i++){
            tv[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View v) {

                }
            });
        }
    }
}
