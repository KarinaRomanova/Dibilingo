package com.example.dibilingo;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SwipeCardAdapter extends ArrayAdapter<String> {

    ArrayList<String> card_list;

    public SwipeCardAdapter(Context context, int resource,ArrayList<String> card_list) {
        super(context, resource);
        this.card_list = card_list;
    }

    @Override
    public View getView(int position, final View contentView, ViewGroup parent){

        TextView name_img = (TextView)(contentView.findViewById(R.id.name_img));
        name_img.setText(card_list.get(position).toString());
        return contentView;
    }


    @Override
    public int getCount() {
        return this.card_list.size();
    }

}