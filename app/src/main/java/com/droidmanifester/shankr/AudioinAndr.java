package com.droidmanifester.shankr;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AudioinAndr extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audioin_andr);
        mediaPlayer=MediaPlayer.create(AudioinAndr.this,R.raw.abc);
    }

///2 types intent
    //i) Implict intent  - opening a build-in activity - broswer, camera
    //ii) Explict intent  - swiching bw user defined activities

    public void srt(View view) {
        mediaPlayer.start();
    }
    public void pau(View view) {
        mediaPlayer.pause();
    }

    public void stp(View view) {
        mediaPlayer.stop();
    }
}
