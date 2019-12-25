package com.lloydfinch.share;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Name: ShareApplication
 * Author: lloydfinch
 * Function: ShareApplication
 * Date: 2019-12-24 16:50
 * Modify: lloydfinch 2019-12-24 16:50
 */
public class ShareApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (isDebug()) {
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(ShareApplication.this);
    }


    private boolean isDebug() {
        return true;
    }
}
