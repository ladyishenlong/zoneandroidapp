package com.ladyishenlong.zone_android_app.business.pages.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.Utils.BlurUtils;
import com.ladyishenlong.zone_android_app.center.Utils.ToastUtils;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseFragment;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

@Layout(R.layout.page_home)
public class HomePage extends BaseFragment {


    @BindView(R.id.smartRefreshLayout)
    SmartRefreshLayout smartRefreshLayout;
    @BindView(R.id.blurView)
    BlurView blurView;
    @BindView(R.id.tv_gsh)
    TextView tvGsh;


    @Override
    protected void onViewCreated(@Nullable Bundle savedInstanceState) {
        BlurUtils.INSTANCE.set(getActivity(),blurView);


    }




}
