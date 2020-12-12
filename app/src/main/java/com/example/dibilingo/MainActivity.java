package com.example.dibilingo;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

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
        relativeLayout.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event){
                x=event.getX();
                y=event.getY();
if(event.getAction()==MotionEvent.ACTION_MOVE){
    if()
}return true;
            }
        });
    }
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2,
                           final float velocityX, final float velocityY) {

        final float distanceTimeFactor = 0.4f;
        final float totalDx = (distanceTimeFactor * velocityX/2);
        final float totalDy = (distanceTimeFactor * velocityY/2);

        view.onAnimateMove(totalDx, totalDy,
                (long) (1000 * distanceTimeFactor));
        return true;
    }}
