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
import android.widget.Toast;

import com.vstechlab.easyfonts.EasyFonts;

public class MathGameActivity extends AppCompatActivity {

    TextView tv[]=new TextView[10];
    ProgressBar mProgressBar;
    MyCountDownTimer mCountDownTimer;
    TextView eqntext;
    static int mathscore,tmpscore;
    int mathans;
    int i,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_game);

        MenuActivity.flag=2;

        eqntext=(TextView) findViewById(R.id.eqn_ques);

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
        i=0;
        mProgressBar.setProgress(i);
        mCountDownTimer = new MyCountDownTimer(50000, 95);

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

        j=0;
        tv[0].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[0].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[0].getText().toString()) ==mathans) {
                    mathscore++;
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=1;
        tv[1].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
               // Toast.makeText(getApplicationContext(),tv[1].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[1].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=2;
        tv[2].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[2].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[2].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=3;
        tv[3].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[3].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[3].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=4;
        tv[4].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[4].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[4].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=5;
        tv[5].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[5].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[5].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=6;
        tv[6].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
               // Toast.makeText(getApplicationContext(),tv[6].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[6].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=7;
        tv[7].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[7].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[7].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=8;
        tv[8].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[8].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[8].getText().toString()) ==mathans) {
                    mathscore++;

                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
        j=9;
        tv[9].setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
//                    System.out.println(tv[j].getText().toString());
                //Toast.makeText(getApplicationContext(),tv[9].getText().toString(),Toast.LENGTH_LONG).show();
                if (Integer.parseInt(tv[9].getText().toString()) ==mathans) {
                    mathscore++;
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){ }
                    mCountDownTimer=null;
                    i=0;
                    mCountDownTimer = new MyCountDownTimer(50000, 95);
                    mCountDownTimer.start();
                    mathans=setNewEqn(mathscore);
                }
                else {
                    i+=30;
                    Toast.makeText(getApplicationContext(),"-3 Seconds",Toast.LENGTH_LONG).show();

                }
            }
        });
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
            a=a%9+1;
            b+=1;
            q="" + a + " x " + b + " = "+(a*b);
        }
        else // 0%  /
        {
            b=b%9+1;
            a+=1;
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
//            Log.v("Log_tag", "Tick of Progress" + i + "   " + millisUntilFinished);
            i += 1;
            if(i>=106){
                GameActivity.score=mathscore;
                tmpscore=mathscore;
                mathscore=0;
                Intent intent = new Intent(getApplicationContext(), GameOverActivity.class);
                //overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                try {
                    mCountDownTimer.cancel();
                }
                catch (Exception e){}
                mCountDownTimer = null;
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
            mProgressBar.setProgress(i);

        }

        @Override
        public void onFinish() {
            //Do what you want
            i += 1;
            mProgressBar.setProgress(i);

        }

    }
}
