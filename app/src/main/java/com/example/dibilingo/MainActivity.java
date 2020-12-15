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

<<<<<<< HEAD
import com.andtinder.model.CardModel;
import com.andtinder.model.Orientations;
import com.andtinder.view.CardContainer;


=======
>>>>>>> parent of d137878... swipe adapter
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

<<<<<<< HEAD
public class MainActivity extends AppCompatActivity {
=======
public class MainActivity extends AppCompatActivity  {
>>>>>>> parent of d137878... swipe adapter
    RelativeLayout relativeLayout;
    FrameLayout frameLayout;
    MotionEvent event;
    float x;
    float y;
<<<<<<< HEAD
=======
    private StackView stackView;
>>>>>>> parent of d137878... swipe adapter
    private final String[] IMAGE_NAMES= {"wolf","cow", "crab", "dog","donkey"};
    private StackView stackView;
    private Button buttonPrevious;
    private Button buttonNext;
CardContainer mCardContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD

        mCardContainer = (CardContainer) findViewById(R.id.layoutview);
        mCardContainer.setOrientation(Orientations.Orientation.Ordered);
        CardModel card = new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1);
=======
        relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        this.stackView=(StackView) findViewById(R.id.stackView);
        List<StackItem> items = new ArrayList<StackItem>();
        for(String imageName: IMAGE_NAMES) {
            items.add(new StackItem(imageName+".png", imageName));
        }
        FrameAdapter adapt = new FrameAdapter(this, R.layout.stack_item, items);
        stackView.setAdapter(adapt);
        //анимка
//
>>>>>>> parent of d137878... swipe adapter
//        relativeLayout.setOnTouchListener(new View.OnTouchListener(){
//            @Override
//            public boolean onTouch(View v, MotionEvent event){
//                x=event.getX();
//                y=event.getY();
//                if(event.getAction()==MotionEvent.ACTION_MOVE){
//                    if(x<relativeLayout.getWidth()/2){
<<<<<<< HEAD
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
=======
//                    frameLayout.setPivotX(0);
//                    frameLayout.setPivotY(frameLayout.getHeight());}
//                    if(x>=relativeLayout.getWidth()/2){
//                        frameLayout.setPivotX(frameLayout.getWidth());
//                        frameLayout.setPivotY(frameLayout.getHeight());}
//                    frameLayout.setRotation((x-relativeLayout.getWidth()/2)/6);
//                }
//                if(event.getAction()==MotionEvent.ACTION_UP){
//                    if (frameLayout.getRotation()>=10){
//                        RotateAnimation rotate = new RotateAnimation(0, 100, Animation.RELATIVE_TO_SELF,
//                        1f,  Animation.RELATIVE_TO_SELF, 1f);
//                        frameLayout.setAlpha(1f);
//                        frameLayout.setVisibility(View.VISIBLE);
//                        frameLayout.animate()
>>>>>>> parent of d137878... swipe adapter
//                                .alpha(0f)
//                                .setDuration(400)
//                                .setListener(null);
//                        rotate.setDuration(500);
<<<<<<< HEAD
//                        stackView.startAnimation(rotate);
//                relativeLayout.removeView(stackView);}
//                    if (stackView.getRotation()<=-10){
=======
//                frameLayout.startAnimation(rotate);
//                relativeLayout.removeView(frameLayout);}
//                    if (frameLayout.getRotation()<=-10){
>>>>>>> parent of d137878... swipe adapter
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
<<<<<<< HEAD
=======
//
>>>>>>> parent of d137878... swipe adapter
//                    }
//                }
//                return true;
//            }
//        });
<<<<<<< HEAD


    }


}
=======
    }


    }
>>>>>>> parent of d137878... swipe adapter
