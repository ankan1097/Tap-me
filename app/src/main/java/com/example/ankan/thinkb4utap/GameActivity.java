package com.example.ankan.thinkb4utap;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    ProgressBar mProgressBar;
    CountDownTimer mCountDownTimer;
    int i=0;
    TextView qtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        qtext=(TextView)findViewById(R.id.questiontext);

        mProgressBar=(ProgressBar)findViewById(R.id.progressbar);
        mProgressBar.setProgress(i);
        mCountDownTimer=new CountDownTimer(2000+500,20) {

            @Override
            public void onTick(long millisUntilFinished) {
                Log.v("Log_tag", "Tick of Progress"+ i+ millisUntilFinished);
                i++;
                mProgressBar.setProgress(i);

            }

            @Override
            public void onFinish() {
                //Do what you want
                i++;
                mProgressBar.setProgress(i);
                if(i==100)
                    i=0;
            }

        };
        mCountDownTimer.start();
        getquestion((int)(Math.random()*4));
    }

    public void getquestion(int Qch) {
        String[] Q0 = {"wait", "just wait", "do nothing", "It wont be long"};
        String[] Q1 = {"tap 1", "just tap 1", "donot tap 2 tap 1", "don't tap 3 tap 1"};
        String[] Q2 = {"tap 2", "just tap 2", "donot tap 1 tap 2", "don't tap 3 tap 2"};
        String[] Q3 = {"tap 3", "just tap 3", "donot tap 1 tap 3", "don't tap 2 tap 3"};

        int ch;
        String qesn;
        switch (Qch)
        {
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
}
