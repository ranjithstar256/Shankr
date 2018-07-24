package com.droidmanifester.shankr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Main4Activity extends AppCompatActivity {

    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        animation= AnimationUtils.loadAnimation(Main4Activity.this,R.anim.nav);
    }

    public void dgfh(View view) {
        view.startAnimation(animation);
    }
}
