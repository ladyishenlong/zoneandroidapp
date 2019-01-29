package com.ladyishenlong.zone_android_app.test;

import android.os.Bundle;
import android.widget.Button;

import com.ladyishenlong.zone_android_app.center.base.BaseActivity;
import com.ladyishenlong.zone_android_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends BaseActivity {


    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if(AppConfig.INSTANCE.getTheme()==1){
//            setTheme(R.style.LightTheme);
//        }else {
//            setTheme(R.style.DreamTheme);
//        }

        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.btn)
    public void onViewClicked() {
//        AppConfig.INSTANCE.setTheme(0);
        recreate();//刷新布局
    }


}
