package com.lloydfinch.apt;

import android.app.Activity;

import com.lloydfinch.annotation.Constant;

import java.lang.reflect.Method;

/**
 * Name: BindViewTools
 * Author: lloydfinch
 * Function: 用于处理运行时注解内容
 * Date: 2019-11-22 22:30
 * Modify: lloydfinch 2019-11-22 22:30
 */
public class BindViewTools {

    public static void bindView(Activity activity) {
        Class clz = activity.getClass();
        String annotationName = clz.getName() + Constant.SUFFIX;
        try {
            Class bindViewClass = Class.forName(annotationName);
            Method method = bindViewClass.getMethod("test");
            method.invoke(bindViewClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
