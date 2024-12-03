package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt=(TextView)findViewById(R.id.textView3);
        float sum=getIntent().getExtras().getFloat("res");
        txt.setText("Result= "+sum);
    }
}
