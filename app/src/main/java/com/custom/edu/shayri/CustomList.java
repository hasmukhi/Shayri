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

public class CustomList extends BaseAdapter {
    Context listContext;
    String[] name;
    int res;
    ArrayList<Qlist> qArrayList;
    TextView textView;




    public CustomList(Context listContext, ArrayList<Qlist> qArrayList) {
        this.listContext=listContext;
        this.qArrayList=qArrayList;

    }

    @Override
    public int getCount() {
        return qArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return qArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(listContext).inflate(R.layout.single_row_list,parent,false);
        textView=(TextView)convertView.findViewById(R.id.single_row_list_text);
        textView.setText(qArrayList.get(i).getQuotes());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(listContext,Quotes.class);
                myintent.putExtra("quotePos",qArrayList.get(i).getQuotes());
                listContext.startActivity(myintent);
            }
        });
        return convertView;
    }
}
