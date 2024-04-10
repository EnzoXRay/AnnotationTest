package com.example.test;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.annotations.MyBindView;
import com.example.reflect.MyButterKnife;


public class MainActivity extends AppCompatActivity {
    @MyBindView(R.id.tv_text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyButterKnife.bind(this);
        textView.setText("Hello APT!!!!");
    }
}
