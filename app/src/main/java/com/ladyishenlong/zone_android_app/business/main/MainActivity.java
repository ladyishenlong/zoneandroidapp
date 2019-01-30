package com.ladyishenlong.zone_android_app.business.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.ladyishenlong.zone_android_app.R;
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
    @BindView(R.id.view_fill)
    View viewFill;
    @BindView(R.id.blurView)
    BlurView blurView;

    private MainPageAdapter mainPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainPageAdapter = new MainPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mainPageAdapter);
        viewPager.setOffscreenPageLimit(4);//加载页数限制
        viewPager.setCanSlide(false);//禁止左右滑动
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


        float radius = 20f;

        View decorView = getWindow().getDecorView();
        //ViewGroup you want to start blur from. Choose root as close to BlurView in hierarchy as possible.
        ViewGroup rootView = (ViewGroup) decorView.findViewById(android.R.id.content);
        //Set drawable to draw in the beginning of each blurred frame (Optional).
        //Can be used in case your layout has a lot of transparent space and your content
        //gets kinda lost after after blur is applied.
        Drawable windowBackground = decorView.getBackground();



        blurView.setupWith(rootView)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new RenderScriptBlur(this))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);


    }


    public void isShowFill(boolean isShow) {
        if (isShow) viewFill.setVisibility(View.VISIBLE);
        else viewFill.setVisibility(View.GONE);
    }


}
