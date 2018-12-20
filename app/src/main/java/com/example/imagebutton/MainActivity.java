package com.example.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgv;
    ImageButton imgb;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv=(ImageView) findViewById(R.id.imgv);
        imgb=(ImageButton) findViewById(R.id.imgb);
    }

    public void click(View view) {
        Random rd= new Random();
        x=rd.nextInt(3)+1;
        if (x==1){
            imgv.setImageResource(R.drawable.picone);
            imgb.setImageResource(R.drawable.one);
        }
        else{
            if (x==2) {
                imgv.setImageResource(R.drawable.pictwo);
                imgb.setImageResource(R.drawable.two);
            }
            else {
                imgv.setImageResource(R.drawable.picthree);
                imgb.setImageResource(R.drawable.three);
            }
        }
    }
}
