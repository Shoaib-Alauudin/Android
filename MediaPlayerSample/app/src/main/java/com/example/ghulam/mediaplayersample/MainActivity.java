package com.example.ghulam.mediaplayersample;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import static com.example.ghulam.mediaplayersample.R.id.seekbar;

public class MainActivity extends AppCompatActivity {

    private ImageView play,pause,stop,next,back;
    private SeekBar seekBar;
    private TextView song_title,start_time,final_time;
    private MediaPlayer mediaPlayer;
    ImageView songImage;

    private double startTime = 0;
    private double finalTime = 0;

    private Handler handler = new Handler();
    private int forwardTime = 10000;
    private int backwardTime = 10000;

    public static int oneTimeOnly = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.sajjad);

        play = (ImageView) findViewById(R.id.play);
        pause = (ImageView)findViewById(R.id.pause);
        stop = (ImageView)findViewById(R.id.stop);
        next = (ImageView)findViewById(R.id.next);
        back = (ImageView)findViewById(R.id.backward);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),"Play",Toast.LENGTH_SHORT).show();

                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();

                if(oneTimeOnly == 0){
                    seekBar.setMax((int)finalTime);
                    oneTimeOnly = 1;
                }

                final_time.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        finalTime)))
                );

                start_time.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        startTime)))
                );

                seekBar.setProgress((int)startTime);
                handler.postDelayed(UpdateSongTime, 100);
                pause.setEnabled(true);
                play.setEnabled(false);


            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.pause();
                Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_SHORT).show();

                pause.setEnabled(false);
                play.setEnabled(true);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int temp = (int) startTime;

                if (temp - forwardTime > 0) {
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(),
                            "You have Jumped backward 10 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Can not jumped 10 seconds back", Toast.LENGTH_SHORT).show();
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.stop();
                Toast.makeText(getApplicationContext(),"Stop",Toast.LENGTH_SHORT).show();

            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int temp = (int)startTime;

                if (temp+startTime <= finalTime){
                    startTime = startTime + forwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(),
                            "You have Jumped forward 10 seconds",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Can not Jumped to 10 seconds forward",Toast.LENGTH_SHORT).show();
                }


            }
        });


        song_title = (TextView)findViewById(R.id.song_title);
        start_time = (TextView)findViewById(R.id.start_time);
        final_time = (TextView)findViewById(R.id.end_time);

        seekBar = (SeekBar)findViewById(seekbar);
        seekBar.setClickable(false);



    }
    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            startTime = mediaPlayer.getCurrentPosition();
            start_time.setText(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes((long) startTime)))
            );
            seekBar.setProgress((int)startTime);
            handler.postDelayed(this, 100);
        }
    };
}


