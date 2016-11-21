package com.example.ankan.thinkb4utap;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

import static android.graphics.Color.RED;

public class GameActivity extends AppCompatActivity {


    ProgressBar mProgressBar;
    MyCountDownTimer mCountDownTimer;
    int i = 0, ans;
    TextView qtext;
    Button bt1, bt2, bt3;
    static int score = 0;
    int prevrandn=-1;
    TextView scr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        qtext = (TextView) findViewById(R.id.questiontext);
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        score=0;
        scr = (TextView) findViewById(R.id.score);
        scr.setText(""+score);

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
        mProgressBar.setProgress(i);
        mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));

        mCountDownTimer.start();
        ans = (int) (Math.random() * 4);
        getquestion(ans);
//        setButtntext();
        bt1.setText("1");
        bt2.setText("2");
        bt3.setText("3");


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(bt1.getText().toString()) == ans) {
                    ans=(int)(Math.random()*4);
                    getquestion(ans);
                    if( ((int)(Math.random() * 10)) <=4 ) {//50% chance
                        setButtntext();
                    }                    score++;
                    scr.setText(""+score);
                    if(score > Integer.parseInt(SaveSharedPreference.getUserName(GameActivity.this)))
                        SaveSharedPreference.setUserName(getApplicationContext(), ""+score);
                    i=0;
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){}
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                } else {
                    bt1.setBackgroundColor(RED);
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vib.vibrate(400);
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
                    mp.start();
                    Intent intent=new Intent(getApplicationContext(),GameOverActivity.class);
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){}
                    mCountDownTimer = null;
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(bt2.getText().toString()) == ans) {

                    ans = (int) (Math.random() * 4);
                    getquestion(ans);
                    if( ((int)(Math.random() * 10)) <=4 ) {//50% chance
                        setButtntext();
                    }                    score++;
                    scr.setText(""+score);
                    if(score > Integer.parseInt(SaveSharedPreference.getUserName(GameActivity.this)))
                        SaveSharedPreference.setUserName(getApplicationContext(), ""+score);
                    i=0;
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){}
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                } else {
                    bt2.setBackgroundColor(RED);
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vib.vibrate(400);
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
                    mp.start();
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
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( Integer.parseInt(bt3.getText().toString()) == ans ){
                    ans=(int)(Math.random()*4);
                    getquestion(ans);
                    if( ((int)(Math.random() * 10)) <=4 ) {//50% chance
                        setButtntext();
                    }
                    score++;
                    scr.setText(""+score);
                    if(score > Integer.parseInt(SaveSharedPreference.getUserName(GameActivity.this)))
                        SaveSharedPreference.setUserName(getApplicationContext(), ""+score);
                    i=0;
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){}
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                }
                else {
                    bt3.setBackgroundColor(RED);
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vib.vibrate(400);
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
                    mp.start();
                    Intent intent=new Intent(getApplicationContext(),GameOverActivity.class);
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
            }
        });
    }

    public void setButtntext() {
        String[] t = {"1", "2", "3"};
        int s = (int) (Math.random() * 3);//0 1 2
        int o = ((int) (Math.random() * 2)) * 2 - 1;//-1 1
//        System.out.println(s+"  "+o);
        bt1.setText(t[s]);
        bt2.setText(t[(3 + s + o) % 3]);
        bt3.setText(t[(3 + s + o + o) % 3]);
    }

    public void getquestion(int Qch) {
        String[] Q0 = { "Wait","Patience","W\nA\nI\nT","Sit for 2 seconds", "HALT", "Do Nothing", "It wont be Long",
                "Dont Tap 1 or 2 or 3","Next One is :","Next One is Coming Just Wait",
                "Tap Nothing","W-A-I-T","Don't Put Your Fingers On the Screen","Neither 1, Nor 2 and Of Course Not 3",
        "STOP!!","Just Focus On Me"};

        String[] Q1 = {"Tap 1","T\nA\nP\n1", "Just Tap 1","Do Not Tap 2\nTap 1", "Don't Tap 3, Tap 1",
                "Tap 1 to go to Next One", "Just Tap 1 to go to Next One", "Do not Tap 2, Tap 1 to go to Next One",
                "Don't Tap 3 or 2, Tap 1 to go to next one","Tap (2-1)","What is 3-2?\n Tap that one",
                "Tap 1 and Wait", "Just Tap 1 and Wait","Tap 1 Dont Touch Others",
                "Don't T-A-P 3, T-A-P 1","sqrt(3249)/19 = ? don't Calculate Just Tap 1",
                "Answer of (221/17-11)is?\n Tap 1 for Next","TAP 1 if You want to go to Next Level",
                "Tap 1 if You want to increase score","Todays Date is __?\n Just Tap 1 for Next Level"};

        String[] Q2 = {"Tap 2","T\nA\nP\n2", "Just Tap 2","Do Not Tap 1\nTap 2", "Don't Tap 3, Tap 2",
                "Tap 2 to go to Next One", "Just Tap 2 to go to Next One", "Do not Tap 1, Tap 2 to go to Next One",
                "Don't Tap 3 or 1, Tap 2 to go to next one","Tap (3-1)","What is 1+1?\n Tap that one",
                "Tap 2 and Wait", "Just Tap 2 and Wait","Tap 2 Dont Touch Others",
                "Don't T-A-P 3, T-A-P 2 Instead","sqrt(3249)/19 = ? don't Calculate Just Tap 2",
                "Answer of (465/17-15)is?\n Tap 2 for Next","TAP 2 if You want to go to Next Level",
                "Tap 2 if You want to increase score","Todays Date is __?\n Just Tap 2 for Next Level",
                "Last Digit of Current Time?\n Just Tap 2 for Next Level"};

        String[] Q3 = {"Tap 3","T\nA\nP\n3", "Just Tap 3","Do Not Tap 1\nTap 3", "Don't Tap 2, Tap 3",
                "Tap 3 to go to Next One", "Just Tap 3 to go to Next One", "Do not Tap 1, Tap 3 to go to Next One",
                "Don't Tap 2 or 1, Tap 3 to go to next one","Tap (3-0)","What is 1+2?\n Tap that one",
                "Tap 3 and Wait", "Just Tap 3 and Wait","Tap 3 Dont Touch Others",
                "Don't T-A-P 1, T-A-P 3 Instead","sqrt(1249)/7 = ? don't Calculate Just Tap 3",
                "Answer of (865/24-15)is?\n Tap 3 for Next","TAP 3 if You want to go to Next Level",
                "Tap 3 if You want to increase score","Todays Date is __?\n Just Tap 3 for Next Level",
                "Last Digit of Current Time?\n Just Tap 3 for Next Level"};

        String[] Pre={"Now   \n","If You are alive!\n ","If You are living\n","Quick !!!\n","Ready,  \n","Simon Says, \n","Ahana Says, \n"};

        Arrays.sort(Q0, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        Arrays.sort(Q1,new Comparator<String>(){
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        Arrays.sort(Q2,new Comparator<String>(){
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        Arrays.sort(Q3,new Comparator<String>(){
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        int ch,r;
        String qesn;
        switch (Qch) {
            case 0:
                r=(int) (Math.random() * Math.min(Q0.length, 4 + score));
                while(r==prevrandn)
                {
                    r=(int) (Math.random() * Math.min(Q0.length, 4 + score));
                }
                prevrandn=r;
                qesn = Q0[r];
                break;
            case 1:
                r=(int) (Math.random() * Math.min(Q1.length, 4 + score));
                while(r==prevrandn)
                {
                    r=(int) (Math.random() * Math.min(Q1.length, 4 + score));
                }
                prevrandn=r;
                qesn = Q1[r];
                break;
            case 2:
                r=(int) (Math.random() * Math.min(Q2.length, 4 + score));
                while(r==prevrandn)
                {
                    r=(int) (Math.random() * Math.min(Q2.length, 4 + score));
                }
                prevrandn=r;
                qesn = Q2[r];
                break;
            default:
                r=(int) (Math.random() * Math.min(Q3.length, 4 + score));
                while(r==prevrandn)
                {
                    r=(int) (Math.random() * Math.min(Q3.length, 4 + score));
                }
                prevrandn=r;
                qesn = Q3[r];
                break;
        }
        if( ((int)(Math.random() * 10)) <=4 && qesn.length()<=25 && score>8){//40% chance
            qesn=Pre[(int) (Math.random() * Pre.length)] + qesn;
        }

        qtext.setText(qesn);
    }

    public class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            Log.v("Log_tag", "Tick of Progress" + i + "   " + millisUntilFinished);
            i += 2;
            if (i >= 106) {
                i = 0;
                if(ans!=0){
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vib.vibrate(400);
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
                    mp.start();
                    Intent intent=new Intent(getApplicationContext(),GameOverActivity.class);
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){}
                    mCountDownTimer = null;
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                }
                else {
                    ans=(int)(Math.random()*4);
                    getquestion(ans);
                    setButtntext();
                    score++;
                    scr.setText(""+score);
                    if(score > Integer.parseInt(SaveSharedPreference.getUserName(GameActivity.this)))
                        SaveSharedPreference.setUserName(getApplicationContext(), ""+score);
                    try {
                        mCountDownTimer.cancel();
                    }
                    catch (Exception e){}
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                }
            }
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
