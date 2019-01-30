package com.ladyishenlong.zone_android_app.business.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.apkfuns.logutils.LogUtils;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseActivity;

import butterknife.BindView;

@Layout(R.layout.activity_main)
public class MainActivity extends BaseActivity {


    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.bottomNavigationViewEx)
    BottomNavigationViewEx bottomNavigationViewEx;


    private MainPageAdapter mainPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainPageAdapter = new MainPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mainPageAdapter);
        viewPager.setOffscreenPageLimit(4);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {//滑动之后的位置
                bottomNavigationViewEx.getMenu().getItem(i).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        bottomNavigationViewEx.setBackgroundColor(getColor(R.color.dreamWhite));
        bottomNavigationViewEx.setOnNavigationItemSelectedListener(menuItem -> {
            viewPager.setCurrentItem(menuItem.getOrder());
            return true;
        });
    }


}
