package com.lloydfinch.componentmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lloydfinch.annotation.BindView;
import com.lloydfinch.apt.BindViewTools;

@Route(path = "/main/MainActivity")
public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.tv_hello, value = "hello android")
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bindView(this);

        textView = findViewById(R.id.tv_hello);

        textView.setOnClickListener(v -> {
            // startActivity(new Intent(this, MainActivity.class));
            ARouter.getInstance().build("/share/ShareToolActivity").navigation();
        });
    }
}
