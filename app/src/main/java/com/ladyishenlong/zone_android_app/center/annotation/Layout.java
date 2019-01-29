package com.ladyishenlong.zone_android_app.center.annotation;


import android.support.annotation.LayoutRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Layout {

    @LayoutRes
    int value() default 0;//布局文件

}
