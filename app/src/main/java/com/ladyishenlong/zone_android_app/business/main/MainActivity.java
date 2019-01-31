package com.ladyishenlong.zone_android_app.business.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.Utils.BlurUtils;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseActivity;
import com.ladyishenlong.zone_android_app.center.view.ViewPager;

import butterknife.BindView;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

@Layout(R.layout.activity_main)
public class MainActivity extends BaseActivity {


    @BindView(R.id.bottomNavigationViewEx)
    BottomNavigationViewEx bottomNavigationViewEx;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.blurView)
    BlurView blurView;

    private MainPageAdapter mainPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BlurUtils.INSTANCE.set(this,blurView);
        mainPageAdapter = new MainPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mainPageAdapter);
        viewPager.setOffscreenPageLimit(4);//加载页数限制
        viewPager.setCanSlide(false);//TODO 禁止左右滑动，还有bug
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
        bottomNavigationViewEx.setBackgroundColor(getColor(R.color.transparent));
        bottomNavigationViewEx.setOnNavigationItemSelectedListener(menuItem -> {
            viewPager.setCurrentItem(menuItem.getOrder(), false);
            return true;
        });




    }



}
