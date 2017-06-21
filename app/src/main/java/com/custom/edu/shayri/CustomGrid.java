package com.custom.edu.shayri;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by VNurtureTechnologies on 19-06-2017.
 */


public class CustomGrid extends BaseAdapter {
    Context context;
    ArrayList<Post> postArrayList;
    TextView textView;
    ImageView imageView;

    int[] catimg;

    public CustomGrid(Context context, ArrayList<Post> postArrayList, int[] catimg) {
        this.context=context;
        this.postArrayList=postArrayList;
        this.catimg=catimg;
    }


    @Override
    public int getCount() {
        return postArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return postArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.singal_col,parent,false);
        textView=(TextView)convertView.findViewById(R.id.single_col_text1);
        imageView=(ImageView)convertView.findViewById(R.id.single_col_img1);
        textView.setText(postArrayList.get(i).getName());
        imageView.setImageResource(catimg[0]);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gridintent = new Intent(context,Listactivity.class);
                gridintent.putExtra("listquotes",postArrayList.get(i).getId());
                context.startActivity(gridintent);
            }
        });
        return convertView;
    }
}
