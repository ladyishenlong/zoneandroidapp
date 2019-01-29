package com.ladyishenlong.zone_android_app.business.main;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseActivity;

import butterknife.BindView;

@Layout(R.layout.activity_main)
public class MainActivity extends BaseActivity {





    private String[] tabTitle = {"首页", "设置"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }







}
