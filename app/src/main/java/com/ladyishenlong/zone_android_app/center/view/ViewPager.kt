package com.ladyishenlong.zone_android_app.center.view

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * 可控制左右滑动的viewpager
 */
class ViewPager : ViewPager {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)


    var isCanSlide = true

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return isCanSlide && super.onTouchEvent(ev)
    }

    override fun onInterceptHoverEvent(event: MotionEvent?): Boolean {
        return isCanSlide && super.onInterceptHoverEvent(event)
    }

}