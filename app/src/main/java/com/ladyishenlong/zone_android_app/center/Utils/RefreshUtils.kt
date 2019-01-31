package com.ladyishenlong.zone_android_app.center.Utils

import android.content.Context
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.footer.ClassicsFooter
import com.scwang.smartrefresh.layout.header.ClassicsHeader

object RefreshUtils {


    /**
     * 前后留白的设置
     * 需要手动在布局中添加空白布局
     */
    fun setLeaveBlank(context:Context,smartRefreshLayout: SmartRefreshLayout){
        smartRefreshLayout.setRefreshHeader(ClassicsHeader(context))
        smartRefreshLayout.setRefreshFooter(ClassicsFooter(context))
        smartRefreshLayout.setHeaderInsetStart(50f)
        smartRefreshLayout.setFooterInsetStart(50f)
    }








}