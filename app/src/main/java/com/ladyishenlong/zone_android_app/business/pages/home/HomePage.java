package com.ladyishenlong.zone_android_app.business.pages.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.Utils.RefreshUtils;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseFragment;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

@Layout(R.layout.page_home)
public class HomePage extends BaseFragment {


    @BindView(R.id.smartRefreshLayout)
    SmartRefreshLayout smartRefreshLayout;



    @Override
    protected void onViewCreated(@Nullable Bundle savedInstanceState) {
//        BlurUtils.INSTANCE.set(getActivity(), blurView);
        RefreshUtils.INSTANCE.setLeaveBlank(getContext(), smartRefreshLayout);



    }


}
