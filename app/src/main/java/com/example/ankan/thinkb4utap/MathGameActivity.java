package com.example.ankan.thinkb4utap;

import android.content.Intent;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class MathGameActivity extends AppCompatActivity {

    TextView tv[]=new TextView[10];
    ProgressBar mProgressBar;
    MyCountDownTimer mCountDownTimer;
    TextView eqntext;
    int mathscore;
    int mathans;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_game);

        eqntext=(TextView) findViewById(R.id.eqn_ques);

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
        mProgressBar.setProgress(i);
        mCountDownTimer = new MyCountDownTimer(50000, 5);

        mCountDownTimer.start();

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
        mathans=setNewEqn(mathscore);


        for(i=0;i<10;i++){
            tv[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View v) {
                    if (Integer.parseInt(tv[i].getText().toString()) ==mathans) {

                    }
                    else {

                    }
                }
            });
        }
    }

    public int setNewEqn(int mscore){
        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);
        int opr=(int)(Math.random()*10);
        int rans;
        String q="";
        if(0<=opr && opr<=3)// 40%  +
        {
            q="" + a + " + " + b + " = "+(a+b);
        }
        else if(4<=opr && opr<=6)// 30%  -
        {
            q="" + Math.max(a,b) + " - " + Math.min(a,b) + " = "+Math.abs(a-b);
        }
        else if(7<=opr && opr<=8)// 20%  X
        {
            a=a%10;
            q="" + a + " x " + b + " = "+(a*b);
        }
        else // 0%  /
        {
            b=b%9+1;
            a=a/b;
            q="" + (a*b) + " / " + b + " = "+a;
        }
        int r=1;
        //System.out.println("r="+r+" before  "+q);
        for(r=(int)(Math.random()*q.length());true;r=(int)(Math.random()*q.length()))
        {
            //System.out.println(q+"   "+r);
            if(q.charAt(r)!='=' && q.charAt(r)!=' ' && q.charAt(r)!='+' && q.charAt(r)!='-'&&q.charAt(r)!='x'&&q.charAt(r)!='/')
            {
                rans=q.charAt(r)-48;
                q=q.substring(0,r)+'_'+q.substring(r+1);
                break;
            }
        }
        eqntext.setText(q);
//        System.out.println("aff   "+q);
        return rans;
    }



    public class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            Log.v("Log_tag", "Tick of Progress" + i + "   " + millisUntilFinished);
            i += 2;

            mProgressBar.setProgress(i);

        }

        @Override
        public void onFinish() {
            //Do what you want
            i += 2;
            mProgressBar.setProgress(i);

        }

    }
}
