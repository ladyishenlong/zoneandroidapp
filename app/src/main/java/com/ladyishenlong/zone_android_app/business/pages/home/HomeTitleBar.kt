package com.ladyishenlong.zone_android_app.business.pages.home

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.content.Context
import android.graphics.BlurMaskFilter
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.RelativeLayout
import com.ladyishenlong.zone_android_app.R
import com.ladyishenlong.zone_android_app.business.main.MainActivity
import com.ladyishenlong.zone_android_app.center.Utils.BlurUtils
import eightbitlab.com.blurview.BlurView
import eightbitlab.com.blurview.RenderScriptBlur
import kotlinx.android.synthetic.main.titlebar_home.view.*

class HomeTitleBar : BlurView {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    lateinit var layoutBlurView:BlurView

    override fun onFinishInflate() {
        super.onFinishInflate()
        layoutBlurView = findViewById<BlurView>(R.id.layout_blurView)
    }




}


