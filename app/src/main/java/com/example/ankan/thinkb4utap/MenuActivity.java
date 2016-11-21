package com.example.ankan.thinkb4utap;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

import mehdi.sakout.fancybuttons.FancyButton;

public class MenuActivity extends AppCompatActivity {

    FancyButton butt1, butt2, butt3;
    TypeWriter head;
    private static MenuActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;

        setContentView(R.layout.activity_menu);
        TextView frst = (TextView)findViewById(R.id.first);
        TextView sec = (TextView)findViewById(R.id.second);
        TextView hd = (TextView) findViewById(R.id.heading);
        frst.setTypeface(EasyFonts.androidNation(this));
        sec.setTypeface(EasyFonts.androidNation(this));
        hd.setTypeface(EasyFonts.androidNation(this));
        head = new TypeWriter(hd);
        head.animateText("TAP");

        if(SaveSharedPreference.getUserName(MenuActivity.this).length() == 0)
            SaveSharedPreference.setUserName(MenuActivity.this,""+0);

        butt1 = (FancyButton)findViewById(R.id.game);
        butt2 = (FancyButton) findViewById(R.id.score);
        butt3 = (FancyButton) findViewById(R.id.credits);


        butt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);

            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), CreditsActivity.class);
                        startActivity(intent);

            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HiScoreActivity.class);
                startActivity(intent);

            }
        });
    }

    public static Context getContext(){
        return instance.getApplicationContext();
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Exit THINK B4U TAP?");
        alertDialogBuilder
                .setMessage("Click yes if u had enough!")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}
