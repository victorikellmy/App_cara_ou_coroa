package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView2;
    int valorRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void Jogar (View view){
        valorRandom = (int)(Math.random()*100);

        if (valorRandom %2 == 0){
            imageView2.setImageResource(R.drawable.cara);
        }else {
            imageView2.setImageResource(R.drawable.coroa);
        }

    }
}