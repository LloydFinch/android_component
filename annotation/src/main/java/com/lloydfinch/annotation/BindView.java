package com.lloydfinch.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Name: BindView
 * Author: lloydfinch
 * Function: 绑定View的注解
 * Date: 2019-11-21 20:40
 * Modify: lloydfinch 2019-11-21 20:40
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface BindView {

    /**
     * 传递View的id
     *
     * @return View的id
     */
    int id() default 0;

    String value() default "";
}
