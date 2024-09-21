package com.example.eightclassfinal;

import android.content.Context;
import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Youtube> {

    public ListAdapter(Context context, ArrayList<Youtube> ytvArrayList){
        super(context,R.layout.listview_item,ytvArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Youtube youtube = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.ytv_pic);
        TextView ytvTitle = convertView.findViewById(R.id.ytv_title);
        TextView ytvChannel = convertView.findViewById(R.id.ytv_channel);

        imageView.setImageResource(youtube.imageId);
        ytvTitle.setText(youtube.title);
        ytvChannel.setText(youtube.channel);


        return super.getView(position, convertView, parent);
    }
}
