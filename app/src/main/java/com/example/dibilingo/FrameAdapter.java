package com.example.dibilingo;
import android.content.Context;
<<<<<<< HEAD
=======
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.content.Context;
import android.graphics.Color;
>>>>>>> parent of d137878... swipe adapter
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
<<<<<<< HEAD
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class FrameAdapter extends ArrayAdapter<StackItem> {
=======
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class FrameAdapter extends ArrayAdapter<StackItem> {

>>>>>>> parent of d137878... swipe adapter
    private List<StackItem> items;
    private Context context;

    public FrameAdapter(Context context, int textViewResourceId,
                        List<StackItem> objects) {
        super(context, textViewResourceId, objects);
        this.items = objects;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = layoutInflater.inflate(R.layout.stack_item, null);
        }
        StackItem stackItem = items.get(position);
        if(stackItem== null)  {
            Log.i("MyLog", "stackItem at " + position + " is null!!!");
            return itemView;
        }
        // TextView defined in the stack_item.xml
        TextView textView = (TextView) itemView.findViewById(R.id.name_img);

        // ImageView defined in the stack_item.xml
        ImageView imageView = (ImageView) itemView.findViewById(R.id.animal);

<<<<<<< HEAD
        textView.setText(stackItem.getImageName());

        // "image1", "image2",..
        String imageName= stackItem.getImageName();
=======
        textView.setText(stackItem.getItemText());

        // "image1", "image2",..
        String imageName= stackItem.getImageName()+".png";
>>>>>>> parent of d137878... swipe adapter

        int resId= this.getDrawableResIdByName(imageName);

        imageView.setImageResource(resId);


        return itemView;
    }


    // Find Image ID corresponding to the name of the image (in the drawable folder).
    public int getDrawableResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName, "drawable", pkgName);
        Log.i("MyLog", "Res Name: " + resName + "==> Res ID = " + resID);
        return resID;
    }

}