package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity4 extends Activity implements View.OnClickListener {
    private Intent i;

    @Override
    public void onCreate(Bundle state){
        super.onCreate(state);
        setContentView(R.layout.main_layout);
        TextView title = findViewById(R.id.textView);
        title.setText("Activity 4");
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button: {
                i = new Intent("startAct1");
                startActivity(i);
                break;
            }
            case R.id.button2: {

                i = new Intent("startAct2");
                startActivity(i);
                break;
            }
            case R.id.button3: {
                i = new Intent("startAct3");
                startActivity(i);
                break;
            }
            case R.id.button4: {
                i = new Intent("startAct4");
                startActivity(i);
                break;
            }
            default:{
                throw new Error("No ID found");
            }
        }
    }
}
