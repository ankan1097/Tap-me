package com.example.ankan.thinkb4utap;


import android.os.Handler;
import android.widget.TextView;

public class TypeWriter {

    private String sText = new String();
    private int index;
    private long mDelay = 500;

    TextView textView;

    public TypeWriter(TextView tView) {
        textView = tView;
    }

    public void animateText(String string) {
        sText = string;
        index = 0;

        textView.setText("");

        new Handler().removeCallbacks(characterAdder);
        new Handler().postDelayed(characterAdder, mDelay);
    }

    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            textView.setText(sText.subSequence(0, index++));

            if (index <= sText.length()) {
                new Handler().postDelayed(characterAdder, mDelay);
            }
        }
    };
}