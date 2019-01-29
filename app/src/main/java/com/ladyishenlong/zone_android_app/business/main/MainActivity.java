package com.ladyishenlong.zone_android_app.business.main;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseActivity;

import butterknife.BindView;

@Layout(R.layout.activity_main)
public class MainActivity extends BaseActivity {


    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;


    private String[] tabTitle = {"首页", "设置"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


}
