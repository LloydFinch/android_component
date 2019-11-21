package com.lloydfinch.componentmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lloydfinch.annotation.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.tv_hello)
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
