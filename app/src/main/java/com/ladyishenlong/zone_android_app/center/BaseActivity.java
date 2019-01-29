package com.ladyishenlong.zone_android_app.center;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.config.ThemeConfig;

import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    protected Context context;
    protected BaseActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeConfig.INSTANCE.setTheme(this);
        initAnnotation();
        context = this;
        activity = this;
    }

    private void initAnnotation() {
        Class<?> clazz = this.getClass();
        if (clazz.getAnnotations() != null) {
            if (clazz.isAnnotationPresent(Layout.class)) {
                Layout layout=clazz.getAnnotation(Layout.class);
                setContentView(layout.value());//子类的布局加载
                ButterKnife.bind(this);
            }
        }
    }


}
