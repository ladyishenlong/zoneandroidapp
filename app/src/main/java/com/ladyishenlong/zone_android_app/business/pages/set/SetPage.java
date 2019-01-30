package com.ladyishenlong.zone_android_app.business.pages.set;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ladyishenlong.zone_android_app.R;
import com.ladyishenlong.zone_android_app.center.base.BaseFragment;

public class SetPage extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page_set, container, false);
        return view;
    }
}
