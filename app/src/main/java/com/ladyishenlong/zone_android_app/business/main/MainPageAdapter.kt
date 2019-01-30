package com.ladyishenlong.zone_android_app.business.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.ladyishenlong.zone_android_app.business.pages.home.HomePage
import com.ladyishenlong.zone_android_app.business.pages.set.SetPage
import java.util.ArrayList

/***
 * 首页viewPage适配器
 */
class MainPageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {



    private val fragmentList = ArrayList<Fragment>()

    init {
        fragmentList.add(HomePage())
        fragmentList.add(SetPage())
    }


    override fun getItem(p0: Int): Fragment = fragmentList[p0]

    override fun getCount(): Int = fragmentList.size



}