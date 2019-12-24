package com.lloydfinch.share;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lloydfinch.protocol.Protocol;

@Route(path = "share/ShareToolActivity", group = Protocol.GROUP_SHARE, name = "ShareToolActivity")
public class ShareToolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_tool);
    }
}
