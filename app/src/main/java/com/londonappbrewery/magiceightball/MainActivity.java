package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView BallDisplay= (ImageView) findViewById(R.id.Image_eightBall);
        final int[] ballarray={R.drawable.ball1,
                          R.drawable.ball2,
                          R.drawable.ball3,
                          R.drawable.ball4,
                          R.drawable.ball5};

        final Button MyButton= (Button) findViewById(R.id.AskButton);
        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random RandomNumberGenerater= new Random();
                int randomno=RandomNumberGenerater.nextInt(5);

                BallDisplay.setImageResource(ballarray[randomno]);
            }
        });








    }
}
