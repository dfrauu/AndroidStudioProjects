package com.example.lab_audio;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{
    Button play_pause;
    MediaPlayer mp;
    ImageView image;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play_pause = findViewById(R.id.btnplay);
        image = findViewById(R.id.imageView5);
        mp = MediaPlayer.create(this, R.raw.gladiators);
//sorry es la cancion mp3, dentro del directorio raw
        image.setImageResource(R.drawable.albumcover);
        play_pause.setBackgroundResource(R.drawable.playpause);
        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying())
                {
                    mp.pause();
                    Toast.makeText(MainActivity.this,"Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }}
