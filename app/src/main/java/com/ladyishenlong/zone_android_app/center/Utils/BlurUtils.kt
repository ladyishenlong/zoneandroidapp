package com.ladyishenlong.zone_android_app.center.Utils

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import eightbitlab.com.blurview.BlurView
import eightbitlab.com.blurview.RenderScriptBlur

/**
 * 高斯模糊设置
 */
object BlurUtils {

    fun set(activity: Activity, blurView: BlurView) {

        val decorView = activity.window.decorView
        val rootView = decorView.findViewById(android.R.id.content) as ViewGroup
        val windowBackground = decorView.background

        blurView.setupWith(rootView)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(RenderScriptBlur(activity))
                .setBlurRadius(25f)
                .setHasFixedTransformationMatrix(true)


    }


    fun set(context: Context, blurView: BlurView) {
//
//        val decorView = context.applicationContext.window.decorView
//
//        val rootView = decorView.findViewById(android.R.id.content) as ViewGroup
//        val windowBackground = decorView.background
//
//        blurView.setupWith(rootView)
//                .setFrameClearDrawable(windowBackground)
//                .setBlurAlgorithm(RenderScriptBlur(context))
//                .setBlurRadius(25f)
//                .setHasFixedTransformationMatrix(true)


    }



}