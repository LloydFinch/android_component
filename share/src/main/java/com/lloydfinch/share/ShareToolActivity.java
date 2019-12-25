package com.lloydfinch.share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/share/ShareToolActivity")
public class ShareToolActivity extends AppCompatActivity {

    private TextView tvShareTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_tool);

        tvShareTool = findViewById(R.id.tv_share_tool);
        tvShareTool.setOnClickListener(v -> {
            ARouter.getInstance().build("/main/MainActivity").navigation();
        });
    }
}
