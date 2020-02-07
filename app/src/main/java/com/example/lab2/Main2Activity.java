package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lab2.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView myTextView = findViewById(R.id.myTextView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        myTextView.setText("Hello "+str);
    }
}
