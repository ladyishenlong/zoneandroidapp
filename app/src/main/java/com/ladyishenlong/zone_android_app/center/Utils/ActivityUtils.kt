package com.ladyishenlong.zone_android_app.center.Utils

import android.app.Activity
import android.os.Process
import java.util.ArrayList

object ActivityUtils {

    private val activityList = ArrayList<Activity>()

    fun add(activity: Activity) {
        activityList.add(activity)
    }

    fun removeActivity(activity: Activity){
        activityList.remove(activity)
    }


    fun exitApp(){
        for (activity in activityList) {
            activity.finish()
        }
        android.os.Process.killProcess(Process.myPid())
        System.exit(0)
    }



}