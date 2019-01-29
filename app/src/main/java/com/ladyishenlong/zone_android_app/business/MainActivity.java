package com.ladyishenlong.zone_android_app.business;

import android.os.Bundle;
import android.widget.Button;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.BaseActivity;
import com.ladyishenlong.zone_android_app.center.annotation.Layout;
import com.ladyishenlong.zone_android_app.center.config.ThemeConfig;

import butterknife.BindView;
import butterknife.OnClick;

@Layout(R.layout.activity_main)
public class MainActivity extends BaseActivity {


    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @OnClick(R.id.btn)
    public void onViewClicked() {

        ThemeConfig.INSTANCE.refreshTheme(activity, ThemeConfig.dreamTheme);

    }
}
