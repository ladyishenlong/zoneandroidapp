package com.ladyishenlong.zone_android_app.business.pages.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.business.main.MainActivity;
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

@Layout(R.layout.page_home)
public class HomePage extends BaseFragment {


    @BindView(R.id.smartRefreshLayout)
    SmartRefreshLayout smartRefreshLayout;
    @BindView(R.id.layout)
    LinearLayout layout;

    @Override
    protected void onViewCreated(@Nullable Bundle savedInstanceState) {
        smartRefreshLayout.setRefreshHeader(new ClassicsHeader(context));//设置Header
        smartRefreshLayout.setRefreshFooter(new ClassicsFooter(context));//设置Footer

        smartRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {


            }
        });
//        Blurry.with(context).radius(25).sampling(2).onto(smartRefreshLayout);


    }



}
