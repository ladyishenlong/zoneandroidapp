package com.ladyishenlong.zone_android_app.business.pages.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseFragment;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

@Layout(R.layout.page_home)
public class HomePage extends BaseFragment {


    @BindView(R.id.smartRefreshLayout)
    SmartRefreshLayout smartRefreshLayout;
    @BindView(R.id.blurView)
    BlurView blurView;


    @Override
    protected void onViewCreated(@Nullable Bundle savedInstanceState) {
        smartRefreshLayout.setRefreshHeader(new ClassicsHeader(context));//设置Header
        smartRefreshLayout.setRefreshFooter(new ClassicsFooter(context));//设置Footer

        smartRefreshLayout.setFooterTriggerRate(1);//触发加载距离 与 FooterHeight 的比率1.0.4
        smartRefreshLayout.setFooterMaxDragRate(2);//最大显示下拉高度/Footer标准高度

        smartRefreshLayout.setFooterHeight(150);//Footer标准高度（显示上拉高度>=标准高度 触发加载）
        smartRefreshLayout.setEnableFooterFollowWhenNoMoreData(true);//是否在全部加载结束之后Footer跟随内容1.0.4

        smartRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                smartRefreshLayout.finishLoadMoreWithNoMoreData();
            }
        });




        float radius = 20f;

        View decorView =getActivity().getWindow().getDecorView();
        //ViewGroup you want to start blur from. Choose root as close to BlurView in hierarchy as possible.
        ViewGroup rootView = (ViewGroup) decorView.findViewById(android.R.id.content);
        //Set drawable to draw in the beginning of each blurred frame (Optional).
        //Can be used in case your layout has a lot of transparent space and your content
        //gets kinda lost after after blur is applied.
        Drawable windowBackground = decorView.getBackground();



        blurView.setupWith(rootView)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new RenderScriptBlur(context))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);


    }


}
