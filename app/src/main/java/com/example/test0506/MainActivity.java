package com.example.test0506;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Path;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
//import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball1 = (ImageView) findViewById(R.id.imageViewBall1);
        Path path = new Path();
        for(int i=0;i<4;i++){
            path.arcTo(60f*i+420f, 690f, 60f*(i+1)+420f, 790f, 180f, 180f, true);
        }
        ObjectAnimator animatorGo1 = ObjectAnimator.ofFloat(ball1, View.X, View.Y, path);
        animatorGo1.setDuration(1600);
        ObjectAnimator animatorBack1 = ObjectAnimator.ofFloat(ball1, "translationX", 0f);
        animatorBack1.setDuration(1000);
        AnimatorSet animSetGoBack1 = new AnimatorSet();
        animSetGoBack1.playSequentially(animatorGo1, animatorBack1);
        animSetGoBack1.start();

        final ImageView ball2 = (ImageView) findViewById(R.id.imageViewBall2);
        ObjectAnimator animatorGo2 = ObjectAnimator.ofFloat(ball2, View.X, View.Y, path);
        animatorGo2.setDuration(1600);
        ObjectAnimator animatorBack21 = ObjectAnimator.ofFloat(ball2, "translationX", -60f);
        animatorBack21.setDuration(400);
        ObjectAnimator animatorBack22 = ObjectAnimator.ofFloat(ball2, "translationX", -60f);
        animatorBack22.setDuration(1000);
        AnimatorSet animSetGoBack2 = new AnimatorSet();
        animSetGoBack2.playSequentially(animatorBack21, animatorGo2, animatorBack22);
        animSetGoBack2.start();

        final ImageView ball3 = (ImageView) findViewById(R.id.imageViewBall3);
        ObjectAnimator animatorGo3 = ObjectAnimator.ofFloat(ball3, View.X, View.Y, path);
        animatorGo3.setDuration(1600);
        ObjectAnimator animatorBack30 = ObjectAnimator.ofFloat(ball3, "translationX", 0f);
        animatorBack30.setDuration(200);
        ObjectAnimator animatorBack31 = ObjectAnimator.ofFloat(ball3, "translationX", -120f);
        animatorBack31.setDuration(800);
        ObjectAnimator animatorBack32 = ObjectAnimator.ofFloat(ball3, "translationX", -120f);
        animatorBack32.setDuration(1000);
        AnimatorSet animSetGoBack3 = new AnimatorSet();
        animSetGoBack3.playSequentially(animatorBack30, animatorBack31, animatorGo3, animatorBack32);
        animSetGoBack3.start();

        final ImageView ball4 = (ImageView) findViewById(R.id.imageViewBall4);
        ObjectAnimator animatorGo4 = ObjectAnimator.ofFloat(ball4, View.X, View.Y, path);
        animatorGo4.setDuration(1600);
        ObjectAnimator animatorBack40 = ObjectAnimator.ofFloat(ball4, "translationX", 0f);
        animatorBack40.setDuration(400);
        ObjectAnimator animatorBack41 = ObjectAnimator.ofFloat(ball4, "translationX", -180f);
        animatorBack41.setDuration(1200);
        ObjectAnimator animatorBack42 = ObjectAnimator.ofFloat(ball4, "translationX", -180f);
        animatorBack42.setDuration(1000);
        AnimatorSet animSetGoBack4 = new AnimatorSet();
        animSetGoBack4.playSequentially(animatorBack40, animatorBack41, animatorGo4, animatorBack42);
        animSetGoBack4.start();
    }
}