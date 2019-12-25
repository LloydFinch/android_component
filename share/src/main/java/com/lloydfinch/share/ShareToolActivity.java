package com.lloydfinch.share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lloydfinch.protocol.Protocol;

@Route(path = "/share/ShareToolActivity")
public class ShareToolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_tool);

        ARouter.getInstance().inject(this);
    }
}
