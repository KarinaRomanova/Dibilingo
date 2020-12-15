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

import com.andtinder.model.CardModel;
import com.andtinder.model.Orientations;
import com.andtinder.view.CardContainer;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    FrameLayout frameLayout;
    MotionEvent event;
    float x;
    float y;
    private final String[] IMAGE_NAMES= {"wolf","cow", "crab", "dog","donkey"};
    private StackView stackView;
    private Button buttonPrevious;
    private Button buttonNext;
CardContainer mCardContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCardContainer = (CardContainer) findViewById(R.id.layoutview);
        mCardContainer.setOrientation(Orientations.Orientation.Ordered);
        CardModel card = new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1);
//        relativeLayout.setOnTouchListener(new View.OnTouchListener(){
//            @Override
//            public boolean onTouch(View v, MotionEvent event){
//                x=event.getX();
//                y=event.getY();
//                if(event.getAction()==MotionEvent.ACTION_MOVE){
//                    if(x<relativeLayout.getWidth()/2){
//                    stackView.setPivotX(0);
//                    stackView.setPivotY(stackView.getHeight());}
//                    if(x>=relativeLayout.getWidth()/2){
//                        stackView.setPivotX(stackView.getWidth());
//                        stackView.setPivotY(stackView.getHeight());}
//                    stackView.setRotation((x-relativeLayout.getWidth()/2)/6);
//                }
//                if(event.getAction()==MotionEvent.ACTION_UP){
//                    if (stackView.getRotation()>=10){
//                        RotateAnimation rotate = new RotateAnimation(0, 100, Animation.RELATIVE_TO_SELF,
//                        1f,  Animation.RELATIVE_TO_SELF, 1f);
//                        stackView.setAlpha(1f);
//                        stackView.setVisibility(View.VISIBLE);
//                        stackView.animate()
//                                .alpha(0f)
//                                .setDuration(400)
//                                .setListener(null);
//                        rotate.setDuration(500);
//                        stackView.startAnimation(rotate);
//                relativeLayout.removeView(stackView);}
//                    if (stackView.getRotation()<=-10){
//                        RotateAnimation rotate = new RotateAnimation(0, -100, Animation.RELATIVE_TO_SELF,
//                                0f,  Animation.RELATIVE_TO_SELF, 1f);
//                        frameLayout.setAlpha(1f);
//                        frameLayout.setVisibility(View.VISIBLE);
//                        frameLayout.animate()
//                                .alpha(0f)
//                                .setDuration(400)
//                                .setListener(null);
//                        rotate.setDuration(500);
//                        frameLayout.startAnimation(rotate);
//                        relativeLayout.removeView(frameLayout);}
//                    else{
//                        frameLayout.setRotation(frameLayout.getRotation());
//                        frameLayout.animate()
//                                .rotation(0)
//
//                                .setListener(null);
//
//
//                    }
//                }
//                return true;
//            }
//        });


    }


}
