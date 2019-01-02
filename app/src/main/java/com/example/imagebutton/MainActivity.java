package com.example.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rd=new Random();
    ImageView iv;
    ImageButton ib;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
        ib = (ImageButton) findViewById(R.id.ib);
    }

    public void clicked(View view) {
        x=rd.nextInt(3)+1;
        switch (x){
            case 1: iv.setImageResource(R.drawable.picone);
                    ib.setImageResource(R.drawable.one);
                    break;
            case 2: iv.setImageResource(R.drawable.pictwo);
                    ib.setImageResource(R.drawable.two);
                    break;
            case 3: iv.setImageResource(R.drawable.picthree);
                    ib.setImageResource(R.drawable.three);
                    break;

        }
    }
}
