package com.ladyishenlong.zone_android_app.center.base;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.gyf.barlibrary.ImmersionBar;
import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.Utils.ActivityUtils;
import com.ladyishenlong.zone_android_app.center.Utils.GlideUtils;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.config.ThemeConfig;

import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    protected Context context;
    protected BaseActivity activity;
    private FrameLayout layoutBase;
    private ImageView imgBaseBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityUtils.INSTANCE.add(this);
        ThemeConfig.INSTANCE.setTheme(this);//设置主题风格
        setContentView(R.layout.avtivity_base);//布局加载
        layoutBase = findViewById(R.id.layout_base);
        imgBaseBg = findViewById(R.id.img_baseBg);
        initAnnotation();
        context = this;
        activity = this;
        setTheme();//主题设置
    }

    /**
     * 注解解释
     */
    private void initAnnotation() {
        Class<?> clazz = this.getClass();
        if (clazz.getAnnotations() != null) {
            if (clazz.isAnnotationPresent(Layout.class)) {
                Layout layout = clazz.getAnnotation(Layout.class);
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View chileView = inflater.inflate(layout.value(), null);
                layoutBase.addView(chileView);
                ButterKnife.bind(this);
            }
        }
    }

    private void setTheme() {
        switch (ThemeConfig.INSTANCE.getTheme()) {
            case ThemeConfig.WhiteDreamTheme:
                imgBaseBg.setVisibility(View.VISIBLE);
                GlideUtils.INSTANCE.setBaseBg(this, imgBaseBg);
                break;
            case ThemeConfig.lightTheme:
                ImmersionBar.with(this)
                        .statusBarDarkFont(true)//状态栏字体是深色，不写默认为亮色
                        .init();
                break;
            default:
                break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityUtils.INSTANCE.removeActivity(this);
        ImmersionBar.with(this).destroy();
    }
}
