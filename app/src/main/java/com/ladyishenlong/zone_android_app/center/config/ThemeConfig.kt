package com.ladyishenlong.zone_android_app.center.config

import com.ladyishenlong.zone_android_app.R
import com.ladyishenlong.zone_android_app.center.base.BaseActivity

object ThemeConfig {


    const val WhiteDreamTheme = 0
    const val lightTheme = 1
    const val darkTheme = 2

    var theme = 1 //默认theme


    fun setTheme(baseActivity: BaseActivity) {
        when (theme) {
            WhiteDreamTheme -> baseActivity.setTheme(R.style.WhiteDreamTheme)
            lightTheme -> baseActivity.setTheme(R.style.LightTheme)
            darkTheme->baseActivity.setTheme(R.style.DarkTheme)
        }
    }


    fun refreshTheme(baseActivity: BaseActivity, theme: Int) {
        this.theme = theme
        baseActivity.recreate()
    }


}