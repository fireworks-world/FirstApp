package com.example.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
LinearLayout l;
Button b1,b2,b3;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(LinearLayout) findViewById(R.id.l1);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        t=(TextView) findViewById(R.id.t1);
    }

    public void red(View view) {
        t.setTextColor(Color.WHITE);
        b1.setBackgroundColor(Color.YELLOW);
        l.setBackgroundColor(Color.RED);
    }

    public void blue(View view) {
        t.setTextColor(Color.YELLOW);
        b2.setBackgroundColor(Color.YELLOW);
        l.setBackgroundColor(Color.BLUE);
    }

    public void green(View view) {
        t.setTextColor(Color.YELLOW);
        b3.setBackgroundColor(Color.YELLOW);
        l.setBackgroundColor(Color.GREEN);
    }
}
