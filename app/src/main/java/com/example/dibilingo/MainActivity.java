package com.example.dibilingo;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ViewAnimator;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends Activity {
    RelativeLayout relativeLayout;
      FrameLayout frameLayout;
    MotionEvent event;
    float x;
    float y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        frameLayout=(FrameLayout) findViewById(R.id.card);


                relativeLayout.setOnTouchListener(new OnSwipeTouchListener(this) {
            public boolean onSwipeTop() {
                Toast.makeText(MainActivity.this, "top", Toast.LENGTH_SHORT).show();
                return true;
            }
            public void onSwipeRight() {

                RotateAnimation rotate = new RotateAnimation(0, 100, Animation.RELATIVE_TO_SELF,
                        1f,  Animation.RELATIVE_TO_SELF, 1f);
                rotate.setDuration(300);
                frameLayout.startAnimation(rotate);

            }
            public void onSwipeLeft() {
                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();

            }
            public boolean onSwipeBottom() {
                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }}