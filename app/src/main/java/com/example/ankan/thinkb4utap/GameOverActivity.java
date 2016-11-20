package com.example.ankan.thinkb4utap;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    TextView tv;
    Button gob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.gali);
        mp.start();
        tv = (TextView) findViewById(R.id.gameovertext);
        tv.setText("game over loser");
        gob = (Button) findViewById(R.id.playagain);

        gob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);
            }

        });

    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }
}
