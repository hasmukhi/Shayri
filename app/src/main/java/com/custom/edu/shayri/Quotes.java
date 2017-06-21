package com.custom.edu.shayri;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by VNurtureTechnologies on 21-06-2017.
 */

public class Quotes extends AppCompatActivity {

    TextView textViewQuote;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        textViewQuote=(TextView)findViewById(R.id.quotetxt);
        Intent intent = getIntent();
        String quotes = intent.getStringExtra("quotePos");
        textViewQuote.setText(quotes);

    }
}
