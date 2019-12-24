package com.lloydfinch.share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lloydfinch.protocol.Protocol;

@Route(path = "share/ShareMainActivity", group = Protocol.GROUP_SHARE, name = "ShareMainActivity")
public class ShareMainActivity extends AppCompatActivity {


    private TextView tvShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_main);

        tvShare = findViewById(R.id.tv_share);
        tvShare.setOnClickListener(v -> {
            ARouter.getInstance().build("share/ShareToolActivity").navigation();
        });
    }
}
