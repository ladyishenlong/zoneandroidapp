package com.ladyishenlong.zone_android_app.center.config

import com.ladyishenlong.zone_android_app.R
import com.ladyishenlong.zone_android_app.center.BaseActivity

object ThemeConfig {


    const val dreamTheme = 0
    const val lightTheme = 1

    var theme = 1


    fun setTheme(baseActivity: BaseActivity) {
        when (theme) {
            dreamTheme -> baseActivity.setTheme(R.style.DreamTheme)
            lightTheme -> baseActivity.setTheme(R.style.LightTheme)
        }
    }


    fun refreshTheme(baseActivity: BaseActivity, theme: Int) {
        this.theme = theme
        baseActivity.recreate()
    }


}