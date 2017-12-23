package com.example.android.christmascard;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView btSong01;
    ImageView btSong02;
    ImageView btSong03;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btSong01 = (ImageView) findViewById(R.id.package01);
        btSong02 = (ImageView) findViewById(R.id.package02);
        btSong03 = (ImageView) findViewById(R.id.package03);

        TextView myTextView = (TextView) findViewById(R.id.christmas);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/miraculous.ttf");
        myTextView.setTypeface(typeface);

        TextView myTextView1 = (TextView) findViewById(R.id.merry);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/miraculous.ttf");
        myTextView1.setTypeface(typeface1);



        btSong01.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(MainActivity.this, R.raw.we_wish_you_a_merry_christmas);
                mp.start();
            }

        });

        btSong02.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(MainActivity.this, R.raw.santa_claus_is_coming_to_town);
                mp.start();
            }

        });


        btSong03.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(MainActivity.this, R.raw.white_christmas);
                mp.start();
            }

        });

    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }


    }
}
