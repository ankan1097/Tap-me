package com.example.ankan.thinkb4utap;

import android.content.Intent;
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
                    setButtntext();
                    score++;
                    scr.setText(""+score);
                    i=0;
                    mCountDownTimer.cancel();
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                } else {
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
                    setButtntext();
                    score++;
                    scr.setText(""+score);
                    i=0;
                    mCountDownTimer.cancel();
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                } else {
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
                    setButtntext();
                    score++;
                    scr.setText(""+score);
                    i=0;
                    mCountDownTimer.cancel();
                    mCountDownTimer = new MyCountDownTimer(50000, Math.max(10,40-score));
                    mCountDownTimer.start();
                }
                else {
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
        String[] Q0 = {"wait", "just wait", "do nothing", "It wont be long"};
        String[] Q1 = {"tap 1", "just tap 1", "do not tap 2 tap 1", "don't tap 3 tap 1"};
        String[] Q2 = {"tap 2", "just tap 2", "do not tap 1 tap 2", "don't tap 3 tap 2"};
        String[] Q3 = {"tap 3", "just tap 3", "do not tap 1 tap 3", "don't tap 2 tap 3"};

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
