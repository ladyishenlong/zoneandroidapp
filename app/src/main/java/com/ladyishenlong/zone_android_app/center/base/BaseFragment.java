package com.ladyishenlong.zone_android_app.center.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ladyishenlong.zone_android_app.center.annotation.Layout;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {


    Unbinder unbinder;

    private int layoutId;
    protected BaseActivity activity;
    protected Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Class<?> clazz = this.getClass();
        if (clazz.getAnnotations() != null) {
            if (clazz.isAnnotationPresent(Layout.class)) {
                Layout layout = clazz.getAnnotation(Layout.class);
                layoutId = layout.value();
                activity = (BaseActivity) getActivity();
                context = getContext();
            }
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(layoutId, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        onViewCreated(savedInstanceState);
    }


    protected abstract void onViewCreated(@Nullable Bundle savedInstanceState);


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
