package com.ladyishenlong.zone_android_app.center

import android.app.Application
import android.content.Context
import android.util.AttributeSet
import com.apkfuns.logutils.LogUtils
import com.ladyishenlong.zone_android_app.center.config.AppConfig

class App : Application() {



    override fun onCreate() {
        super.onCreate()

        LogUtils.configAllowLog = !AppConfig.isRelease
        LogUtils.configTagPrefix = "LogUtils"
    }


}