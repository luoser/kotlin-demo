package com.example.lisaluo.kotlinproject

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.view.View

object AnimationUtils {

    fun backgroundColorAnimation(view: View, startColor: Int, endColor: Int): ObjectAnimator {
        return ObjectAnimator.ofObject(view, "backgroundColor", ArgbEvaluator(), startColor, endColor)
    }
}