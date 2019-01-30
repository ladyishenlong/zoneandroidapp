package com.ladyishenlong.zone_android_app.center.Utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.ladyishenlong.zone_android_app.R
import jp.wasabeef.glide.transformations.BlurTransformation

object GlideUtils {


    fun setBaseBg(context: Context, imageView: ImageView) {

        Glide.with(context)
                .load(R.mipmap.bg_yuji)
//                .bitmapTransform(BlurTransformation(context, 24))
                .into(imageView)
    }

}