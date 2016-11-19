package com.example.ankan.thinkb4utap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button butt1, butt2, butt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        butt1 = (Button)findViewById(R.id.game);
        butt2 = (Button)findViewById(R.id.score);
        butt3 = (Button)findViewById(R.id.credits);

        butt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);

            }
        });



    }
}
