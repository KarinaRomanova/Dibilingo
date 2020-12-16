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
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.StackView;


public class MainActivity extends Activity {
RelativeLayout relativeLayout;
FrameLayout[] frameLayoutArray;
FrameLayout frameLayout;
ImageView animal;
MotionEvent motionEvent;
float x;
float y;
int i=0;
    private final String[] IMAGE_NAMES= {"wolf","cow", "crab", "dog","donkey"};
private final int[] IMAGE_ID={R.drawable.wolf,R.drawable.cow,R.drawable.crab,R.drawable.dog,R.drawable.donkey };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

//
//        FrameLayout.LayoutParams iLayoutParams = new FrameLayout.LayoutParams
//                (330, 430);
//        iLayoutParams.gravity = Gravity.CENTER;
//        ImageView exFrame=new ImageView(this);
//        exFrame.setLayoutParams(iLayoutParams);
//exFrame.setImageResource(R.drawable.shape);
//frameLayout.addView(exFrame);
//
//        FrameLayout.LayoutParams inLayoutParams = new FrameLayout.LayoutParams
//                (310, 300);
//        inLayoutParams.gravity = Gravity.CENTER;
//        ImageView inFrame=new ImageView(this);
//        inFrame.setLayoutParams(iLayoutParams);
//        inFrame.setImageResource(R.drawable.shape_in_frame);
//        frameLayout.addView(inFrame);
//
//
//        FrameLayout.LayoutParams animalParams = new FrameLayout.LayoutParams
//                (300, 300);
//        animalParams.gravity = Gravity.CENTER;
//        ImageView animal=new ImageView(this);
//        animal.setLayoutParams(animalParams);
//        animal.setPadding(0,0,0,50);
//        animal.setImageResource(R.drawable.cow);
//        frameLayout.addView(animal);

//
//        LayoutInflater ltInflater = getLayoutInflater();
//        FrameLayout frameLayout=(FrameLayout) findViewById(R.id.frame);
//        View view = ltInflater.inflate(R.layout.frame, frameLayout, false);
//        ViewGroup.LayoutParams lp = view.getLayoutParams();
//        relativeLayout.addView(view);
//View view1;
//ImageView img=(ImageView) findViewById(R.id.animal);
//img.setImageResource(R.drawable.cow);
//view1=ltInflater.inflate(R.layout.frame,frameLayout,false);
//relativeLayout.addView(view1);






        frameLayout = (FrameLayout) findViewById(R.id.card);
        relativeLayout.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (x < relativeLayout.getWidth() / 2) {
                        frameLayout.setPivotX(0);
                        frameLayout.setPivotY(frameLayout.getHeight());
                    }
                    if (x >= relativeLayout.getWidth() / 2) {
                        frameLayout.setPivotX(frameLayout.getWidth());
                        frameLayout.setPivotY(frameLayout.getHeight());
                    }
                    frameLayout.setRotation((x - relativeLayout.getWidth() / 2) / 6);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (frameLayout.getRotation() >= 10) {
                        RotateAnimation rotate = new RotateAnimation(0, 100, Animation.RELATIVE_TO_SELF,
                                1f, Animation.RELATIVE_TO_SELF, 1f);
                        frameLayout.setAlpha(1f);
                        frameLayout.setVisibility(View.VISIBLE);
                        frameLayout.animate()
                                .alpha(0f)
                                .setDuration(400)
                                .setListener(null);
                        rotate.setDuration(500);
                        frameLayout.startAnimation(rotate);
                        relativeLayout.removeView(frameLayout);
                    }
                    if (frameLayout.getRotation() <= -10) {
                        RotateAnimation rotate = new RotateAnimation(0, -100, Animation.RELATIVE_TO_SELF,
                                0f, Animation.RELATIVE_TO_SELF, 1f);
                        frameLayout.setAlpha(1f);
                        frameLayout.setVisibility(View.VISIBLE);
                        frameLayout.animate()
                                .alpha(0f)
                                .setDuration(400)
                                .setListener(null);
                        rotate.setDuration(500);
                        frameLayout.startAnimation(rotate);
                        relativeLayout.removeView(frameLayout);
                    } else {
                        frameLayout.setRotation(frameLayout.getRotation());
                        frameLayout.animate()
                                .rotation(0)

                                .setListener(null);

                    }
                }
                return true;
            }
        });
    }

//    public View getView(int position, View convertView, ViewGroup parent) {
//        View itemView = convertView;
//        if (itemView == null) {
//            LayoutInflater layoutInflater = (LayoutInflater) context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            itemView = layoutInflater.inflate(R.layout.stack_item, null);
//        }
//        StackItem stackItem = items.get(position);
//        if(stackItem== null)  {
//            Log.i("MyLog", "stackItem at " + position + " is null!!!");
//            return itemView;
//        }
//        // TextView defined in the stack_item.xml
//        TextView textView = (TextView) itemView.findViewById(R.id.name_img);
//
//        // ImageView defined in the stack_item.xml
//        ImageView imageView = (ImageView) itemView.findViewById(R.id.animal);
//
//        textView.setText(stackItem.getItemText());
//
//        // "image1", "image2",..
//        String imageName= stackItem.getImageName();
//
//        int resId= this.getDrawableResIdByName(imageName);
//
//        imageView.setImageResource(resId);
//
//
//        return itemView;
//    }

    }
