package com.example.test0506;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Path;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball = (ImageView) findViewById(R.id.imageViewBall);
        Path path = new Path();
        for(int i=0;i<4;i++){
            path.arcTo(70f*i+400f, 500f, 70f*(i+1)+400f, 580f, 180f, 180f, true);
        }
        ObjectAnimator animatorGo = ObjectAnimator.ofFloat(ball, View.X, View.Y, path);
        animatorGo.setDuration(1500);
        ObjectAnimator animatorBack = ObjectAnimator.ofFloat(ball, "translationX", 0f);
        animatorBack.setDuration(1000);
        AnimatorSet animSetGoBack = new AnimatorSet();
        animSetGoBack.playSequentially(animatorGo, animatorBack);
        animSetGoBack.start();
    }
}