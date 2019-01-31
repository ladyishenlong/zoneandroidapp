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


    var isCanSlide = false

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        if(isCanSlide)return super.onTouchEvent(ev)else return false
    }

    override fun onInterceptHoverEvent(event: MotionEvent?): Boolean {

        if(isCanSlide)return super.onInterceptHoverEvent(event)else return false

    }

    override fun scrollTo(x: Int, y: Int) {
        if(isCanSlide) super.scrollTo(x, y)
    }

}