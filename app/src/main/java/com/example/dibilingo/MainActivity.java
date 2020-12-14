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

import com.wenchao.cardstack.CardStack;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {
    RelativeLayout relativeLayout;
    FrameLayout frameLayout;
    MotionEvent event;
    float x;
    float y;
    private StackView stackView;
    ArrayList<String> card_list;
    CardStack cardstack;
    SwipeCardAdapter swipe_card_adapter;
    private final String[] IMAGE_NAMES= {"wolf","cow", "crab", "dog","donkey"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        card_list = new ArrayList<>();

        card_list.add("card 1");
        card_list.add("card 2");
        card_list.add("card 3");
        card_list.add("card 4");
        card_list.add("card 5");

        cardstack = (CardStack) findViewById(R.id.container);
        cardstack.setContentResource(R.layout.stack_item);
        cardstack.setStackMargin(18);
        cardstack.setListener(this);

        swipe_card_adapter = new SwipeCardAdapter(getApplicationContext(),0,card_list);
        cardstack.setAdapter(swipe_card_adapter);

    }
    @Override
    public boolean swipeEnd(int section, float distance) {
        return true;
    }

    @Override
    public boolean swipeStart(int section, float distance) {
        return true;
    }

    @Override
    public boolean swipeContinue(int section, float distanceX, float distanceY) {
        return true;
    }

    @Override
    public void discarded(int mIndex, int direction) {

        int swiped_card_postion = mIndex -1;

        //getting the string attached with the card

        String swiped_card_text = card_list.get(swiped_card_postion).toString();

        if (direction == 1) {

            Toast.makeText(getApplicationContext(),swiped_card_text+ " Swipped to Right",Toast.LENGTH_SHORT).show();

        } else if (direction == 0) {

            Toast.makeText(getApplicationContext(),swiped_card_text+" Swipped to Left",Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(getApplicationContext(),swiped_card_text+" Swipped to Bottom",Toast.LENGTH_SHORT).show();

        }


    }

    @Override
    public void topCardTapped() {

        Toast.makeText(getApplicationContext(),"Clicked top card",Toast.LENGTH_SHORT).show();

    }

    }
