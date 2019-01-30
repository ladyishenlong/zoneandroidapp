package com.ladyishenlong.zone_android_app.business.pages.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.base.BaseFragment;

public class HomePage extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page_home, container, false);
        return view;
    }
}
