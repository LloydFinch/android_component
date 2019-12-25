package com.lloydfinch.componentmodule;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Name: MainApplication
 * Author: lloydfinch
 * Function: MainApplication
 * Date: 2019-12-25 09:52
 * Modify: lloydfinch 2019-12-25 09:52
 */
public class MainApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        if (isDebug()) {
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(MainApplication.this);
    }


    private boolean isDebug() {
        return true;
    }
}
