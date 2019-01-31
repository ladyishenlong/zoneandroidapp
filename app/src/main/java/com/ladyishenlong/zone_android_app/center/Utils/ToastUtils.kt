package com.ladyishenlong.zone_android_app.center.Utils

import android.app.Activity
import android.view.Gravity.CENTER
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.ladyishenlong.zone_android_app.R
import eightbitlab.com.blurview.BlurView

object ToastUtils {

    private lateinit var toast: Toast

    fun shortCenter(activity: Activity, content: String) {
        toast = Toast(activity)
        toast.duration = LENGTH_SHORT
        toast.setGravity(CENTER, 0, 0)
        val inflater = activity.layoutInflater
        val toastView = inflater.inflate(R.layout.toast_text, null)
        val tvContent = toastView.findViewById<TextView>(R.id.tv_content)
        val blurView = toastView.findViewById<BlurView>(R.id.blurView)
        BlurUtils.set(activity,blurView)
        tvContent.text = content
        toast.view = toastView
        toast.show()
    }


}