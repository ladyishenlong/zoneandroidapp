package com.ladyishenlong.zone_android_app.business.pages.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

@Layout(R.layout.page_home)
public class HomePage extends BaseFragment {


    @BindView(R.id.gg)
    TextView gg;

    @Override
    protected void onViewCreated(@Nullable Bundle savedInstanceState) {
        gg.setText("搞事情");
    }


}
