package com.example.ankan.thinkb4utap;

import android.content.Intent;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    ProgressBar mProgressBar;
    MyCountDownTimer mCountDownTimer;
    int i = 0, ans;
    TextView qtext;
    Button bt1, bt2, bt3;
    int score = 0;
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
        setButtntext();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(bt1.getText().toString()) == ans) {
                    ans=(int)(Math.random()*4);
                    getquestion(ans);
                    if( ((int)(Math.random() * 10)) <=2 ) {//30% chance
                        setButtntext();
                    }                    score++;
                    scr.setText(""+score);
                    i=0;
                    mCountDownTimer.cancel();
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                } else {
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Intent intent=new Intent(getApplicationContext(),GameOverActivity.class);
                    mCountDownTimer.cancel();
                    mCountDownTimer = null;
                    startActivity(intent);
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(bt2.getText().toString()) == ans) {

                    ans = (int) (Math.random() * 4);
                    getquestion(ans);
                    if( ((int)(Math.random() * 10)) <=2 ) {//30% chance
                        setButtntext();
                    }                    score++;
                    scr.setText(""+score);
                    i=0;
                    mCountDownTimer.cancel();
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                } else {
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Intent intent = new Intent(getApplicationContext(), GameOverActivity.class);
                    mCountDownTimer.cancel();
                    mCountDownTimer = null;
                    startActivity(intent);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( Integer.parseInt(bt3.getText().toString()) == ans ){
                    ans=(int)(Math.random()*4);
                    getquestion(ans);
                    if( ((int)(Math.random() * 10)) <=2 ) {//30% chance
                        setButtntext();
                    }
                    score++;
                    scr.setText(""+score);
                    i=0;
                    mCountDownTimer.cancel();
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                }
                else {
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Intent intent=new Intent(getApplicationContext(),GameOverActivity.class);
                    mCountDownTimer.cancel();
                    mCountDownTimer = null;
                    startActivity(intent);
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
        String[] Q0 = { "wait","W-A-I-T","sit for 2 seconds", "just wait", "do nothing", "It wont be long",
                "dont tap 1 or 2 or 3","next one is :","next one is comming just wait",
                "tap nothing","T-A-P nothing","TAP 2 for defeat","TAP 1 if You want to end this",
                "TAP 2 if You want to end this","TAP 3 or 1 if You accept defeat","TAP 3 to sleep",};

        String[] Q1 = {"tap 1", "just tap 1", "do not tap 2 tap 1", "don't tap 3 tap 1",
                "tap 1 to go to next one", "just tap 1 to go to next one", "do not tap 2 tap 1 to go to next one",
                "don't tap 3 or 2 tap 1 to go to next one","What is 2-1 Tap that one","What is 3-2 Tap that one",
                "tap 1 and wait", "just tap 1 and wait", "do not TAP2 TAP1",
                "don't T-A-P 3 T-A-P 1","sqrt(3249)/19 = ? don't calculate just tap 1",
                "Answer of (221/17-11)is?  and tap 1 for next","TAP 1 if You want to go to next level",
                "TAP 1 if You want to increase score"};

        String[] Q2 = {"tap 2", "just tap 2", "do not tap 3 tap 2", "don't tap 1 tap 2",
                "tap 2 to go to next one", "just tap 2 to go to next one", "do not tap 3 tap 1 to go to next one",
                "don't tap 3 or 1 tap 2 to go to next one","What is 3-1 Tap that one","What is 1+1 Tap that one",
                "tap 2 and wait", "just tap 2 and wait", "do not TAP3 TAP2",
                "don't T-A-P 3 T-A-P 2","sqrt(5249)/19 = ? don't calculate just tap 2",
                "Answer of (251/17-11)is?  and tap 2 for next","TAP 2 if You want to go to next level",
                "TAP 2 if You want to increase score"};

        String[] Q3 = {"tap 3", "just tap 3", "do not tap 2 tap 3", "don't tap 1 tap 3",
                "tap 3 to go to next one", "just tap 3 to go to next level", "do not tap 2 tap 3 to go to next one",
                "don't tap 1 or 2 tap 3 to go to next one","What is 2+1 Tap that one","What is 3-0 Tap that one",
                "tap 3 and wait", "just tap 3 and wait", "do not TAP2 TAP3",
                "don't T-A-P 1 T-A-P 3","sqrt(3249)/17 = ? don't calculate just tap 3",
                "Answer of (371/23-12)is?  and tap 3 for next","TAP 3 if You want to go to next level",
                "TAP 3 if You want to increase score"};

        String[] Pre={"Now ","If You are alive ","If You are living ","Quick! ","Ready, ","Simon Says, ","Ahana Says, ","You must "};

        int ch;
        String qesn;
        switch (Qch) {
            case 0:
                qesn = Q0[(int) (Math.random() * Q0.length)];
                break;
            case 1:
                qesn = Q1[(int) (Math.random() * Q1.length)];
                break;
            case 2:
                qesn = Q2[(int) (Math.random() * Q2.length)];
                break;
            default:
                qesn = Q3[(int) (Math.random() * Q3.length)];
                break;
        }
        if( ((int)(Math.random() * 10)) <=3 ){//40% chance
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
            if (i == 100) {
                i = 0;
                if(ans!=0){
                    qtext.setPaintFlags(qtext.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    Intent intent=new Intent(getApplicationContext(),GameOverActivity.class);
                    mCountDownTimer.cancel();
                    mCountDownTimer = null;
                    startActivity(intent);
                }
                else {
                    ans=(int)(Math.random()*4);
                    getquestion(ans);
                    setButtntext();
                    score++;
                    scr.setText(""+score);
                    mCountDownTimer.cancel();
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
