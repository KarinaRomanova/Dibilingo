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
        final Integer fWidth = frameLayout.getWidth();
        relativeLayout.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event){
                x=event.getX();
                y=event.getY();
                if(event.getAction()==MotionEvent.ACTION_MOVE){


                     frameLayout.setRotation((x-relativeLayout.getWidth()/2)/6);


                }return true;
            }
        });
    }


    }
  //              после того как оотпускаешь проверяем угол и отлетает
//                RotateAnimation rotate = new RotateAnimation(0, 100, Animation.RELATIVE_TO_SELF,
//                        1f,  Animation.RELATIVE_TO_SELF, 1f);
//                rotate.setDuration(200);
//                frameLayout.startAnimation(rotate);