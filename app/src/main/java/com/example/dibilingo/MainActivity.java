package com.example.dibilingo;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ViewAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.StackView;


public class MainActivity extends AppCompatActivity {
RelativeLayout relativeLayout;
FrameLayout[] frameLayout;
MotionEvent motionEvent;
float x;
float y;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        //frameLayout = (FrameLayout) findViewById(R.id.card);
//        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                x = event.getX();
//                y = event.getY();
//                if (event.getAction() == MotionEvent.ACTION_MOVE) {
//                    if (x < relativeLayout.getWidth() / 2) {
//                        frameLayout.setPivotX(0);
//                        frameLayout.setPivotY(frameLayout.getHeight());
//                    }
//                    if (x >= relativeLayout.getWidth() / 2) {
//                        frameLayout.setPivotX(frameLayout.getWidth());
//                        frameLayout.setPivotY(frameLayout.getHeight());
//                    }
//                    frameLayout.setRotation((x - relativeLayout.getWidth() / 2) / 6);
//                }
//                if (event.getAction() == MotionEvent.ACTION_UP) {
//                    if (frameLayout.getRotation() >= 10) {
//                        RotateAnimation rotate = new RotateAnimation(0, 100, Animation.RELATIVE_TO_SELF,
//                                1f, Animation.RELATIVE_TO_SELF, 1f);
//                        frameLayout.setAlpha(1f);
//                        frameLayout.setVisibility(View.VISIBLE);
//                        frameLayout.animate()
//                                .alpha(0f)
//                                .setDuration(400)
//                                .setListener(null);
//                        rotate.setDuration(500);
//                        frameLayout.startAnimation(rotate);
//                        relativeLayout.removeView(frameLayout);
//                    }
//                    if (frameLayout.getRotation() <= -10) {
//                        RotateAnimation rotate = new RotateAnimation(0, -100, Animation.RELATIVE_TO_SELF,
//                                0f, Animation.RELATIVE_TO_SELF, 1f);
//                        frameLayout.setAlpha(1f);
//                        frameLayout.setVisibility(View.VISIBLE);
//                        frameLayout.animate()
//                                .alpha(0f)
//                                .setDuration(400)
//                                .setListener(null);
//                        rotate.setDuration(500);
//                        frameLayout.startAnimation(rotate);
//                        relativeLayout.removeView(frameLayout);
//                    } else {
//                        frameLayout.setRotation(frameLayout.getRotation());
//                        frameLayout.animate()
//                                .rotation(0)
//
//                                .setListener(null);
//
//                    }
//                }
//                return true;
//            }
//        });
    }

    }
